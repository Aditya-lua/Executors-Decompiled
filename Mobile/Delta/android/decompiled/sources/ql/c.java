package ql;

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

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageBus f29458a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Connection f29459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Connection f29460d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f29461a = new c(MessageBus.f());
    }

    public static c h() {
        return a.f29461a;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(JSONObject jSONObject) {
        boolean z10;
        Log.d("SMSProtocol", "onSendSMS: " + jSONObject.toString());
        try {
            String string = jSONObject.getString("address");
            String string2 = jSONObject.getString("message");
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("smsto", string, null));
            intent.addFlags(268468224);
            intent.putExtra("sms_body", string2);
            this.b.startActivity(intent);
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
            this.f29458a.m("SMSProtocol", "sendSMS", jSONObject2, 0, new HashMap());
        } catch (JSONException e12) {
            Log.e("SMSProtocol", "Exception while handling send SMS request: " + e12.toString());
            this.f29458a.m("SMSProtocol", "sendSMS", new JSONObject(), 13, new HashMap());
        }
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(JSONObject jSONObject) {
        Log.d("SMSProtocol", "onSupportsSMS: " + jSONObject.toString());
        boolean zHasSystemFeature = this.b.getPackageManager().hasSystemFeature("android.hardware.telephony");
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("support", zHasSystemFeature);
            this.f29458a.m("SMSProtocol", "supportsSMS", jSONObject2, 0, new HashMap());
        } catch (JSONException e10) {
            Log.e("SMSProtocol", "JSON exception while handling supports sms request: " + e10.toString());
            this.f29458a.m("SMSProtocol", "supportsSMS", new JSONObject(), 13, new HashMap());
        }
    }

    public void g(Context context) {
        this.b = context;
    }

    public c(MessageBus messageBus) {
        this.f29458a = messageBus;
        this.f29459c = messageBus.w("SMSProtocol", "sendSMS", new Callback() { // from class: ql.a
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f29456a.c(jSONObject);
            }
        });
        this.f29460d = messageBus.w("SMSProtocol", "supportsSMS", new Callback() { // from class: ql.b
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f29457a.d(jSONObject);
            }
        });
    }
}
