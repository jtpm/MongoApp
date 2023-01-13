module com.mongoapp.mongoapptest01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mongoapp.mongoapptest01 to javafx.fxml;
    exports com.mongoapp.mongoapptest01;
}