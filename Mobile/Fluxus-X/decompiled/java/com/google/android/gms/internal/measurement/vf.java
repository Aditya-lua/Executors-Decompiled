package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class vf implements uf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p9 f6895a;

    static {
        j9 j9VarB = new j9(e9.a("com.google.android.gms.measurement")).a().b();
        j9VarB.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f6895a = j9VarB.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        j9VarB.c("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.uf
    public final boolean zza() {
        return ((Boolean) f6895a.d()).booleanValue();
    }
}
