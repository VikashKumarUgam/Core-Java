import java.sql.*;

public class DBSample {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\vikash.k2\\IdeaProjects\\DataBase\\"+DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";
    public static void main(String[] args) {
        try{
//            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\vikash.k2\\IdeaProjects\\DataBase\\testjava.db");
            Connection connection = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = connection.createStatement();
            statement.execute("DROP TABLE IF EXISTS "+TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS " +TABLE_CONTACTS+
                    "("+COLUMN_NAME+" TEXT, "+COLUMN_PHONE+" INTEGER, "+COLUMN_EMAIL+" TEXT)");
//            statement.execute("INSERT INTO "+TABLE_CONTACTS+" ("+COLUMN_NAME+", "+COLUMN_PHONE+", "+COLUMN_EMAIL+")" +
//                    " VALUES ('Jane', 123456, 'jane@gmail.com')");
//            statement.execute("INSERT INTO "+TABLE_CONTACTS+" ("+COLUMN_NAME+", "+COLUMN_PHONE+", "+COLUMN_EMAIL+")" +
//                    " VALUES ('Joe', 456321, 'joe@anywhere.com')");
//            statement.execute("INSERT INTO "+TABLE_CONTACTS+" ("+COLUMN_NAME+", "+COLUMN_PHONE+", "+COLUMN_EMAIL+")" +
//                    " VALUES ('Tim', 775463, 'tim@outlook.com')");
            statement.execute("UPDATE "+TABLE_CONTACTS+" SET "+COLUMN_PHONE+"=448899"+
                    " WHERE "+COLUMN_NAME+"='Joe'");
            statement.execute("DELETE FROM "+TABLE_CONTACTS+" WHERE "+COLUMN_NAME+"='Jane'");
            insertContact(statement,"Helio",334579, "helio@myemail.com");
            insertContact(statement,"Jane",236547, "jane@gmail.com");
            insertContact(statement,"Tom",398756, "tom@outlook.com");
            ResultSet results = statement.executeQuery("SELECT * FROM "+TABLE_CONTACTS);
            while(results.next()){
                System.out.println(results.getString(COLUMN_NAME)+" "+
                        results.getInt(COLUMN_PHONE)+" "+
                        results.getString(COLUMN_EMAIL));
            }
//            statement.execute("CREATE TABLE IF NOT EXISTS " +
//                                  "contacts (name TEXT, phone INTEGER, email TEXT)");
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    " VALUES ('Jane', 123456, 'jane@gmail.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    " VALUES ('Joe', 435678, 'joe@anywhere.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    " VALUES ('Tom', 239875, 'tom@outlook.com')");
//            statement.execute("UPDATE contacts SET phone = 233776" +
//                                  " WHERE name = 'Jane'");
//            statement.execute("DELETE FROM contacts where name= 'Jane'");
//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();
//            ResultSet results = statement.executeQuery("SELECT * FROM contacts");
//            while (results.next()){
//                System.out.println(results.getString("name")+
//                                   " "+ results.getInt("phone")+
//                                   " "+results.getString("email"));
//            }
            results.close();
            statement.close();
            connection.close();
        }catch (SQLException e){
            System.out.println("Something went wrong :"+ e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException{
        statement.execute("INSERT INTO "+TABLE_CONTACTS+" ("+COLUMN_NAME+", "+COLUMN_PHONE+", "+COLUMN_EMAIL+")" +
                " VALUES ('"+name+"', "+phone+", '"+email+"')");
    }
}
