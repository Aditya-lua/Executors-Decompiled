package com.roblox.engine.jni.util;

import android.util.Log;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkUtils {
    public static String getPublicIPv4Addresseses() {
        try {
            ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
            int size = list.size();
            String str = "";
            int i10 = 0;
            while (i10 < size) {
                Object obj = list.get(i10);
                i10++;
                ArrayList list2 = Collections.list(((NetworkInterface) obj).getInetAddresses());
                int size2 = list2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = list2.get(i11);
                    i11++;
                    InetAddress inetAddress = (InetAddress) obj2;
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        if (hostAddress.indexOf(58) < 0) {
                            str = str + hostAddress + " : ";
                        } else {
                            continue;
                        }
                    }
                }
            }
            return str;
        } catch (Exception e10) {
            Log.w("IPAddress", "Android Loop Back IP scanning exception :" + e10);
            return "";
        }
    }
}
