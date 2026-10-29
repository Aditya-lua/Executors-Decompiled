package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class q6 extends w1.i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x6 f25881j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(x6 x6Var, int i10) {
        super(20);
        Objects.requireNonNull(x6Var);
        this.f25881j = x6Var;
    }

    @Override // w1.i
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        String str = (String) obj;
        n9.m.f(str);
        return this.f25881j.o(str);
    }
}
