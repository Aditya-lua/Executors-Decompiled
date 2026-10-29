package fb;

import android.app.Application;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f16559a = new AtomicReference();

    public static m a(Application application) {
        AtomicReference atomicReference = f16559a;
        m mVar = (m) atomicReference.get();
        if (mVar != null) {
            return mVar;
        }
        k1 k1VarA = p1.a();
        k1VarA.a(9);
        k1VarA.b(application.getPackageName());
        p1 p1VarC = k1VarA.c();
        ga.o oVarA = ga.o.a(application);
        p1.t.a(atomicReference, null, new b0(application, oVarA, com.google.android.gms.games.internal.v2.resolution.a.a(), new f0(application, oVarA, new n(application, p1VarC))));
        return (m) n9.m.l((m) atomicReference.get());
    }
}
