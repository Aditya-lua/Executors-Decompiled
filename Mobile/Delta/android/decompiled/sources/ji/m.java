package ji;

import com.roblox.client.realtime.RealtimeService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class m extends tk.b {

    public class a implements tk.b.a {
        @Override // tk.b.a
        public void a(tk.a aVar) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isConnected", RealtimeService.d());
                jSONObject.put("sequenceNumber", RealtimeService.c());
                jSONObject.put("namespaceSequenceNumbers", sj.b.a().b());
                gk.p.i("rbx.signalr", "RBHybridModuleRealtime IsConnectedFunction.execute() command:" + aVar.f() + " callback:" + jSONObject);
                aVar.a(true, jSONObject);
            } catch (JSONException e10) {
                e10.printStackTrace();
                aVar.a(false, null);
            }
        }

        public a() {
        }
    }

    public m() {
        super("RealTime");
        d("isConnected", new a());
    }
}
