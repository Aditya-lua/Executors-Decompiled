package p305n9;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: n9.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8932f {

    /* JADX INFO: renamed from: a */
    public static final Object f32583a = new Object();

    /* JADX INFO: renamed from: b */
    public static int f32584b = 9;

    /* JADX INFO: renamed from: c */
    public static C8940h1 f32585c;

    /* JADX INFO: renamed from: d */
    public static HandlerThread f32586d;

    /* JADX INFO: renamed from: e */
    public static Executor f32587e;

    /* JADX INFO: renamed from: f */
    public static boolean f32588f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static AbstractC8932f m35986a(@NonNull Context context) {
        synchronized (f32583a) {
            try {
                if (f32585c == null) {
                    f32585c = new C8940h1(context.getApplicationContext(), f32588f ? m35987b().getLooper() : context.getMainLooper(), f32587e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f32585c;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static HandlerThread m35987b() {
        synchronized (f32583a) {
            try {
                HandlerThread handlerThread = f32586d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", f32584b);
                f32586d = handlerThread2;
                handlerThread2.start();
                return f32586d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract ConnectionResult mo35988c(C8931e1 c8931e1, ServiceConnection serviceConnection, String str, Executor executor);

    /* JADX INFO: renamed from: d */
    public final void m35989d(@NonNull String str, @NonNull String str2, int i10, @NonNull ServiceConnection serviceConnection, @NonNull String str3, boolean z10) {
        mo35990e(new C8931e1(str, str2, 4225, z10), serviceConnection, str3);
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo35990e(C8931e1 c8931e1, ServiceConnection serviceConnection, String str);
}
