package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.hc */
/* JADX INFO: loaded from: classes.dex */
public final class C2106hc {

    /* JADX INFO: renamed from: a */
    public final C2087gc f8224a;

    public C2106hc(EnumC2377wd enumC2377wd, Object obj, EnumC2377wd enumC2377wd2, Object obj2) {
        this.f8224a = new C2087gc(enumC2377wd, "", enumC2377wd2, "");
    }

    /* JADX INFO: renamed from: a */
    public static C2106hc m10196a(EnumC2377wd enumC2377wd, Object obj, EnumC2377wd enumC2377wd2, Object obj2) {
        return new C2106hc(enumC2377wd, "", enumC2377wd2, "");
    }

    /* JADX INFO: renamed from: b */
    public static void m10197b(AbstractC2194ma abstractC2194ma, C2087gc c2087gc, Object obj, Object obj2) {
        C2374wa.m10938f(abstractC2194ma, c2087gc.f8203a, 1, obj);
        C2374wa.m10938f(abstractC2194ma, c2087gc.f8205c, 2, obj2);
    }

    /* JADX INFO: renamed from: c */
    public static int m10198c(C2087gc c2087gc, Object obj, Object obj2) {
        return C2374wa.m10939h(c2087gc.f8203a, 1, obj) + C2374wa.m10939h(c2087gc.f8205c, 2, obj2);
    }

    /* JADX INFO: renamed from: d */
    public final int m10199d(int i10, Object obj, Object obj2) {
        C2087gc c2087gc = this.f8224a;
        int iM10380G = AbstractC2194ma.m10380G(i10 << 3);
        int iM10198c = m10198c(c2087gc, obj, obj2);
        return iM10380G + AbstractC2194ma.m10380G(iM10198c) + iM10198c;
    }

    /* JADX INFO: renamed from: e */
    public final C2087gc m10200e() {
        return this.f8224a;
    }
}
