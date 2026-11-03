package hj;

import android.content.Context;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.ArrayList;
import kj.PushNotificationMetadataResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;
import rg.t0;

/* JADX INFO: loaded from: classes2.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f19485a = new a();

    public class a implements b {
        public a() {
        }

        @Override // hj.a0.b
        public void a(PushNotificationMetadataResponse pushNotificationMetadataResponse, Context context, String str, String str2, k kVar) {
            if (pushNotificationMetadataResponse != null) {
                JSONObject metadata = pushNotificationMetadataResponse.getMetadata();
                try {
                    kVar.d(metadata, context);
                    t0.t("onMetadataRetrieved", str, metadata.getString(Payload.TYPE), metadata.getString("notificationId"), str2, "0", new ArrayList());
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public interface b {
        void a(PushNotificationMetadataResponse pushNotificationMetadataResponse, Context context, String str, String str2, k kVar);
    }

    public static /* synthetic */ Unit a(String str, String str2, Integer num) {
        t0.s((num == null || num.intValue() != 401) ? "metadataInaccessible" : "unauthenticated", str, str2);
        return Unit.f22938a;
    }

    public static /* synthetic */ Unit b(b bVar, Context context, String str, String str2, PushNotificationMetadataResponse pushNotificationMetadataResponse) {
        bVar.a(pushNotificationMetadataResponse, context, str, str2, new k());
        return Unit.f22938a;
    }

    public String c(Context context, String str, x xVar) {
        return xVar.a(context, str);
    }

    public final String d(Context context) {
        return ek.w.a(context);
    }

    public final x e() {
        return new x();
    }

    public void f(final Context context, jj.a aVar, final String str, String str2, String str3, final String str4, final b bVar) {
        ek.q.i("rbx.push", str + " " + str2 + " " + context);
        if (str == null || str2 == null || context == null) {
            return;
        }
        aVar.d(str, str2, str3, new Function1() { // from class: hj.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a0.b(bVar, context, str, str4, (PushNotificationMetadataResponse) obj);
            }
        }, new Function1() { // from class: hj.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a0.a(str, str4, (Integer) obj);
            }
        });
    }

    public void g(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        x xVarE = e();
        String strC = c(context, r.k().n(context), xVarE);
        String strC2 = c(context, r.k().r(context), xVarE);
        String strD = d(context);
        ti.b.f().l(context);
        ci.c.e(context);
        f(context, new jj.a(), strC, strC2, str, strD, this.f19485a);
    }
}
