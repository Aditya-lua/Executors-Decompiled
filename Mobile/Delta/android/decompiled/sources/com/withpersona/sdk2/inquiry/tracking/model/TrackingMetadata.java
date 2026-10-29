package com.withpersona.sdk2.inquiry.tracking.model;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.g;
import um.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b1\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B÷\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0003\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010>\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010?\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010@\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010A\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010B\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019HÆ\u0003Jþ\u0001\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\t2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020KHÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\b\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010*\u001a\u0004\b+\u0010)R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\u0011\u0010\"R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\u0014\u0010\"R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\u0015\u0010\"R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u001f\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006M"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "", "sdk", "", "sdkVersion", "appVersion", "appNamespace", "deviceModel", "isSimulator", "", "osVersion", "connectionType", "cellularTechnology", "thermalState", "systemAvailableMemoryMb", "", "batteryLevel", "isLowPowerMode", "appMemoryUsageMb", "", "isCharging", "isBackgrounded", "locale", "timezone", "featureFlags", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getSdk", "()Ljava/lang/String;", "getSdkVersion", "getAppVersion", "getAppNamespace", "getDeviceModel", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOsVersion", "getConnectionType", "getCellularTechnology", "getThermalState", "getSystemAvailableMemoryMb", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBatteryLevel", "getAppMemoryUsageMb", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLocale", "getTimezone", "getFeatureFlags", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "equals", "other", "hashCode", "", "toString", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = true)
public final /* data */ class TrackingMetadata {

    @Nullable
    private final Long appMemoryUsageMb;

    @Nullable
    private final String appNamespace;

    @Nullable
    private final String appVersion;

    @Nullable
    private final Double batteryLevel;

    @Nullable
    private final String cellularTechnology;

    @Nullable
    private final String connectionType;

    @Nullable
    private final String deviceModel;

    @Nullable
    private final Map<String, Boolean> featureFlags;

    @Nullable
    private final Boolean isBackgrounded;

    @Nullable
    private final Boolean isCharging;

    @Nullable
    private final Boolean isLowPowerMode;

    @Nullable
    private final Boolean isSimulator;

    @Nullable
    private final String locale;

    @Nullable
    private final String osVersion;

    @Nullable
    private final String sdk;

    @Nullable
    private final String sdkVersion;

    @Nullable
    private final Double systemAvailableMemoryMb;

    @Nullable
    private final String thermalState;

    @Nullable
    private final String timezone;

    public TrackingMetadata() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrackingMetadata copy$default(TrackingMetadata trackingMetadata, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, Double d10, Double d11, Boolean bool2, Long l10, Boolean bool3, Boolean bool4, String str10, String str11, Map map, int i10, Object obj) {
        Map map2;
        String str12;
        String str13 = (i10 & 1) != 0 ? trackingMetadata.sdk : str;
        String str14 = (i10 & 2) != 0 ? trackingMetadata.sdkVersion : str2;
        String str15 = (i10 & 4) != 0 ? trackingMetadata.appVersion : str3;
        String str16 = (i10 & 8) != 0 ? trackingMetadata.appNamespace : str4;
        String str17 = (i10 & 16) != 0 ? trackingMetadata.deviceModel : str5;
        Boolean bool5 = (i10 & 32) != 0 ? trackingMetadata.isSimulator : bool;
        String str18 = (i10 & 64) != 0 ? trackingMetadata.osVersion : str6;
        String str19 = (i10 & 128) != 0 ? trackingMetadata.connectionType : str7;
        String str20 = (i10 & Barcode.FORMAT_QR_CODE) != 0 ? trackingMetadata.cellularTechnology : str8;
        String str21 = (i10 & Barcode.FORMAT_UPC_A) != 0 ? trackingMetadata.thermalState : str9;
        Double d12 = (i10 & Barcode.FORMAT_UPC_E) != 0 ? trackingMetadata.systemAvailableMemoryMb : d10;
        Double d13 = (i10 & Barcode.FORMAT_PDF417) != 0 ? trackingMetadata.batteryLevel : d11;
        Boolean bool6 = (i10 & Barcode.FORMAT_AZTEC) != 0 ? trackingMetadata.isLowPowerMode : bool2;
        Long l11 = (i10 & 8192) != 0 ? trackingMetadata.appMemoryUsageMb : l10;
        String str22 = str13;
        Boolean bool7 = (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? trackingMetadata.isCharging : bool3;
        Boolean bool8 = (i10 & 32768) != 0 ? trackingMetadata.isBackgrounded : bool4;
        String str23 = (i10 & 65536) != 0 ? trackingMetadata.locale : str10;
        String str24 = (i10 & 131072) != 0 ? trackingMetadata.timezone : str11;
        if ((i10 & 262144) != 0) {
            str12 = str24;
            map2 = trackingMetadata.featureFlags;
        } else {
            map2 = map;
            str12 = str24;
        }
        return trackingMetadata.copy(str22, str14, str15, str16, str17, bool5, str18, str19, str20, str21, d12, d13, bool6, l11, bool7, bool8, str23, str12, map2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSdk() {
        return this.sdk;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getThermalState() {
        return this.thermalState;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Double getSystemAvailableMemoryMb() {
        return this.systemAvailableMemoryMb;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Double getBatteryLevel() {
        return this.batteryLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getIsLowPowerMode() {
        return this.isLowPowerMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Long getAppMemoryUsageMb() {
        return this.appMemoryUsageMb;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getIsCharging() {
        return this.isCharging;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getIsBackgrounded() {
        return this.isBackgrounded;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getTimezone() {
        return this.timezone;
    }

    @Nullable
    public final Map<String, Boolean> component19() {
        return this.featureFlags;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppNamespace() {
        return this.appNamespace;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsSimulator() {
        return this.isSimulator;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getConnectionType() {
        return this.connectionType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCellularTechnology() {
        return this.cellularTechnology;
    }

    @NotNull
    public final TrackingMetadata copy(@Nullable String sdk, @g(name = "sdk_version") @Nullable String sdkVersion, @g(name = "app_version") @Nullable String appVersion, @g(name = "app_namespace") @Nullable String appNamespace, @g(name = Payload.DEVICE_MODEL) @Nullable String deviceModel, @g(name = "is_simulator") @Nullable Boolean isSimulator, @g(name = "os_version") @Nullable String osVersion, @g(name = "connection_type") @Nullable String connectionType, @g(name = "cellular_technology") @Nullable String cellularTechnology, @g(name = "thermal_state") @Nullable String thermalState, @g(name = "system_available_memory_mb") @Nullable Double systemAvailableMemoryMb, @g(name = "battery_level") @Nullable Double batteryLevel, @g(name = "is_low_power_mode") @Nullable Boolean isLowPowerMode, @g(name = "app_memory_usage_mb") @Nullable Long appMemoryUsageMb, @g(name = "is_charging") @Nullable Boolean isCharging, @g(name = "is_backgrounded") @Nullable Boolean isBackgrounded, @Nullable String locale, @Nullable String timezone, @g(name = "feature_flags") @Nullable Map<String, Boolean> featureFlags) {
        return new TrackingMetadata(sdk, sdkVersion, appVersion, appNamespace, deviceModel, isSimulator, osVersion, connectionType, cellularTechnology, thermalState, systemAvailableMemoryMb, batteryLevel, isLowPowerMode, appMemoryUsageMb, isCharging, isBackgrounded, locale, timezone, featureFlags);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackingMetadata)) {
            return false;
        }
        TrackingMetadata trackingMetadata = (TrackingMetadata) other;
        return Intrinsics.c(this.sdk, trackingMetadata.sdk) && Intrinsics.c(this.sdkVersion, trackingMetadata.sdkVersion) && Intrinsics.c(this.appVersion, trackingMetadata.appVersion) && Intrinsics.c(this.appNamespace, trackingMetadata.appNamespace) && Intrinsics.c(this.deviceModel, trackingMetadata.deviceModel) && Intrinsics.c(this.isSimulator, trackingMetadata.isSimulator) && Intrinsics.c(this.osVersion, trackingMetadata.osVersion) && Intrinsics.c(this.connectionType, trackingMetadata.connectionType) && Intrinsics.c(this.cellularTechnology, trackingMetadata.cellularTechnology) && Intrinsics.c(this.thermalState, trackingMetadata.thermalState) && Intrinsics.c(this.systemAvailableMemoryMb, trackingMetadata.systemAvailableMemoryMb) && Intrinsics.c(this.batteryLevel, trackingMetadata.batteryLevel) && Intrinsics.c(this.isLowPowerMode, trackingMetadata.isLowPowerMode) && Intrinsics.c(this.appMemoryUsageMb, trackingMetadata.appMemoryUsageMb) && Intrinsics.c(this.isCharging, trackingMetadata.isCharging) && Intrinsics.c(this.isBackgrounded, trackingMetadata.isBackgrounded) && Intrinsics.c(this.locale, trackingMetadata.locale) && Intrinsics.c(this.timezone, trackingMetadata.timezone) && Intrinsics.c(this.featureFlags, trackingMetadata.featureFlags);
    }

    @Nullable
    public final Long getAppMemoryUsageMb() {
        return this.appMemoryUsageMb;
    }

    @Nullable
    public final String getAppNamespace() {
        return this.appNamespace;
    }

    @Nullable
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    public final Double getBatteryLevel() {
        return this.batteryLevel;
    }

    @Nullable
    public final String getCellularTechnology() {
        return this.cellularTechnology;
    }

    @Nullable
    public final String getConnectionType() {
        return this.connectionType;
    }

    @Nullable
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @Nullable
    public final Map<String, Boolean> getFeatureFlags() {
        return this.featureFlags;
    }

    @Nullable
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    public final String getOsVersion() {
        return this.osVersion;
    }

    @Nullable
    public final String getSdk() {
        return this.sdk;
    }

    @Nullable
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @Nullable
    public final Double getSystemAvailableMemoryMb() {
        return this.systemAvailableMemoryMb;
    }

    @Nullable
    public final String getThermalState() {
        return this.thermalState;
    }

    @Nullable
    public final String getTimezone() {
        return this.timezone;
    }

    public int hashCode() {
        String str = this.sdk;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sdkVersion;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appVersion;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appNamespace;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deviceModel;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isSimulator;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.osVersion;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.connectionType;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cellularTechnology;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.thermalState;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Double d10 = this.systemAvailableMemoryMb;
        int iHashCode11 = (iHashCode10 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.batteryLevel;
        int iHashCode12 = (iHashCode11 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Boolean bool2 = this.isLowPowerMode;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l10 = this.appMemoryUsageMb;
        int iHashCode14 = (iHashCode13 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Boolean bool3 = this.isCharging;
        int iHashCode15 = (iHashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isBackgrounded;
        int iHashCode16 = (iHashCode15 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str10 = this.locale;
        int iHashCode17 = (iHashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.timezone;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Map<String, Boolean> map = this.featureFlags;
        return iHashCode18 + (map != null ? map.hashCode() : 0);
    }

    @Nullable
    public final Boolean isBackgrounded() {
        return this.isBackgrounded;
    }

    @Nullable
    public final Boolean isCharging() {
        return this.isCharging;
    }

    @Nullable
    public final Boolean isLowPowerMode() {
        return this.isLowPowerMode;
    }

    @Nullable
    public final Boolean isSimulator() {
        return this.isSimulator;
    }

    @NotNull
    public String toString() {
        return "TrackingMetadata(sdk=" + this.sdk + ", sdkVersion=" + this.sdkVersion + ", appVersion=" + this.appVersion + ", appNamespace=" + this.appNamespace + ", deviceModel=" + this.deviceModel + ", isSimulator=" + this.isSimulator + ", osVersion=" + this.osVersion + ", connectionType=" + this.connectionType + ", cellularTechnology=" + this.cellularTechnology + ", thermalState=" + this.thermalState + ", systemAvailableMemoryMb=" + this.systemAvailableMemoryMb + ", batteryLevel=" + this.batteryLevel + ", isLowPowerMode=" + this.isLowPowerMode + ", appMemoryUsageMb=" + this.appMemoryUsageMb + ", isCharging=" + this.isCharging + ", isBackgrounded=" + this.isBackgrounded + ", locale=" + this.locale + ", timezone=" + this.timezone + ", featureFlags=" + this.featureFlags + ")";
    }

    public TrackingMetadata(@Nullable String str, @g(name = "sdk_version") @Nullable String str2, @g(name = "app_version") @Nullable String str3, @g(name = "app_namespace") @Nullable String str4, @g(name = Payload.DEVICE_MODEL) @Nullable String str5, @g(name = "is_simulator") @Nullable Boolean bool, @g(name = "os_version") @Nullable String str6, @g(name = "connection_type") @Nullable String str7, @g(name = "cellular_technology") @Nullable String str8, @g(name = "thermal_state") @Nullable String str9, @g(name = "system_available_memory_mb") @Nullable Double d10, @g(name = "battery_level") @Nullable Double d11, @g(name = "is_low_power_mode") @Nullable Boolean bool2, @g(name = "app_memory_usage_mb") @Nullable Long l10, @g(name = "is_charging") @Nullable Boolean bool3, @g(name = "is_backgrounded") @Nullable Boolean bool4, @Nullable String str10, @Nullable String str11, @g(name = "feature_flags") @Nullable Map<String, Boolean> map) {
        this.sdk = str;
        this.sdkVersion = str2;
        this.appVersion = str3;
        this.appNamespace = str4;
        this.deviceModel = str5;
        this.isSimulator = bool;
        this.osVersion = str6;
        this.connectionType = str7;
        this.cellularTechnology = str8;
        this.thermalState = str9;
        this.systemAvailableMemoryMb = d10;
        this.batteryLevel = d11;
        this.isLowPowerMode = bool2;
        this.appMemoryUsageMb = l10;
        this.isCharging = bool3;
        this.isBackgrounded = bool4;
        this.locale = str10;
        this.timezone = str11;
        this.featureFlags = map;
    }

    public /* synthetic */ TrackingMetadata(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, Double d10, Double d11, Boolean bool2, Long l10, Boolean bool3, Boolean bool4, String str10, String str11, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : bool, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : str7, (i10 & Barcode.FORMAT_QR_CODE) != 0 ? null : str8, (i10 & Barcode.FORMAT_UPC_A) != 0 ? null : str9, (i10 & Barcode.FORMAT_UPC_E) != 0 ? null : d10, (i10 & Barcode.FORMAT_PDF417) != 0 ? null : d11, (i10 & Barcode.FORMAT_AZTEC) != 0 ? null : bool2, (i10 & 8192) != 0 ? null : l10, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : bool3, (i10 & 32768) != 0 ? null : bool4, (i10 & 65536) != 0 ? null : str10, (i10 & 131072) != 0 ? null : str11, (i10 & 262144) != 0 ? null : map);
    }
}
