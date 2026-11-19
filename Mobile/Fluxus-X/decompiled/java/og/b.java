package og;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import lg.a0;
import lg.b0;
import ng.d0;
import ng.v;
import ng.x;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f28124a;

    public static final class a<E> extends a0<Collection<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a0<E> f28125a;
        public final d0<? extends Collection<E>> b;

        public a(a0<E> a0Var, d0<? extends Collection<E>> d0Var) {
            this.f28125a = a0Var;
            this.b = d0Var;
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<E> read(tg.a aVar) throws IOException {
            if (aVar.Q() == tg.b.NULL) {
                aVar.K();
                return null;
            }
            Collection<E> collectionA = this.b.a();
            aVar.b();
            while (aVar.p()) {
                collectionA.add(this.f28125a.read(aVar));
            }
            aVar.g();
            return collectionA;
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.s();
                return;
            }
            cVar.d();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f28125a.write(cVar, it.next());
            }
            cVar.g();
        }
    }

    public b(v vVar) {
        this.f28124a = vVar;
    }

    @Override // lg.b0
    public <T> a0<T> create(lg.f fVar, sg.a<T> aVar) {
        Type typeD = aVar.d();
        Class<? super T> clsC = aVar.c();
        if (!Collection.class.isAssignableFrom(clsC)) {
            return null;
        }
        Type typeH = x.h(typeD, clsC);
        return new a(new o(fVar, fVar.m(sg.a.b(typeH)), typeH), this.f28124a.w(aVar, false));
    }
}
