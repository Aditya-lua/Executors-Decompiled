package com.roblox.client;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import bh.y;
import bi.h;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.MainGameActivity;
import com.roblox.client.startup.StartedForEnum;
import com.roblox.protocols.externalidentity.ExternalIdentityHandler;
import com.roblox.universalapp.linking.JNIBaseUrlProtocol;
import com.roblox.universalapp.linking.JNIWebLoginProtocol;
import ok.q;
import ym.g;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityProtocolLaunch extends a {
    public static boolean j2(String str) {
        for (String str2 : h.a().s2().split(",")) {
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

    @Override // com.roblox.client.a, com.roblox.client.b, f4.v, e.p, k2.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data != null && "AndroidSearch".equals(data.getQueryParameter("joinAttemptOrigin"))) {
            com.roblox.client.ossearch.a.c(data.toString());
        }
        boolean zM = com.roblox.client.startup.a.m();
        String dataString = intent.getDataString();
        String str = zM ? "android_warm_intent" : "android_cold_intent";
        if (h.a().g1()) {
            g.G().j(dataString, str, false);
        } else {
            g.G().h(dataString, str, false);
        }
        if (zM && h.a().S1() && i2(dataString) && ExternalIdentityHandler.onAppleRedirectReceived(dataString)) {
            ExternalIdentityHandler.bringHostToFront(this);
            finish();
            return;
        }
        if (h.a().Q1()) {
            q.h("rbx.externallaunch", "GameActivity = ON. Start new GameActivity to handle intent...");
            g.G().D(intent);
            if (!zM) {
                y.h().d().h(intent);
            }
            startActivity(MainGameActivity.i2(this, StartedForEnum.PROTOCOL_LAUNCH));
            finish();
            return;
        }
        if (zM) {
            q.h("rbx.externallaunch", "onCreate() activity on existing stack - checking to launch data");
            k2();
            g.G().m(dataString);
            if (!h.a().F2() || !j2(dataString)) {
                y.h().f().g(true);
            }
        } else {
            q.h("rbx.externallaunch", "onCreate() activity is root - starting splash (regular start-up flow)");
            if (JNIBaseUrlProtocol.maybeHandleColdStartProtocolLaunch(dataString)) {
                q.b("rbx.externallaunch", "Base URL is switched for cold launch, cancel flag fetching for prefetch() and restart it.");
                com.roblox.client.startup.a.z(getApplicationContext());
            }
            JNIWebLoginProtocol.maybeHandleColdStartProtocolLaunch(dataString);
            startActivity(ActivitySplash.o2(this, StartedForEnum.PROTOCOL_LAUNCH));
            g.G().D(intent);
            y.h().d().h(intent);
        }
        finish();
    }
}
