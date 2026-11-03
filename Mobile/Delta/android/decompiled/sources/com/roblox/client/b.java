package com.roblox.client;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;
import androidx.p000lifecycle.l;
import com.roblox.engine.jni.locale.NativeLocaleJavaInterface;
import com.roblox.engine.jni.reporter.SessionReporterJavaInterface;
import ek.q;
import ek.w;
import java.util.Locale;
import oi.f;
import qh.i;
import rg.a1;
import rg.q0;
import rh.h;
import uh.u0;
import yj.k0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends j.b {
    public static int G;
    public static int H;
    public ki.a E = new ki.a();
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

    public ki.a G1() {
        return this.E;
    }

    public final void H1(String str, DialogInterface.OnDismissListener onDismissListener) {
        if (isDestroyed()) {
            return;
        }
        androidx.appcompat.app.a.C0009a c0009a = new androidx.appcompat.app.a.C0009a(this);
        c0009a.j(q0.f30577u, null);
        c0009a.h(str);
        if (onDismissListener != null) {
            c0009a.k(onDismissListener);
        }
        c0009a.a().show();
    }

    public final void I1(String str, String str2, DialogInterface.OnDismissListener onDismissListener) {
        if (isDestroyed()) {
            return;
        }
        androidx.appcompat.app.a.C0009a c0009a = new androidx.appcompat.app.a.C0009a(this);
        c0009a.j(q0.f30577u, null);
        c0009a.q(str2);
        c0009a.h(str);
        if (onDismissListener != null) {
            c0009a.k(onDismissListener);
        }
        c0009a.a().show();
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

    public void T(int i10) {
        H1(getString(i10), null);
    }

    public void V(String str) {
        H1(str, null);
    }

    @Override // j.b, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        f fVarD = oi.b.f().d(context);
        f fVarJ = oi.b.f().j();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(" -> Locale: base = ");
        sb2.append(configuration.locale);
        sb2.append("; default = ");
        sb2.append(fVarD.c());
        sb2.append("; user = ");
        sb2.append(fVarJ != null ? fVarJ.c() : "null");
        q.b("rbx.locale", sb2.toString());
        Locale localeB = oi.b.b(fVarJ != null ? fVarJ.c() : fVarD.c());
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
            q.h("RobloxBaseActivity", "onCreate: App was previously destroyed due to process death");
            super.onCreate(bundle);
            finish();
        } else {
            if (h.a().Q1()) {
                q.h("RobloxBaseActivity", "GameActivity = ON. Return!");
                super.onCreate(bundle);
                return;
            }
            a1.S0(this);
            ci.c.e(this);
            super.onCreate(bundle);
            int i10 = G;
            G = i10 + 1;
            if (i10 == 0) {
                NativeLocaleJavaInterface.setImplementation(new li.a());
                SessionReporterJavaInterface.setImplementation(new li.b(this));
            }
            dk.c.c().m();
        }
    }

    @Override // j.b, e4.q, android.app.Activity
    public void onDestroy() {
        if (!k0.B()) {
            super.onDestroy();
            G--;
            return;
        }
        q.h("RobloxBaseActivity", "onDestroy: App was previously destroyed due to process death");
        super.onDestroy();
        if (h.a().c()) {
            ci.c.a();
        }
        w.c(this);
    }

    @Override // e.p, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // e4.q, android.app.Activity
    public void onPause() {
        this.F = false;
        ci.c.f(getCacheDir(), a1.f30332s.getString("webview_url", ""));
        super.onPause();
    }

    @Override // e4.q, android.app.Activity
    public void onResume() {
        super.onResume();
        this.F = true;
        ci.c.g();
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
        ci.c.h();
        super.onStop();
        H--;
    }

    @Override // e.p, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        q.k("RobloxBaseActivity", "onTrimMemory: in " + getClass().getSimpleName() + ", level = " + i10);
        super.onTrimMemory(i10);
        RobloxApplication.g("RobloxBaseActivity", u0.EXPERIENCE, i10);
    }
}
