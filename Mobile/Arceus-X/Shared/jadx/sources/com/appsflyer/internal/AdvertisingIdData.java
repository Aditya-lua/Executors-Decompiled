package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.appsflyer.internal.AFh1qSDK, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001e\u0010 "}, m31665d2 = {"Lcom/appsflyer/internal/AFh1qSDK;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AFLogger", "Ljava/lang/String;", "d", "registerClient", "Ljava/lang/Boolean;", "AFKeystoreWrapper", "unregisterClient", "e", "v", "i", "Ljava/util/Map;", "w"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final /* data */ class AdvertisingIdData {

    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from kotlin metadata and from toString */
    @Nullable
    public Boolean isEnabled;

    /* JADX INFO: renamed from: AFLogger, reason: from kotlin metadata and from toString */
    @Nullable
    public String advertisingId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public Boolean isGaidWithGps;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public String gaidError;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    public Boolean retry;

    /* JADX INFO: renamed from: registerClient, reason: from kotlin metadata and from toString */
    @Nullable
    public Boolean isLimited;

    /* JADX INFO: renamed from: unregisterClient, reason: from kotlin metadata and from toString */
    @Nullable
    public Boolean isGaidWithSamsungCloudDev;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
    @NotNull
    public Map<String, Object> metadata;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private AdvertisingIdData(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable String str2, @Nullable Boolean bool5, @NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.advertisingId = str;
        this.isLimited = bool;
        this.isEnabled = bool2;
        this.isGaidWithGps = bool3;
        this.isGaidWithSamsungCloudDev = bool4;
        this.gaidError = str2;
        this.retry = bool5;
        this.metadata = map;
    }

    public final boolean equals(@Nullable Object p8) {
        if (this == p8) {
            return true;
        }
        if (!(p8 instanceof AdvertisingIdData)) {
            return false;
        }
        AdvertisingIdData advertisingIdData = (AdvertisingIdData) p8;
        return Intrinsics.m31980c(this.advertisingId, advertisingIdData.advertisingId) && Intrinsics.m31980c(this.isLimited, advertisingIdData.isLimited) && Intrinsics.m31980c(this.isEnabled, advertisingIdData.isEnabled) && Intrinsics.m31980c(this.isGaidWithGps, advertisingIdData.isGaidWithGps) && Intrinsics.m31980c(this.isGaidWithSamsungCloudDev, advertisingIdData.isGaidWithSamsungCloudDev) && Intrinsics.m31980c(this.gaidError, advertisingIdData.gaidError) && Intrinsics.m31980c(this.retry, advertisingIdData.retry) && Intrinsics.m31980c(this.metadata, advertisingIdData.metadata);
    }

    public final int hashCode() {
        String str = this.advertisingId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isLimited;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isEnabled;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isGaidWithGps;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isGaidWithSamsungCloudDev;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.gaidError;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.retry;
        return ((iHashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31) + this.metadata.hashCode();
    }

    @NotNull
    public final String toString() {
        return "AdvertisingIdData(advertisingId=" + this.advertisingId + ", isLimited=" + this.isLimited + ", isEnabled=" + this.isEnabled + ", isGaidWithGps=" + this.isGaidWithGps + ", isGaidWithSamsungCloudDev=" + this.isGaidWithSamsungCloudDev + ", gaidError=" + this.gaidError + ", retry=" + this.retry + ", metadata=" + this.metadata + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
      (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x0006: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
      (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x000b: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
      (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x0010: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r5v0 java.lang.Boolean))
      (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x0015: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r6v0 java.lang.Boolean))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x001a: ARITH (r10v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
      (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x001f: ARITH (r10v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r8v0 java.lang.Boolean))
      (wrap java.util.Map:?: TERNARY null = ((wrap int:0x0024: ARITH (r10v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.Map:0x002a: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:10) call: java.util.HashMap.<init>():void type: CONSTRUCTOR) : (r9v0 java.util.Map))
     A[MD:(java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.util.Map<java.lang.String, java.lang.Object>):void (m)] (LINE:11) call: com.appsflyer.internal.AFh1qSDK.<init>(java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.util.Map):void type: THIS */
    public /* synthetic */ AdvertisingIdData(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : bool2, (i10 & 8) != 0 ? null : bool3, (i10 & 16) != 0 ? null : bool4, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : bool5, (i10 & 128) != 0 ? new HashMap() : map);
    }

    public AdvertisingIdData() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
