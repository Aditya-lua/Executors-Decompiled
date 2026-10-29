package ke;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;
import p169he.C6384n;
import p169he.C6391u;

/* JADX INFO: renamed from: ke.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C7574f implements Closeable {

    /* JADX INFO: renamed from: d */
    public static final c f29027d;

    /* JADX INFO: renamed from: a */
    public final c f29028a;

    /* JADX INFO: renamed from: b */
    public final Deque<Closeable> f29029b = new ArrayDeque(4);

    /* JADX INFO: renamed from: c */
    public Throwable f29030c;

    /* JADX INFO: renamed from: ke.f$a */
    public static final class a implements c {

        /* JADX INFO: renamed from: a */
        public static final a f29031a = new a();

        @Override // ke.C7574f.c
        /* JADX INFO: renamed from: a */
        public void mo31376a(Closeable closeable, Throwable th2, Throwable th3) {
            Logger logger = C7573e.f29026a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(closeable);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 42);
            sb2.append("Suppressing exception thrown when closing ");
            sb2.append(strValueOf);
            logger.log(level, sb2.toString(), th3);
        }
    }

    /* JADX INFO: renamed from: ke.f$b */
    public static final class b implements c {

        /* JADX INFO: renamed from: a */
        public final Method f29032a;

        public b(Method method) {
            this.f29032a = method;
        }

        /* JADX INFO: renamed from: b */
        public static b m31377b() {
            try {
                return new b(Throwable.class.getMethod("addSuppressed", Throwable.class));
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // ke.C7574f.c
        /* JADX INFO: renamed from: a */
        public void mo31376a(Closeable closeable, Throwable th2, Throwable th3) {
            if (th2 == th3) {
                return;
            }
            try {
                this.f29032a.invoke(th2, th3);
            } catch (Throwable unused) {
                a.f29031a.mo31376a(closeable, th2, th3);
            }
        }
    }

    /* JADX INFO: renamed from: ke.f$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo31376a(Closeable closeable, Throwable th2, Throwable th3);
    }

    static {
        c cVarM31377b = b.m31377b();
        if (cVarM31377b == null) {
            cVarM31377b = a.f29031a;
        }
        f29027d = cVarM31377b;
    }

    public C7574f(c cVar) {
        this.f29028a = (c) C6384n.m27928l(cVar);
    }

    /* JADX INFO: renamed from: a */
    public static C7574f m31373a() {
        return new C7574f(f29027d);
    }

    /* JADX INFO: renamed from: b */
    public <C extends Closeable> C m31374b(C c10) {
        if (c10 != null) {
            this.f29029b.addFirst(c10);
        }
        return c10;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    /* JADX INFO: renamed from: c */
    public RuntimeException m31375c(Throwable th2) throws X {
        C6384n.m27928l(th2);
        this.f29030c = th2;
        C6391u.m27968h(th2, IOException.class);
        throw new RuntimeException(th2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws X {
        Throwable th2 = this.f29030c;
        while (!this.f29029b.isEmpty()) {
            Closeable closeableRemoveFirst = this.f29029b.removeFirst();
            try {
                closeableRemoveFirst.close();
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    this.f29028a.mo31376a(closeableRemoveFirst, th2, th3);
                }
            }
        }
        if (this.f29030c != null || th2 == null) {
            return;
        }
        C6391u.m27968h(th2, IOException.class);
        throw new AssertionError(th2);
    }
}
