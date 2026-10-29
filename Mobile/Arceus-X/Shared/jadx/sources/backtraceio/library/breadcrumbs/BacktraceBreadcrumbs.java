package backtraceio.library.breadcrumbs;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import backtraceio.library.common.serialization.DebugHelper;
import backtraceio.library.enums.BacktraceBreadcrumbLevel;
import backtraceio.library.enums.BacktraceBreadcrumbType;
import backtraceio.library.events.OnSuccessfulBreadcrumbAddEventListener;
import backtraceio.library.interfaces.Breadcrumbs;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.json.BacktraceReport;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceBreadcrumbs implements Breadcrumbs {
    public static final int DEFAULT_MAX_LOG_SIZE_BYTES = 64000;
    private static final transient String LOG_TAG = "BacktraceBreadcrumbs";
    private static final String breadcrumbLogFileName = "bt-breadcrumbs-0";
    private BacktraceActivityLifecycleListener backtraceActivityLifecycleListener;
    private BacktraceBreadcrumbsLogManager backtraceBreadcrumbsLogManager;
    private BacktraceBroadcastReceiver backtraceBroadcastReceiver;
    private BacktraceComponentListener backtraceComponentListener;
    String breadcrumbLogDirectory;
    private Context context;
    private EnumSet<BacktraceBreadcrumbType> enabledBreadcrumbTypes;
    private OnSuccessfulBreadcrumbAddEventListener onSuccessfulBreadcrumbAddEventListener = null;

    public BacktraceBreadcrumbs(String str) {
        this.breadcrumbLogDirectory = str;
    }

    private boolean addConfigurationBreadcrumb() {
        if (this.backtraceBreadcrumbsLogManager == null) {
            BacktraceLogger.m7081e(LOG_TAG, "Could not add configuration breadcrumb, BreadcrumbsLogManager is null");
            return false;
        }
        HashMap map = new HashMap();
        for (BacktraceBreadcrumbType backtraceBreadcrumbType : BacktraceBreadcrumbType.values()) {
            String str = "enabled";
            if (backtraceBreadcrumbType == BacktraceBreadcrumbType.CONFIGURATION) {
                map.put(backtraceBreadcrumbType.toString(), "enabled");
            }
            EnumSet<BacktraceBreadcrumbType> enumSet = this.enabledBreadcrumbTypes;
            if (enumSet == null || !enumSet.contains(backtraceBreadcrumbType)) {
                str = "disabled";
            }
            map.put(backtraceBreadcrumbType.toString(), str);
        }
        return this.backtraceBreadcrumbsLogManager.addBreadcrumb("Breadcrumbs configuration", map, BacktraceBreadcrumbType.CONFIGURATION, BacktraceBreadcrumbLevel.INFO);
    }

    private void registerAutomaticBreadcrumbReceivers() {
        unregisterAutomaticBreadcrumbReceivers();
        if (this.enabledBreadcrumbTypes == null) {
            BacktraceLogger.m7080d(LOG_TAG, "No breadcrumbs are enabled, not registering any new breadcrumb receivers");
            return;
        }
        registerBroadcastReceiver();
        if (this.enabledBreadcrumbTypes.contains(BacktraceBreadcrumbType.SYSTEM)) {
            BacktraceComponentListener backtraceComponentListener = new BacktraceComponentListener(this);
            this.backtraceComponentListener = backtraceComponentListener;
            this.context.registerComponentCallbacks(backtraceComponentListener);
            if (this.context instanceof Application) {
                BacktraceActivityLifecycleListener backtraceActivityLifecycleListener = new BacktraceActivityLifecycleListener(this);
                this.backtraceActivityLifecycleListener = backtraceActivityLifecycleListener;
                ((Application) this.context).registerActivityLifecycleCallbacks(backtraceActivityLifecycleListener);
            }
        }
    }

    private void registerBroadcastReceiver() {
        BacktraceBroadcastReceiver backtraceBroadcastReceiver = new BacktraceBroadcastReceiver(this);
        this.backtraceBroadcastReceiver = backtraceBroadcastReceiver;
        if (Build.VERSION.SDK_INT >= 33) {
            this.context.registerReceiver(backtraceBroadcastReceiver, backtraceBroadcastReceiver.getIntentFilter(), 2);
        } else {
            this.context.registerReceiver(backtraceBroadcastReceiver, backtraceBroadcastReceiver.getIntentFilter());
        }
    }

    private void unregisterAutomaticBreadcrumbReceivers() {
        if (this.backtraceBroadcastReceiver != null) {
            BacktraceLogger.m7080d(LOG_TAG, "Unregistering previous BacktraceBroadcastReceiver");
            this.context.unregisterReceiver(this.backtraceBroadcastReceiver);
            this.backtraceBroadcastReceiver = null;
        }
        if (this.backtraceComponentListener != null) {
            BacktraceLogger.m7080d(LOG_TAG, "Unregistering previous BacktraceComponentListener");
            this.context.unregisterComponentCallbacks(this.backtraceComponentListener);
            this.backtraceComponentListener = null;
        }
        if (this.backtraceActivityLifecycleListener != null) {
            if (!(this.context instanceof Application)) {
                BacktraceLogger.m7081e(LOG_TAG, "BacktraceActivityLifecycleListener registered with non-Activity context");
                return;
            }
            BacktraceLogger.m7080d(LOG_TAG, "Unregistering previous BacktraceActivityLifecycleListener");
            ((Application) this.context).unregisterActivityLifecycleCallbacks(this.backtraceActivityLifecycleListener);
            this.backtraceActivityLifecycleListener = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // backtraceio.library.interfaces.Breadcrumbs
    public boolean addBreadcrumb(String str) {
        return addBreadcrumb(str, null, BacktraceBreadcrumbType.MANUAL, BacktraceBreadcrumbLevel.INFO);
    }

    @Override // backtraceio.library.interfaces.Breadcrumbs
    public boolean clearBreadcrumbs() {
        boolean zClear = this.backtraceBreadcrumbsLogManager.clear();
        addConfigurationBreadcrumb();
        return zClear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // backtraceio.library.interfaces.Breadcrumbs
    public boolean enableBreadcrumbs(Context context) {
        return enableBreadcrumbs(context, BacktraceBreadcrumbType.ALL);
    }

    @Override // backtraceio.library.interfaces.Breadcrumbs
    public String getBreadcrumbLogPath() {
        return this.breadcrumbLogDirectory + "/" + breadcrumbLogFileName;
    }

    @Override // backtraceio.library.interfaces.Breadcrumbs
    public long getCurrentBreadcrumbId() {
        return this.backtraceBreadcrumbsLogManager.getCurrentBreadcrumbId();
    }

    @Override // backtraceio.library.interfaces.Breadcrumbs
    public EnumSet<BacktraceBreadcrumbType> getEnabledBreadcrumbTypes() {
        return this.enabledBreadcrumbTypes;
    }

    @Override // backtraceio.library.interfaces.Breadcrumbs
    public boolean isEnabled() {
        EnumSet<BacktraceBreadcrumbType> enumSet = this.enabledBreadcrumbTypes;
        return (enumSet == null || enumSet.isEmpty()) ? false : true;
    }

    @Override // backtraceio.library.interfaces.Breadcrumbs
    public void processReportBreadcrumbs(BacktraceReport backtraceReport) {
        if (isEnabled()) {
            backtraceReport.attachmentPaths.add(getBreadcrumbLogPath());
            backtraceReport.attributes.put("breadcrumbs.lastId", Long.valueOf(getCurrentBreadcrumbId()));
        }
    }

    @Override // backtraceio.library.interfaces.Breadcrumbs
    public void setCurrentBreadcrumbId(long j10) {
        this.backtraceBreadcrumbsLogManager.setCurrentBreadcrumbId(j10);
    }

    @Override // backtraceio.library.interfaces.Breadcrumbs
    public void setOnSuccessfulBreadcrumbAddEventListener(OnSuccessfulBreadcrumbAddEventListener onSuccessfulBreadcrumbAddEventListener) {
        this.onSuccessfulBreadcrumbAddEventListener = onSuccessfulBreadcrumbAddEventListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // backtraceio.library.interfaces.Breadcrumbs
    public boolean addBreadcrumb(String str, BacktraceBreadcrumbLevel backtraceBreadcrumbLevel) {
        return addBreadcrumb(str, null, BacktraceBreadcrumbType.MANUAL, backtraceBreadcrumbLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // backtraceio.library.interfaces.Breadcrumbs
    public boolean enableBreadcrumbs(Context context, EnumSet<BacktraceBreadcrumbType> enumSet) {
        return enableBreadcrumbs(context, enumSet, DEFAULT_MAX_LOG_SIZE_BYTES);
    }

    @Override // backtraceio.library.interfaces.Breadcrumbs
    public boolean addBreadcrumb(String str, Map<String, Object> map) {
        return addBreadcrumb(str, map, BacktraceBreadcrumbType.MANUAL, BacktraceBreadcrumbLevel.INFO);
    }

    @Override // backtraceio.library.interfaces.Breadcrumbs
    public boolean enableBreadcrumbs(Context context, int i10) {
        return enableBreadcrumbs(context, BacktraceBreadcrumbType.ALL, i10);
    }

    @Override // backtraceio.library.interfaces.Breadcrumbs
    public boolean addBreadcrumb(String str, Map<String, Object> map, BacktraceBreadcrumbLevel backtraceBreadcrumbLevel) {
        return addBreadcrumb(str, map, BacktraceBreadcrumbType.MANUAL, backtraceBreadcrumbLevel);
    }

    @Override // backtraceio.library.interfaces.Breadcrumbs
    public boolean enableBreadcrumbs(Context context, EnumSet<BacktraceBreadcrumbType> enumSet, int i10) {
        this.context = context;
        long currentTimeMillis = DebugHelper.getCurrentTimeMillis();
        boolean zEnableBreadcrumbs = enableBreadcrumbs(enumSet, i10);
        long currentTimeMillis2 = DebugHelper.getCurrentTimeMillis();
        BacktraceLogger.m7080d(LOG_TAG, "Enabling breadcrumbs took " + (currentTimeMillis2 - currentTimeMillis) + " milliseconds");
        return zEnableBreadcrumbs;
    }

    @Override // backtraceio.library.interfaces.Breadcrumbs
    public boolean addBreadcrumb(String str, BacktraceBreadcrumbType backtraceBreadcrumbType) {
        return addBreadcrumb(str, null, backtraceBreadcrumbType, BacktraceBreadcrumbLevel.INFO);
    }

    @Override // backtraceio.library.interfaces.Breadcrumbs
    public boolean addBreadcrumb(String str, BacktraceBreadcrumbType backtraceBreadcrumbType, BacktraceBreadcrumbLevel backtraceBreadcrumbLevel) {
        return addBreadcrumb(str, null, backtraceBreadcrumbType, backtraceBreadcrumbLevel);
    }

    @Override // backtraceio.library.interfaces.Breadcrumbs
    public boolean addBreadcrumb(String str, Map<String, Object> map, BacktraceBreadcrumbType backtraceBreadcrumbType) {
        return addBreadcrumb(str, map, backtraceBreadcrumbType, BacktraceBreadcrumbLevel.INFO);
    }

    @Override // backtraceio.library.interfaces.Breadcrumbs
    public boolean addBreadcrumb(String str, Map<String, Object> map, BacktraceBreadcrumbType backtraceBreadcrumbType, BacktraceBreadcrumbLevel backtraceBreadcrumbLevel) {
        BacktraceBreadcrumbsLogManager backtraceBreadcrumbsLogManager;
        OnSuccessfulBreadcrumbAddEventListener onSuccessfulBreadcrumbAddEventListener;
        if (!isEnabled() || (backtraceBreadcrumbsLogManager = this.backtraceBreadcrumbsLogManager) == null) {
            return false;
        }
        boolean zAddBreadcrumb = backtraceBreadcrumbsLogManager.addBreadcrumb(str, map, backtraceBreadcrumbType, backtraceBreadcrumbLevel);
        if (zAddBreadcrumb && (onSuccessfulBreadcrumbAddEventListener = this.onSuccessfulBreadcrumbAddEventListener) != null) {
            onSuccessfulBreadcrumbAddEventListener.onSuccessfulAdd(getCurrentBreadcrumbId());
        }
        return zAddBreadcrumb;
    }

    private boolean enableBreadcrumbs(EnumSet<BacktraceBreadcrumbType> enumSet, int i10) {
        if (this.backtraceBreadcrumbsLogManager == null) {
            try {
                this.backtraceBreadcrumbsLogManager = new BacktraceBreadcrumbsLogManager(this.breadcrumbLogDirectory + "/" + breadcrumbLogFileName, i10);
            } catch (Exception e10) {
                BacktraceLogger.m7081e(LOG_TAG, "Could not start the Breadcrumb logger due to: " + e10.getMessage());
                return false;
            }
        }
        this.enabledBreadcrumbTypes = enumSet;
        registerAutomaticBreadcrumbReceivers();
        addConfigurationBreadcrumb();
        return true;
    }
}
