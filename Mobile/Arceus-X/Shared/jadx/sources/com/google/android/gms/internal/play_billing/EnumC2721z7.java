package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z7 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2721z7 implements InterfaceC2674v4 {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3),
    IN_APP_BILLING_RESULT_UPDATE_ACTION(4),
    PLAY_BILLING_ACTIVITY_CREATED_ACTION(5);


    /* JADX INFO: renamed from: a */
    public final int f9442a;

    EnumC2721z7(int i10) {
        this.f9442a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f9442a);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2674v4
    public final int zza() {
        return this.f9442a;
    }
}
