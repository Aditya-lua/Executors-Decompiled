package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kc f6597a;

    public lc(ae aeVar, Object obj, ae aeVar2, Object obj2) {
        this.f6597a = new kc(aeVar, BuildConfig.FLAVOR, aeVar2, BuildConfig.FLAVOR);
    }

    public static lc a(ae aeVar, Object obj, ae aeVar2, Object obj2) {
        return new lc(aeVar, BuildConfig.FLAVOR, aeVar2, BuildConfig.FLAVOR);
    }

    public static void b(qa qaVar, kc kcVar, Object obj, Object obj2) {
        ab.f(qaVar, kcVar.f6576a, 1, obj);
        ab.f(qaVar, kcVar.f6577c, 2, obj2);
    }

    public static int c(kc kcVar, Object obj, Object obj2) {
        return ab.h(kcVar.f6576a, 1, obj) + ab.h(kcVar.f6577c, 2, obj2);
    }

    public final int d(int i10, Object obj, Object obj2) {
        kc kcVar = this.f6597a;
        int iG = qa.G(i10 << 3);
        int iC = c(kcVar, obj, obj2);
        return iG + qa.G(iC) + iC;
    }

    public final kc e() {
        return this.f6597a;
    }
}
