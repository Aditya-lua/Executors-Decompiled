package fb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f16539a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f16541d;

    public /* synthetic */ i(j jVar, Application application, byte[] bArr) {
        Objects.requireNonNull(jVar);
        this.f16541d = jVar;
        this.b = false;
        this.f16539a = application;
    }

    public final /* synthetic */ void a() {
        if (this.b) {
            return;
        }
        this.f16539a.registerActivityLifecycleCallbacks(this);
        this.b = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        String className = activity.getComponentName().getClassName();
        if (this.f16540c) {
            if (!Objects.equals(className, "com.epicgames.unreal.GameActivity")) {
                return;
            }
        } else if (Objects.equals(className, "com.epicgames.unreal.SplashActivity") && k.f16547c.a(activity)) {
            this.f16540c = true;
            return;
        }
        this.f16539a.unregisterActivityLifecycleCallbacks(this);
        if (this.b) {
            this.b = false;
            s0.a("AutomaticGamesAuthenticator", "Automatic connection attempt triggered");
            this.f16541d.c().zzd();
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
