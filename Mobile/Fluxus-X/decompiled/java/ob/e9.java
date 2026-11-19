package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e9 extends z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ va f27295e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(va vaVar, q8 q8Var) {
        super(q8Var);
        Objects.requireNonNull(vaVar);
        this.f27295e = vaVar;
    }

    @Override // ob.z
    public final void a() {
        final va vaVarB = this.f27295e.f27641a.B();
        Objects.requireNonNull(vaVarB);
        new Thread(new Runnable() { // from class: ob.d9
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                vaVarB.u0();
            }
        }).start();
    }
}
