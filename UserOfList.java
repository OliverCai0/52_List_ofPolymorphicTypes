/**
 Test list features.
 Taken from Homework 52 Solution repo
 */
public class UserOfList {
    private static List_inArraySlots list;

    public static void main( String[] args ) {
        list = new List_inArraySlots();

        // Populate the list with diverse elements.
        System.out.println(
          "Populate the list with diverse elements.");
        list.add( Integer.valueOf( 17));
        list.add( Double.valueOf( 1.618));
        list.add( new String( "hello"));
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "resulting list : " + list);
        System.out.println();

        // test get() from middle of the list
        System.out.println( "test get() from middle");
        System.out.println( list.get( list.size() / 2));
        System.out.println();

        // test expansion
        System.out.println( "test expansion");
        for( int elemIndex = list.size()
           ; elemIndex < 12
           ; elemIndex++
           )
            list.add( -elemIndex);
        System.out.println("result of expanded list: "
             + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());

        // add Booleans, to observe that no changes are needed!
        System.out.println(
          "add Booleans, to observe that no changes are needed!");
        list = new List_inArraySlots();  // less is more
        list.add( Boolean.valueOf( false));
        list.add( Boolean.valueOf( true));
        System.out.println( list + System.lineSeparator());

        // add a nested list as an element
        // since adding a Boolean was too easy
        System.out.println( "add a nested list as an element");
        list.add( new List_inArraySlots());
        System.out.println( list + System.lineSeparator());

        // test autoboxing an int literal --> Integer
        System.out.println(
          "test autoboxing an int literal --> Integer");
        list.add( 28);
        System.out.println( list + System.lineSeparator());

        // // test ?? template
        // System.out.println( "test ??");
        // System.out.println( list + System.lineSeparator());
    }
}