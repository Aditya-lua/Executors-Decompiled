package com.android.billingclient.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.b9;
import com.google.android.gms.internal.play_billing.e8;
import com.google.android.gms.internal.play_billing.e9;
import com.google.android.gms.internal.play_billing.h8;
import com.google.android.gms.internal.play_billing.m0;
import com.google.android.gms.internal.play_billing.s7;
import com.google.android.gms.internal.play_billing.z7;
import v7.h1;
import v7.i1;
import v7.m1;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ResultReceiver f5051a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f5056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i1 f5057h;

    public final s7 a(int i10, Intent intent) {
        if (intent != null) {
            if (intent.getExtras() == null) {
                return s7.NULL_BUNDLE_IN_ACTIVITY_RESULT;
            }
            return i10 == 5 ? s7.PLAY_STORE_ON_CREATE_RUNTIME_EXCEPTION : s7.REASON_UNSPECIFIED;
        }
        if (i10 == -1) {
            return s7.NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
        }
        if (i10 == 0) {
            return s7.NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
        }
        if (i10 != 3) {
            return i10 != 4 ? s7.NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : s7.NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE;
        }
        return s7.NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE;
    }

    public final boolean b(Bundle bundle) {
        if (bundle != null) {
            return bundle.containsKey("in_app_message_result_receiver");
        }
        if (getIntent() == null) {
            return false;
        }
        return getIntent().hasExtra("IN_APP_MESSAGE_INTENT");
    }

    public final boolean c(int i10, Intent intent) {
        return !a(i10, intent).equals(s7.REASON_UNSPECIFIED);
    }

    public final boolean d() {
        return this.f5056g != null;
    }

    public final Intent e(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0068  */
    public final Intent f(s7 s7Var, long j10, boolean z10) {
        Intent intentG = g();
        if (!z10) {
            intentG.putExtra("RESPONSE_CODE", 6);
            intentG.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
            d.a aVarD = d.d();
            aVarD.d(6);
            aVarD.b("An internal error occurred.");
            d dVarA = aVarD.a();
            int i10 = h1.f32789a;
            intentG.putExtra("FAILURE_LOGGING_PAYLOAD", h1.b(s7Var, 2, dVarA, null, z7.BROADCAST_ACTION_UNSPECIFIED).b());
        } else if (d() && this.f5056g.a() != null) {
            d dVarA2 = this.f5056g.a();
            intentG.putExtra("RESPONSE_CODE", dVarA2.c());
            intentG.putExtra("DEBUG_MESSAGE", dVarA2.a());
        } else if (!d() || this.f5056g.c()) {
            intentG.putExtra("RESPONSE_CODE", 6);
            intentG.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
            d.a aVarD2 = d.d();
            aVarD2.d(6);
            aVarD2.b("An internal error occurred.");
            d dVarA3 = aVarD2.a();
            int i11 = h1.f32789a;
            intentG.putExtra("FAILURE_LOGGING_PAYLOAD", h1.b(s7Var, 2, dVarA3, null, z7.BROADCAST_ACTION_UNSPECIFIED).b());
        } else {
            intentG.putExtra("RESPONSE_CODE", 3);
            intentG.putExtra("DEBUG_MESSAGE", "Play Store is blocked.");
            d.a aVarD3 = d.d();
            aVarD3.d(3);
            aVarD3.b("Play Store is blocked.");
            d dVarA4 = aVarD3.a();
            s7 s7Var2 = s7.PLAY_STORE_APP_BLOCKED;
            int i12 = h1.f32789a;
            intentG.putExtra("FAILURE_LOGGING_PAYLOAD", h1.b(s7Var2, 2, dVarA4, null, z7.BROADCAST_ACTION_UNSPECIFIED).b());
        }
        intentG.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentG.putExtra("billingClientTransactionId", j10);
        intentG.putExtra("wasServiceAutoReconnected", this.f5055f);
        return intentG;
    }

    public final Intent g() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0037 A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:5:0x001d, B:28:0x0067, B:21:0x0031, B:23:0x0037, B:25:0x005e, B:24:0x004b), top: B:30:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004b A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:5:0x001d, B:28:0x0067, B:21:0x0031, B:23:0x0037, B:25:0x005e, B:24:0x004b), top: B:30:0x0001 }] */
    public final synchronized void h() throws Throwable {
        ProxyBillingActivity proxyBillingActivity;
        try {
            try {
                this.f5056g = new j(this.f5057h);
                IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION");
                intentFilter.addAction("com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION");
                proxyBillingActivity = this;
                try {
                    l2.b.n(proxyBillingActivity, this.f5056g, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, 2);
                } catch (NoSuchMethodError e10) {
                    e = e10;
                    proxyBillingActivity.f5056g = null;
                    if (e instanceof NoSuchMethodError) {
                        i1 i1Var = proxyBillingActivity.f5057h;
                        b9 b9VarB = e9.B();
                        b9VarB.o(2);
                        i1Var.d((e9) b9VarB.i());
                    } else {
                        i1 i1Var2 = proxyBillingActivity.f5057h;
                        b9 b9VarB2 = e9.B();
                        b9VarB2.o(1);
                        i1Var2.d((e9) b9VarB2.i());
                    }
                    m0.n("ProxyBillingActivity", "Failed to register receiver.", e);
                } catch (RuntimeException e11) {
                    e = e11;
                    proxyBillingActivity.f5056g = null;
                    if (e instanceof NoSuchMethodError) {
                        i1 i1Var3 = proxyBillingActivity.f5057h;
                        b9 b9VarB3 = e9.B();
                        b9VarB3.o(2);
                        i1Var3.d((e9) b9VarB3.i());
                    } else {
                        i1 i1Var4 = proxyBillingActivity.f5057h;
                        b9 b9VarB4 = e9.B();
                        b9VarB4.o(1);
                        i1Var4.d((e9) b9VarB4.i());
                    }
                    m0.n("ProxyBillingActivity", "Failed to register receiver.", e);
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (NoSuchMethodError e12) {
            e = e12;
            proxyBillingActivity = this;
            proxyBillingActivity.f5056g = null;
            if (e instanceof NoSuchMethodError) {
                i1 i1Var5 = proxyBillingActivity.f5057h;
                b9 b9VarB5 = e9.B();
                b9VarB5.o(2);
                i1Var5.d((e9) b9VarB5.i());
            } else {
                i1 i1Var6 = proxyBillingActivity.f5057h;
                b9 b9VarB6 = e9.B();
                b9VarB6.o(1);
                i1Var6.d((e9) b9VarB6.i());
            }
            m0.n("ProxyBillingActivity", "Failed to register receiver.", e);
        } catch (RuntimeException e13) {
            e = e13;
            proxyBillingActivity = this;
            proxyBillingActivity.f5056g = null;
            if (e instanceof NoSuchMethodError) {
                i1 i1Var7 = proxyBillingActivity.f5057h;
                b9 b9VarB7 = e9.B();
                b9VarB7.o(2);
                i1Var7.d((e9) b9VarB7.i());
            } else {
                i1 i1Var8 = proxyBillingActivity.f5057h;
                b9 b9VarB8 = e9.B();
                b9VarB8.o(1);
                i1Var8.d((e9) b9VarB8.i());
            }
            m0.n("ProxyBillingActivity", "Failed to register receiver.", e);
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a A[PHI: r10
      0x005a: PHI (r10v1 int) = (r10v0 int), (r10v15 int) binds: [B:20:0x0055, B:22:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Code duplicated, block: B:28:0x0099  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:6:0x0011  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x005a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x0079, please report this as an issue */
    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        boolean z10;
        int iC;
        int i12;
        String string;
        Intent intentG;
        boolean z11;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 100) {
            if (intent == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            iC = m0.h(intent, "ProxyBillingActivity").c();
            i12 = -1;
            if (i11 != -1) {
                m0.m("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + iC);
                i12 = i11;
            } else if (iC != 0) {
                i11 = -1;
                m0.m("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + iC);
                i12 = i11;
            }
            if (true != z10) {
                m0.m("ProxyBillingActivity", "Got null data with resultCode " + i12 + "!");
            } else if (intent.getExtras() == null) {
                m0.m("ProxyBillingActivity", "Got null bundle!");
            }
            if (c(i12, intent)) {
                s7 s7VarA = a(i12, intent);
                long j10 = this.f5054e;
                if (intent == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                intentG = f(s7VarA, j10, z11);
            } else {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    intentG = e(string);
                    intentG.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                } else {
                    intentG = g();
                    intentG.putExtras(intent.getExtras());
                    intentG.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentG.putExtra("billingClientTransactionId", this.f5054e);
                intentG.putExtra("wasServiceAutoReconnected", this.f5055f);
            }
            if (i10 == 110) {
                intentG.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentG);
        } else if (i10 == 110) {
            if (intent == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            iC = m0.h(intent, "ProxyBillingActivity").c();
            i12 = -1;
            if (i11 != -1) {
                m0.m("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + iC);
                i12 = i11;
            } else if (iC != 0) {
                i11 = -1;
                m0.m("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + iC);
                i12 = i11;
            }
            if (true != z10) {
                m0.m("ProxyBillingActivity", "Got null data with resultCode " + i12 + "!");
            } else if (intent.getExtras() == null) {
                m0.m("ProxyBillingActivity", "Got null bundle!");
            }
            if (c(i12, intent)) {
                s7 s7VarA2 = a(i12, intent);
                long j11 = this.f5054e;
                if (intent == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                intentG = f(s7VarA2, j11, z11);
            } else {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    intentG = e(string);
                    intentG.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                } else {
                    intentG = g();
                    intentG.putExtras(intent.getExtras());
                    intentG.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentG.putExtra("billingClientTransactionId", this.f5054e);
                intentG.putExtra("wasServiceAutoReconnected", this.f5055f);
            }
            if (i10 == 110) {
                intentG.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentG);
        } else if (i10 == 101) {
            int iA = m0.a(intent, "ProxyBillingActivity");
            ResultReceiver resultReceiver = this.f5051a;
            if (resultReceiver != null) {
                resultReceiver.send(iA, intent == null ? null : intent.getExtras());
            }
        } else {
            m0.m("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i10 + "; skipping...");
        }
        this.b = false;
        if (d()) {
            this.f5056g.b();
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        int i10;
        PendingIntent pendingIntent;
        Bundle bundle2;
        Bundle bundle3;
        super.onCreate(bundle);
        if (!b(bundle)) {
            try {
                i10 = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e10) {
                m0.n("ProxyBillingActivity", "Failed to get package info for current package.", e10);
                i10 = -1;
            }
            if (this.f5057h == null) {
                Context applicationContext = getApplicationContext();
                e8 e8VarL = h8.L();
                e8VarL.v(getPackageName());
                e8VarL.E(u7.a.f32091a);
                e8VarL.p(i10);
                e8VarL.o(Build.VERSION.SDK_INT);
                e8VarL.t(912213584L);
                this.f5057h = new m1(applicationContext, (h8) e8VarL.i());
            }
            h();
        }
        if (bundle != null) {
            m0.l("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f5051a = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f5052c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f5053d = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.f5054e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f5055f = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        m0.l("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f5053d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f5052c = true;
                this.f5053d = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f5051a = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f5053d = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.f5054e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f5055f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.b = true;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 36) {
                if (i11 >= 34) {
                    bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
                } else {
                    bundle2 = null;
                }
                startIntentSenderForResult(pendingIntent.getIntentSender(), this.f5053d, new Intent(), 0, 0, 0, bundle2);
            }
            bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(3).toBundle();
            bundle2 = bundle3;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f5053d, new Intent(), 0, 0, 0, bundle2);
        } catch (IntentSender.SendIntentException e11) {
            m0.n("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e11);
            ResultReceiver resultReceiver = this.f5051a;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentF = f(s7.INTENT_SENDER_EXCEPTION, this.f5054e, false);
                if (this.f5052c) {
                    intentF.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentF);
            }
            this.b = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        d dVarA;
        super.onDestroy();
        if (d()) {
            dVarA = this.f5056g.a();
            try {
                unregisterReceiver(this.f5056g);
            } catch (RuntimeException e10) {
                m0.n("ProxyBillingActivity", "Failed to unregister receiver.", e10);
            }
        } else {
            dVarA = null;
        }
        if (isFinishing() && this.b) {
            Intent intentG = g();
            if (dVarA != null) {
                intentG.putExtra("RESPONSE_CODE", dVarA.c());
                intentG.putExtra("DEBUG_MESSAGE", dVarA.a());
            } else {
                intentG.putExtra("RESPONSE_CODE", 1);
                intentG.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            }
            if (this.f5052c) {
                intentG.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i10 = this.f5053d;
            if (i10 == 110 || i10 == 100) {
                intentG.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentG.putExtra("billingClientTransactionId", this.f5054e);
            }
            sendBroadcast(intentG);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f5051a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f5052c);
        bundle.putInt("activity_code", this.f5053d);
        bundle.putLong("billingClientTransactionId", this.f5054e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f5055f);
    }
}
