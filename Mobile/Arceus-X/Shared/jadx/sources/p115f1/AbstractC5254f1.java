package p115f1;

import p533x2.C12637g;

/* JADX INFO: renamed from: f1.f1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5254f1 {
    /* JADX INFO: renamed from: d */
    public static AbstractC5254f1 m24300d(long j10, long j11, AbstractC5238b abstractC5238b) {
        C12637g.m47070b(j10 >= 0, "duration must be positive value.");
        C12637g.m47070b(j11 >= 0, "bytes must be positive value.");
        return new C5270l(j10, j11, abstractC5238b);
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC5238b mo24301a();

    /* JADX INFO: renamed from: b */
    public abstract long mo24302b();

    /* JADX INFO: renamed from: c */
    public abstract long mo24303c();
}
