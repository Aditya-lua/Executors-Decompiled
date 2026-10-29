package ah;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import com.roblox.client.JNIAAssetManagerSetup;
import com.roblox.client.RobloxApplication;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEvent;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventData;
import com.roblox.universalapp.logging.LoggingProtocol;
import g0.o0;
import gk.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import sg.a1;
import th.h;
import zd.d;
import zd.e;
import zd.f;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static zd.b f545a;
    public static final f b = new f() { // from class: ah.a
        @Override // ud.a
        public final void a(e eVar) {
            c.a(eVar);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SharedPreferences.OnSharedPreferenceChangeListener f546c = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ah.b
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            c.b(sharedPreferences, str);
        }
    };

    public static /* synthetic */ void a(e eVar) {
        switch (eVar.i()) {
            case 0:
                p.h("rbx.channel", "sStatus: UNKNOWN for module " + eVar.f());
                g("Unknown");
                break;
            case 1:
                p.h("rbx.channel", "sStatus: PENDING for module " + eVar.f());
                g("Pending");
                f("start", eVar.f());
                break;
            case 2:
                if (eVar.j() == 0) {
                    p.g("Downloading " + eVar.f());
                } else {
                    p.g("Downloading " + eVar.f() + ", " + ((eVar.a() * 100) / eVar.j()) + "%");
                }
                g("Downloading");
                break;
            case 3:
                p.h("rbx.channel", "sStatus: DOWNLOADED for module " + eVar.f());
                g("Downloaded");
                f("end", eVar.f());
                break;
            case 4:
                p.h("rbx.channel", "Installing " + eVar.f());
                g("Installing");
                break;
            case 5:
                p.h("rbx.channel", "Installed " + eVar.f());
                g("Installed");
                JNIAAssetManagerSetup.a(RobloxApplication.f());
                break;
            case 6:
                p.h("rbx.channel", "sStatus: Failed for module " + eVar.f());
                g("Failed");
                break;
            case 7:
                p.h("rbx.channel", "sStatus: CANCELED for module " + eVar.f());
                g("Canceled");
                break;
            case 8:
                p.h("rbx.channel", "REQUIRES_USER_CONFIRMATION is unsupported " + eVar.f());
                g("Requires User Confirmation");
                break;
            case 9:
                p.h("rbx.channel", "sStatus: CANCELING for module " + eVar.f());
                g("Canceling");
                break;
        }
    }

    public static /* synthetic */ void b(SharedPreferences sharedPreferences, String str) {
        str.getClass();
        switch (str) {
            case "supportsAndroidBinaries":
                p.h("rbx.channel", "Supports ABC is " + sharedPreferences.getString("supportsAndroidBinaries", "").equals("true"));
                break;
            case "engine":
                p.h("rbx.channel", "Engine library name is " + sharedPreferences.getString("engine", ""));
                break;
            case "moduleName":
                String string = sharedPreferences.getString("moduleName", "");
                if (!string.isEmpty()) {
                    p.h("rbx.channel", "ABC module name is " + string);
                    d(string);
                    break;
                }
                break;
            default:
                if (str.equals("channel")) {
                    String string2 = sharedPreferences.getString("channel", "");
                    if (!string2.isEmpty() && string2.startsWith("zgooglebinary") && !f545a.e().contains(string2)) {
                        f545a.b(d.c().a(string2).b());
                    }
                    break;
                }
                break;
        }
    }

    public static void c(Context context) {
        zd.b bVarA = zd.c.a(context);
        f545a = bVarA;
        bVarA.c(b);
        SharedPreferences sharedPreferencesU = a1.U(context);
        if (sharedPreferencesU != null) {
            sharedPreferencesU.registerOnSharedPreferenceChangeListener(f546c);
        }
    }

    public static void d(String str) {
        if (f545a.e().contains(str)) {
            return;
        }
        f545a.b(d.c().a(str).b());
    }

    public static boolean e(String str) {
        if (f545a == null) {
            return false;
        }
        if (!h.a().j3() || !a1.Y()) {
            if (str.startsWith("zgooglebinary")) {
                return !f545a.e().contains(str);
            }
            return false;
        }
        if (str.isEmpty()) {
            return false;
        }
        Set<String> setE = f545a.e();
        String strJ = a1.J();
        if (strJ.isEmpty()) {
            p.h("rbx.channel", "ABC module name is empty");
            return false;
        }
        boolean z10 = !setE.contains(strJ);
        p.h("rbx.channel", "waiting for download: " + z10);
        return z10;
    }

    public static void f(String str, List<String> list) {
        if (h.a().n1()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(RobloxTelemetryEventConfig.POINTS_BACKEND);
            arrayList.add(RobloxTelemetryEventConfig.EVENT_INGEST_BACKEND);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new Pair("fingerprint", Build.FINGERPRINT));
            arrayList2.add(new Pair("phase", str));
            arrayList2.add(new Pair("module_names", String.join(",", list)));
            arrayList2.add(new Pair("elapsed_realtime_ms", String.valueOf(SystemClock.elapsedRealtime())));
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_OS_INFO);
            LoggingProtocol.j(RobloxTelemetryEvent.builder().setEventType(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(arrayList).setThrottlingHundredthPercentage(0).setEventName("android_binary_channel_download_timing").build()).setData(RobloxTelemetryEventData.builder().setStandardizedFields(arrayList3).setCustomStringFields(arrayList2).build()).build());
        }
    }

    public static void g(String str) {
        if (h.a().S5()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(RobloxTelemetryEventConfig.POINTS_BACKEND);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new Pair("fingerprint", Build.FINGERPRINT));
            arrayList2.add(new Pair("lib_status", str));
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_OS_INFO);
            LoggingProtocol.j(RobloxTelemetryEvent.builder().setEventType(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(arrayList).setThrottlingHundredthPercentage(h.a().F()).setEventName("android_binary_channel_gp").build()).setData(RobloxTelemetryEventData.builder().setStandardizedFields(arrayList3).setCustomStringFields(arrayList2).build()).build());
        }
    }

    public static void h(Context context) {
        if (!h.a().j3() || !a1.Y()) {
            String strW = a1.W();
            Set<String> setE = f545a.e();
            if (setE.contains(strW)) {
                com.roblox.client.startup.a.C(strW);
            }
            ArrayList arrayList = new ArrayList();
            String strW2 = a1.W();
            for (String str : setE) {
                if (!str.equalsIgnoreCase(strW2) && str.startsWith("zgooglebinary")) {
                    arrayList.add(str);
                }
            }
            f545a.d(arrayList);
            return;
        }
        String strJ = a1.J();
        if (strJ.isEmpty()) {
            return;
        }
        if (a1.W().isEmpty()) {
            List<String> listA = o0.a(new Object[]{strJ});
            p.h("rbx.channel", "Uninstalling " + strJ);
            f545a.d(listA);
            a1.s(context);
            return;
        }
        if (!f545a.e().contains(strJ)) {
            d(strJ);
            return;
        }
        String strI = a1.I();
        if (strI.isEmpty()) {
            p.h("rbx.channel", "ABC library name is empty!");
            return;
        }
        p.h("rbx.channel", "Setting library name to " + strI);
        com.roblox.client.startup.a.C(strI);
    }
}
