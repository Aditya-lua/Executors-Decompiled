package xm;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import bi.h;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static a f36795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static b f36796g = b.USER_INITIATED;
    public boolean b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f36797a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36798c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f36799d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36800e = false;

    /* JADX INFO: renamed from: xm.a$a, reason: collision with other inner class name */
    public enum EnumC0756a {
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
        if (f36795f == null) {
            f36795f = new a(context instanceof Activity);
        }
    }

    public static void i() {
        f36796g = b.BACKGROUND;
    }

    public static a j() {
        return f36795f;
    }

    public void a(EnumC0756a enumC0756a, Bundle bundle) {
        if (enumC0756a == EnumC0756a.SPLASH) {
            if (bundle != null || !this.b || f36796g == b.BACKGROUND || this.f36798c || this.f36799d) {
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
        if (h.a().Q1() && enumC0756a == EnumC0756a.GAME) {
            if (bundle != null || !this.b || f36796g == b.BACKGROUND || this.f36800e) {
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
            this.f36800e = true;
            return;
        }
        if (enumC0756a != EnumC0756a.MAIN || this.f36797a.getAndSet(false) || bundle == null) {
            return;
        }
        if (this.f36798c || this.f36799d) {
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
        boolean z10 = this.f36798c;
        if (!z10 && !this.f36799d) {
            LoggingProtocol.h("cold_start", 1L);
            LoggingProtocol.g("main_activity_cold_start");
        } else {
            if (z10 || !this.f36799d) {
                return;
            }
            LoggingProtocol.g("warm_start");
            LoggingProtocol.g("main_activity_warm_start_no_splash");
        }
    }

    public void b(EnumC0756a enumC0756a) {
        LoggingProtocol.g("app_paused");
    }

    public final boolean d() {
        return LoggingProtocol.getProcessTimestamp() > 30000;
    }

    public void e() {
        this.f36797a.set(true);
    }

    public void f() {
        this.f36800e = true;
    }

    public void g() {
        this.f36799d = true;
    }

    public void h() {
        this.f36798c = true;
    }
}
