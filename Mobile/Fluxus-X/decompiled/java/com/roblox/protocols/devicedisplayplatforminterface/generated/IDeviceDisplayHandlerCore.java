package com.roblox.protocols.devicedisplayplatforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class IDeviceDisplayHandlerCore {

    @Keep
    public static final class CppProxy extends IDeviceDisplayHandlerCore {
        static final /* synthetic */ boolean $assertionsDisabled = false;
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

        private native float native_getBrightness(long j10);

        private native boolean native_isAvailable(long j10);

        private native void native_setBrightness(long j10, float f10);

        private native void native_setBrightnessToDefault(long j10);

        @Override // com.roblox.protocols.devicedisplayplatforminterface.generated.IDeviceDisplayHandlerCore
        public float getBrightness() {
            return native_getBrightness(this.nativeRef);
        }

        @Override // com.roblox.protocols.devicedisplayplatforminterface.generated.IDeviceDisplayHandlerCore
        public boolean isAvailable() {
            return native_isAvailable(this.nativeRef);
        }

        @Override // com.roblox.protocols.devicedisplayplatforminterface.generated.IDeviceDisplayHandlerCore
        public void setBrightness(float f10) {
            native_setBrightness(this.nativeRef, f10);
        }

        @Override // com.roblox.protocols.devicedisplayplatforminterface.generated.IDeviceDisplayHandlerCore
        public void setBrightnessToDefault() {
            native_setBrightnessToDefault(this.nativeRef);
        }
    }

    public static native IDeviceDisplayHandlerCore setPlatformImpl(IPlatformDeviceDisplayHandler iPlatformDeviceDisplayHandler);

    public float getBrightness() {
        return 0.0f;
    }

    public boolean isAvailable() {
        return false;
    }

    public void setBrightness(float f10) {
    }

    public void setBrightnessToDefault() {
    }
}
