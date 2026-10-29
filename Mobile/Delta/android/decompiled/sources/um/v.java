package um;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class v<K, V> extends h<Map<K, V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h.e f32481c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h<K> f32482a;
    public final h<V> b;

    public class a implements h.e {
        @Override // um.h.e
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
        this.f32482a = wVar.d(type);
        this.b = wVar.d(type2);
    }

    @Override // um.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map<K, V> fromJson(m mVar) {
        u uVar = new u();
        mVar.b();
        while (mVar.f()) {
            mVar.w();
            K kFromJson = this.f32482a.fromJson(mVar);
            V vFromJson = this.b.fromJson(mVar);
            V vPut = uVar.put(kFromJson, vFromJson);
            if (vPut != null) {
                throw new j("Map key '" + kFromJson + "' has multiple values at path " + mVar.getPath() + ": " + vPut + " and " + vFromJson);
            }
        }
        mVar.d();
        return uVar;
    }

    @Override // um.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(t tVar, Map<K, V> map) {
        tVar.c();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                throw new j("Map key is null at " + tVar.getPath());
            }
            tVar.s();
            this.f32482a.toJson(tVar, entry.getKey());
            this.b.toJson(tVar, entry.getValue());
        }
        tVar.g();
    }

    public String toString() {
        return "JsonAdapter(" + this.f32482a + "=" + this.b + ")";
    }
}
