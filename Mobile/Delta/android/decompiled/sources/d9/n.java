package d9;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q9.a f14499a = new q9.a("GoogleSignInCommon", new String[0]);

    public static k9.i a(k9.f fVar, Context context, boolean z10) {
        f14499a.a("Revoking access", new Object[0]);
        String strE = b.b(context).e();
        c(context);
        return z10 ? e.a(strE) : fVar.a(new l(fVar));
    }

    public static k9.i b(k9.f fVar, Context context, boolean z10) {
        f14499a.a("Signing out", new Object[0]);
        c(context);
        return z10 ? k9.j.b(Status.f5718k, fVar) : fVar.a(new j(fVar));
    }

    public static void c(Context context) {
        o.a(context).b();
        Iterator<k9.f> it = k9.f.b().iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        l9.f.a();
    }
}
