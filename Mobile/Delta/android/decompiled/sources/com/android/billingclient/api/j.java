package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.play_billing.a0;
import com.google.android.gms.internal.play_billing.m0;
import java.util.Objects;
import v7.i1;

/* JADX INFO: loaded from: classes.dex */
public final class j extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f5190a;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f5191c;

    public j(i1 i1Var) {
        this.f5191c = i1Var;
    }

    public final d a() {
        return this.f5190a;
    }

    public final void b() {
        this.f5190a = null;
    }

    public final boolean c() {
        return this.b;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            m0.m("ProxyBillingReceiver", "Null intent!");
            return;
        }
        m0.l("ProxyBillingReceiver", "Received intent action: ".concat(String.valueOf(intent.getAction())));
        if (!Objects.equals(intent.getAction(), "com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION")) {
            if (!Objects.equals(intent.getAction(), "com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION")) {
                m0.m("ProxyBillingReceiver", "Unexpected broadcast action: ".concat(String.valueOf(intent.getAction())));
                return;
            }
            this.b = true;
            i1 i1Var = this.f5191c;
            if (i1Var != null) {
                i1Var.h(intent.getLongExtra("billingClientTransactionId", 0L));
                return;
            }
            return;
        }
        if (!intent.hasExtra("RESPONSE_CODE")) {
            m0.m("ProxyBillingReceiver", "Missing RESPONSE_CODE in intent.");
            i1 i1Var2 = this.f5191c;
            if (i1Var2 != null) {
                i1Var2.f(null, intent.getLongExtra("billingClientTransactionId", 0L));
                return;
            }
            return;
        }
        d.a aVarD = d.d();
        aVarD.d(intent.getIntExtra("RESPONSE_CODE", 0));
        aVarD.b(a0.c(intent.getStringExtra("DEBUG_MESSAGE")));
        d dVarA = aVarD.a();
        this.f5190a = dVarA;
        i1 i1Var3 = this.f5191c;
        if (i1Var3 != null) {
            i1Var3.f(dVarA, intent.getLongExtra("billingClientTransactionId", 0L));
        }
    }
}
