package backtraceio.library.interfaces;

import backtraceio.library.enums.UnwindingMode;

/* JADX INFO: loaded from: classes.dex */
public interface NativeCommunication {
    boolean handleCrash(String[] strArr);

    boolean initializeCrashHandler(String str, String str2, String str3, String[] strArr, String[] strArr2, String[] strArr3, boolean z10, UnwindingMode unwindingMode);

    boolean initializeJavaCrashHandler(String str, String str2, String str3, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4);
}
