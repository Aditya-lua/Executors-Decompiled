package p222jj;

import android.content.Context;
import org.json.JSONObject;
import p151gk.C6124q;
import p294mj.PushNotificationMetadata;

/* JADX INFO: renamed from: jj.k */
/* JADX INFO: loaded from: classes2.dex */
public class C7186k {
    /* JADX INFO: renamed from: a */
    public final String m30047a(PushNotificationMetadata pushNotificationMetadata) {
        if (pushNotificationMetadata != null) {
            return pushNotificationMetadata.getNotificationType();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final PushNotificationMetadata m30048b(JSONObject jSONObject) {
        try {
            return PushNotificationMetadata.m34431a(jSONObject);
        } catch (C7183h e10) {
            C6124q.m27059d(e10.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m30049c(Context context, PushNotificationMetadata pushNotificationMetadata, C7184i c7184i, C7180e c7180e, C7179d c7179d) {
        String strM30047a;
        if (pushNotificationMetadata == null || (strM30047a = m30047a(pushNotificationMetadata)) == null) {
            return;
        }
        if (c7184i != null && ("FriendRequestAccepted".equals(strM30047a) || "FriendRequestReceived".equals(strM30047a) || "PrivateMessageReceived".equals(strM30047a) || "ChatNewMessage".equals(strM30047a))) {
            c7184i.m30045g(pushNotificationMetadata, context);
            return;
        }
        if ("PushExpiryMessage".equals(strM30047a) && c7180e != null) {
            c7180e.m30025b(pushNotificationMetadata, context);
        } else {
            if (!"PushCategoryExpiryMessage".equals(strM30047a) || c7179d == null) {
                return;
            }
            c7179d.m30017b(pushNotificationMetadata, context);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m30050d(JSONObject jSONObject, Context context) {
        m30049c(context, m30048b(jSONObject), new C7184i(), new C7180e(), new C7179d());
    }
}
