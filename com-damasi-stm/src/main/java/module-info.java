module com.example.comdamasistm {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.comdamasistm to javafx.fxml;
    exports com.example.comdamasistm;
}