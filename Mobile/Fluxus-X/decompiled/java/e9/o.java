package e9;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r9.a f13251a = new r9.a("GoogleSignInCommon", new String[0]);

    public static l9.k a(l9.h hVar, Context context, boolean z10) {
        f13251a.a("Revoking access", new Object[0]);
        String strE = c.b(context).e();
        c(context);
        return z10 ? f.a(strE) : hVar.a(new m(hVar));
    }

    public static l9.k b(l9.h hVar, Context context, boolean z10) {
        f13251a.a("Signing out", new Object[0]);
        c(context);
        return z10 ? l9.l.b(Status.f6108k, hVar) : hVar.a(new k(hVar));
    }

    public static void c(Context context) {
        p.a(context).b();
        Iterator<l9.h> it = l9.h.b().iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        m9.f.a();
    }
}
