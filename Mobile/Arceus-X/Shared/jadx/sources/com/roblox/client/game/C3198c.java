package com.roblox.client.game;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.AbstractC0934h;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.fragment.app.FragmentManager;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.C3179d;
import java.util.concurrent.Executors;
import p093e4.ActivityC4831q;
import p151gk.C6124q;
import p412rh.C10880a;
import p517wh.C12442j0;
import p517wh.EnumC12462t0;
import p546xg.C12830a;
import sg.C11295a1;
import th.C11659h;

/* JADX INFO: renamed from: com.roblox.client.game.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3198c {

    /* JADX INFO: renamed from: b */
    public ExperienceSession f11877b;

    /* JADX INFO: renamed from: a */
    public b f11876a = b.GAME_STATE_NONE;

    /* JADX INFO: renamed from: c */
    public long f11878c = 0;

    /* JADX INFO: renamed from: com.roblox.client.game.c$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f11879a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C12442j0 f11880b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(Activity activity, C12442j0 c12442j0) {
            this.f11879a = activity;
            this.f11880b = c12442j0;
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager fragmentManagerM23360l1 = ((ActivityC4831q) this.f11879a).m23360l1();
            ComponentCallbacksC0929c componentCallbacksC0929cM4444n0 = ((ActivityC4831q) this.f11879a).m23360l1().m4444n0(C10880a.class.getName());
            if (componentCallbacksC0929cM4444n0 == null || fragmentManagerM23360l1.m4404U0()) {
                C6124q.m27060e("GameManager", "Gaming protocol is trying to send launch request when game is running.");
            } else {
                AbstractC0934h abstractC0934hM4452r = fragmentManagerM23360l1.m4452r();
                abstractC0934hM4452r.mo4513m(componentCallbacksC0929cM4444n0);
                abstractC0934hM4452r.mo4508g();
            }
            if (C3198c.this.f11877b != null || fragmentManagerM23360l1.m4404U0()) {
                C6124q.m27060e("GameManager", "Gaming protocol is trying to send launch request when game is running.");
                return;
            }
            ExperienceSession experienceSessionM15271e = C3198c.this.m15271e(this.f11879a, this.f11880b);
            C3198c.this.f11877b = experienceSessionM15271e;
            experienceSessionM15271e.m15204i0((ExperienceSession.InterfaceC3193d) this.f11879a);
            experienceSessionM15271e.m15209l0();
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.game.c$b */
    public enum b {
        GAME_STATE_NONE,
        GAME_STATE_STARTED,
        GAME_STATE_ENDED
    }

    /* JADX INFO: renamed from: e */
    public final ExperienceSession m15271e(Context context, C12442j0 c12442j0) {
        Bundle bundle = new Bundle();
        bundle.putLong("roblox_placeId", c12442j0.m46656p());
        bundle.putLong("roblox_userId", c12442j0.m46661u());
        bundle.putLong("roblox_conversationId", c12442j0.m46646f());
        bundle.putString("roblox_accessCode", c12442j0.m46644d());
        bundle.putString("roblox_linkCode", c12442j0.m46655o());
        bundle.putString("roblox_gameId", c12442j0.m46648h());
        bundle.putString("roblox_reservedServerAccessCode", c12442j0.m46660t());
        bundle.putString("roblox_callId", c12442j0.m46645e());
        bundle.putInt("roblox_joinRequestType", c12442j0.m46659s());
        bundle.putString("roblox_referralPage", c12442j0.m46657q());
        bundle.putString("roblox_launchData", c12442j0.m46654n());
        bundle.putString("roblox_joinAttemptId", c12442j0.m46652l());
        bundle.putString("roblox_joinAttemptOrigin", c12442j0.m46653m());
        bundle.putString("roblox_isoContext", c12442j0.m46651k());
        if (C11659h.m43403a().mo43566X2()) {
            bundle.putLong("roblox_referredByPlayerId", c12442j0.m46658r());
        }
        bundle.putString("roblox_gameJoinContext", c12442j0.m46650j());
        bundle.putString("roblox_event_id", c12442j0.m46647g());
        if (C11659h.m43403a().mo43754x3()) {
            bundle.putString("game_id_to_exclude", c12442j0.m46649i());
        }
        return new ExperienceSession(bundle);
    }

    /* JADX INFO: renamed from: f */
    public boolean m15272f() {
        if (!C3179d.m15085e().m15089f()) {
            return true;
        }
        C6124q.m27063h("GameManager", "canStartGame = false: Upgrade required");
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m15273g(boolean z10) {
        C6124q.m27057b("GameManager", "endGameSession");
        ExperienceSession experienceSession = this.f11877b;
        if (experienceSession != null) {
            experienceSession.m15168D(true);
        } else {
            C6124q.m27060e("GameManager", "Error: Try to end but no game session exists.");
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m15274h() {
        return this.f11876a == b.GAME_STATE_ENDED;
    }

    /* JADX INFO: renamed from: i */
    public boolean m15275i() {
        return this.f11876a == b.GAME_STATE_STARTED;
    }

    /* JADX DEBUG: Method merged with bridge method: j(Landroid/app/Activity;Lwh/j0;)V */
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void m15276j(Activity activity, C12442j0 c12442j0) {
        if (c12442j0 == null) {
            C6124q.m27066k("GameManager", "launchGameWithParams: game-params is null. Just close this activity!");
            return;
        }
        C6124q.m27063h("GameManager", "launchGameWithParams: Start game activity for placeId = " + c12442j0.m46656p());
        C11295a1.m42422U(activity).edit().remove("ROBLOXCrash").apply();
        activity.runOnUiThread(new a(activity, c12442j0));
        this.f11878c = System.currentTimeMillis();
        m15279m();
    }

    /* JADX INFO: renamed from: l */
    public void m15278l(Context context) {
        C6124q.m27057b("GameManager", "onGameEnded:");
        this.f11876a = b.GAME_STATE_ENDED;
        this.f11877b = null;
        m15281o();
    }

    /* JADX INFO: renamed from: m */
    public void m15279m() {
        C6124q.m27057b("GameManager", "onGameStarted:");
        this.f11878c = System.currentTimeMillis();
        this.f11876a = b.GAME_STATE_STARTED;
    }

    /* JADX INFO: renamed from: n */
    public void m15280n() {
        C6124q.m27057b("GameManager", "pauseGameSession");
        ExperienceSession experienceSession = this.f11877b;
        if (experienceSession != null) {
            experienceSession.m15188Z();
        } else {
            C6124q.m27060e("GameManager", "Error: Try to pause but no game session exists.");
        }
    }

    /* JADX INFO: renamed from: o */
    public void m15281o() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f11878c;
        C6124q.m27063h("GameManager", "Game duration: " + jCurrentTimeMillis + "ms.");
        C12830a.m47749e().m47761m(jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: p */
    public void m15282p() {
        C6124q.m27057b("GameManager", "resumeGameSession");
        ExperienceSession experienceSession = this.f11877b;
        if (experienceSession != null) {
            experienceSession.m15195d0();
        } else {
            C6124q.m27060e("GameManager", "Error: Try to resume but no game session exists.");
        }
    }

    /* JADX INFO: renamed from: q */
    public void m15283q(final Activity activity, final C12442j0 c12442j0, int i10) {
        if (!m15272f()) {
            C6124q.m27063h("GameManager", "Game launch halted - Can't start game.");
            return;
        }
        C6124q.m27057b("GameManager", "startGameForResult: requestCode = " + i10);
        ((ActivityNativeMain) activity).m14792r3(EnumC12462t0.EXPERIENCE);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: wh.k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44522a.m15276j(activity, c12442j0);
                }
            });
        } else {
            m15276j(activity, c12442j0);
        }
    }
}
