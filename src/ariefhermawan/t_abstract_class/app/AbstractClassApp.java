package ariefhermawan.t_abstract_class.app;

import ariefhermawan.t_abstract_class.data.City;
import ariefhermawan.t_abstract_class.data.Location;

public class AbstractClassApp {
    public static void main(String[] args) {
        /// <pre>
        /// <blockquote>
        /// Location location = new Location();
        /// </blockquote>
        /// </pre>
        ///
        /// Error gegara class Location adalah abstract class.
        /// Tidak bisa di instansiasi.
        City city = new City("Bogor");
        city.toConsoleView();
    }
}
