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
import com.google.android.gms.internal.play_billing.C2459b9;
import com.google.android.gms.internal.play_billing.C2491e8;
import com.google.android.gms.internal.play_billing.C2492e9;
import com.google.android.gms.internal.play_billing.C2524h8;
import com.google.android.gms.internal.play_billing.C2571m0;
import com.google.android.gms.internal.play_billing.EnumC2644s7;
import com.google.android.gms.internal.play_billing.EnumC2721z7;
import p261l2.C7975b;
import p461u7.C11809a;
import p486v7.C12044h1;
import p486v7.C12060m1;
import p486v7.InterfaceC12048i1;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public ResultReceiver f6581a;

    /* JADX INFO: renamed from: b */
    public boolean f6582b;

    /* JADX INFO: renamed from: c */
    public boolean f6583c;

    /* JADX INFO: renamed from: d */
    public int f6584d;

    /* JADX INFO: renamed from: e */
    public long f6585e;

    /* JADX INFO: renamed from: f */
    public boolean f6586f;

    /* JADX INFO: renamed from: g */
    public C1754j f6587g;

    /* JADX INFO: renamed from: h */
    public InterfaceC12048i1 f6588h;

    /* JADX INFO: renamed from: a */
    public final EnumC2644s7 m8445a(int i10, Intent intent) {
        if (intent != null) {
            if (intent.getExtras() == null) {
                return EnumC2644s7.NULL_BUNDLE_IN_ACTIVITY_RESULT;
            }
            return i10 == 5 ? EnumC2644s7.PLAY_STORE_ON_CREATE_RUNTIME_EXCEPTION : EnumC2644s7.REASON_UNSPECIFIED;
        }
        if (i10 == -1) {
            return EnumC2644s7.NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
        }
        if (i10 == 0) {
            return EnumC2644s7.NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
        }
        if (i10 != 3) {
            return i10 != 4 ? EnumC2644s7.NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : EnumC2644s7.NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE;
        }
        return EnumC2644s7.NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8446b(Bundle bundle) {
        if (bundle != null) {
            return bundle.containsKey("in_app_message_result_receiver");
        }
        if (getIntent() == null) {
            return false;
        }
        return getIntent().hasExtra("IN_APP_MESSAGE_INTENT");
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8447c(int i10, Intent intent) {
        return !m8445a(i10, intent).equals(EnumC2644s7.REASON_UNSPECIFIED);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8448d() {
        return this.f6587g != null;
    }

    /* JADX INFO: renamed from: e */
    public final Intent m8449e(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0068  */
    /* JADX INFO: renamed from: f */
    public final Intent m8450f(EnumC2644s7 enumC2644s7, long j10, boolean z10) {
        Intent intentM8451g = m8451g();
        if (!z10) {
            intentM8451g.putExtra("RESPONSE_CODE", 6);
            intentM8451g.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
            C1748d.a aVarM8604d = C1748d.m8604d();
            aVarM8604d.m8614d(6);
            aVarM8604d.m8612b("An internal error occurred.");
            C1748d c1748dM8611a = aVarM8604d.m8611a();
            int i10 = C12044h1.f42603a;
            intentM8451g.putExtra("FAILURE_LOGGING_PAYLOAD", C12044h1.m44858b(enumC2644s7, 2, c1748dM8611a, null, EnumC2721z7.BROADCAST_ACTION_UNSPECIFIED).m11331b());
        } else if (m8448d() && this.f6587g.m8676a() != null) {
            C1748d c1748dM8676a = this.f6587g.m8676a();
            intentM8451g.putExtra("RESPONSE_CODE", c1748dM8676a.m8610c());
            intentM8451g.putExtra("DEBUG_MESSAGE", c1748dM8676a.m8608a());
        } else if (!m8448d() || this.f6587g.m8678c()) {
            intentM8451g.putExtra("RESPONSE_CODE", 6);
            intentM8451g.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
            C1748d.a aVarM8604d2 = C1748d.m8604d();
            aVarM8604d2.m8614d(6);
            aVarM8604d2.m8612b("An internal error occurred.");
            C1748d c1748dM8611a2 = aVarM8604d2.m8611a();
            int i11 = C12044h1.f42603a;
            intentM8451g.putExtra("FAILURE_LOGGING_PAYLOAD", C12044h1.m44858b(enumC2644s7, 2, c1748dM8611a2, null, EnumC2721z7.BROADCAST_ACTION_UNSPECIFIED).m11331b());
        } else {
            intentM8451g.putExtra("RESPONSE_CODE", 3);
            intentM8451g.putExtra("DEBUG_MESSAGE", "Play Store is blocked.");
            C1748d.a aVarM8604d3 = C1748d.m8604d();
            aVarM8604d3.m8614d(3);
            aVarM8604d3.m8612b("Play Store is blocked.");
            C1748d c1748dM8611a3 = aVarM8604d3.m8611a();
            EnumC2644s7 enumC2644s8 = EnumC2644s7.PLAY_STORE_APP_BLOCKED;
            int i12 = C12044h1.f42603a;
            intentM8451g.putExtra("FAILURE_LOGGING_PAYLOAD", C12044h1.m44858b(enumC2644s8, 2, c1748dM8611a3, null, EnumC2721z7.BROADCAST_ACTION_UNSPECIFIED).m11331b());
        }
        intentM8451g.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentM8451g.putExtra("billingClientTransactionId", j10);
        intentM8451g.putExtra("wasServiceAutoReconnected", this.f6586f);
        return intentM8451g;
    }

    /* JADX INFO: renamed from: g */
    public final Intent m8451g() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0037 A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:5:0x001d, B:28:0x0067, B:21:0x0031, B:23:0x0037, B:25:0x005e, B:24:0x004b), top: B:30:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004b A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:5:0x001d, B:28:0x0067, B:21:0x0031, B:23:0x0037, B:25:0x005e, B:24:0x004b), top: B:30:0x0001 }] */
    /* JADX INFO: renamed from: h */
    public final synchronized void m8452h() throws Throwable {
        ProxyBillingActivity proxyBillingActivity;
        try {
            try {
                this.f6587g = new C1754j(this.f6588h);
                IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION");
                intentFilter.addAction("com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION");
                proxyBillingActivity = this;
                try {
                    C7975b.m33016n(proxyBillingActivity, this.f6587g, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, 2);
                } catch (NoSuchMethodError e10) {
                    e = e10;
                    proxyBillingActivity.f6587g = null;
                    if (e instanceof NoSuchMethodError) {
                        InterfaceC12048i1 interfaceC12048i1 = proxyBillingActivity.f6588h;
                        C2459b9 c2459b9M11397B = C2492e9.m11397B();
                        c2459b9M11397B.m11322o(2);
                        interfaceC12048i1.mo44869d((C2492e9) c2459b9M11397B.m11645i());
                    } else {
                        InterfaceC12048i1 interfaceC12048i2 = proxyBillingActivity.f6588h;
                        C2459b9 c2459b9M11397B2 = C2492e9.m11397B();
                        c2459b9M11397B2.m11322o(1);
                        interfaceC12048i2.mo44869d((C2492e9) c2459b9M11397B2.m11645i());
                    }
                    C2571m0.m11566n("ProxyBillingActivity", "Failed to register receiver.", e);
                } catch (RuntimeException e11) {
                    e = e11;
                    proxyBillingActivity.f6587g = null;
                    if (e instanceof NoSuchMethodError) {
                        InterfaceC12048i1 interfaceC12048i3 = proxyBillingActivity.f6588h;
                        C2459b9 c2459b9M11397B3 = C2492e9.m11397B();
                        c2459b9M11397B3.m11322o(2);
                        interfaceC12048i3.mo44869d((C2492e9) c2459b9M11397B3.m11645i());
                    } else {
                        InterfaceC12048i1 interfaceC12048i4 = proxyBillingActivity.f6588h;
                        C2459b9 c2459b9M11397B4 = C2492e9.m11397B();
                        c2459b9M11397B4.m11322o(1);
                        interfaceC12048i4.mo44869d((C2492e9) c2459b9M11397B4.m11645i());
                    }
                    C2571m0.m11566n("ProxyBillingActivity", "Failed to register receiver.", e);
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (NoSuchMethodError e12) {
            e = e12;
            proxyBillingActivity = this;
            proxyBillingActivity.f6587g = null;
            if (e instanceof NoSuchMethodError) {
                InterfaceC12048i1 interfaceC12048i5 = proxyBillingActivity.f6588h;
                C2459b9 c2459b9M11397B5 = C2492e9.m11397B();
                c2459b9M11397B5.m11322o(2);
                interfaceC12048i5.mo44869d((C2492e9) c2459b9M11397B5.m11645i());
            } else {
                InterfaceC12048i1 interfaceC12048i6 = proxyBillingActivity.f6588h;
                C2459b9 c2459b9M11397B6 = C2492e9.m11397B();
                c2459b9M11397B6.m11322o(1);
                interfaceC12048i6.mo44869d((C2492e9) c2459b9M11397B6.m11645i());
            }
            C2571m0.m11566n("ProxyBillingActivity", "Failed to register receiver.", e);
        } catch (RuntimeException e13) {
            e = e13;
            proxyBillingActivity = this;
            proxyBillingActivity.f6587g = null;
            if (e instanceof NoSuchMethodError) {
                InterfaceC12048i1 interfaceC12048i7 = proxyBillingActivity.f6588h;
                C2459b9 c2459b9M11397B7 = C2492e9.m11397B();
                c2459b9M11397B7.m11322o(2);
                interfaceC12048i7.mo44869d((C2492e9) c2459b9M11397B7.m11645i());
            } else {
                InterfaceC12048i1 interfaceC12048i8 = proxyBillingActivity.f6588h;
                C2459b9 c2459b9M11397B8 = C2492e9.m11397B();
                c2459b9M11397B8.m11322o(1);
                interfaceC12048i8.mo44869d((C2492e9) c2459b9M11397B8.m11645i());
            }
            C2571m0.m11566n("ProxyBillingActivity", "Failed to register receiver.", e);
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
        int iM8610c;
        int i12;
        String string;
        Intent intentM8451g;
        boolean z11;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 100) {
            if (intent == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            iM8610c = C2571m0.m11560h(intent, "ProxyBillingActivity").m8610c();
            i12 = -1;
            if (i11 != -1) {
                C2571m0.m11565m("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + iM8610c);
                i12 = i11;
            } else if (iM8610c != 0) {
                i11 = -1;
                C2571m0.m11565m("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + iM8610c);
                i12 = i11;
            }
            if (true != z10) {
                C2571m0.m11565m("ProxyBillingActivity", "Got null data with resultCode " + i12 + "!");
            } else if (intent.getExtras() == null) {
                C2571m0.m11565m("ProxyBillingActivity", "Got null bundle!");
            }
            if (m8447c(i12, intent)) {
                EnumC2644s7 enumC2644s7M8445a = m8445a(i12, intent);
                long j10 = this.f6585e;
                if (intent == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                intentM8451g = m8450f(enumC2644s7M8445a, j10, z11);
            } else {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    intentM8451g = m8449e(string);
                    intentM8451g.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                } else {
                    intentM8451g = m8451g();
                    intentM8451g.putExtras(intent.getExtras());
                    intentM8451g.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentM8451g.putExtra("billingClientTransactionId", this.f6585e);
                intentM8451g.putExtra("wasServiceAutoReconnected", this.f6586f);
            }
            if (i10 == 110) {
                intentM8451g.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentM8451g);
        } else if (i10 == 110) {
            if (intent == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            iM8610c = C2571m0.m11560h(intent, "ProxyBillingActivity").m8610c();
            i12 = -1;
            if (i11 != -1) {
                C2571m0.m11565m("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + iM8610c);
                i12 = i11;
            } else if (iM8610c != 0) {
                i11 = -1;
                C2571m0.m11565m("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + iM8610c);
                i12 = i11;
            }
            if (true != z10) {
                C2571m0.m11565m("ProxyBillingActivity", "Got null data with resultCode " + i12 + "!");
            } else if (intent.getExtras() == null) {
                C2571m0.m11565m("ProxyBillingActivity", "Got null bundle!");
            }
            if (m8447c(i12, intent)) {
                EnumC2644s7 enumC2644s7M8445a2 = m8445a(i12, intent);
                long j11 = this.f6585e;
                if (intent == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                intentM8451g = m8450f(enumC2644s7M8445a2, j11, z11);
            } else {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    intentM8451g = m8449e(string);
                    intentM8451g.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                } else {
                    intentM8451g = m8451g();
                    intentM8451g.putExtras(intent.getExtras());
                    intentM8451g.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentM8451g.putExtra("billingClientTransactionId", this.f6585e);
                intentM8451g.putExtra("wasServiceAutoReconnected", this.f6586f);
            }
            if (i10 == 110) {
                intentM8451g.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentM8451g);
        } else if (i10 == 101) {
            int iM11553a = C2571m0.m11553a(intent, "ProxyBillingActivity");
            ResultReceiver resultReceiver = this.f6581a;
            if (resultReceiver != null) {
                resultReceiver.send(iM11553a, intent == null ? null : intent.getExtras());
            }
        } else {
            C2571m0.m11565m("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i10 + "; skipping...");
        }
        this.f6582b = false;
        if (m8448d()) {
            this.f6587g.m8677b();
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
        if (!m8446b(bundle)) {
            try {
                i10 = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e10) {
                C2571m0.m11566n("ProxyBillingActivity", "Failed to get package info for current package.", e10);
                i10 = -1;
            }
            if (this.f6588h == null) {
                Context applicationContext = getApplicationContext();
                C2491e8 c2491e8M11459L = C2524h8.m11459L();
                c2491e8M11459L.m11393v(getPackageName());
                c2491e8M11459L.m11385E(C11809a.f41567a);
                c2491e8M11459L.m11388p(i10);
                c2491e8M11459L.m11387o(Build.VERSION.SDK_INT);
                c2491e8M11459L.m11392t(912213584L);
                this.f6588h = new C12060m1(applicationContext, (C2524h8) c2491e8M11459L.m11645i());
            }
            m8452h();
        }
        if (bundle != null) {
            C2571m0.m11564l("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f6582b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f6581a = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f6583c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f6584d = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.f6585e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f6586f = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        C2571m0.m11564l("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f6584d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f6583c = true;
                this.f6584d = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f6581a = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f6584d = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.f6585e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f6586f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.f6582b = true;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 36) {
                if (i11 >= 34) {
                    bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
                } else {
                    bundle2 = null;
                }
                startIntentSenderForResult(pendingIntent.getIntentSender(), this.f6584d, new Intent(), 0, 0, 0, bundle2);
            }
            bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(3).toBundle();
            bundle2 = bundle3;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f6584d, new Intent(), 0, 0, 0, bundle2);
        } catch (IntentSender.SendIntentException e11) {
            C2571m0.m11566n("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e11);
            ResultReceiver resultReceiver = this.f6581a;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentM8450f = m8450f(EnumC2644s7.INTENT_SENDER_EXCEPTION, this.f6585e, false);
                if (this.f6583c) {
                    intentM8450f.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentM8450f);
            }
            this.f6582b = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        C1748d c1748dM8676a;
        super.onDestroy();
        if (m8448d()) {
            c1748dM8676a = this.f6587g.m8676a();
            try {
                unregisterReceiver(this.f6587g);
            } catch (RuntimeException e10) {
                C2571m0.m11566n("ProxyBillingActivity", "Failed to unregister receiver.", e10);
            }
        } else {
            c1748dM8676a = null;
        }
        if (isFinishing() && this.f6582b) {
            Intent intentM8451g = m8451g();
            if (c1748dM8676a != null) {
                intentM8451g.putExtra("RESPONSE_CODE", c1748dM8676a.m8610c());
                intentM8451g.putExtra("DEBUG_MESSAGE", c1748dM8676a.m8608a());
            } else {
                intentM8451g.putExtra("RESPONSE_CODE", 1);
                intentM8451g.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            }
            if (this.f6583c) {
                intentM8451g.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i10 = this.f6584d;
            if (i10 == 110 || i10 == 100) {
                intentM8451g.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentM8451g.putExtra("billingClientTransactionId", this.f6585e);
            }
            sendBroadcast(intentM8451g);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f6581a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f6582b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f6583c);
        bundle.putInt("activity_code", this.f6584d);
        bundle.putLong("billingClientTransactionId", this.f6585e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f6586f);
    }
}
