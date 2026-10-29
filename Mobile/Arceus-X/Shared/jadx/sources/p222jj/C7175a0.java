package p222jj;

import android.content.Context;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;
import p104ei.C5125c;
import p151gk.C6124q;
import p151gk.C6130w;
import p273lj.C8153a;
import p294mj.PushNotificationMetadataResponse;
import sg.C11356t0;
import vi.C12211b;

/* JADX INFO: renamed from: jj.a0 */
/* JADX INFO: loaded from: classes2.dex */
public class C7175a0 {

    /* JADX INFO: renamed from: a */
    public b f27842a = new a();

    /* JADX INFO: renamed from: jj.a0$a */
    public class a implements b {
        public a() {
        }

        @Override // p222jj.C7175a0.b
        /* JADX INFO: renamed from: a */
        public void mo29977a(PushNotificationMetadataResponse pushNotificationMetadataResponse, Context context, String str, String str2, C7186k c7186k) {
            if (pushNotificationMetadataResponse != null) {
                JSONObject metadata = pushNotificationMetadataResponse.getMetadata();
                try {
                    c7186k.m30050d(metadata, context);
                    C11356t0.m42550t("onMetadataRetrieved", str, metadata.getString(Payload.TYPE), metadata.getString("notificationId"), str2, "0", new ArrayList());
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: jj.a0$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo29977a(PushNotificationMetadataResponse pushNotificationMetadataResponse, Context context, String str, String str2, C7186k c7186k);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m29970a(String str, String str2, Integer num) {
        C11356t0.m42549s((num == null || num.intValue() != 401) ? "metadataInaccessible" : "unauthenticated", str, str2);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Unit m29971b(b bVar, Context context, String str, String str2, PushNotificationMetadataResponse pushNotificationMetadataResponse) {
        bVar.mo29977a(pushNotificationMetadataResponse, context, str, str2, new C7186k());
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: c */
    public String m29972c(Context context, String str, C7199x c7199x) {
        return c7199x.m30120a(context, str);
    }

    /* JADX INFO: renamed from: d */
    public final String m29973d(Context context) {
        return C6130w.m27099a(context);
    }

    /* JADX INFO: renamed from: e */
    public final C7199x m29974e() {
        return new C7199x();
    }

    /* JADX INFO: renamed from: f */
    public void m29975f(final Context context, C8153a c8153a, final String str, String str2, String str3, final String str4, final b bVar) {
        C6124q.m27064i("rbx.push", str + " " + str2 + " " + context);
        if (str == null || str2 == null || context == null) {
            return;
        }
        c8153a.m33423d(str, str2, str3, new Function1() { // from class: jj.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C7175a0.m29971b(bVar, context, str, str4, (PushNotificationMetadataResponse) obj);
            }
        }, new Function1() { // from class: jj.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C7175a0.m29970a(str, str4, (Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m29976g(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        C7199x c7199xM29974e = m29974e();
        String strM29972c = m29972c(context, C7193r.m30069k().m30083n(context), c7199xM29974e);
        String strM29972c2 = m29972c(context, C7193r.m30069k().m30087r(context), c7199xM29974e);
        String strM29973d = m29973d(context);
        C12211b.m45200f().m45210l(context);
        C5125c.m23921e(context);
        m29975f(context, new C8153a(), strM29972c, strM29972c2, str, strM29973d, this.f27842a);
    }
}
