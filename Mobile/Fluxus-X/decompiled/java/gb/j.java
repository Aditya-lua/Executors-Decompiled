package gb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f17633a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f17635d;

    public /* synthetic */ j(k kVar, Application application, byte[] bArr) {
        Objects.requireNonNull(kVar);
        this.f17635d = kVar;
        this.b = false;
        this.f17633a = application;
    }

    public final /* synthetic */ void a() {
        if (this.b) {
            return;
        }
        this.f17633a.registerActivityLifecycleCallbacks(this);
        this.b = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        String className = activity.getComponentName().getClassName();
        if (this.f17634c) {
            if (!Objects.equals(className, "com.epicgames.unreal.GameActivity")) {
                return;
            }
        } else if (Objects.equals(className, "com.epicgames.unreal.SplashActivity") && l.f17642c.a(activity)) {
            this.f17634c = true;
            return;
        }
        this.f17633a.unregisterActivityLifecycleCallbacks(this);
        if (this.b) {
            this.b = false;
            t0.a("AutomaticGamesAuthenticator", "Automatic connection attempt triggered");
            this.f17635d.c().zzd();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
    }
}
