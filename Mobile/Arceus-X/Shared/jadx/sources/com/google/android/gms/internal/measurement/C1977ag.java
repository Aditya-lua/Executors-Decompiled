package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ag */
/* JADX INFO: loaded from: classes.dex */
public final class C1977ag implements InterfaceC2433zf {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2175l9 f8102a;

    static {
        C2065f9 c2065f9M10009b = new C2065f9(C1970a9.m9762a("com.google.android.gms.measurement")).m10008a().m10009b();
        f8102a = c2065f9M10009b.m10011d("measurement.add_first_launch_logging_timestamp.service", false);
        c2065f9M10009b.m10010c("measurement.id.add_first_launch_logging_timestamp.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2433zf
    public final boolean zza() {
        return ((Boolean) f8102a.m10363d()).booleanValue();
    }
}
