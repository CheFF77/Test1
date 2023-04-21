public class Svetofor {
    public static void main(String[] args) {


        char green = 'g';
        char red = 'r';
        char yellow = 'y';
        signal('r');
        signal('g');
        signal('y');
    }


    public static void signal(char sig) {


        switch (sig) {
            case 'g':
                System.out.println("Go!");
                break;
            case 'r':
                System.out.println("Stop");
                break;
            case 'y':
                System.out.println("Wait");
                break;
            default:
                System.out.println("Nothing to do");
        }
    }
}

