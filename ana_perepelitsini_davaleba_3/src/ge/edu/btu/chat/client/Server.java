package ge.edu.btu.chat.client;

public class Server {

    public Server( )
    {
    }

    public void respond( String statement )
    {
        if( statement.length() == 0 )
        {
            System.out.println( "დასვით კითხვა:)" );
        }

        else if( findKeyword( statement, "გამარჯობა" ) > 0 ||
                findKeyword( statement, "მოგესალმებით" ) > 0 ||
                findKeyword( statement, "გამარჯობათ" ) > 0 )
        {
            System.out.println( "მოგესალმებით, რით შემიძლია დაგეხმაროთ?" );
        }

        else if( findKeyword( statement, "მაჩვენე ფილიალები" ) > 0 ||
                findKeyword( statement, "ფილიალები" ) > 0 ||
                findKeyword( statement, "სად გაქვთ ფილიალები?" ) > 0 ||
                findKeyword( statement, "ფილიალების მისამართები" ) > 0 ||
                findKeyword( statement, "მისამართი" ) > 0 ||
                findKeyword( statement, "მისამართები" ) > 0 )
        {
            System.out.println( "ჩვენი ფილიალები: ბარათაშვილის ქ. # 2, წერეთლის გამზ. #99, ვაჟა-ფშაველას გამზ. #71, " +
                    "თემქა, მე-10 კვ.. კ. - 25, მელიქიშვილის ქუჩა 10" );
        }
        else if( findKeyword( statement, "ვალუტის კურსი" ) > 0 ||
                findKeyword( statement, "მაჩვენე ვალუტის კურსი" ) > 0 ||
                findKeyword( statement, "კურსი" ) > 0 )
        {
            System.out.println( "ვალუტის კურსი: აშშ დოლარი - 3,3021; ევრო - 3,9209; ინგლისური ფუნტი - 4,3740" );
        }
    }



    public int findKeyword( String statement, String keyword )
    {

        if( !statement.contains( keyword ) )
        {
            return 0;
        }


        int position = statement.toLowerCase().indexOf( keyword.toLowerCase() );
        statement = " " + statement.toLowerCase().replaceAll( "\'\",.?", "") + " ";

        String sub = statement.substring( position, position + keyword.length() + 2 );

        String charBeforeKeyword = sub.substring( 0, 1 );
        String charAfterKeyword = sub.substring( sub.length() - 1, sub.length());



        if( (charBeforeKeyword.compareTo( "a" ) < 0 || charBeforeKeyword.compareTo( "z" ) > 0 )
                && (charAfterKeyword.compareTo( "a" ) < 0 || charAfterKeyword.compareTo( "z" ) > 0 ))
        {
            return 1;
        }

        return 0;

    }



}
