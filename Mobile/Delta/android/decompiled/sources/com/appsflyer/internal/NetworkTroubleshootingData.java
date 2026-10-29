package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.appsflyer.internal.AFi1rSDK, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0017R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u0016\u0010 \u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001c"}, d2 = {"Lcom/appsflyer/internal/AFi1rSDK;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "registerClient", "Ljava/lang/String;", "unregisterClient", "AFKeystoreWrapper", "Z", "AFLogger", "Ljava/lang/Boolean;", "d", "e", "i", "w", "v", "force"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NetworkTroubleshootingData {

    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from kotlin metadata and from toString */
    public final boolean isVpnEnabled;

    /* JADX INFO: renamed from: AFLogger, reason: from kotlin metadata and from toString */
    @Nullable
    public final Boolean hasInternetCapability;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String dataState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String vpnUnderlyingTransport;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Boolean customDnsEnabled;

    /* JADX INFO: renamed from: registerClient, reason: from kotlin metadata and from toString */
    @NotNull
    public final String networkType;

    /* JADX INFO: renamed from: unregisterClient, reason: from kotlin metadata and from toString */
    @Nullable
    public final Boolean hasValidatedCapability;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String customDnsServerName;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String devicePrivateVpnAddress;

    public NetworkTroubleshootingData(@NotNull String str, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.networkType = str;
        this.isVpnEnabled = z10;
        this.hasInternetCapability = bool;
        this.hasValidatedCapability = bool2;
        this.dataState = str2;
        this.vpnUnderlyingTransport = str3;
        this.devicePrivateVpnAddress = str4;
        this.customDnsServerName = str5;
        this.customDnsEnabled = bool3;
    }

    public final boolean equals(@Nullable Object p8) {
        if (this == p8) {
            return true;
        }
        if (!(p8 instanceof NetworkTroubleshootingData)) {
            return false;
        }
        NetworkTroubleshootingData networkTroubleshootingData = (NetworkTroubleshootingData) p8;
        return Intrinsics.c(this.networkType, networkTroubleshootingData.networkType) && this.isVpnEnabled == networkTroubleshootingData.isVpnEnabled && Intrinsics.c(this.hasInternetCapability, networkTroubleshootingData.hasInternetCapability) && Intrinsics.c(this.hasValidatedCapability, networkTroubleshootingData.hasValidatedCapability) && Intrinsics.c(this.dataState, networkTroubleshootingData.dataState) && Intrinsics.c(this.vpnUnderlyingTransport, networkTroubleshootingData.vpnUnderlyingTransport) && Intrinsics.c(this.devicePrivateVpnAddress, networkTroubleshootingData.devicePrivateVpnAddress) && Intrinsics.c(this.customDnsServerName, networkTroubleshootingData.customDnsServerName) && Intrinsics.c(this.customDnsEnabled, networkTroubleshootingData.customDnsEnabled);
    }

    public final int hashCode() {
        int iHashCode = ((this.networkType.hashCode() * 31) + Boolean.hashCode(this.isVpnEnabled)) * 31;
        Boolean bool = this.hasInternetCapability;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasValidatedCapability;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.dataState;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.vpnUnderlyingTransport;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.devicePrivateVpnAddress;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customDnsServerName;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool3 = this.customDnsEnabled;
        return iHashCode7 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "NetworkTroubleshootingData(networkType=" + this.networkType + ", isVpnEnabled=" + this.isVpnEnabled + ", hasInternetCapability=" + this.hasInternetCapability + ", hasValidatedCapability=" + this.hasValidatedCapability + ", dataState=" + this.dataState + ", vpnUnderlyingTransport=" + this.vpnUnderlyingTransport + ", devicePrivateVpnAddress=" + this.devicePrivateVpnAddress + ", customDnsServerName=" + this.customDnsServerName + ", customDnsEnabled=" + this.customDnsEnabled + ")";
    }
}
