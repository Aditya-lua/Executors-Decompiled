package m1;

import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface l {

    public interface a extends b, h1.c<h1> {
    }

    public interface b {
    }

    public interface c extends b {

        public interface a {
            void a(Surface surface);
        }

        void a(Executor executor, a aVar);
    }

    void a();

    b b();

    void c(m mVar, Executor executor);

    void d(long j10);

    f1 e();

    me.x<Void> f();

    void g();

    int h();

    void pause();

    void start();
}
