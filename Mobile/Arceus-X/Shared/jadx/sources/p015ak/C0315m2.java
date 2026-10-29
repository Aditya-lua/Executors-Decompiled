package p015ak;

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
import p146g6.C6032l;
import p151gk.C6124q;
import th.C11659h;

/* JADX INFO: renamed from: ak.m2 */
/* JADX INFO: loaded from: classes2.dex */
public class C0315m2 {

    /* JADX INFO: renamed from: a */
    public static final String[] f818a = {":isolate"};

    /* JADX INFO: renamed from: a */
    public static List<ApplicationExitInfoCpp> m1317a(Context context) {
        ActivityManager activityManager;
        if (Build.VERSION.SDK_INT >= 30 && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
            List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, C11659h.m43403a().mo43592b());
            if (historicalProcessExitReasons.isEmpty()) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
            while (it.hasNext()) {
                ApplicationExitInfo applicationExitInfoM26834a = C6032l.m26834a(it.next());
                if (!m1320d(applicationExitInfoM26834a).booleanValue()) {
                    int reason = applicationExitInfoM26834a.getReason();
                    int status = applicationExitInfoM26834a.getStatus();
                    String string = applicationExitInfoM26834a.toString();
                    String strM1318b = m1318b(string, "reason");
                    String strM1318b2 = m1318b(string, "subreason");
                    if (!strM1318b.equals("APPLICATION EXIT INFO FORMAT CHANGED") && !ActivityManager.isLowMemoryKillReportSupported() && reason == 2 && status == OsConstants.SIGKILL) {
                        strM1318b2 = "LOW_MEMORY";
                    }
                    arrayList.add(new ApplicationExitInfoCpp(applicationExitInfoM26834a.getPid(), status, applicationExitInfoM26834a.getTimestamp(), strM1318b, strM1318b2, applicationExitInfoM26834a.getDescription(), applicationExitInfoM26834a.getPss(), applicationExitInfoM26834a.getRss(), applicationExitInfoM26834a.getImportance()));
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: b */
    public static String m1318b(String str, String str2) {
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

    /* JADX INFO: renamed from: c */
    public static void m1319c(ApplicationExitInfo applicationExitInfo) {
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
        String strM1318b = m1318b(string, "reason");
        String strM1318b2 = m1318b(string, "subreason");
        arrayList3.add(new Pair("reason", strM1318b));
        arrayList3.add(new Pair("subreason", strM1318b2));
        LoggingProtocol.m15997j(RobloxTelemetryEvent.builder().setEventType(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(arrayList).setThrottlingHundredthPercentage(C11659h.m43403a().mo43496N1()).setEventName("SkipInferredCrashEvent").build()).setData(RobloxTelemetryEventData.builder().setStandardizedFields(arrayList2).setCustomStringFields(arrayList3).build()).build());
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m1320d(ApplicationExitInfo applicationExitInfo) {
        if (Build.VERSION.SDK_INT < 30) {
            return Boolean.FALSE;
        }
        for (String str : f818a) {
            String processName = applicationExitInfo.getProcessName();
            if (processName.endsWith(str)) {
                C6124q.m27063h("PreviousExitReasonHelper", "Skipping reporting inferred crash for process name " + processName);
                m1319c(applicationExitInfo);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
