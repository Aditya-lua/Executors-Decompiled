package p471um;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p522wm.C12494c;

/* JADX INFO: renamed from: um.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C11888w {

    /* JADX INFO: renamed from: e */
    public static final List<AbstractC11873h.e> f42210e;

    /* JADX INFO: renamed from: a */
    public final List<AbstractC11873h.e> f42211a;

    /* JADX INFO: renamed from: b */
    public final int f42212b;

    /* JADX INFO: renamed from: c */
    public final ThreadLocal<d> f42213c = new ThreadLocal<>();

    /* JADX INFO: renamed from: d */
    public final Map<Object, AbstractC11873h<?>> f42214d = new LinkedHashMap();

    /* JADX INFO: renamed from: um.w$a */
    public class a implements AbstractC11873h.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Type f42215a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC11873h f42216b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(Type type, AbstractC11873h abstractC11873h) {
            this.f42215a = type;
            this.f42216b = abstractC11873h;
        }

        @Override // p471um.AbstractC11873h.e
        public AbstractC11873h<?> create(Type type, Set<? extends Annotation> set, C11888w c11888w) {
            if (set.isEmpty() && C12494c.m46810w(this.f42215a, type)) {
                return this.f42216b;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: um.w$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final List<AbstractC11873h.e> f42217a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public int f42218b = 0;

        /* JADX INFO: renamed from: a */
        public b m44442a(Object obj) {
            if (obj != null) {
                return m44444c(C11865a.m44281c(obj));
            }
            throw new IllegalArgumentException("adapter == null");
        }

        /* JADX INFO: renamed from: b */
        public <T> b m44443b(Type type, AbstractC11873h<T> abstractC11873h) {
            return m44444c(C11888w.m44435h(type, abstractC11873h));
        }

        /* JADX INFO: renamed from: c */
        public b m44444c(AbstractC11873h.e eVar) {
            if (eVar == null) {
                throw new IllegalArgumentException("factory == null");
            }
            List<AbstractC11873h.e> list = this.f42217a;
            int i10 = this.f42218b;
            this.f42218b = i10 + 1;
            list.add(i10, eVar);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C11888w m44445d() {
            return new C11888w(this);
        }
    }

    /* JADX INFO: renamed from: um.w$c */
    public static final class c<T> extends AbstractC11873h<T> {

        /* JADX INFO: renamed from: a */
        public final Type f42219a;

        /* JADX INFO: renamed from: b */
        public final String f42220b;

        /* JADX INFO: renamed from: c */
        public final Object f42221c;

        /* JADX INFO: renamed from: d */
        public AbstractC11873h<T> f42222d;

        public c(Type type, String str, Object obj) {
            this.f42219a = type;
            this.f42220b = str;
            this.f42221c = obj;
        }

        @Override // p471um.AbstractC11873h
        public T fromJson(AbstractC11878m abstractC11878m) {
            AbstractC11873h<T> abstractC11873h = this.f42222d;
            if (abstractC11873h != null) {
                return abstractC11873h.fromJson(abstractC11878m);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // p471um.AbstractC11873h
        public void toJson(AbstractC11885t abstractC11885t, T t8) {
            AbstractC11873h<T> abstractC11873h = this.f42222d;
            if (abstractC11873h == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            abstractC11873h.toJson(abstractC11885t, t8);
        }

        public String toString() {
            AbstractC11873h<T> abstractC11873h = this.f42222d;
            return abstractC11873h != null ? abstractC11873h.toString() : super.toString();
        }
    }

    /* JADX INFO: renamed from: um.w$d */
    public final class d {

        /* JADX INFO: renamed from: a */
        public final List<c<?>> f42223a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final Deque<c<?>> f42224b = new ArrayDeque();

        /* JADX INFO: renamed from: c */
        public boolean f42225c;

        public d() {
        }

        /* JADX INFO: renamed from: a */
        public <T> void m44446a(AbstractC11873h<T> abstractC11873h) {
            this.f42224b.getLast().f42222d = abstractC11873h;
        }

        /* JADX INFO: renamed from: b */
        public IllegalArgumentException m44447b(IllegalArgumentException illegalArgumentException) {
            if (!this.f42225c) {
                this.f42225c = true;
                if (this.f42224b.size() != 1 || this.f42224b.getFirst().f42220b != null) {
                    StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
                    Iterator<c<?>> itDescendingIterator = this.f42224b.descendingIterator();
                    while (itDescendingIterator.hasNext()) {
                        c<?> next = itDescendingIterator.next();
                        sb2.append("\nfor ");
                        sb2.append(next.f42219a);
                        if (next.f42220b != null) {
                            sb2.append(' ');
                            sb2.append(next.f42220b);
                        }
                    }
                    return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
                }
            }
            return illegalArgumentException;
        }

        /* JADX INFO: renamed from: c */
        public void m44448c(boolean z10) {
            this.f42224b.removeLast();
            if (this.f42224b.isEmpty()) {
                C11888w.this.f42213c.remove();
                if (z10) {
                    synchronized (C11888w.this.f42214d) {
                        try {
                            int size = this.f42223a.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                c<?> cVar = this.f42223a.get(i10);
                                AbstractC11873h<T> abstractC11873h = (AbstractC11873h) C11888w.this.f42214d.put(cVar.f42221c, cVar.f42222d);
                                if (abstractC11873h != 0) {
                                    cVar.f42222d = abstractC11873h;
                                    C11888w.this.f42214d.put(cVar.f42221c, abstractC11873h);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public <T> AbstractC11873h<T> m44449d(Type type, String str, Object obj) {
            int size = this.f42223a.size();
            for (int i10 = 0; i10 < size; i10++) {
                c<?> cVar = this.f42223a.get(i10);
                if (cVar.f42221c.equals(obj)) {
                    this.f42224b.add(cVar);
                    AbstractC11873h<T> abstractC11873h = (AbstractC11873h<T>) cVar.f42222d;
                    return abstractC11873h != null ? abstractC11873h : cVar;
                }
            }
            c<?> cVar2 = new c<>(type, str, obj);
            this.f42223a.add(cVar2);
            this.f42224b.add(cVar2);
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f42210e = arrayList;
        arrayList.add(C11890y.f42228a);
        arrayList.add(AbstractC11870e.f42097b);
        arrayList.add(C11887v.f42207c);
        arrayList.add(C11867b.f42077c);
        arrayList.add(C11889x.f42227a);
        arrayList.add(C11869d.f42090d);
    }

    public C11888w(b bVar) {
        int size = bVar.f42217a.size();
        List<AbstractC11873h.e> list = f42210e;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(bVar.f42217a);
        arrayList.addAll(list);
        this.f42211a = Collections.unmodifiableList(arrayList);
        this.f42212b = bVar.f42218b;
    }

    /* JADX INFO: renamed from: h */
    public static <T> AbstractC11873h.e m44435h(Type type, AbstractC11873h<T> abstractC11873h) {
        if (type == null) {
            throw new IllegalArgumentException("type == null");
        }
        if (abstractC11873h != null) {
            return new a(type, abstractC11873h);
        }
        throw new IllegalArgumentException("jsonAdapter == null");
    }

    /* JADX INFO: renamed from: c */
    public <T> AbstractC11873h<T> m44436c(Class<T> cls) {
        return m44438e(cls, C12494c.f44656a);
    }

    /* JADX INFO: renamed from: d */
    public <T> AbstractC11873h<T> m44437d(Type type) {
        return m44438e(type, C12494c.f44656a);
    }

    /* JADX INFO: renamed from: e */
    public <T> AbstractC11873h<T> m44438e(Type type, Set<? extends Annotation> set) {
        return m44439f(type, set, null);
    }

    /* JADX INFO: renamed from: f */
    public <T> AbstractC11873h<T> m44439f(Type type, Set<? extends Annotation> set, String str) {
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeM46803p = C12494c.m46803p(C12494c.m46788a(type));
        Object objM44440g = m44440g(typeM46803p, set);
        synchronized (this.f42214d) {
            try {
                AbstractC11873h<T> abstractC11873h = (AbstractC11873h) this.f42214d.get(objM44440g);
                if (abstractC11873h != null) {
                    return abstractC11873h;
                }
                d dVar = this.f42213c.get();
                if (dVar == null) {
                    dVar = new d();
                    this.f42213c.set(dVar);
                }
                AbstractC11873h<T> abstractC11873hM44449d = dVar.m44449d(typeM46803p, str, objM44440g);
                try {
                    if (abstractC11873hM44449d != null) {
                        dVar.m44448c(false);
                        return abstractC11873hM44449d;
                    }
                    try {
                        int size = this.f42211a.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            AbstractC11873h<T> abstractC11873h2 = (AbstractC11873h<T>) this.f42211a.get(i10).create(typeM46803p, set, this);
                            if (abstractC11873h2 != null) {
                                dVar.m44446a(abstractC11873h2);
                                dVar.m44448c(true);
                                return abstractC11873h2;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + C12494c.m46808u(typeM46803p, set));
                    } catch (IllegalArgumentException e10) {
                        throw dVar.m44447b(e10);
                    }
                } catch (Throwable th2) {
                    dVar.m44448c(false);
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final Object m44440g(Type type, Set<? extends Annotation> set) {
        return set.isEmpty() ? type : Arrays.asList(type, set);
    }

    /* JADX INFO: renamed from: i */
    public <T> AbstractC11873h<T> m44441i(AbstractC11873h.e eVar, Type type, Set<? extends Annotation> set) {
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeM46803p = C12494c.m46803p(C12494c.m46788a(type));
        int iIndexOf = this.f42211a.indexOf(eVar);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + eVar);
        }
        int size = this.f42211a.size();
        for (int i10 = iIndexOf + 1; i10 < size; i10++) {
            AbstractC11873h<T> abstractC11873h = (AbstractC11873h<T>) this.f42211a.get(i10).create(typeM46803p, set, this);
            if (abstractC11873h != null) {
                return abstractC11873h;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + C12494c.m46808u(typeM46803p, set));
    }
}
