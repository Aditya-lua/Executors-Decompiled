package p386ql;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ql.c */
/* JADX INFO: loaded from: classes2.dex */
public class C10597c {

    /* JADX INFO: renamed from: a */
    public MessageBus f38051a;

    /* JADX INFO: renamed from: b */
    public Context f38052b;

    /* JADX INFO: renamed from: c */
    public Connection f38053c;

    /* JADX INFO: renamed from: d */
    public Connection f38054d;

    /* JADX INFO: renamed from: ql.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C10597c f38055a = new C10597c(MessageBus.m16016f());
    }

    /* JADX INFO: renamed from: h */
    public static C10597c m40622h() {
        return a.f38055a;
    }

    /* JADX DEBUG: Method merged with bridge method: c(Lorg/json/JSONObject;)V */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m40623c(JSONObject jSONObject) {
        boolean z10;
        Log.d("SMSProtocol", "onSendSMS: " + jSONObject.toString());
        try {
            String string = jSONObject.getString("address");
            String string2 = jSONObject.getString("message");
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("smsto", string, null));
            intent.addFlags(268468224);
            intent.putExtra("sms_body", string2);
            this.f38052b.startActivity(intent);
            z10 = true;
        } catch (ActivityNotFoundException e10) {
            Log.e("SMSProtocol", "Exception while handling send SMS request: " + e10.toString());
            z10 = false;
        } catch (JSONException e11) {
            Log.e("SMSProtocol", "Exception while handling send SMS request: " + e11.toString());
            z10 = false;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sent", z10);
            this.f38051a.m16025m("SMSProtocol", "sendSMS", jSONObject2, 0, new HashMap());
        } catch (JSONException e12) {
            Log.e("SMSProtocol", "Exception while handling send SMS request: " + e12.toString());
            this.f38051a.m16025m("SMSProtocol", "sendSMS", new JSONObject(), 13, new HashMap());
        }
    }

    /* JADX DEBUG: Method merged with bridge method: d(Lorg/json/JSONObject;)V */
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m40624d(JSONObject jSONObject) {
        Log.d("SMSProtocol", "onSupportsSMS: " + jSONObject.toString());
        boolean zHasSystemFeature = this.f38052b.getPackageManager().hasSystemFeature("android.hardware.telephony");
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("support", zHasSystemFeature);
            this.f38051a.m16025m("SMSProtocol", "supportsSMS", jSONObject2, 0, new HashMap());
        } catch (JSONException e10) {
            Log.e("SMSProtocol", "JSON exception while handling supports sms request: " + e10.toString());
            this.f38051a.m16025m("SMSProtocol", "supportsSMS", new JSONObject(), 13, new HashMap());
        }
    }

    /* JADX INFO: renamed from: g */
    public void m40627g(Context context) {
        this.f38052b = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10597c(MessageBus messageBus) {
        this.f38051a = messageBus;
        this.f38053c = messageBus.m16033w("SMSProtocol", "sendSMS", new Callback() { // from class: ql.a
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f38049a.m40623c(jSONObject);
            }
        });
        this.f38054d = messageBus.m16033w("SMSProtocol", "supportsSMS", new Callback() { // from class: ql.b
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f38050a.m40624d(jSONObject);
            }
        });
    }
}
