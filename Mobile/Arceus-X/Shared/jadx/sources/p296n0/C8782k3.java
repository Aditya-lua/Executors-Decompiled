package p296n0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: n0.k3 */
/* JADX INFO: loaded from: classes.dex */
public class C8782k3 {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC8758g3> f31935a;

    public C8782k3(List<InterfaceC8758g3> list) {
        this.f31935a = new ArrayList(list);
    }

    /* JADX INFO: renamed from: d */
    public static String m35232d(C8782k3 c8782k3) {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC8758g3> it = c8782k3.f31935a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getClass().getSimpleName());
        }
        return String.join(" | ", arrayList);
    }

    /* JADX INFO: renamed from: a */
    public boolean m35233a(Class<? extends InterfaceC8758g3> cls) {
        Iterator<InterfaceC8758g3> it = this.f31935a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next().getClass())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public <T extends InterfaceC8758g3> T m35234b(Class<T> cls) {
        Iterator<InterfaceC8758g3> it = this.f31935a.iterator();
        while (it.hasNext()) {
            T t8 = (T) it.next();
            if (t8.getClass() == cls) {
                return t8;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public <T extends InterfaceC8758g3> List<T> m35235c(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC8758g3 interfaceC8758g3 : this.f31935a) {
            if (cls.isAssignableFrom(interfaceC8758g3.getClass())) {
                arrayList.add(interfaceC8758g3);
            }
        }
        return arrayList;
    }
}
