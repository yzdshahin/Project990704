

package Model.DAO;

import Model.Util.ConnectionProvider;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.security.NoSuchAlgorithmException;
import Model.Entity.Person;

public class PersonDAO {
    
    public static boolean validateUser(String nameUser) throws SQLException {
        boolean validate= false;
           try{ ConnectionProvider connectioner2 =new ConnectionProvider();
            PreparedStatement   preparedStatement = connectioner2.getConnection().prepareStatement("SELECT * from Employee where user=?");
            preparedStatement.setString(1, "name");
            ResultSet resultSet2= preparedStatement.executeQuery();
            validate=resultSet2.next();
           }catch(SQLException e){
               System.out.println("the user you entered is not registered");}
           
        return validate;
    }
    
        public static boolean validatePass(String PassUser) throws SQLException {
        boolean validation= false;
           try{ ConnectionProvider connectioner2 =new ConnectionProvider();
            PreparedStatement   preparedStatement = connectioner2.getConnection().prepareStatement("SELECT * from Employee where pass=?");
            preparedStatement.setString(1, "password");
            ResultSet resultSet3= preparedStatement.executeQuery();
            validation=resultSet3.next();
           }catch(SQLException e){
               System.out.println("the user's password you entered is not correct");} 
           
        return validation;
    }
        
           public static boolean LoginUser(String NameUser,String PassUser) throws SQLException {
            boolean validation= false;
            try{ ConnectionProvider connectioner2 =new ConnectionProvider();
            PreparedStatement   preparedStatement = connectioner2.getConnection().prepareStatement("SELECT * from Employee where name=? and pass=?");
            preparedStatement.setString(1, "name");
            preparedStatement.setString(2, "password");
            ResultSet resultSet3= preparedStatement.executeQuery();
            validation=resultSet3.next();
           }catch(SQLException e){
               System.out.println("the user you entered is not registered");} 
           
        return validation;
    }
           
                  public String RegistoreNow(String name,String password, String father,String birth,String gender) throws SQLException {
               boolean validation= false;
            try{ ConnectionProvider connectioner2 =new ConnectionProvider();
            PreparedStatement   preparedStatement = connectioner2.getConnection().prepareStatement("insert into Employee where name=? and pass=? and father=? and birth=? and gender=?");
            preparedStatement.setString(1, "name");
            preparedStatement.setString(2, "password");
            preparedStatement.setString(3, "father");
            preparedStatement.setString(4, "birth");
            preparedStatement.setString(5, "gender");

            int resultSet3= preparedStatement.executeUpdate();
              if (resultSet3 !=0) return "SUCCESS";
           }catch(SQLException e){
               e.printStackTrace();} 
        return "Oops.. Something went wrong there..!";
    }

    private static boolean SQLException(SQLException e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    
    }
    

