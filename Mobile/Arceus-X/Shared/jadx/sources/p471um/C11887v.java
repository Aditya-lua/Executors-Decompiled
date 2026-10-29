package p471um;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: um.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C11887v<K, V> extends AbstractC11873h<Map<K, V>> {

    /* JADX INFO: renamed from: c */
    public static final AbstractC11873h.e f42207c = new a();

    /* JADX INFO: renamed from: a */
    public final AbstractC11873h<K> f42208a;

    /* JADX INFO: renamed from: b */
    public final AbstractC11873h<V> f42209b;

    /* JADX INFO: renamed from: um.v$a */
    public class a implements AbstractC11873h.e {
        @Override // p471um.AbstractC11873h.e
        public AbstractC11873h<?> create(Type type, Set<? extends Annotation> set, C11888w c11888w) {
            Class<?> clsM44295g;
            if (!set.isEmpty() || (clsM44295g = C11866a0.m44295g(type)) != Map.class) {
                return null;
            }
            Type[] typeArrM44297i = C11866a0.m44297i(type, clsM44295g);
            return new C11887v(c11888w, typeArrM44297i[0], typeArrM44297i[1]).nullSafe();
        }
    }

    public C11887v(C11888w c11888w, Type type, Type type2) {
        this.f42208a = c11888w.m44437d(type);
        this.f42209b = c11888w.m44437d(type2);
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    @Override // p471um.AbstractC11873h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map<K, V> fromJson(AbstractC11878m abstractC11878m) {
        C11886u c11886u = new C11886u();
        abstractC11878m.mo44325b();
        while (abstractC11878m.mo44329f()) {
            abstractC11878m.mo44341w();
            K kFromJson = this.f42208a.fromJson(abstractC11878m);
            V vFromJson = this.f42209b.fromJson(abstractC11878m);
            V vPut = c11886u.put(kFromJson, vFromJson);
            if (vPut != null) {
                throw new C11875j("Map key '" + kFromJson + "' has multiple values at path " + abstractC11878m.getPath() + ": " + vPut + " and " + vFromJson);
            }
        }
        abstractC11878m.mo44327d();
        return c11886u;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(AbstractC11885t abstractC11885t, Map<K, V> map) {
        abstractC11885t.mo44374c();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                throw new C11875j("Map key is null at " + abstractC11885t.getPath());
            }
            abstractC11885t.m44404s();
            this.f42208a.toJson(abstractC11885t, entry.getKey());
            this.f42209b.toJson(abstractC11885t, entry.getValue());
        }
        abstractC11885t.mo44378g();
    }

    public String toString() {
        return "JsonAdapter(" + this.f42208a + "=" + this.f42209b + ")";
    }
}
