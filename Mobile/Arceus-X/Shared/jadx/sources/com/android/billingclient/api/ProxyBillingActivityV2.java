package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.C2571m0;
import com.google.android.gms.internal.play_billing.EnumC2644s7;
import p088e.ActivityC4722p;
import p139g.AbstractC5854c;
import p139g.InterfaceC5852a;
import p154h.C6257j;
import p235k2.C7411c;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends ActivityC4722p {

    /* JADX INFO: renamed from: A */
    public AbstractC5854c f6589A;

    /* JADX INFO: renamed from: B */
    public AbstractC5854c f6590B;

    /* JADX INFO: renamed from: C */
    public AbstractC5854c f6591C;

    /* JADX INFO: renamed from: D */
    public ResultReceiver f6592D;

    /* JADX INFO: renamed from: E */
    public ResultReceiver f6593E;

    /* JADX INFO: renamed from: F */
    public ResultReceiver f6594F;

    /* JADX INFO: renamed from: G */
    public ResultReceiver f6595G;

    /* JADX INFO: renamed from: H */
    public ResultReceiver f6596H;

    /* JADX INFO: renamed from: I */
    public ResultReceiver f6597I;

    /* JADX INFO: renamed from: x */
    public AbstractC5854c f6598x;

    /* JADX INFO: renamed from: y */
    public AbstractC5854c f6599y;

    /* JADX INFO: renamed from: z */
    public AbstractC5854c f6600z;

    /* JADX INFO: renamed from: m1 */
    public static final C7411c m8453m1() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 36) {
            return C7411c.m30705a().mo30706b(3);
        }
        if (i10 >= 34) {
            return C7411c.m30705a().mo30706b(1);
        }
        return null;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m8454g1(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int iM8610c = C2571m0.m11560h(data, "ProxyBillingActivityV2").m8610c();
        ResultReceiver resultReceiver = this.f6592D;
        if (resultReceiver != null) {
            resultReceiver.send(iM8610c, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || iM8610c != 0) {
            C2571m0.m11565m("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + activityResult.getResultCode() + " and billing's responseCode: " + iM8610c);
        }
        finish();
    }

    /* JADX INFO: renamed from: h1 */
    public final void m8455h1(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int iM8610c = C2571m0.m11560h(data, "ProxyBillingActivityV2").m8610c();
        ResultReceiver resultReceiver = this.f6596H;
        if (resultReceiver != null) {
            resultReceiver.send(iM8610c, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || iM8610c != 0) {
            C2571m0.m11565m("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + activityResult.getResultCode() + " and billing's responseCode: " + iM8610c);
        }
        finish();
    }

    /* JADX INFO: renamed from: i1 */
    public final void m8456i1(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int iM8610c = C2571m0.m11560h(data, "ProxyBillingActivityV2").m8610c();
        ResultReceiver resultReceiver = this.f6593E;
        if (resultReceiver != null) {
            resultReceiver.send(iM8610c, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || iM8610c != 0) {
            C2571m0.m11565m("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(activityResult.getResultCode()), Integer.valueOf(iM8610c)));
        }
        finish();
    }

    /* JADX INFO: renamed from: j1 */
    public final void m8457j1(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        Bundle extras = data == null ? null : data.getExtras();
        if (activityResult.getResultCode() != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            C2571m0.m11565m("ProxyBillingActivityV2", String.format("External offer flow finished with resultCode: %s", Integer.valueOf(activityResult.getResultCode())));
            extras.putInt("INTERNAL_LOG_ERROR_REASON", EnumC2644s7.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("External offer flow finished with error resultCode: %s", Integer.valueOf(activityResult.getResultCode())));
        }
        int iM8610c = C2571m0.m11560h(data, "ProxyBillingActivityV2").m8610c();
        ResultReceiver resultReceiver = this.f6594F;
        if (resultReceiver != null) {
            resultReceiver.send(iM8610c, extras);
        } else {
            C2571m0.m11565m("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (iM8610c != 0) {
            C2571m0.m11565m("ProxyBillingActivityV2", String.format("External offer flow finished with billing responseCode: %s", Integer.valueOf(iM8610c)));
        }
        finish();
    }

    /* JADX INFO: renamed from: k1 */
    public final void m8458k1(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        Bundle extras = data == null ? null : data.getExtras();
        if (activityResult.getResultCode() != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            C2571m0.m11565m("ProxyBillingActivityV2", String.format("Launch external link flow finished with resultCode: %s", Integer.valueOf(activityResult.getResultCode())));
            extras.putInt("INTERNAL_LOG_ERROR_REASON", EnumC2644s7.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("Launch external link flow finished with error resultCode: %s", Integer.valueOf(activityResult.getResultCode())));
        }
        int iM8610c = C2571m0.m11560h(data, "ProxyBillingActivityV2").m8610c();
        ResultReceiver resultReceiver = this.f6595G;
        if (resultReceiver != null) {
            resultReceiver.send(iM8610c, extras);
        } else {
            C2571m0.m11565m("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
        }
        if (iM8610c != 0) {
            C2571m0.m11565m("ProxyBillingActivityV2", String.format("Launch external link flow finished with billing responseCode: %s", Integer.valueOf(iM8610c)));
        }
        finish();
    }

    /* JADX INFO: renamed from: l1 */
    public final void m8459l1(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int iM8610c = C2571m0.m11560h(data, "ProxyBillingActivityV2").m8610c();
        ResultReceiver resultReceiver = this.f6597I;
        if (resultReceiver != null) {
            resultReceiver.send(iM8610c, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || iM8610c != 0) {
            C2571m0.m11565m("ProxyBillingActivityV2", String.format("Subscription management action finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(activityResult.getResultCode()), Integer.valueOf(iM8610c)));
        }
        finish();
    }

    @Override // p088e.ActivityC4722p, p235k2.ActivityC7415g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6598x = mo4671h(new C6257j(), new InterfaceC5852a() { // from class: v7.r1
            @Override // p139g.InterfaceC5852a
            /* JADX INFO: renamed from: a */
            public final void mo4481a(Object obj) {
                this.f42665a.m8454g1((ActivityResult) obj);
            }
        });
        this.f6599y = mo4671h(new C6257j(), new InterfaceC5852a() { // from class: v7.s1
            @Override // p139g.InterfaceC5852a
            /* JADX INFO: renamed from: a */
            public final void mo4481a(Object obj) {
                this.f42669a.m8456i1((ActivityResult) obj);
            }
        });
        this.f6600z = mo4671h(new C6257j(), new InterfaceC5852a() { // from class: v7.t1
            @Override // p139g.InterfaceC5852a
            /* JADX INFO: renamed from: a */
            public final void mo4481a(Object obj) {
                this.f42678a.m8457j1((ActivityResult) obj);
            }
        });
        this.f6589A = mo4671h(new C6257j(), new InterfaceC5852a() { // from class: v7.u1
            @Override // p139g.InterfaceC5852a
            /* JADX INFO: renamed from: a */
            public final void mo4481a(Object obj) {
                this.f42682a.m8458k1((ActivityResult) obj);
            }
        });
        this.f6590B = mo4671h(new C6257j(), new InterfaceC5852a() { // from class: v7.v1
            @Override // p139g.InterfaceC5852a
            /* JADX INFO: renamed from: a */
            public final void mo4481a(Object obj) {
                this.f42687a.m8455h1((ActivityResult) obj);
            }
        });
        this.f6591C = mo4671h(new C6257j(), new InterfaceC5852a() { // from class: v7.w1
            @Override // p139g.InterfaceC5852a
            /* JADX INFO: renamed from: a */
            public final void mo4481a(Object obj) {
                this.f42693a.m8459l1((ActivityResult) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f6592D = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.f6593E = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.f6594F = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("launch_external_link_result_receiver")) {
                this.f6595G = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
            }
            if (bundle.containsKey("billing_program_information_dialog_result_receiver")) {
                this.f6596H = (ResultReceiver) bundle.getParcelable("billing_program_information_dialog_result_receiver");
            }
            if (bundle.containsKey("subscription_management_action_result_receiver")) {
                this.f6597I = (ResultReceiver) bundle.getParcelable("subscription_management_action_result_receiver");
                return;
            }
            return;
        }
        C2571m0.m11564l("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f6592D = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f6598x.mo4725c(new IntentSenderRequest.C0401a(pendingIntent).m1474a(), m8453m1());
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f6593E = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f6599y.mo4725c(new IntentSenderRequest.C0401a(pendingIntent2).m1474a(), m8453m1());
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.f6594F = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            this.f6600z.mo4725c(new IntentSenderRequest.C0401a(pendingIntent3).m1474a(), m8453m1());
            return;
        }
        if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
            this.f6595G = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
            this.f6589A.mo4725c(new IntentSenderRequest.C0401a(pendingIntent4).m1474a(), m8453m1());
        } else if (getIntent().hasExtra("billing_program_information_dialog_pending_intent")) {
            PendingIntent pendingIntent5 = (PendingIntent) getIntent().getParcelableExtra("billing_program_information_dialog_pending_intent");
            this.f6596H = (ResultReceiver) getIntent().getParcelableExtra("billing_program_information_dialog_result_receiver");
            this.f6590B.mo4725c(new IntentSenderRequest.C0401a(pendingIntent5).m1474a(), m8453m1());
        } else if (getIntent().hasExtra("SUBSCRIPTION_MANAGEMENT_INTENT")) {
            PendingIntent pendingIntent6 = (PendingIntent) getIntent().getParcelableExtra("SUBSCRIPTION_MANAGEMENT_INTENT");
            this.f6597I = (ResultReceiver) getIntent().getParcelableExtra("subscription_management_action_result_receiver");
            this.f6591C.mo4725c(new IntentSenderRequest.C0401a(pendingIntent6).m1474a(), m8453m1());
        }
    }

    @Override // p088e.ActivityC4722p, p235k2.ActivityC7415g, android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f6592D;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f6593E;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.f6594F;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.f6595G;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
        ResultReceiver resultReceiver5 = this.f6596H;
        if (resultReceiver5 != null) {
            bundle.putParcelable("billing_program_information_dialog_result_receiver", resultReceiver5);
        }
        ResultReceiver resultReceiver6 = this.f6597I;
        if (resultReceiver6 != null) {
            bundle.putParcelable("subscription_management_action_result_receiver", resultReceiver6);
        }
    }
}
