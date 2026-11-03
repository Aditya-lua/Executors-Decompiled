package pd;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import ib.r;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ib.d f28657c = new ib.d("AgeSignalsService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28658a;
    public final ib.o b;

    /* JADX WARN: Type inference failed for: r6v0, types: [pd.i] */
    public l(Context context) {
        this.f28658a = context;
        if (r.b(context)) {
            this.b = new ib.o(context, f28657c, "AgeSignalsService", f.f28651a, new Object() { // from class: pd.i
            }, null);
        } else {
            this.b = null;
        }
    }

    public static Task d(int i10) {
        f28657c.a("onError(%d)", Integer.valueOf(i10));
        return sb.m.e(new a(i10));
    }

    public final Task b(d dVar) {
        ib.o oVar = this.b;
        if (oVar == null) {
            return d(-2);
        }
        if (r.a(this.f28658a) < 82380000) {
            return d(-6);
        }
        sb.k kVar = new sb.k();
        oVar.t(new j(this, kVar, kVar, dVar), kVar);
        return kVar.a();
    }
}
