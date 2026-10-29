package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class be implements ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l9 f6391a;

    static {
        f9 f9VarB = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f6391a = f9VarB.d("measurement.service.ad_impression.convert_value_to_double", true);
        f9VarB.d("measurement.service.separate_public_internal_event_blacklisting", true);
        f9VarB.d("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.ae
    public final boolean zza() {
        return ((Boolean) f6391a.d()).booleanValue();
    }
}
