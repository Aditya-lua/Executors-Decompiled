package um;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e<C extends Collection<T>, T> extends h<C> {
    public static final h.e b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h<T> f32387a;

    public class a implements h.e {
        @Override // um.h.e
        public h<?> create(Type type, Set<? extends Annotation> set, w wVar) {
            Class<?> clsG = a0.g(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (clsG == List.class || clsG == Collection.class) {
                return e.b(type, wVar).nullSafe();
            }
            if (clsG == Set.class) {
                return e.d(type, wVar).nullSafe();
            }
            return null;
        }
    }

    public class b extends e<Collection<T>, T> {
        public b(h hVar) {
            super(hVar, null);
        }

        @Override // um.e
        public Collection<T> c() {
            return new ArrayList();
        }

        @Override // um.h
        public /* bridge */ /* synthetic */ Object fromJson(m mVar) {
            return super.a(mVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // um.h
        public /* bridge */ /* synthetic */ void toJson(t tVar, Object obj) {
            super.e(tVar, (Collection) obj);
        }
    }

    public class c extends e<Set<T>, T> {
        public c(h hVar) {
            super(hVar, null);
        }

        @Override // um.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Set<T> c() {
            return new LinkedHashSet();
        }

        @Override // um.h
        public /* bridge */ /* synthetic */ Object fromJson(m mVar) {
            return super.a(mVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // um.h
        public /* bridge */ /* synthetic */ void toJson(t tVar, Object obj) {
            super.e(tVar, (Collection) obj);
        }
    }

    public /* synthetic */ e(h hVar, a aVar) {
        this(hVar);
    }

    public static <T> h<Collection<T>> b(Type type, w wVar) {
        return new b(wVar.d(a0.c(type, Collection.class)));
    }

    public static <T> h<Set<T>> d(Type type, w wVar) {
        return new c(wVar.d(a0.c(type, Collection.class)));
    }

    public C a(m mVar) {
        C c10 = (C) c();
        mVar.a();
        while (mVar.f()) {
            c10.add(this.f32387a.fromJson(mVar));
        }
        mVar.c();
        return c10;
    }

    public abstract C c();

    public void e(t tVar, C c10) {
        tVar.a();
        Iterator it = c10.iterator();
        while (it.hasNext()) {
            this.f32387a.toJson(tVar, (T) it.next());
        }
        tVar.e();
    }

    public String toString() {
        return this.f32387a + ".collection()";
    }

    public e(h<T> hVar) {
        this.f32387a = hVar;
    }
}
