package backtraceio.library.models.json;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import backtraceio.library.base.BacktraceBase;
import backtraceio.library.common.ApplicationMetadataCache;
import backtraceio.library.common.BacktraceStringHelper;
import backtraceio.library.common.DeviceAttributesHelper;
import backtraceio.library.enums.ScreenOrientation;
import backtraceio.library.models.attributes.ReportDataAttributes;
import backtraceio.library.models.attributes.ReportDataBuilder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceAttributes {
    private static final String sessionId = UUID.randomUUID().toString();
    public Map<String, String> attributes;
    private final Map<String, Object> complexAttributes;
    private final Context context;

    public BacktraceAttributes(Context context, BacktraceReport backtraceReport, Map<String, Object> map) {
        this(context, backtraceReport, map, Boolean.TRUE);
    }

    private void convertAttributes(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        ReportDataAttributes reportAttributes = ReportDataBuilder.getReportAttributes(map);
        this.attributes.putAll(reportAttributes.getAttributes());
        this.complexAttributes.putAll(reportAttributes.getAnnotations());
    }

    private void convertReportAttributes(BacktraceReport backtraceReport) {
        convertAttributes(BacktraceReport.concatAttributes(backtraceReport, null));
        if (backtraceReport.exceptionTypeReport.booleanValue()) {
            this.complexAttributes.put("Exception properties", backtraceReport.exception);
        }
    }

    private int getScreenBrightness() {
        return Settings.System.getInt(this.context.getContentResolver(), "screen_brightness", 0);
    }

    private ScreenOrientation getScreenOrientation() {
        int i10 = this.context.getResources().getConfiguration().orientation;
        if (i10 == 1) {
            return ScreenOrientation.PORTRAIT;
        }
        return i10 == 2 ? ScreenOrientation.LANDSCAPE : ScreenOrientation.UNDEFINED;
    }

    private void setAppInformation() {
        ApplicationMetadataCache applicationMetadataCache = ApplicationMetadataCache.getInstance(this.context);
        this.attributes.put("application.package", applicationMetadataCache.getPackageName());
        this.attributes.put("application", applicationMetadataCache.getApplicationName());
        String applicationVersion = applicationMetadataCache.getApplicationVersion();
        if (!BacktraceStringHelper.isNullOrEmpty(applicationVersion)) {
            this.attributes.put("application.version", applicationVersion);
            this.attributes.put("version", applicationVersion);
        }
        this.attributes.put("application.session", sessionId);
        this.attributes.put("backtrace.agent", "backtrace-android");
        this.attributes.put("backtrace.version", BacktraceBase.version);
    }

    private void setDeviceInformation(Boolean bool) {
        this.attributes.put("uname.version", Build.VERSION.RELEASE);
        this.attributes.put("culture", Locale.getDefault().getDisplayLanguage());
        this.attributes.put("build.type", "Release");
        this.attributes.put("device.model", Build.MODEL);
        this.attributes.put("device.brand", Build.BRAND);
        this.attributes.put("device.product", Build.PRODUCT);
        this.attributes.put("device.sdk", String.valueOf(Build.VERSION.SDK_INT));
        this.attributes.put("device.manufacturer", Build.MANUFACTURER);
        this.attributes.put("device.os_version", System.getProperty("os.version"));
        this.attributes.putAll(new DeviceAttributesHelper(this.context).getDeviceAttributes(bool));
    }

    private void setExceptionAttributes(BacktraceReport backtraceReport) {
        if (backtraceReport == null) {
            return;
        }
        if (!backtraceReport.exceptionTypeReport.booleanValue()) {
            this.attributes.put("error.message", backtraceReport.message);
        } else {
            this.attributes.put("classifier", backtraceReport.classifier);
            this.attributes.put("error.message", backtraceReport.exception.getMessage());
        }
    }

    private void setScreenInformation(Boolean bool) {
        Display defaultDisplay = ((WindowManager) this.context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        this.attributes.put("screen.width", String.valueOf(displayMetrics.widthPixels));
        this.attributes.put("screen.height", String.valueOf(displayMetrics.heightPixels));
        this.attributes.put("screen.dpi", String.valueOf(displayMetrics.densityDpi));
        if (bool.booleanValue()) {
            this.attributes.put("screen.orientation", getScreenOrientation().toString());
            this.attributes.put("screen.brightness", String.valueOf(getScreenBrightness()));
        }
    }

    public Map<String, Object> getAllAttributes() {
        HashMap map = new HashMap();
        map.putAll(this.attributes);
        map.putAll(this.complexAttributes);
        return map;
    }

    public Map<String, Object> getComplexAttributes() {
        return this.complexAttributes;
    }

    public BacktraceAttributes(Context context, Map<String, Object> map) {
        this(context, null, map, Boolean.FALSE);
    }

    public BacktraceAttributes(Context context, BacktraceReport backtraceReport, Map<String, Object> map, Boolean bool) {
        this.attributes = new HashMap();
        this.complexAttributes = new HashMap();
        this.context = context;
        if (backtraceReport != null) {
            convertReportAttributes(backtraceReport);
            setExceptionAttributes(backtraceReport);
        }
        if (map != null) {
            convertAttributes(map);
        }
        if (backtraceReport != null && map != null) {
            BacktraceReport.concatAttributes(backtraceReport, map);
        }
        setAppInformation();
        setDeviceInformation(bool);
        setScreenInformation(bool);
    }
}
