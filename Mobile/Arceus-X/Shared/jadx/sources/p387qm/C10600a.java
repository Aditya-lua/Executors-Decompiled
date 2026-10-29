package p387qm;

import android.util.Log;
import com.roblox.universalapp.messagebus.MessageBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: qm.a */
/* JADX INFO: loaded from: classes2.dex */
public class C10600a {

    /* JADX INFO: renamed from: b */
    public static final String f38060b = MessageBus.getMessageId("Screen", "safeAreaInsets");

    /* JADX INFO: renamed from: a */
    public final MessageBus f38061a = MessageBus.m16016f();

    /* JADX INFO: renamed from: qm.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C10600a f38062a = new C10600a();
    }

    /* JADX INFO: renamed from: b */
    public static C10600a m40631b() {
        return a.f38062a;
    }

    /* JADX INFO: renamed from: a */
    public void m40632a(float f10, float f11, float f12, float f13) {
        Log.d("ScreenProtocol", String.format("Sending safe area insets: left: %f, top: %f, right: %f, bottom: %f", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13)));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("left", f10);
            jSONObject.put("top", f11);
            jSONObject.put("right", f12);
            jSONObject.put("bottom", f13);
            this.f38061a.m16024l(f38060b, jSONObject);
        } catch (JSONException e10) {
            Log.e("ScreenProtocol", "Sending safe area insets failed with error: " + e10.getMessage());
        }
    }
}
