package n0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class h1 {
    public static h1 a(Executor executor, Handler handler) {
        return new i(executor, handler);
    }

    public abstract Executor b();

    public abstract Handler c();
}
