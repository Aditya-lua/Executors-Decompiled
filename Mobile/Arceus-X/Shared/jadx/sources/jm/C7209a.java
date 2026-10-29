package jm;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.util.concurrent.atomic.AtomicBoolean;
import th.C11659h;

/* JADX INFO: renamed from: jm.a */
/* JADX INFO: loaded from: classes2.dex */
public class C7209a {

    /* JADX INFO: renamed from: f */
    public static C7209a f27907f;

    /* JADX INFO: renamed from: g */
    public static b f27908g = b.USER_INITIATED;

    /* JADX INFO: renamed from: b */
    public boolean f27910b;

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f27909a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public boolean f27911c = false;

    /* JADX INFO: renamed from: d */
    public boolean f27912d = false;

    /* JADX INFO: renamed from: e */
    public boolean f27913e = false;

    /* JADX INFO: renamed from: jm.a$a */
    public enum a {
        SPLASH,
        MAIN,
        GAME
    }

    /* JADX INFO: renamed from: jm.a$b */
    public enum b {
        USER_INITIATED,
        BACKGROUND
    }

    public C7209a(boolean z10) {
        this.f27910b = z10;
    }

    /* JADX INFO: renamed from: c */
    public static void m30129c(Context context) {
        if (f27907f == null) {
            f27907f = new C7209a(context instanceof Activity);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m30130i() {
        f27908g = b.BACKGROUND;
    }

    /* JADX INFO: renamed from: j */
    public static C7209a m30131j() {
        return f27907f;
    }

    /* JADX INFO: renamed from: a */
    public void m30132a(a aVar, Bundle bundle) {
        if (aVar == a.SPLASH) {
            if (bundle != null || !this.f27910b || f27908g == b.BACKGROUND || this.f27911c || this.f27912d) {
                LoggingProtocol.m15994g("warm_start");
                return;
            } else if (!m30134d()) {
                LoggingProtocol.m15995h("cold_start", 1L);
                return;
            } else {
                LoggingProtocol.m15994g("warm_start");
                LoggingProtocol.m15994g("warm_start_pre_forked");
                return;
            }
        }
        if (C11659h.m43403a().mo43490M1() && aVar == a.GAME) {
            if (bundle != null || !this.f27910b || f27908g == b.BACKGROUND || this.f27913e) {
                LoggingProtocol.m15994g("warm_start");
                LoggingProtocol.m15994g("game_activity_warm_start");
            } else if (m30134d()) {
                LoggingProtocol.m15994g("warm_start");
                LoggingProtocol.m15994g("game_activity_warm_start");
                LoggingProtocol.m15994g("warm_start_pre_forked");
            } else {
                LoggingProtocol.m15995h("cold_start", 1L);
                LoggingProtocol.m15994g("game_activity_cold_start");
            }
            this.f27913e = true;
            return;
        }
        if (aVar != a.MAIN || this.f27909a.getAndSet(false) || bundle == null) {
            return;
        }
        if (this.f27911c || this.f27912d) {
            LoggingProtocol.m15994g("warm_start");
            LoggingProtocol.m15994g("main_activity_warm_start");
            return;
        }
        if (m30134d()) {
            LoggingProtocol.m15994g("warm_start");
            LoggingProtocol.m15994g("main_activity_warm_start");
            LoggingProtocol.m15994g("warm_start_pre_forked");
            return;
        }
        boolean z10 = this.f27911c;
        if (!z10 && !this.f27912d) {
            LoggingProtocol.m15995h("cold_start", 1L);
            LoggingProtocol.m15994g("main_activity_cold_start");
        } else {
            if (z10 || !this.f27912d) {
                return;
            }
            LoggingProtocol.m15994g("warm_start");
            LoggingProtocol.m15994g("main_activity_warm_start_no_splash");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m30133b(a aVar) {
        LoggingProtocol.m15994g("app_paused");
    }

    /* JADX INFO: renamed from: d */
    public final boolean m30134d() {
        return LoggingProtocol.getProcessTimestamp() > 30000;
    }

    /* JADX INFO: renamed from: e */
    public void m30135e() {
        this.f27909a.set(true);
    }

    /* JADX INFO: renamed from: f */
    public void m30136f() {
        this.f27913e = true;
    }

    /* JADX INFO: renamed from: g */
    public void m30137g() {
        this.f27912d = true;
    }

    /* JADX INFO: renamed from: h */
    public void m30138h() {
        this.f27911c = true;
    }
}
