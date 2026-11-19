package gb;

import android.content.Context;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class b2 extends l9.g implements x1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l9.a.g f17594k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l9.a.AbstractC0421a f17595l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l9.a f17596m;

    static {
        l9.a.g gVar = new l9.a.g();
        f17594k = gVar;
        y1 y1Var = new y1();
        f17595l = y1Var;
        f17596m = new l9.a("GamesConnect.API", y1Var, gVar);
    }

    public b2(Context context, q1 q1Var) {
        super(context, (l9.a<q1>) f17596m, q1Var, l9.g.a.f22012c);
    }

    @Override // gb.x1
    public final Task q(final d2 d2Var, boolean z10) {
        m9.u uVarA = m9.u.c().b(new m9.q() { // from class: gb.a2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // m9.q
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((j2) ((c2) obj).getService()).t2(new z1(this.f17591a, (tb.k) obj2), d2Var);
            }
        }).e(6737).c(z10).a();
        return z10 ? D(uVarA) : y(uVarA);
    }
}
