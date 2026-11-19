package og;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import lg.a0;
import lg.b0;
import lg.r;
import lg.u;
import ng.d0;
import ng.h0;
import ng.v;
import ng.x;
import ng.z;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f28149a;
    public final boolean b;

    public final class a<K, V> extends a0<Map<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a0<K> f28150a;
        public final a0<V> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d0<? extends Map<K, V>> f28151c;

        public a(a0<K> a0Var, a0<V> a0Var2, d0<? extends Map<K, V>> d0Var) {
            this.f28150a = a0Var;
            this.b = a0Var2;
            this.f28151c = d0Var;
        }

        public final String a(lg.l lVar) {
            if (!lVar.t()) {
                if (lVar.n()) {
                    return "null";
                }
                throw new AssertionError();
            }
            r rVarH = lVar.h();
            if (rVarH.C()) {
                return String.valueOf(rVarH.j());
            }
            if (rVarH.A()) {
                return Boolean.toString(rVarH.b());
            }
            if (rVarH.D()) {
                return rVarH.l();
            }
            throw new AssertionError();
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map<K, V> read(tg.a aVar) throws IOException {
            tg.b bVarQ = aVar.Q();
            if (bVarQ == tg.b.NULL) {
                aVar.K();
                return null;
            }
            Map<K, V> mapA = this.f28151c.a();
            if (bVarQ != tg.b.BEGIN_ARRAY) {
                aVar.c();
                while (aVar.p()) {
                    z.f25584a.a(aVar);
                    K k10 = this.f28150a.read(aVar);
                    if (mapA.put(k10, this.b.read(aVar)) != null) {
                        throw new u("duplicate key: " + k10);
                    }
                }
                aVar.h();
                return mapA;
            }
            aVar.b();
            while (aVar.p()) {
                aVar.b();
                K k11 = this.f28150a.read(aVar);
                if (mapA.put(k11, this.b.read(aVar)) != null) {
                    throw new u("duplicate key: " + k11);
                }
                aVar.g();
            }
            aVar.g();
            return mapA;
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, Map<K, V> map) throws IOException {
            if (map == null) {
                cVar.s();
                return;
            }
            if (!i.this.b) {
                cVar.e();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.p(String.valueOf(entry.getKey()));
                    this.b.write(cVar, entry.getValue());
                }
                cVar.h();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                lg.l jsonTree = this.f28150a.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                z10 |= jsonTree.m() || jsonTree.q();
            }
            if (!z10) {
                cVar.e();
                int size = arrayList.size();
                while (i10 < size) {
                    cVar.p(a((lg.l) arrayList.get(i10)));
                    this.b.write(cVar, (V) arrayList2.get(i10));
                    i10++;
                }
                cVar.h();
                return;
            }
            cVar.d();
            int size2 = arrayList.size();
            while (i10 < size2) {
                cVar.d();
                h0.b((lg.l) arrayList.get(i10), cVar);
                this.b.write(cVar, (V) arrayList2.get(i10));
                cVar.g();
                i10++;
            }
            cVar.g();
        }
    }

    public i(v vVar, boolean z10) {
        this.f28149a = vVar;
        this.b = z10;
    }

    public final a0<?> a(lg.f fVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? p.f28198f : fVar.m(sg.a.b(type));
    }

    @Override // lg.b0
    public <T> a0<T> create(lg.f fVar, sg.a<T> aVar) {
        Type typeD = aVar.d();
        Class<? super T> clsC = aVar.c();
        if (!Map.class.isAssignableFrom(clsC)) {
            return null;
        }
        Type[] typeArrJ = x.j(typeD, clsC);
        Type type = typeArrJ[0];
        Type type2 = typeArrJ[1];
        return new a(new o(fVar, a(fVar, type), type), new o(fVar, fVar.m(sg.a.b(type2)), type2), this.f28149a.w(aVar, false));
    }
}
