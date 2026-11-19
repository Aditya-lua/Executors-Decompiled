package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m9 extends z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ va f27585e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(va vaVar, q8 q8Var) {
        super(q8Var);
        Objects.requireNonNull(vaVar);
        this.f27585e = vaVar;
    }

    @Override // ob.z
    public final void a() {
        this.f27585e.r();
    }
}
