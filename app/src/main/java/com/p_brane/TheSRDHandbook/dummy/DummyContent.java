package com.p_brane.TheSRDHandbook.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        // Add 3 sample items.
        addItem(new DummyItem("1", "Physical Constants SRD 121 List","http://p-brane.com/srdhbk/srd121_03.html"));
        addItem(new DummyItem("2", "Ionization Energies SRD 111 List","http://p-brane.com/srdhbk/srd111.html"));
        addItem(new DummyItem("3", "Atomic Weights SRD 144 List","http://p-brane.com/srdhbk/srd144.html"));
        addItem(new DummyItem("4", "SRD at NIST Websites","http://p-brane.com/srdhbk/nistwebsites.html"));
        addItem(new DummyItem("5", "About The SRD Handbook","http://p-brane.com/srdhbk/about.html"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String item_name;
        public String url;

        public DummyItem(String id, String item_name, String url) {
            this.id = id;
            this.item_name = item_name;
            this.url = url;
        }

        @Override
        public String toString() {
            return item_name;
        }
    }
}
