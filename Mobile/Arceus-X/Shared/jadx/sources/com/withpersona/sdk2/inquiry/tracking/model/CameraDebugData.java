package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11872g;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0092\u0001\u0010*\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0007\u0010\u0018R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0015\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\r\u0010\u0018R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001e\u0010\u0018R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u000f\u0010\u0018¨\u00061"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;", "", "deviceType", "", "lensAperture", "", "systemPressureLevel", "isLowLightBoostEnabled", "", "currentIso", "currentExposureDuration", "currentZoomFactor", "autoFocusSystem", "isVirtualDevice", "hasFlash", "isFlashAvailable", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getDeviceType", "()Ljava/lang/String;", "getLensAperture", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSystemPressureLevel", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCurrentIso", "getCurrentExposureDuration", "getCurrentZoomFactor", "getAutoFocusSystem", "getHasFlash", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;", "equals", "other", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final /* data */ class CameraDebugData {

    @Nullable
    private final String autoFocusSystem;

    @Nullable
    private final Double currentExposureDuration;

    @Nullable
    private final Double currentIso;

    @Nullable
    private final Double currentZoomFactor;

    @Nullable
    private final String deviceType;

    @Nullable
    private final Boolean hasFlash;

    @Nullable
    private final Boolean isFlashAvailable;

    @Nullable
    private final Boolean isLowLightBoostEnabled;

    @Nullable
    private final Boolean isVirtualDevice;

    @Nullable
    private final Double lensAperture;

    @Nullable
    private final String systemPressureLevel;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CameraDebugData() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ CameraDebugData copy$default(CameraDebugData cameraDebugData, String str, Double d10, String str2, Boolean bool, Double d11, Double d12, Double d13, String str3, Boolean bool2, Boolean bool3, Boolean bool4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cameraDebugData.deviceType;
        }
        if ((i10 & 2) != 0) {
            d10 = cameraDebugData.lensAperture;
        }
        if ((i10 & 4) != 0) {
            str2 = cameraDebugData.systemPressureLevel;
        }
        if ((i10 & 8) != 0) {
            bool = cameraDebugData.isLowLightBoostEnabled;
        }
        if ((i10 & 16) != 0) {
            d11 = cameraDebugData.currentIso;
        }
        if ((i10 & 32) != 0) {
            d12 = cameraDebugData.currentExposureDuration;
        }
        if ((i10 & 64) != 0) {
            d13 = cameraDebugData.currentZoomFactor;
        }
        if ((i10 & 128) != 0) {
            str3 = cameraDebugData.autoFocusSystem;
        }
        if ((i10 & 256) != 0) {
            bool2 = cameraDebugData.isVirtualDevice;
        }
        if ((i10 & 512) != 0) {
            bool3 = cameraDebugData.hasFlash;
        }
        if ((i10 & 1024) != 0) {
            bool4 = cameraDebugData.isFlashAvailable;
        }
        Boolean bool5 = bool3;
        Boolean bool6 = bool4;
        String str4 = str3;
        Boolean bool7 = bool2;
        Double d14 = d12;
        Double d15 = d13;
        Double d16 = d11;
        String str5 = str2;
        return cameraDebugData.copy(str, d10, str5, bool, d16, d14, d15, str4, bool7, bool5, bool6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getHasFlash() {
        return this.hasFlash;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getIsFlashAvailable() {
        return this.isFlashAvailable;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getLensAperture() {
        return this.lensAperture;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSystemPressureLevel() {
        return this.systemPressureLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsLowLightBoostEnabled() {
        return this.isLowLightBoostEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getCurrentIso() {
        return this.currentIso;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getCurrentExposureDuration() {
        return this.currentExposureDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getCurrentZoomFactor() {
        return this.currentZoomFactor;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAutoFocusSystem() {
        return this.autoFocusSystem;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsVirtualDevice() {
        return this.isVirtualDevice;
    }

    @NotNull
    public final CameraDebugData copy(@InterfaceC11872g(name = "device_type") @Nullable String deviceType, @InterfaceC11872g(name = "lens_aperture") @Nullable Double lensAperture, @InterfaceC11872g(name = "system_pressure_level") @Nullable String systemPressureLevel, @InterfaceC11872g(name = "is_low_light_boost_enabled") @Nullable Boolean isLowLightBoostEnabled, @InterfaceC11872g(name = "current_iso") @Nullable Double currentIso, @InterfaceC11872g(name = "current_exposure_duration") @Nullable Double currentExposureDuration, @InterfaceC11872g(name = "current_zoom_factor") @Nullable Double currentZoomFactor, @InterfaceC11872g(name = "auto_focus_system") @Nullable String autoFocusSystem, @InterfaceC11872g(name = "is_virtual_device") @Nullable Boolean isVirtualDevice, @InterfaceC11872g(name = "has_flash") @Nullable Boolean hasFlash, @InterfaceC11872g(name = "is_flash_available") @Nullable Boolean isFlashAvailable) {
        return new CameraDebugData(deviceType, lensAperture, systemPressureLevel, isLowLightBoostEnabled, currentIso, currentExposureDuration, currentZoomFactor, autoFocusSystem, isVirtualDevice, hasFlash, isFlashAvailable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraDebugData)) {
            return false;
        }
        CameraDebugData cameraDebugData = (CameraDebugData) other;
        return Intrinsics.m31980c(this.deviceType, cameraDebugData.deviceType) && Intrinsics.m31980c(this.lensAperture, cameraDebugData.lensAperture) && Intrinsics.m31980c(this.systemPressureLevel, cameraDebugData.systemPressureLevel) && Intrinsics.m31980c(this.isLowLightBoostEnabled, cameraDebugData.isLowLightBoostEnabled) && Intrinsics.m31980c(this.currentIso, cameraDebugData.currentIso) && Intrinsics.m31980c(this.currentExposureDuration, cameraDebugData.currentExposureDuration) && Intrinsics.m31980c(this.currentZoomFactor, cameraDebugData.currentZoomFactor) && Intrinsics.m31980c(this.autoFocusSystem, cameraDebugData.autoFocusSystem) && Intrinsics.m31980c(this.isVirtualDevice, cameraDebugData.isVirtualDevice) && Intrinsics.m31980c(this.hasFlash, cameraDebugData.hasFlash) && Intrinsics.m31980c(this.isFlashAvailable, cameraDebugData.isFlashAvailable);
    }

    @Nullable
    public final String getAutoFocusSystem() {
        return this.autoFocusSystem;
    }

    @Nullable
    public final Double getCurrentExposureDuration() {
        return this.currentExposureDuration;
    }

    @Nullable
    public final Double getCurrentIso() {
        return this.currentIso;
    }

    @Nullable
    public final Double getCurrentZoomFactor() {
        return this.currentZoomFactor;
    }

    @Nullable
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final Boolean getHasFlash() {
        return this.hasFlash;
    }

    @Nullable
    public final Double getLensAperture() {
        return this.lensAperture;
    }

    @Nullable
    public final String getSystemPressureLevel() {
        return this.systemPressureLevel;
    }

    public int hashCode() {
        String str = this.deviceType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d10 = this.lensAperture;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str2 = this.systemPressureLevel;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isLowLightBoostEnabled;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d11 = this.currentIso;
        int iHashCode5 = (iHashCode4 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.currentExposureDuration;
        int iHashCode6 = (iHashCode5 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.currentZoomFactor;
        int iHashCode7 = (iHashCode6 + (d13 == null ? 0 : d13.hashCode())) * 31;
        String str3 = this.autoFocusSystem;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.isVirtualDevice;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasFlash;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isFlashAvailable;
        return iHashCode10 + (bool4 != null ? bool4.hashCode() : 0);
    }

    @Nullable
    public final Boolean isFlashAvailable() {
        return this.isFlashAvailable;
    }

    @Nullable
    public final Boolean isLowLightBoostEnabled() {
        return this.isLowLightBoostEnabled;
    }

    @Nullable
    public final Boolean isVirtualDevice() {
        return this.isVirtualDevice;
    }

    @NotNull
    public String toString() {
        return "CameraDebugData(deviceType=" + this.deviceType + ", lensAperture=" + this.lensAperture + ", systemPressureLevel=" + this.systemPressureLevel + ", isLowLightBoostEnabled=" + this.isLowLightBoostEnabled + ", currentIso=" + this.currentIso + ", currentExposureDuration=" + this.currentExposureDuration + ", currentZoomFactor=" + this.currentZoomFactor + ", autoFocusSystem=" + this.autoFocusSystem + ", isVirtualDevice=" + this.isVirtualDevice + ", hasFlash=" + this.hasFlash + ", isFlashAvailable=" + this.isFlashAvailable + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CameraDebugData(@InterfaceC11872g(name = "device_type") @Nullable String str, @InterfaceC11872g(name = "lens_aperture") @Nullable Double d10, @InterfaceC11872g(name = "system_pressure_level") @Nullable String str2, @InterfaceC11872g(name = "is_low_light_boost_enabled") @Nullable Boolean bool, @InterfaceC11872g(name = "current_iso") @Nullable Double d11, @InterfaceC11872g(name = "current_exposure_duration") @Nullable Double d12, @InterfaceC11872g(name = "current_zoom_factor") @Nullable Double d13, @InterfaceC11872g(name = "auto_focus_system") @Nullable String str3, @InterfaceC11872g(name = "is_virtual_device") @Nullable Boolean bool2, @InterfaceC11872g(name = "has_flash") @Nullable Boolean bool3, @InterfaceC11872g(name = "is_flash_available") @Nullable Boolean bool4) {
        this.deviceType = str;
        this.lensAperture = d10;
        this.systemPressureLevel = str2;
        this.isLowLightBoostEnabled = bool;
        this.currentIso = d11;
        this.currentExposureDuration = d12;
        this.currentZoomFactor = d13;
        this.autoFocusSystem = str3;
        this.isVirtualDevice = bool2;
        this.hasFlash = bool3;
        this.isFlashAvailable = bool4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0046: CONSTRUCTOR 
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
      (wrap java.lang.Double:?: TERNARY null = ((wrap int:0x0006: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r3v0 java.lang.Double))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000b: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
      (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x0010: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r5v0 java.lang.Boolean))
      (wrap java.lang.Double:?: TERNARY null = ((wrap int:0x0015: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r6v0 java.lang.Double))
      (wrap java.lang.Double:?: TERNARY null = ((wrap int:0x001a: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r7v0 java.lang.Double))
      (wrap java.lang.Double:?: TERNARY null = ((wrap int:0x001f: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r8v0 java.lang.Double))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0024: ARITH (r13v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
      (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x0029: ARITH (r13v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r10v0 java.lang.Boolean))
      (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x002e: ARITH (r13v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r11v0 java.lang.Boolean))
      (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x0033: ARITH (r13v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r12v0 java.lang.Boolean))
     A[MD:(java.lang.String, java.lang.Double, java.lang.String, java.lang.Boolean, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:14) call: com.withpersona.sdk2.inquiry.tracking.model.CameraDebugData.<init>(java.lang.String, java.lang.Double, java.lang.String, java.lang.Boolean, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ CameraDebugData(String str, Double d10, String str2, Boolean bool, Double d11, Double d12, Double d13, String str3, Boolean bool2, Boolean bool3, Boolean bool4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : d10, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : bool, (i10 & 16) != 0 ? null : d11, (i10 & 32) != 0 ? null : d12, (i10 & 64) != 0 ? null : d13, (i10 & 128) != 0 ? null : str3, (i10 & 256) != 0 ? null : bool2, (i10 & 512) != 0 ? null : bool3, (i10 & 1024) != 0 ? null : bool4);
    }
}
