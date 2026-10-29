package l9;

import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k<L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f23045a;
    public volatile Object b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile a f23046c;

    public static final class a<L> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f23047a;
        public final String b;

        public a(L l10, String str) {
            this.f23047a = l10;
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f23047a == aVar.f23047a && this.b.equals(aVar.b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f23047a) * 31) + this.b.hashCode();
        }
    }

    public interface b<L> {
        void a(@NonNull L l10);

        void b();
    }

    public k(@NonNull Looper looper, @NonNull L l10, @NonNull String str) {
        this.f23045a = new v9.a(looper);
        this.b = n9.m.m(l10, "Listener must not be null");
        this.f23046c = new a(l10, n9.m.f(str));
    }

    public void a() {
        this.b = null;
        this.f23046c = null;
    }

    public a<L> b() {
        return this.f23046c;
    }

    public void c(@NonNull final b<? super L> bVar) {
        n9.m.m(bVar, "Notifier must not be null");
        this.f23045a.execute(new Runnable() { // from class: l9.s0
            @Override // java.lang.Runnable
            public final void run() {
                this.f23079a.d(bVar);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(b bVar) {
        Object obj = this.b;
        if (obj == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(obj);
        } catch (RuntimeException e10) {
            bVar.b();
            throw e10;
        }
    }

    public k(@NonNull Executor executor, @NonNull L l10, @NonNull String str) {
        this.f23045a = (Executor) n9.m.m(executor, "Executor must not be null");
        this.b = n9.m.m(l10, "Listener must not be null");
        this.f23046c = new a(l10, n9.m.f(str));
    }
}
