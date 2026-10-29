package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class ag implements zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l9 f6380a;

    static {
        f9 f9VarB = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f6380a = f9VarB.d("measurement.add_first_launch_logging_timestamp.service", false);
        f9VarB.c("measurement.id.add_first_launch_logging_timestamp.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zf
    public final boolean zza() {
        return ((Boolean) f6380a.d()).booleanValue();
    }
}
