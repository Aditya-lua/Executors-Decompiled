package com.roblox.client;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.MainGameActivity;
import com.roblox.client.startup.StartedForEnum;
import com.roblox.protocols.externalidentity.ExternalIdentityHandler;
import com.roblox.universalapp.linking.JNIBaseUrlProtocol;
import com.roblox.universalapp.linking.JNIWebLoginProtocol;
import gk.p;
import km.f;
import sg.y;
import th.h;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityProtocolLaunch extends a {
    public static boolean j2(String str) {
        for (String str2 : h.a().g2().split(",")) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean i2(String str) {
        if (str == null) {
            return false;
        }
        Uri uri = Uri.parse(str);
        return "single-sign-on".equals(uri.getHost()) && "/login".equals(uri.getPath()) && "Apple".equals(uri.getQueryParameter("idp_name"));
    }

    public void k2() {
        startActivity(y.h().i(this));
    }

    @Override // com.roblox.client.a, com.roblox.client.b, e4.q, e.p, k2.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (h.a().W0() && data != null && "AndroidSearch".equals(data.getQueryParameter("joinAttemptOrigin"))) {
            com.roblox.client.ossearch.a.c(data.toString());
        }
        boolean zM = com.roblox.client.startup.a.m();
        String dataString = intent.getDataString();
        f.v().q(dataString, zM ? "android_warm_intent" : "android_cold_intent", false);
        if (zM && h.a().I1() && i2(dataString) && ExternalIdentityHandler.onAppleRedirectReceived(dataString)) {
            ExternalIdentityHandler.bringHostToFront(this);
            finish();
            return;
        }
        if (h.a().G1()) {
            p.h("rbx.externallaunch", "GameActivity = ON. Start new GameActivity to handle intent...");
            f.v().s(intent);
            if (!zM) {
                y.h().d().h(intent);
            }
            startActivity(MainGameActivity.g2(this, StartedForEnum.PROTOCOL_LAUNCH));
            finish();
            return;
        }
        if (zM) {
            p.h("rbx.externallaunch", "onCreate() activity on existing stack - checking to launch data");
            k2();
            f.v().e(dataString);
            if (!h.a().k4() && (!h.a().s2() || !j2(dataString))) {
                y.h().f().g(true);
            }
        } else {
            p.h("rbx.externallaunch", "onCreate() activity is root - starting splash (regular start-up flow)");
            if (JNIBaseUrlProtocol.maybeHandleColdStartProtocolLaunch(dataString)) {
                p.b("rbx.externallaunch", "Base URL is switched for cold launch, cancel flag fetching for prefetch() and restart it.");
                com.roblox.client.startup.a.z(getApplicationContext());
            }
            JNIWebLoginProtocol.maybeHandleColdStartProtocolLaunch(dataString);
            startActivity(ActivitySplash.o2(this, StartedForEnum.PROTOCOL_LAUNCH));
            f.v().s(intent);
            y.h().d().h(intent);
        }
        finish();
    }
}
