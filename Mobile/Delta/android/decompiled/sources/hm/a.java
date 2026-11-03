package hm;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.util.concurrent.atomic.AtomicBoolean;
import rh.h;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static a f19535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static b f19536g = b.USER_INITIATED;
    public boolean b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f19537a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19538c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19539d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19540e = false;

    /* JADX INFO: renamed from: hm.a$a, reason: collision with other inner class name */
    public enum EnumC0345a {
        SPLASH,
        MAIN,
        GAME
    }

    public enum b {
        USER_INITIATED,
        BACKGROUND
    }

    public a(boolean z10) {
        this.b = z10;
    }

    public static void c(Context context) {
        if (f19535f == null) {
            f19535f = new a(context instanceof Activity);
        }
    }

    public static void i() {
        f19536g = b.BACKGROUND;
    }

    public static a j() {
        return f19535f;
    }

    public void a(EnumC0345a enumC0345a, Bundle bundle) {
        if (enumC0345a == EnumC0345a.SPLASH) {
            if (bundle != null || !this.b || f19536g == b.BACKGROUND || this.f19538c || this.f19539d) {
                LoggingProtocol.g("warm_start");
                return;
            } else if (!d()) {
                LoggingProtocol.h("cold_start", 1L);
                return;
            } else {
                LoggingProtocol.g("warm_start");
                LoggingProtocol.g("warm_start_pre_forked");
                return;
            }
        }
        if (h.a().Q1() && enumC0345a == EnumC0345a.GAME) {
            if (bundle != null || !this.b || f19536g == b.BACKGROUND || this.f19540e) {
                LoggingProtocol.g("warm_start");
                LoggingProtocol.g("game_activity_warm_start");
            } else if (d()) {
                LoggingProtocol.g("warm_start");
                LoggingProtocol.g("game_activity_warm_start");
                LoggingProtocol.g("warm_start_pre_forked");
            } else {
                LoggingProtocol.h("cold_start", 1L);
                LoggingProtocol.g("game_activity_cold_start");
            }
            this.f19540e = true;
            return;
        }
        if (enumC0345a != EnumC0345a.MAIN || this.f19537a.getAndSet(false) || bundle == null) {
            return;
        }
        if (this.f19538c || this.f19539d) {
            LoggingProtocol.g("warm_start");
            LoggingProtocol.g("main_activity_warm_start");
            return;
        }
        if (d()) {
            LoggingProtocol.g("warm_start");
            LoggingProtocol.g("main_activity_warm_start");
            LoggingProtocol.g("warm_start_pre_forked");
            return;
        }
        boolean z10 = this.f19538c;
        if (!z10 && !this.f19539d) {
            LoggingProtocol.h("cold_start", 1L);
            LoggingProtocol.g("main_activity_cold_start");
        } else {
            if (z10 || !this.f19539d) {
                return;
            }
            LoggingProtocol.g("warm_start");
            LoggingProtocol.g("main_activity_warm_start_no_splash");
        }
    }

    public void b(EnumC0345a enumC0345a) {
        LoggingProtocol.g("app_paused");
    }

    public final boolean d() {
        return LoggingProtocol.getProcessTimestamp() > 30000;
    }

    public void e() {
        this.f19537a.set(true);
    }

    public void f() {
        this.f19540e = true;
    }

    public void g() {
        this.f19539d = true;
    }

    public void h() {
        this.f19538c = true;
    }
}
