package jm;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.util.concurrent.atomic.AtomicBoolean;
import th.h;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static a f21527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static b f21528g = b.USER_INITIATED;
    public boolean b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f21529a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21530c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21531d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21532e = false;

    /* JADX INFO: renamed from: jm.a$a, reason: collision with other inner class name */
    public enum EnumC0382a {
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
        if (f21527f == null) {
            f21527f = new a(context instanceof Activity);
        }
    }

    public static void i() {
        f21528g = b.BACKGROUND;
    }

    public static a j() {
        return f21527f;
    }

    public void a(EnumC0382a enumC0382a, Bundle bundle) {
        if (enumC0382a == EnumC0382a.SPLASH) {
            if (bundle != null || !this.b || f21528g == b.BACKGROUND || this.f21530c || this.f21531d) {
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
        if (h.a().G1() && enumC0382a == EnumC0382a.GAME) {
            if (bundle != null || !this.b || f21528g == b.BACKGROUND || this.f21532e) {
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
            this.f21532e = true;
            return;
        }
        if (enumC0382a != EnumC0382a.MAIN || this.f21529a.getAndSet(false) || bundle == null) {
            return;
        }
        if (this.f21530c || this.f21531d) {
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
        boolean z10 = this.f21530c;
        if (!z10 && !this.f21531d) {
            LoggingProtocol.h("cold_start", 1L);
            LoggingProtocol.g("main_activity_cold_start");
        } else {
            if (z10 || !this.f21531d) {
                return;
            }
            LoggingProtocol.g("warm_start");
            LoggingProtocol.g("main_activity_warm_start_no_splash");
        }
    }

    public void b(EnumC0382a enumC0382a) {
        LoggingProtocol.g("app_paused");
    }

    public final boolean d() {
        return LoggingProtocol.getProcessTimestamp() > 30000;
    }

    public void e() {
        this.f21529a.set(true);
    }

    public void f() {
        this.f21532e = true;
    }

    public void g() {
        this.f21531d = true;
    }

    public void h() {
        this.f21530c = true;
    }
}
