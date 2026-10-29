package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.xe */
/* JADX INFO: loaded from: classes.dex */
public final class C2396xe implements InterfaceC2378we {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2175l9 f8846a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC2175l9 f8847b;

    static {
        C2065f9 c2065f9M10009b = new C2065f9(C1970a9.m9762a("com.google.android.gms.measurement")).m10008a().m10009b();
        c2065f9M10009b.m10011d("measurement.collection.event_safelist", true);
        f8846a = c2065f9M10009b.m10011d("measurement.service.store_null_safelist", true);
        f8847b = c2065f9M10009b.m10011d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2378we
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2378we
    public final boolean zzb() {
        return ((Boolean) f8846a.m10363d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2378we
    public final boolean zzc() {
        return ((Boolean) f8847b.m10363d()).booleanValue();
    }
}
