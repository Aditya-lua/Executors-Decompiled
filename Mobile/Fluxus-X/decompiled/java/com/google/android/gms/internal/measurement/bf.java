package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class bf implements af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p9 f6448a;
    public static final p9 b;

    static {
        j9 j9VarB = new j9(e9.a("com.google.android.gms.measurement")).a().b();
        j9VarB.d("measurement.collection.event_safelist", true);
        f6448a = j9VarB.d("measurement.service.store_null_safelist", true);
        b = j9VarB.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.af
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.af
    public final boolean zzb() {
        return ((Boolean) f6448a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.af
    public final boolean zzc() {
        return ((Boolean) b.d()).booleanValue();
    }
}
