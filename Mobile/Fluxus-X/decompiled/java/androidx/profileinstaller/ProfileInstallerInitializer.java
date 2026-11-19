package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.NonNull;
import androidx.profileinstaller.ProfileInstallerInitializer;
import backtraceio.library.anr.BacktraceANRSettings;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements l5.b<b> {

    public static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class b {
    }

    public static void g(@NonNull final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: v4.h
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.c.h(context);
            }
        });
    }

    @Override // l5.b
    @NonNull
    public List<Class<? extends l5.b<?>>> a() {
        return Collections.EMPTY_LIST;
    }

    @Override // l5.b
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b create(@NonNull Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: v4.f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                this.f34211a.f(applicationContext);
            }
        });
        return new b();
    }

    public void f(@NonNull final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: v4.g
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.g(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + BacktraceANRSettings.DEFAULT_ANR_TIMEOUT);
    }
}
