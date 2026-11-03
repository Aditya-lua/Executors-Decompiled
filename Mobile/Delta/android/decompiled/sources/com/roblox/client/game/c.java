package com.roblox.client.game;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.h;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.d;
import e4.q;
import java.util.concurrent.Executors;
import rg.a1;
import uh.k0;
import uh.u0;

/* JADX INFO: loaded from: classes2.dex */
public class c {
    public ExperienceSession b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f9180a = b.GAME_STATE_NONE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f9181c = 0;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f9182a;
        public final /* synthetic */ k0 b;

        public a(Activity activity, k0 k0Var) {
            this.f9182a = activity;
            this.b = k0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager fragmentManagerL1 = ((q) this.f9182a).l1();
            androidx.fragment.app.c cVarN0 = ((q) this.f9182a).l1().n0(ph.a.class.getName());
            if (cVarN0 == null || fragmentManagerL1.U0()) {
                ek.q.e("GameManager", "Gaming protocol is trying to send launch request when game is running.");
            } else {
                h hVarR = fragmentManagerL1.r();
                hVarR.m(cVarN0);
                hVarR.g();
            }
            if (c.this.b != null || fragmentManagerL1.U0()) {
                ek.q.e("GameManager", "Gaming protocol is trying to send launch request when game is running.");
                return;
            }
            ExperienceSession experienceSessionE = c.this.e(this.f9182a, this.b);
            c.this.b = experienceSessionE;
            experienceSessionE.k0((ExperienceSession.d) this.f9182a);
            experienceSessionE.o0();
        }
    }

    public enum b {
        GAME_STATE_NONE,
        GAME_STATE_STARTED,
        GAME_STATE_ENDED
    }

    public final ExperienceSession e(Context context, k0 k0Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("roblox_placeId", k0Var.p());
        bundle.putLong("roblox_userId", k0Var.u());
        bundle.putLong("roblox_conversationId", k0Var.f());
        bundle.putString("roblox_accessCode", k0Var.d());
        bundle.putString("roblox_linkCode", k0Var.o());
        bundle.putString("roblox_gameId", k0Var.h());
        bundle.putString("roblox_reservedServerAccessCode", k0Var.t());
        bundle.putString("roblox_callId", k0Var.e());
        bundle.putInt("roblox_joinRequestType", k0Var.s());
        bundle.putString("roblox_referralPage", k0Var.q());
        bundle.putString("roblox_launchData", k0Var.n());
        bundle.putString("roblox_joinAttemptId", k0Var.l());
        bundle.putString("roblox_joinAttemptOrigin", k0Var.m());
        bundle.putString("roblox_isoContext", k0Var.k());
        if (rh.h.a().c3()) {
            bundle.putLong("roblox_referredByPlayerId", k0Var.r());
        }
        bundle.putString("roblox_gameJoinContext", k0Var.j());
        bundle.putString("roblox_event_id", k0Var.g());
        if (rh.h.a().D3()) {
            bundle.putString("game_id_to_exclude", k0Var.i());
        }
        return new ExperienceSession(bundle);
    }

    public boolean f() {
        if (!d.e().f()) {
            return true;
        }
        ek.q.h("GameManager", "canStartGame = false: Upgrade required");
        return false;
    }

    public void g(boolean z10) {
        ek.q.b("GameManager", "endGameSession");
        ExperienceSession experienceSession = this.b;
        if (experienceSession != null) {
            experienceSession.F(true);
        } else {
            ek.q.e("GameManager", "Error: Try to end but no game session exists.");
        }
    }

    public boolean h() {
        return this.f9180a == b.GAME_STATE_ENDED;
    }

    public boolean i() {
        return this.f9180a == b.GAME_STATE_STARTED;
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void j(Activity activity, k0 k0Var) {
        if (k0Var == null) {
            ek.q.k("GameManager", "launchGameWithParams: game-params is null. Just close this activity!");
            return;
        }
        ek.q.h("GameManager", "launchGameWithParams: Start game activity for placeId = " + k0Var.p());
        a1.U(activity).edit().remove("ROBLOXCrash").apply();
        activity.runOnUiThread(new a(activity, k0Var));
        this.f9181c = System.currentTimeMillis();
        m();
    }

    public void l(Context context) {
        ek.q.b("GameManager", "onGameEnded:");
        this.f9180a = b.GAME_STATE_ENDED;
        this.b = null;
        o();
    }

    public void m() {
        ek.q.b("GameManager", "onGameStarted:");
        this.f9181c = System.currentTimeMillis();
        this.f9180a = b.GAME_STATE_STARTED;
    }

    public void n() {
        ek.q.b("GameManager", "pauseGameSession");
        ExperienceSession experienceSession = this.b;
        if (experienceSession != null) {
            experienceSession.b0();
        } else {
            ek.q.e("GameManager", "Error: Try to pause but no game session exists.");
        }
    }

    public void o() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f9181c;
        ek.q.h("GameManager", "Game duration: " + jCurrentTimeMillis + "ms.");
        wg.a.e().m(jCurrentTimeMillis);
    }

    public void p() {
        ek.q.b("GameManager", "resumeGameSession");
        ExperienceSession experienceSession = this.b;
        if (experienceSession != null) {
            experienceSession.g0();
        } else {
            ek.q.e("GameManager", "Error: Try to resume but no game session exists.");
        }
    }

    public void q(final Activity activity, final k0 k0Var, int i10) {
        if (!f()) {
            ek.q.h("GameManager", "Game launch halted - Can't start game.");
            return;
        }
        ek.q.b("GameManager", "startGameForResult: requestCode = " + i10);
        ((ActivityNativeMain) activity).r3(u0.EXPERIENCE);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: uh.l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33013a.j(activity, k0Var);
                }
            });
        } else {
            j(activity, k0Var);
        }
    }
}
