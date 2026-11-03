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
import com.roblox.client.components.RobloxToolbar;
import com.roblox.engine.jni.NativeGLInterface;
import dv.j;
import ek.q;
import oh.g;
import oh.k;
import org.greenrobot.eventbus.ThreadMode;
import rg.a1;
import rg.e2;
import rg.g0;
import rg.l0;
import rg.m0;
import rg.n0;
import rg.q0;
import rg.y;
import rh.h;
import ti.e;
import ug.c0;

/* JADX INFO: loaded from: classes2.dex */
public class RobloxWebActivity extends com.roblox.client.a implements e.InterfaceC0581e {
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
            mk.a aVar = new mk.a(false);
            NativeGLInterface.nativeBroadcastEventWithNamespace(aVar.f24878a, aVar.b, aVar.f24879c);
        }

        @Override // androidx.p000lifecycle.f
        public void onDestroy(@NonNull s sVar) {
            q.b("RobloxActivity", "onFragmentDestroyed");
            mk.a aVar = new mk.a(true);
            NativeGLInterface.nativeBroadcastEventWithNamespace(aVar.f24878a, aVar.b, aVar.f24879c);
        }
    }

    @Override // ti.e.InterfaceC0581e
    public void R(int i10, Bundle bundle) {
        if (i10 == 2) {
            q.h("RobloxActivity", "(RobloxWebActivity) handleNotification() Logout event...");
            Toast.makeText(this, q0.f30538h, 0).show();
            if (uj.c.a()) {
                ti.b.q();
            }
            X1(ti.b.g(bundle));
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

    @Override // com.roblox.client.a, bk.e.b
    public void a0(ml.a aVar) {
        ((RobloxToolbar) this.U).a0(aVar);
        super.a0(aVar);
    }

    public final void i2(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("FEATURE_EXTRA", str);
        intent.putExtra("PATH_EXTRA", str2);
        setResult(-1, intent);
        finish();
    }

    public final void j2(String str) {
        androidx.fragment.app.c cVarN0 = l1().n0(c.class.getName());
        if (cVarN0 instanceof c) {
            ((c) cVarN0).q3(str);
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
        androidx.fragment.app.c cVarN0 = l1().n0(c.class.getName());
        if (cVarN0 instanceof c) {
            ((c) cVarN0).e();
        }
    }

    public c0.b m2() {
        return c0.b.WEB_ACTIVITY;
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
    public void onCloseOverlayEvent(oh.d dVar) {
        finish();
    }

    @Override // com.roblox.client.a, com.roblox.client.b, e4.q, e.p, k2.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra;
        boolean booleanExtra;
        boolean booleanExtra2;
        String string;
        androidx.fragment.app.c cVar;
        super.onCreate(bundle);
        setContentView(n0.f30485f);
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
        c0.w(m2(), stringExtra);
        this.U = (Toolbar) findViewById(m0.f30450l0);
        Bundle bundle2 = new Bundle();
        if (booleanExtra2) {
            cVar = y.h().b();
            bundle2.putString("TITLE_STRING", string);
            bundle2.putBoolean("HAS_PARENT", true);
            bundle2.putBoolean("HIDE_ACCESSORY_BUTTONS", intent.getBooleanExtra("HIDE_ACCESSORY_BUTTONS_EXTRA", false));
            bundle2.putString("SEARCH_PARAMS", intent.getStringExtra("SEARCH_PARAMS"));
            bundle2.putBoolean("ENABLE_WEB_VIEW_SERVICE", h.a().e1());
            this.U.setVisibility(8);
            this.S = 0;
            this.T = 0;
        } else {
            cVar = new c();
            Toolbar toolbar = this.U;
            if (string == null) {
                string = getString(q0.f30586x);
            }
            toolbar.setTitle(string);
            Toolbar toolbar2 = this.U;
            if (toolbar2 instanceof RobloxToolbar) {
                ((RobloxToolbar) toolbar2).setIconDelegate(new RobloxToolbar.c());
            } else {
                toolbar2.setNavigationIcon(l0.f30407h);
            }
            this.U.setNavigationOnClickListener(new a());
            if (NativeGLInterface.nativeUserGameSettingsGetReducedMotion()) {
                this.S = 0;
                this.T = 0;
            } else {
                this.S = R.anim.fade_in;
                this.T = g0.f30367a;
            }
        }
        if (booleanExtra) {
            cVar.a().a(this.V);
        }
        androidx.fragment.app.h hVarR = l1().r();
        bundle2.putString("DEFAULT_URL", stringExtra);
        bundle2.putBoolean("USING_LOGIN_WEB_URL", intent.getBooleanExtra("USING_LOGIN_WEB_URL", false));
        cVar.O1(bundle2);
        hVarR.b(m0.f30464s0, cVar, c.class.getName());
        hVarR.g();
    }

    @j(threadMode = ThreadMode.MAIN)
    public void onNavigateToConversationEvent(oh.f fVar) {
        q.b("RobloxActivity", "RWF.onNavigateToConversationEvent() " + fVar.f27891a + " " + fVar.b);
        k2(fVar.f27891a, fVar.b);
    }

    @j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(g gVar) {
        if ("ABUSE_REPORT_TAG".equals(gVar.f27892a)) {
            rg.q.d(this, gVar.b, false);
        } else if ("FRIEND_FINDER_TAG".equals(gVar.f27892a) || "UNIVERSAL_FRIENDS_TAG".equals(gVar.f27892a)) {
            rg.q.g(this, a1.R(), getString(q0.C), "{\"searchType\":\"Players\"}");
        } else {
            i2(gVar.f27892a, gVar.b);
        }
    }

    @j
    public void onNavigateToLuaEvent(c.h hVar) {
        finish();
    }

    @j
    public void onPushNotificationRegistrationFailedEvent(oh.h hVar) {
        if (hVar.a().equals("PushNotificationRegistrationFailed")) {
            Toast.makeText(this, getString(q0.V0), 0).show();
            l2();
        }
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onStart() {
        super.onStart();
        e.c().b(this);
        dv.c.d().n(this);
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onStop() {
        e.c().g(this);
        dv.c.d().p(this);
        super.onStop();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    @j(threadMode = ThreadMode.MAIN)
    public void onWebSearchEvent(k kVar) {
        String strJ0;
        q.h("RobloxActivity", "RWA.onWebSearchEvent() " + kVar.b);
        int i10 = kVar.f27899a;
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
