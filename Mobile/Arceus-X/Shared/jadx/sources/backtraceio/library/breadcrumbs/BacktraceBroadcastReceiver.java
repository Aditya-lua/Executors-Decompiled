package backtraceio.library.breadcrumbs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import backtraceio.library.enums.BacktraceBreadcrumbType;
import backtraceio.library.logger.BacktraceLogger;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceBroadcastReceiver extends BroadcastReceiver {
    private static final transient String LOG_TAG = "BacktraceBroadcastReceiver";
    private final BacktraceBreadcrumbs backtraceBreadcrumbs;

    public BacktraceBroadcastReceiver(@NotNull BacktraceBreadcrumbs backtraceBreadcrumbs) {
        this.backtraceBreadcrumbs = backtraceBreadcrumbs;
    }

    public IntentFilter getIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        EnumSet<BacktraceBreadcrumbType> enabledBreadcrumbTypes = this.backtraceBreadcrumbs.getEnabledBreadcrumbTypes();
        if (enabledBreadcrumbTypes != null) {
            if (enabledBreadcrumbTypes.contains(BacktraceBreadcrumbType.USER)) {
                intentFilter.addAction("android.appwidget.action.APPWIDGET_DELETED");
                intentFilter.addAction("android.appwidget.action.APPWIDGET_DISABLED");
                intentFilter.addAction("android.appwidget.action.APPWIDGET_ENABLED");
                intentFilter.addAction("android.intent.action.CAMERA_BUTTON");
                intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
                intentFilter.addAction("android.intent.action.DOCK_EVENT");
                intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            }
            if (enabledBreadcrumbTypes.contains(BacktraceBreadcrumbType.SYSTEM)) {
                intentFilter.addAction("android.appwidget.action.APPWIDGET_HOST_RESTORED");
                intentFilter.addAction("android.appwidget.action.APPWIDGET_RESTORED");
                intentFilter.addAction("android.appwidget.action.APPWIDGET_UPDATE");
                intentFilter.addAction("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS");
                intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                intentFilter.addAction("android.intent.action.ACTION_SHUTDOWN");
                intentFilter.addAction("android.intent.action.BATTERY_LOW");
                intentFilter.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter.addAction("android.intent.action.BOOT_COMPLETED");
                intentFilter.addAction("android.intent.action.CONTENT_CHANGED");
                intentFilter.addAction("android.intent.action.DATE_CHANGED");
                intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter.addAction("android.intent.action.INPUT_METHOD_CHANGED");
                intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
                intentFilter.addAction("android.intent.action.REBOOT");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter.addAction("android.intent.action.TIME_SET");
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            }
            if (enabledBreadcrumbTypes.contains(BacktraceBreadcrumbType.NAVIGATION)) {
                intentFilter.addAction("android.intent.action.DREAMING_STARTED");
                intentFilter.addAction("android.intent.action.DREAMING_STOPPED");
            }
        }
        return intentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        HashMap map;
        String action = intent.getAction();
        if (action == null) {
            BacktraceLogger.m7081e(LOG_TAG, "Null action received. This is a bug");
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null || extras.keySet() == null) {
            map = null;
        } else {
            Set<String> setKeySet = extras.keySet();
            map = new HashMap();
            for (String str : setKeySet) {
                map.put(str, extras.get(str));
            }
        }
        this.backtraceBreadcrumbs.addBreadcrumb(action, map, BacktraceBreadcrumbType.SYSTEM);
    }
}
