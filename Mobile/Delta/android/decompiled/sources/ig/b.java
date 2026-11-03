package ig;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import mf.d;
import mf.g;
import mf.i;

/* JADX INFO: loaded from: classes2.dex */
public class b implements i {
    public static /* synthetic */ Object b(String str, mf.c cVar, d dVar) {
        try {
            c.b(str);
            return cVar.h().create(dVar);
        } finally {
            c.a();
        }
    }

    @Override // mf.i
    public List<mf.c<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final mf.c<?> cVarR : componentRegistrar.getComponents()) {
            final String strI = cVarR.i();
            if (strI != null) {
                cVarR = cVarR.r(new g() { // from class: ig.a
                    @Override // mf.g
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
