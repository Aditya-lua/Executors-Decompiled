package com.roblox.protocols.nativeadsplatforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class IPlatformNativeAds {

    @Keep
    public static final class CppProxy extends IPlatformNativeAds {
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

        private native void native_cleanupAd(long j10);

        private native void native_getQueryInfo(long j10, int i10, String str, String str2, String str3);

        private native void native_initialize(long j10, int i10, String str);

        private native void native_initializeSdk(long j10, String str, String str2);

        private native void native_install(long j10, boolean z10);

        private native void native_setAdString(long j10, int i10, String str, String str2, String str3, String str4, long j11, boolean z10, String str5, String str6, String str7, boolean z11);

        private native void native_showAd(long j10, int i10, String str);

        @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
        public void cleanupAd() {
            native_cleanupAd(this.nativeRef);
        }

        @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
        public void getQueryInfo(int i10, String str, String str2, String str3) {
            native_getQueryInfo(this.nativeRef, i10, str, str2, str3);
        }

        @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
        public void initialize(int i10, String str) {
            native_initialize(this.nativeRef, i10, str);
        }

        @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
        public void initializeSdk(String str, String str2) {
            native_initializeSdk(this.nativeRef, str, str2);
        }

        @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
        public void install(boolean z10) {
            native_install(this.nativeRef, z10);
        }

        @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
        public void setAdString(int i10, String str, String str2, String str3, String str4, long j10, boolean z10, String str5, String str6, String str7, boolean z11) {
            native_setAdString(this.nativeRef, i10, str, str2, str3, str4, j10, z10, str5, str6, str7, z11);
        }

        @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
        public void showAd(int i10, String str) {
            native_showAd(this.nativeRef, i10, str);
        }
    }

    public void cleanupAd() {
    }

    public void getQueryInfo(int i10, String str, String str2, String str3) {
    }

    public void initialize(int i10, String str) {
    }

    public void initializeSdk(String str, String str2) {
    }

    public void install(boolean z10) {
    }

    public void setAdString(int i10, String str, String str2, String str3, String str4, long j10, boolean z10, String str5, String str6, String str7, boolean z11) {
    }

    public void showAd(int i10, String str) {
    }
}
