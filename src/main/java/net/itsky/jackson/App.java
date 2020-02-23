package net.itsky.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import java.io.StringReader;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        try {
            Set<Integer> s1 = ImmutableSet.of(1, 2, 3);
            Set<Integer> s2 = ImmutableSet.of(1, 2, 3);
            Map<String, ?> m1 = ImmutableMap.of("A", "abc", "B", 3L, "C", s1);
            List<?> l1 = ImmutableList.of("i", "e", "a", "o", "u");
            TestObject t1 = new TestObject(30303L, "uv", true, s2, l1, m1);
            Map<String, ?> m2 = ImmutableMap.of("r", "r101", "s", 202, "t", t1);
            List<?> l2 = ImmutableList.of("ä", "ö", "ü", "å", "ø");
            Set<?> s3 = ImmutableSet.of("x", "y", "z");
            TestObject t2 = new TestObject(40404L, "ijk", false, s3, l2, m2);
            ObjectMapper mapper = new ObjectMapper();
            ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
            System.out.println("t2=" + t2);
            String json = writer.writeValueAsString(t2);
            System.out.println("json=" + json);
            StringReader stringReader = new StringReader(json);
            TestObject t3 = mapper.readValue(stringReader, TestObject.class);
            System.out.println("t3=" + t3);
        } catch (Exception ex) {
            RuntimeException rex;
            if (ex instanceof RuntimeException) {
                rex = (RuntimeException) ex;
            } else {
                rex = new RuntimeException(ex);
            }
            throw rex;
        }
    }

}
