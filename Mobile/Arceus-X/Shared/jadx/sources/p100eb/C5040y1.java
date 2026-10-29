package p100eb;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: eb.y1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5040y1 {
    /* JADX INFO: renamed from: a */
    public static int m23725a(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
