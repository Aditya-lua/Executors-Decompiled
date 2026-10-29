package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2331u3 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2349v3 f8681a;

    public C2331u3(C2349v3 c2349v3) {
        Objects.requireNonNull(c2349v3);
        this.f8681a = c2349v3;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f8681a.m10810i(new C2187m3(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f8681a.m10810i(new C2295s3(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f8681a.m10810i(new C2241p3(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f8681a.m10810i(new C2223o3(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        BinderC2275r1 binderC2275r1 = new BinderC2275r1();
        this.f8681a.m10810i(new C2277r3(this, activity, binderC2275r1));
        Bundle bundleM10591u2 = binderC2275r1.m10591u2(50L);
        if (bundleM10591u2 != null) {
            bundle.putAll(bundleM10591u2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f8681a.m10810i(new C2205n3(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f8681a.m10810i(new C2259q3(this, activity));
    }
}
