package p219jg;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p292mf.C8492c;
import p292mf.InterfaceC8494d;
import p292mf.InterfaceC8500g;
import p292mf.InterfaceC8502i;

/* JADX INFO: renamed from: jg.b */
/* JADX INFO: loaded from: classes2.dex */
public class C7153b implements InterfaceC8502i {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m29952b(String str, C8492c c8492c, InterfaceC8494d interfaceC8494d) {
        try {
            C7154c.m29955b(str);
            return c8492c.m34282h().create(interfaceC8494d);
        } finally {
            C7154c.m29954a();
        }
    }

    @Override // p292mf.InterfaceC8502i
    /* JADX INFO: renamed from: a */
    public List<C8492c<?>> mo29953a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C8492c<?> c8492cM34289r : componentRegistrar.getComponents()) {
            final String strM34283i = c8492cM34289r.m34283i();
            if (strM34283i != null) {
                c8492cM34289r = c8492cM34289r.m34289r(new InterfaceC8500g() { // from class: jg.a
                    @Override // p292mf.InterfaceC8500g
                    public final Object create(InterfaceC8494d interfaceC8494d) {
                        return C7153b.m29952b(strM34283i, c8492cM34289r, interfaceC8494d);
                    }
                });
            }
            arrayList.add(c8492cM34289r);
        }
        return arrayList;
    }
}
