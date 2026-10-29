package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public enum z7 implements v4 {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3),
    IN_APP_BILLING_RESULT_UPDATE_ACTION(4),
    PLAY_BILLING_ACTIVITY_CREATED_ACTION(5);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7365a;

    z7(int i10) {
        this.f7365a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f7365a);
    }

    @Override // com.google.android.gms.internal.play_billing.v4
    public final int zza() {
        return this.f7365a;
    }
}
