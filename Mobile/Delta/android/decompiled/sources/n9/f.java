package n9;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f26077a = new Object();
    public static int b = 9;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static h1 f26078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static HandlerThread f26079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Executor f26080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f26081f;

    @NonNull
    public static f a(@NonNull Context context) {
        synchronized (f26077a) {
            try {
                if (f26078c == null) {
                    f26078c = new h1(context.getApplicationContext(), f26081f ? b().getLooper() : context.getMainLooper(), f26080e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f26078c;
    }

    @NonNull
    public static HandlerThread b() {
        synchronized (f26077a) {
            try {
                HandlerThread handlerThread = f26079d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", b);
                f26079d = handlerThread2;
                handlerThread2.start();
                return f26079d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract ConnectionResult c(e1 e1Var, ServiceConnection serviceConnection, String str, Executor executor);

    public final void d(@NonNull String str, @NonNull String str2, int i10, @NonNull ServiceConnection serviceConnection, @NonNull String str3, boolean z10) {
        e(new e1(str, str2, 4225, z10), serviceConnection, str3);
    }

    public abstract void e(e1 e1Var, ServiceConnection serviceConnection, String str);
}
