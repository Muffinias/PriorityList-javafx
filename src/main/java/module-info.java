module com.example.prioritylist {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.prioritylist to javafx.fxml;
    exports com.example.prioritylist;
}