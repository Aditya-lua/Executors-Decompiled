package p125fb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: renamed from: fb.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5528i implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final Application f21306a;

    /* JADX INFO: renamed from: b */
    public boolean f21307b;

    /* JADX INFO: renamed from: c */
    public boolean f21308c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C5532j f21309d;

    public /* synthetic */ C5528i(C5532j c5532j, Application application, byte[] bArr) {
        Objects.requireNonNull(c5532j);
        this.f21309d = c5532j;
        this.f21307b = false;
        this.f21306a = application;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m25193a() {
        if (this.f21307b) {
            return;
        }
        this.f21306a.registerActivityLifecycleCallbacks(this);
        this.f21307b = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        String className = activity.getComponentName().getClassName();
        if (this.f21308c) {
            if (!Objects.equals(className, "com.epicgames.unreal.GameActivity")) {
                return;
            }
        } else if (Objects.equals(className, "com.epicgames.unreal.SplashActivity") && C5535k.f21316c.m25204a(activity)) {
            this.f21308c = true;
            return;
        }
        this.f21306a.unregisterActivityLifecycleCallbacks(this);
        if (this.f21307b) {
            this.f21307b = false;
            C5560s0.m25220a("AutomaticGamesAuthenticator", "Automatic connection attempt triggered");
            this.f21309d.m25201c().zzd();
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
