package lk;

import android.os.Handler;
import com.roblox.engine.jni.memstorage.Callback;
import com.roblox.engine.jni.memstorage.Connection;
import com.roblox.engine.jni.memstorage.MemStorage;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22282a = "UserThemeListener";
    public Connection b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f22283c;

    public i(Handler handler) {
        this.f22283c = handler;
    }

    public void b() {
        if (this.b == null) {
            this.b = MemStorage.bind("ThemeUpdate", new Callback() { // from class: lk.g
                @Override // com.roblox.engine.jni.memstorage.Callback
                public final void onItemSet(String str) {
                    this.f22280a.c(str);
                }
            });
        }
    }

    public void c(String str) {
        q.b("UserThemeListener", "Theme updated from MemStorage: " + str);
        boolean zEqualsIgnoreCase = str.equalsIgnoreCase(nk.c.c().i());
        boolean z10 = zEqualsIgnoreCase ^ true;
        if (!bi.h.a().l0()) {
            z10 = zEqualsIgnoreCase;
        }
        if (z10) {
            final cm.a aVarB = cm.a.b(str);
            d(new Runnable() { // from class: lk.h
                @Override // java.lang.Runnable
                public final void run() {
                    nk.c.c().u(aVarB);
                }
            });
        }
    }

    public final void d(Runnable runnable) {
        this.f22283c.post(runnable);
    }

    public void e() {
        Connection connection = this.b;
        if (connection != null) {
            connection.disconnect();
            this.b = null;
        }
    }
}
