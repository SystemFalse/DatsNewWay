module dats_new_way {
    requires javafx.base;
    requires javafx.fxml;
    requires javafx.controls;

    exports org.system_false.dats_new_way;

    opens org.system_false.dats_new_way to javafx.fxml;
}