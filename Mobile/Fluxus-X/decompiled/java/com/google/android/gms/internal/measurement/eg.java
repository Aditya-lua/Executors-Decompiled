package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class eg implements dg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p9 f6496a;

    static {
        j9 j9VarB = new j9(e9.a("com.google.android.gms.measurement")).a().b();
        f6496a = j9VarB.d("measurement.add_first_launch_logging_timestamp.service", false);
        j9VarB.c("measurement.id.add_first_launch_logging_timestamp.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.dg
    public final boolean zza() {
        return ((Boolean) f6496a.d()).booleanValue();
    }
}
