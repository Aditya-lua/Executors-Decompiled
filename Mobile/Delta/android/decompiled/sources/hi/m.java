package hi;

import com.roblox.client.realtime.RealtimeService;
import ek.q;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class m extends rk.b {

    public class a implements rk.b.a {
        @Override // rk.b.a
        public void a(rk.a aVar) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isConnected", RealtimeService.d());
                jSONObject.put("sequenceNumber", RealtimeService.c());
                jSONObject.put("namespaceSequenceNumbers", qj.b.a().b());
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
