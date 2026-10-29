package com.roblox.client.game;

import android.text.TextUtils;
import com.roblox.client.startup.C3272a;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import org.json.JSONException;
import org.json.JSONObject;
import p151gk.C6124q;
import p517wh.AbstractC12443k;
import p517wh.InterfaceC12468w0;
import sg.C11295a1;
import sg.C11347q0;

/* JADX INFO: renamed from: com.roblox.client.game.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3196a extends AbstractC12443k {

    /* JADX INFO: renamed from: a */
    public final String f11846a = "rbx.game.callback";

    /* JADX INFO: renamed from: b */
    public final a f11847b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC12468w0 f11848c;

    /* JADX INFO: renamed from: com.roblox.client.game.a$a */
    public interface a {
        /* JADX INFO: renamed from: f */
        void mo15197f(boolean z10);

        /* JADX INFO: renamed from: g */
        void mo15199g(int i10);

        /* JADX INFO: renamed from: h */
        void mo15201h(long j10, String str, String str2);

        /* JADX INFO: renamed from: i */
        void mo15203i(String str, String str2, String str3);

        /* JADX INFO: renamed from: j */
        void mo15205j(long j10, String str, String str2);

        /* JADX INFO: renamed from: k */
        void mo15207k(long j10, String str, String str2);

        /* JADX INFO: renamed from: l */
        void mo15208l(long j10, String str, String str2, String str3);

        /* JADX INFO: renamed from: m */
        void mo15210m(long j10);

        /* JADX INFO: renamed from: n */
        void mo15211n(long j10, String str);

        /* JADX INFO: renamed from: q */
        void mo15212q(int i10);
    }

    public C3196a(a aVar, InterfaceC12468w0 interfaceC12468w0) {
        this.f11847b = aVar;
        this.f11848c = interfaceC12468w0;
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: a */
    public void mo15217a(int i10) {
        C6124q.m27063h("rbx.game.callback", "exitGameWithError: errorID = " + i10);
        this.f11847b.mo15212q(m15228v(i10));
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: b */
    public void mo15218b(long j10) {
        C6124q.m27063h("rbx.game.callback", "gameLoadedCallback() " + j10);
        this.f11847b.mo15210m(j10);
        C3272a.m15706n();
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: e */
    public void mo15219e(String str) {
        this.f11847b.mo15197f(true);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: f */
    public void mo15220f(String str, String str2) {
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
        C6124q.m27063h("rbx.game.callback", sb2.toString());
        if ("OPEN_CUSTOM_WEBVIEW".equals(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String strOptString = jSONObject.optString("url");
                if (strOptString.isEmpty()) {
                    C6124q.m27066k("rbx.game.callback", "URL must not be empty onNavigateToFeatureEvent OPEN_CUSTOM_WEBVIEW");
                    return;
                }
                String strOptString2 = jSONObject.optString(Title.type);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("searchParams");
                this.f11847b.mo15203i(strOptString, strOptString2, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null);
            } catch (JSONException unused) {
                C6124q.m27066k("rbx.game.callback", "Exception parsing data onNavigateToFeatureEvent OPEN_CUSTOM_WEBVIEW");
            }
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: j */
    public void mo15221j(long j10, String str) {
        this.f11847b.mo15211n(j10, str);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: k */
    public void mo15222k(long j10, String str, String str2) {
        this.f11847b.mo15205j(j10, str, str2);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: l */
    public void mo15223l(long j10, String str, String str2) {
        this.f11847b.mo15201h(j10, str, str2);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: m */
    public void mo15224m(long j10, String str, String str2) {
        this.f11847b.mo15207k(j10, str, str2);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: n */
    public void mo15225n(long j10, String str, String str2, String str3) {
        this.f11847b.mo15208l(j10, str, str2, str3);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: p */
    public void mo15226p(int i10) {
        if (C11295a1.m42471q0()) {
            C6124q.m27057b("rbx.game.orientation", "screenOrientationChanged: ignoring screen orientation change request on Quest");
            return;
        }
        if (i10 == 0) {
            C6124q.m27057b("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_REVERSE_LANDSCAPE");
            this.f11847b.mo15199g(8);
            return;
        }
        if (i10 == 1) {
            C6124q.m27057b("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_LANDSCAPE");
            this.f11847b.mo15199g(0);
            return;
        }
        if (i10 == 2) {
            C6124q.m27057b("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_SENSOR_LANDSCAPE");
            this.f11847b.mo15199g(6);
            return;
        }
        if (i10 == 3) {
            C6124q.m27057b("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_SENSOR_PORTRAIT");
            this.f11847b.mo15199g(7);
        } else if (i10 == 4) {
            C6124q.m27057b("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_USER");
            this.f11847b.mo15199g(2);
        } else {
            C6124q.m27057b("rbx.game.orientation", "screenOrientationChanged: newOrientation =" + i10);
        }
    }

    @Override // p517wh.AbstractC12443k
    /* JADX INFO: renamed from: r */
    public InterfaceC12468w0 mo15227r() {
        return this.f11848c;
    }

    /* JADX INFO: renamed from: v */
    public final int m15228v(int i10) {
        if (i10 == 3) {
            return C11347q0.f40005r0;
        }
        if (i10 == 4) {
            return C11347q0.f40008s0;
        }
        if (i10 == 5) {
            return C11347q0.f40011t0;
        }
        if (i10 == 6) {
            return C11347q0.f40014u0;
        }
        switch (i10) {
            case 10:
                return C11347q0.f40026y0;
            case 11:
                return C11347q0.f40020w0;
            case 12:
                return C11347q0.f40017v0;
            default:
                C6124q.m27066k("rbx.game.callback", "(Game failed to start) Unexpected errorId=[" + i10 + "].");
                return C11347q0.f40023x0;
        }
    }
}
