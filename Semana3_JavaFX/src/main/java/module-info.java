module com.mycompany.semana3_javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;

    opens com.mycompany.semana3_javafx to javafx.fxml;
    exports com.mycompany.semana3_javafx;
}
