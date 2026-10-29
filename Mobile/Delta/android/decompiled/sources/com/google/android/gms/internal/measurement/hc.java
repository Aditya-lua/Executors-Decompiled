package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gc f6474a;

    public hc(wd wdVar, Object obj, wd wdVar2, Object obj2) {
        this.f6474a = new gc(wdVar, "", wdVar2, "");
    }

    public static hc a(wd wdVar, Object obj, wd wdVar2, Object obj2) {
        return new hc(wdVar, "", wdVar2, "");
    }

    public static void b(ma maVar, gc gcVar, Object obj, Object obj2) {
        wa.f(maVar, gcVar.f6459a, 1, obj);
        wa.f(maVar, gcVar.f6460c, 2, obj2);
    }

    public static int c(gc gcVar, Object obj, Object obj2) {
        return wa.h(gcVar.f6459a, 1, obj) + wa.h(gcVar.f6460c, 2, obj2);
    }

    public final int d(int i10, Object obj, Object obj2) {
        gc gcVar = this.f6474a;
        int iG = ma.G(i10 << 3);
        int iC = c(gcVar, obj, obj2);
        return iG + ma.G(iC) + iC;
    }

    public final gc e() {
        return this.f6474a;
    }
}
