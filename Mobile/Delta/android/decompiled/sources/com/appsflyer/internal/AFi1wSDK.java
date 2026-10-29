package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1wSDK extends AFi1ySDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1wSDK(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkInfo J_(AFi1wSDK aFi1wSDK, Network network) {
        ConnectivityManager unregisterClient = aFi1wSDK.getUnregisterClient();
        Intrinsics.checkNotNull(unregisterClient);
        return unregisterClient.getNetworkInfo(network);
    }

    @Override // com.appsflyer.internal.AFi1ySDK
    @NotNull
    public final String AFLogger() {
        Network[] allNetworks;
        Sequence sequenceB;
        Sequence sequenceY;
        Object next;
        NetworkInfo networkInfo;
        ConnectivityManager unregisterClient = getUnregisterClient();
        if (unregisterClient != null && (allNetworks = unregisterClient.getAllNetworks()) != null && (sequenceB = kotlin.collections.m.B(allNetworks)) != null && (sequenceY = iu.p.y(sequenceB, new Function1() { // from class: com.appsflyer.internal.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AFi1wSDK.J_(this.f5485a, (Network) obj);
            }
        })) != null) {
            Iterator it = sequenceY.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                networkInfo = (NetworkInfo) next;
            } while (!(networkInfo != null ? networkInfo.isConnectedOrConnecting() : false));
            NetworkInfo networkInfo2 = (NetworkInfo) next;
            if (networkInfo2 != null) {
                int type = networkInfo2.getType();
                if (type != 0) {
                    return type != 1 ? "unknown" : "WIFI";
                }
                return "MOBILE";
            }
        }
        return "unknown";
    }

    @Override // com.appsflyer.internal.AFi1ySDK
    @Nullable
    public final Network K_() {
        Network[] allNetworks;
        Sequence sequenceB;
        ConnectivityManager unregisterClient = getUnregisterClient();
        Object obj = null;
        if (unregisterClient == null || (allNetworks = unregisterClient.getAllNetworks()) == null || (sequenceB = kotlin.collections.m.B(allNetworks)) == null) {
            return null;
        }
        for (Object obj2 : sequenceB) {
            ConnectivityManager unregisterClient2 = getUnregisterClient();
            Intrinsics.checkNotNull(unregisterClient2);
            NetworkInfo networkInfo = unregisterClient2.getNetworkInfo((Network) obj2);
            if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
                obj = obj2;
                break;
            }
        }
        return (Network) obj;
    }

    @Override // com.appsflyer.internal.AFi1ySDK
    @Nullable
    public final NetworkCapabilities L_() {
        Network networkK_ = K_();
        if (networkK_ == null) {
            return null;
        }
        ConnectivityManager unregisterClient = getUnregisterClient();
        Intrinsics.checkNotNull(unregisterClient);
        return unregisterClient.getNetworkCapabilities(networkK_);
    }

    @Override // com.appsflyer.internal.AFi1ySDK
    public final boolean registerClient() {
        Network[] allNetworks;
        try {
            ConnectivityManager unregisterClient = getUnregisterClient();
            if (unregisterClient != null && (allNetworks = unregisterClient.getAllNetworks()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Network network : allNetworks) {
                    ConnectivityManager unregisterClient2 = getUnregisterClient();
                    Intrinsics.checkNotNull(unregisterClient2);
                    NetworkCapabilities networkCapabilities = unregisterClient2.getNetworkCapabilities(network);
                    if (networkCapabilities != null) {
                        arrayList.add(networkCapabilities);
                    }
                }
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        NetworkCapabilities networkCapabilities2 = (NetworkCapabilities) obj;
                        if (networkCapabilities2 != null && networkCapabilities2.hasTransport(4) && !networkCapabilities2.hasCapability(15)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Exception e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed collecting VPN capability data", e10, false, false, false, false, 120, null);
            return false;
        }
    }
}
