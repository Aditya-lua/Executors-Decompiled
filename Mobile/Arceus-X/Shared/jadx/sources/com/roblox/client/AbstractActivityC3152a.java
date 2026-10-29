package com.roblox.client;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.DialogInterfaceC0408a;
import androidx.appcompat.widget.Toolbar;
import bh.C1438a;
import com.roblox.client.analytics.TelemetryFlushWorker;
import com.roblox.client.components.RobloxToolbar;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.C3272a;
import com.roblox.engine.jni.NativeReportingInterface;
import com.roblox.engine.jni.memstorage.MemStorage;
import dk.C4636e;
import p015ak.C0305k0;
import p088e.C4738x;
import p151gk.C6104a0;
import p151gk.C6124q;
import p151gk.C6127t;
import p151gk.C6131x;
import p222jj.C7193r;
import p293mi.C8527c;
import p308nh.C9476b;
import p337ol.EnumC9799a;
import p383qi.C10583b;
import p383qi.C10589h;
import sg.C11295a1;
import sg.C11312e2;
import sg.C11326j0;
import sg.C11347q0;
import sg.C11356t0;
import sg.C11370y;
import th.C11659h;
import vg.C12180j;
import vg.C12183m;
import vi.C12211b;
import vi.C12214e;
import vi.C12216g;

/* JADX INFO: renamed from: com.roblox.client.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractActivityC3152a extends AbstractActivityC3160b implements C4636e.b {

    /* JADX INFO: renamed from: R */
    public static int f11622R;

    /* JADX INFO: renamed from: I */
    public DialogInterfaceC0408a f11623I;

    /* JADX INFO: renamed from: J */
    public DialogInterfaceC0408a f11624J;

    /* JADX INFO: renamed from: K */
    public DialogInterfaceC0408a f11625K;

    /* JADX INFO: renamed from: L */
    public ProgressDialog f11626L;

    /* JADX INFO: renamed from: M */
    public boolean f11627M = false;

    /* JADX INFO: renamed from: N */
    public C8527c f11628N = mo14757Q1();

    /* JADX INFO: renamed from: O */
    public C1438a f11629O = new C1438a();

    /* JADX INFO: renamed from: P */
    public Toolbar f11630P;

    /* JADX INFO: renamed from: Q */
    public C4636e f11631Q;

    /* JADX INFO: renamed from: com.roblox.client.a$a */
    public class a implements C10589h.d {
        public a() {
        }

        @Override // p383qi.C10589h.d
        /* JADX INFO: renamed from: a */
        public void mo14863a(boolean z10) {
            if (!z10) {
                C6124q.m27063h("rbx.locale", "Retrieved locale same as current locale");
            } else {
                C6124q.m27063h("rbx.locale", "(OnAppResume) Recreating activity due to Locale change.");
                AbstractActivityC3152a.this.recreate();
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.a$b */
    public class b implements DialogInterface.OnDismissListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            AbstractActivityC3152a.this.f11623I = null;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.a$c */
    public class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3179d.e f11634a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Activity f11635b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c(C3179d.e eVar, Activity activity, g gVar) {
            this.f11634a = eVar;
            this.f11635b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C6104a0.m27004d(this.f11635b);
            AbstractActivityC3152a.this.m14861g2(true, null);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.a$d */
    public class d implements DialogInterface.OnClickListener {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public d(g gVar) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.a$e */
    public class e implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3179d.e f11638a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Activity f11639b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public e(C3179d.e eVar, Activity activity, g gVar) {
            this.f11638a = eVar;
            this.f11639b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C6104a0.m27004d(this.f11639b);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.a$f */
    public static /* synthetic */ class f {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11641a;

        static {
            int[] iArr = new int[EnumC9799a.values().length];
            f11641a = iArr;
            try {
                iArr[EnumC9799a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11641a[EnumC9799a.CLASSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11641a[EnumC9799a.DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.a$g */
    public interface g {
    }

    /* JADX INFO: renamed from: N1 */
    public boolean m14844N1() {
        boolean zM42506j = C11312e2.m42506j(this);
        boolean z10 = !zM42506j;
        if (!zM42506j) {
            m14859e2();
        }
        return z10;
    }

    /* JADX INFO: renamed from: O1 */
    public void m14845O1() {
        m14849U1();
        if (this.f11624J == null) {
            this.f11624J = new DialogInterfaceC0408a.a(this).m1532p(C11347q0.f39943V).m1523g(C11347q0.f39935R).m1520d(false).m1517a();
        }
        if (this.f11624J.isShowing()) {
            return;
        }
        this.f11624J.show();
    }

    /* JADX INFO: renamed from: P1 */
    public boolean mo14755P1() {
        return false;
    }

    /* JADX INFO: renamed from: Q1 */
    public C8527c mo14757Q1() {
        return new C8527c();
    }

    /* JADX INFO: renamed from: R1 */
    public boolean m14846R1() {
        return C11295a1.m42422U(this).getBoolean("ROBLOXCrash", false);
    }

    /* JADX INFO: renamed from: S1 */
    public final void m14847S1(DialogInterfaceC0408a dialogInterfaceC0408a) {
        if (dialogInterfaceC0408a == null || !dialogInterfaceC0408a.isShowing()) {
            return;
        }
        dialogInterfaceC0408a.dismiss();
    }

    /* JADX INFO: renamed from: T1 */
    public void m14848T1() {
        ProgressDialog progressDialog = this.f11626L;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f11626L.dismiss();
        this.f11626L = null;
    }

    /* JADX INFO: renamed from: U1 */
    public final void m14849U1() {
        m14847S1(this.f11623I);
        this.f11623I = null;
    }

    /* JADX INFO: renamed from: V1 */
    public final String m14850V1() {
        return getString(C11347q0.f39908E);
    }

    /* JADX INFO: renamed from: W1 */
    public C8527c m14851W1() {
        return this.f11628N;
    }

    /* JADX INFO: renamed from: X1 */
    public void m14852X1(C12211b.d dVar) {
        C6124q.m27063h("RobloxActivity", "navigateToPostLogoutUI: logoutType = " + dVar + ", foreground = " + m14965J1());
        C6124q.m27063h("RobloxActivity", "navigateToPostLogoutUI: [New Startup] Launch Main activity...");
        startActivity(C11370y.m42581h().m42589i(this));
        if (dVar != C12211b.d.LOGOUT_BY_USER_IN_LUA) {
            C6124q.m27063h("RobloxActivity", "navigateToPostLogoutUI: notify Lua about this 401 logout condition");
            MemStorage.fire("NativeShellEvent", "NETWORK_ERROR_401");
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m14853Y1() {
        super.setContentView(this.f11628N.m34403j(LayoutInflater.from(this), this));
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m14854Z1(int i10) {
        m14853Y1();
        LayoutInflater.from(this).inflate(i10, this.f11628N.m34400g());
    }

    /* JADX INFO: renamed from: a2 */
    public final void m14855a2(View view, ViewGroup.LayoutParams layoutParams) {
        m14853Y1();
        this.f11628N.m34400g().addView(view, layoutParams);
    }

    /* JADX INFO: renamed from: b2 */
    public final void m14856b2(EnumC9799a enumC9799a) {
        boolean z10 = enumC9799a != EnumC9799a.LIGHT;
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
        getWindow().getDecorView().setSystemUiVisibility(z10 ? systemUiVisibility & (-8193) : systemUiVisibility | 8192);
        if (C11295a1.m42459k0()) {
            getWindow().setStatusBarColor(f.f11641a[enumC9799a.ordinal()] != 1 ? getResources().getColor(C11326j0.f39717h) : getResources().getColor(C11326j0.f39724o));
        }
        getWindow().setNavigationBarColor(getResources().getColor(C11326j0.f39714e));
    }

    /* JADX INFO: renamed from: c2 */
    public void m14857c2() {
        View decorView = getWindow().getDecorView();
        if (C11659h.m43403a().mo43453H()) {
            C4738x.m23110a(this);
        } else {
            decorView.setSystemUiVisibility(1280);
        }
        this.f11682E.m34393e(decorView);
    }

    /* JADX INFO: renamed from: d2 */
    public void m14858d2(Context context) {
        String string = getString(C11347q0.f39998p);
        String string2 = getString(C11347q0.f40001q);
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle(string);
        progressDialog.setMessage(string2);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        this.f11626L = progressDialog;
        progressDialog.show();
    }

    /* JADX INFO: renamed from: e2 */
    public final void m14859e2() {
        DialogInterfaceC0408a dialogInterfaceC0408a = this.f11623I;
        if (dialogInterfaceC0408a == null) {
            DialogInterfaceC0408a dialogInterfaceC0408aM42500d = C11312e2.m42500d(this, getResources().getString(C11347q0.f39937S));
            this.f11623I = dialogInterfaceC0408aM42500d;
            dialogInterfaceC0408aM42500d.setOnDismissListener(new b());
        } else if (dialogInterfaceC0408a.isShowing()) {
            C6124q.m27057b("RobloxActivity", "A network-disconnected alert already exists. Do nothing.");
        } else {
            this.f11623I.show();
        }
    }

    /* JADX INFO: renamed from: f2 */
    public void m14860f2(boolean z10) {
        m14861g2(z10, null);
    }

    /* JADX INFO: renamed from: g2 */
    public void m14861g2(boolean z10, g gVar) {
        if (C11295a1.m42471q0()) {
            C6131x.m27102a(this, C11347q0.f39947X);
            if (z10) {
                finish();
                return;
            }
            return;
        }
        m14847S1(this.f11623I);
        m14847S1(this.f11625K);
        getPackageName();
        C3179d.e eVarM15088d = C3179d.m15085e().m15088d();
        String string = C6127t.m27094j() ? getString(C11347q0.f39986l) : getString(C11347q0.f39992n, m14850V1());
        if (z10) {
            m14847S1(this.f11624J);
            if (C1438a.m7436a(getIntent())) {
                this.f11629O.m7437b(this, true, eVarM15088d);
                return;
            }
            this.f11625K = new DialogInterfaceC0408a.a(this).m1532p(C11347q0.f39989m).m1524h(string).m1529m(C11347q0.f39980j, new c(eVarM15088d, this, gVar)).m1517a();
        } else {
            this.f11625K = new DialogInterfaceC0408a.a(this).m1532p(C11347q0.f39989m).m1524h(string).m1529m(C11347q0.f39980j, new e(eVarM15088d, this, gVar)).m1525i(C11347q0.f39977i, new d(gVar)).m1517a();
        }
        this.f11625K.setCancelable(false);
        DialogInterfaceC0408a dialogInterfaceC0408a = this.f11625K;
    }

    /* JADX INFO: renamed from: h2 */
    public final void m14862h2() {
        C6124q.m27063h("rbx.locale", "using new api on app resume. mIsAppResumedFromColdStart: " + this.f11627M);
        new C10589h().m40611c(this, new a());
    }

    @Override // p093e4.ActivityC4831q, p088e.ActivityC4722p, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        C6124q.m27057b("RobloxActivity", "onActivityResult: requestCode = " + i10);
        if (i10 != 20103) {
            super.onActivityResult(i10, i11, intent);
            return;
        }
        if (i11 != -1) {
            C6124q.m27063h("RobloxActivity", "Sharing dialog dismissed.");
            C12216g.m45228b().m45278q("Android-AppMain-GameShare-ChooserDismissed");
            return;
        }
        String packageName = intent.getComponent().getPackageName();
        C6124q.m27063h("RobloxActivity", "Sharing with=" + packageName + ".");
        startActivity(intent);
        C11356t0.m42555y(packageName);
        C12216g.m45228b().m45278q("Android-AppMain-GameShare-AppSelected");
    }

    @Override // com.roblox.client.AbstractActivityC3160b, p093e4.ActivityC4831q, p088e.ActivityC4722p, p235k2.ActivityC7415g, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (C0305k0.m1257B()) {
            C6124q.m27063h("RobloxActivity", "onCreate: App was previously destroyed due to process death");
            super.onCreate(bundle);
            finish();
            return;
        }
        if (C11659h.m43403a().mo43490M1()) {
            C6124q.m27063h("RobloxActivity", "GameActivity = ON. Return!");
            super.onCreate(bundle);
            return;
        }
        C12211b.m45200f().m45210l(this);
        boolean z10 = this instanceof ActivitySplash;
        boolean zM15705m = C3272a.m15705m();
        if (!zM15705m && !z10) {
            C6124q.m27063h("RobloxActivity", "onCreate ... settingsLoaded = false. Load from preferences!!!");
            C3272a.m15711s(this);
        }
        C10583b.m40569f().m40587u(this);
        C12214e.m45220c().m45222d(this);
        super.onCreate(bundle);
        C6124q.m27057b("RobloxActivity", "activity onCreate, name = " + getClass().getSimpleName());
        mo14960E1();
        m14857c2();
        if (!zM15705m && !mo14755P1()) {
            C6124q.m27063h("RobloxActivity", "onCreate: no AppSettings in activity:" + getClass().getSimpleName() + ". Finish self!");
            finish();
        }
        this.f11627M = true;
        C4636e c4636e = new C4636e(this);
        this.f11631Q = c4636e;
        c4636e.m22859b(this);
    }

    @Override // com.roblox.client.AbstractActivityC3160b, p203j.ActivityC6992b, p093e4.ActivityC4831q, android.app.Activity
    public void onDestroy() {
        if (C0305k0.m1257B()) {
            C6124q.m27063h("RobloxActivity", "onCreate: App was previously destroyed due to process death");
            super.onDestroy();
        } else {
            super.onDestroy();
            m14849U1();
            m14847S1(this.f11624J);
        }
    }

    @Override // com.roblox.client.AbstractActivityC3160b, p093e4.ActivityC4831q, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.roblox.client.AbstractActivityC3160b, p093e4.ActivityC4831q, android.app.Activity
    public void onResume() {
        super.onResume();
        C7193r.m30069k().m30088s(this);
    }

    @Override // com.roblox.client.AbstractActivityC3160b, p203j.ActivityC6992b, p093e4.ActivityC4831q, android.app.Activity
    public void onStart() {
        super.onStart();
        if (C9476b.m37333a() && C11295a1.m42485x0()) {
            C6124q.m27066k("RobloxActivity", "Alert: needs restart");
            m14845O1();
        }
        int i10 = f11622R;
        f11622R = i10 + 1;
        if (i10 == 0) {
            C12211b.m45200f().m45214r(true);
            C11295a1.m42422U(this).edit().putBoolean("ROBLOXCrash", true).apply();
            if (!this.f11627M) {
                m14862h2();
            }
        }
        C12216g.m45228b().m45270i0();
        this.f11627M = false;
    }

    @Override // com.roblox.client.AbstractActivityC3160b, p203j.ActivityC6992b, p093e4.ActivityC4831q, android.app.Activity
    public void onStop() {
        int i10 = f11622R - 1;
        f11622R = i10;
        if (i10 == 0) {
            C12211b.m45200f().m45214r(false);
            NativeReportingInterface.stopPushNotificationSession();
            C11295a1.m42422U(this).edit().remove("ROBLOXCrash").apply();
            C6124q.m27063h("RobloxActivity", "The Shell is in background.");
            C12180j.m45086q().m45102s();
            C12180j.m45086q().m45101r();
            C12183m.m45111i(false);
            if (C11659h.m43403a().mo43413B1()) {
                boolean zMo43491M2 = C11659h.m43403a().mo43491M2();
                boolean zMo43624f = C11659h.m43403a().mo43624f();
                if (zMo43491M2 || zMo43624f) {
                    TelemetryFlushWorker.m14866d(this);
                }
            }
        }
        super.onStop();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203j.ActivityC6992b, p088e.ActivityC4722p, android.app.Activity
    public void setContentView(int i10) {
        m14854Z1(i10);
    }

    /* JADX INFO: renamed from: u */
    public void mo14822u(EnumC9799a enumC9799a) {
        int color;
        C6124q.m27057b("rbx.theme", getClass().getSimpleName() + ".onThemeChanged() " + enumC9799a);
        Toolbar toolbar = this.f11630P;
        if (toolbar instanceof RobloxToolbar) {
            ((RobloxToolbar) toolbar).mo14822u(enumC9799a);
        }
        if (this.f11628N != null) {
            int i10 = f.f11641a[enumC9799a.ordinal()];
            if (i10 != 1) {
                color = i10 != 2 ? getResources().getColor(C11326j0.f39717h) : getResources().getColor(C11326j0.f39710a);
            } else {
                color = getResources().getColor(C11326j0.f39724o);
            }
            this.f11628N.m34405l(color);
        }
        m14856b2(enumC9799a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p203j.ActivityC6992b, p088e.ActivityC4722p, android.app.Activity
    public void setContentView(View view) {
        m14855a2(view, null);
    }

    @Override // p203j.ActivityC6992b, p088e.ActivityC4722p, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m14855a2(view, layoutParams);
    }
}
