package nj;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.pushnotification.v2.model.NotificationAction;
import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import com.roblox.client.pushnotification.v2.richpushnotifications.RichPushNotificationMedia;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface f {
    String A();

    String B();

    long C();

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

    PayloadNotificationChannel l();

    String m();

    PendingIntent n(Context context);

    String o();

    long p();

    e q();

    String r();

    String s();

    int t();

    List<NotificationAction> u();

    RichPushNotificationMedia v();

    boolean w();

    Uri x(Context context);

    Map<String, f> y();

    String z();
}
