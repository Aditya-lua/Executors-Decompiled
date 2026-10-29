package com.roblox.protocols.localstorageplatforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class IPlatformLocalStorageHandler {

    @Keep
    public static final class CppProxy extends IPlatformLocalStorageHandler {
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

        private native boolean native_deleteCurrentUserValues(long j10);

        private native boolean native_deleteSecureValue(long j10, String str);

        private native boolean native_deleteUserValues(long j10, long j11);

        private native long native_getCurrentUser(long j10);

        private native String native_getSecureValue(long j10, String str);

        private native String native_getSecureValueForCurrentUser(long j10, String str);

        private native String native_getSecureValueForUser(long j10, String str, long j11);

        private native HashSet<Long> native_getUsers(long j10);

        private native boolean native_setCurrentUser(long j10, long j11);

        private native boolean native_setSecureValue(long j10, String str, String str2);

        private native boolean native_setSecureValueForCurrentUser(long j10, String str, String str2);

        private native boolean native_setSecureValueForUser(long j10, String str, String str2, long j11);

        @Override // com.roblox.protocols.localstorageplatforminterface.generated.IPlatformLocalStorageHandler
        public boolean deleteCurrentUserValues() {
            return native_deleteCurrentUserValues(this.nativeRef);
        }

        @Override // com.roblox.protocols.localstorageplatforminterface.generated.IPlatformLocalStorageHandler
        public boolean deleteSecureValue(String str) {
            return native_deleteSecureValue(this.nativeRef, str);
        }

        @Override // com.roblox.protocols.localstorageplatforminterface.generated.IPlatformLocalStorageHandler
        public boolean deleteUserValues(long j10) {
            return native_deleteUserValues(this.nativeRef, j10);
        }

        @Override // com.roblox.protocols.localstorageplatforminterface.generated.IPlatformLocalStorageHandler
        public long getCurrentUser() {
            return native_getCurrentUser(this.nativeRef);
        }

        @Override // com.roblox.protocols.localstorageplatforminterface.generated.IPlatformLocalStorageHandler
        public String getSecureValue(String str) {
            return native_getSecureValue(this.nativeRef, str);
        }

        @Override // com.roblox.protocols.localstorageplatforminterface.generated.IPlatformLocalStorageHandler
        public String getSecureValueForCurrentUser(String str) {
            return native_getSecureValueForCurrentUser(this.nativeRef, str);
        }

        @Override // com.roblox.protocols.localstorageplatforminterface.generated.IPlatformLocalStorageHandler
        public String getSecureValueForUser(String str, long j10) {
            return native_getSecureValueForUser(this.nativeRef, str, j10);
        }

        @Override // com.roblox.protocols.localstorageplatforminterface.generated.IPlatformLocalStorageHandler
        public HashSet<Long> getUsers() {
            return native_getUsers(this.nativeRef);
        }

        @Override // com.roblox.protocols.localstorageplatforminterface.generated.IPlatformLocalStorageHandler
        public boolean setCurrentUser(long j10) {
            return native_setCurrentUser(this.nativeRef, j10);
        }

        @Override // com.roblox.protocols.localstorageplatforminterface.generated.IPlatformLocalStorageHandler
        public boolean setSecureValue(String str, String str2) {
            return native_setSecureValue(this.nativeRef, str, str2);
        }

        @Override // com.roblox.protocols.localstorageplatforminterface.generated.IPlatformLocalStorageHandler
        public boolean setSecureValueForCurrentUser(String str, String str2) {
            return native_setSecureValueForCurrentUser(this.nativeRef, str, str2);
        }

        @Override // com.roblox.protocols.localstorageplatforminterface.generated.IPlatformLocalStorageHandler
        public boolean setSecureValueForUser(String str, String str2, long j10) {
            return native_setSecureValueForUser(this.nativeRef, str, str2, j10);
        }
    }

    public boolean deleteCurrentUserValues() {
        return false;
    }

    public boolean deleteSecureValue(String str) {
        return false;
    }

    public boolean deleteUserValues(long j10) {
        return false;
    }

    public long getCurrentUser() {
        return 0L;
    }

    public String getSecureValue(String str) {
        return null;
    }

    public String getSecureValueForCurrentUser(String str) {
        return null;
    }

    public String getSecureValueForUser(String str, long j10) {
        return null;
    }

    public HashSet<Long> getUsers() {
        return null;
    }

    public boolean setCurrentUser(long j10) {
        return false;
    }

    public boolean setSecureValue(String str, String str2) {
        return false;
    }

    public boolean setSecureValueForCurrentUser(String str, String str2) {
        return false;
    }

    public boolean setSecureValueForUser(String str, String str2, long j10) {
        return false;
    }
}
