package rd;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import jb.r;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final jb.d f30660c = new jb.d("AgeSignalsService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30661a;
    public final jb.o b;

    /* JADX WARN: Type inference failed for: r6v0, types: [rd.i] */
    public l(Context context) {
        this.f30661a = context;
        if (r.b(context)) {
            this.b = new jb.o(context, f30660c, "AgeSignalsService", f.f30654a, new Object() { // from class: rd.i
            }, null);
        } else {
            this.b = null;
        }
    }

    public static Task d(int i10) {
        f30660c.a("onError(%d)", Integer.valueOf(i10));
        return tb.m.e(new a(i10));
    }

    public final Task b(d dVar) {
        jb.o oVar = this.b;
        if (oVar == null) {
            return d(-2);
        }
        if (r.a(this.f30661a) < 82380000) {
            return d(-6);
        }
        tb.k kVar = new tb.k();
        oVar.t(new j(this, kVar, kVar, dVar), kVar);
        return kVar.a();
    }
}
