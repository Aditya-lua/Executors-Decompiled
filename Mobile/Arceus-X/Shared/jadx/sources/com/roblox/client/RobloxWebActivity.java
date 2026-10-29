package com.roblox.client;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractC0934h;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.roblox.client.components.RobloxToolbar;
import com.roblox.engine.jni.NativeGLInterface;
import org.greenrobot.eventbus.ThreadMode;
import p138fv.C5840c;
import p138fv.InterfaceC5847j;
import p151gk.C6124q;
import p335ok.C9755a;
import p337ol.EnumC9799a;
import p519wj.C12478c;
import ph.C10255d;
import ph.C10257f;
import ph.C10258g;
import ph.C10259h;
import ph.C10262k;
import sg.C11295a1;
import sg.C11312e2;
import sg.C11317g0;
import sg.C11332l0;
import sg.C11335m0;
import sg.C11338n0;
import sg.C11346q;
import sg.C11347q0;
import sg.C11370y;
import th.C11659h;
import vg.C12173c0;
import vi.C12211b;
import vi.C12214e;

/* JADX INFO: loaded from: classes2.dex */
public class RobloxWebActivity extends AbstractActivityC3152a implements C12214e.e {

    /* JADX INFO: renamed from: S */
    public int f11617S;

    /* JADX INFO: renamed from: T */
    public int f11618T;

    /* JADX INFO: renamed from: U */
    public Toolbar f11619U;

    /* JADX INFO: renamed from: V */
    public C3151b f11620V = new C3151b();

    /* JADX INFO: renamed from: com.roblox.client.RobloxWebActivity$a */
    public class ViewOnClickListenerC3150a implements View.OnClickListener {
        public ViewOnClickListenerC3150a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RobloxWebActivity.this.finish();
            RobloxWebActivity robloxWebActivity = RobloxWebActivity.this;
            robloxWebActivity.overridePendingTransition(robloxWebActivity.f11617S, robloxWebActivity.f11618T);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.RobloxWebActivity$b */
    public static class C3151b implements InterfaceC0954f {
        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onCreate(@NonNull InterfaceC0980s interfaceC0980s) {
            C6124q.m27057b("RobloxActivity", "onFragmentCreated");
            C9755a c9755a = new C9755a(false);
            NativeGLInterface.nativeBroadcastEventWithNamespace(c9755a.f35514a, c9755a.f35515b, c9755a.f35516c);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onDestroy(@NonNull InterfaceC0980s interfaceC0980s) {
            C6124q.m27057b("RobloxActivity", "onFragmentDestroyed");
            C9755a c9755a = new C9755a(true);
            NativeGLInterface.nativeBroadcastEventWithNamespace(c9755a.f35514a, c9755a.f35515b, c9755a.f35516c);
        }
    }

    @Override // vi.C12214e.e
    /* JADX INFO: renamed from: S */
    public void mo1335S(int i10, Bundle bundle) {
        if (i10 == 2) {
            C6124q.m27063h("RobloxActivity", "(RobloxWebActivity) handleNotification() Logout event...");
            Toast.makeText(this, C11347q0.f39974h, 0).show();
            if (C12478c.m46740a()) {
                C12211b.m45203q();
            }
            m14852X1(C12211b.m45201g(bundle));
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

    /* JADX INFO: renamed from: i2 */
    public final void m14839i2(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("FEATURE_EXTRA", str);
        intent.putExtra("PATH_EXTRA", str2);
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: renamed from: j2 */
    public final void m14840j2(String str) {
        ComponentCallbacksC0929c componentCallbacksC0929cM4444n0 = m23360l1().m4444n0(C3161c.class.getName());
        if (componentCallbacksC0929cM4444n0 instanceof C3161c) {
            ((C3161c) componentCallbacksC0929cM4444n0).m15021q3(str);
        }
    }

    /* JADX INFO: renamed from: k2 */
    public void m14841k2(long j10, long j11) {
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

    /* JADX INFO: renamed from: l2 */
    public final void m14842l2() {
        ComponentCallbacksC0929c componentCallbacksC0929cM4444n0 = m23360l1().m4444n0(C3161c.class.getName());
        if (componentCallbacksC0929cM4444n0 instanceof C3161c) {
            ((C3161c) componentCallbacksC0929cM4444n0).mo6173e();
        }
    }

    /* JADX INFO: renamed from: m2 */
    public C12173c0.b mo14820m2() {
        return C12173c0.b.WEB_ACTIVITY;
    }

    @Override // p088e.ActivityC4722p, android.app.Activity
    public void onBackPressed() {
        C3161c c3161c = (C3161c) m23360l1().m4444n0(C3161c.class.getName());
        if (c3161c == null || !c3161c.mo15009e3()) {
            super.onBackPressed();
            overridePendingTransition(this.f11617S, this.f11618T);
        }
    }

    @InterfaceC5847j(threadMode = ThreadMode.MAIN)
    public void onCloseOverlayEvent(C10255d c10255d) {
        finish();
    }

    @Override // com.roblox.client.AbstractActivityC3152a, com.roblox.client.AbstractActivityC3160b, p093e4.ActivityC4831q, p088e.ActivityC4722p, p235k2.ActivityC7415g, android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra;
        boolean booleanExtra;
        boolean booleanExtra2;
        String string;
        ComponentCallbacksC0929c c3161c;
        super.onCreate(bundle);
        setContentView(C11338n0.f39859f);
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
        C12173c0.m45034w(mo14820m2(), stringExtra);
        this.f11619U = (Toolbar) findViewById(C11335m0.f39816k0);
        Bundle bundle2 = new Bundle();
        if (booleanExtra2) {
            c3161c = C11370y.m42581h().m42583b();
            bundle2.putString("TITLE_STRING", string);
            bundle2.putBoolean("HAS_PARENT", true);
            bundle2.putBoolean("HIDE_ACCESSORY_BUTTONS", intent.getBooleanExtra("HIDE_ACCESSORY_BUTTONS_EXTRA", false));
            bundle2.putString("SEARCH_PARAMS", intent.getStringExtra("SEARCH_PARAMS"));
            bundle2.putBoolean("ENABLE_WEB_VIEW_SERVICE", C11659h.m43403a().mo43594b1());
            this.f11619U.setVisibility(8);
            this.f11617S = 0;
            this.f11618T = 0;
        } else {
            c3161c = new C3161c();
            Toolbar toolbar = this.f11619U;
            if (string == null) {
                string = getString(C11347q0.f40022x);
            }
            toolbar.setTitle(string);
            Toolbar toolbar2 = this.f11619U;
            if (toolbar2 instanceof RobloxToolbar) {
                ((RobloxToolbar) toolbar2).setIconDelegate(new RobloxToolbar.C3171c());
            } else {
                toolbar2.setNavigationIcon(C11332l0.f39748h);
            }
            this.f11619U.setNavigationOnClickListener(new ViewOnClickListenerC3150a());
            if (NativeGLInterface.nativeUserGameSettingsGetReducedMotion()) {
                this.f11617S = 0;
                this.f11618T = 0;
            } else {
                this.f11617S = android.R.anim.fade_in;
                this.f11618T = C11317g0.f39698a;
            }
        }
        if (booleanExtra) {
            c3161c.mo4656a().mo4935a(this.f11620V);
        }
        AbstractC0934h abstractC0934hM4452r = m23360l1().m4452r();
        bundle2.putString("DEFAULT_URL", stringExtra);
        bundle2.putBoolean("USING_LOGIN_WEB_URL", intent.getBooleanExtra("USING_LOGIN_WEB_URL", false));
        c3161c.m4625O1(bundle2);
        abstractC0934hM4452r.m4775b(C11335m0.f39830r0, c3161c, C3161c.class.getName());
        abstractC0934hM4452r.mo4508g();
    }

    @InterfaceC5847j(threadMode = ThreadMode.MAIN)
    public void onNavigateToConversationEvent(C10257f c10257f) {
        C6124q.m27057b("RobloxActivity", "RWF.onNavigateToConversationEvent() " + c10257f.f36864a + " " + c10257f.f36865b);
        m14841k2(c10257f.f36864a, c10257f.f36865b);
    }

    @InterfaceC5847j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(C10258g c10258g) {
        if ("ABUSE_REPORT_TAG".equals(c10258g.f36866a)) {
            C11346q.m42511d(this, c10258g.f36867b, false);
        } else if ("FRIEND_FINDER_TAG".equals(c10258g.f36866a) || "UNIVERSAL_FRIENDS_TAG".equals(c10258g.f36866a)) {
            C11346q.m42514g(this, C11295a1.m42416R(), getString(C11347q0.f39902C), "{\"searchType\":\"Players\"}");
        } else {
            m14839i2(c10258g.f36866a, c10258g.f36867b);
        }
    }

    @InterfaceC5847j
    public void onNavigateToLuaEvent(C3161c.h hVar) {
        finish();
    }

    @InterfaceC5847j
    public void onPushNotificationRegistrationFailedEvent(C10259h c10259h) {
        if (c10259h.m39418a().equals("PushNotificationRegistrationFailed")) {
            Toast.makeText(this, getString(C11347q0.f39944V0), 0).show();
            m14842l2();
        }
    }

    @Override // com.roblox.client.AbstractActivityC3152a, com.roblox.client.AbstractActivityC3160b, p203j.ActivityC6992b, p093e4.ActivityC4831q, android.app.Activity
    public void onStart() {
        super.onStart();
        C12214e.m45220c().m45221b(this);
        C5840c.m26204d().m26215n(this);
    }

    @Override // com.roblox.client.AbstractActivityC3152a, com.roblox.client.AbstractActivityC3160b, p203j.ActivityC6992b, p093e4.ActivityC4831q, android.app.Activity
    public void onStop() {
        C12214e.m45220c().m45225g(this);
        C5840c.m26204d().m26217p(this);
        super.onStop();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    @InterfaceC5847j(threadMode = ThreadMode.MAIN)
    public void onWebSearchEvent(C10262k c10262k) {
        String strM42399I0;
        C6124q.m27063h("RobloxActivity", "RWA.onWebSearchEvent() " + c10262k.f36875b);
        int i10 = c10262k.f36874a;
        if (i10 == 1) {
            strM42399I0 = C11295a1.m42399I0(c10262k.f36875b);
        } else if (i10 == 2) {
            strM42399I0 = C11295a1.m42395G0(c10262k.f36875b);
        } else if (i10 == 3) {
            strM42399I0 = C11295a1.m42393F0(c10262k.f36875b);
        } else if (i10 != 4) {
            strM42399I0 = i10 != 5 ? null : C11295a1.m42397H0(c10262k.f36875b);
        } else {
            strM42399I0 = C11295a1.m42399I0(c10262k.f36875b);
        }
        if (strM42399I0 != null) {
            C11312e2.m42504h(this);
            m14840j2(strM42399I0);
        }
    }

    @Override // com.roblox.client.AbstractActivityC3152a, dk.C4636e.b
    /* JADX INFO: renamed from: u */
    public void mo14822u(EnumC9799a enumC9799a) {
        ((RobloxToolbar) this.f11619U).mo14822u(enumC9799a);
        super.mo14822u(enumC9799a);
    }
}
