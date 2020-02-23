package net.itsky.jackson;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestObject {
    private Long l;
    private String s;
    private Boolean b;
    private Set<?> set;
    private List<?> list;
    private Map<String, ?> map;

    public TestObject(Long l, String s, Boolean b, Set<?> set, List<?> list, Map<String, ?> map) {
        this.l = l;
        this.s = s;
        this.b = b;
        this.set = set;
        this.list = list;
        this.map = map;
    }

    public TestObject() {
        // only for framework purposes
    }

    public Long getL() {
        return l;
    }

    public String getS() {
        return s;
    }

    public Boolean getB() {
        return b;
    }

    public Set<?> getSet() {
        return set;
    }

    public List<?> getList() {
        return list;
    }

    public Map<String, ?> getMap() {
        return map;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "("
+                "l=" + l + " (" + l.getClass() + ") "
                + " s=\"" + s + "\" (" + s.getClass() + ") "
                + " b=" + b + " (" + b.getClass() + ") "
                + " set=" + set  + " (" + set.getClass() + ") "
                + " list=" + list + " (" + list.getClass() + ") "
                + " map=" + map + " (" + map.getClass() + "))";
    }
}

