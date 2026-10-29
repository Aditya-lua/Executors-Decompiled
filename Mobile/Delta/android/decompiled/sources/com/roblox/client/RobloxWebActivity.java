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
import fv.j;
import gk.p;
import org.greenrobot.eventbus.ThreadMode;
import ph.g;
import ph.k;
import sg.a1;
import sg.e2;
import sg.g0;
import sg.l0;
import sg.m0;
import sg.n0;
import sg.q;
import sg.q0;
import sg.y;
import th.h;
import vg.c0;
import vi.e;

/* JADX INFO: loaded from: classes2.dex */
public class RobloxWebActivity extends com.roblox.client.a implements e.InterfaceC0602e {
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
            p.b("RobloxActivity", "onFragmentCreated");
            ok.a aVar = new ok.a(false);
            NativeGLInterface.nativeBroadcastEventWithNamespace(aVar.f27448a, aVar.b, aVar.f27449c);
        }

        @Override // androidx.p000lifecycle.f
        public void onDestroy(@NonNull s sVar) {
            p.b("RobloxActivity", "onFragmentDestroyed");
            ok.a aVar = new ok.a(true);
            NativeGLInterface.nativeBroadcastEventWithNamespace(aVar.f27448a, aVar.b, aVar.f27449c);
        }
    }

    @Override // vi.e.InterfaceC0602e
    public void S(int i10, Bundle bundle) {
        if (i10 == 2) {
            p.h("RobloxActivity", "(RobloxWebActivity) handleNotification() Logout event...");
            Toast.makeText(this, q0.f30933h, 0).show();
            if (wj.c.a()) {
                vi.b.q();
            }
            X1(vi.b.g(bundle));
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
    public void onCloseOverlayEvent(ph.d dVar) {
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
        setContentView(n0.f30880f);
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
        this.U = (Toolbar) findViewById(m0.f30845k0);
        Bundle bundle2 = new Bundle();
        if (booleanExtra2) {
            cVar = y.h().b();
            bundle2.putString("TITLE_STRING", string);
            bundle2.putBoolean("HAS_PARENT", true);
            bundle2.putBoolean("HIDE_ACCESSORY_BUTTONS", intent.getBooleanExtra("HIDE_ACCESSORY_BUTTONS_EXTRA", false));
            bundle2.putString("SEARCH_PARAMS", intent.getStringExtra("SEARCH_PARAMS"));
            bundle2.putBoolean("ENABLE_WEB_VIEW_SERVICE", h.a().X0());
            this.U.setVisibility(8);
            this.S = 0;
            this.T = 0;
        } else {
            cVar = new c();
            Toolbar toolbar = this.U;
            if (string == null) {
                string = getString(q0.f30981x);
            }
            toolbar.setTitle(string);
            Toolbar toolbar2 = this.U;
            if (toolbar2 instanceof RobloxToolbar) {
                ((RobloxToolbar) toolbar2).setIconDelegate(new RobloxToolbar.c());
            } else {
                toolbar2.setNavigationIcon(l0.f30804h);
            }
            this.U.setNavigationOnClickListener(new a());
            if (NativeGLInterface.nativeUserGameSettingsGetReducedMotion()) {
                this.S = 0;
                this.T = 0;
            } else {
                this.S = R.anim.fade_in;
                this.T = g0.f30764a;
            }
        }
        if (booleanExtra) {
            cVar.a().a(this.V);
        }
        androidx.fragment.app.h hVarR = l1().r();
        bundle2.putString("DEFAULT_URL", stringExtra);
        bundle2.putBoolean("USING_LOGIN_WEB_URL", intent.getBooleanExtra("USING_LOGIN_WEB_URL", false));
        cVar.O1(bundle2);
        hVarR.b(m0.f30859r0, cVar, c.class.getName());
        hVarR.g();
    }

    @j(threadMode = ThreadMode.MAIN)
    public void onNavigateToConversationEvent(ph.f fVar) {
        p.b("RobloxActivity", "RWF.onNavigateToConversationEvent() " + fVar.f28612a + " " + fVar.b);
        k2(fVar.f28612a, fVar.b);
    }

    @j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(g gVar) {
        if ("ABUSE_REPORT_TAG".equals(gVar.f28613a)) {
            q.d(this, gVar.b, false);
        } else if ("FRIEND_FINDER_TAG".equals(gVar.f28613a) || "UNIVERSAL_FRIENDS_TAG".equals(gVar.f28613a)) {
            q.g(this, a1.R(), getString(q0.C), "{\"searchType\":\"Players\"}");
        } else {
            i2(gVar.f28613a, gVar.b);
        }
    }

    @j
    public void onNavigateToLuaEvent(c.h hVar) {
        finish();
    }

    @j
    public void onPushNotificationRegistrationFailedEvent(ph.h hVar) {
        if (hVar.a().equals("PushNotificationRegistrationFailed")) {
            Toast.makeText(this, getString(q0.V0), 0).show();
            l2();
        }
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onStart() {
        super.onStart();
        e.c().b(this);
        fv.c.d().n(this);
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onStop() {
        e.c().g(this);
        fv.c.d().p(this);
        super.onStop();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    @j(threadMode = ThreadMode.MAIN)
    public void onWebSearchEvent(k kVar) {
        String strI0;
        p.h("RobloxActivity", "RWA.onWebSearchEvent() " + kVar.b);
        int i10 = kVar.f28620a;
        if (i10 == 1) {
            strI0 = a1.I0(kVar.b);
        } else if (i10 == 2) {
            strI0 = a1.G0(kVar.b);
        } else if (i10 == 3) {
            strI0 = a1.F0(kVar.b);
        } else if (i10 != 4) {
            strI0 = i10 != 5 ? null : a1.H0(kVar.b);
        } else {
            strI0 = a1.I0(kVar.b);
        }
        if (strI0 != null) {
            e2.h(this);
            j2(strI0);
        }
    }

    @Override // com.roblox.client.a, dk.e.b
    public void u(ol.a aVar) {
        ((RobloxToolbar) this.U).u(aVar);
        super.u(aVar);
    }
}
