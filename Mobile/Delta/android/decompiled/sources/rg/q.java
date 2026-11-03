package rg;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import com.roblox.client.RobloxWebActivity;
import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.engine.jni.NativeGLInterface;
import org.json.JSONObject;
import yj.m2;

/* JADX INFO: loaded from: classes2.dex */
public class q {
    public static Intent a(Activity activity, String str, String str2, boolean z10, boolean z11, boolean z12) {
        Intent intent = new Intent(activity, (Class<?>) RobloxWebActivity.class);
        intent.putExtra("URL_EXTRA", ek.f.c(str));
        intent.putExtra("TITLE_EXTRA", str2);
        intent.putExtra("USE_GENERIC_WEB_FRAG_EXTRA", z10);
        intent.putExtra("SEND_DATA_MODEL_FOCUS_EVENTS_EXTRA", z11);
        intent.putExtra("HIDE_ACCESSORY_BUTTONS_EXTRA", z12);
        return intent;
    }

    public static void b(JSONObject jSONObject, Activity activity) {
        uh.k0 k0VarA;
        JSONObject jSONObjectA = m2.a(jSONObject);
        if (jSONObjectA != null) {
            long jOptLong = jSONObjectA.optLong(PinShortcutHandler.EXTRA_PLACE_ID);
            long jOptLong2 = jSONObjectA.optLong("userId");
            long jOptLong3 = jSONObjectA.optLong("conversationId");
            String strOptString = jSONObjectA.optString("gameInstanceId");
            String strOptString2 = jSONObjectA.optString("reservedServerAccessCode");
            String strOptString3 = jSONObjectA.optString("callId");
            String strOptString4 = jSONObjectA.optString("referralPage");
            String strOptString5 = jSONObjectA.optString("accessCode");
            String strOptString6 = jSONObjectA.optString("linkCode");
            String strOptString7 = jSONObjectA.optString("launchData");
            long jOptLong4 = rh.h.a().c3() ? jSONObjectA.optLong("referredByPlayerId") : 0L;
            String strOptString8 = jSONObjectA.optString("eventId");
            String strOptString9 = jSONObjectA.optString("gameJoinContext");
            String strOptString10 = jSONObjectA.optString("joinAttemptId");
            String strOptString11 = jSONObjectA.optString("joinAttemptOrigin");
            String strOptString12 = jSONObjectA.optString("isoContext");
            String strOptString13 = rh.h.a().D3() ? jSONObjectA.optString("gameIdToExclude") : "";
            if (jOptLong > 0 && jOptLong3 > 0) {
                k0VarA = uh.k0.b(Long.valueOf(jOptLong), Long.valueOf(jOptLong3), strOptString4, strOptString10, strOptString11);
            } else if (jOptLong > 0 || jOptLong2 > 0) {
                Long lValueOf = jOptLong == 0 ? null : Long.valueOf(jOptLong);
                Long lValueOf2 = jOptLong2 == 0 ? null : Long.valueOf(jOptLong2);
                if (TextUtils.isEmpty(strOptString5)) {
                    strOptString5 = null;
                }
                if (TextUtils.isEmpty(strOptString6)) {
                    strOptString6 = null;
                }
                String str = TextUtils.isEmpty(strOptString) ? null : strOptString;
                if (TextUtils.isEmpty(strOptString2)) {
                    strOptString2 = null;
                }
                if (TextUtils.isEmpty(strOptString3)) {
                    strOptString3 = null;
                }
                k0VarA = uh.k0.a(lValueOf, lValueOf2, strOptString5, strOptString6, str, strOptString2, strOptString3, null, strOptString4, strOptString7, strOptString9, strOptString8, strOptString10, strOptString11, strOptString12, Long.valueOf(jOptLong4), strOptString13);
            } else {
                k0VarA = null;
            }
            if (k0VarA != null) {
                j(k0VarA, activity);
                ti.g.b().j(activity);
            }
        }
    }

    public static void c(uh.k0 k0Var, Activity activity) {
        int iMyPid = Process.myPid();
        boolean zIsDebuggerConnected = Debug.isDebuggerConnected();
        if (k0Var != null) {
            long jP = k0Var.p();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Launching PlaceId:");
            sb2.append(jP);
            sb2.append(" Pid:");
            sb2.append(iMyPid);
            sb2.append(" Debugger:");
            sb2.append(zIsDebuggerConnected ? "attached" : PayloadNotificationChannel.SOUND_NONE);
            ek.q.h("ActivityUtils", sb2.toString());
        }
        y.h().f().q(activity, k0Var, 20104);
    }

    public static void d(Activity activity, String str, boolean z10) {
        activity.startActivity(a(activity, str, activity.getString(q0.f30583w), true, z10, true));
        activity.overridePendingTransition(g0.b, R.anim.fade_out);
    }

    public static void e(Activity activity, String str, int i10, boolean z10, boolean z11) {
        h(activity, str, activity.getString(i10), z10, z11);
    }

    public static void f(Activity activity, String str, String str2) {
        i(activity, str, str2, false, false, false);
    }

    public static void g(Activity activity, String str, String str2, String str3) {
        Intent intentA = a(activity, str, str2, true, true, true);
        if (str3 != null) {
            intentA.putExtra("SEARCH_PARAMS", str3);
        }
        k(activity, intentA, true);
    }

    public static void h(Activity activity, String str, String str2, boolean z10, boolean z11) {
        i(activity, str, str2, z10, z11, false);
    }

    public static void i(Activity activity, String str, String str2, boolean z10, boolean z11, boolean z12) {
        k(activity, a(activity, str, str2, z10, z11, z12), z10);
    }

    public static void j(uh.k0 k0Var, Activity activity) {
        if (activity == null || activity.isDestroyed()) {
            return;
        }
        a1.f30335v = true;
        ek.q.b("GameLaunch", "startLaunchGame: activity=" + activity);
        c(k0Var, activity);
    }

    public static void k(Activity activity, Intent intent, boolean z10) {
        activity.startActivityForResult(intent, 20110);
        if (z10 || NativeGLInterface.nativeUserGameSettingsGetReducedMotion()) {
            activity.overridePendingTransition(0, 0);
        } else {
            activity.overridePendingTransition(g0.b, R.anim.fade_out);
        }
    }
}
