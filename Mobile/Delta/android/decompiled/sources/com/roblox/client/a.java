package com.roblox.client;

import ak.k0;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.roblox.client.analytics.TelemetryFlushWorker;
import com.roblox.client.components.RobloxToolbar;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.engine.jni.NativeReportingInterface;
import com.roblox.engine.jni.memstorage.MemStorage;
import e.x;
import gk.p;
import gk.s;
import gk.w;
import gk.z;
import jj.r;
import qi.h;
import sg.a1;
import sg.e2;
import sg.j0;
import sg.q0;
import sg.t0;
import sg.y;
import vg.j;
import vg.m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends com.roblox.client.b implements dk.e.b {
    public static int R;
    public androidx.appcompat.app.a I;
    public androidx.appcompat.app.a J;
    public androidx.appcompat.app.a K;
    public ProgressDialog L;
    public boolean M = false;
    public mi.c N = Q1();
    public bh.a O = new bh.a();
    public Toolbar P;
    public dk.e Q;

    /* JADX INFO: renamed from: com.roblox.client.a$a, reason: collision with other inner class name */
    public class C0131a implements h.d {
        public C0131a() {
        }

        @Override // qi.h.d
        public void a(boolean z10) {
            if (!z10) {
                p.h("rbx.locale", "Retrieved locale same as current locale");
            } else {
                p.h("rbx.locale", "(OnAppResume) Recreating activity due to Locale change.");
                a.this.recreate();
            }
        }
    }

    public class b implements DialogInterface.OnDismissListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            a.this.I = null;
        }
    }

    public class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.roblox.client.d.e f8919a;
        public final /* synthetic */ Activity b;

        public c(com.roblox.client.d.e eVar, Activity activity, g gVar) {
            this.f8919a = eVar;
            this.b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            z.d(this.b);
            a.this.g2(true, null);
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d(g gVar) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    public class e implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.roblox.client.d.e f8922a;
        public final /* synthetic */ Activity b;

        public e(com.roblox.client.d.e eVar, Activity activity, g gVar) {
            this.f8922a = eVar;
            this.b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            z.d(this.b);
        }
    }

    public static /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8924a;

        static {
            int[] iArr = new int[ol.a.values().length];
            f8924a = iArr;
            try {
                iArr[ol.a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8924a[ol.a.CLASSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8924a[ol.a.DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface g {
    }

    public boolean N1() {
        boolean zJ = e2.j(this);
        boolean z10 = !zJ;
        if (!zJ) {
            e2();
        }
        return z10;
    }

    public void O1() {
        U1();
        if (this.J == null) {
            this.J = new androidx.appcompat.app.a.C0013a(this).p(q0.V).g(q0.R).d(false).a();
        }
        if (this.J.isShowing()) {
            return;
        }
        this.J.show();
    }

    public boolean P1() {
        return false;
    }

    public mi.c Q1() {
        return new mi.c();
    }

    public boolean R1() {
        return a1.U(this).getBoolean("ROBLOXCrash", false);
    }

    public final void S1(androidx.appcompat.app.a aVar) {
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        aVar.dismiss();
    }

    public void T1() {
        ProgressDialog progressDialog = this.L;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.L.dismiss();
        this.L = null;
    }

    public final void U1() {
        S1(this.I);
        this.I = null;
    }

    public final String V1() {
        return getString(q0.E);
    }

    public mi.c W1() {
        return this.N;
    }

    public void X1(vi.b.d dVar) {
        p.h("RobloxActivity", "navigateToPostLogoutUI: logoutType = " + dVar + ", foreground = " + J1());
        p.h("RobloxActivity", "navigateToPostLogoutUI: [New Startup] Launch Main activity...");
        startActivity(y.h().i(this));
        if (dVar != vi.b.d.LOGOUT_BY_USER_IN_LUA) {
            p.h("RobloxActivity", "navigateToPostLogoutUI: notify Lua about this 401 logout condition");
            MemStorage.fire("NativeShellEvent", "NETWORK_ERROR_401");
        }
    }

    public final void Y1() {
        super.setContentView(this.N.j(LayoutInflater.from(this), this));
    }

    public final void Z1(int i10) {
        Y1();
        LayoutInflater.from(this).inflate(i10, this.N.g());
    }

    public final void a2(View view, ViewGroup.LayoutParams layoutParams) {
        Y1();
        this.N.g().addView(view, layoutParams);
    }

    public final void b2(ol.a aVar) {
        boolean z10 = aVar != ol.a.LIGHT;
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
        getWindow().getDecorView().setSystemUiVisibility(z10 ? systemUiVisibility & (-8193) : systemUiVisibility | 8192);
        if (a1.k0()) {
            getWindow().setStatusBarColor(f.f8924a[aVar.ordinal()] != 1 ? getResources().getColor(j0.f30779h) : getResources().getColor(j0.f30786o));
        }
        getWindow().setNavigationBarColor(getResources().getColor(j0.f30776e));
    }

    public void c2() {
        View decorView = getWindow().getDecorView();
        if (th.h.a().E()) {
            x.a(this);
        } else {
            decorView.setSystemUiVisibility(1280);
        }
        this.E.e(decorView);
    }

    public void d2(Context context) {
        String string = getString(q0.f30957p);
        String string2 = getString(q0.f30960q);
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle(string);
        progressDialog.setMessage(string2);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        this.L = progressDialog;
        progressDialog.show();
    }

    public final void e2() {
        androidx.appcompat.app.a aVar = this.I;
        if (aVar == null) {
            androidx.appcompat.app.a aVarD = e2.d(this, getResources().getString(q0.S));
            this.I = aVarD;
            aVarD.setOnDismissListener(new b());
        } else if (aVar.isShowing()) {
            p.b("RobloxActivity", "A network-disconnected alert already exists. Do nothing.");
        } else {
            this.I.show();
        }
    }

    public void f2(boolean z10) {
        g2(z10, null);
    }

    public void g2(boolean z10, g gVar) {
        if (a1.q0()) {
            w.a(this, q0.X);
            if (z10) {
                finish();
                return;
            }
            return;
        }
        S1(this.I);
        S1(this.K);
        getPackageName();
        com.roblox.client.d.e eVarD = com.roblox.client.d.e().d();
        String string = s.j() ? getString(q0.f30945l) : getString(q0.f30951n, V1());
        if (z10) {
            S1(this.J);
            if (bh.a.a(getIntent())) {
                this.O.b(this, true, eVarD);
                return;
            }
            this.K = new androidx.appcompat.app.a.C0013a(this).p(q0.f30948m).h(string).m(q0.f30939j, new c(eVarD, this, gVar)).a();
        } else {
            this.K = new androidx.appcompat.app.a.C0013a(this).p(q0.f30948m).h(string).m(q0.f30939j, new e(eVarD, this, gVar)).i(q0.f30936i, new d(gVar)).a();
        }
        this.K.setCancelable(false);
        this.K.show();
    }

    public final void h2() {
        p.h("rbx.locale", "using new api on app resume. mIsAppResumedFromColdStart: " + this.M);
        new h().c(this, new C0131a());
    }

    @Override // e4.q, e.p, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        p.b("RobloxActivity", "onActivityResult: requestCode = " + i10);
        if (i10 != 20103) {
            super.onActivityResult(i10, i11, intent);
            return;
        }
        if (i11 != -1) {
            p.h("RobloxActivity", "Sharing dialog dismissed.");
            vi.g.b().q("Android-AppMain-GameShare-ChooserDismissed");
            return;
        }
        String packageName = intent.getComponent().getPackageName();
        p.h("RobloxActivity", "Sharing with=" + packageName + ".");
        startActivity(intent);
        t0.y(packageName);
        vi.g.b().q("Android-AppMain-GameShare-AppSelected");
    }

    @Override // com.roblox.client.b, e4.q, e.p, k2.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (k0.B()) {
            p.h("RobloxActivity", "onCreate: App was previously destroyed due to process death");
            super.onCreate(bundle);
            finish();
            return;
        }
        if (th.h.a().G1()) {
            p.h("RobloxActivity", "GameActivity = ON. Return!");
            super.onCreate(bundle);
            return;
        }
        vi.b.f().l(this);
        boolean z10 = this instanceof ActivitySplash;
        boolean zM = com.roblox.client.startup.a.m();
        if (!zM && !z10) {
            p.h("RobloxActivity", "onCreate ... settingsLoaded = false. Load from preferences!!!");
            com.roblox.client.startup.a.s(this);
        }
        qi.b.f().u(this);
        vi.e.c().d(this);
        super.onCreate(bundle);
        p.b("RobloxActivity", "activity onCreate, name = " + getClass().getSimpleName());
        E1();
        c2();
        if (!zM && !P1()) {
            p.h("RobloxActivity", "onCreate: no AppSettings in activity:" + getClass().getSimpleName() + ". Finish self!");
            finish();
        }
        this.M = true;
        dk.e eVar = new dk.e(this);
        this.Q = eVar;
        eVar.b(this);
    }

    @Override // com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onDestroy() {
        if (k0.B()) {
            p.h("RobloxActivity", "onCreate: App was previously destroyed due to process death");
            super.onDestroy();
        } else {
            super.onDestroy();
            U1();
            S1(this.J);
        }
    }

    @Override // com.roblox.client.b, e4.q, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.roblox.client.b, e4.q, android.app.Activity
    public void onResume() {
        super.onResume();
        r.k().s(this);
    }

    @Override // com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onStart() {
        super.onStart();
        if (nh.b.a() && a1.x0()) {
            p.k("RobloxActivity", "Alert: needs restart");
            O1();
        }
        int i10 = R;
        R = i10 + 1;
        if (i10 == 0) {
            vi.b.f().r(true);
            a1.U(this).edit().putBoolean("ROBLOXCrash", true).apply();
            if (!this.M) {
                h2();
            }
        }
        vi.g.b().i0();
        this.M = false;
    }

    @Override // com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onStop() {
        int i10 = R - 1;
        R = i10;
        if (i10 == 0) {
            vi.b.f().r(false);
            NativeReportingInterface.stopPushNotificationSession();
            a1.U(this).edit().remove("ROBLOXCrash").apply();
            p.h("RobloxActivity", "The Shell is in background.");
            j.q().s();
            j.q().r();
            m.i(false);
            if (th.h.a().w1()) {
                boolean zG2 = th.h.a().G2();
                boolean zF = th.h.a().f();
                if (zG2 || zF) {
                    TelemetryFlushWorker.d(this);
                }
            }
        }
        super.onStop();
    }

    @Override // j.b, e.p, android.app.Activity
    public void setContentView(int i10) {
        Z1(i10);
    }

    public void u(ol.a aVar) {
        int color;
        p.b("rbx.theme", getClass().getSimpleName() + ".onThemeChanged() " + aVar);
        Toolbar toolbar = this.P;
        if (toolbar instanceof RobloxToolbar) {
            ((RobloxToolbar) toolbar).u(aVar);
        }
        if (this.N != null) {
            int i10 = f.f8924a[aVar.ordinal()];
            if (i10 != 1) {
                color = i10 != 2 ? getResources().getColor(j0.f30779h) : getResources().getColor(j0.f30773a);
            } else {
                color = getResources().getColor(j0.f30786o);
            }
            this.N.l(color);
        }
        b2(aVar);
    }

    @Override // j.b, e.p, android.app.Activity
    public void setContentView(View view) {
        a2(view, null);
    }

    @Override // j.b, e.p, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a2(view, layoutParams);
    }
}
