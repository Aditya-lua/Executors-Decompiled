package gb;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends l9.g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l9.a.AbstractC0421a f17667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l9.a.g f17668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l9.a f17669m;

    static {
        q0 q0Var = new q0();
        f17667k = q0Var;
        l9.a.g gVar = new l9.a.g();
        f17668l = gVar;
        f17669m = new l9.a("Games.API", q0Var, gVar);
    }

    public s0(Context context, ea.x xVar) {
        super(context, (l9.a<ea.x>) f17669m, xVar, l9.g.a.f22012c);
    }

    @Override // l9.g
    public final o9.f.a x() {
        o9.f.a aVarX = super.x();
        if (F() != null) {
            String str = ((ea.x) F()).f13300k;
        }
        return aVarX;
    }
}
