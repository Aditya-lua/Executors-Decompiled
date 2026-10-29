package ak;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.system.OsConstants;
import android.util.Pair;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEvent;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventData;
import com.roblox.engine.jni.model.ApplicationExitInfoCpp;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f621a = {":isolate"};

    public static List<ApplicationExitInfoCpp> a(Context context) {
        ActivityManager activityManager;
        if (Build.VERSION.SDK_INT >= 30 && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
            List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, th.h.a().b());
            if (historicalProcessExitReasons.isEmpty()) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
            while (it.hasNext()) {
                ApplicationExitInfo applicationExitInfoA = g6.l.a(it.next());
                if (!d(applicationExitInfoA).booleanValue()) {
                    int reason = applicationExitInfoA.getReason();
                    int status = applicationExitInfoA.getStatus();
                    String string = applicationExitInfoA.toString();
                    String strB = b(string, "reason");
                    String strB2 = b(string, "subreason");
                    if (!strB.equals("APPLICATION EXIT INFO FORMAT CHANGED") && !ActivityManager.isLowMemoryKillReportSupported() && reason == 2 && status == OsConstants.SIGKILL) {
                        strB2 = "LOW_MEMORY";
                    }
                    arrayList.add(new ApplicationExitInfoCpp(applicationExitInfoA.getPid(), status, applicationExitInfoA.getTimestamp(), strB, strB2, applicationExitInfoA.getDescription(), applicationExitInfoA.getPss(), applicationExitInfoA.getRss(), applicationExitInfoA.getImportance()));
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public static String b(String str, String str2) {
        String strSubstring;
        int iIndexOf;
        if (!str2.equals("reason") && !str2.equals("subreason")) {
            return "INVALID USE OF FUNCTION";
        }
        int iIndexOf2 = str.indexOf(str2 + "=");
        if (iIndexOf2 == -1 || (iIndexOf = (strSubstring = str.substring(iIndexOf2)).indexOf(") ")) == -1) {
            return "APPLICATION EXIT INFO FORMAT CHANGED";
        }
        String strSubstring2 = strSubstring.substring(0, iIndexOf);
        return strSubstring2.indexOf(40) != -1 ? strSubstring2.substring(strSubstring2.indexOf(40) + 1) : "APPLICATION EXIT INFO FORMAT CHANGED";
    }

    public static void c(ApplicationExitInfo applicationExitInfo) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(RobloxTelemetryEventConfig.POINTS_BACKEND);
        arrayList.add(RobloxTelemetryEventConfig.EVENT_INGEST_BACKEND);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_OS_INFO);
        arrayList2.add(RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_universe_ID);
        arrayList2.add(RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_PLACE_ID);
        arrayList2.add(RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_PLACE_SESSION_ID);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new Pair("description", applicationExitInfo.getDescription()));
        arrayList3.add(new Pair("importance", String.valueOf(applicationExitInfo.getImportance())));
        arrayList3.add(new Pair("processName", applicationExitInfo.getProcessName()));
        String string = applicationExitInfo.toString();
        String strB = b(string, "reason");
        String strB2 = b(string, "subreason");
        arrayList3.add(new Pair("reason", strB));
        arrayList3.add(new Pair("subreason", strB2));
        LoggingProtocol.j(RobloxTelemetryEvent.builder().setEventType(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(arrayList).setThrottlingHundredthPercentage(th.h.a().H1()).setEventName("SkipInferredCrashEvent").build()).setData(RobloxTelemetryEventData.builder().setStandardizedFields(arrayList2).setCustomStringFields(arrayList3).build()).build());
    }

    public static Boolean d(ApplicationExitInfo applicationExitInfo) {
        if (Build.VERSION.SDK_INT < 30) {
            return Boolean.FALSE;
        }
        for (String str : f621a) {
            String processName = applicationExitInfo.getProcessName();
            if (processName.endsWith(str)) {
                gk.p.h("PreviousExitReasonHelper", "Skipping reporting inferred crash for process name " + processName);
                c(applicationExitInfo);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
