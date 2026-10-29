package com.roblox.client.game;

import android.text.TextUtils;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import gk.p;
import org.json.JSONException;
import org.json.JSONObject;
import sg.a1;
import sg.q0;
import wh.k;
import wh.w0;

/* JADX INFO: loaded from: classes2.dex */
public class a extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9080a = "rbx.game.callback";
    public final InterfaceC0139a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f9081c;

    /* JADX INFO: renamed from: com.roblox.client.game.a$a, reason: collision with other inner class name */
    public interface InterfaceC0139a {
        void f(boolean z10);

        void g(int i10);

        void h(long j10, String str, String str2);

        void i(String str, String str2, String str3);

        void j(long j10, String str, String str2);

        void k(long j10, String str, String str2);

        void l(long j10, String str, String str2, String str3);

        void m(long j10);

        void n(long j10, String str);

        void q(int i10);
    }

    public a(InterfaceC0139a interfaceC0139a, w0 w0Var) {
        this.b = interfaceC0139a;
        this.f9081c = w0Var;
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void a(int i10) {
        p.h("rbx.game.callback", "exitGameWithError: errorID = " + i10);
        this.b.q(v(i10));
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void b(long j10) {
        p.h("rbx.game.callback", "gameLoadedCallback() " + j10);
        this.b.m(j10);
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
            str3 = "";
        } else {
            str3 = " data:" + str2;
        }
        sb2.append(str3);
        p.h("rbx.game.callback", sb2.toString());
        if ("OPEN_CUSTOM_WEBVIEW".equals(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String strOptString = jSONObject.optString("url");
                if (strOptString.isEmpty()) {
                    p.k("rbx.game.callback", "URL must not be empty onNavigateToFeatureEvent OPEN_CUSTOM_WEBVIEW");
                    return;
                }
                String strOptString2 = jSONObject.optString(Title.type);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("searchParams");
                this.b.i(strOptString, strOptString2, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null);
            } catch (JSONException unused) {
                p.k("rbx.game.callback", "Exception parsing data onNavigateToFeatureEvent OPEN_CUSTOM_WEBVIEW");
            }
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void j(long j10, String str) {
        this.b.n(j10, str);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void k(long j10, String str, String str2) {
        this.b.j(j10, str, str2);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void l(long j10, String str, String str2) {
        this.b.h(j10, str, str2);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void m(long j10, String str, String str2) {
        this.b.k(j10, str, str2);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void n(long j10, String str, String str2, String str3) {
        this.b.l(j10, str, str2, str3);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void p(int i10) {
        if (a1.q0()) {
            p.b("rbx.game.orientation", "screenOrientationChanged: ignoring screen orientation change request on Quest");
            return;
        }
        if (i10 == 0) {
            p.b("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_REVERSE_LANDSCAPE");
            this.b.g(8);
            return;
        }
        if (i10 == 1) {
            p.b("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_LANDSCAPE");
            this.b.g(0);
            return;
        }
        if (i10 == 2) {
            p.b("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_SENSOR_LANDSCAPE");
            this.b.g(6);
            return;
        }
        if (i10 == 3) {
            p.b("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_SENSOR_PORTRAIT");
            this.b.g(7);
        } else if (i10 == 4) {
            p.b("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_USER");
            this.b.g(2);
        } else {
            p.b("rbx.game.orientation", "screenOrientationChanged: newOrientation =" + i10);
        }
    }

    @Override // wh.k
    public w0 r() {
        return this.f9081c;
    }

    public final int v(int i10) {
        if (i10 == 3) {
            return q0.f30964r0;
        }
        if (i10 == 4) {
            return q0.f30967s0;
        }
        if (i10 == 5) {
            return q0.f30970t0;
        }
        if (i10 == 6) {
            return q0.f30973u0;
        }
        switch (i10) {
            case 10:
                return q0.f30985y0;
            case 11:
                return q0.f30979w0;
            case 12:
                return q0.f30976v0;
            default:
                p.k("rbx.game.callback", "(Game failed to start) Unexpected errorId=[" + i10 + "].");
                return q0.f30982x0;
        }
    }
}
