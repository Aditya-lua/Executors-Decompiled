package p100eb;

import java.io.Serializable;

/* JADX INFO: renamed from: eb.w1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5028w1 extends AbstractC5004s1 implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final C5028w1 f19835a = new C5028w1();

    @Override // p100eb.AbstractC5004s1
    /* JADX INFO: renamed from: a */
    public final AbstractC5004s1 mo23692a() {
        return C4992q1.f19767a;
    }

    @Override // p100eb.AbstractC5004s1, java.util.Comparator
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
