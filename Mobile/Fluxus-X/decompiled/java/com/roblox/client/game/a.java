package com.roblox.client.game;

import android.text.TextUtils;
import bh.a1;
import bh.q0;
import bi.h;
import com.github.luben.zstd.BuildConfig;
import com.roblox.engine.jni.autovalue.NativePurchaseContext;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import ei.k;
import ei.x0;
import ik.s2;
import ok.q;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8969a = "rbx.game.callback";
    public final InterfaceC0145a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f8970c;

    /* JADX INFO: renamed from: com.roblox.client.game.a$a, reason: collision with other inner class name */
    public interface InterfaceC0145a {
        void a(long j10, String str, NativePurchaseContext nativePurchaseContext);

        void c(int i10);

        void d(long j10, String str, String str2);

        void f(boolean z10);

        void g(String str, String str2, String str3);

        void h(long j10, String str, String str2);

        void i(long j10, String str, String str2);

        void j(long j10, String str, String str2, String str3);

        default void k() {
        }

        void l(long j10);

        void m(long j10, String str);

        void n(int i10);
    }

    public a(InterfaceC0145a interfaceC0145a, x0 x0Var) {
        this.b = interfaceC0145a;
        this.f8970c = x0Var;
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void a(int i10) {
        q.h("rbx.game.callback", "exitGameWithError: errorID = " + i10);
        this.b.n(w(i10));
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void b(long j10) {
        q.h("rbx.game.callback", "gameLoadedCallback() " + j10);
        this.b.l(j10);
        com.roblox.client.startup.a.n();
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void e(String str) {
        this.b.f(true);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void f(String str, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onDataModelNotification() type:");
        sb2.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = BuildConfig.FLAVOR;
        } else {
            str3 = " data:" + str2;
        }
        sb2.append(str3);
        q.h("rbx.game.callback", sb2.toString());
        if (!"OPEN_CUSTOM_WEBVIEW".equals(str)) {
            if (h.a().E3() && "NATIVE_EXIT".equals(str) && s2.b()) {
                this.b.k();
                return;
            }
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String strOptString = jSONObject.optString("url");
            if (strOptString.isEmpty()) {
                q.k("rbx.game.callback", "URL must not be empty onNavigateToFeatureEvent OPEN_CUSTOM_WEBVIEW");
                return;
            }
            String strOptString2 = jSONObject.optString(Title.type);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("searchParams");
            this.b.g(strOptString, strOptString2, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null);
        } catch (JSONException unused) {
            q.k("rbx.game.callback", "Exception parsing data onNavigateToFeatureEvent OPEN_CUSTOM_WEBVIEW");
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void j(long j10, String str) {
        this.b.m(j10, str);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void k(long j10, String str, String str2) {
        this.b.h(j10, str, str2);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void l(long j10, String str, NativePurchaseContext nativePurchaseContext) {
        this.b.a(j10, str, nativePurchaseContext);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void m(long j10, String str, String str2) {
        this.b.d(j10, str, str2);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void n(long j10, String str, String str2) {
        this.b.i(j10, str, str2);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void o(long j10, String str, String str2, String str3) {
        this.b.j(j10, str, str2, str3);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void q(int i10) {
        if (a1.q0()) {
            q.b("rbx.game.orientation", "screenOrientationChanged: ignoring screen orientation change request on Quest");
            return;
        }
        if (i10 == 0) {
            q.b("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_REVERSE_LANDSCAPE");
            this.b.c(8);
            return;
        }
        if (i10 == 1) {
            q.b("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_LANDSCAPE");
            this.b.c(0);
            return;
        }
        if (i10 == 2) {
            q.b("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_SENSOR_LANDSCAPE");
            this.b.c(6);
            return;
        }
        if (i10 == 3) {
            q.b("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_SENSOR_PORTRAIT");
            this.b.c(7);
        } else if (i10 == 4) {
            q.b("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_USER");
            this.b.c(2);
        } else {
            q.b("rbx.game.orientation", "screenOrientationChanged: newOrientation =" + i10);
        }
    }

    @Override // ei.k
    public x0 s() {
        return this.f8970c;
    }

    public final int w(int i10) {
        if (i10 == 3) {
            return q0.B0;
        }
        if (i10 == 4) {
            return q0.C0;
        }
        if (i10 == 5) {
            return q0.D0;
        }
        if (i10 == 6) {
            return q0.E0;
        }
        switch (i10) {
            case 10:
                return q0.I0;
            case 11:
                return q0.G0;
            case 12:
                return q0.F0;
            default:
                q.k("rbx.game.callback", "(Game failed to start) Unexpected errorId=[" + i10 + "].");
                return q0.H0;
        }
    }
}
