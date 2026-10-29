package backtraceio.library.models.nativeHandler;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import backtraceio.library.common.AbiHelper;
import backtraceio.library.services.BacktraceCrashHandlerRunner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class CrashHandlerConfiguration {
    public static final String BACKTRACE_CRASH_HANDLER = "BACKTRACE_CRASH_HANDLER";
    private static final String BACKTRACE_NATIVE_LIBRARY_NAME = "libbacktrace-native.so";
    private static final String CRASHPAD_DIRECTORY_PATH = "/crashpad";
    public static final Set<String> UNSUPPORTED_ABIS = new HashSet(Arrays.asList("x86"));

    private String getBacktraceNativeLibraryPath(String str, String str2, String str3) {
        String str4 = String.format("%s/%s", str, BACKTRACE_NATIVE_LIBRARY_NAME);
        return new File(str4).exists() ? str4 : String.format("%s!/lib/%s/%s", str2, str3, BACKTRACE_NATIVE_LIBRARY_NAME);
    }

    public String getClassPath() {
        return BacktraceCrashHandlerRunner.class.getCanonicalName();
    }

    public List<String> getCrashHandlerEnvironmentVariables(ApplicationInfo applicationInfo) {
        return getCrashHandlerEnvironmentVariables(applicationInfo.sourceDir, applicationInfo.nativeLibraryDir, AbiHelper.getCurrentAbi());
    }

    public Boolean isSupportedAbi() {
        return isSupportedAbi(AbiHelper.getCurrentAbi());
    }

    public String useCrashpadDirectory(String str) {
        String str2 = str + CRASHPAD_DIRECTORY_PATH;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdir();
        }
        return str2;
    }

    public List<String> getCrashHandlerEnvironmentVariables(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            arrayList.add(String.format("%s=%s", entry.getKey(), entry.getValue()));
        }
        File file = new File(str2);
        String backtraceNativeLibraryPath = getBacktraceNativeLibraryPath(str2, str, str3);
        String strJoin = TextUtils.join(File.pathSeparator, new String[]{str2, file.getParentFile().getPath(), System.getProperty("java.library.path"), "/data/local"});
        arrayList.add(String.format("CLASSPATH=%s", str));
        arrayList.add(String.format("%s=%s", BACKTRACE_CRASH_HANDLER, backtraceNativeLibraryPath));
        arrayList.add(String.format("LD_LIBRARY_PATH=%s", strJoin));
        arrayList.add("ANDROID_DATA=/data");
        return arrayList;
    }

    public Boolean isSupportedAbi(String str) {
        return Boolean.valueOf(!UNSUPPORTED_ABIS.contains(str));
    }
}
