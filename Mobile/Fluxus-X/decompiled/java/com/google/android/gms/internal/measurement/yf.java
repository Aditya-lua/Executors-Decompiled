package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class yf implements xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p9 f6953a;
    public static final p9 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p9 f6954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p9 f6955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p9 f6956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p9 f6957f;

    static {
        j9 j9VarB = new j9(e9.a("com.google.android.gms.measurement")).a().b();
        f6953a = j9VarB.d("measurement.test.boolean_flag", false);
        b = j9VarB.c("measurement.test.cached_long_flag", -1L);
        f6954c = j9VarB.e("measurement.test.double_flag", -3.0d);
        f6955d = j9VarB.c("measurement.test.int_flag", -2L);
        f6956e = j9VarB.c("measurement.test.long_flag", -1L);
        f6957f = j9VarB.f("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.xf
    public final boolean zza() {
        return ((Boolean) f6953a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.xf
    public final long zzb() {
        return ((Long) b.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.xf
    public final double zzc() {
        return ((Double) f6954c.d()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.xf
    public final long zzd() {
        return ((Long) f6955d.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.xf
    public final long zze() {
        return ((Long) f6956e.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.xf
    public final String zzf() {
        return (String) f6957f.d();
    }
}
