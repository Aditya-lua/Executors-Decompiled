package p115f1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: f1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5238b {

    /* JADX INFO: renamed from: a */
    public static final Set<Integer> f20296a = Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));

    /* JADX INFO: renamed from: e */
    public static AbstractC5238b m24245e(int i10, Throwable th2, double d10, long j10) {
        return new C5246d(i10, d10, j10, th2);
    }

    /* JADX INFO: renamed from: a */
    public abstract double mo24246a();

    /* JADX INFO: renamed from: b */
    public abstract long mo24247b();

    /* JADX INFO: renamed from: c */
    public abstract int mo24248c();

    /* JADX INFO: renamed from: d */
    public abstract Throwable mo24249d();
}
