package com.withpersona.sdk2.inquiry.network.core;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkStateManager_Factory implements ft.d<NetworkStateManager> {

    public static final class InstanceHolder {
        static final NetworkStateManager_Factory INSTANCE = new NetworkStateManager_Factory();

        private InstanceHolder() {
        }
    }

    public static NetworkStateManager_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static NetworkStateManager newInstance() {
        return new NetworkStateManager();
    }

    @Override // ht.a
    public NetworkStateManager get() {
        return newInstance();
    }
}
