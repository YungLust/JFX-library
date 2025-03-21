module library {
    requires javafx.graphics;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires jakarta.persistence;
    exports com.example.library.view;
}