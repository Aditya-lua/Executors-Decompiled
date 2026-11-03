package ek;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes2.dex */
public class s {
    public static boolean a(Context context) {
        Network activeNetwork;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null) {
            return false;
        }
        return b(connectivityManager.getNetworkCapabilities(activeNetwork));
    }

    public static boolean b(NetworkCapabilities networkCapabilities) {
        return networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }
}
