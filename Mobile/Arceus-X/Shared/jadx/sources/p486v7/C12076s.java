package p486v7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.C1748d;
import com.android.billingclient.api.C1752h;
import com.google.android.gms.internal.play_billing.AbstractC2582n0;
import com.google.android.gms.internal.play_billing.C2567l7;
import com.google.android.gms.internal.play_billing.C2571m0;
import com.google.android.gms.internal.play_billing.EnumC2644s7;
import com.google.android.gms.internal.play_billing.EnumC2721z7;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: v7.s */
/* JADX INFO: loaded from: classes.dex */
public final class C12076s extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public boolean f42666a;

    /* JADX INFO: renamed from: b */
    public final boolean f42667b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C12079t f42668c;

    public C12076s(C12079t c12079t, boolean z10) {
        Objects.requireNonNull(c12079t);
        this.f42668c = c12079t;
        this.f42667b = z10;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m44926a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f42666a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f42667b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f42666a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m44927b(Context context, IntentFilter intentFilter, String str) {
        C12076s c12076s;
        try {
            try {
                if (this.f42666a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    c12076s = this;
                    context.registerReceiver(c12076s, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f42667b ? 4 : 2);
                } else {
                    c12076s = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                c12076s.f42666a = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m44928c(Bundle bundle, C1748d c1748d, int i10, EnumC2721z7 enumC2721z7, long j10, boolean z10) {
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                this.f42668c.f42672c.mo44877l(C2567l7.m11547G(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j10, z10);
            } else {
                this.f42668c.f42672c.mo44877l(C12044h1.m44858b(EnumC2644s7.BILLING_RESULT_RECEIVED_FROM_PHONESKY, i10, c1748d, null, enumC2721z7), j10, z10);
            }
        } catch (Throwable unused) {
            C2571m0.m11565m("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        EnumC2721z7 enumC2721z7;
        int i10;
        int i11;
        C1748d c1748dM11560h;
        int iIntValue;
        String action = intent.getAction();
        int iHashCode = action.hashCode();
        if (iHashCode != -1484087650) {
            if (iHashCode != -337612916) {
                if (iHashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                    enumC2721z7 = EnumC2721z7.ALTERNATIVE_BILLING_ACTION;
                } else {
                    enumC2721z7 = EnumC2721z7.BROADCAST_ACTION_UNSPECIFIED;
                }
            } else if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                enumC2721z7 = EnumC2721z7.LOCAL_PURCHASES_UPDATED_ACTION;
            } else {
                enumC2721z7 = EnumC2721z7.BROADCAST_ACTION_UNSPECIFIED;
            }
        } else if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            enumC2721z7 = EnumC2721z7.PURCHASES_UPDATED_ACTION;
        } else {
            enumC2721z7 = EnumC2721z7.BROADCAST_ACTION_UNSPECIFIED;
        }
        EnumC2721z7 enumC2721z8 = enumC2721z7;
        EnumC2721z7 enumC2721z9 = EnumC2721z7.LOCAL_PURCHASES_UPDATED_ACTION;
        if (enumC2721z8.equals(enumC2721z9) || enumC2721z8.equals(EnumC2721z7.ALTERNATIVE_BILLING_ACTION)) {
            i10 = 2;
            i11 = 2;
        } else {
            i11 = enumC2721z8.equals(EnumC2721z7.PURCHASES_UPDATED_ACTION) ? 32 : 1;
            i10 = 2;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            C2571m0.m11565m("BillingBroadcastManager", "Bundle is null.");
            C12079t c12079t = this.f42668c;
            InterfaceC12048i1 interfaceC12048i1 = c12079t.f42672c;
            EnumC2644s7 enumC2644s7 = EnumC2644s7.NULL_BUNDLE_IN_BROADCAST_RECEIVER;
            C1748d c1748d = C1752h.f6762h;
            interfaceC12048i1.mo44875j(C12044h1.m44858b(enumC2644s7, i11, c1748d, null, enumC2721z8));
            if (c12079t.f42671b != null) {
                c12079t.f42671b.mo25424a(c1748d, null);
            }
        } else {
            if (i11 == i10) {
                int i12 = C2571m0.f9152a;
                C1748d.a aVarM8604d = C1748d.m8604d();
                aVarM8604d.m8614d(C2571m0.m11554b(intent.getExtras(), "BillingBroadcastManager"));
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    C2571m0.m11565m("BillingBroadcastManager", "Unexpected null bundle received!");
                } else {
                    Object obj = extras2.get("SUB_RESPONSE_CODE");
                    if (obj == null) {
                        C2571m0.m11564l("BillingBroadcastManager", "getOnPurchasesUpdatedSubResponseCodeFromBundle() got null response code, assuming OK");
                    } else {
                        if (obj instanceof Integer) {
                            iIntValue = ((Integer) obj).intValue();
                        } else {
                            C2571m0.m11565m("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                        }
                        aVarM8604d.m8613c(iIntValue);
                        aVarM8604d.m8612b(C2571m0.m11561i(intent.getExtras(), "BillingBroadcastManager"));
                        c1748dM11560h = aVarM8604d.m8611a();
                    }
                }
                iIntValue = 0;
                aVarM8604d.m8613c(iIntValue);
                aVarM8604d.m8612b(C2571m0.m11561i(intent.getExtras(), "BillingBroadcastManager"));
                c1748dM11560h = aVarM8604d.m8611a();
            } else {
                c1748dM11560h = C2571m0.m11560h(intent, "BillingBroadcastManager");
            }
            long j10 = extras.getLong("billingClientTransactionId", 0L);
            boolean z10 = extras.getBoolean("wasServiceAutoReconnected", false);
            if (enumC2721z8.equals(EnumC2721z7.PURCHASES_UPDATED_ACTION) || enumC2721z8.equals(enumC2721z9)) {
                C1748d c1748d2 = c1748dM11560h;
                C12079t c12079t2 = this.f42668c;
                List<C12052k> listM11563k = C2571m0.m11563k(extras, c12079t2.f42676g);
                if (c1748d2.m8610c() == 0) {
                    c12079t2.f42672c.mo44872g(C12044h1.m44859c(i11, enumC2721z8), j10, z10);
                } else {
                    m44928c(extras, c1748d2, i11, enumC2721z8, j10, z10);
                }
                c12079t2.f42671b.mo25424a(c1748d2, listM11563k);
                return;
            }
            if (enumC2721z8.equals(EnumC2721z7.ALTERNATIVE_BILLING_ACTION)) {
                if (c1748dM11560h.m8610c() != 0) {
                    C1748d c1748d3 = c1748dM11560h;
                    m44928c(extras, c1748d3, i11, enumC2721z8, j10, z10);
                    this.f42668c.f42671b.mo25424a(c1748d3, AbstractC2582n0.m11599k());
                    return;
                }
                C12079t c12079t3 = this.f42668c;
                C12079t.m44929a(c12079t3);
                C12079t.m44933f(c12079t3);
                C12079t.m44931c(c12079t3);
                C2571m0.m11565m("BillingBroadcastManager", "No valid alternative billing listener is registered.");
                InterfaceC12048i1 interfaceC12048i2 = c12079t3.f42672c;
                EnumC2644s7 enumC2644s8 = EnumC2644s7.NULL_DEVELOPER_MANAGED_BILLING_LISTENER;
                C1748d c1748d4 = C1752h.f6762h;
                interfaceC12048i2.mo44877l(C12044h1.m44858b(enumC2644s8, i11, c1748d4, null, enumC2721z8), j10, z10);
                c12079t3.f42671b.mo25424a(c1748d4, AbstractC2582n0.m11599k());
            }
        }
    }
}
