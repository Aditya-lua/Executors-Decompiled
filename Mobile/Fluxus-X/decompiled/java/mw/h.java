package mw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List<h> f24853d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f24854a;
    public n b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f24855c;

    public h(Object obj, n nVar) {
        this.f24854a = obj;
        this.b = nVar;
    }

    public static h a(n nVar, Object obj) {
        List<h> list = f24853d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new h(obj, nVar);
                }
                h hVarRemove = list.remove(size - 1);
                hVarRemove.f24854a = obj;
                hVarRemove.b = nVar;
                hVarRemove.f24855c = null;
                return hVarRemove;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(h hVar) {
        hVar.f24854a = null;
        hVar.b = null;
        hVar.f24855c = null;
        List<h> list = f24853d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(hVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
