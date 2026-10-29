package com.roblox.client;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.roblox.client.ossearch.C3209a;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.C3272a;
import com.roblox.client.startup.MainGameActivity;
import com.roblox.client.startup.StartedForEnum;
import com.roblox.protocols.externalidentity.ExternalIdentityHandler;
import com.roblox.universalapp.linking.JNIBaseUrlProtocol;
import com.roblox.universalapp.linking.JNIWebLoginProtocol;
import km.C7635f;
import p151gk.C6124q;
import sg.C11370y;
import th.C11659h;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityProtocolLaunch extends AbstractActivityC3152a {
    /* JADX INFO: renamed from: j2 */
    public static boolean m14801j2(String str) {
        for (String str2 : C11659h.m43403a().mo43676m2().split(",")) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i2 */
    public final boolean m14802i2(String str) {
        if (str == null) {
            return false;
        }
        Uri uri = Uri.parse(str);
        return "single-sign-on".equals(uri.getHost()) && "/login".equals(uri.getPath()) && "Apple".equals(uri.getQueryParameter("idp_name"));
    }

    /* JADX INFO: renamed from: k2 */
    public void m14803k2() {
        startActivity(C11370y.m42581h().m42589i(this));
    }

    @Override // com.roblox.client.AbstractActivityC3152a, com.roblox.client.AbstractActivityC3160b, p093e4.ActivityC4831q, p088e.ActivityC4722p, p235k2.ActivityC7415g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (C11659h.m43403a().mo43586a1() && data != null && "AndroidSearch".equals(data.getQueryParameter("joinAttemptOrigin"))) {
            C3209a.m15302c(data.toString());
        }
        boolean zM15705m = C3272a.m15705m();
        String dataString = intent.getDataString();
        String str = zM15705m ? "android_warm_intent" : "android_cold_intent";
        if (C11659h.m43403a().mo43610d1()) {
            C7635f.m31524D().m31540h(dataString, str, false);
        } else {
            C7635f.m31524D().m31538f(dataString, str, false);
        }
        if (zM15705m && C11659h.m43403a().mo43503O1() && m14802i2(dataString) && ExternalIdentityHandler.onAppleRedirectReceived(dataString)) {
            ExternalIdentityHandler.bringHostToFront(this);
            finish();
            return;
        }
        if (C11659h.m43403a().mo43490M1()) {
            C6124q.m27063h("rbx.externallaunch", "GameActivity = ON. Start new GameActivity to handle intent...");
            C7635f.m31524D().m31528A(intent);
            if (!zM15705m) {
                C11370y.m42581h().m42585d().m45218h(intent);
            }
            startActivity(MainGameActivity.m15571h2(this, StartedForEnum.PROTOCOL_LAUNCH));
            finish();
            return;
        }
        if (zM15705m) {
            C6124q.m27063h("rbx.externallaunch", "onCreate() activity on existing stack - checking to launch data");
            m14803k2();
            C7635f.m31524D().m31543k(dataString);
            if (!C11659h.m43403a().mo43699p4() && (!C11659h.m43403a().mo43753x2() || !m14801j2(dataString))) {
                C11370y.m42581h().m42587f().m15273g(true);
            }
        } else {
            C6124q.m27063h("rbx.externallaunch", "onCreate() activity is root - starting splash (regular start-up flow)");
            if (JNIBaseUrlProtocol.maybeHandleColdStartProtocolLaunch(dataString)) {
                C6124q.m27057b("rbx.externallaunch", "Base URL is switched for cold launch, cancel flag fetching for prefetch() and restart it.");
                C3272a.m15718z(getApplicationContext());
            }
            JNIWebLoginProtocol.maybeHandleColdStartProtocolLaunch(dataString);
            startActivity(ActivitySplash.m15531o2(this, StartedForEnum.PROTOCOL_LAUNCH));
            C7635f.m31524D().m31528A(intent);
            C11370y.m42581h().m42585d().m45218h(intent);
        }
        finish();
    }
}
