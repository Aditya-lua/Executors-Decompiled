package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class uf implements tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l9 f6831a;
    public static final l9 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l9 f6832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l9 f6833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l9 f6834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l9 f6835f;

    static {
        f9 f9VarB = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f6831a = f9VarB.d("measurement.test.boolean_flag", false);
        b = f9VarB.c("measurement.test.cached_long_flag", -1L);
        f6832c = f9VarB.e("measurement.test.double_flag", -3.0d);
        f6833d = f9VarB.c("measurement.test.int_flag", -2L);
        f6834e = f9VarB.c("measurement.test.long_flag", -1L);
        f6835f = f9VarB.f("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.tf
    public final boolean zza() {
        return ((Boolean) f6831a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.tf
    public final long zzb() {
        return ((Long) b.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.tf
    public final double zzc() {
        return ((Double) f6832c.d()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.tf
    public final long zzd() {
        return ((Long) f6833d.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.tf
    public final long zze() {
        return ((Long) f6834e.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.tf
    public final String zzf() {
        return (String) f6835f.d();
    }
}
