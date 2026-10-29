package p183i1;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: i1.p */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6621p {

    /* JADX INFO: renamed from: i1.p$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        default void mo28583a(boolean z10) {
        }
    }

    /* JADX INFO: renamed from: i1.p$b */
    public static class b extends Exception {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b(String str) {
            super(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(Throwable th2) {
            super(th2);
        }
    }

    /* JADX INFO: renamed from: i1.p$c */
    public static abstract class c {
        /* JADX INFO: renamed from: c */
        public static c m28585c(int i10, long j10) {
            return new C6627v(i10, j10);
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo28586a();

        /* JADX INFO: renamed from: b */
        public abstract long mo28587b();
    }

    /* JADX INFO: renamed from: a */
    void mo28530a();

    /* JADX INFO: renamed from: b */
    void mo28531b(a aVar, Executor executor);

    c read(ByteBuffer byteBuffer);

    void start();

    void stop();
}
