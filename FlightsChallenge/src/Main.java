import Model.Flight;
import Model.Route;
import Service.*;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        DataService dataService = new DataImpl();
        List<Route> routeList = dataService.readRouteFile("data/routes.csv");

        RouteService routeService = new RouteImpl();
        List<Flight> flightList = routeService.createFlight(routeList);


        String validFlightPath = routeService.findPath(flightList,"ACC","LHR");
        System.out.println(validFlightPath);

    }
}
