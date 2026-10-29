package p072d9;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import p242k9.AbstractC7496f;
import p242k9.AbstractC7499i;
import p242k9.C7500j;
import p268l9.C8033f;
import p375q9.C10484a;

/* JADX INFO: renamed from: d9.n */
/* JADX INFO: loaded from: classes.dex */
public final class C4486n {

    /* JADX INFO: renamed from: a */
    public static final C10484a f18524a = new C10484a("GoogleSignInCommon", new String[0]);

    /* JADX INFO: renamed from: a */
    public static AbstractC7499i m22439a(AbstractC7496f abstractC7496f, Context context, boolean z10) {
        f18524a.m40290a("Revoking access", new Object[0]);
        String strM22428e = C4474b.m22423b(context).m22428e();
        m22441c(context);
        return z10 ? RunnableC4477e.m22435a(strM22428e) : abstractC7496f.mo31155a(new C4484l(abstractC7496f));
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC7499i m22440b(AbstractC7496f abstractC7496f, Context context, boolean z10) {
        f18524a.m40290a("Signing out", new Object[0]);
        m22441c(context);
        return z10 ? C7500j.m31161b(Status.f7405k, abstractC7496f) : abstractC7496f.mo31155a(new C4482j(abstractC7496f));
    }

    /* JADX INFO: renamed from: c */
    public static void m22441c(Context context) {
        C4487o.m22442a(context).m22444b();
        Iterator<AbstractC7496f> it = AbstractC7496f.m31154b().iterator();
        while (it.hasNext()) {
            it.next().m31158e();
        }
        C8033f.m33132a();
    }
}
