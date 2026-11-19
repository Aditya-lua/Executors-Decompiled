package fm;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.roblox.universalapp.messagebus.MessageBus;
import com.roblox.universalapp.messagebus.RequestHandler;
import com.roblox.universalapp.messagebus.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageBus f16154a;
    public p b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static c f16155a = new c(MessageBus.getInstance());
    }

    public static /* synthetic */ Response a(JSONObject jSONObject) {
        Response response = new Response();
        try {
            response.params.put(an.a.q(), true);
            return response;
        } catch (JSONException e10) {
            Log.e("AccountProtocol", "Exception while handling DeviceIntegrityAvailable request: " + e10.toString());
            return response;
        }
    }

    public static c d() {
        return a.f16155a;
    }

    public void c(Context context) {
        if (bi.h.a().O3()) {
            this.b.h((Application) context.getApplicationContext());
        }
    }

    public c(MessageBus messageBus) {
        this.f16154a = messageBus;
        messageBus.setRequestHandler(an.a.o(), an.a.e(), new RequestHandler() { // from class: fm.a
            @Override // com.roblox.universalapp.messagebus.RequestHandler
            public final Response run(JSONObject jSONObject) {
                return c.a(jSONObject);
            }
        });
        messageBus.setRequestHandler(an.a.o(), an.a.k(), new RequestHandler() { // from class: fm.b
            @Override // com.roblox.universalapp.messagebus.RequestHandler
            public final Response run(JSONObject jSONObject) {
                return j.j().e(jSONObject);
            }
        });
        if (bi.h.a().O3()) {
            this.b = new p(messageBus);
        }
    }
}
