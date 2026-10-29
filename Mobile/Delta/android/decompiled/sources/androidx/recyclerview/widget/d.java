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
    public static final Executor f3139h = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.b f3140a;
    public final androidx.recyclerview.widget.c<T> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Executor f3141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<b<T>> f3142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<T> f3143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public List<T> f3144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3145g;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f3146a;
        public final /* synthetic */ List b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f3147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Runnable f3148d;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        public class C0053a extends g.b {
            public C0053a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.g.b
            public boolean a(int i10, int i11) {
                Object obj = a.this.f3146a.get(i10);
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
                Object obj = a.this.f3146a.get(i10);
                Object obj2 = a.this.b.get(i11);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return d.this.b.b().b(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.g.b
            public Object c(int i10, int i11) {
                Object obj = a.this.f3146a.get(i10);
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
                return a.this.f3146a.size();
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g.e f3151a;

            public b(g.e eVar) {
                this.f3151a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f3145g == aVar.f3147c) {
                    dVar.b(aVar.b, this.f3151a, aVar.f3148d);
                }
            }
        }

        public a(List list, List list2, int i10, Runnable runnable) {
            this.f3146a = list;
            this.b = list2;
            this.f3147c = i10;
            this.f3148d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f3141c.execute(new b(g.b(new C0053a())));
        }
    }

    public interface b<T> {
        void a(@NonNull List<T> list, @NonNull List<T> list2);
    }

    public static class c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f3152a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.f3152a.post(runnable);
        }
    }

    public d(@NonNull RecyclerView.h hVar, @NonNull g.f<T> fVar) {
        this(new androidx.recyclerview.widget.b(hVar), new androidx.recyclerview.widget.c.a(fVar).a());
    }

    @NonNull
    public List<T> a() {
        return this.f3144f;
    }

    public void b(@NonNull List<T> list, @NonNull g.e eVar, Runnable runnable) {
        List<T> list2 = this.f3144f;
        this.f3143e = list;
        this.f3144f = Collections.unmodifiableList(list);
        eVar.c(this.f3140a);
        c(list2, runnable);
    }

    public final void c(@NonNull List<T> list, Runnable runnable) {
        Iterator<b<T>> it = this.f3142d.iterator();
        while (it.hasNext()) {
            it.next().a(list, this.f3144f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d(List<T> list) {
        e(list, null);
    }

    public void e(List<T> list, Runnable runnable) {
        int i10 = this.f3145g + 1;
        this.f3145g = i10;
        List<T> list2 = this.f3143e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f3144f;
        if (list == null) {
            int size = list2.size();
            this.f3143e = null;
            this.f3144f = Collections.EMPTY_LIST;
            this.f3140a.b(0, size);
            c(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.b.a().execute(new a(list2, list, i10, runnable));
            return;
        }
        this.f3143e = list;
        this.f3144f = Collections.unmodifiableList(list);
        this.f3140a.a(0, list.size());
        c(list3, runnable);
    }

    public d(@NonNull w4.b bVar, @NonNull androidx.recyclerview.widget.c<T> cVar) {
        this.f3142d = new CopyOnWriteArrayList();
        this.f3144f = Collections.EMPTY_LIST;
        this.f3140a = bVar;
        this.b = cVar;
        if (cVar.c() != null) {
            this.f3141c = cVar.c();
        } else {
            this.f3141c = f3139h;
        }
    }
}
