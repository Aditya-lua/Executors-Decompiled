package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class fe implements ee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p9 f6506a;

    static {
        j9 j9VarB = new j9(e9.a("com.google.android.gms.measurement")).a().b();
        f6506a = j9VarB.d("measurement.service.ad_impression.convert_value_to_double", true);
        j9VarB.d("measurement.service.separate_public_internal_event_blacklisting", true);
        j9VarB.d("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.ee
    public final boolean zza() {
        return ((Boolean) f6506a.d()).booleanValue();
    }
}
