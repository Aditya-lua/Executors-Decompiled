package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class d<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Executor f2984h = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.b f2985a;
    public final androidx.recyclerview.widget.c<T> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Executor f2986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<b<T>> f2987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<T> f2988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public List<T> f2989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2990g;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f2991a;
        public final /* synthetic */ List b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f2992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Runnable f2993d;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        public class C0049a extends g.b {
            public C0049a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.g.b
            public boolean a(int i10, int i11) {
                Object obj = a.this.f2991a.get(i10);
                Object obj2 = a.this.b.get(i11);
                if (obj != null && obj2 != null) {
                    return d.this.b.b().a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.g.b
            public boolean b(int i10, int i11) {
                Object obj = a.this.f2991a.get(i10);
                Object obj2 = a.this.b.get(i11);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return d.this.b.b().b(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.g.b
            public Object c(int i10, int i11) {
                Object obj = a.this.f2991a.get(i10);
                Object obj2 = a.this.b.get(i11);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return d.this.b.b().c(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.g.b
            public int d() {
                return a.this.b.size();
            }

            @Override // androidx.recyclerview.widget.g.b
            public int e() {
                return a.this.f2991a.size();
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g.e f2996a;

            public b(g.e eVar) {
                this.f2996a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f2990g == aVar.f2992c) {
                    dVar.b(aVar.b, this.f2996a, aVar.f2993d);
                }
            }
        }

        public a(List list, List list2, int i10, Runnable runnable) {
            this.f2991a = list;
            this.b = list2;
            this.f2992c = i10;
            this.f2993d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f2986c.execute(new b(g.b(new C0049a())));
        }
    }

    public interface b<T> {
        void a(@NonNull List<T> list, @NonNull List<T> list2);
    }

    public static class c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f2997a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.f2997a.post(runnable);
        }
    }

    public d(@NonNull RecyclerView.h hVar, @NonNull g.f<T> fVar) {
        this(new androidx.recyclerview.widget.b(hVar), new androidx.recyclerview.widget.c.a(fVar).a());
    }

    @NonNull
    public List<T> a() {
        return this.f2989f;
    }

    public void b(@NonNull List<T> list, @NonNull g.e eVar, Runnable runnable) {
        List<T> list2 = this.f2989f;
        this.f2988e = list;
        this.f2989f = Collections.unmodifiableList(list);
        eVar.c(this.f2985a);
        c(list2, runnable);
    }

    public final void c(@NonNull List<T> list, Runnable runnable) {
        Iterator<b<T>> it = this.f2987d.iterator();
        while (it.hasNext()) {
            it.next().a(list, this.f2989f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d(List<T> list) {
        e(list, null);
    }

    public void e(List<T> list, Runnable runnable) {
        int i10 = this.f2990g + 1;
        this.f2990g = i10;
        List<T> list2 = this.f2988e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f2989f;
        if (list == null) {
            int size = list2.size();
            this.f2988e = null;
            this.f2989f = Collections.EMPTY_LIST;
            this.f2985a.b(0, size);
            c(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.b.a().execute(new a(list2, list, i10, runnable));
            return;
        }
        this.f2988e = list;
        this.f2989f = Collections.unmodifiableList(list);
        this.f2985a.a(0, list.size());
        c(list3, runnable);
    }

    public d(@NonNull w4.b bVar, @NonNull androidx.recyclerview.widget.c<T> cVar) {
        this.f2987d = new CopyOnWriteArrayList();
        this.f2989f = Collections.EMPTY_LIST;
        this.f2985a = bVar;
        this.b = cVar;
        if (cVar.c() != null) {
            this.f2986c = cVar.c();
        } else {
            this.f2986c = f2984h;
        }
    }
}
