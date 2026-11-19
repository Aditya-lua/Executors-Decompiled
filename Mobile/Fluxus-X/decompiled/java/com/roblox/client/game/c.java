package com.roblox.client.game;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import bh.a1;
import bi.h;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.d;
import ei.k0;
import ei.u0;
import f4.q;
import f4.t0;
import f4.v;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class c {
    public ExperienceSession b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f8996a = b.GAME_STATE_NONE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8997c = 0;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f8998a;
        public final /* synthetic */ k0 b;

        public a(Activity activity, k0 k0Var) {
            this.f8998a = activity;
            this.b = k0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            f4.k0 k0VarL1 = ((v) this.f8998a).l1();
            q qVarN0 = ((v) this.f8998a).l1().n0(zh.a.class.getName());
            if (qVarN0 == null || k0VarL1.U0()) {
                ok.q.e("GameManager", "Gaming protocol is trying to send launch request when game is running.");
            } else {
                t0 t0VarR = k0VarL1.r();
                t0VarR.m(qVarN0);
                t0VarR.g();
            }
            if (c.this.b != null || k0VarL1.U0()) {
                ok.q.e("GameManager", "Gaming protocol is trying to send launch request when game is running.");
                return;
            }
            ExperienceSession experienceSessionE = c.this.e(this.f8998a, this.b);
            c.this.b = experienceSessionE;
            experienceSessionE.l0((ExperienceSession.d) this.f8998a);
            experienceSessionE.p0();
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
        if (h.a().e3()) {
            bundle.putLong("roblox_referredByPlayerId", k0Var.r());
        }
        bundle.putString("roblox_gameJoinContext", k0Var.j());
        bundle.putString("roblox_event_id", k0Var.g());
        if (h.a().H3()) {
            bundle.putString("game_id_to_exclude", k0Var.i());
        }
        return new ExperienceSession(bundle);
    }

    public boolean f() {
        if (!d.e().f()) {
            return true;
        }
        ok.q.h("GameManager", "canStartGame = false: Upgrade required");
        return false;
    }

    public void g(boolean z10) {
        ok.q.b("GameManager", "endGameSession");
        ExperienceSession experienceSession = this.b;
        if (experienceSession != null) {
            experienceSession.F(true);
        } else {
            ok.q.e("GameManager", "Error: Try to end but no game session exists.");
        }
    }

    public boolean h() {
        return this.f8996a == b.GAME_STATE_ENDED;
    }

    public boolean i() {
        return this.f8996a == b.GAME_STATE_STARTED;
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void j(Activity activity, k0 k0Var) {
        if (k0Var == null) {
            ok.q.k("GameManager", "launchGameWithParams: game-params is null. Just close this activity!");
            return;
        }
        ok.q.h("GameManager", "launchGameWithParams: Start game activity for placeId = " + k0Var.p());
        a1.U(activity).edit().remove("ROBLOXCrash").apply();
        activity.runOnUiThread(new a(activity, k0Var));
        this.f8997c = System.currentTimeMillis();
        m();
    }

    public void l(Context context) {
        ok.q.b("GameManager", "onGameEnded:");
        this.f8996a = b.GAME_STATE_ENDED;
        this.b = null;
        o();
    }

    public void m() {
        ok.q.b("GameManager", "onGameStarted:");
        this.f8997c = System.currentTimeMillis();
        this.f8996a = b.GAME_STATE_STARTED;
    }

    public void n() {
        ok.q.b("GameManager", "pauseGameSession");
        ExperienceSession experienceSession = this.b;
        if (experienceSession != null) {
            experienceSession.c0();
        } else {
            ok.q.e("GameManager", "Error: Try to pause but no game session exists.");
        }
    }

    public void o() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f8997c;
        ok.q.h("GameManager", "Game duration: " + jCurrentTimeMillis + "ms.");
        gh.a.e().m(jCurrentTimeMillis);
    }

    public void p() {
        ok.q.b("GameManager", "resumeGameSession");
        ExperienceSession experienceSession = this.b;
        if (experienceSession != null) {
            experienceSession.h0();
        } else {
            ok.q.e("GameManager", "Error: Try to resume but no game session exists.");
        }
    }

    public void q(final Activity activity, final k0 k0Var, int i10) {
        if (!f()) {
            ok.q.h("GameManager", "Game launch halted - Can't start game.");
            return;
        }
        ok.q.b("GameManager", "startGameForResult: requestCode = " + i10);
        ((ActivityNativeMain) activity).r3(u0.EXPERIENCE);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: ei.l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13751a.j(activity, k0Var);
                }
            });
        } else {
            j(activity, k0Var);
        }
    }
}
