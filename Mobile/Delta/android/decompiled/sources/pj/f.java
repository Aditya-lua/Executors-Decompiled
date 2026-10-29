package pj;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.pushnotification.v2.model.NotificationAction;
import com.roblox.client.pushnotification.v2.richpushnotifications.RichPushNotificationMedia;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface f {
    String A();

    long B();

    String a();

    List<NameValuePair> b();

    String c();

    int d();

    boolean e();

    int f();

    PendingIntent g(Context context);

    String getBody();

    String getGroupId();

    String getId();

    String getTitle();

    int getVisibility();

    Bundle h();

    int i(Context context);

    boolean j();

    boolean k();

    String l();

    PendingIntent m(Context context);

    String n();

    long o();

    e p();

    String q();

    String r();

    int s();

    List<NotificationAction> t();

    RichPushNotificationMedia u();

    boolean v();

    Uri w(Context context);

    Map<String, f> x();

    String y();

    String z();
}
