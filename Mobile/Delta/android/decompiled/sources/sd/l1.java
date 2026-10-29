package sd;

import android.content.Context;
import com.google.android.play.core.integrity.IntegrityManager;

/* JADX INFO: loaded from: classes2.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final de.d0 f30652a;
    public final de.d0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final de.d0 f30653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final de.d0 f30654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final de.d0 f30655e;

    public /* synthetic */ l1(Context context, k1 k1Var) {
        de.z zVarB = de.a0.b(context);
        this.f30652a = zVarB;
        de.d0 d0VarB = de.y.b(g.f30626a);
        this.b = d0VarB;
        u uVar = new u(zVarB, e1.f30623a);
        this.f30653c = uVar;
        de.d0 d0VarB2 = de.y.b(new o(zVarB, d0VarB, uVar, e1.f30623a));
        this.f30654d = d0VarB2;
        this.f30655e = de.y.b(new f(d0VarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f30655e.a();
    }
}
