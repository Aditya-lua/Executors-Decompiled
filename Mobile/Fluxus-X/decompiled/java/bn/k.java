package bn;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<Activity> f4472a;
    public MessageBus b = MessageBus.getInstance();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4473c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Integer, String[]> f4474d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4475e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<Connection> f4476f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<String, b> f4477g = new HashMap();

    public interface a {
        boolean e(Context context);
    }

    public interface b {
        void a(Context context, boolean z10, boolean z11);

        boolean b(Context context);

        boolean c(Context context, boolean z10);

        boolean d(Context context);
    }

    public k() {
        this.f4476f.add(this.b.subscribeProtocolMethodRequest("PermissionsProtocol", "PermissionsRequest", new Callback() { // from class: bn.a
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void run(JSONObject jSONObject) {
                this.f4462a.C(jSONObject);
            }
        }));
        this.f4476f.add(this.b.subscribeProtocolMethodRequest("PermissionsProtocol", "HasPermissions", new Callback() { // from class: bn.b
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void run(JSONObject jSONObject) {
                this.f4463a.y(jSONObject);
            }
        }));
        this.f4476f.add(this.b.subscribeProtocolMethodRequest("PermissionsProtocol", "SupportsPermissions", new Callback() { // from class: bn.c
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void run(JSONObject jSONObject) {
                this.f4464a.J(jSONObject);
            }
        }));
        this.f4476f.add(this.b.subscribeProtocolMethodRequest("PermissionsProtocol", "ShouldShowPermissionUpsell", new Callback() { // from class: bn.d
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void run(JSONObject jSONObject) {
                this.f4465a.G(jSONObject);
            }
        }));
        this.f4476f.add(this.b.subscribeProtocolMethodRequest("PermissionsProtocol", "ShouldShowRequestPermissionRationale", new Callback() { // from class: bn.e
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void run(JSONObject jSONObject) {
                this.f4466a.I(jSONObject);
            }
        }));
        if (bi.h.a().N()) {
            this.f4476f.add(this.b.subscribeProtocolMethodRequest("PermissionsProtocol", "OpenNotificationSettings", new Callback() { // from class: bn.f
                @Override // com.roblox.universalapp.messagebus.Callback
                public final void run(JSONObject jSONObject) {
                    this.f4467a.B(jSONObject);
                }
            }));
            this.f4476f.add(this.b.subscribeProtocolMethodRequest("PermissionsProtocol", "GetPushNotificationsEnabled", new Callback() { // from class: bn.g
                @Override // com.roblox.universalapp.messagebus.Callback
                public final void run(JSONObject jSONObject) {
                    this.f4468a.x(jSONObject);
                }
            }));
        }
    }

    public static List<String> M(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static HashMap<String, String> i(String str, String[] strArr) {
        HashMap<String, String> map = new HashMap<>();
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        if (hashSet.contains("CAMERA_ACCESS")) {
            map.put("missing_camera_access", BuildConfig.FLAVOR);
        }
        if (hashSet.contains("MICROPHONE_ACCESS")) {
            map.put("missing_microphone_access", BuildConfig.FLAVOR);
        }
        if (hashSet.contains("LOCAL_NETWORK")) {
            map.put("missing_local_network", BuildConfig.FLAVOR);
        }
        if (hashSet.contains("CONTACTS_ACCESS")) {
            map.put("missing_contacts_access", BuildConfig.FLAVOR);
        }
        if (hashSet.contains("WRITE_MEDIA_STORAGE")) {
            map.put("missing_write_media_storage", BuildConfig.FLAVOR);
        }
        if (hashSet.contains("POST_NOTIFICATIONS")) {
            map.put("missing_post_notifications", BuildConfig.FLAVOR);
        }
        map.put("status", str);
        return map;
    }

    public static HashMap<String, String> j(String str, String[] strArr) {
        HashMap<String, String> map = new HashMap<>();
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        if (hashSet.contains("CAMERA_ACCESS")) {
            map.put("missing_camera_access", BuildConfig.FLAVOR);
        }
        if (hashSet.contains("MICROPHONE_ACCESS")) {
            map.put("missing_microphone_access", BuildConfig.FLAVOR);
        }
        if (hashSet.contains("LOCAL_NETWORK")) {
            map.put("missing_local_network", BuildConfig.FLAVOR);
        }
        if (hashSet.contains("CONTACTS_ACCESS")) {
            map.put("missing_contacts_access", BuildConfig.FLAVOR);
        }
        if (hashSet.contains("WRITE_MEDIA_STORAGE")) {
            map.put("missing_write_media_storage", BuildConfig.FLAVOR);
        }
        if (hashSet.contains("POST_NOTIFICATIONS")) {
            map.put("missing_post_notifications", BuildConfig.FLAVOR);
        }
        map.put("upsellStatus", str);
        return map;
    }

    public static boolean t() {
        return false;
    }

    public final void A(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", str);
        } catch (JSONException e10) {
            Log.e("PermissionsProtocol", "JSON exception while handling OpenNotificationSettings: " + e10.toString());
        }
        HashMap map = new HashMap();
        map.put("status", str);
        Log.d("PermissionsProtocol", "Open notification settings response: " + jSONObject.toString());
        this.b.publishProtocolMethodResponse("PermissionsProtocol", "OpenNotificationSettings", jSONObject, 0, map);
    }

    public void B(JSONObject jSONObject) {
        Log.d("PermissionsProtocol", "onOpenNotificationSettingsRequest: " + jSONObject.toString());
        WeakReference<Activity> weakReference = this.f4472a;
        final Activity activity = weakReference == null ? null : weakReference.get();
        if (activity != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: bn.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4470a.u(activity);
                }
            });
        } else {
            Log.e("PermissionsProtocol", "No Activity found while opening notification settings");
            A("FAILED");
        }
    }

    public void C(JSONObject jSONObject) {
        Log.d("PermissionsProtocol", "onPermissionRequest: " + jSONObject.toString());
        P(h(jSONObject, "PermissionsRequest"));
    }

    public final void D(String str, String[] strArr) {
        this.b.publishProtocolMethodResponse("PermissionsProtocol", "PermissionsRequest", f(str, strArr, "PermissionsRequest"), 0, i(str, strArr));
    }

    public void E(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        WeakReference<Activity> weakReference;
        b bVar;
        WeakReference<Activity> weakReference2;
        if (this.f4474d.containsKey(Integer.valueOf(i10))) {
            String[] strArrRemove = this.f4474d.remove(Integer.valueOf(i10));
            HashMap map = new HashMap();
            for (int i11 = 0; i11 < strArr.length; i11++) {
                map.put(strArr[i11], Integer.valueOf(iArr[i11]));
            }
            ArrayList arrayList = new ArrayList();
            String str = "AUTHORIZED";
            for (String str2 : strArrRemove) {
                List<String> listM = m(str2);
                for (String str3 : listM) {
                    if (!map.containsKey(str3) || ((Integer) map.get(str3)).equals(-1)) {
                        str = "DENIED";
                        arrayList.add(str2);
                        break;
                    }
                }
                if (str2.equals("POST_NOTIFICATIONS") && listM.size() > 0) {
                    Integer num = (Integer) map.get(listM.get(0));
                    r.e(i10, num != null && num.intValue() == 0);
                }
                if (str2.equals("POST_NOTIFICATIONS") && listM.size() > 0 && (weakReference2 = this.f4472a) != null && weakReference2.get() != null) {
                    Activity activity = this.f4472a.get();
                    synchronized (this) {
                        try {
                            if (this.f4477g.containsKey("POST_NOTIFICATIONS")) {
                                this.f4477g.get("POST_NOTIFICATIONS").a(activity.getApplicationContext(), k2.b.v(activity, listM.get(0)), str.equals("AUTHORIZED"));
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                }
                if (str2.equals("MEDIA_PICKER") && listM.size() > 0 && (weakReference = this.f4472a) != null && weakReference.get() != null) {
                    Activity activity2 = this.f4472a.get();
                    synchronized (this) {
                        try {
                            bVar = this.f4477g.containsKey("MEDIA_PICKER") ? this.f4477g.get("MEDIA_PICKER") : null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (bVar != null) {
                        try {
                            bVar.a(activity2.getApplicationContext(), k2.b.v(activity2, listM.get(0)), str.equals("AUTHORIZED"));
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                }
            }
            D(str, (String[]) arrayList.toArray(new String[0]));
        }
    }

    public final void F(String str, String[] strArr) {
        this.b.publishProtocolMethodResponse("PermissionsProtocol", "ShouldShowPermissionUpsell", g(str, strArr, "ShouldShowPermissionUpsell"), 0, j(str, strArr));
    }

    public void G(JSONObject jSONObject) {
        Log.d("PermissionsProtocol", "onShouldShowPermissionUpsellRequest: " + jSONObject.toString());
        d(h(jSONObject, "ShouldShowPermissionUpsell"));
    }

    public final void H(String str, String[] strArr) {
        this.b.publishProtocolMethodResponse("PermissionsProtocol", "ShouldShowRequestPermissionRationale", g(str, strArr, "ShouldShowRequestPermissionRationale"), 0, j(str, strArr));
    }

    public void I(JSONObject jSONObject) {
        Log.d("PermissionsProtocol", "onShouldShowRequestPermissionRationaleRequest: " + jSONObject.toString());
        e(h(jSONObject, "ShouldShowRequestPermissionRationale"));
    }

    public void J(JSONObject jSONObject) {
        Log.d("PermissionsProtocol", "onSupportsPermissionsRequest: " + jSONObject.toString());
        try {
            JSONArray jSONArray = new JSONArray();
            if (!t()) {
                jSONArray.put("CAMERA_ACCESS");
            }
            jSONArray.put("MICROPHONE_ACCESS");
            jSONArray.put("LOCAL_NETWORK");
            if (!t()) {
                jSONArray.put("CONTACTS_ACCESS");
            }
            jSONArray.put("WRITE_MEDIA_STORAGE");
            jSONArray.put("POST_NOTIFICATIONS");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("permissions", jSONArray);
            Log.d("PermissionsProtocol", "Support permissions response: " + jSONObject2.toString());
            HashMap map = new HashMap();
            map.put("CAMERA_ACCESS", BuildConfig.FLAVOR);
            map.put("MICROPHONE_ACCESS", BuildConfig.FLAVOR);
            map.put("LOCAL_NETWORK", BuildConfig.FLAVOR);
            map.put("CONTACTS_ACCESS", BuildConfig.FLAVOR);
            map.put("WRITE_MEDIA_STORAGE", BuildConfig.FLAVOR);
            map.put("POST_NOTIFICATIONS", BuildConfig.FLAVOR);
            this.b.publishProtocolMethodResponse("PermissionsProtocol", "SupportsPermissions", jSONObject2, 0, map);
        } catch (JSONException e10) {
            Log.e("PermissionsProtocol", "JSON exception while handling supports permissions request: " + e10.toString());
            this.b.publishProtocolMethodResponse("PermissionsProtocol", "SupportsPermissions", new JSONObject(), 13, new HashMap());
        }
    }

    public final String K(final Context context) {
        return n.c(context.getPackageName(), Build.VERSION.SDK_INT, new n.a() { // from class: bn.j
            @Override // bn.n.a
            public final void a(Intent intent) {
                context.startActivity(intent);
            }
        });
    }

    public final String L(Activity activity) {
        boolean zA = k2.n.g(activity).a();
        boolean zE = false;
        boolean z10 = Build.VERSION.SDK_INT >= 33 && k2.b.v(activity, "android.permission.POST_NOTIFICATIONS");
        synchronized (this) {
            b bVar = this.f4477g.get("POST_NOTIFICATIONS");
            if (bVar instanceof a) {
                try {
                    zE = ((a) bVar).e(activity.getApplicationContext());
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        return r.b(zA, z10, zE);
    }

    public void N(String str) {
        synchronized (this) {
            this.f4477g.remove(str);
        }
    }

    public void O(String[] strArr) {
        P(strArr);
    }

    public final void P(String[] strArr) {
        Log.d("PermissionsProtocol", "requestPermissionsForFeatures: " + Arrays.toString(strArr));
        String[] strArrN = n(strArr);
        if (strArrN == null || strArrN.length == 0) {
            Log.e("PermissionsProtocol", "Can't request any permissions");
            D("DENIED", strArr);
            return;
        }
        WeakReference<Activity> weakReference = this.f4472a;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("PermissionsProtocol", "No Activity found while requesting permissions");
            D("DENIED", strArr);
            return;
        }
        Activity activity = this.f4472a.get();
        if (q(strArr, activity).size() == 0) {
            if (strArr[0].equals("MEDIA_PICKER")) {
                return;
            }
            D("AUTHORIZED", new String[0]);
            return;
        }
        if (!bi.h.a().Q5() && Build.VERSION.SDK_INT >= 33 && "android.permission.POST_NOTIFICATIONS".equals(strArrN[0])) {
            synchronized (this) {
                try {
                    if (!this.f4477g.containsKey("POST_NOTIFICATIONS") || !this.f4477g.get("POST_NOTIFICATIONS").c(activity.getApplicationContext(), k2.b.v(activity, strArrN[0]))) {
                        Log.i("PermissionsProtocol", "... should not request POST_NOTIFICATIONS based on protocol listener checks.");
                        D("DENIED", new String[0]);
                        return;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    D("DENIED", new String[0]);
                    return;
                }
            }
        }
        int i10 = this.f4475e;
        int i11 = (i10 % 100) + 100;
        this.f4475e = i10 + 1;
        this.f4474d.put(Integer.valueOf(i11), strArr);
        if (s(strArrN)) {
            r.d(i11, L(activity), true);
        }
        k2.b.u(activity, strArrN, i11);
    }

    public void Q(Context context) {
        Log.i("PermissionsProtocol", "requestPermissionsOnAppReady");
        WeakReference<Activity> weakReference = this.f4472a;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("PermissionsProtocol", "Activity is not set in requestPermissionsOnAppReady");
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            o oVar = o.POST_NOTIFICATIONS;
            if (!T(oVar)) {
                O(new String[]{oVar.toString()});
                return;
            }
        }
        r(context);
    }

    public void R() {
        Log.i("PermissionsProtocol", "requestPermissionsOnStartup: didRequest:" + this.f4473c);
        if (this.f4473c) {
            return;
        }
        this.f4473c = true;
        WeakReference<Activity> weakReference = this.f4472a;
        if (weakReference == null || weakReference.get() == null) {
            throw new IllegalStateException("Activity is not set");
        }
    }

    public void S(Activity activity) {
        this.f4472a = new WeakReference<>(activity);
    }

    public boolean T(o oVar) {
        WeakReference<Activity> weakReference = this.f4472a;
        if (weakReference != null && weakReference.get() != null) {
            return k2.b.v(this.f4472a.get(), k(oVar));
        }
        Log.e("PermissionsProtocol", "No Activity found while testing permissions");
        return false;
    }

    public void c(String str, b bVar) {
        synchronized (this) {
            if (bVar != null) {
                try {
                    this.f4477g.put(str, bVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void d(String[] strArr) {
        Log.d("PermissionsProtocol", "checkShouldShowPermissionUpsellForFeatures: " + Arrays.toString(strArr));
        String[] strArrN = n(strArr);
        if (strArrN == null || strArrN.length == 0) {
            Log.e("PermissionsProtocol", "Can't find permissions while checking should show permission upsell");
            F("HIDE", strArr);
            return;
        }
        WeakReference<Activity> weakReference = this.f4472a;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("PermissionsProtocol", "No Activity found while checking should show permission upsell");
            F("HIDE", strArr);
        } else {
            List<String> listO = o(strArr, this.f4472a.get());
            F(listO.isEmpty() ? "SHOW" : "HIDE", (String[]) listO.toArray(new String[0]));
        }
    }

    public final void e(String[] strArr) {
        Log.d("PermissionsProtocol", "checkShouldShowRequestPermissionRationaleForFeatures: " + Arrays.toString(strArr));
        String[] strArrN = n(strArr);
        if (strArrN == null || strArrN.length == 0) {
            Log.e("PermissionsProtocol", "Can't find permissions while checking should show permission rationale");
            H("HIDE", strArr);
            return;
        }
        WeakReference<Activity> weakReference = this.f4472a;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("PermissionsProtocol", "No Activity found while checking should show permission rationale");
            H("HIDE", strArr);
        } else {
            List<String> listP = p(strArr, this.f4472a.get());
            H(listP.isEmpty() ? "SHOW" : "HIDE", (String[]) listP.toArray(new String[0]));
        }
    }

    public final JSONObject f(String str, String[] strArr, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", str);
            jSONObject.put("missingPermissions", new JSONArray(strArr));
            return jSONObject;
        } catch (JSONException e10) {
            Log.e("PermissionsProtocol", "JSON exception while handling " + str2 + ": " + e10.toString());
            return jSONObject;
        }
    }

    public final JSONObject g(String str, String[] strArr, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("upsellStatus", str);
            jSONObject.put("hiddenUpsellPermissions", new JSONArray(strArr));
            return jSONObject;
        } catch (JSONException e10) {
            Log.e("PermissionsProtocol", "JSON exception while handling " + str2 + ": " + e10.toString());
            return jSONObject;
        }
    }

    public final String[] h(JSONObject jSONObject, String str) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            String[] strArr = new String[jSONArray.length()];
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                strArr[i10] = jSONArray.getString(i10);
            }
            return strArr;
        } catch (JSONException e10) {
            Log.e("PermissionsProtocol", "JSON exception while handling " + str + ": " + e10.toString());
            return new String[0];
        }
    }

    public abstract String k(o oVar);

    public final void l(String[] strArr) {
        WeakReference<Activity> weakReference = this.f4472a;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("PermissionsProtocol", "No Activity found while getting permission status");
            z("DENIED", strArr);
        } else {
            List<String> listQ = q(strArr, this.f4472a.get());
            z(listQ.isEmpty() ? "AUTHORIZED" : "DENIED", (String[]) listQ.toArray(new String[0]));
        }
    }

    public final List<String> m(String str) {
        ArrayList arrayList = new ArrayList();
        str.getClass();
        switch (str) {
            case "CONTACTS_ACCESS":
                arrayList.addAll(Arrays.asList(k(o.CONTACT)));
                break;
            case "POST_NOTIFICATIONS":
                arrayList.add(k(o.POST_NOTIFICATIONS));
                break;
            case "WRITE_MEDIA_STORAGE":
                if (Build.VERSION.SDK_INT > 28) {
                    Log.d("PermissionsProtocol", "WRITE_MEDIA_STORAGE requested. Permission granted by default on OS 10 and later.");
                    break;
                } else {
                    arrayList.addAll(Arrays.asList(k(o.WRITE_EXTERNAL_STORAGE)));
                    break;
                }
                break;
            case "CAMERA_ACCESS":
                arrayList.addAll(Arrays.asList(k(o.CAMERA)));
                break;
            case "MICROPHONE_ACCESS":
                arrayList.addAll(Arrays.asList(k(o.MODIFY_AUDIO_SETTINGS), k(o.RECORD_AUDIO)));
                break;
            case "MEDIA_PICKER":
                if (Build.VERSION.SDK_INT > 28) {
                    Log.d("PermissionsProtocol", "MEDIA_PICKER requested. Permission granted by default on OS 10 and later.");
                    break;
                } else {
                    arrayList.addAll(Arrays.asList(k(o.READ_EXTERNAL_STORAGE)));
                    break;
                }
                break;
            case "LOCAL_NETWORK":
                break;
            default:
                Log.w("PermissionsProtocol", "Permission " + str + " is not supported.");
                break;
        }
        return M(arrayList);
    }

    public final String[] n(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.addAll(m(str));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @NonNull
    public final List<String> o(String[] strArr, Activity activity) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : m(str)) {
                if (l2.b.a(activity, str2) == -1) {
                    if (!"android.permission.POST_NOTIFICATIONS".equals(str2)) {
                        arrayList.add(str);
                        break;
                    }
                    if (Build.VERSION.SDK_INT >= 33 && !k2.b.v(activity, str2)) {
                        synchronized (this) {
                            try {
                                if (!this.f4477g.containsKey("POST_NOTIFICATIONS") || !this.f4477g.get("POST_NOTIFICATIONS").b(activity.getApplicationContext())) {
                                    arrayList.add(str);
                                }
                            } catch (Exception e10) {
                                e10.printStackTrace();
                                arrayList.add(str);
                            }
                        }
                        break;
                    }
                    arrayList.add(str);
                    break;
                }
                arrayList.add(str);
                break;
            }
        }
        return arrayList;
    }

    @NonNull
    public final List<String> p(String[] strArr, Activity activity) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : m(str)) {
                if (l2.b.a(activity, str2) == -1) {
                    if (!"android.permission.POST_NOTIFICATIONS".equals(str2)) {
                        arrayList.add(str);
                        break;
                    }
                    if (Build.VERSION.SDK_INT >= 33 && k2.b.v(activity, str2)) {
                        synchronized (this) {
                            try {
                                if (!this.f4477g.containsKey("POST_NOTIFICATIONS") || !this.f4477g.get("POST_NOTIFICATIONS").d(activity.getApplicationContext())) {
                                    arrayList.add(str);
                                }
                            } catch (Exception e10) {
                                e10.printStackTrace();
                                arrayList.add(str);
                            }
                        }
                        break;
                    }
                    arrayList.add(str);
                    break;
                }
                arrayList.add(str);
                break;
            }
        }
        return arrayList;
    }

    @NonNull
    public final List<String> q(String[] strArr, Activity activity) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Iterator<String> it = m(str).iterator();
            while (it.hasNext()) {
                if (l2.b.a(activity, it.next()) == -1) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return arrayList;
    }

    public final void r(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        if (Build.VERSION.SDK_INT >= 28) {
            intent.addFlags(268435456);
        }
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        context.startActivity(intent);
    }

    public final boolean s(String[] strArr) {
        if (Build.VERSION.SDK_INT >= 33 && strArr != null) {
            for (String str : strArr) {
                if ("android.permission.POST_NOTIFICATIONS".equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final /* synthetic */ void u(Activity activity) {
        A(K(activity));
    }

    public final void v(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("enabled", String.valueOf(jSONObject.optBoolean("enabled")));
        Log.d("PermissionsProtocol", "Get push notifications enabled response: " + jSONObject.toString());
        this.b.publishProtocolMethodResponse("PermissionsProtocol", "GetPushNotificationsEnabled", jSONObject, 0, map);
    }

    public final void w() {
        this.b.publishProtocolMethodResponse("PermissionsProtocol", "GetPushNotificationsEnabled", new JSONObject(), 13, new HashMap());
    }

    public void x(JSONObject jSONObject) {
        Log.d("PermissionsProtocol", "onGetPushNotificationsEnabledRequest: " + jSONObject.toString());
        WeakReference<Activity> weakReference = this.f4472a;
        Activity activity = weakReference == null ? null : weakReference.get();
        if (activity == null) {
            Log.e("PermissionsProtocol", "No Activity found while getting push notifications enabled");
            w();
        } else {
            final Context applicationContext = activity.getApplicationContext();
            v(s.a(new Function0() { // from class: bn.h
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(k2.n.g(applicationContext).a());
                }
            }));
        }
    }

    public void y(JSONObject jSONObject) {
        Log.d("PermissionsProtocol", "onHasPermissionRequest: " + jSONObject.toString());
        l(h(jSONObject, "HasPermissions"));
    }

    public final void z(String str, String[] strArr) {
        JSONObject jSONObjectF = f(str, strArr, "HasPermissions");
        HashMap<String, String> mapI = i(str, strArr);
        Log.d("PermissionsProtocol", "Has permission response: " + jSONObjectF.toString());
        this.b.publishProtocolMethodResponse("PermissionsProtocol", "HasPermissions", jSONObjectF, 0, mapI);
    }
}
