package jh;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import bh.a1;
import bi.h;
import ce.d;
import ce.e;
import ce.f;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.JNIAAssetManagerSetup;
import com.roblox.client.RobloxApplication;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEvent;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventData;
import com.roblox.universalapp.logging.LoggingProtocol;
import g0.o0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ce.b f20776a;
    public static final f b = new f() { // from class: jh.a
        @Override // xd.a
        public final void a(e eVar) {
            c.a(eVar);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SharedPreferences.OnSharedPreferenceChangeListener f20777c = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: jh.b
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            c.b(sharedPreferences, str);
        }
    };

    public static /* synthetic */ void a(e eVar) {
        switch (eVar.i()) {
            case 0:
                q.h("rbx.channel", "sStatus: UNKNOWN for module " + eVar.f());
                g("Unknown");
                break;
            case 1:
                q.h("rbx.channel", "sStatus: PENDING for module " + eVar.f());
                g("Pending");
                f("start", eVar.f());
                break;
            case 2:
                if (eVar.j() == 0) {
                    q.g("Downloading " + eVar.f());
                } else {
                    q.g("Downloading " + eVar.f() + ", " + ((eVar.a() * 100) / eVar.j()) + "%");
                }
                g("Downloading");
                break;
            case 3:
                q.h("rbx.channel", "sStatus: DOWNLOADED for module " + eVar.f());
                g("Downloaded");
                f("end", eVar.f());
                break;
            case 4:
                q.h("rbx.channel", "Installing " + eVar.f());
                g("Installing");
                break;
            case 5:
                q.h("rbx.channel", "Installed " + eVar.f());
                g("Installed");
                JNIAAssetManagerSetup.a(RobloxApplication.f());
                break;
            case 6:
                q.h("rbx.channel", "sStatus: Failed for module " + eVar.f());
                g("Failed");
                break;
            case 7:
                q.h("rbx.channel", "sStatus: CANCELED for module " + eVar.f());
                g("Canceled");
                break;
            case 8:
                q.h("rbx.channel", "REQUIRES_USER_CONFIRMATION is unsupported " + eVar.f());
                g("Requires User Confirmation");
                break;
            case 9:
                q.h("rbx.channel", "sStatus: CANCELING for module " + eVar.f());
                g("Canceling");
                break;
        }
    }

    public static /* synthetic */ void b(SharedPreferences sharedPreferences, String str) {
        str.getClass();
        switch (str) {
            case "supportsAndroidBinaries":
                q.h("rbx.channel", "Supports ABC is " + sharedPreferences.getString("supportsAndroidBinaries", BuildConfig.FLAVOR).equals("true"));
                break;
            case "engine":
                q.h("rbx.channel", "Engine library name is " + sharedPreferences.getString("engine", BuildConfig.FLAVOR));
                break;
            case "moduleName":
                String string = sharedPreferences.getString("moduleName", BuildConfig.FLAVOR);
                if (!string.isEmpty()) {
                    q.h("rbx.channel", "ABC module name is " + string);
                    d(string);
                    break;
                }
                break;
            default:
                if (str.equals("channel")) {
                    String string2 = sharedPreferences.getString("channel", BuildConfig.FLAVOR);
                    if (!string2.isEmpty() && string2.startsWith("zgooglebinary") && !f20776a.b().contains(string2)) {
                        f20776a.d(d.c().a(string2).b());
                    }
                    break;
                }
                break;
        }
    }

    public static void c(Context context) {
        ce.b bVarA = ce.c.a(context);
        f20776a = bVarA;
        bVarA.c(b);
        SharedPreferences sharedPreferencesU = a1.U(context);
        if (sharedPreferencesU != null) {
            sharedPreferencesU.registerOnSharedPreferenceChangeListener(f20777c);
        }
    }

    public static void d(String str) {
        if (f20776a.b().contains(str)) {
            return;
        }
        f20776a.d(d.c().a(str).b());
    }

    public static boolean e(String str) {
        if (f20776a == null) {
            return false;
        }
        if (!h.a().w3() || !a1.Y()) {
            if (str.startsWith("zgooglebinary")) {
                return !f20776a.b().contains(str);
            }
            return false;
        }
        if (str.isEmpty()) {
            return false;
        }
        Set<String> setB = f20776a.b();
        String strJ = a1.J();
        if (strJ.isEmpty()) {
            q.h("rbx.channel", "ABC module name is empty");
            return false;
        }
        boolean z10 = !setB.contains(strJ);
        q.h("rbx.channel", "waiting for download: " + z10);
        return z10;
    }

    public static void f(String str, List<String> list) {
        if (h.a().w1()) {
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
            LoggingProtocol.j(RobloxTelemetryEvent.builder().e(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).c(RobloxTelemetryEventConfig.builder().c(arrayList).e(0).d("android_binary_channel_download_timing").b()).d(RobloxTelemetryEventData.builder().d(arrayList3).c(arrayList2).b()).b());
        }
    }

    public static void g(String str) {
        if (h.a().Z5()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(RobloxTelemetryEventConfig.POINTS_BACKEND);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new Pair("fingerprint", Build.FINGERPRINT));
            arrayList2.add(new Pair("lib_status", str));
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_OS_INFO);
            LoggingProtocol.j(RobloxTelemetryEvent.builder().e(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).c(RobloxTelemetryEventConfig.builder().c(arrayList).e(h.a().H()).d("android_binary_channel_gp").b()).d(RobloxTelemetryEventData.builder().d(arrayList3).c(arrayList2).b()).b());
        }
    }

    public static void h(Context context) {
        if (!h.a().w3() || !a1.Y()) {
            String strW = a1.W();
            Set<String> setB = f20776a.b();
            if (setB.contains(strW)) {
                com.roblox.client.startup.a.C(strW);
            }
            ArrayList arrayList = new ArrayList();
            String strW2 = a1.W();
            for (String str : setB) {
                if (!str.equalsIgnoreCase(strW2) && str.startsWith("zgooglebinary")) {
                    arrayList.add(str);
                }
            }
            f20776a.a(arrayList);
            return;
        }
        String strJ = a1.J();
        if (strJ.isEmpty()) {
            return;
        }
        if (a1.W().isEmpty()) {
            List<String> listA = o0.a(new Object[]{strJ});
            q.h("rbx.channel", "Uninstalling " + strJ);
            f20776a.a(listA);
            a1.s(context);
            return;
        }
        if (!f20776a.b().contains(strJ)) {
            d(strJ);
            return;
        }
        String strI = a1.I();
        if (strI.isEmpty()) {
            q.h("rbx.channel", "ABC library name is empty!");
            return;
        }
        q.h("rbx.channel", "Setting library name to " + strI);
        com.roblox.client.startup.a.C(strI);
    }
}
