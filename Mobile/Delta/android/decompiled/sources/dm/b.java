package dm;

import android.util.Log;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import th.h;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageBus f14748a;
    public final ArrayList<Connection> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<String> f14749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Hashtable<String, JSONObject> f14750d;

    public class a implements Callback {
        public a() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            try {
                if (jSONObject.getString("status").equals("Initialized")) {
                    b.this.c();
                }
            } catch (JSONException e10) {
                Log.e("ExperimentProtocol", "Loading status of IXP User Layers is not returned from the MessageBus. File a bug to NFDN component. Error: " + e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: dm.b$b, reason: collision with other inner class name */
    public class C0274b implements Callback {
        public C0274b() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            try {
                b.this.f14750d.put(jSONObject.getString("layerName"), new JSONObject(jSONObject.getString("layerVariables")));
            } catch (JSONException e10) {
                Log.e("ExperimentProtocol", "Unable to get variables from layer. Error: " + e10.getMessage());
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f14753a = new b();
    }

    public static b i() {
        return c.f14753a;
    }

    public final void c() {
        ArrayList<String> arrayList = this.f14749c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            String str2 = str;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("layerName", str2);
                this.f14748a.l(d.GET_USER_LAYER_VARIABLES_REQUEST, jSONObject);
            } catch (JSONException e10) {
                Log.e("ExperimentProtocol", "Failed to construct getUserLayerVariables JSON due to: " + e10.getMessage());
            }
        }
    }

    public JSONObject d(String str) {
        return this.f14750d.get(str);
    }

    public final void e() {
        this.b.add(this.f14748a.t(d.GET_USER_LAYER_VARIABLES_RESPONSE, new C0274b()));
    }

    public final void f() {
        this.b.add(this.f14748a.t(d.USER_LAYER_LOADING_STATUS_CHANGED, new a()));
    }

    public void g() {
        ArrayList arrayList = new ArrayList();
        if (h.a().L0()) {
            arrayList.add("Backgrounding.General");
        }
        if (arrayList.isEmpty()) {
            return;
        }
        h((String[]) arrayList.toArray(new String[0]));
    }

    public final void h(String[] strArr) {
        this.f14749c.addAll(Arrays.asList(strArr));
        try {
            JSONArray jSONArray = new JSONArray(strArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userLayers", jSONArray);
            this.f14748a.l(d.REGISTER_USER_LAYER, jSONObject);
        } catch (JSONException e10) {
            Log.e("ExperimentProtocol", "Failed to construct registerUserLayers JSON due to: " + e10.getMessage());
        }
    }

    public b() {
        this.f14748a = MessageBus.f();
        this.b = new ArrayList<>();
        this.f14749c = new ArrayList<>();
        this.f14750d = new Hashtable<>();
        e();
        f();
    }
}
