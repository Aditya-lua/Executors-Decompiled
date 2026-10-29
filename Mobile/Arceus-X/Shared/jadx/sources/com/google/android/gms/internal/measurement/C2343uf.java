package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.uf */
/* JADX INFO: loaded from: classes.dex */
public final class C2343uf implements InterfaceC2325tf {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2175l9 f8692a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC2175l9 f8693b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC2175l9 f8694c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC2175l9 f8695d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC2175l9 f8696e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC2175l9 f8697f;

    static {
        C2065f9 c2065f9M10009b = new C2065f9(C1970a9.m9762a("com.google.android.gms.measurement")).m10008a().m10009b();
        f8692a = c2065f9M10009b.m10011d("measurement.test.boolean_flag", false);
        f8693b = c2065f9M10009b.m10010c("measurement.test.cached_long_flag", -1L);
        f8694c = c2065f9M10009b.m10012e("measurement.test.double_flag", -3.0d);
        f8695d = c2065f9M10009b.m10010c("measurement.test.int_flag", -2L);
        f8696e = c2065f9M10009b.m10010c("measurement.test.long_flag", -1L);
        f8697f = c2065f9M10009b.m10013f("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2325tf
    public final boolean zza() {
        return ((Boolean) f8692a.m10363d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2325tf
    public final long zzb() {
        return ((Long) f8693b.m10363d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2325tf
    public final double zzc() {
        return ((Double) f8694c.m10363d()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2325tf
    public final long zzd() {
        return ((Long) f8695d.m10363d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2325tf
    public final long zze() {
        return ((Long) f8696e.m10363d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2325tf
    public final String zzf() {
        return (String) f8697f.m10363d();
    }
}
