package eb;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class w1 extends s1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w1 f15420a = new w1();

    @Override // eb.s1
    public final s1 a() {
        return q1.f15359a;
    }

    @Override // eb.s1, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
