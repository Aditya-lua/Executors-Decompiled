package com.roblox.client;

import ak.k0;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;
import androidx.p000lifecycle.l;
import com.roblox.engine.jni.locale.NativeLocaleJavaInterface;
import com.roblox.engine.jni.reporter.SessionReporterJavaInterface;
import gk.p;
import gk.v;
import java.util.Locale;
import qi.f;
import sg.a1;
import sg.q0;
import sh.i;
import th.h;
import wh.t0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends j.b {
    public static int G;
    public static int H;
    public mi.a E = new mi.a();
    public boolean F;

    public void E1() {
        if (a1.k0()) {
            return;
        }
        if (a1.o0()) {
            setRequestedOrientation(13);
        } else {
            setRequestedOrientation(a1.p0() ? 7 : 6);
        }
    }

    public void F1(String str, String str2) {
        I1(str, str2, null);
    }

    public mi.a G1() {
        return this.E;
    }

    public final void H1(String str, DialogInterface.OnDismissListener onDismissListener) {
        if (isDestroyed()) {
            return;
        }
        androidx.appcompat.app.a.C0013a c0013a = new androidx.appcompat.app.a.C0013a(this);
        c0013a.j(q0.f30972u, null);
        c0013a.h(str);
        if (onDismissListener != null) {
            c0013a.k(onDismissListener);
        }
        c0013a.a().show();
    }

    public final void I1(String str, String str2, DialogInterface.OnDismissListener onDismissListener) {
        if (isDestroyed()) {
            return;
        }
        androidx.appcompat.app.a.C0013a c0013a = new androidx.appcompat.app.a.C0013a(this);
        c0013a.j(q0.f30972u, null);
        c0013a.q(str2);
        c0013a.h(str);
        if (onDismissListener != null) {
            c0013a.k(onDismissListener);
        }
        c0013a.a().show();
    }

    public boolean J1() {
        return this.F;
    }

    public void K1(int i10, int i11) {
        Toast.makeText(this, i10, i11).show();
    }

    public void L1(String str, int i10) {
        Toast.makeText(this, str, i10).show();
    }

    public void U(int i10) {
        H1(getString(i10), null);
    }

    public void W(String str) {
        H1(str, null);
    }

    @Override // j.b, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        f fVarD = qi.b.f().d(context);
        f fVarJ = qi.b.f().j();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(" -> Locale: base = ");
        sb2.append(configuration.locale);
        sb2.append("; default = ");
        sb2.append(fVarD.c());
        sb2.append("; user = ");
        sb2.append(fVarJ != null ? fVarJ.c() : "null");
        p.b("rbx.locale", sb2.toString());
        Locale localeB = qi.b.b(fVarJ != null ? fVarJ.c() : fVarD.c());
        configuration.setLocale(localeB);
        configuration.setLayoutDirection(localeB);
        super.attachBaseContext(context.createConfigurationContext(configuration));
        i.b(this);
    }

    @Override // android.app.Activity
    public boolean isDestroyed() {
        return l.b.DESTROYED == a().getState();
    }

    @Override // e4.q, e.p, k2.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (k0.B()) {
            p.h("RobloxBaseActivity", "onCreate: App was previously destroyed due to process death");
            super.onCreate(bundle);
            finish();
        } else {
            if (h.a().G1()) {
                p.h("RobloxBaseActivity", "GameActivity = ON. Return!");
                super.onCreate(bundle);
                return;
            }
            a1.R0(this);
            ei.c.e(this);
            super.onCreate(bundle);
            int i10 = G;
            G = i10 + 1;
            if (i10 == 0) {
                NativeLocaleJavaInterface.setImplementation(new ni.a());
                SessionReporterJavaInterface.setImplementation(new ni.b(this));
            }
            fk.c.c().m();
        }
    }

    @Override // j.b, e4.q, android.app.Activity
    public void onDestroy() {
        if (!k0.B()) {
            super.onDestroy();
            G--;
            return;
        }
        p.h("RobloxBaseActivity", "onDestroy: App was previously destroyed due to process death");
        super.onDestroy();
        if (h.a().c()) {
            ei.c.a();
        }
        v.c(this);
    }

    @Override // e.p, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // e4.q, android.app.Activity
    public void onPause() {
        this.F = false;
        ei.c.f(getCacheDir(), a1.f30731s.getString("webview_url", ""));
        super.onPause();
    }

    @Override // e4.q, android.app.Activity
    public void onResume() {
        super.onResume();
        this.F = true;
        ei.c.g();
    }

    @Override // e.p, k2.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("RESTART_AFTER_PROCESS_DEATH", true);
        super.onSaveInstanceState(bundle);
    }

    @Override // j.b, e4.q, android.app.Activity
    public void onStart() {
        super.onStart();
        H++;
    }

    @Override // j.b, e4.q, android.app.Activity
    public void onStop() {
        ei.c.h();
        super.onStop();
        H--;
    }

    @Override // e.p, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        p.k("RobloxBaseActivity", "onTrimMemory: in " + getClass().getSimpleName() + ", level = " + i10);
        super.onTrimMemory(i10);
        RobloxApplication.g("RobloxBaseActivity", t0.EXPERIENCE, i10);
    }
}
