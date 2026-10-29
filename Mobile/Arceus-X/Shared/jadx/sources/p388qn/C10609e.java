package p388qn;

import java.util.LinkedHashMap;
import java.util.Map;
import pn.C10297c;

/* JADX INFO: renamed from: qn.e */
/* JADX INFO: loaded from: classes3.dex */
public class C10609e<D> {

    /* JADX INFO: renamed from: a */
    public final Class<D> f38068a;

    /* JADX INFO: renamed from: b */
    public final Map<String, D> f38069b = new LinkedHashMap();

    public C10609e(Class<D> cls) {
        this.f38068a = cls;
    }

    /* JADX INFO: renamed from: a */
    public void m40667a(C10609e<D> c10609e) {
        for (Map.Entry<String, D> entry : c10609e.f38069b.entrySet()) {
            this.f38069b.putIfAbsent(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: b */
    public D m40668b(String str) {
        return this.f38069b.get(C10297c.m39563c(str));
    }

    /* JADX INFO: renamed from: c */
    public Class<D> m40669c() {
        return this.f38068a;
    }

    /* JADX INFO: renamed from: d */
    public D m40670d(String str, D d10) {
        return this.f38069b.putIfAbsent(C10297c.m39563c(str), d10);
    }
}
