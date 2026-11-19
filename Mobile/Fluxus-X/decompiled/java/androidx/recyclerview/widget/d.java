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
    public static final Executor f2686h = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x4.b f2687a;
    public final androidx.recyclerview.widget.c<T> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Executor f2688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<b<T>> f2689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<T> f2690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public List<T> f2691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2692g;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f2693a;
        public final /* synthetic */ List b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f2694c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Runnable f2695d;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        public class C0057a extends g.b {
            public C0057a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.g.b
            public boolean a(int i10, int i11) {
                Object obj = a.this.f2693a.get(i10);
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
                Object obj = a.this.f2693a.get(i10);
                Object obj2 = a.this.b.get(i11);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return d.this.b.b().b(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.g.b
            public Object c(int i10, int i11) {
                Object obj = a.this.f2693a.get(i10);
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
                return a.this.f2693a.size();
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g.e f2698a;

            public b(g.e eVar) {
                this.f2698a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f2692g == aVar.f2694c) {
                    dVar.b(aVar.b, this.f2698a, aVar.f2695d);
                }
            }
        }

        public a(List list, List list2, int i10, Runnable runnable) {
            this.f2693a = list;
            this.b = list2;
            this.f2694c = i10;
            this.f2695d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f2688c.execute(new b(g.b(new C0057a())));
        }
    }

    public interface b<T> {
        void a(@NonNull List<T> list, @NonNull List<T> list2);
    }

    public static class c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f2699a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.f2699a.post(runnable);
        }
    }

    public d(@NonNull RecyclerView.h hVar, @NonNull g.f<T> fVar) {
        this(new androidx.recyclerview.widget.b(hVar), new androidx.recyclerview.widget.c.a(fVar).a());
    }

    @NonNull
    public List<T> a() {
        return this.f2691f;
    }

    public void b(@NonNull List<T> list, @NonNull g.e eVar, Runnable runnable) {
        List<T> list2 = this.f2691f;
        this.f2690e = list;
        this.f2691f = Collections.unmodifiableList(list);
        eVar.c(this.f2687a);
        c(list2, runnable);
    }

    public final void c(@NonNull List<T> list, Runnable runnable) {
        Iterator<b<T>> it = this.f2689d.iterator();
        while (it.hasNext()) {
            it.next().a(list, this.f2691f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d(List<T> list) {
        e(list, null);
    }

    public void e(List<T> list, Runnable runnable) {
        int i10 = this.f2692g + 1;
        this.f2692g = i10;
        List<T> list2 = this.f2690e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f2691f;
        if (list == null) {
            int size = list2.size();
            this.f2690e = null;
            this.f2691f = Collections.EMPTY_LIST;
            this.f2687a.b(0, size);
            c(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.b.a().execute(new a(list2, list, i10, runnable));
            return;
        }
        this.f2690e = list;
        this.f2691f = Collections.unmodifiableList(list);
        this.f2687a.a(0, list.size());
        c(list3, runnable);
    }

    public d(@NonNull x4.b bVar, @NonNull androidx.recyclerview.widget.c<T> cVar) {
        this.f2689d = new CopyOnWriteArrayList();
        this.f2691f = Collections.EMPTY_LIST;
        this.f2687a = bVar;
        this.b = cVar;
        if (cVar.c() != null) {
            this.f2688c = cVar.c();
        } else {
            this.f2688c = f2686h;
        }
    }
}
