package hn;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class v<K, V> extends h<Map<K, V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h.e f18426c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h<K> f18427a;
    public final h<V> b;

    public class a implements h.e {
        @Override // hn.h.e
        public h<?> create(Type type, Set<? extends Annotation> set, w wVar) {
            Class<?> clsG;
            if (!set.isEmpty() || (clsG = a0.g(type)) != Map.class) {
                return null;
            }
            Type[] typeArrI = a0.i(type, clsG);
            return new v(wVar, typeArrI[0], typeArrI[1]).nullSafe();
        }
    }

    public v(w wVar, Type type, Type type2) {
        this.f18427a = wVar.d(type);
        this.b = wVar.d(type2);
    }

    @Override // hn.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map<K, V> fromJson(m mVar) {
        u uVar = new u();
        mVar.b();
        while (mVar.f()) {
            mVar.z();
            K kFromJson = this.f18427a.fromJson(mVar);
            V vFromJson = this.b.fromJson(mVar);
            V vPut = uVar.put(kFromJson, vFromJson);
            if (vPut != null) {
                throw new j("Map key '" + kFromJson + "' has multiple values at path " + mVar.x() + ": " + vPut + " and " + vFromJson);
            }
        }
        mVar.d();
        return uVar;
    }

    @Override // hn.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(t tVar, Map<K, V> map) {
        tVar.c();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                throw new j("Map key is null at " + tVar.x());
            }
            tVar.u();
            this.f18427a.toJson(tVar, entry.getKey());
            this.b.toJson(tVar, entry.getValue());
        }
        tVar.g();
    }

    public String toString() {
        return "JsonAdapter(" + this.f18427a + "=" + this.b + ")";
    }
}
