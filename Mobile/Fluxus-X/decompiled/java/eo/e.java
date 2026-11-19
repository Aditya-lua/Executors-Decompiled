package eo;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class e<D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<D> f13844a;
    public final Map<String, D> b = new LinkedHashMap();

    public e(Class<D> cls) {
        this.f13844a = cls;
    }

    public void a(e<D> eVar) {
        for (Map.Entry<String, D> entry : eVar.b.entrySet()) {
            this.b.putIfAbsent(entry.getKey(), entry.getValue());
        }
    }

    public D b(String str) {
        return this.b.get(co.c.c(str));
    }

    public Class<D> c() {
        return this.f13844a;
    }

    public D d(String str, D d10) {
        return this.b.putIfAbsent(co.c.c(str), d10);
    }
}
