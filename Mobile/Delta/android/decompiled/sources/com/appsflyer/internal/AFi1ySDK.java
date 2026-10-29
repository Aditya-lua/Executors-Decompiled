package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H%¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0015¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0018H\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0005¢\u0006\u0004\b\u001b\u0010\bR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u001e\u0010\r\u001a\u0004\u0018\u00010\u001e8\u0005@\u0004X\u0085\f¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#"}, d2 = {"Lcom/appsflyer/internal/AFi1ySDK;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "AFLogger", "()Ljava/lang/String;", "", "registerClient", "()Z", "Lcom/appsflyer/internal/AFi1xSDK;", "unregisterClient", "()Lcom/appsflyer/internal/AFi1xSDK;", "Lcom/appsflyer/internal/AFi1rSDK;", "AFKeystoreWrapper", "()Lcom/appsflyer/internal/AFi1rSDK;", "Landroid/net/NetworkCapabilities;", "L_", "()Landroid/net/NetworkCapabilities;", "Landroid/net/Network;", "K_", "()Landroid/net/Network;", "Lkotlin/Pair;", "v", "()Lkotlin/Pair;", "e", "Landroid/content/Context;", "d", "Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager;", "E_", "()Landroid/net/ConnectivityManager;", "Landroid/telephony/TelephonyManager;", "Landroid/telephony/TelephonyManager;", "AFa1uSDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AFi1ySDK {

    /* JADX INFO: renamed from: AFLogger, reason: from kotlin metadata */
    @Nullable
    private final TelephonyManager AFKeystoreWrapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private ConnectivityManager unregisterClient;

    /* JADX INFO: renamed from: registerClient, reason: from kotlin metadata */
    @NotNull
    private final Context d;

    public AFi1ySDK(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.d = context;
        Object systemService = context.getSystemService("connectivity");
        this.unregisterClient = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        Object systemService2 = context.getSystemService("phone");
        this.AFKeystoreWrapper = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
    }

    @Nullable
    private String e() {
        try {
            TelephonyManager telephonyManager = this.AFKeystoreWrapper;
            if (telephonyManager == null) {
                return null;
            }
            int dataState = telephonyManager.getDataState();
            if (dataState == 0) {
                return "DISCONNECTED";
            }
            if (dataState == 1) {
                return "CONNECTING";
            }
            if (dataState == 2) {
                return "CONNECTED";
            }
            if (dataState == 3) {
                return "SUSPENDED";
            }
            return "UNKNOWN(" + dataState + ")";
        } catch (Throwable th2) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Exception while collecting data state. ", th2, false, false, false, false, 120, null);
            return null;
        }
    }

    @NotNull
    private Pair<Boolean, Boolean> v() {
        try {
            ConnectivityManager connectivityManager = this.unregisterClient;
            if (connectivityManager == null) {
                return new Pair<>(null, null);
            }
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                Boolean bool = Boolean.FALSE;
                return new Pair<>(bool, bool);
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                Boolean bool2 = Boolean.FALSE;
                return new Pair<>(bool2, bool2);
            }
            return new Pair<>(Boolean.valueOf(networkCapabilities.hasCapability(12)), Boolean.valueOf(networkCapabilities.hasCapability(16)));
        } catch (Throwable th2) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Exception while collecting internet capabilities. ", th2, false, false, false, false, 120, null);
            return new Pair<>(null, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    @Nullable
    public final NetworkTroubleshootingData AFKeystoreWrapper() {
        String str;
        String hostAddress;
        LinkProperties linkProperties;
        LinkProperties linkProperties2;
        String privateDnsServerName;
        Pair pair;
        Network networkK_;
        List<LinkAddress> linkAddresses;
        Object next;
        InetAddress address;
        AFi1xSDK aFi1xSDKUnregisterClient = unregisterClient();
        Pair<Boolean, Boolean> pairV = v();
        Boolean boolA = pairV.a();
        Boolean boolB = pairV.b();
        String strE = e();
        NetworkCapabilities networkCapabilitiesL_ = L_();
        String str2 = null;
        if (networkCapabilitiesL_ != null) {
            Intrinsics.checkNotNullParameter(networkCapabilitiesL_, "");
            if (!networkCapabilitiesL_.hasTransport(4) || networkCapabilitiesL_.hasCapability(15)) {
                str = null;
            } else if (networkCapabilitiesL_.hasTransport(1)) {
                str = "WIFI";
            } else {
                str = networkCapabilitiesL_.hasTransport(0) ? "MOBILE" : "UNKNOWN";
            }
        } else {
            str = null;
        }
        NetworkCapabilities networkCapabilitiesL_2 = L_();
        if (networkCapabilitiesL_2 == null || !networkCapabilitiesL_2.hasTransport(4) || networkCapabilitiesL_2.hasCapability(15) || (networkK_ = K_()) == null) {
            hostAddress = null;
        } else {
            ConnectivityManager connectivityManager = this.unregisterClient;
            LinkProperties linkProperties3 = connectivityManager != null ? connectivityManager.getLinkProperties(networkK_) : null;
            if (linkProperties3 == null || (linkAddresses = linkProperties3.getLinkAddresses()) == null) {
                hostAddress = null;
            } else {
                Iterator<T> it = linkAddresses.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((LinkAddress) next).getAddress().isLoopbackAddress());
                LinkAddress linkAddress = (LinkAddress) next;
                if (linkAddress == null || (address = linkAddress.getAddress()) == null) {
                    hostAddress = null;
                } else {
                    hostAddress = address.getHostAddress();
                }
            }
        }
        if (Build.VERSION.SDK_INT < 28) {
            pair = new Pair(null, null);
        } else {
            ConnectivityManager connectivityManager2 = this.unregisterClient;
            if (connectivityManager2 == null) {
                linkProperties = null;
            } else {
                Network networkK_2 = K_();
                NetworkCapabilities networkCapabilitiesL_3 = L_();
                linkProperties = networkK_2 != null ? connectivityManager2.getLinkProperties(networkK_2) : null;
                boolean z10 = (linkProperties == null || (privateDnsServerName = linkProperties.getPrivateDnsServerName()) == null || !(StringsKt.p0(privateDnsServerName) ^ true)) ? false : true;
                if ((linkProperties == null || (networkCapabilitiesL_3 != null && networkCapabilitiesL_3.hasTransport(4) && !networkCapabilitiesL_3.hasCapability(15) && !z10)) && networkCapabilitiesL_3 != null && networkCapabilitiesL_3.hasTransport(4) && !networkCapabilitiesL_3.hasCapability(15)) {
                    Network[] allNetworks = connectivityManager2.getAllNetworks();
                    if (allNetworks == null) {
                        allNetworks = new Network[0];
                    }
                    for (Network network : allNetworks) {
                        NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
                        if (networkCapabilities != null && !networkCapabilities.hasTransport(4) && (linkProperties2 = connectivityManager2.getLinkProperties(network)) != null) {
                            linkProperties = linkProperties2;
                            break;
                        }
                    }
                }
            }
            if (linkProperties == null) {
                pair = new Pair(null, null);
            } else {
                String privateDnsServerName2 = linkProperties.getPrivateDnsServerName();
                if (privateDnsServerName2 != null && !StringsKt.p0(privateDnsServerName2)) {
                    str2 = privateDnsServerName2;
                }
                pair = new Pair(str2, Boolean.valueOf(linkProperties.isPrivateDnsActive()));
            }
        }
        return new NetworkTroubleshootingData(aFi1xSDKUnregisterClient.unregisterClient, aFi1xSDKUnregisterClient.f5430d, boolA, boolB, strE, str, hostAddress, (String) pair.a(), (Boolean) pair.b());
    }

    @NotNull
    public abstract String AFLogger();

    @Nullable
    /* JADX INFO: renamed from: E_, reason: from getter */
    public final ConnectivityManager getUnregisterClient() {
        return this.unregisterClient;
    }

    @Nullable
    public Network K_() {
        return null;
    }

    @Nullable
    public NetworkCapabilities L_() {
        return null;
    }

    public abstract boolean registerClient();

    @NotNull
    public final AFi1xSDK unregisterClient() {
        Throwable th2;
        String str;
        String simOperatorName;
        String networkOperatorName = null;
        try {
            TelephonyManager telephonyManager = this.AFKeystoreWrapper;
            if (telephonyManager != null) {
                simOperatorName = telephonyManager.getSimOperatorName();
                try {
                    networkOperatorName = telephonyManager.getNetworkOperatorName();
                    if (networkOperatorName == null || networkOperatorName.length() == 0) {
                        if (telephonyManager.getPhoneType() == 2) {
                            str = "CDMA";
                            networkOperatorName = str;
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    str = networkOperatorName;
                    networkOperatorName = simOperatorName;
                    AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Exception while collecting network info", th2, false, false, false, false, 120, null);
                    simOperatorName = networkOperatorName;
                }
            } else {
                simOperatorName = null;
            }
        } catch (Throwable th4) {
            th2 = th4;
            str = null;
        }
        return new AFi1xSDK(AFLogger(), networkOperatorName, simOperatorName, registerClient());
    }
}
