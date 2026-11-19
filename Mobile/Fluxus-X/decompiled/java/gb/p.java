package gb;

import android.app.Application;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f17654a = new AtomicReference();

    public static n a(Application application) {
        AtomicReference atomicReference = f17654a;
        n nVar = (n) atomicReference.get();
        if (nVar != null) {
            return nVar;
        }
        l1 l1VarA = q1.a();
        l1VarA.a(9);
        l1VarA.b(application.getPackageName());
        q1 q1VarC = l1VarA.c();
        ha.o oVarA = ha.o.a(application);
        p1.t.a(atomicReference, null, new c0(application, oVarA, ma.b.a(), new g0(application, oVarA, new o(application, q1VarC))));
        return (n) o9.s.l((n) atomicReference.get());
    }
}
