package p138fv;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: fv.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C5845h {

    /* JADX INFO: renamed from: d */
    public static final List<C5845h> f22290d = new ArrayList();

    /* JADX INFO: renamed from: a */
    public Object f22291a;

    /* JADX INFO: renamed from: b */
    public C5851n f22292b;

    /* JADX INFO: renamed from: c */
    public C5845h f22293c;

    public C5845h(Object obj, C5851n c5851n) {
        this.f22291a = obj;
        this.f22292b = c5851n;
    }

    /* JADX INFO: renamed from: a */
    public static C5845h m26222a(C5851n c5851n, Object obj) {
        List<C5845h> list = f22290d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new C5845h(obj, c5851n);
                }
                C5845h c5845hRemove = list.remove(size - 1);
                c5845hRemove.f22291a = obj;
                c5845hRemove.f22292b = c5851n;
                c5845hRemove.f22293c = null;
                return c5845hRemove;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m26223b(C5845h c5845h) {
        c5845h.f22291a = null;
        c5845h.f22292b = null;
        c5845h.f22293c = null;
        List<C5845h> list = f22290d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(c5845h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
