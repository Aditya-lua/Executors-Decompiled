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
import gk.p;
import java.util.concurrent.Executors;
import sg.a1;
import wh.j0;
import wh.t0;

/* JADX INFO: loaded from: classes2.dex */
public class c {
    public ExperienceSession b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f9107a = b.GAME_STATE_NONE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f9108c = 0;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f9109a;
        public final /* synthetic */ j0 b;

        public a(Activity activity, j0 j0Var) {
            this.f9109a = activity;
            this.b = j0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager fragmentManagerL1 = ((q) this.f9109a).l1();
            androidx.fragment.app.c cVarN0 = ((q) this.f9109a).l1().n0(rh.a.class.getName());
            if (cVarN0 == null || fragmentManagerL1.U0()) {
                p.e("GameManager", "Gaming protocol is trying to send launch request when game is running.");
            } else {
                h hVarR = fragmentManagerL1.r();
                hVarR.m(cVarN0);
                hVarR.g();
            }
            if (c.this.b != null || fragmentManagerL1.U0()) {
                p.e("GameManager", "Gaming protocol is trying to send launch request when game is running.");
                return;
            }
            ExperienceSession experienceSessionE = c.this.e(this.f9109a, this.b);
            c.this.b = experienceSessionE;
            experienceSessionE.i0((ExperienceSession.d) this.f9109a);
            experienceSessionE.l0();
        }
    }

    public enum b {
        GAME_STATE_NONE,
        GAME_STATE_STARTED,
        GAME_STATE_ENDED
    }

    public final ExperienceSession e(Context context, j0 j0Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("roblox_placeId", j0Var.p());
        bundle.putLong("roblox_userId", j0Var.u());
        bundle.putLong("roblox_conversationId", j0Var.f());
        bundle.putString("roblox_accessCode", j0Var.d());
        bundle.putString("roblox_linkCode", j0Var.o());
        bundle.putString("roblox_gameId", j0Var.h());
        bundle.putString("roblox_reservedServerAccessCode", j0Var.t());
        bundle.putString("roblox_callId", j0Var.e());
        bundle.putInt("roblox_joinRequestType", j0Var.s());
        bundle.putString("roblox_referralPage", j0Var.q());
        bundle.putString("roblox_launchData", j0Var.n());
        bundle.putString("roblox_joinAttemptId", j0Var.l());
        bundle.putString("roblox_joinAttemptOrigin", j0Var.m());
        bundle.putString("roblox_isoContext", j0Var.k());
        if (th.h.a().R2()) {
            bundle.putLong("roblox_referredByPlayerId", j0Var.r());
        }
        bundle.putString("roblox_gameJoinContext", j0Var.j());
        bundle.putString("roblox_event_id", j0Var.g());
        if (th.h.a().r3()) {
            bundle.putString("game_id_to_exclude", j0Var.i());
        }
        return new ExperienceSession(bundle);
    }

    public boolean f() {
        if (!d.e().f()) {
            return true;
        }
        p.h("GameManager", "canStartGame = false: Upgrade required");
        return false;
    }

    public void g(boolean z10) {
        p.b("GameManager", "endGameSession");
        ExperienceSession experienceSession = this.b;
        if (experienceSession != null) {
            experienceSession.D(true);
        } else {
            p.e("GameManager", "Error: Try to end but no game session exists.");
        }
    }

    public boolean h() {
        return this.f9107a == b.GAME_STATE_ENDED;
    }

    public boolean i() {
        return this.f9107a == b.GAME_STATE_STARTED;
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void j(Activity activity, j0 j0Var) {
        if (j0Var == null) {
            p.k("GameManager", "launchGameWithParams: game-params is null. Just close this activity!");
            return;
        }
        p.h("GameManager", "launchGameWithParams: Start game activity for placeId = " + j0Var.p());
        a1.U(activity).edit().remove("ROBLOXCrash").apply();
        activity.runOnUiThread(new a(activity, j0Var));
        this.f9108c = System.currentTimeMillis();
        m();
    }

    public void l(Context context) {
        p.b("GameManager", "onGameEnded:");
        this.f9107a = b.GAME_STATE_ENDED;
        this.b = null;
        o();
    }

    public void m() {
        p.b("GameManager", "onGameStarted:");
        this.f9108c = System.currentTimeMillis();
        this.f9107a = b.GAME_STATE_STARTED;
    }

    public void n() {
        p.b("GameManager", "pauseGameSession");
        ExperienceSession experienceSession = this.b;
        if (experienceSession != null) {
            experienceSession.Z();
        } else {
            p.e("GameManager", "Error: Try to pause but no game session exists.");
        }
    }

    public void o() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f9108c;
        p.h("GameManager", "Game duration: " + jCurrentTimeMillis + "ms.");
        xg.a.e().m(jCurrentTimeMillis);
    }

    public void p() {
        p.b("GameManager", "resumeGameSession");
        ExperienceSession experienceSession = this.b;
        if (experienceSession != null) {
            experienceSession.d0();
        } else {
            p.e("GameManager", "Error: Try to resume but no game session exists.");
        }
    }

    public void q(final Activity activity, final j0 j0Var, int i10) {
        if (!f()) {
            p.h("GameManager", "Game launch halted - Can't start game.");
            return;
        }
        p.b("GameManager", "startGameForResult: requestCode = " + i10);
        ((ActivityNativeMain) activity).r3(t0.EXPERIENCE);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: wh.k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34334a.j(activity, j0Var);
                }
            });
        } else {
            j(activity, j0Var);
        }
    }
}
