package com.roblox.protocols.pinshortcutplatforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class IPlatformPinShortcut {

    @Keep
    public static final class CppProxy extends IPlatformPinShortcut {
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

        private native String native_getDesiredThumbnailFormat(long j10);

        private native boolean native_isAvailable(long j10);

        private native boolean native_isPinExperienceV2Available(long j10);

        private native boolean native_isRevealPinnedExperienceAvailable(long j10);

        private native void native_pinExperience(long j10, long j11, String str, String str2);

        private native void native_pinExperienceV2(long j10, long j11, long j12, String str, String str2);

        private native void native_revealPinnedExperience(long j10, long j11);

        private native boolean native_shouldShowLuaNotificationOnPinExperienceCompleted(long j10);

        @Override // com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut
        public String getDesiredThumbnailFormat() {
            return native_getDesiredThumbnailFormat(this.nativeRef);
        }

        @Override // com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut
        public boolean isAvailable() {
            return native_isAvailable(this.nativeRef);
        }

        @Override // com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut
        public boolean isPinExperienceV2Available() {
            return native_isPinExperienceV2Available(this.nativeRef);
        }

        @Override // com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut
        public boolean isRevealPinnedExperienceAvailable() {
            return native_isRevealPinnedExperienceAvailable(this.nativeRef);
        }

        @Override // com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut
        public void pinExperience(long j10, String str, String str2) {
            native_pinExperience(this.nativeRef, j10, str, str2);
        }

        @Override // com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut
        public void pinExperienceV2(long j10, long j11, String str, String str2) {
            native_pinExperienceV2(this.nativeRef, j10, j11, str, str2);
        }

        @Override // com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut
        public void revealPinnedExperience(long j10) {
            native_revealPinnedExperience(this.nativeRef, j10);
        }

        @Override // com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut
        public boolean shouldShowLuaNotificationOnPinExperienceCompleted() {
            return native_shouldShowLuaNotificationOnPinExperienceCompleted(this.nativeRef);
        }
    }

    public String getDesiredThumbnailFormat() {
        return null;
    }

    public boolean isAvailable() {
        return false;
    }

    public boolean isPinExperienceV2Available() {
        return false;
    }

    public boolean isRevealPinnedExperienceAvailable() {
        return false;
    }

    public void pinExperience(long j10, String str, String str2) {
    }

    public void pinExperienceV2(long j10, long j11, String str, String str2) {
    }

    public void revealPinnedExperience(long j10) {
    }

    public boolean shouldShowLuaNotificationOnPinExperienceCompleted() {
        return false;
    }
}
