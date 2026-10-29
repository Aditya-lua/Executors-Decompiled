package sg;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import com.roblox.client.RobloxWebActivity;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.engine.jni.NativeGLInterface;
import org.json.JSONObject;
import p151gk.C6113f;
import p151gk.C6124q;
import p517wh.C12442j0;
import th.C11659h;
import vi.C12216g;

/* JADX INFO: renamed from: sg.q */
/* JADX INFO: loaded from: classes2.dex */
public class C11346q {
    /* JADX INFO: renamed from: a */
    public static Intent m42508a(Activity activity, String str, String str2, boolean z10, boolean z11, boolean z12) {
        Intent intent = new Intent(activity, (Class<?>) RobloxWebActivity.class);
        intent.putExtra("URL_EXTRA", C6113f.m27028c(str));
        intent.putExtra("TITLE_EXTRA", str2);
        intent.putExtra("USE_GENERIC_WEB_FRAG_EXTRA", z10);
        intent.putExtra("SEND_DATA_MODEL_FOCUS_EVENTS_EXTRA", z11);
        intent.putExtra("HIDE_ACCESSORY_BUTTONS_EXTRA", z12);
        return intent;
    }

    /* JADX INFO: renamed from: b */
    public static void m42509b(JSONObject jSONObject, Activity activity) {
        C12442j0 c12442j0M46628a;
        if (jSONObject != null) {
            long jOptLong = jSONObject.optLong(PinShortcutHandler.EXTRA_PLACE_ID);
            long jOptLong2 = jSONObject.optLong("userId");
            long jOptLong3 = jSONObject.optLong("conversationId");
            String strOptString = jSONObject.optString("gameInstanceId");
            String strOptString2 = jSONObject.optString("reservedServerAccessCode");
            String strOptString3 = jSONObject.optString("callId");
            String strOptString4 = jSONObject.optString("referralPage");
            String strOptString5 = jSONObject.optString("accessCode");
            String strOptString6 = jSONObject.optString("linkCode");
            String strOptString7 = jSONObject.optString("launchData");
            long jOptLong4 = C11659h.m43403a().mo43566X2() ? jSONObject.optLong("referredByPlayerId") : 0L;
            String strOptString8 = jSONObject.optString("eventId");
            String strOptString9 = jSONObject.optString("gameJoinContext");
            String strOptString10 = jSONObject.optString("joinAttemptId");
            String strOptString11 = jSONObject.optString("joinAttemptOrigin");
            String strOptString12 = jSONObject.optString("isoContext");
            String strOptString13 = C11659h.m43403a().mo43754x3() ? jSONObject.optString("gameIdToExclude") : "";
            if (jOptLong > 0 && jOptLong3 > 0) {
                c12442j0M46628a = C12442j0.m46629b(Long.valueOf(jOptLong), Long.valueOf(jOptLong3), strOptString4, strOptString10, strOptString11);
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
                c12442j0M46628a = C12442j0.m46628a(lValueOf, lValueOf2, strOptString5, strOptString6, str, strOptString2, strOptString3, null, strOptString4, strOptString7, strOptString9, strOptString8, strOptString10, strOptString11, strOptString12, Long.valueOf(jOptLong4), strOptString13);
            } else {
                c12442j0M46628a = null;
            }
            if (c12442j0M46628a != null) {
                m42517j(c12442j0M46628a, activity);
                C12216g.m45228b().m45271j(activity);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m42510c(C12442j0 c12442j0, Activity activity) {
        int iMyPid = Process.myPid();
        boolean zIsDebuggerConnected = Debug.isDebuggerConnected();
        if (c12442j0 != null) {
            long jM46656p = c12442j0.m46656p();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Launching PlaceId:");
            sb2.append(jM46656p);
            sb2.append(" Pid:");
            sb2.append(iMyPid);
            sb2.append(" Debugger:");
            sb2.append(zIsDebuggerConnected ? "attached" : "none");
            C6124q.m27063h("ActivityUtils", sb2.toString());
        }
        C11370y.m42581h().m42587f().m15283q(activity, c12442j0, 20104);
    }

    /* JADX INFO: renamed from: d */
    public static void m42511d(Activity activity, String str, boolean z10) {
        activity.startActivity(m42508a(activity, str, activity.getString(C11347q0.f40019w), true, z10, true));
        activity.overridePendingTransition(C11317g0.f39699b, R.anim.fade_out);
    }

    /* JADX INFO: renamed from: e */
    public static void m42512e(Activity activity, String str, int i10, boolean z10, boolean z11) {
        m42515h(activity, str, activity.getString(i10), z10, z11);
    }

    /* JADX INFO: renamed from: f */
    public static void m42513f(Activity activity, String str, String str2) {
        m42516i(activity, str, str2, false, false, false);
    }

    /* JADX INFO: renamed from: g */
    public static void m42514g(Activity activity, String str, String str2, String str3) {
        Intent intentM42508a = m42508a(activity, str, str2, true, true, true);
        if (str3 != null) {
            intentM42508a.putExtra("SEARCH_PARAMS", str3);
        }
        m42518k(activity, intentM42508a, true);
    }

    /* JADX INFO: renamed from: h */
    public static void m42515h(Activity activity, String str, String str2, boolean z10, boolean z11) {
        m42516i(activity, str, str2, z10, z11, false);
    }

    /* JADX INFO: renamed from: i */
    public static void m42516i(Activity activity, String str, String str2, boolean z10, boolean z11, boolean z12) {
        m42518k(activity, m42508a(activity, str, str2, z10, z11, z12), z10);
    }

    /* JADX INFO: renamed from: j */
    public static void m42517j(C12442j0 c12442j0, Activity activity) {
        if (activity == null || activity.isDestroyed()) {
            return;
        }
        C11295a1.f39658v = true;
        C6124q.m27057b("GameLaunch", "startLaunchGame: activity=" + activity);
        m42510c(c12442j0, activity);
    }

    /* JADX INFO: renamed from: k */
    public static void m42518k(Activity activity, Intent intent, boolean z10) {
        activity.startActivityForResult(intent, 20110);
        if (z10 || NativeGLInterface.nativeUserGameSettingsGetReducedMotion()) {
            activity.overridePendingTransition(0, 0);
        } else {
            activity.overridePendingTransition(C11317g0.f39699b, R.anim.fade_out);
        }
    }
}
