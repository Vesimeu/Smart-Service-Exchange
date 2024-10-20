module com.workit.artifact {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.workit.artifact to javafx.fxml;
    exports com.workit.artifact;
}