package p115f1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p140g0.C5948v2;
import p296n0.C8805p1;
import p296n0.InterfaceC8722a3;

/* JADX INFO: renamed from: f1.g1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5257g1 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC5257g1 f20363a = m24313d(0, a.INACTIVE);

    /* JADX INFO: renamed from: b */
    public static final Set<Integer> f20364b = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));

    /* JADX INFO: renamed from: c */
    public static final InterfaceC8722a3<AbstractC5257g1> f20365c = C8805p1.m35371f(m24313d(0, a.ACTIVE));

    /* JADX INFO: renamed from: f1.g1$a */
    public enum a {
        ACTIVE,
        INACTIVE
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC5257g1 m24313d(int i10, a aVar) {
        return new C5273m(i10, aVar, null);
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC5257g1 m24314e(int i10, a aVar, C5948v2.h hVar) {
        return new C5273m(i10, aVar, hVar);
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo24315a();

    /* JADX INFO: renamed from: b */
    public abstract C5948v2.h mo24316b();

    /* JADX INFO: renamed from: c */
    public abstract a mo24317c();
}
