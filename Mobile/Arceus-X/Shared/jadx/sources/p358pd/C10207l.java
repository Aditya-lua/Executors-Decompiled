package p358pd;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import p193ib.C6722d;
import p193ib.C6733o;
import p193ib.C6736r;
import sb.C11264k;
import sb.C11268m;

/* JADX INFO: renamed from: pd.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C10207l {

    /* JADX INFO: renamed from: c */
    public static final C6722d f36808c = new C6722d("AgeSignalsService");

    /* JADX INFO: renamed from: a */
    public final Context f36809a;

    /* JADX INFO: renamed from: b */
    public final C6733o f36810b;

    /* JADX WARN: Type inference failed for: r6v0, types: [pd.i] */
    public C10207l(Context context) {
        this.f36809a = context;
        if (C6736r.m28851b(context)) {
            this.f36810b = new C6733o(context, f36808c, "AgeSignalsService", C10201f.f36800a, new Object() { // from class: pd.i
            }, null);
        } else {
            this.f36810b = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Task m39294d(int i10) {
        f36808c.m28819a("onError(%d)", Integer.valueOf(i10));
        return C11268m.m42335e(new C10196a(i10));
    }

    /* JADX INFO: renamed from: b */
    public final Task m39295b(C10199d c10199d) {
        C6733o c6733o = this.f36810b;
        if (c6733o == null) {
            return m39294d(-2);
        }
        if (C6736r.m28850a(this.f36809a) < 82380000) {
            return m39294d(-6);
        }
        C11264k c11264k = new C11264k();
        c6733o.m28845t(new C10205j(this, c11264k, c11264k, c10199d), c11264k);
        return c11264k.m42326a();
    }
}
