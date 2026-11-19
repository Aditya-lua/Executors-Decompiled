package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class y7 implements w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w4 f7349a = new y7();

    @Override // com.google.android.gms.internal.play_billing.w4
    public final boolean a(int i10) {
        z7 z7Var;
        if (i10 == 0) {
            z7Var = z7.BROADCAST_ACTION_UNSPECIFIED;
        } else if (i10 == 1) {
            z7Var = z7.PURCHASES_UPDATED_ACTION;
        } else if (i10 == 2) {
            z7Var = z7.LOCAL_PURCHASES_UPDATED_ACTION;
        } else if (i10 == 3) {
            z7Var = z7.ALTERNATIVE_BILLING_ACTION;
        } else if (i10 != 4) {
            z7Var = i10 != 5 ? null : z7.PLAY_BILLING_ACTIVITY_CREATED_ACTION;
        } else {
            z7Var = z7.IN_APP_BILLING_RESULT_UPDATE_ACTION;
        }
        return z7Var != null;
    }
}
