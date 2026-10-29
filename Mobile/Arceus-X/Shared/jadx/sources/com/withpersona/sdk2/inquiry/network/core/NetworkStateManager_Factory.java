package com.withpersona.sdk2.inquiry.network.core;

import p136ft.InterfaceC5830d;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkStateManager_Factory implements InterfaceC5830d<NetworkStateManager> {

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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    public NetworkStateManager get() {
        return newInstance();
    }
}
