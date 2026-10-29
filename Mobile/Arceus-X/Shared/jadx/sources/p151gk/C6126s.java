package p151gk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: renamed from: gk.s */
/* JADX INFO: loaded from: classes2.dex */
public class C6126s {
    /* JADX INFO: renamed from: a */
    public static boolean m27083a(Context context) {
        Network activeNetwork;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null) {
            return false;
        }
        return m27084b(connectivityManager.getNetworkCapabilities(activeNetwork));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m27084b(NetworkCapabilities networkCapabilities) {
        return networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }
}
