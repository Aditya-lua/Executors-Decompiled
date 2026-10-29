package com.withpersona.sdk2.inquiry.tracking;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import androidx.core.os.EnvironmentCompat;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.C0959h0;
import com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p582yn.C13249l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\u000fJ\u0006\u0010\u0013\u001a\u00020\u0014J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\rH\u0002J\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0002\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sdk", "", "sdkVersion", "appVersion", "appNamespace", "deviceModel", "isSimulator", "", "featureFlags", "", "setFeatureFlags", "", "flags", "collect", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "getConnectionType", "getCellularTechnology", "getThermalState", "getSystemAvailableMemoryMb", "", "getBatteryLevel", "()Ljava/lang/Double;", "getIsLowPowerMode", "getAppMemoryUsageMb", "", "()Ljava/lang/Long;", "getIsCharging", "()Ljava/lang/Boolean;", "getIsBackgrounded", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class TrackingMetadataProvider {

    @NotNull
    private final String appNamespace;

    @Nullable
    private final String appVersion;

    @NotNull
    private final Context context;

    @NotNull
    private final String deviceModel;

    @Nullable
    private volatile Map<String, Boolean> featureFlags;
    private final boolean isSimulator;

    @NotNull
    private final String sdk;

    @NotNull
    private final String sdkVersion;

    public TrackingMetadataProvider(@NotNull Context context) {
        Object objM30460b;
        context.getClass();
        this.context = context;
        this.sdk = "persona-android";
        this.sdkVersion = "2.51.0";
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        this.appVersion = (String) (C7347n.m30465g(objM30460b) ? null : objM30460b);
        String packageName = this.context.getPackageName();
        packageName.getClass();
        this.appNamespace = packageName;
        this.deviceModel = Build.MANUFACTURER + " " + Build.MODEL;
        this.isSimulator = C13249l.m49002a();
    }

    private final Long getAppMemoryUsageMb() {
        Runtime runtime = Runtime.getRuntime();
        if (runtime == null) {
            return null;
        }
        return Long.valueOf((runtime.totalMemory() - runtime.freeMemory()) / ((long) 1048576));
    }

    private final Double getBatteryLevel() {
        int intProperty;
        Object systemService = this.context.getSystemService("batterymanager");
        BatteryManager batteryManager = systemService instanceof BatteryManager ? (BatteryManager) systemService : null;
        if (batteryManager != null && (intProperty = batteryManager.getIntProperty(4)) >= 0) {
            return Double.valueOf(((double) intProperty) / 100.0d);
        }
        return null;
    }

    private final String getCellularTechnology() {
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Object systemService = this.context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager == null) {
            return null;
        }
        int dataNetworkType = telephonyManager.getDataNetworkType();
        if (dataNetworkType == 20) {
            return "5g";
        }
        switch (dataNetworkType) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2g";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3g";
            case 13:
                return "4g";
            default:
                return null;
        }
    }

    private final String getConnectionType() {
        Object systemService = this.context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return null;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return "offline";
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        return networkCapabilities.hasTransport(0) ? "cellular" : EnvironmentCompat.MEDIA_UNKNOWN;
    }

    private final boolean getIsBackgrounded() {
        return !C0959h0.INSTANCE.m4917a().mo4656a().mo4936b().m4945b(AbstractC0966l.b.STARTED);
    }

    private final Boolean getIsCharging() {
        Object systemService = this.context.getSystemService("batterymanager");
        BatteryManager batteryManager = systemService instanceof BatteryManager ? (BatteryManager) systemService : null;
        if (batteryManager == null) {
            return null;
        }
        return Boolean.valueOf(batteryManager.isCharging());
    }

    private final boolean getIsLowPowerMode() {
        Object systemService = this.context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            return false;
        }
        return powerManager.isPowerSaveMode();
    }

    private final double getSystemAvailableMemoryMb() {
        Object systemService = this.context.getSystemService("activity");
        systemService.getClass();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem / 1048576.0d;
    }

    private final String getThermalState() {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        Object systemService = this.context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            return null;
        }
        switch (powerManager.getCurrentThermalStatus()) {
            case 0:
                return "nominal";
            case 1:
            case 2:
                return "fair";
            case 3:
                return "serious";
            case 4:
            case 5:
            case 6:
                return "critical";
            default:
                return null;
        }
    }

    @NotNull
    public final TrackingMetadata collect() {
        Object objM30460b;
        Object objM30460b2;
        Object objM30460b3;
        Object objM30460b4;
        Object objM30460b5;
        Object objM30460b6;
        Object objM30460b7;
        Object objM30460b8;
        Object objM30460b9;
        Object objM30460b10;
        String str = this.sdk;
        String str2 = this.sdkVersion;
        String str3 = this.appVersion;
        String str4 = this.appNamespace;
        String str5 = this.deviceModel;
        Boolean boolValueOf = Boolean.valueOf(this.isSimulator);
        String str6 = Build.VERSION.RELEASE;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(getConnectionType());
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        if (C7347n.m30465g(objM30460b)) {
            objM30460b = null;
        }
        String str7 = (String) objM30460b;
        try {
            objM30460b2 = C7347n.m30460b(getCellularTechnology());
        } catch (Throwable th3) {
            C7347n.Companion companion3 = C7347n.INSTANCE;
            objM30460b2 = C7347n.m30460b(C7348o.m30469a(th3));
        }
        if (C7347n.m30465g(objM30460b2)) {
            objM30460b2 = null;
        }
        String str8 = (String) objM30460b2;
        try {
            objM30460b3 = C7347n.m30460b(getThermalState());
        } catch (Throwable th4) {
            C7347n.Companion companion4 = C7347n.INSTANCE;
            objM30460b3 = C7347n.m30460b(C7348o.m30469a(th4));
        }
        if (C7347n.m30465g(objM30460b3)) {
            objM30460b3 = null;
        }
        String str9 = (String) objM30460b3;
        try {
            objM30460b4 = C7347n.m30460b(Double.valueOf(getSystemAvailableMemoryMb()));
        } catch (Throwable th5) {
            C7347n.Companion companion5 = C7347n.INSTANCE;
            objM30460b4 = C7347n.m30460b(C7348o.m30469a(th5));
        }
        if (C7347n.m30465g(objM30460b4)) {
            objM30460b4 = null;
        }
        Double d10 = (Double) objM30460b4;
        try {
            objM30460b5 = C7347n.m30460b(getBatteryLevel());
        } catch (Throwable th6) {
            C7347n.Companion companion6 = C7347n.INSTANCE;
            objM30460b5 = C7347n.m30460b(C7348o.m30469a(th6));
        }
        if (C7347n.m30465g(objM30460b5)) {
            objM30460b5 = null;
        }
        Double d11 = (Double) objM30460b5;
        try {
            objM30460b6 = C7347n.m30460b(Boolean.valueOf(getIsLowPowerMode()));
        } catch (Throwable th7) {
            C7347n.Companion companion7 = C7347n.INSTANCE;
            objM30460b6 = C7347n.m30460b(C7348o.m30469a(th7));
        }
        if (C7347n.m30465g(objM30460b6)) {
            objM30460b6 = null;
        }
        Boolean bool = (Boolean) objM30460b6;
        Long appMemoryUsageMb = getAppMemoryUsageMb();
        try {
            objM30460b7 = C7347n.m30460b(getIsCharging());
        } catch (Throwable th8) {
            C7347n.Companion companion8 = C7347n.INSTANCE;
            objM30460b7 = C7347n.m30460b(C7348o.m30469a(th8));
        }
        if (C7347n.m30465g(objM30460b7)) {
            objM30460b7 = null;
        }
        Boolean bool2 = (Boolean) objM30460b7;
        try {
            objM30460b8 = C7347n.m30460b(Boolean.valueOf(getIsBackgrounded()));
        } catch (Throwable th9) {
            C7347n.Companion companion9 = C7347n.INSTANCE;
            objM30460b8 = C7347n.m30460b(C7348o.m30469a(th9));
        }
        if (C7347n.m30465g(objM30460b8)) {
            objM30460b8 = null;
        }
        Boolean bool3 = (Boolean) objM30460b8;
        try {
            objM30460b9 = C7347n.m30460b(Locale.getDefault().toString());
        } catch (Throwable th10) {
            C7347n.Companion companion10 = C7347n.INSTANCE;
            objM30460b9 = C7347n.m30460b(C7348o.m30469a(th10));
        }
        if (C7347n.m30465g(objM30460b9)) {
            objM30460b9 = null;
        }
        String str10 = (String) objM30460b9;
        try {
            objM30460b10 = C7347n.m30460b(TimeZone.getDefault().getID());
        } catch (Throwable th11) {
            C7347n.Companion companion11 = C7347n.INSTANCE;
            objM30460b10 = C7347n.m30460b(C7348o.m30469a(th11));
        }
        return new TrackingMetadata(str, str2, str3, str4, str5, boolValueOf, str6, str7, str8, str9, d10, d11, bool, appMemoryUsageMb, bool2, bool3, str10, (String) (C7347n.m30465g(objM30460b10) ? null : objM30460b10), this.featureFlags);
    }

    public final void setFeatureFlags(@NotNull Map<String, Boolean> flags) {
        flags.getClass();
        this.featureFlags = flags;
    }
}
