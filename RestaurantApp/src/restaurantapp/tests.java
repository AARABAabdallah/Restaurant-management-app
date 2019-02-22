package restaurantapp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class tests {
        
	public static void main(String[] argv) throws SQLException {
        Connection conn = db.java_db();
        String sql = "INSERT INTO repas ( date_repas , id_menu ) values( ? , 1 )";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, "20/09/97");
        pst.executeQuery();
        
    }

}