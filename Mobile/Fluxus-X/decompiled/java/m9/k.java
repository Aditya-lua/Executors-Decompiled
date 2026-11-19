package m9;

import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k<L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f23030a;
    public volatile Object b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile a f23031c;

    public static final class a<L> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f23032a;
        public final String b;

        public a(L l10, String str) {
            this.f23032a = l10;
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
            return this.f23032a == aVar.f23032a && this.b.equals(aVar.b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f23032a) * 31) + this.b.hashCode();
        }
    }

    public interface b<L> {
        void a(@NonNull L l10);

        void b();
    }

    public k(@NonNull Looper looper, @NonNull L l10, @NonNull String str) {
        this.f23030a = new w9.a(looper);
        this.b = o9.s.m(l10, "Listener must not be null");
        this.f23031c = new a(l10, o9.s.f(str));
    }

    public void a() {
        this.b = null;
        this.f23031c = null;
    }

    public a<L> b() {
        return this.f23031c;
    }

    public void c(@NonNull final b<? super L> bVar) {
        o9.s.m(bVar, "Notifier must not be null");
        this.f23030a.execute(new Runnable() { // from class: m9.s0
            @Override // java.lang.Runnable
            public final void run() {
                this.f23064a.d(bVar);
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
        this.f23030a = (Executor) o9.s.m(executor, "Executor must not be null");
        this.b = o9.s.m(l10, "Listener must not be null");
        this.f23031c = new a(l10, o9.s.f(str));
    }
}
