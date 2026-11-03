package mm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<Activity> f24897a;
    public MessageBus b = MessageBus.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24898c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Integer, String[]> f24899d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Integer, km.m> f24900e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24901f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<Connection> f24902g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map<String, b> f24903h = new HashMap();

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
        this.f24902g.add(this.b.w("PermissionsProtocol", "PermissionsRequest", new Callback() { // from class: mm.a
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f24887a.C(jSONObject);
            }
        }));
        this.f24902g.add(this.b.w("PermissionsProtocol", "HasPermissions", new Callback() { // from class: mm.b
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f24888a.D(jSONObject);
            }
        }));
        this.f24902g.add(this.b.w("PermissionsProtocol", "SupportsPermissions", new Callback() { // from class: mm.c
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f24889a.E(jSONObject);
            }
        }));
        this.f24902g.add(this.b.w("PermissionsProtocol", "ShouldShowPermissionUpsell", new Callback() { // from class: mm.d
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f24890a.F(jSONObject);
            }
        }));
        this.f24902g.add(this.b.w("PermissionsProtocol", "ShouldShowRequestPermissionRationale", new Callback() { // from class: mm.e
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f24891a.G(jSONObject);
            }
        }));
        if (rh.h.a().l2()) {
            this.b.r(new km.a("PermissionsProtocol", "PermissionsRequest", new km.j() { // from class: mm.f
                @Override // km.j
                public final void a(JSONObject jSONObject, km.m mVar) {
                    this.f24892a.H(jSONObject, mVar);
                }
            }));
            this.b.r(new km.a("PermissionsProtocol", "HasPermissions", new km.j() { // from class: mm.g
                @Override // km.j
                public final void a(JSONObject jSONObject, km.m mVar) {
                    this.f24893a.I(jSONObject, mVar);
                }
            }));
            this.b.r(new km.a("PermissionsProtocol", "SupportsPermissions", new km.j() { // from class: mm.h
                @Override // km.j
                public final void a(JSONObject jSONObject, km.m mVar) {
                    this.f24894a.J(jSONObject, mVar);
                }
            }));
            this.b.r(new km.a("PermissionsProtocol", "ShouldShowPermissionUpsell", new km.j() { // from class: mm.i
                @Override // km.j
                public final void a(JSONObject jSONObject, km.m mVar) {
                    this.f24895a.K(jSONObject, mVar);
                }
            }));
            this.b.r(new km.a("PermissionsProtocol", "ShouldShowRequestPermissionRationale", new km.j() { // from class: mm.j
                @Override // km.j
                public final void a(JSONObject jSONObject, km.m mVar) {
                    this.f24896a.L(jSONObject, mVar);
                }
            }));
        }
    }

    public static boolean B() {
        return false;
    }

    public static List<String> X(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static HashMap<String, String> q(String str, String[] strArr) {
        HashMap<String, String> map = new HashMap<>();
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        if (hashSet.contains("CAMERA_ACCESS")) {
            map.put("missing_camera_access", "");
        }
        if (hashSet.contains("MICROPHONE_ACCESS")) {
            map.put("missing_microphone_access", "");
        }
        if (hashSet.contains("LOCAL_NETWORK")) {
            map.put("missing_local_network", "");
        }
        if (hashSet.contains("CONTACTS_ACCESS")) {
            map.put("missing_contacts_access", "");
        }
        if (hashSet.contains("WRITE_MEDIA_STORAGE")) {
            map.put("missing_write_media_storage", "");
        }
        if (hashSet.contains("POST_NOTIFICATIONS")) {
            map.put("missing_post_notifications", "");
        }
        map.put("status", str);
        return map;
    }

    public static HashMap<String, String> r(String str, String[] strArr) {
        HashMap<String, String> map = new HashMap<>();
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        if (hashSet.contains("CAMERA_ACCESS")) {
            map.put("missing_camera_access", "");
        }
        if (hashSet.contains("MICROPHONE_ACCESS")) {
            map.put("missing_microphone_access", "");
        }
        if (hashSet.contains("LOCAL_NETWORK")) {
            map.put("missing_local_network", "");
        }
        if (hashSet.contains("CONTACTS_ACCESS")) {
            map.put("missing_contacts_access", "");
        }
        if (hashSet.contains("WRITE_MEDIA_STORAGE")) {
            map.put("missing_write_media_storage", "");
        }
        if (hashSet.contains("POST_NOTIFICATIONS")) {
            map.put("missing_post_notifications", "");
        }
        map.put("upsellStatus", str);
        return map;
    }

    public final boolean A(String[] strArr) {
        if (Build.VERSION.SDK_INT >= 33 && strArr != null) {
            for (String str : strArr) {
                if ("android.permission.POST_NOTIFICATIONS".equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final /* synthetic */ void C(JSONObject jSONObject) {
        H(jSONObject, null);
    }

    public final /* synthetic */ void D(JSONObject jSONObject) {
        I(jSONObject, null);
    }

    public final /* synthetic */ void E(JSONObject jSONObject) {
        J(jSONObject, null);
    }

    public final /* synthetic */ void F(JSONObject jSONObject) {
        K(jSONObject, null);
    }

    public final /* synthetic */ void G(JSONObject jSONObject) {
        L(jSONObject, null);
    }

    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void I(JSONObject jSONObject, km.m mVar) {
        Log.d("PermissionsProtocol", "onHasPermissionRequest: " + jSONObject.toString());
        t(p(jSONObject, "HasPermissions"), mVar);
    }

    public final void N(String str, String[] strArr, km.m mVar) {
        JSONObject jSONObjectN = n(str, strArr, "HasPermissions");
        HashMap<String, String> mapQ = q(str, strArr);
        Log.d("PermissionsProtocol", "Has permission response: " + jSONObjectN.toString());
        this.b.m("PermissionsProtocol", "HasPermissions", jSONObjectN, 0, mapQ);
        if (!rh.h.a().l2() || mVar == null) {
            return;
        }
        km.l lVar = new km.l();
        lVar.f22909a = jSONObjectN;
        mVar.a(lVar);
    }

    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void H(JSONObject jSONObject, km.m mVar) {
        Log.d("PermissionsProtocol", "onPermissionRequest: " + jSONObject.toString());
        a0(p(jSONObject, "PermissionsRequest"), mVar);
    }

    public final void P(String str, String[] strArr, km.m mVar) {
        JSONObject jSONObjectN = n(str, strArr, "PermissionsRequest");
        this.b.m("PermissionsProtocol", "PermissionsRequest", jSONObjectN, 0, q(str, strArr));
        if (!rh.h.a().l2() || mVar == null) {
            return;
        }
        km.l lVar = new km.l();
        lVar.f22909a = jSONObjectN;
        mVar.a(lVar);
    }

    public void Q(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        WeakReference<Activity> weakReference;
        b bVar;
        WeakReference<Activity> weakReference2;
        if (this.f24899d.containsKey(Integer.valueOf(i10))) {
            String[] strArrRemove = this.f24899d.remove(Integer.valueOf(i10));
            HashMap map = new HashMap();
            for (int i11 = 0; i11 < strArr.length; i11++) {
                map.put(strArr[i11], Integer.valueOf(iArr[i11]));
            }
            ArrayList arrayList = new ArrayList();
            String str = "AUTHORIZED";
            int length = strArrRemove.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                String str2 = strArrRemove[i12];
                List<String> listU = u(str2);
                for (String str3 : listU) {
                    if (!map.containsKey(str3) || ((Integer) map.get(str3)).equals(-1)) {
                        str = "DENIED";
                        arrayList.add(str2);
                        break;
                    }
                }
                if (str2.equals("POST_NOTIFICATIONS") && listU.size() > 0) {
                    Integer num = (Integer) map.get(listU.get(0));
                    q.e(i10, num != null && num.intValue() == 0);
                }
                if (str2.equals("POST_NOTIFICATIONS") && listU.size() > 0 && (weakReference2 = this.f24897a) != null && weakReference2.get() != null) {
                    Activity activity = this.f24897a.get();
                    synchronized (this) {
                        try {
                            if (this.f24903h.containsKey("POST_NOTIFICATIONS")) {
                                this.f24903h.get("POST_NOTIFICATIONS").a(activity.getApplicationContext(), k2.b.v(activity, listU.get(0)), str.equals("AUTHORIZED"));
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                }
                if (str2.equals("MEDIA_PICKER") && listU.size() > 0 && (weakReference = this.f24897a) != null && weakReference.get() != null) {
                    Activity activity2 = this.f24897a.get();
                    synchronized (this) {
                        try {
                            bVar = this.f24903h.containsKey("MEDIA_PICKER") ? this.f24903h.get("MEDIA_PICKER") : null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (bVar != null) {
                        try {
                            bVar.a(activity2.getApplicationContext(), k2.b.v(activity2, listU.get(0)), str.equals("AUTHORIZED"));
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                i12++;
            }
            if (rh.h.a().l2() && this.f24900e.containsKey(Integer.valueOf(i10))) {
                P(str, (String[]) arrayList.toArray(new String[0]), this.f24900e.remove(Integer.valueOf(i10)));
            } else {
                P(str, (String[]) arrayList.toArray(new String[0]), null);
            }
        }
    }

    public final void R(String str, String[] strArr, km.m mVar) {
        JSONObject jSONObjectO = o(str, strArr, "ShouldShowPermissionUpsell");
        this.b.m("PermissionsProtocol", "ShouldShowPermissionUpsell", jSONObjectO, 0, r(str, strArr));
        if (!rh.h.a().l2() || mVar == null) {
            return;
        }
        km.l lVar = new km.l();
        lVar.f22909a = jSONObjectO;
        mVar.a(lVar);
    }

    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void K(JSONObject jSONObject, km.m mVar) {
        Log.d("PermissionsProtocol", "onShouldShowPermissionUpsellRequest: " + jSONObject.toString());
        l(p(jSONObject, "ShouldShowPermissionUpsell"), mVar);
    }

    public final void T(String str, String[] strArr, km.m mVar) {
        JSONObject jSONObjectO = o(str, strArr, "ShouldShowRequestPermissionRationale");
        this.b.m("PermissionsProtocol", "ShouldShowRequestPermissionRationale", jSONObjectO, 0, r(str, strArr));
        if (!rh.h.a().l2() || mVar == null) {
            return;
        }
        km.l lVar = new km.l();
        lVar.f22909a = jSONObjectO;
        mVar.a(lVar);
    }

    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void L(JSONObject jSONObject, km.m mVar) {
        Log.d("PermissionsProtocol", "onShouldShowRequestPermissionRationaleRequest: " + jSONObject.toString());
        m(p(jSONObject, "ShouldShowRequestPermissionRationale"), mVar);
    }

    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void J(JSONObject jSONObject, km.m mVar) {
        Log.d("PermissionsProtocol", "onSupportsPermissionsRequest: " + jSONObject.toString());
        try {
            JSONArray jSONArray = new JSONArray();
            if (!B()) {
                jSONArray.put("CAMERA_ACCESS");
            }
            jSONArray.put("MICROPHONE_ACCESS");
            jSONArray.put("LOCAL_NETWORK");
            if (!B()) {
                jSONArray.put("CONTACTS_ACCESS");
            }
            jSONArray.put("WRITE_MEDIA_STORAGE");
            jSONArray.put("POST_NOTIFICATIONS");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("permissions", jSONArray);
            Log.d("PermissionsProtocol", "Support permissions response: " + jSONObject2.toString());
            HashMap map = new HashMap();
            map.put("CAMERA_ACCESS", "");
            map.put("MICROPHONE_ACCESS", "");
            map.put("LOCAL_NETWORK", "");
            map.put("CONTACTS_ACCESS", "");
            map.put("WRITE_MEDIA_STORAGE", "");
            map.put("POST_NOTIFICATIONS", "");
            this.b.m("PermissionsProtocol", "SupportsPermissions", jSONObject2, 0, map);
            if (!rh.h.a().l2() || mVar == null) {
                return;
            }
            km.l lVar = new km.l();
            lVar.f22909a = jSONObject2;
            mVar.a(lVar);
        } catch (JSONException e10) {
            Log.e("PermissionsProtocol", "JSON exception while handling supports permissions request: " + e10.toString());
            this.b.m("PermissionsProtocol", "SupportsPermissions", new JSONObject(), 13, new HashMap());
            if (!rh.h.a().l2() || mVar == null) {
                return;
            }
            km.l lVar2 = new km.l();
            lVar2.f22909a = new JSONObject();
            mVar.a(lVar2);
        }
    }

    public final String W(Activity activity) {
        boolean zA = k2.n.f(activity).a();
        boolean zE = false;
        boolean z10 = Build.VERSION.SDK_INT >= 33 && k2.b.v(activity, "android.permission.POST_NOTIFICATIONS");
        synchronized (this) {
            b bVar = this.f24903h.get("POST_NOTIFICATIONS");
            if (bVar instanceof a) {
                try {
                    zE = ((a) bVar).e(activity.getApplicationContext());
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        return q.b(zA, z10, zE);
    }

    public void Y(String str) {
        synchronized (this) {
            this.f24903h.remove(str);
        }
    }

    public void Z(String[] strArr) {
        a0(strArr, null);
    }

    public final void a0(String[] strArr, km.m mVar) {
        Log.d("PermissionsProtocol", "requestPermissionsForFeatures: " + Arrays.toString(strArr));
        String[] strArrV = v(strArr);
        if (strArrV == null || strArrV.length == 0) {
            Log.e("PermissionsProtocol", "Can't request any permissions");
            P("DENIED", strArr, mVar);
            return;
        }
        WeakReference<Activity> weakReference = this.f24897a;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("PermissionsProtocol", "No Activity found while requesting permissions");
            P("DENIED", strArr, mVar);
            return;
        }
        Activity activity = this.f24897a.get();
        if (y(strArr, activity).size() == 0) {
            if (strArr[0].equals("MEDIA_PICKER")) {
                return;
            }
            P("AUTHORIZED", new String[0], mVar);
            return;
        }
        if (!rh.h.a().S5() && Build.VERSION.SDK_INT >= 33 && "android.permission.POST_NOTIFICATIONS".equals(strArrV[0])) {
            synchronized (this) {
                try {
                    if (!this.f24903h.containsKey("POST_NOTIFICATIONS") || !this.f24903h.get("POST_NOTIFICATIONS").c(activity.getApplicationContext(), k2.b.v(activity, strArrV[0]))) {
                        Log.i("PermissionsProtocol", "... should not request POST_NOTIFICATIONS based on protocol listener checks.");
                        P("DENIED", new String[0], mVar);
                        return;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    P("DENIED", new String[0], mVar);
                    return;
                }
            }
        }
        int i10 = this.f24901f;
        int i11 = (i10 % 100) + 100;
        this.f24901f = i10 + 1;
        this.f24899d.put(Integer.valueOf(i11), strArr);
        if (rh.h.a().l2()) {
            this.f24900e.put(Integer.valueOf(i11), mVar);
        }
        if (A(strArrV)) {
            q.d(i11, W(activity), true);
        }
        k2.b.u(activity, strArrV, i11);
    }

    public void b0(Context context) {
        Log.i("PermissionsProtocol", "requestPermissionsOnAppReady");
        WeakReference<Activity> weakReference = this.f24897a;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("PermissionsProtocol", "Activity is not set in requestPermissionsOnAppReady");
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            n nVar = n.POST_NOTIFICATIONS;
            if (!e0(nVar)) {
                Z(new String[]{nVar.toString()});
                return;
            }
        }
        z(context);
    }

    public void c0() {
        Log.i("PermissionsProtocol", "requestPermissionsOnStartup: didRequest:" + this.f24898c);
        if (this.f24898c) {
            return;
        }
        this.f24898c = true;
        WeakReference<Activity> weakReference = this.f24897a;
        if (weakReference == null || weakReference.get() == null) {
            throw new IllegalStateException("Activity is not set");
        }
    }

    public void d0(Activity activity) {
        this.f24897a = new WeakReference<>(activity);
    }

    public boolean e0(n nVar) {
        WeakReference<Activity> weakReference = this.f24897a;
        if (weakReference != null && weakReference.get() != null) {
            return k2.b.v(this.f24897a.get(), s(nVar));
        }
        Log.e("PermissionsProtocol", "No Activity found while testing permissions");
        return false;
    }

    public void k(String str, b bVar) {
        synchronized (this) {
            if (bVar != null) {
                try {
                    this.f24903h.put(str, bVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void l(String[] strArr, km.m mVar) {
        Log.d("PermissionsProtocol", "checkShouldShowPermissionUpsellForFeatures: " + Arrays.toString(strArr));
        String[] strArrV = v(strArr);
        if (strArrV == null || strArrV.length == 0) {
            Log.e("PermissionsProtocol", "Can't find permissions while checking should show permission upsell");
            R("HIDE", strArr, mVar);
            return;
        }
        WeakReference<Activity> weakReference = this.f24897a;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("PermissionsProtocol", "No Activity found while checking should show permission upsell");
            R("HIDE", strArr, mVar);
        } else {
            List<String> listW = w(strArr, this.f24897a.get());
            R(listW.isEmpty() ? "SHOW" : "HIDE", (String[]) listW.toArray(new String[0]), mVar);
        }
    }

    public final void m(String[] strArr, km.m mVar) {
        Log.d("PermissionsProtocol", "checkShouldShowRequestPermissionRationaleForFeatures: " + Arrays.toString(strArr));
        String[] strArrV = v(strArr);
        if (strArrV == null || strArrV.length == 0) {
            Log.e("PermissionsProtocol", "Can't find permissions while checking should show permission rationale");
            T("HIDE", strArr, mVar);
            return;
        }
        WeakReference<Activity> weakReference = this.f24897a;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("PermissionsProtocol", "No Activity found while checking should show permission rationale");
            T("HIDE", strArr, mVar);
        } else {
            List<String> listX = x(strArr, this.f24897a.get());
            T(listX.isEmpty() ? "SHOW" : "HIDE", (String[]) listX.toArray(new String[0]), mVar);
        }
    }

    public final JSONObject n(String str, String[] strArr, String str2) {
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

    public final JSONObject o(String str, String[] strArr, String str2) {
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

    public final String[] p(JSONObject jSONObject, String str) {
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

    public abstract String s(n nVar);

    public final void t(String[] strArr, km.m mVar) {
        WeakReference<Activity> weakReference = this.f24897a;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("PermissionsProtocol", "No Activity found while getting permission status");
            N("DENIED", strArr, mVar);
        } else {
            List<String> listY = y(strArr, this.f24897a.get());
            N(listY.isEmpty() ? "AUTHORIZED" : "DENIED", (String[]) listY.toArray(new String[0]), mVar);
        }
    }

    public final List<String> u(String str) {
        ArrayList arrayList = new ArrayList();
        str.getClass();
        switch (str) {
            case "CONTACTS_ACCESS":
                arrayList.addAll(Arrays.asList(s(n.CONTACT)));
                break;
            case "POST_NOTIFICATIONS":
                arrayList.add(s(n.POST_NOTIFICATIONS));
                break;
            case "WRITE_MEDIA_STORAGE":
                if (Build.VERSION.SDK_INT > 28) {
                    Log.d("PermissionsProtocol", "WRITE_MEDIA_STORAGE requested. Permission granted by default on OS 10 and later.");
                    break;
                } else {
                    arrayList.addAll(Arrays.asList(s(n.WRITE_EXTERNAL_STORAGE)));
                    break;
                }
                break;
            case "CAMERA_ACCESS":
                arrayList.addAll(Arrays.asList(s(n.CAMERA)));
                break;
            case "MICROPHONE_ACCESS":
                arrayList.addAll(Arrays.asList(s(n.MODIFY_AUDIO_SETTINGS), s(n.RECORD_AUDIO)));
                break;
            case "MEDIA_PICKER":
                if (Build.VERSION.SDK_INT > 28) {
                    Log.d("PermissionsProtocol", "MEDIA_PICKER requested. Permission granted by default on OS 10 and later.");
                    break;
                } else {
                    arrayList.addAll(Arrays.asList(s(n.READ_EXTERNAL_STORAGE)));
                    break;
                }
                break;
            case "LOCAL_NETWORK":
                break;
            default:
                Log.w("PermissionsProtocol", "Permission " + str + " is not supported.");
                break;
        }
        return X(arrayList);
    }

    public final String[] v(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.addAll(u(str));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @NonNull
    public final List<String> w(String[] strArr, Activity activity) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : u(str)) {
                if (l2.b.a(activity, str2) == -1) {
                    if (!"android.permission.POST_NOTIFICATIONS".equals(str2)) {
                        arrayList.add(str);
                        break;
                    }
                    if (Build.VERSION.SDK_INT >= 33 && !k2.b.v(activity, str2)) {
                        synchronized (this) {
                            try {
                                if (!this.f24903h.containsKey("POST_NOTIFICATIONS") || !this.f24903h.get("POST_NOTIFICATIONS").b(activity.getApplicationContext())) {
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
    public final List<String> x(String[] strArr, Activity activity) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : u(str)) {
                if (l2.b.a(activity, str2) == -1) {
                    if (!"android.permission.POST_NOTIFICATIONS".equals(str2)) {
                        arrayList.add(str);
                        break;
                    }
                    if (Build.VERSION.SDK_INT >= 33 && k2.b.v(activity, str2)) {
                        synchronized (this) {
                            try {
                                if (!this.f24903h.containsKey("POST_NOTIFICATIONS") || !this.f24903h.get("POST_NOTIFICATIONS").d(activity.getApplicationContext())) {
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
    public final List<String> y(String[] strArr, Activity activity) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Iterator<String> it = u(str).iterator();
            while (it.hasNext()) {
                if (l2.b.a(activity, it.next()) == -1) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return arrayList;
    }

    public final void z(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        if (Build.VERSION.SDK_INT >= 28) {
            intent.addFlags(268435456);
        }
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        context.startActivity(intent);
    }
}
