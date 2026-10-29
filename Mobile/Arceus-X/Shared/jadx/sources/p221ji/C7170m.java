package p221ji;

import com.roblox.client.realtime.RealtimeService;
import org.json.JSONException;
import org.json.JSONObject;
import p151gk.C6124q;
import sj.C11387b;
import tk.AbstractC11666a;
import tk.C11667b;

/* JADX INFO: renamed from: ji.m */
/* JADX INFO: loaded from: classes2.dex */
public class C7170m extends C11667b {

    /* JADX INFO: renamed from: ji.m$a */
    public class a implements C11667b.a {
        @Override // tk.C11667b.a
        /* JADX INFO: renamed from: a */
        public void mo29964a(AbstractC11666a abstractC11666a) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isConnected", RealtimeService.m15483d());
                jSONObject.put("sequenceNumber", RealtimeService.m15482c());
                jSONObject.put("namespaceSequenceNumbers", C11387b.m42707a().m42708b());
                C6124q.m27064i("rbx.signalr", "RBHybridModuleRealtime IsConnectedFunction.execute() command:" + abstractC11666a.m43816f() + " callback:" + jSONObject);
                abstractC11666a.mo43811a(true, jSONObject);
            } catch (JSONException e10) {
                e10.printStackTrace();
                abstractC11666a.mo43811a(false, null);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a() {
        }
    }

    public C7170m() {
        super("RealTime");
        m43823d("isConnected", new a());
    }
}
