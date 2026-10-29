package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1sSDK extends AFi1ySDK {

    @Nullable
    private Network AFKeystoreWrapper;

    @NotNull
    private String AFLogger;

    public static final class AFa1ySDK extends ConnectivityManager.NetworkCallback {
        public AFa1ySDK() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            AFi1sSDK.this.AFKeystoreWrapper = network;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            AFi1sSDK.this.AFKeystoreWrapper = network;
            AFi1sSDK.this.AFLogger = "NetworkLost";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1sSDK(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.AFLogger = "unknown";
        AFa1ySDK aFa1ySDK = new AFa1ySDK();
        try {
            ConnectivityManager unregisterClient = getUnregisterClient();
            if (unregisterClient != null) {
                unregisterClient.registerNetworkCallback(new NetworkRequest.Builder().build(), aFa1ySDK);
                Unit unit = Unit.f22483a;
            }
        } catch (Throwable th2) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Error at attempt to register network callback with ConnectivityManager", th2, true, false, false, false, 96, null);
            Unit unit2 = Unit.f22483a;
        }
    }

    @Override // com.appsflyer.internal.AFi1ySDK
    @NotNull
    public final String AFLogger() {
        Network networkK_ = K_();
        if (networkK_ != null) {
            ConnectivityManager unregisterClient = getUnregisterClient();
            NetworkCapabilities networkCapabilities = unregisterClient != null ? unregisterClient.getNetworkCapabilities(networkK_) : null;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(1)) {
                    return "WIFI";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "MOBILE";
                }
            }
        }
        return "unknown";
    }

    @Override // com.appsflyer.internal.AFi1ySDK
    @Nullable
    public final Network K_() {
        Network activeNetwork;
        ConnectivityManager unregisterClient = getUnregisterClient();
        if (unregisterClient != null && (activeNetwork = unregisterClient.getActiveNetwork()) != null) {
            return activeNetwork;
        }
        Network network = this.AFKeystoreWrapper;
        if (network == null || Intrinsics.c(this.AFLogger, "NetworkLost")) {
            return null;
        }
        return network;
    }

    @Override // com.appsflyer.internal.AFi1ySDK
    @Nullable
    public final NetworkCapabilities L_() {
        ConnectivityManager unregisterClient;
        Network networkK_ = K_();
        if (networkK_ == null || (unregisterClient = getUnregisterClient()) == null) {
            return null;
        }
        return unregisterClient.getNetworkCapabilities(networkK_);
    }

    @Override // com.appsflyer.internal.AFi1ySDK
    public final boolean registerClient() {
        Network networkK_ = K_();
        if (networkK_ != null) {
            ConnectivityManager unregisterClient = getUnregisterClient();
            NetworkCapabilities networkCapabilities = unregisterClient != null ? unregisterClient.getNetworkCapabilities(networkK_) : null;
            if (networkCapabilities != null && networkCapabilities.hasTransport(4) && !networkCapabilities.hasCapability(15)) {
                return true;
            }
        }
        return false;
    }
}
