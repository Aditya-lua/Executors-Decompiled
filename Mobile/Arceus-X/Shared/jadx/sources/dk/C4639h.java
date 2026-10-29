package dk;

import android.os.Handler;
import com.roblox.engine.jni.memstorage.Callback;
import com.roblox.engine.jni.memstorage.Connection;
import com.roblox.engine.jni.memstorage.MemStorage;

/* JADX INFO: renamed from: dk.h */
/* JADX INFO: loaded from: classes2.dex */
public class C4639h {

    /* JADX INFO: renamed from: a */
    public final String f19015a = "UserThemeListener";

    /* JADX INFO: renamed from: b */
    public Connection f19016b;

    /* JADX INFO: renamed from: c */
    public Handler f19017c;

    public C4639h(Handler handler) {
        this.f19017c = handler;
    }

    /* JADX INFO: renamed from: a */
    public void m22861a() {
        if (this.f19016b == null) {
            this.f19016b = MemStorage.bind("ThemeUpdate", new Callback() { // from class: dk.g
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public void m22862b() {
        Connection connection = this.f19016b;
        if (connection != null) {
            connection.disconnect();
            this.f19016b = null;
        }
    }
}
