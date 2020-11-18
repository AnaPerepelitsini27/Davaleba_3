package ge.edu.btu.chat.client;
import java.util.Scanner;

public class Client
{
    public static void main( String [] args )
    {
        Server bot = new Server();
        Scanner input = new Scanner( System.in );
        String statement = "";

        System.out.println( "დასვით კითხვა:" );
        statement = input.nextLine();

        while( bot.findKeyword( statement, "ნახვამდის" ) != 1 &&
                bot.findKeyword( statement, "ნახვამდის, მადლობა" ) != 1 &&
                bot.findKeyword( statement, "მადლობა" ) != 1 &&
                bot.findKeyword( statement, "მადლობა, ნახვამდის" ) != 1 )
        {
            bot.respond( statement );
            statement = input.nextLine();
        }
        input.close();
        System.out.println( "მადლობა, რომ დაგვიკავშირდით. ნახვამდის!" );
    }
}