package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class xe implements we {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l9 f6941a;
    public static final l9 b;

    static {
        f9 f9VarB = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f9VarB.d("measurement.collection.event_safelist", true);
        f6941a = f9VarB.d("measurement.service.store_null_safelist", true);
        b = f9VarB.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.we
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.we
    public final boolean zzb() {
        return ((Boolean) f6941a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.we
    public final boolean zzc() {
        return ((Boolean) b.d()).booleanValue();
    }
}
