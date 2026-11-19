package com.roblox.protocols.bugreporterplatforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class IBugReporterCore {

    @Keep
    public static final class CppProxy extends IBugReporterCore {
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

        private native void native_requestBugReport(long j10, BugReporterTriggerType bugReporterTriggerType);

        @Override // com.roblox.protocols.bugreporterplatforminterface.generated.IBugReporterCore
        public void requestBugReport(BugReporterTriggerType bugReporterTriggerType) {
            native_requestBugReport(this.nativeRef, bugReporterTriggerType);
        }
    }

    public static native IBugReporterCore setPlatformImpl(IPlatformBugReporter iPlatformBugReporter);

    public void requestBugReport(BugReporterTriggerType bugReporterTriggerType) {
    }
}
