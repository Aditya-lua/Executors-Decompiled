package com.roblox.protocols.nativeadsplatforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class INativeAdsCoreListener {

    @Keep
    public static final class CppProxy extends INativeAdsCoreListener {
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

        private native void native_onAdProgress(long j10, float f10, float f11, float f12, float f13, String str);

        private native void native_onCtaClick(long j10, String str, boolean z10);

        private native void native_onGetQueryInfoCompleted(long j10, int i10, String str);

        private native void native_onInitializeCompleted(long j10, int i10, boolean z10, String str);

        private native void native_onInitializeSdkFailed(long j10, String str, InitializeSdkFailureReason initializeSdkFailureReason, String str2);

        private native void native_onInitializeSdkSuccess(long j10, String str);

        private native void native_onLoadInterstitialAdFailed(long j10, String str, LoadAdFailureReason loadAdFailureReason, String str2);

        private native void native_onLoadInterstitialAdSuccess(long j10, String str);

        private native void native_onReportAd(long j10, String str, String str2);

        private native void native_onServeInterstitialAd(long j10, String str, String str2);

        private native void native_onSetAdStringCompleted(long j10, int i10, boolean z10, String str);

        private native void native_onShowAdCompleted(long j10, int i10, String str, float f10);

        @Override // com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener
        public void onAdProgress(float f10, float f11, float f12, float f13, String str) {
            native_onAdProgress(this.nativeRef, f10, f11, f12, f13, str);
        }

        @Override // com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener
        public void onCtaClick(String str, boolean z10) {
            native_onCtaClick(this.nativeRef, str, z10);
        }

        @Override // com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener
        public void onGetQueryInfoCompleted(int i10, String str) {
            native_onGetQueryInfoCompleted(this.nativeRef, i10, str);
        }

        @Override // com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener
        public void onInitializeCompleted(int i10, boolean z10, String str) {
            native_onInitializeCompleted(this.nativeRef, i10, z10, str);
        }

        @Override // com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener
        public void onInitializeSdkFailed(String str, InitializeSdkFailureReason initializeSdkFailureReason, String str2) {
            native_onInitializeSdkFailed(this.nativeRef, str, initializeSdkFailureReason, str2);
        }

        @Override // com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener
        public void onInitializeSdkSuccess(String str) {
            native_onInitializeSdkSuccess(this.nativeRef, str);
        }

        @Override // com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener
        public void onLoadInterstitialAdFailed(String str, LoadAdFailureReason loadAdFailureReason, String str2) {
            native_onLoadInterstitialAdFailed(this.nativeRef, str, loadAdFailureReason, str2);
        }

        @Override // com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener
        public void onLoadInterstitialAdSuccess(String str) {
            native_onLoadInterstitialAdSuccess(this.nativeRef, str);
        }

        @Override // com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener
        public void onReportAd(String str, String str2) {
            native_onReportAd(this.nativeRef, str, str2);
        }

        @Override // com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener
        public void onServeInterstitialAd(String str, String str2) {
            native_onServeInterstitialAd(this.nativeRef, str, str2);
        }

        @Override // com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener
        public void onSetAdStringCompleted(int i10, boolean z10, String str) {
            native_onSetAdStringCompleted(this.nativeRef, i10, z10, str);
        }

        @Override // com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener
        public void onShowAdCompleted(int i10, String str, float f10) {
            native_onShowAdCompleted(this.nativeRef, i10, str, f10);
        }
    }

    public static native INativeAdsCoreListener setPlatformImpl(IPlatformNativeAds iPlatformNativeAds);

    public void onAdProgress(float f10, float f11, float f12, float f13, String str) {
    }

    public void onCtaClick(String str, boolean z10) {
    }

    public void onGetQueryInfoCompleted(int i10, String str) {
    }

    public void onInitializeCompleted(int i10, boolean z10, String str) {
    }

    public void onInitializeSdkFailed(String str, InitializeSdkFailureReason initializeSdkFailureReason, String str2) {
    }

    public void onInitializeSdkSuccess(String str) {
    }

    public void onLoadInterstitialAdFailed(String str, LoadAdFailureReason loadAdFailureReason, String str2) {
    }

    public void onLoadInterstitialAdSuccess(String str) {
    }

    public void onReportAd(String str, String str2) {
    }

    public void onServeInterstitialAd(String str, String str2) {
    }

    public void onSetAdStringCompleted(int i10, boolean z10, String str) {
    }

    public void onShowAdCompleted(int i10, String str, float f10) {
    }
}
