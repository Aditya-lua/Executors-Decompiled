package com.roblox.client;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.p000lifecycle.f;
import androidx.p000lifecycle.s;
import bh.a1;
import bh.e2;
import bh.g0;
import bh.l0;
import bh.m0;
import bh.n0;
import bh.q0;
import bh.y;
import com.roblox.client.components.RobloxToolbar;
import com.roblox.engine.jni.NativeGLInterface;
import dj.e;
import eh.v0;
import f4.t0;
import mw.j;
import ok.q;
import org.greenrobot.eventbus.ThreadMode;
import yh.g;
import yh.h;
import yh.k;

/* JADX INFO: loaded from: classes2.dex */
public class RobloxWebActivity extends com.roblox.client.a implements e.InterfaceC0225e {
    public int S;
    public int T;
    public Toolbar U;
    public b V = new b();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RobloxWebActivity.this.finish();
            RobloxWebActivity robloxWebActivity = RobloxWebActivity.this;
            robloxWebActivity.overridePendingTransition(robloxWebActivity.S, robloxWebActivity.T);
        }
    }

    public static class b implements f {
        @Override // androidx.p000lifecycle.f
        public void onCreate(@NonNull s sVar) {
            q.b("RobloxActivity", "onFragmentCreated");
            wk.a aVar = new wk.a(false);
            NativeGLInterface.nativeBroadcastEventWithNamespace(aVar.f35884a, aVar.b, aVar.f35885c);
        }

        @Override // androidx.p000lifecycle.f
        public void onDestroy(@NonNull s sVar) {
            q.b("RobloxActivity", "onFragmentDestroyed");
            wk.a aVar = new wk.a(true);
            NativeGLInterface.nativeBroadcastEventWithNamespace(aVar.f35884a, aVar.b, aVar.f35885c);
        }
    }

    @Override // dj.e.InterfaceC0225e
    public void R(int i10, Bundle bundle) {
        if (i10 == 2) {
            q.h("RobloxActivity", "(RobloxWebActivity) handleNotification() Logout event...");
            Toast.makeText(this, q0.f4240h, 0).show();
            if (ek.c.a()) {
                dj.b.p();
            }
            X1(dj.b.g(bundle));
            return;
        }
        if (i10 != 101) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("FEATURE_EXTRA", "LAUNCH_GAME");
        intent.putExtra("game_init_params", bundle.getBundle("game_init_params"));
        setResult(-1, intent);
        finish();
    }

    @Override // com.roblox.client.a, lk.e.b
    public void g0(cm.a aVar) {
        ((RobloxToolbar) this.U).g0(aVar);
        super.g0(aVar);
    }

    public final void i2(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("FEATURE_EXTRA", str);
        intent.putExtra("PATH_EXTRA", str2);
        setResult(-1, intent);
        finish();
    }

    public final void j2(String str) {
        f4.q qVarN0 = l1().n0(c.class.getName());
        if (qVarN0 instanceof c) {
            ((c) qVarN0).q3(str);
        }
    }

    public void k2(long j10, long j11) {
        Intent intent = new Intent();
        intent.putExtra("FEATURE_EXTRA", "CHAT_TAG");
        if (j10 != -1) {
            intent.putExtra("CONVERSATION_ID_EXTRA", j10);
        }
        if (j11 != -1) {
            intent.putExtra("USER_ID_EXTRA", j11);
        }
        if (j11 != -1 || j10 != -1) {
            setResult(-1, intent);
        }
        finish();
    }

    public final void l2() {
        f4.q qVarN0 = l1().n0(c.class.getName());
        if (qVarN0 instanceof c) {
            ((c) qVarN0).e();
        }
    }

    public v0.b m2() {
        return v0.b.WEB_ACTIVITY;
    }

    @Override // e.p, android.app.Activity
    public void onBackPressed() {
        c cVar = (c) l1().n0(c.class.getName());
        if (cVar == null || !cVar.e3()) {
            super.onBackPressed();
            overridePendingTransition(this.S, this.T);
        }
    }

    @j(threadMode = ThreadMode.MAIN)
    public void onCloseOverlayEvent(yh.d dVar) {
        finish();
    }

    @Override // com.roblox.client.a, com.roblox.client.b, f4.v, e.p, k2.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra;
        boolean booleanExtra;
        boolean booleanExtra2;
        String string;
        f4.q cVar;
        super.onCreate(bundle);
        setContentView(n0.f4187f);
        Intent intent = getIntent();
        if (intent != null) {
            stringExtra = intent.getStringExtra("URL_EXTRA");
            string = intent.getStringExtra("TITLE_EXTRA");
            booleanExtra = intent.getBooleanExtra("SEND_DATA_MODEL_FOCUS_EVENTS_EXTRA", false);
            booleanExtra2 = intent.getBooleanExtra("USE_GENERIC_WEB_FRAG_EXTRA", false);
        } else {
            stringExtra = null;
            booleanExtra = false;
            booleanExtra2 = false;
            string = null;
        }
        if (stringExtra == null) {
            finish();
            return;
        }
        v0.w(m2(), stringExtra);
        this.U = (Toolbar) findViewById(m0.f4155n0);
        Bundle bundle2 = new Bundle();
        if (booleanExtra2) {
            cVar = y.h().b();
            bundle2.putString("TITLE_STRING", string);
            bundle2.putBoolean("HAS_PARENT", true);
            bundle2.putBoolean("HIDE_ACCESSORY_BUTTONS", intent.getBooleanExtra("HIDE_ACCESSORY_BUTTONS_EXTRA", false));
            bundle2.putString("SEARCH_PARAMS", intent.getStringExtra("SEARCH_PARAMS"));
            this.U.setVisibility(8);
            this.S = 0;
            this.T = 0;
        } else {
            cVar = new c();
            Toolbar toolbar = this.U;
            if (string == null) {
                string = getString(q0.f4288x);
            }
            toolbar.setTitle(string);
            Toolbar toolbar2 = this.U;
            if (toolbar2 instanceof RobloxToolbar) {
                ((RobloxToolbar) toolbar2).setIconDelegate(new RobloxToolbar.c());
            } else {
                toolbar2.setNavigationIcon(l0.f4108h);
            }
            this.U.setNavigationOnClickListener(new a());
            if (NativeGLInterface.nativeUserGameSettingsGetReducedMotion()) {
                this.S = 0;
                this.T = 0;
            } else {
                this.S = R.anim.fade_in;
                this.T = g0.f4070a;
            }
        }
        if (booleanExtra) {
            cVar.a().a(this.V);
        }
        t0 t0VarR = l1().r();
        bundle2.putString("DEFAULT_URL", stringExtra);
        bundle2.putBoolean("USING_LOGIN_WEB_URL", intent.getBooleanExtra("USING_LOGIN_WEB_URL", false));
        cVar.O1(bundle2);
        t0VarR.b(m0.f4167t0, cVar, c.class.getName());
        t0VarR.g();
    }

    @j(threadMode = ThreadMode.MAIN)
    public void onNavigateToConversationEvent(yh.f fVar) {
        q.b("RobloxActivity", "RWF.onNavigateToConversationEvent() " + fVar.f37865a + " " + fVar.b);
        k2(fVar.f37865a, fVar.b);
    }

    @j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(g gVar) {
        if ("ABUSE_REPORT_TAG".equals(gVar.f37866a)) {
            bh.q.d(this, gVar.b, false);
        } else if ("FRIEND_FINDER_TAG".equals(gVar.f37866a) || "UNIVERSAL_FRIENDS_TAG".equals(gVar.f37866a)) {
            bh.q.g(this, a1.R(), getString(q0.C), "{\"searchType\":\"Players\"}");
        } else {
            i2(gVar.f37866a, gVar.b);
        }
    }

    @j
    public void onNavigateToLuaEvent(c.h hVar) {
        finish();
    }

    @j
    public void onPushNotificationRegistrationFailedEvent(h hVar) {
        if (hVar.a().equals("PushNotificationRegistrationFailed")) {
            Toast.makeText(this, getString(q0.f4236f1), 0).show();
            l2();
        }
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, f4.v, android.app.Activity
    public void onStart() {
        super.onStart();
        e.c().b(this);
        mw.c.d().n(this);
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, f4.v, android.app.Activity
    public void onStop() {
        e.c().g(this);
        mw.c.d().p(this);
        super.onStop();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    @j(threadMode = ThreadMode.MAIN)
    public void onWebSearchEvent(k kVar) {
        String strJ0;
        q.h("RobloxActivity", "RWA.onWebSearchEvent() " + kVar.b);
        int i10 = kVar.f37873a;
        if (i10 == 1) {
            strJ0 = a1.J0(kVar.b);
        } else if (i10 == 2) {
            strJ0 = a1.H0(kVar.b);
        } else if (i10 == 3) {
            strJ0 = a1.G0(kVar.b);
        } else if (i10 != 4) {
            strJ0 = i10 != 5 ? null : a1.I0(kVar.b);
        } else {
            strJ0 = a1.J0(kVar.b);
        }
        if (strJ0 != null) {
            e2.h(this);
            j2(strJ0);
        }
    }
}
