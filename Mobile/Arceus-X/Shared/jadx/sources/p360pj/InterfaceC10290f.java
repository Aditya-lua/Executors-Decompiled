package p360pj;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.pushnotification.p051v2.model.NotificationAction;
import com.roblox.client.pushnotification.p051v2.richpushnotifications.RichPushNotificationMedia;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: pj.f */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC10290f {
    /* JADX INFO: renamed from: A */
    String mo39523A();

    /* JADX INFO: renamed from: B */
    long mo39524B();

    /* JADX INFO: renamed from: a */
    String mo39529a();

    /* JADX INFO: renamed from: b */
    List<NameValuePair> mo39530b();

    /* JADX INFO: renamed from: c */
    String mo39531c();

    /* JADX INFO: renamed from: d */
    int mo39532d();

    /* JADX INFO: renamed from: e */
    boolean mo39533e();

    /* JADX INFO: renamed from: f */
    int mo39534f();

    /* JADX INFO: renamed from: g */
    PendingIntent mo39535g(Context context);

    String getBody();

    String getGroupId();

    String getId();

    String getTitle();

    int getVisibility();

    /* JADX INFO: renamed from: h */
    Bundle mo39536h();

    /* JADX INFO: renamed from: i */
    int mo39537i(Context context);

    /* JADX INFO: renamed from: j */
    boolean mo39538j();

    /* JADX INFO: renamed from: k */
    boolean mo39539k();

    /* JADX INFO: renamed from: l */
    String mo39540l();

    /* JADX INFO: renamed from: m */
    PendingIntent mo39541m(Context context);

    /* JADX INFO: renamed from: n */
    String mo39542n();

    /* JADX INFO: renamed from: o */
    long mo39543o();

    /* JADX INFO: renamed from: p */
    EnumC10289e mo39544p();

    /* JADX INFO: renamed from: q */
    String mo39545q();

    /* JADX INFO: renamed from: r */
    String mo39546r();

    /* JADX INFO: renamed from: s */
    int mo39547s();

    /* JADX INFO: renamed from: t */
    List<NotificationAction> mo39548t();

    /* JADX INFO: renamed from: u */
    RichPushNotificationMedia mo39549u();

    /* JADX INFO: renamed from: v */
    boolean mo39550v();

    /* JADX INFO: renamed from: w */
    Uri mo39551w(Context context);

    /* JADX INFO: renamed from: x */
    Map<String, InterfaceC10290f> mo39552x();

    /* JADX INFO: renamed from: y */
    String mo39553y();

    /* JADX INFO: renamed from: z */
    String mo39554z();
}
