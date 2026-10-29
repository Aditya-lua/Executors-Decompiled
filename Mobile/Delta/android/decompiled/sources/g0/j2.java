package g0;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface j2 extends Closeable {

    public static abstract class a {
        public static a f(Size size, Rect rect, n0.p0 p0Var, int i10, boolean z10) {
            return new h(size, rect, p0Var, i10, z10);
        }

        public abstract n0.p0 a();

        public abstract Rect b();

        public abstract Size c();

        public abstract boolean d();

        public abstract int e();
    }

    public static abstract class b {
        public static b c(int i10, j2 j2Var) {
            return new i(i10, j2Var);
        }

        public abstract int a();

        public abstract j2 b();
    }

    void N1(float[] fArr, float[] fArr2);

    default void S(float[] fArr, float[] fArr2, boolean z10) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    default int getFormat() {
        return 34;
    }

    Size i();

    Surface q2(Executor executor, x2.a<b> aVar);
}
