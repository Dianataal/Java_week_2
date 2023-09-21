module com.example.java_week2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_week2 to javafx.fxml;
    exports com.example.java_week2;
}