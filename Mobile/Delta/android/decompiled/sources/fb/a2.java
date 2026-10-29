package fb;

import android.content.Context;
import com.google.android.gms.internal.games_v2.zzq;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class a2 extends k9.e implements w1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k9.a.g f16504k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final k9.a.AbstractC0392a f16505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final k9.a f16506m;

    static {
        k9.a.g gVar = new k9.a.g();
        f16504k = gVar;
        x1 x1Var = new x1();
        f16505l = x1Var;
        f16506m = new k9.a("GamesConnect.API", x1Var, gVar);
    }

    public a2(Context context, p1 p1Var) {
        super(context, (k9.a<p1>) f16506m, p1Var, k9.e.a.f22280c);
    }

    @Override // fb.w1
    public final Task f(final zzq zzqVar, boolean z10) {
        l9.u uVarA = l9.u.c().b(new l9.q() { // from class: fb.z1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((g2) ((b2) obj).getService()).t2(new y1(this.f16589a, (sb.k) obj2), zzqVar);
            }
        }).e(6737).c(z10).a();
        return z10 ? D(uVarA) : y(uVarA);
    }
}
