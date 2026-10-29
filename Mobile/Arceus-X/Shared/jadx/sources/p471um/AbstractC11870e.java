package p471um;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: um.e */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11870e<C extends Collection<T>, T> extends AbstractC11873h<C> {

    /* JADX INFO: renamed from: b */
    public static final AbstractC11873h.e f42097b = new a();

    /* JADX INFO: renamed from: a */
    public final AbstractC11873h<T> f42098a;

    /* JADX INFO: renamed from: um.e$a */
    public class a implements AbstractC11873h.e {
        @Override // p471um.AbstractC11873h.e
        public AbstractC11873h<?> create(Type type, Set<? extends Annotation> set, C11888w c11888w) {
            Class<?> clsM44295g = C11866a0.m44295g(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (clsM44295g == List.class || clsM44295g == Collection.class) {
                return AbstractC11870e.m44308b(type, c11888w).nullSafe();
            }
            if (clsM44295g == Set.class) {
                return AbstractC11870e.m44309d(type, c11888w).nullSafe();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: um.e$b */
    public class b extends AbstractC11870e<Collection<T>, T> {
        public b(AbstractC11873h abstractC11873h) {
            super(abstractC11873h, null);
        }

        @Override // p471um.AbstractC11870e
        /* JADX INFO: renamed from: c */
        public Collection<T> mo44311c() {
            return new ArrayList();
        }

        @Override // p471um.AbstractC11873h
        public /* bridge */ /* synthetic */ Object fromJson(AbstractC11878m abstractC11878m) {
            return super.m44310a(abstractC11878m);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: um.e$b */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p471um.AbstractC11873h
        public /* bridge */ /* synthetic */ void toJson(AbstractC11885t abstractC11885t, Object obj) {
            super.m44312e(abstractC11885t, (Collection) obj);
        }
    }

    /* JADX INFO: renamed from: um.e$c */
    public class c extends AbstractC11870e<Set<T>, T> {
        public c(AbstractC11873h abstractC11873h) {
            super(abstractC11873h, null);
        }

        /* JADX DEBUG: Method merged with bridge method: c()Ljava/util/Collection; */
        @Override // p471um.AbstractC11870e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Set<T> mo44311c() {
            return new LinkedHashSet();
        }

        @Override // p471um.AbstractC11873h
        public /* bridge */ /* synthetic */ Object fromJson(AbstractC11878m abstractC11878m) {
            return super.m44310a(abstractC11878m);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: um.e$c */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p471um.AbstractC11873h
        public /* bridge */ /* synthetic */ void toJson(AbstractC11885t abstractC11885t, Object obj) {
            super.m44312e(abstractC11885t, (Collection) obj);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 um.h) A[MD:(um.h<T>):void (m)] (LINE:1) call: um.e.<init>(um.h):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC11870e(AbstractC11873h abstractC11873h, a aVar) {
        this(abstractC11873h);
    }

    /* JADX INFO: renamed from: b */
    public static <T> AbstractC11873h<Collection<T>> m44308b(Type type, C11888w c11888w) {
        return new b(c11888w.m44437d(C11866a0.m44291c(type, Collection.class)));
    }

    /* JADX INFO: renamed from: d */
    public static <T> AbstractC11873h<Set<T>> m44309d(Type type, C11888w c11888w) {
        return new c(c11888w.m44437d(C11866a0.m44291c(type, Collection.class)));
    }

    /* JADX INFO: renamed from: a */
    public C m44310a(AbstractC11878m abstractC11878m) {
        C c10 = (C) mo44311c();
        abstractC11878m.mo44324a();
        while (abstractC11878m.mo44329f()) {
            c10.add(this.f42098a.fromJson(abstractC11878m));
        }
        abstractC11878m.mo44326c();
        return c10;
    }

    /* JADX INFO: renamed from: c */
    public abstract C mo44311c();

    /* JADX INFO: renamed from: e */
    public void m44312e(AbstractC11885t abstractC11885t, C c10) {
        abstractC11885t.mo44371a();
        Iterator it = c10.iterator();
        while (it.hasNext()) {
            this.f42098a.toJson(abstractC11885t, (T) it.next());
        }
        abstractC11885t.mo44375e();
    }

    public String toString() {
        return this.f42098a + ".collection()";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC11870e(AbstractC11873h<T> abstractC11873h) {
        this.f42098a = abstractC11873h;
    }
}
