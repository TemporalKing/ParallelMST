public class MainKruskal {

    public static void main(String[] args) {
        String file = null;

        // File path and name
        if (args.length > 0) {
            file = args[0];

            if (file == "nofile") {
                file = null;
            }
        }

        // List or matrix
        if (args.length > 1) {
            MyGlobal.Config.op = Integer.parseInt(args[1]);
        }

        // Number of threads
        if (args.length > 2) {
            MyGlobal.Config.p = Integer.parseInt(args[2]);
        }

        // Nb
        if (args.length > 3) {
            MyGlobal.Config.nb = Integer.parseInt(args[3]);
        }

        // Verbose
        if (args.length > 4) {
            MyGlobal.Config.verbose = Integer.parseInt(args[4]);
        }

        // Debug
        if (args.length > 5) {
            MyGlobal.Config.debug = Integer.parseInt(args[5]);
        }

        System.out.println(Main.class.getProtectionDomain().getCodeSource().getLocation().getFile());

        IGraph g = null;

        if (file == null) {
            g = GraphGenerator.simple(10, 10);
        } else {
            g = MyGlobal.createGraph(file);
        }

        Kruskal.kruskal(g);

        if (MyGlobal.Config.verbose == 1) {
            System.out.println("END");
        }
    }
}