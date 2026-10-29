package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import p507w4.InterfaceC12307b;

/* JADX INFO: renamed from: androidx.recyclerview.widget.d */
/* JADX INFO: loaded from: classes.dex */
public class C1053d<T> {

    /* JADX INFO: renamed from: h */
    public static final Executor f4140h = new c();

    /* JADX INFO: renamed from: a */
    public final InterfaceC12307b f4141a;

    /* JADX INFO: renamed from: b */
    public final C1052c<T> f4142b;

    /* JADX INFO: renamed from: c */
    public Executor f4143c;

    /* JADX INFO: renamed from: d */
    public final List<b<T>> f4144d;

    /* JADX INFO: renamed from: e */
    public List<T> f4145e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public List<T> f4146f;

    /* JADX INFO: renamed from: g */
    public int f4147g;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f4148a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f4149b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f4150c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Runnable f4151d;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        public class C14084a extends C1056g.b {
            public C14084a() {
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: jq.e$d */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C1056g.b
            /* JADX INFO: renamed from: a */
            public boolean mo5869a(int i10, int i11) {
                Object obj = a.this.f4148a.get(i10);
                Object obj2 = a.this.f4149b.get(i11);
                if (obj != null && obj2 != null) {
                    return C1053d.this.f4142b.m5861b().mo5935a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: jq.e$d */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C1056g.b
            /* JADX INFO: renamed from: b */
            public boolean mo5870b(int i10, int i11) {
                Object obj = a.this.f4148a.get(i10);
                Object obj2 = a.this.f4149b.get(i11);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return C1053d.this.f4142b.m5861b().mo5936b(obj, obj2);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: jq.e$d */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C1056g.b
            /* JADX INFO: renamed from: c */
            public Object mo5871c(int i10, int i11) {
                Object obj = a.this.f4148a.get(i10);
                Object obj2 = a.this.f4149b.get(i11);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return C1053d.this.f4142b.m5861b().mo5937c(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.C1056g.b
            /* JADX INFO: renamed from: d */
            public int mo5872d() {
                return a.this.f4149b.size();
            }

            @Override // androidx.recyclerview.widget.C1056g.b
            /* JADX INFO: renamed from: e */
            public int mo5873e() {
                return a.this.f4148a.size();
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1056g.e f4154a;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public b(C1056g.e eVar) {
                this.f4154a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                C1053d c1053d = C1053d.this;
                if (c1053d.f4147g == aVar.f4150c) {
                    c1053d.m5865b(aVar.f4149b, this.f4154a, aVar.f4151d);
                }
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(List list, List list2, int i10, Runnable runnable) {
            this.f4148a = list;
            this.f4149b = list2;
            this.f4150c = i10;
            this.f4151d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1053d.this.f4143c.execute(new b(C1056g.m5918b(new C14084a())));
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$b */
    public interface b<T> {
        /* JADX INFO: renamed from: a */
        void m5874a(@NonNull List<T> list, @NonNull List<T> list2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$c */
    public static class c implements Executor {

        /* JADX INFO: renamed from: a */
        public final Handler f4156a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.f4156a.post(runnable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1053d(@NonNull RecyclerView.AbstractC1025h abstractC1025h, @NonNull C1056g.f<T> fVar) {
        this(new C1051b(abstractC1025h), new C1052c.a(fVar).m5863a());
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public List<T> m5864a() {
        return this.f4146f;
    }

    /* JADX INFO: renamed from: b */
    public void m5865b(@NonNull List<T> list, @NonNull C1056g.e eVar, Runnable runnable) {
        List<T> list2 = this.f4146f;
        this.f4145e = list;
        this.f4146f = Collections.unmodifiableList(list);
        eVar.m5931c(this.f4141a);
        m5866c(list2, runnable);
    }

    /* JADX INFO: renamed from: c */
    public final void m5866c(@NonNull List<T> list, Runnable runnable) {
        Iterator<b<T>> it = this.f4144d.iterator();
        while (it.hasNext()) {
            it.next().m5874a(list, this.f4146f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m5867d(List<T> list) {
        m5868e(list, null);
    }

    /* JADX INFO: renamed from: e */
    public void m5868e(List<T> list, Runnable runnable) {
        int i10 = this.f4147g + 1;
        this.f4147g = i10;
        List<T> list2 = this.f4145e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f4146f;
        if (list == null) {
            int size = list2.size();
            this.f4145e = null;
            this.f4146f = Collections.EMPTY_LIST;
            this.f4141a.mo5857b(0, size);
            m5866c(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f4142b.m5860a().execute(new a(list2, list, i10, runnable));
            return;
        }
        this.f4145e = list;
        this.f4146f = Collections.unmodifiableList(list);
        this.f4141a.mo5856a(0, list.size());
        m5866c(list3, runnable);
    }

    public C1053d(@NonNull InterfaceC12307b interfaceC12307b, @NonNull C1052c<T> c1052c) {
        this.f4144d = new CopyOnWriteArrayList();
        this.f4146f = Collections.EMPTY_LIST;
        this.f4141a = interfaceC12307b;
        this.f4142b = c1052c;
        if (c1052c.m5862c() != null) {
            this.f4143c = c1052c.m5862c();
        } else {
            this.f4143c = f4140h;
        }
    }
}
