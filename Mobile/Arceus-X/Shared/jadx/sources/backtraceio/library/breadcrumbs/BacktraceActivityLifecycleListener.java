package backtraceio.library.breadcrumbs;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import backtraceio.library.enums.BacktraceBreadcrumbType;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceActivityLifecycleListener implements Application.ActivityLifecycleCallbacks {
    private final BacktraceBreadcrumbs backtraceBreadcrumbs;

    public BacktraceActivityLifecycleListener(BacktraceBreadcrumbs backtraceBreadcrumbs) {
        this.backtraceBreadcrumbs = backtraceBreadcrumbs;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.backtraceBreadcrumbs.addBreadcrumb(activity.getLocalClassName() + " onActivityCreated()", BacktraceBreadcrumbType.SYSTEM);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.backtraceBreadcrumbs.addBreadcrumb(activity.getLocalClassName() + " onActivityDestroyed()", BacktraceBreadcrumbType.SYSTEM);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.backtraceBreadcrumbs.addBreadcrumb(activity.getLocalClassName() + " onActivityPaused()", BacktraceBreadcrumbType.SYSTEM);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.backtraceBreadcrumbs.addBreadcrumb(activity.getLocalClassName() + " onActivityResumed()", BacktraceBreadcrumbType.SYSTEM);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.backtraceBreadcrumbs.addBreadcrumb(activity.getLocalClassName() + " onActivitySaveInstanceState()", BacktraceBreadcrumbType.SYSTEM);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.backtraceBreadcrumbs.addBreadcrumb(activity.getLocalClassName() + " onActivityStarted()", BacktraceBreadcrumbType.SYSTEM);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.backtraceBreadcrumbs.addBreadcrumb(activity.getLocalClassName() + " onActivityStopped()", BacktraceBreadcrumbType.SYSTEM);
    }
}
