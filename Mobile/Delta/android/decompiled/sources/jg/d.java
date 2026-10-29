package jg;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface d {
    default List<String> a(Field field) {
        return Collections.EMPTY_LIST;
    }

    String b(Field field);
}
