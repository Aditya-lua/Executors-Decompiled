package he;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends m0<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f19240a = new j0();

    @Override // he.m0, java.util.Comparator
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        ge.n.l(comparable);
        ge.n.l(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
