package et;

import android.util.Log;
import androidx.fragment.app.c;
import dt.d;
import e4.q;
import ft.h;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static d a(c cVar) {
        c cVarK = cVar;
        do {
            cVarK = cVarK.K();
            if (cVarK == 0) {
                q qVarP = cVar.p();
                if (qVarP instanceof d) {
                    return (d) qVarP;
                }
                if (qVarP.getApplication() instanceof d) {
                    return (d) qVarP.getApplication();
                }
                throw new IllegalArgumentException(String.format("No injector was found for %s", cVar.getClass().getCanonicalName()));
            }
        } while (!(cVarK instanceof d));
        return (d) cVarK;
    }

    public static void b(c cVar) {
        h.c(cVar, "fragment");
        d dVarA = a(cVar);
        if (Log.isLoggable("dagger.android.support", 3)) {
            Log.d("dagger.android.support", String.format("An injector for %s was found in %s", cVar.getClass().getCanonicalName(), dVarA.getClass().getCanonicalName()));
        }
        c(cVar, dVarA);
    }

    public static void c(Object obj, d dVar) {
        dt.a<Object> aVarC = dVar.c();
        h.d(aVarC, "%s.androidInjector() returned null", dVar.getClass());
        aVarC.a(obj);
    }
}
