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
import com.google.android.gms.internal.play_billing.m0;
import com.google.android.gms.internal.play_billing.s7;
import e.p;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends p {
    public g.c A;
    public g.c B;
    public g.c C;
    public ResultReceiver D;
    public ResultReceiver E;
    public ResultReceiver F;
    public ResultReceiver G;
    public ResultReceiver H;
    public ResultReceiver I;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public g.c f5058x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public g.c f5059y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public g.c f5060z;

    public static final k2.c m1() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 36) {
            return k2.c.a().b(3);
        }
        if (i10 >= 34) {
            return k2.c.a().b(1);
        }
        return null;
    }

    public final void g1(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int iC = m0.h(data, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.D;
        if (resultReceiver != null) {
            resultReceiver.send(iC, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || iC != 0) {
            m0.m("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + activityResult.getResultCode() + " and billing's responseCode: " + iC);
        }
        finish();
    }

    public final void h1(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int iC = m0.h(data, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.H;
        if (resultReceiver != null) {
            resultReceiver.send(iC, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || iC != 0) {
            m0.m("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + activityResult.getResultCode() + " and billing's responseCode: " + iC);
        }
        finish();
    }

    public final void i1(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int iC = m0.h(data, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.E;
        if (resultReceiver != null) {
            resultReceiver.send(iC, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || iC != 0) {
            m0.m("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(activityResult.getResultCode()), Integer.valueOf(iC)));
        }
        finish();
    }

    public final void j1(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        Bundle extras = data == null ? null : data.getExtras();
        if (activityResult.getResultCode() != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            m0.m("ProxyBillingActivityV2", String.format("External offer flow finished with resultCode: %s", Integer.valueOf(activityResult.getResultCode())));
            extras.putInt("INTERNAL_LOG_ERROR_REASON", s7.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("External offer flow finished with error resultCode: %s", Integer.valueOf(activityResult.getResultCode())));
        }
        int iC = m0.h(data, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.F;
        if (resultReceiver != null) {
            resultReceiver.send(iC, extras);
        } else {
            m0.m("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (iC != 0) {
            m0.m("ProxyBillingActivityV2", String.format("External offer flow finished with billing responseCode: %s", Integer.valueOf(iC)));
        }
        finish();
    }

    public final void k1(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        Bundle extras = data == null ? null : data.getExtras();
        if (activityResult.getResultCode() != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            m0.m("ProxyBillingActivityV2", String.format("Launch external link flow finished with resultCode: %s", Integer.valueOf(activityResult.getResultCode())));
            extras.putInt("INTERNAL_LOG_ERROR_REASON", s7.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("Launch external link flow finished with error resultCode: %s", Integer.valueOf(activityResult.getResultCode())));
        }
        int iC = m0.h(data, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.G;
        if (resultReceiver != null) {
            resultReceiver.send(iC, extras);
        } else {
            m0.m("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
        }
        if (iC != 0) {
            m0.m("ProxyBillingActivityV2", String.format("Launch external link flow finished with billing responseCode: %s", Integer.valueOf(iC)));
        }
        finish();
    }

    public final void l1(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int iC = m0.h(data, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.I;
        if (resultReceiver != null) {
            resultReceiver.send(iC, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || iC != 0) {
            m0.m("ProxyBillingActivityV2", String.format("Subscription management action finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(activityResult.getResultCode()), Integer.valueOf(iC)));
        }
        finish();
    }

    @Override // e.p, k2.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5058x = h(new h.j(), new g.a() { // from class: v7.r1
            @Override // g.a
            public final void a(Object obj) {
                this.f32833a.g1((ActivityResult) obj);
            }
        });
        this.f5059y = h(new h.j(), new g.a() { // from class: v7.s1
            @Override // g.a
            public final void a(Object obj) {
                this.f32836a.i1((ActivityResult) obj);
            }
        });
        this.f5060z = h(new h.j(), new g.a() { // from class: v7.t1
            @Override // g.a
            public final void a(Object obj) {
                this.f32844a.j1((ActivityResult) obj);
            }
        });
        this.A = h(new h.j(), new g.a() { // from class: v7.u1
            @Override // g.a
            public final void a(Object obj) {
                this.f32847a.k1((ActivityResult) obj);
            }
        });
        this.B = h(new h.j(), new g.a() { // from class: v7.v1
            @Override // g.a
            public final void a(Object obj) {
                this.f32850a.h1((ActivityResult) obj);
            }
        });
        this.C = h(new h.j(), new g.a() { // from class: v7.w1
            @Override // g.a
            public final void a(Object obj) {
                this.f32854a.l1((ActivityResult) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.D = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.E = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.F = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("launch_external_link_result_receiver")) {
                this.G = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
            }
            if (bundle.containsKey("billing_program_information_dialog_result_receiver")) {
                this.H = (ResultReceiver) bundle.getParcelable("billing_program_information_dialog_result_receiver");
            }
            if (bundle.containsKey("subscription_management_action_result_receiver")) {
                this.I = (ResultReceiver) bundle.getParcelable("subscription_management_action_result_receiver");
                return;
            }
            return;
        }
        m0.l("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.D = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f5058x.c(new IntentSenderRequest.a(pendingIntent).a(), m1());
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.E = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f5059y.c(new IntentSenderRequest.a(pendingIntent2).a(), m1());
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.F = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            this.f5060z.c(new IntentSenderRequest.a(pendingIntent3).a(), m1());
            return;
        }
        if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
            this.G = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
            this.A.c(new IntentSenderRequest.a(pendingIntent4).a(), m1());
        } else if (getIntent().hasExtra("billing_program_information_dialog_pending_intent")) {
            PendingIntent pendingIntent5 = (PendingIntent) getIntent().getParcelableExtra("billing_program_information_dialog_pending_intent");
            this.H = (ResultReceiver) getIntent().getParcelableExtra("billing_program_information_dialog_result_receiver");
            this.B.c(new IntentSenderRequest.a(pendingIntent5).a(), m1());
        } else if (getIntent().hasExtra("SUBSCRIPTION_MANAGEMENT_INTENT")) {
            PendingIntent pendingIntent6 = (PendingIntent) getIntent().getParcelableExtra("SUBSCRIPTION_MANAGEMENT_INTENT");
            this.I = (ResultReceiver) getIntent().getParcelableExtra("subscription_management_action_result_receiver");
            this.C.c(new IntentSenderRequest.a(pendingIntent6).a(), m1());
        }
    }

    @Override // e.p, k2.g, android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.D;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.E;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.F;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.G;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
        ResultReceiver resultReceiver5 = this.H;
        if (resultReceiver5 != null) {
            bundle.putParcelable("billing_program_information_dialog_result_receiver", resultReceiver5);
        }
        ResultReceiver resultReceiver6 = this.I;
        if (resultReceiver6 != null) {
            bundle.putParcelable("subscription_management_action_result_receiver", resultReceiver6);
        }
    }
}
