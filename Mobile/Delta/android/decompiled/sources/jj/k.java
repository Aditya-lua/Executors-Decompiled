package jj;

import android.content.Context;
import mj.PushNotificationMetadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class k {
    public final String a(PushNotificationMetadata pushNotificationMetadata) {
        if (pushNotificationMetadata != null) {
            return pushNotificationMetadata.getNotificationType();
        }
        return null;
    }

    public final PushNotificationMetadata b(JSONObject jSONObject) {
        try {
            return PushNotificationMetadata.a(jSONObject);
        } catch (h e10) {
            gk.p.d(e10.getMessage());
            return null;
        }
    }

    public void c(Context context, PushNotificationMetadata pushNotificationMetadata, i iVar, e eVar, d dVar) {
        String strA;
        if (pushNotificationMetadata == null || (strA = a(pushNotificationMetadata)) == null) {
            return;
        }
        if (iVar != null && ("FriendRequestAccepted".equals(strA) || "FriendRequestReceived".equals(strA) || "PrivateMessageReceived".equals(strA) || "ChatNewMessage".equals(strA))) {
            iVar.g(pushNotificationMetadata, context);
            return;
        }
        if ("PushExpiryMessage".equals(strA) && eVar != null) {
            eVar.b(pushNotificationMetadata, context);
        } else {
            if (!"PushCategoryExpiryMessage".equals(strA) || dVar == null) {
                return;
            }
            dVar.b(pushNotificationMetadata, context);
        }
    }

    public void d(JSONObject jSONObject, Context context) {
        c(context, b(jSONObject), new i(), new e(), new d());
    }
}
