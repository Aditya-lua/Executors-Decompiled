package o9;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f26985a = new Object();
    public static int b = 9;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static s1 f26986c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static HandlerThread f26987d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Executor f26988e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f26989f = false;

    @NonNull
    public static j a(@NonNull Context context) {
        synchronized (f26985a) {
            try {
                if (f26986c == null) {
                    f26986c = new s1(context.getApplicationContext(), f26989f ? b().getLooper() : context.getMainLooper(), f26988e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f26986c;
    }

    @NonNull
    public static HandlerThread b() {
        synchronized (f26985a) {
            try {
                HandlerThread handlerThread = f26987d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", b);
                f26987d = handlerThread2;
                handlerThread2.start();
                return f26987d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract k9.b c(p1 p1Var, ServiceConnection serviceConnection, String str, Executor executor);

    public final void d(@NonNull String str, @NonNull String str2, int i10, @NonNull ServiceConnection serviceConnection, @NonNull String str3, boolean z10) {
        e(new p1(str, str2, 4225, z10), serviceConnection, str3);
    }

    public abstract void e(p1 p1Var, ServiceConnection serviceConnection, String str);
}
