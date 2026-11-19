package vt;

import android.util.Log;
import f4.q;
import f4.v;
import ut.d;
import wt.h;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static d a(q qVar) {
        q qVarJ = qVar;
        do {
            qVarJ = qVarJ.J();
            if (qVarJ == 0) {
                v vVarP = qVar.p();
                if (vVarP instanceof d) {
                    return (d) vVarP;
                }
                if (vVarP.getApplication() instanceof d) {
                    return (d) vVarP.getApplication();
                }
                throw new IllegalArgumentException(String.format("No injector was found for %s", qVar.getClass().getCanonicalName()));
            }
        } while (!(qVarJ instanceof d));
        return (d) qVarJ;
    }

    public static void b(q qVar) {
        h.c(qVar, "fragment");
        d dVarA = a(qVar);
        if (Log.isLoggable("dagger.android.support", 3)) {
            Log.d("dagger.android.support", String.format("An injector for %s was found in %s", qVar.getClass().getCanonicalName(), dVarA.getClass().getCanonicalName()));
        }
        c(qVar, dVarA);
    }

    public static void c(Object obj, d dVar) {
        ut.a<Object> aVarC = dVar.c();
        h.d(aVarC, "%s.androidInjector() returned null", dVar.getClass());
        aVarC.a(obj);
    }
}
