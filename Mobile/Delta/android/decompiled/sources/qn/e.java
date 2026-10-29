package qn;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class e<D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<D> f29471a;
    public final Map<String, D> b = new LinkedHashMap();

    public e(Class<D> cls) {
        this.f29471a = cls;
    }

    public void a(e<D> eVar) {
        for (Map.Entry<String, D> entry : eVar.b.entrySet()) {
            this.b.putIfAbsent(entry.getKey(), entry.getValue());
        }
    }

    public D b(String str) {
        return this.b.get(pn.c.c(str));
    }

    public Class<D> c() {
        return this.f29471a;
    }

    public D d(String str, D d10) {
        return this.b.putIfAbsent(pn.c.c(str), d10);
    }
}
