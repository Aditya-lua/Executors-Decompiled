package ie;

import java.util.Comparator;
import p169he.C6384n;

/* JADX INFO: renamed from: ie.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C6782m {
    /* JADX INFO: renamed from: a */
    public static <T, S extends T> Comparator<Iterable<S>> m29014a(Comparator<T> comparator) {
        return new C6763c0((Comparator) C6384n.m27928l(comparator));
    }

    /* JADX INFO: renamed from: b */
    public static <T extends Comparable<? super T>> T m29015b(T t8, T t10) {
        return t8.compareTo(t10) >= 0 ? t8 : t10;
    }
}
