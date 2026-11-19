package n0;

import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface j2 {

    public interface a {
        void a(j2 j2Var);
    }

    androidx.camera.core.d b();

    int c();

    void close();

    void d();

    int e();

    void f(a aVar, Executor executor);

    androidx.camera.core.d g();

    int getHeight();

    Surface getSurface();

    int getWidth();
}
