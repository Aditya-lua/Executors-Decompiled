package dm;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import th.C11659h;

/* JADX INFO: renamed from: dm.b */
/* JADX INFO: loaded from: classes2.dex */
public class C4643b {

    /* JADX INFO: renamed from: a */
    public final MessageBus f19020a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<Connection> f19021b;

    /* JADX INFO: renamed from: c */
    public final ArrayList<String> f19022c;

    /* JADX INFO: renamed from: d */
    public final Hashtable<String, JSONObject> f19023d;

    /* JADX INFO: renamed from: dm.b$a */
    public class a implements Callback {
        public a() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* JADX INFO: renamed from: a */
        public void mo7492a(JSONObject jSONObject) {
            try {
                if (jSONObject.getString(NotificationCompat.CATEGORY_STATUS).equals("Initialized")) {
                    C4643b.this.m22867c();
                }
            } catch (JSONException e10) {
                Log.e("ExperimentProtocol", "Loading status of IXP User Layers is not returned from the MessageBus. File a bug to NFDN component. Error: " + e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: dm.b$b */
    public class b implements Callback {
        public b() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* JADX INFO: renamed from: a */
        public void mo7492a(JSONObject jSONObject) {
            try {
                C4643b.this.f19023d.put(jSONObject.getString("layerName"), new JSONObject(jSONObject.getString("layerVariables")));
            } catch (JSONException e10) {
                Log.e("ExperimentProtocol", "Unable to get variables from layer. Error: " + e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: dm.b$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public static final C4643b f19026a = new C4643b();
    }

    /* JADX INFO: renamed from: i */
    public static C4643b m22866i() {
        return c.f19026a;
    }

    /* JADX INFO: renamed from: c */
    public final void m22867c() {
        ArrayList<String> arrayList = this.f19022c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            String str2 = str;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("layerName", str2);
                this.f19020a.m16024l(C4645d.GET_USER_LAYER_VARIABLES_REQUEST, jSONObject);
            } catch (JSONException e10) {
                Log.e("ExperimentProtocol", "Failed to construct getUserLayerVariables JSON due to: " + e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public JSONObject m22868d(String str) {
        return this.f19023d.get(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m22869e() {
        this.f19021b.add(this.f19020a.m16030t(C4645d.GET_USER_LAYER_VARIABLES_RESPONSE, new b()));
    }

    /* JADX INFO: renamed from: f */
    public final void m22870f() {
        this.f19021b.add(this.f19020a.m16030t(C4645d.USER_LAYER_LOADING_STATUS_CHANGED, new a()));
    }

    /* JADX INFO: renamed from: g */
    public void m22871g() {
        ArrayList arrayList = new ArrayList();
        if (C11659h.m43403a().mo43502O0()) {
            arrayList.add("Backgrounding.General");
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m22872h((String[]) arrayList.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: h */
    public final void m22872h(String[] strArr) {
        this.f19022c.addAll(Arrays.asList(strArr));
        try {
            JSONArray jSONArray = new JSONArray(strArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userLayers", jSONArray);
            this.f19020a.m16024l(C4645d.REGISTER_USER_LAYER, jSONObject);
        } catch (JSONException e10) {
            Log.e("ExperimentProtocol", "Failed to construct registerUserLayers JSON due to: " + e10.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4643b() {
        this.f19020a = MessageBus.m16016f();
        this.f19021b = new ArrayList<>();
        this.f19022c = new ArrayList<>();
        this.f19023d = new Hashtable<>();
        m22869e();
        m22870f();
    }
}
