package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class oe implements ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l9 f6715a;
    public static final l9 b;

    static {
        f9 f9VarB = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f9VarB.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        f9VarB.d("measurement.set_default_event_parameters_with_backfill.service", true);
        f9VarB.c("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        f6715a = f9VarB.d("measurement.set_default_event_parameters.fix_app_update_logging", true);
        b = f9VarB.d("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        f9VarB.d("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.ne
    public final boolean zza() {
        return ((Boolean) f6715a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ne
    public final boolean zzb() {
        return ((Boolean) b.d()).booleanValue();
    }
}
