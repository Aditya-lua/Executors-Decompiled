package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class v6 extends w1.i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c7 f27864j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(c7 c7Var, int i10) {
        super(20);
        Objects.requireNonNull(c7Var);
        this.f27864j = c7Var;
    }

    @Override // w1.i
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        String str = (String) obj;
        o9.s.f(str);
        return this.f27864j.o(str);
    }
}
