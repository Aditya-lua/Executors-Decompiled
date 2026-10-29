package qm;

import android.util.Log;
import com.roblox.universalapp.messagebus.MessageBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static final String b = MessageBus.getMessageId("Screen", "safeAreaInsets");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageBus f29464a = MessageBus.f();

    /* JADX INFO: renamed from: qm.a$a, reason: collision with other inner class name */
    public static class C0520a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29465a = new a();
    }

    public static a b() {
        return C0520a.f29465a;
    }

    public void a(float f10, float f11, float f12, float f13) {
        Log.d("ScreenProtocol", String.format("Sending safe area insets: left: %f, top: %f, right: %f, bottom: %f", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13)));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("left", f10);
            jSONObject.put("top", f11);
            jSONObject.put("right", f12);
            jSONObject.put("bottom", f13);
            this.f29464a.l(b, jSONObject);
        } catch (JSONException e10) {
            Log.e("ScreenProtocol", "Sending safe area insets failed with error: " + e10.getMessage());
        }
    }
}
