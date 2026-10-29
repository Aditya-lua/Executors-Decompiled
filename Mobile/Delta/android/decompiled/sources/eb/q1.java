package eb;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends s1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q1 f15359a = new q1();

    @Override // eb.s1
    public final s1 a() {
        return w1.f15420a;
    }

    @Override // eb.s1, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
