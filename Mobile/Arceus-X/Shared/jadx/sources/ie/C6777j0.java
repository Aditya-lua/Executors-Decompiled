package ie;

import java.io.Serializable;
import p169he.C6384n;

/* JADX INFO: renamed from: ie.j0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6777j0 extends AbstractC6783m0<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final C6777j0 f26670a = new C6777j0();

    /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
    @Override // ie.AbstractC6783m0, java.util.Comparator
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        C6384n.m27928l(comparable);
        C6384n.m27928l(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
