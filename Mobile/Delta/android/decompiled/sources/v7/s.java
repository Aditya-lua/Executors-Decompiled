package v7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.l7;
import com.google.android.gms.internal.play_billing.s7;
import com.google.android.gms.internal.play_billing.z7;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class s extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f32834a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f32835c;

    public s(t tVar, boolean z10) {
        Objects.requireNonNull(tVar);
        this.f32835c = tVar;
        this.b = z10;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f32834a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f32834a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter, String str) {
        s sVar;
        try {
            try {
                if (this.f32834a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    sVar = this;
                    context.registerReceiver(sVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.b ? 4 : 2);
                } else {
                    sVar = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                sVar.f32834a = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final void c(Bundle bundle, com.android.billingclient.api.d dVar, int i10, z7 z7Var, long j10, boolean z10) {
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                this.f32835c.f32838c.l(l7.G(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j10, z10);
            } else {
                this.f32835c.f32838c.l(h1.b(s7.BILLING_RESULT_RECEIVED_FROM_PHONESKY, i10, dVar, null, z7Var), j10, z10);
            }
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.m0.m("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        z7 z7Var;
        int i10;
        int i11;
        com.android.billingclient.api.d dVarH;
        int iIntValue;
        String action = intent.getAction();
        int iHashCode = action.hashCode();
        if (iHashCode != -1484087650) {
            if (iHashCode != -337612916) {
                if (iHashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                    z7Var = z7.ALTERNATIVE_BILLING_ACTION;
                } else {
                    z7Var = z7.BROADCAST_ACTION_UNSPECIFIED;
                }
            } else if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                z7Var = z7.LOCAL_PURCHASES_UPDATED_ACTION;
            } else {
                z7Var = z7.BROADCAST_ACTION_UNSPECIFIED;
            }
        } else if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            z7Var = z7.PURCHASES_UPDATED_ACTION;
        } else {
            z7Var = z7.BROADCAST_ACTION_UNSPECIFIED;
        }
        z7 z7Var2 = z7Var;
        z7 z7Var3 = z7.LOCAL_PURCHASES_UPDATED_ACTION;
        if (z7Var2.equals(z7Var3) || z7Var2.equals(z7.ALTERNATIVE_BILLING_ACTION)) {
            i10 = 2;
            i11 = 2;
        } else {
            i11 = z7Var2.equals(z7.PURCHASES_UPDATED_ACTION) ? 32 : 1;
            i10 = 2;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            com.google.android.gms.internal.play_billing.m0.m("BillingBroadcastManager", "Bundle is null.");
            t tVar = this.f32835c;
            i1 i1Var = tVar.f32838c;
            s7 s7Var = s7.NULL_BUNDLE_IN_BROADCAST_RECEIVER;
            com.android.billingclient.api.d dVar = com.android.billingclient.api.h.f5171h;
            i1Var.j(h1.b(s7Var, i11, dVar, null, z7Var2));
            if (tVar.b != null) {
                tVar.b.a(dVar, null);
            }
        } else {
            if (i11 == i10) {
                int i12 = com.google.android.gms.internal.play_billing.m0.f7176a;
                com.android.billingclient.api.d.a aVarD = com.android.billingclient.api.d.d();
                aVarD.d(com.google.android.gms.internal.play_billing.m0.b(intent.getExtras(), "BillingBroadcastManager"));
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    com.google.android.gms.internal.play_billing.m0.m("BillingBroadcastManager", "Unexpected null bundle received!");
                } else {
                    Object obj = extras2.get("SUB_RESPONSE_CODE");
                    if (obj == null) {
                        com.google.android.gms.internal.play_billing.m0.l("BillingBroadcastManager", "getOnPurchasesUpdatedSubResponseCodeFromBundle() got null response code, assuming OK");
                    } else {
                        if (obj instanceof Integer) {
                            iIntValue = ((Integer) obj).intValue();
                        } else {
                            com.google.android.gms.internal.play_billing.m0.m("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                        }
                        aVarD.c(iIntValue);
                        aVarD.b(com.google.android.gms.internal.play_billing.m0.i(intent.getExtras(), "BillingBroadcastManager"));
                        dVarH = aVarD.a();
                    }
                }
                iIntValue = 0;
                aVarD.c(iIntValue);
                aVarD.b(com.google.android.gms.internal.play_billing.m0.i(intent.getExtras(), "BillingBroadcastManager"));
                dVarH = aVarD.a();
            } else {
                dVarH = com.google.android.gms.internal.play_billing.m0.h(intent, "BillingBroadcastManager");
            }
            long j10 = extras.getLong("billingClientTransactionId", 0L);
            boolean z10 = extras.getBoolean("wasServiceAutoReconnected", false);
            if (z7Var2.equals(z7.PURCHASES_UPDATED_ACTION) || z7Var2.equals(z7Var3)) {
                com.android.billingclient.api.d dVar2 = dVarH;
                t tVar2 = this.f32835c;
                List<k> listK = com.google.android.gms.internal.play_billing.m0.k(extras, tVar2.f32842g);
                if (dVar2.c() == 0) {
                    tVar2.f32838c.g(h1.c(i11, z7Var2), j10, z10);
                } else {
                    c(extras, dVar2, i11, z7Var2, j10, z10);
                }
                tVar2.b.a(dVar2, listK);
                return;
            }
            if (z7Var2.equals(z7.ALTERNATIVE_BILLING_ACTION)) {
                if (dVarH.c() != 0) {
                    com.android.billingclient.api.d dVar3 = dVarH;
                    c(extras, dVar3, i11, z7Var2, j10, z10);
                    this.f32835c.b.a(dVar3, com.google.android.gms.internal.play_billing.n0.k());
                    return;
                }
                t tVar3 = this.f32835c;
                t.a(tVar3);
                t.f(tVar3);
                t.c(tVar3);
                com.google.android.gms.internal.play_billing.m0.m("BillingBroadcastManager", "No valid alternative billing listener is registered.");
                i1 i1Var2 = tVar3.f32838c;
                s7 s7Var2 = s7.NULL_DEVELOPER_MANAGED_BILLING_LISTENER;
                com.android.billingclient.api.d dVar4 = com.android.billingclient.api.h.f5171h;
                i1Var2.l(h1.b(s7Var2, i11, dVar4, null, z7Var2), j10, z10);
                tVar3.b.a(dVar4, com.google.android.gms.internal.play_billing.n0.k());
            }
        }
    }
}
