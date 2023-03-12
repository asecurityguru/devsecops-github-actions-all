import org.apache.commons.collections.ListUtils;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Butler {

    public void welcome() {

        // https://app.snyk.io/vuln/SNYK-JAVA-COMMONSCOLLECTIONS-472711
        // Should appear as Potentially Reachable
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Hello");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("World");

        Logger.tprintln(ListUtils.union(list1, list2));
    }
}
