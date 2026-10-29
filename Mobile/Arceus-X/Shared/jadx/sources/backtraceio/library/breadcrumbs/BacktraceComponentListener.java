package backtraceio.library.breadcrumbs;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import backtraceio.library.enums.BacktraceBreadcrumbLevel;
import backtraceio.library.enums.BacktraceBreadcrumbType;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceComponentListener implements ComponentCallbacks2 {
    private final BacktraceBreadcrumbs backtraceBreadcrumbs;

    public BacktraceComponentListener(BacktraceBreadcrumbs backtraceBreadcrumbs) {
        this.backtraceBreadcrumbs = backtraceBreadcrumbs;
    }

    private BacktraceBreadcrumbLevel getMemoryWarningLevel(int i10) {
        if (i10 != 5 && i10 != 10) {
            if (i10 != 15) {
                if (i10 != 40) {
                    if (i10 != 60 && i10 != 80) {
                        return BacktraceBreadcrumbLevel.WARNING;
                    }
                }
            }
            return BacktraceBreadcrumbLevel.FATAL;
        }
        return BacktraceBreadcrumbLevel.ERROR;
    }

    private String getMemoryWarningString(int i10) {
        if (i10 == 5) {
            return "TRIM MEMORY RUNNING MODERATE";
        }
        if (i10 == 10) {
            return "TRIM MEMORY RUNNING LOW";
        }
        if (i10 == 15) {
            return "TRIM MEMORY RUNNING CRITICAL";
        }
        if (i10 == 20) {
            return "TRIM MEMORY UI HIDDEN";
        }
        if (i10 == 40) {
            return "TRIM MEMORY BACKGROUND";
        }
        if (i10 != 60) {
            return i10 != 80 ? "Generic memory warning" : "TRIM MEMORY COMPLETE";
        }
        return "TRIM MEMORY MODERATE";
    }

    private String stringifyOrientation(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? "unknown orientation" : "landscape";
        }
        return "portrait";
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        HashMap map = new HashMap();
        map.put("orientation", stringifyOrientation(configuration.orientation));
        this.backtraceBreadcrumbs.addBreadcrumb("Configuration changed", map, BacktraceBreadcrumbType.SYSTEM, BacktraceBreadcrumbLevel.INFO);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.backtraceBreadcrumbs.addBreadcrumb("Critical low memory warning!", BacktraceBreadcrumbType.SYSTEM, BacktraceBreadcrumbLevel.FATAL);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        this.backtraceBreadcrumbs.addBreadcrumb(getMemoryWarningString(i10), BacktraceBreadcrumbType.SYSTEM, getMemoryWarningLevel(i10));
    }
}
