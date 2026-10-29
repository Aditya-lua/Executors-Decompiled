package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2710y7 implements InterfaceC2685w4 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2685w4 f9424a = new C2710y7();

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2685w4
    /* JADX INFO: renamed from: a */
    public final boolean mo11321a(int i10) {
        EnumC2721z7 enumC2721z7;
        if (i10 == 0) {
            enumC2721z7 = EnumC2721z7.BROADCAST_ACTION_UNSPECIFIED;
        } else if (i10 == 1) {
            enumC2721z7 = EnumC2721z7.PURCHASES_UPDATED_ACTION;
        } else if (i10 == 2) {
            enumC2721z7 = EnumC2721z7.LOCAL_PURCHASES_UPDATED_ACTION;
        } else if (i10 == 3) {
            enumC2721z7 = EnumC2721z7.ALTERNATIVE_BILLING_ACTION;
        } else if (i10 != 4) {
            enumC2721z7 = i10 != 5 ? null : EnumC2721z7.PLAY_BILLING_ACTIVITY_CREATED_ACTION;
        } else {
            enumC2721z7 = EnumC2721z7.IN_APP_BILLING_RESULT_UPDATE_ACTION;
        }
        return enumC2721z7 != null;
    }
}
