package com.roblox.protocols.localstorageplatforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class ILocalStorageHandlerCore {

    @Keep
    public static final class CppProxy extends ILocalStorageHandlerCore {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j10) {
            if (j10 == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j10;
            NativeObjectManager.register(this, j10);
        }

        public static native void nativeDestroy(long j10);
    }

    public static native ILocalStorageHandlerCore setPlatformImpl(IPlatformLocalStorageHandler iPlatformLocalStorageHandler);
}
