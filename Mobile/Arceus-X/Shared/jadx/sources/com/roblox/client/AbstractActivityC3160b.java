package com.roblox.client;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.DialogInterfaceC0408a;
import androidx.p616lifecycle.AbstractC0966l;
import com.roblox.engine.jni.locale.NativeLocaleJavaInterface;
import com.roblox.engine.jni.reporter.SessionReporterJavaInterface;
import fk.C5654c;
import java.util.Locale;
import ni.C9479a;
import ni.C9480b;
import p015ak.C0305k0;
import p104ei.C5125c;
import p151gk.C6124q;
import p151gk.C6130w;
import p203j.ActivityC6992b;
import p293mi.C8525a;
import p383qi.C10583b;
import p383qi.C10587f;
import p517wh.EnumC12462t0;
import sg.C11295a1;
import sg.C11347q0;
import sh.C11384i;
import th.C11659h;

/* JADX INFO: renamed from: com.roblox.client.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractActivityC3160b extends ActivityC6992b {

    /* JADX INFO: renamed from: G */
    public static int f11680G;

    /* JADX INFO: renamed from: H */
    public static int f11681H;

    /* JADX INFO: renamed from: E */
    public C8525a f11682E = new C8525a();

    /* JADX INFO: renamed from: F */
    public boolean f11683F;

    /* JADX INFO: renamed from: E1 */
    public void mo14960E1() {
        if (C11295a1.m42459k0()) {
            return;
        }
        if (C11295a1.m42467o0()) {
            setRequestedOrientation(13);
        } else {
            setRequestedOrientation(C11295a1.m42469p0() ? 7 : 6);
        }
    }

    /* JADX INFO: renamed from: F1 */
    public void m14961F1(String str, String str2) {
        m14964I1(str, str2, null);
    }

    /* JADX INFO: renamed from: G1 */
    public C8525a m14962G1() {
        return this.f11682E;
    }

    /* JADX INFO: renamed from: H1 */
    public final void m14963H1(String str, DialogInterface.OnDismissListener onDismissListener) {
        if (isDestroyed()) {
            return;
        }
        DialogInterfaceC0408a.a aVar = new DialogInterfaceC0408a.a(this);
        aVar.m1526j(C11347q0.f40013u, null);
        aVar.m1524h(str);
        if (onDismissListener != null) {
            aVar.m1527k(onDismissListener);
        }
        aVar.m1517a().show();
    }

    /* JADX INFO: renamed from: I1 */
    public final void m14964I1(String str, String str2, DialogInterface.OnDismissListener onDismissListener) {
        if (isDestroyed()) {
            return;
        }
        DialogInterfaceC0408a.a aVar = new DialogInterfaceC0408a.a(this);
        aVar.m1526j(C11347q0.f40013u, null);
        aVar.m1533q(str2);
        aVar.m1524h(str);
        if (onDismissListener != null) {
            aVar.m1527k(onDismissListener);
        }
        aVar.m1517a().show();
    }

    /* JADX INFO: renamed from: J1 */
    public boolean m14965J1() {
        return this.f11683F;
    }

    /* JADX INFO: renamed from: K1 */
    public void m14966K1(int i10, int i11) {
        Toast.makeText(this, i10, i11).show();
    }

    /* JADX INFO: renamed from: L1 */
    public void m14967L1(String str, int i10) {
        Toast.makeText(this, str, i10).show();
    }

    /* JADX INFO: renamed from: U */
    public void m14968U(int i10) {
        m14963H1(getString(i10), null);
    }

    /* JADX INFO: renamed from: W */
    public void m14969W(String str) {
        m14963H1(str, null);
    }

    @Override // p203j.ActivityC6992b, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        C10587f c10587fM40571d = C10583b.m40569f().m40571d(context);
        C10587f c10587fM40576j = C10583b.m40569f().m40576j();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(" -> Locale: base = ");
        sb2.append(configuration.locale);
        sb2.append("; default = ");
        sb2.append(c10587fM40571d.m40606c());
        sb2.append("; user = ");
        sb2.append(c10587fM40576j != null ? c10587fM40576j.m40606c() : "null");
        C6124q.m27057b("rbx.locale", sb2.toString());
        Locale localeM40568b = C10583b.m40568b(c10587fM40576j != null ? c10587fM40576j.m40606c() : c10587fM40571d.m40606c());
        configuration.setLocale(localeM40568b);
        configuration.setLayoutDirection(localeM40568b);
        super.attachBaseContext(context.createConfigurationContext(configuration));
        C11384i.m42699b(this);
    }

    @Override // android.app.Activity
    public boolean isDestroyed() {
        return AbstractC0966l.b.DESTROYED == mo4656a().getState();
    }

    @Override // p093e4.ActivityC4831q, p088e.ActivityC4722p, p235k2.ActivityC7415g, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (C0305k0.m1257B()) {
            C6124q.m27063h("RobloxBaseActivity", "onCreate: App was previously destroyed due to process death");
            super.onCreate(bundle);
            finish();
        } else {
            if (C11659h.m43403a().mo43490M1()) {
                C6124q.m27063h("RobloxBaseActivity", "GameActivity = ON. Return!");
                super.onCreate(bundle);
                return;
            }
            C11295a1.m42417R0(this);
            C5125c.m23921e(this);
            super.onCreate(bundle);
            int i10 = f11680G;
            f11680G = i10 + 1;
            if (i10 == 0) {
                NativeLocaleJavaInterface.setImplementation(new C9479a());
                SessionReporterJavaInterface.setImplementation(new C9480b(this));
            }
            C5654c.m25669c().m25681m();
        }
    }

    @Override // p203j.ActivityC6992b, p093e4.ActivityC4831q, android.app.Activity
    public void onDestroy() {
        if (!C0305k0.m1257B()) {
            super.onDestroy();
            f11680G--;
            return;
        }
        C6124q.m27063h("RobloxBaseActivity", "onDestroy: App was previously destroyed due to process death");
        super.onDestroy();
        if (C11659h.m43403a().mo43600c()) {
            C5125c.m23917a();
        }
        C6130w.m27101c(this);
    }

    @Override // p088e.ActivityC4722p, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // p093e4.ActivityC4831q, android.app.Activity
    public void onPause() {
        this.f11683F = false;
        C5125c.m23922f(getCacheDir(), C11295a1.f39655s.getString("webview_url", ""));
        super.onPause();
    }

    @Override // p093e4.ActivityC4831q, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f11683F = true;
        C5125c.m23923g();
    }

    @Override // p088e.ActivityC4722p, p235k2.ActivityC7415g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("RESTART_AFTER_PROCESS_DEATH", true);
        super.onSaveInstanceState(bundle);
    }

    @Override // p203j.ActivityC6992b, p093e4.ActivityC4831q, android.app.Activity
    public void onStart() {
        super.onStart();
        f11681H++;
    }

    @Override // p203j.ActivityC6992b, p093e4.ActivityC4831q, android.app.Activity
    public void onStop() {
        C5125c.m23924h();
        super.onStop();
        f11681H--;
    }

    @Override // p088e.ActivityC4722p, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        C6124q.m27066k("RobloxBaseActivity", "onTrimMemory: in " + getClass().getSimpleName() + ", level = " + i10);
        super.onTrimMemory(i10);
        RobloxApplication.m14835g("RobloxBaseActivity", EnumC12462t0.EXPERIENCE, i10);
    }
}
