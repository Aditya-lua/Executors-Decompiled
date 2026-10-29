package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.play_billing.C2439a0;
import com.google.android.gms.internal.play_billing.C2571m0;
import java.util.Objects;
import p486v7.InterfaceC12048i1;

/* JADX INFO: renamed from: com.android.billingclient.api.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1754j extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public C1748d f6781a;

    /* JADX INFO: renamed from: b */
    public boolean f6782b = false;

    /* JADX INFO: renamed from: c */
    public final InterfaceC12048i1 f6783c;

    public C1754j(InterfaceC12048i1 interfaceC12048i1) {
        this.f6783c = interfaceC12048i1;
    }

    /* JADX INFO: renamed from: a */
    public final C1748d m8676a() {
        return this.f6781a;
    }

    /* JADX INFO: renamed from: b */
    public final void m8677b() {
        this.f6781a = null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8678c() {
        return this.f6782b;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            C2571m0.m11565m("ProxyBillingReceiver", "Null intent!");
            return;
        }
        C2571m0.m11564l("ProxyBillingReceiver", "Received intent action: ".concat(String.valueOf(intent.getAction())));
        if (!Objects.equals(intent.getAction(), "com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION")) {
            if (!Objects.equals(intent.getAction(), "com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION")) {
                C2571m0.m11565m("ProxyBillingReceiver", "Unexpected broadcast action: ".concat(String.valueOf(intent.getAction())));
                return;
            }
            this.f6782b = true;
            InterfaceC12048i1 interfaceC12048i1 = this.f6783c;
            if (interfaceC12048i1 != null) {
                interfaceC12048i1.mo44873h(intent.getLongExtra("billingClientTransactionId", 0L));
                return;
            }
            return;
        }
        if (!intent.hasExtra("RESPONSE_CODE")) {
            C2571m0.m11565m("ProxyBillingReceiver", "Missing RESPONSE_CODE in intent.");
            InterfaceC12048i1 interfaceC12048i2 = this.f6783c;
            if (interfaceC12048i2 != null) {
                interfaceC12048i2.mo44871f(null, intent.getLongExtra("billingClientTransactionId", 0L));
                return;
            }
            return;
        }
        C1748d.a aVarM8604d = C1748d.m8604d();
        aVarM8604d.m8614d(intent.getIntExtra("RESPONSE_CODE", 0));
        aVarM8604d.m8612b(C2439a0.m11167c(intent.getStringExtra("DEBUG_MESSAGE")));
        C1748d c1748dM8611a = aVarM8604d.m8611a();
        this.f6781a = c1748dM8611a;
        InterfaceC12048i1 interfaceC12048i3 = this.f6783c;
        if (interfaceC12048i3 != null) {
            interfaceC12048i3.mo44871f(c1748dM8611a, intent.getLongExtra("billingClientTransactionId", 0L));
        }
    }
}
