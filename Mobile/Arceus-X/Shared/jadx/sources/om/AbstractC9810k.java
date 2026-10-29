package om;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
import mm.C8584a;
import mm.C8595l;
import mm.InterfaceC8593j;
import mm.InterfaceC8596m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p235k2.C7410b;
import p235k2.C7422n;
import p261l2.C7975b;
import th.C11659h;

/* JADX INFO: renamed from: om.k */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9810k {

    /* JADX INFO: renamed from: a */
    public WeakReference<Activity> f35592a;

    /* JADX INFO: renamed from: b */
    public MessageBus f35593b = MessageBus.m16016f();

    /* JADX INFO: renamed from: c */
    public boolean f35594c = false;

    /* JADX INFO: renamed from: d */
    public final Map<Integer, String[]> f35595d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final Map<Integer, InterfaceC8596m> f35596e = new HashMap();

    /* JADX INFO: renamed from: f */
    public int f35597f = 0;

    /* JADX INFO: renamed from: g */
    public ArrayList<Connection> f35598g = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public Map<String, b> f35599h = new HashMap();

    /* JADX INFO: renamed from: om.k$a */
    public interface a {
        /* JADX INFO: renamed from: e */
        boolean mo30103e(Context context);
    }

    /* JADX INFO: renamed from: om.k$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo30099a(Context context, boolean z10, boolean z11);

        /* JADX INFO: renamed from: b */
        boolean mo30100b(Context context);

        /* JADX INFO: renamed from: c */
        boolean mo30101c(Context context, boolean z10);

        /* JADX INFO: renamed from: d */
        boolean mo30102d(Context context);
    }

    public AbstractC9810k() {
        this.f35598g.add(this.f35593b.m16033w("PermissionsProtocol", "PermissionsRequest", new Callback() { // from class: om.a
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f35582a.m38621C(jSONObject);
            }
        }));
        this.f35598g.add(this.f35593b.m16033w("PermissionsProtocol", "HasPermissions", new Callback() { // from class: om.b
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f35583a.m38622D(jSONObject);
            }
        }));
        this.f35598g.add(this.f35593b.m16033w("PermissionsProtocol", "SupportsPermissions", new Callback() { // from class: om.c
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f35584a.m38623E(jSONObject);
            }
        }));
        this.f35598g.add(this.f35593b.m16033w("PermissionsProtocol", "ShouldShowPermissionUpsell", new Callback() { // from class: om.d
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f35585a.m38624F(jSONObject);
            }
        }));
        this.f35598g.add(this.f35593b.m16033w("PermissionsProtocol", "ShouldShowRequestPermissionRationale", new Callback() { // from class: om.e
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f35586a.m38625G(jSONObject);
            }
        }));
        if (C11659h.m43403a().mo43634g2()) {
            this.f35593b.m16028r(new C8584a("PermissionsProtocol", "PermissionsRequest", new InterfaceC8593j() { // from class: om.f
                @Override // mm.InterfaceC8593j
                /* JADX INFO: renamed from: a */
                public final void mo15882a(JSONObject jSONObject, InterfaceC8596m interfaceC8596m) {
                    this.f35587a.m38626H(jSONObject, interfaceC8596m);
                }
            }));
            this.f35593b.m16028r(new C8584a("PermissionsProtocol", "HasPermissions", new InterfaceC8593j() { // from class: om.g
                @Override // mm.InterfaceC8593j
                /* JADX INFO: renamed from: a */
                public final void mo15882a(JSONObject jSONObject, InterfaceC8596m interfaceC8596m) {
                    this.f35588a.m38627I(jSONObject, interfaceC8596m);
                }
            }));
            this.f35593b.m16028r(new C8584a("PermissionsProtocol", "SupportsPermissions", new InterfaceC8593j() { // from class: om.h
                @Override // mm.InterfaceC8593j
                /* JADX INFO: renamed from: a */
                public final void mo15882a(JSONObject jSONObject, InterfaceC8596m interfaceC8596m) {
                    this.f35589a.m38628J(jSONObject, interfaceC8596m);
                }
            }));
            this.f35593b.m16028r(new C8584a("PermissionsProtocol", "ShouldShowPermissionUpsell", new InterfaceC8593j() { // from class: om.i
                @Override // mm.InterfaceC8593j
                /* JADX INFO: renamed from: a */
                public final void mo15882a(JSONObject jSONObject, InterfaceC8596m interfaceC8596m) {
                    this.f35590a.m38629K(jSONObject, interfaceC8596m);
                }
            }));
            this.f35593b.m16028r(new C8584a("PermissionsProtocol", "ShouldShowRequestPermissionRationale", new InterfaceC8593j() { // from class: om.j
                @Override // mm.InterfaceC8593j
                /* JADX INFO: renamed from: a */
                public final void mo15882a(JSONObject jSONObject, InterfaceC8596m interfaceC8596m) {
                    this.f35591a.m38630L(jSONObject, interfaceC8596m);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B */
    public static boolean m38606B() {
        return false;
    }

    /* JADX INFO: renamed from: X */
    public static List<String> m38607X(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public static HashMap<String, String> m38618q(String str, String[] strArr) {
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
        map.put(NotificationCompat.CATEGORY_STATUS, str);
        return map;
    }

    /* JADX INFO: renamed from: r */
    public static HashMap<String, String> m38619r(String str, String[] strArr) {
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

    /* JADX INFO: renamed from: A */
    public final boolean m38620A(String[] strArr) {
        if (Build.VERSION.SDK_INT >= 33 && strArr != null) {
            for (String str : strArr) {
                if ("android.permission.POST_NOTIFICATIONS".equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m38621C(JSONObject jSONObject) {
        m38626H(jSONObject, null);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m38622D(JSONObject jSONObject) {
        m38627I(jSONObject, null);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m38623E(JSONObject jSONObject) {
        m38628J(jSONObject, null);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m38624F(JSONObject jSONObject) {
        m38629K(jSONObject, null);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m38625G(JSONObject jSONObject) {
        m38630L(jSONObject, null);
    }

    /* JADX DEBUG: Method merged with bridge method: I(Lorg/json/JSONObject;Lmm/m;)V */
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void m38627I(JSONObject jSONObject, InterfaceC8596m interfaceC8596m) {
        Log.d("PermissionsProtocol", "onHasPermissionRequest: " + jSONObject.toString());
        m38656t(m38654p(jSONObject, "HasPermissions"), interfaceC8596m);
    }

    /* JADX INFO: renamed from: N */
    public final void m38632N(String str, String[] strArr, InterfaceC8596m interfaceC8596m) {
        JSONObject jSONObjectM38652n = m38652n(str, strArr, "HasPermissions");
        HashMap<String, String> mapM38618q = m38618q(str, strArr);
        Log.d("PermissionsProtocol", "Has permission response: " + jSONObjectM38652n.toString());
        this.f35593b.m16025m("PermissionsProtocol", "HasPermissions", jSONObjectM38652n, 0, mapM38618q);
        if (!C11659h.m43403a().mo43634g2() || interfaceC8596m == null) {
            return;
        }
        C8595l c8595l = new C8595l();
        c8595l.f31556a = jSONObjectM38652n;
        interfaceC8596m.mo34618a(c8595l);
    }

    /* JADX DEBUG: Method merged with bridge method: H(Lorg/json/JSONObject;Lmm/m;)V */
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void m38626H(JSONObject jSONObject, InterfaceC8596m interfaceC8596m) {
        Log.d("PermissionsProtocol", "onPermissionRequest: " + jSONObject.toString());
        m38644a0(m38654p(jSONObject, "PermissionsRequest"), interfaceC8596m);
    }

    /* JADX INFO: renamed from: P */
    public final void m38634P(String str, String[] strArr, InterfaceC8596m interfaceC8596m) {
        JSONObject jSONObjectM38652n = m38652n(str, strArr, "PermissionsRequest");
        this.f35593b.m16025m("PermissionsProtocol", "PermissionsRequest", jSONObjectM38652n, 0, m38618q(str, strArr));
        if (!C11659h.m43403a().mo43634g2() || interfaceC8596m == null) {
            return;
        }
        C8595l c8595l = new C8595l();
        c8595l.f31556a = jSONObjectM38652n;
        interfaceC8596m.mo34618a(c8595l);
    }

    /* JADX INFO: renamed from: Q */
    public void m38635Q(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        WeakReference<Activity> weakReference;
        b bVar;
        WeakReference<Activity> weakReference2;
        if (this.f35595d.containsKey(Integer.valueOf(i10))) {
            String[] strArrRemove = this.f35595d.remove(Integer.valueOf(i10));
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
                List<String> listM38657u = m38657u(str2);
                for (String str3 : listM38657u) {
                    if (!map.containsKey(str3) || ((Integer) map.get(str3)).equals(-1)) {
                        str = "DENIED";
                        arrayList.add(str2);
                        break;
                    }
                }
                if (str2.equals("POST_NOTIFICATIONS") && listM38657u.size() > 0) {
                    Integer num = (Integer) map.get(listM38657u.get(0));
                    C9817r.m38672g(i10, num != null && num.intValue() == 0);
                }
                if (str2.equals("POST_NOTIFICATIONS") && listM38657u.size() > 0 && (weakReference2 = this.f35592a) != null && weakReference2.get() != null) {
                    Activity activity = this.f35592a.get();
                    synchronized (this) {
                        try {
                            if (this.f35599h.containsKey("POST_NOTIFICATIONS")) {
                                this.f35599h.get("POST_NOTIFICATIONS").mo30099a(activity.getApplicationContext(), C7410b.m30698v(activity, listM38657u.get(0)), str.equals("AUTHORIZED"));
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                }
                if (str2.equals("MEDIA_PICKER") && listM38657u.size() > 0 && (weakReference = this.f35592a) != null && weakReference.get() != null) {
                    Activity activity2 = this.f35592a.get();
                    synchronized (this) {
                        try {
                            bVar = this.f35599h.containsKey("MEDIA_PICKER") ? this.f35599h.get("MEDIA_PICKER") : null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (bVar != null) {
                        try {
                            bVar.mo30099a(activity2.getApplicationContext(), C7410b.m30698v(activity2, listM38657u.get(0)), str.equals("AUTHORIZED"));
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                i12++;
            }
            if (C11659h.m43403a().mo43634g2() && this.f35596e.containsKey(Integer.valueOf(i10))) {
                m38634P(str, (String[]) arrayList.toArray(new String[0]), this.f35596e.remove(Integer.valueOf(i10)));
            } else {
                m38634P(str, (String[]) arrayList.toArray(new String[0]), null);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m38636R(String str, String[] strArr, InterfaceC8596m interfaceC8596m) {
        JSONObject jSONObjectM38653o = m38653o(str, strArr, "ShouldShowPermissionUpsell");
        this.f35593b.m16025m("PermissionsProtocol", "ShouldShowPermissionUpsell", jSONObjectM38653o, 0, m38619r(str, strArr));
        if (!C11659h.m43403a().mo43634g2() || interfaceC8596m == null) {
            return;
        }
        C8595l c8595l = new C8595l();
        c8595l.f31556a = jSONObjectM38653o;
        interfaceC8596m.mo34618a(c8595l);
    }

    /* JADX DEBUG: Method merged with bridge method: K(Lorg/json/JSONObject;Lmm/m;)V */
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void m38629K(JSONObject jSONObject, InterfaceC8596m interfaceC8596m) {
        Log.d("PermissionsProtocol", "onShouldShowPermissionUpsellRequest: " + jSONObject.toString());
        m38650l(m38654p(jSONObject, "ShouldShowPermissionUpsell"), interfaceC8596m);
    }

    /* JADX INFO: renamed from: T */
    public final void m38638T(String str, String[] strArr, InterfaceC8596m interfaceC8596m) {
        JSONObject jSONObjectM38653o = m38653o(str, strArr, "ShouldShowRequestPermissionRationale");
        this.f35593b.m16025m("PermissionsProtocol", "ShouldShowRequestPermissionRationale", jSONObjectM38653o, 0, m38619r(str, strArr));
        if (!C11659h.m43403a().mo43634g2() || interfaceC8596m == null) {
            return;
        }
        C8595l c8595l = new C8595l();
        c8595l.f31556a = jSONObjectM38653o;
        interfaceC8596m.mo34618a(c8595l);
    }

    /* JADX DEBUG: Method merged with bridge method: L(Lorg/json/JSONObject;Lmm/m;)V */
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void m38630L(JSONObject jSONObject, InterfaceC8596m interfaceC8596m) {
        Log.d("PermissionsProtocol", "onShouldShowRequestPermissionRationaleRequest: " + jSONObject.toString());
        m38651m(m38654p(jSONObject, "ShouldShowRequestPermissionRationale"), interfaceC8596m);
    }

    /* JADX DEBUG: Method merged with bridge method: J(Lorg/json/JSONObject;Lmm/m;)V */
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void m38628J(JSONObject jSONObject, InterfaceC8596m interfaceC8596m) {
        Log.d("PermissionsProtocol", "onSupportsPermissionsRequest: " + jSONObject.toString());
        try {
            JSONArray jSONArray = new JSONArray();
            if (!m38606B()) {
                jSONArray.put("CAMERA_ACCESS");
            }
            jSONArray.put("MICROPHONE_ACCESS");
            jSONArray.put("LOCAL_NETWORK");
            if (!m38606B()) {
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
            this.f35593b.m16025m("PermissionsProtocol", "SupportsPermissions", jSONObject2, 0, map);
            if (!C11659h.m43403a().mo43634g2() || interfaceC8596m == null) {
                return;
            }
            C8595l c8595l = new C8595l();
            c8595l.f31556a = jSONObject2;
            interfaceC8596m.mo34618a(c8595l);
        } catch (JSONException e10) {
            Log.e("PermissionsProtocol", "JSON exception while handling supports permissions request: " + e10.toString());
            this.f35593b.m16025m("PermissionsProtocol", "SupportsPermissions", new JSONObject(), 13, new HashMap());
            if (!C11659h.m43403a().mo43634g2() || interfaceC8596m == null) {
                return;
            }
            C8595l c8595l2 = new C8595l();
            c8595l2.f31556a = new JSONObject();
            interfaceC8596m.mo34618a(c8595l2);
        }
    }

    /* JADX INFO: renamed from: W */
    public final String m38641W(Activity activity) {
        boolean zM30886a = C7422n.m30883e(activity).m30886a();
        boolean zMo30103e = false;
        boolean z10 = Build.VERSION.SDK_INT >= 33 && C7410b.m30698v(activity, "android.permission.POST_NOTIFICATIONS");
        synchronized (this) {
            b bVar = this.f35599h.get("POST_NOTIFICATIONS");
            if (bVar instanceof a) {
                try {
                    zMo30103e = ((a) bVar).mo30103e(activity.getApplicationContext());
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        return C9817r.m38668c(zM30886a, z10, zMo30103e);
    }

    /* JADX INFO: renamed from: Y */
    public void m38642Y(String str) {
        synchronized (this) {
            this.f35599h.remove(str);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m38643Z(String[] strArr) {
        m38644a0(strArr, null);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m38644a0(String[] strArr, InterfaceC8596m interfaceC8596m) {
        Log.d("PermissionsProtocol", "requestPermissionsForFeatures: " + Arrays.toString(strArr));
        String[] strArrM38658v = m38658v(strArr);
        if (strArrM38658v == null || strArrM38658v.length == 0) {
            Log.e("PermissionsProtocol", "Can't request any permissions");
            m38634P("DENIED", strArr, interfaceC8596m);
            return;
        }
        WeakReference<Activity> weakReference = this.f35592a;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("PermissionsProtocol", "No Activity found while requesting permissions");
            m38634P("DENIED", strArr, interfaceC8596m);
            return;
        }
        Activity activity = this.f35592a.get();
        if (m38661y(strArr, activity).size() == 0) {
            if (strArr[0].equals("MEDIA_PICKER")) {
                return;
            }
            m38634P("AUTHORIZED", new String[0], interfaceC8596m);
            return;
        }
        if (!C11659h.m43403a().mo43507O5() && Build.VERSION.SDK_INT >= 33 && "android.permission.POST_NOTIFICATIONS".equals(strArrM38658v[0])) {
            synchronized (this) {
                try {
                    if (!this.f35599h.containsKey("POST_NOTIFICATIONS") || !this.f35599h.get("POST_NOTIFICATIONS").mo30101c(activity.getApplicationContext(), C7410b.m30698v(activity, strArrM38658v[0]))) {
                        Log.i("PermissionsProtocol", "... should not request POST_NOTIFICATIONS based on protocol listener checks.");
                        m38634P("DENIED", new String[0], interfaceC8596m);
                        return;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    m38634P("DENIED", new String[0], interfaceC8596m);
                    return;
                }
            }
        }
        int i10 = this.f35597f;
        int i11 = (i10 % 100) + 100;
        this.f35597f = i10 + 1;
        this.f35595d.put(Integer.valueOf(i11), strArr);
        if (C11659h.m43403a().mo43634g2()) {
            this.f35596e.put(Integer.valueOf(i11), interfaceC8596m);
        }
        if (m38620A(strArrM38658v)) {
            C9817r.m38671f(i11, m38641W(activity), true);
        }
        C7410b.m30697u(activity, strArrM38658v, i11);
    }

    /* JADX INFO: renamed from: b0 */
    public void m38645b0(Context context) {
        Log.i("PermissionsProtocol", "requestPermissionsOnAppReady");
        WeakReference<Activity> weakReference = this.f35592a;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("PermissionsProtocol", "Activity is not set in requestPermissionsOnAppReady");
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            EnumC9813n enumC9813n = EnumC9813n.POST_NOTIFICATIONS;
            if (!m38648e0(enumC9813n)) {
                m38643Z(new String[]{enumC9813n.toString()});
                return;
            }
        }
        m38662z(context);
    }

    /* JADX INFO: renamed from: c0 */
    public void m38646c0() {
        Log.i("PermissionsProtocol", "requestPermissionsOnStartup: didRequest:" + this.f35594c);
        if (this.f35594c) {
            return;
        }
        this.f35594c = true;
        WeakReference<Activity> weakReference = this.f35592a;
        if (weakReference == null || weakReference.get() == null) {
            throw new IllegalStateException("Activity is not set");
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m38647d0(Activity activity) {
        this.f35592a = new WeakReference<>(activity);
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m38648e0(EnumC9813n enumC9813n) {
        WeakReference<Activity> weakReference = this.f35592a;
        if (weakReference != null && weakReference.get() != null) {
            return C7410b.m30698v(this.f35592a.get(), mo38655s(enumC9813n));
        }
        Log.e("PermissionsProtocol", "No Activity found while testing permissions");
        return false;
    }

    /* JADX INFO: renamed from: k */
    public void m38649k(String str, b bVar) {
        synchronized (this) {
            if (bVar != null) {
                try {
                    this.f35599h.put(str, bVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m38650l(String[] strArr, InterfaceC8596m interfaceC8596m) {
        Log.d("PermissionsProtocol", "checkShouldShowPermissionUpsellForFeatures: " + Arrays.toString(strArr));
        String[] strArrM38658v = m38658v(strArr);
        if (strArrM38658v == null || strArrM38658v.length == 0) {
            Log.e("PermissionsProtocol", "Can't find permissions while checking should show permission upsell");
            m38636R("HIDE", strArr, interfaceC8596m);
            return;
        }
        WeakReference<Activity> weakReference = this.f35592a;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("PermissionsProtocol", "No Activity found while checking should show permission upsell");
            m38636R("HIDE", strArr, interfaceC8596m);
        } else {
            List<String> listM38659w = m38659w(strArr, this.f35592a.get());
            m38636R(listM38659w.isEmpty() ? "SHOW" : "HIDE", (String[]) listM38659w.toArray(new String[0]), interfaceC8596m);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m38651m(String[] strArr, InterfaceC8596m interfaceC8596m) {
        Log.d("PermissionsProtocol", "checkShouldShowRequestPermissionRationaleForFeatures: " + Arrays.toString(strArr));
        String[] strArrM38658v = m38658v(strArr);
        if (strArrM38658v == null || strArrM38658v.length == 0) {
            Log.e("PermissionsProtocol", "Can't find permissions while checking should show permission rationale");
            m38638T("HIDE", strArr, interfaceC8596m);
            return;
        }
        WeakReference<Activity> weakReference = this.f35592a;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("PermissionsProtocol", "No Activity found while checking should show permission rationale");
            m38638T("HIDE", strArr, interfaceC8596m);
        } else {
            List<String> listM38660x = m38660x(strArr, this.f35592a.get());
            m38638T(listM38660x.isEmpty() ? "SHOW" : "HIDE", (String[]) listM38660x.toArray(new String[0]), interfaceC8596m);
        }
    }

    /* JADX INFO: renamed from: n */
    public final JSONObject m38652n(String str, String[] strArr, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, str);
            jSONObject.put("missingPermissions", new JSONArray(strArr));
            return jSONObject;
        } catch (JSONException e10) {
            Log.e("PermissionsProtocol", "JSON exception while handling " + str2 + ": " + e10.toString());
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: o */
    public final JSONObject m38653o(String str, String[] strArr, String str2) {
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

    /* JADX INFO: renamed from: p */
    public final String[] m38654p(JSONObject jSONObject, String str) {
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

    /* JADX INFO: renamed from: s */
    public abstract String mo38655s(EnumC9813n enumC9813n);

    /* JADX INFO: renamed from: t */
    public final void m38656t(String[] strArr, InterfaceC8596m interfaceC8596m) {
        WeakReference<Activity> weakReference = this.f35592a;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("PermissionsProtocol", "No Activity found while getting permission status");
            m38632N("DENIED", strArr, interfaceC8596m);
        } else {
            List<String> listM38661y = m38661y(strArr, this.f35592a.get());
            m38632N(listM38661y.isEmpty() ? "AUTHORIZED" : "DENIED", (String[]) listM38661y.toArray(new String[0]), interfaceC8596m);
        }
    }

    /* JADX INFO: renamed from: u */
    public final List<String> m38657u(String str) {
        ArrayList arrayList = new ArrayList();
        str.getClass();
        switch (str) {
            case "CONTACTS_ACCESS":
                arrayList.addAll(Arrays.asList(mo38655s(EnumC9813n.CONTACT)));
                break;
            case "POST_NOTIFICATIONS":
                arrayList.add(mo38655s(EnumC9813n.POST_NOTIFICATIONS));
                break;
            case "WRITE_MEDIA_STORAGE":
                if (Build.VERSION.SDK_INT > 28) {
                    Log.d("PermissionsProtocol", "WRITE_MEDIA_STORAGE requested. Permission granted by default on OS 10 and later.");
                    break;
                } else {
                    arrayList.addAll(Arrays.asList(mo38655s(EnumC9813n.WRITE_EXTERNAL_STORAGE)));
                    break;
                }
                break;
            case "CAMERA_ACCESS":
                arrayList.addAll(Arrays.asList(mo38655s(EnumC9813n.CAMERA)));
                break;
            case "MICROPHONE_ACCESS":
                arrayList.addAll(Arrays.asList(mo38655s(EnumC9813n.MODIFY_AUDIO_SETTINGS), mo38655s(EnumC9813n.RECORD_AUDIO)));
                break;
            case "MEDIA_PICKER":
                if (Build.VERSION.SDK_INT > 28) {
                    Log.d("PermissionsProtocol", "MEDIA_PICKER requested. Permission granted by default on OS 10 and later.");
                    break;
                } else {
                    arrayList.addAll(Arrays.asList(mo38655s(EnumC9813n.READ_EXTERNAL_STORAGE)));
                    break;
                }
                break;
            case "LOCAL_NETWORK":
                break;
            default:
                Log.w("PermissionsProtocol", "Permission " + str + " is not supported.");
                break;
        }
        return m38607X(arrayList);
    }

    /* JADX INFO: renamed from: v */
    public final String[] m38658v(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.addAll(m38657u(str));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @NonNull
    /* JADX INFO: renamed from: w */
    public final List<String> m38659w(String[] strArr, Activity activity) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : m38657u(str)) {
                if (C7975b.m33003a(activity, str2) == -1) {
                    if (!"android.permission.POST_NOTIFICATIONS".equals(str2)) {
                        arrayList.add(str);
                        break;
                    }
                    if (Build.VERSION.SDK_INT >= 33 && !C7410b.m30698v(activity, str2)) {
                        synchronized (this) {
                            try {
                                if (!this.f35599h.containsKey("POST_NOTIFICATIONS") || !this.f35599h.get("POST_NOTIFICATIONS").mo30100b(activity.getApplicationContext())) {
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
    /* JADX INFO: renamed from: x */
    public final List<String> m38660x(String[] strArr, Activity activity) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : m38657u(str)) {
                if (C7975b.m33003a(activity, str2) == -1) {
                    if (!"android.permission.POST_NOTIFICATIONS".equals(str2)) {
                        arrayList.add(str);
                        break;
                    }
                    if (Build.VERSION.SDK_INT >= 33 && C7410b.m30698v(activity, str2)) {
                        synchronized (this) {
                            try {
                                if (!this.f35599h.containsKey("POST_NOTIFICATIONS") || !this.f35599h.get("POST_NOTIFICATIONS").mo30102d(activity.getApplicationContext())) {
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
    /* JADX INFO: renamed from: y */
    public final List<String> m38661y(String[] strArr, Activity activity) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Iterator<String> it = m38657u(str).iterator();
            while (it.hasNext()) {
                if (C7975b.m33003a(activity, it.next()) == -1) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public final void m38662z(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        if (Build.VERSION.SDK_INT >= 28) {
            intent.addFlags(268435456);
        }
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        context.startActivity(intent);
    }
}
