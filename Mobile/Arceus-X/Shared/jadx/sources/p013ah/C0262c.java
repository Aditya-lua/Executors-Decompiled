package p013ah;

import ae.AbstractC0159e;
import ae.C0155c;
import ae.C0157d;
import ae.InterfaceC0152b;
import ae.InterfaceC0161f;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import com.roblox.client.JNIAAssetManagerSetup;
import com.roblox.client.RobloxApplication;
import com.roblox.client.startup.C3272a;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEvent;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventData;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p140g0.C5918o0;
import p151gk.C6124q;
import sg.C11295a1;
import th.C11659h;

/* JADX INFO: renamed from: ah.c */
/* JADX INFO: loaded from: classes2.dex */
public class C0262c {

    /* JADX INFO: renamed from: a */
    public static InterfaceC0152b f724a;

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0161f f725b = new InterfaceC0161f() { // from class: ah.a
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p489vd.InterfaceC12158a
        /* JADX INFO: renamed from: a */
        public final void mo1207a(AbstractC0159e abstractC0159e) {
            C0262c.m1208a(abstractC0159e);
        }
    };

    /* JADX INFO: renamed from: c */
    public static final SharedPreferences.OnSharedPreferenceChangeListener f726c = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ah.b
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            C0262c.m1209b(sharedPreferences, str);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1208a(AbstractC0159e abstractC0159e) {
        switch (abstractC0159e.mo511i()) {
            case 0:
                C6124q.m27063h("rbx.channel", "sStatus: UNKNOWN for module " + abstractC0159e.m508f());
                m1214g("Unknown");
                break;
            case 1:
                C6124q.m27063h("rbx.channel", "sStatus: PENDING for module " + abstractC0159e.m508f());
                m1214g("Pending");
                m1213f("start", abstractC0159e.m508f());
                break;
            case 2:
                if (abstractC0159e.mo512j() == 0) {
                    C6124q.m27062g("Downloading " + abstractC0159e.m508f());
                } else {
                    C6124q.m27062g("Downloading " + abstractC0159e.m508f() + ", " + ((abstractC0159e.mo504a() * 100) / abstractC0159e.mo512j()) + "%");
                }
                m1214g("Downloading");
                break;
            case 3:
                C6124q.m27063h("rbx.channel", "sStatus: DOWNLOADED for module " + abstractC0159e.m508f());
                m1214g("Downloaded");
                m1213f("end", abstractC0159e.m508f());
                break;
            case 4:
                C6124q.m27063h("rbx.channel", "Installing " + abstractC0159e.m508f());
                m1214g("Installing");
                break;
            case 5:
                C6124q.m27063h("rbx.channel", "Installed " + abstractC0159e.m508f());
                m1214g("Installed");
                JNIAAssetManagerSetup.m14817a(RobloxApplication.m14834f());
                break;
            case 6:
                C6124q.m27063h("rbx.channel", "sStatus: Failed for module " + abstractC0159e.m508f());
                m1214g("Failed");
                break;
            case 7:
                C6124q.m27063h("rbx.channel", "sStatus: CANCELED for module " + abstractC0159e.m508f());
                m1214g("Canceled");
                break;
            case 8:
                C6124q.m27063h("rbx.channel", "REQUIRES_USER_CONFIRMATION is unsupported " + abstractC0159e.m508f());
                m1214g("Requires User Confirmation");
                break;
            case 9:
                C6124q.m27063h("rbx.channel", "sStatus: CANCELING for module " + abstractC0159e.m508f());
                m1214g("Canceling");
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1209b(SharedPreferences sharedPreferences, String str) {
        str.getClass();
        switch (str) {
            case "supportsAndroidBinaries":
                C6124q.m27063h("rbx.channel", "Supports ABC is " + sharedPreferences.getString("supportsAndroidBinaries", "").equals("true"));
                break;
            case "engine":
                C6124q.m27063h("rbx.channel", "Engine library name is " + sharedPreferences.getString("engine", ""));
                break;
            case "moduleName":
                String string = sharedPreferences.getString("moduleName", "");
                if (!string.isEmpty()) {
                    C6124q.m27063h("rbx.channel", "ABC module name is " + string);
                    m1211d(string);
                    break;
                }
                break;
            default:
                if (str.equals("channel")) {
                    String string2 = sharedPreferences.getString("channel", "");
                    if (!string2.isEmpty() && string2.startsWith("zgooglebinary") && !f724a.mo487e().contains(string2)) {
                        f724a.mo483a(C0157d.m495c().m500a(string2).m501b());
                    }
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1210c(Context context) {
        InterfaceC0152b interfaceC0152bM489a = C0155c.m489a(context);
        f724a = interfaceC0152bM489a;
        interfaceC0152bM489a.mo485c(f725b);
        SharedPreferences sharedPreferencesM42422U = C11295a1.m42422U(context);
        if (sharedPreferencesM42422U != null) {
            sharedPreferencesM42422U.registerOnSharedPreferenceChangeListener(f726c);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1211d(String str) {
        if (f724a.mo487e().contains(str)) {
            return;
        }
        f724a.mo483a(C0157d.m495c().m500a(str).m501b());
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1212e(String str) {
        if (f724a == null) {
            return false;
        }
        if (!C11659h.m43403a().mo43698p3() || !C11295a1.m42430Y()) {
            if (str.startsWith("zgooglebinary")) {
                return !f724a.mo487e().contains(str);
            }
            return false;
        }
        if (str.isEmpty()) {
            return false;
        }
        Set<String> setMo487e = f724a.mo487e();
        String strM42400J = C11295a1.m42400J();
        if (strM42400J.isEmpty()) {
            C6124q.m27063h("rbx.channel", "ABC module name is empty");
            return false;
        }
        boolean z10 = !setMo487e.contains(strM42400J);
        C6124q.m27063h("rbx.channel", "waiting for download: " + z10);
        return z10;
    }

    /* JADX INFO: renamed from: f */
    public static void m1213f(String str, List<String> list) {
        if (C11659h.m43403a().mo43717s1()) {
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
            LoggingProtocol.m15997j(RobloxTelemetryEvent.builder().setEventType(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(arrayList).setThrottlingHundredthPercentage(0).setEventName("android_binary_channel_download_timing").build()).setData(RobloxTelemetryEventData.builder().setStandardizedFields(arrayList3).setCustomStringFields(arrayList2).build()).build());
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m1214g(String str) {
        if (C11659h.m43403a().mo43576Y5()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(RobloxTelemetryEventConfig.POINTS_BACKEND);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new Pair("fingerprint", Build.FINGERPRINT));
            arrayList2.add(new Pair("lib_status", str));
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_OS_INFO);
            LoggingProtocol.m15997j(RobloxTelemetryEvent.builder().setEventType(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(arrayList).setThrottlingHundredthPercentage(C11659h.m43403a().mo43460I()).setEventName("android_binary_channel_gp").build()).setData(RobloxTelemetryEventData.builder().setStandardizedFields(arrayList3).setCustomStringFields(arrayList2).build()).build());
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m1215h(Context context) {
        if (!C11659h.m43403a().mo43698p3() || !C11295a1.m42430Y()) {
            String strM42426W = C11295a1.m42426W();
            Set<String> setMo487e = f724a.mo487e();
            if (setMo487e.contains(strM42426W)) {
                C3272a.m15686C(strM42426W);
            }
            ArrayList arrayList = new ArrayList();
            String strM42426W2 = C11295a1.m42426W();
            for (String str : setMo487e) {
                if (!str.equalsIgnoreCase(strM42426W2) && str.startsWith("zgooglebinary")) {
                    arrayList.add(str);
                }
            }
            f724a.mo486d(arrayList);
            return;
        }
        String strM42400J = C11295a1.m42400J();
        if (strM42400J.isEmpty()) {
            return;
        }
        if (C11295a1.m42426W().isEmpty()) {
            List<String> listM26551a = C5918o0.m26551a(new Object[]{strM42400J});
            C6124q.m27063h("rbx.channel", "Uninstalling " + strM42400J);
            f724a.mo486d(listM26551a);
            C11295a1.m42474s(context);
            return;
        }
        if (!f724a.mo487e().contains(strM42400J)) {
            m1211d(strM42400J);
            return;
        }
        String strM42398I = C11295a1.m42398I();
        if (strM42398I.isEmpty()) {
            C6124q.m27063h("rbx.channel", "ABC library name is empty!");
            return;
        }
        C6124q.m27063h("rbx.channel", "Setting library name to " + strM42398I);
        C3272a.m15686C(strM42398I);
    }
}
