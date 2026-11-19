package ri;

import com.roblox.client.realtime.RealtimeService;
import ok.q;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class m extends al.b {

    public class a implements al.b.a {
        @Override // al.b.a
        public void a(al.a aVar) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isConnected", RealtimeService.d());
                jSONObject.put("sequenceNumber", RealtimeService.c());
                jSONObject.put("namespaceSequenceNumbers", ak.b.a().b());
                q.i("rbx.signalr", "RBHybridModuleRealtime IsConnectedFunction.execute() command:" + aVar.f() + " callback:" + jSONObject);
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
