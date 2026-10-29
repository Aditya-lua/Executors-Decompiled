package p312nn;

import java.util.HashMap;
import java.util.Map;
import p388qn.C10609e;

/* JADX INFO: renamed from: nn.f */
/* JADX INFO: loaded from: classes3.dex */
public class C9504f {

    /* JADX INFO: renamed from: a */
    public final Map<Class<?>, C10609e<?>> f34201a = new HashMap();

    /* JADX INFO: renamed from: a */
    public <D> void m37472a(C10609e<D> c10609e) {
        C10609e c10609eM37474c = m37474c(c10609e.m40669c());
        if (c10609eM37474c == null) {
            this.f34201a.put(c10609e.m40669c(), c10609e);
        } else {
            c10609eM37474c.m40667a(c10609e);
        }
    }

    /* JADX INFO: renamed from: b */
    public <V> V m37473b(Class<V> cls, String str) {
        C10609e<V> c10609eM37474c = m37474c(cls);
        if (c10609eM37474c == null) {
            return null;
        }
        return c10609eM37474c.m40668b(str);
    }

    /* JADX INFO: renamed from: c */
    public final <V> C10609e<V> m37474c(Class<V> cls) {
        return (C10609e) this.f34201a.get(cls);
    }
}
