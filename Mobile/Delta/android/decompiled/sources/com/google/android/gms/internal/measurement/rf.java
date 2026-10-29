package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class rf implements qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l9 f6778a;

    static {
        f9 f9VarB = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f9VarB.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f6778a = f9VarB.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f9VarB.c("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.qf
    public final boolean zza() {
        return ((Boolean) f6778a.d()).booleanValue();
    }
}
