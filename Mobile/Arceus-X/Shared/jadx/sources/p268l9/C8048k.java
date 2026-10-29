package p268l9;

import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import p305n9.C8953m;
import p488v9.ExecutorC12108a;

/* JADX INFO: renamed from: l9.k */
/* JADX INFO: loaded from: classes.dex */
public final class C8048k<L> {

    /* JADX INFO: renamed from: a */
    public final Executor f30039a;

    /* JADX INFO: renamed from: b */
    public volatile Object f30040b;

    /* JADX INFO: renamed from: c */
    public volatile a f30041c;

    /* JADX INFO: renamed from: l9.k$a */
    public static final class a<L> {

        /* JADX INFO: renamed from: a */
        public final Object f30042a;

        /* JADX INFO: renamed from: b */
        public final String f30043b;

        public a(L l10, String str) {
            this.f30042a = l10;
            this.f30043b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f30042a == aVar.f30042a && this.f30043b.equals(aVar.f30043b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f30042a) * 31) + this.f30043b.hashCode();
        }
    }

    /* JADX INFO: renamed from: l9.k$b */
    public interface b<L> {
        /* JADX INFO: renamed from: a */
        void mo27641a(@NonNull L l10);

        /* JADX INFO: renamed from: b */
        void mo27642b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8048k(@NonNull Looper looper, @NonNull L l10, @NonNull String str) {
        this.f30039a = new ExecutorC12108a(looper);
        this.f30040b = C8953m.m36048m(l10, "Listener must not be null");
        this.f30041c = new a(l10, C8953m.m36041f(str));
    }

    /* JADX INFO: renamed from: a */
    public void m33228a() {
        this.f30040b = null;
        this.f30041c = null;
    }

    /* JADX INFO: renamed from: b */
    public a<L> m33229b() {
        return this.f30041c;
    }

    /* JADX INFO: renamed from: c */
    public void m33230c(@NonNull final b<? super L> bVar) {
        C8953m.m36048m(bVar, "Notifier must not be null");
        this.f30039a.execute(new Runnable() { // from class: l9.s0
            @Override // java.lang.Runnable
            public final void run() {
                this.f30087a.m33231d(bVar);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: l9.k$b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final void m33231d(b bVar) {
        Object obj = this.f30040b;
        if (obj == null) {
            bVar.mo27642b();
            return;
        }
        try {
            bVar.mo27641a(obj);
        } catch (RuntimeException e10) {
            bVar.mo27642b();
            throw e10;
        }
    }

    public C8048k(@NonNull Executor executor, @NonNull L l10, @NonNull String str) {
        this.f30039a = (Executor) C8953m.m36048m(executor, "Executor must not be null");
        this.f30040b = C8953m.m36048m(l10, "Listener must not be null");
        this.f30041c = new a(l10, C8953m.m36041f(str));
    }
}
