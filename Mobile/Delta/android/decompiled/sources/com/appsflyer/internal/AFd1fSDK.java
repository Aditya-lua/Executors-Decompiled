package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.share.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AFd1fSDK<Body> implements ResponseNetwork<Body> {

    @NonNull
    public final AFd1nSDK AFKeystoreWrapper;
    final boolean AFLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    final Map<String, List<String>> f5276d;

    @NonNull
    private final Body registerClient;
    final int unregisterClient;

    public AFd1fSDK(@NonNull Body body, int i10, boolean z10, Map<String, List<String>> map, @NonNull AFd1nSDK aFd1nSDK) {
        this.registerClient = body;
        this.unregisterClient = i10;
        this.AFLogger = z10;
        this.f5276d = new HashMap(map);
        this.AFKeystoreWrapper = aFd1nSDK;
    }

    public final String AFKeystoreWrapper(@NonNull String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField == null || headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it = headerField.iterator();
        StringBuilder sb2 = new StringBuilder(it.next());
        while (it.hasNext()) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFd1fSDK aFd1fSDK = (AFd1fSDK) obj;
        if (this.unregisterClient == aFd1fSDK.unregisterClient && this.AFLogger == aFd1fSDK.AFLogger && this.registerClient.equals(aFd1fSDK.registerClient) && this.f5276d.equals(aFd1fSDK.f5276d)) {
            return this.AFKeystoreWrapper.equals(aFd1fSDK.AFKeystoreWrapper);
        }
        return false;
    }

    @Override // com.appsflyer.share.network.http.ResponseNetwork
    @NonNull
    public Body getBody() {
        return this.registerClient;
    }

    @Override // com.appsflyer.share.network.http.ResponseNetwork
    public List<String> getHeaderField(@NonNull String str) {
        for (String str2 : this.f5276d.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.f5276d.get(str2);
            }
        }
        return null;
    }

    @Override // com.appsflyer.share.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.unregisterClient;
    }

    public int hashCode() {
        return (((((((this.registerClient.hashCode() * 31) + this.unregisterClient) * 31) + (this.AFLogger ? 1 : 0)) * 31) + this.f5276d.hashCode()) * 31) + this.AFKeystoreWrapper.hashCode();
    }

    @Override // com.appsflyer.share.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.AFLogger;
    }
}
