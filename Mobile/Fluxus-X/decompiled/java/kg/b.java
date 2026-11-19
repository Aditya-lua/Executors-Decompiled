package kg;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import of.d;
import of.g;
import of.i;

/* JADX INFO: loaded from: classes2.dex */
public class b implements i {
    public static /* synthetic */ Object b(String str, of.c cVar, d dVar) {
        try {
            c.b(str);
            return cVar.h().create(dVar);
        } finally {
            c.a();
        }
    }

    @Override // of.i
    public List<of.c<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final of.c<?> cVarR : componentRegistrar.getComponents()) {
            final String strI = cVarR.i();
            if (strI != null) {
                cVarR = cVarR.r(new g() { // from class: kg.a
                    @Override // of.g
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
