package ke;

import he.n;
import he.u;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f22654d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f22655a;
    public final Deque<Closeable> b = new ArrayDeque(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f22656c;

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22657a = new a();

        @Override // ke.f.c
        public void a(Closeable closeable, Throwable th2, Throwable th3) {
            Logger logger = e.f22653a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(closeable);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 42);
            sb2.append("Suppressing exception thrown when closing ");
            sb2.append(strValueOf);
            logger.log(level, sb2.toString(), th3);
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f22658a;

        public b(Method method) {
            this.f22658a = method;
        }

        public static b b() {
            try {
                return new b(Throwable.class.getMethod("addSuppressed", Throwable.class));
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // ke.f.c
        public void a(Closeable closeable, Throwable th2, Throwable th3) {
            if (th2 == th3) {
                return;
            }
            try {
                this.f22658a.invoke(th2, th3);
            } catch (Throwable unused) {
                a.f22657a.a(closeable, th2, th3);
            }
        }
    }

    public interface c {
        void a(Closeable closeable, Throwable th2, Throwable th3);
    }

    static {
        c cVarB = b.b();
        if (cVarB == null) {
            cVarB = a.f22657a;
        }
        f22654d = cVarB;
    }

    public f(c cVar) {
        this.f22655a = (c) n.l(cVar);
    }

    public static f a() {
        return new f(f22654d);
    }

    public <C extends Closeable> C b(C c10) {
        if (c10 != null) {
            this.b.addFirst(c10);
        }
        return c10;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public RuntimeException c(Throwable th2) throws X {
        n.l(th2);
        this.f22656c = th2;
        u.h(th2, IOException.class);
        throw new RuntimeException(th2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws X {
        Throwable th2 = this.f22656c;
        while (!this.b.isEmpty()) {
            Closeable closeableRemoveFirst = this.b.removeFirst();
            try {
                closeableRemoveFirst.close();
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    this.f22655a.a(closeableRemoveFirst, th2, th3);
                }
            }
        }
        if (this.f22656c != null || th2 == null) {
            return;
        }
        u.h(th2, IOException.class);
        throw new AssertionError(th2);
    }
}
