package ig;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import lf.d;
import lf.g;
import lf.i;

/* JADX INFO: loaded from: classes2.dex */
public class b implements i {
    public static /* synthetic */ Object b(String str, lf.c cVar, d dVar) {
        try {
            c.b(str);
            return cVar.h().create(dVar);
        } finally {
            c.a();
        }
    }

    @Override // lf.i
    public List<lf.c<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final lf.c<?> cVarR : componentRegistrar.getComponents()) {
            final String strI = cVarR.i();
            if (strI != null) {
                cVarR = cVarR.r(new g() { // from class: ig.a
                    @Override // lf.g
                    public final Object create(d dVar) {
                        return b.b(strI, cVarR, dVar);
                    }
                });
            }
            arrayList.add(cVarR);
        }
        return arrayList;
    }
}
