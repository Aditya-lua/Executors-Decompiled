package com.roblox.universalapp.activitylifecyclecallbacks;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class JNIActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public native void nativeOnCreated(String str);

    public native void nativeOnDestroyed(String str);

    public native void nativeOnPaused(String str);

    public native void nativeOnPostCreated(String str);

    public native void nativeOnPostDestroyed(String str);

    public native void nativeOnPostPaused(String str);

    public native void nativeOnPostResumed(String str);

    public native void nativeOnPostStarted(String str);

    public native void nativeOnPostStopped(String str);

    public native void nativeOnPreCreated(String str);

    public native void nativeOnPreDestroyed(String str);

    public native void nativeOnPrePaused(String str);

    public native void nativeOnPreResumed(String str);

    public native void nativeOnPreStarted(String str);

    public native void nativeOnPreStopped(String str);

    public native void nativeOnResumed(String str);

    public native void nativeOnSaveInstanceState(String str);

    public native void nativeOnStarted(String str);

    public native void nativeOnStopped(String str);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        nativeOnCreated(activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        nativeOnDestroyed(activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        nativeOnPaused(activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(@NonNull Activity activity, Bundle bundle) {
        nativeOnPostCreated(activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostDestroyed(@NonNull Activity activity) {
        nativeOnPostDestroyed(activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostPaused(@NonNull Activity activity) {
        nativeOnPostPaused(activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(@NonNull Activity activity) {
        nativeOnPostResumed(activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(@NonNull Activity activity) {
        nativeOnPostStarted(activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStopped(@NonNull Activity activity) {
        nativeOnPostStopped(activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(@NonNull Activity activity, Bundle bundle) {
        nativeOnPreCreated(activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(@NonNull Activity activity) {
        nativeOnPreDestroyed(activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(@NonNull Activity activity) {
        nativeOnPrePaused(activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreResumed(@NonNull Activity activity) {
        nativeOnPreResumed(activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(@NonNull Activity activity) {
        nativeOnPreStarted(activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(@NonNull Activity activity) {
        nativeOnPreStopped(activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        nativeOnResumed(activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        nativeOnSaveInstanceState(activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        nativeOnStarted(activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        nativeOnStopped(activity.getClass().getSimpleName());
    }
}
