package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class se implements re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p9 f6838a;
    public static final p9 b;

    static {
        j9 j9VarB = new j9(e9.a("com.google.android.gms.measurement")).a().b();
        j9VarB.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        j9VarB.d("measurement.set_default_event_parameters_with_backfill.service", true);
        j9VarB.c("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        f6838a = j9VarB.d("measurement.set_default_event_parameters.fix_app_update_logging", true);
        b = j9VarB.d("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        j9VarB.d("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.re
    public final boolean zza() {
        return ((Boolean) f6838a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.re
    public final boolean zzb() {
        return ((Boolean) b.d()).booleanValue();
    }
}
