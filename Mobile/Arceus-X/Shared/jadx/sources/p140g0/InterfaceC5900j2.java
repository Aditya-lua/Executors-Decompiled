package p140g0;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;
import p296n0.InterfaceC8804p0;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: g0.j2 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5900j2 extends Closeable {

    /* JADX INFO: renamed from: g0.j2$a */
    public static abstract class a {
        /* JADX INFO: renamed from: f */
        public static a m26507f(Size size, Rect rect, InterfaceC8804p0 interfaceC8804p0, int i10, boolean z10) {
            return new C5889h(size, rect, interfaceC8804p0, i10, z10);
        }

        /* JADX INFO: renamed from: a */
        public abstract InterfaceC8804p0 mo26481a();

        /* JADX INFO: renamed from: b */
        public abstract Rect mo26482b();

        /* JADX INFO: renamed from: c */
        public abstract Size mo26483c();

        /* JADX INFO: renamed from: d */
        public abstract boolean mo26484d();

        /* JADX INFO: renamed from: e */
        public abstract int mo26485e();
    }

    /* JADX INFO: renamed from: g0.j2$b */
    public static abstract class b {
        /* JADX INFO: renamed from: c */
        public static b m26508c(int i10, InterfaceC5900j2 interfaceC5900j2) {
            return new C5893i(i10, interfaceC5900j2);
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo26489a();

        /* JADX INFO: renamed from: b */
        public abstract InterfaceC5900j2 mo26490b();
    }

    /* JADX INFO: renamed from: N1 */
    void mo26503N1(float[] fArr, float[] fArr2);

    /* JADX INFO: renamed from: S */
    default void mo26504S(float[] fArr, float[] fArr2, boolean z10) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    default int getFormat() {
        return 34;
    }

    /* JADX INFO: renamed from: i */
    Size mo26505i();

    /* JADX INFO: renamed from: q2 */
    Surface mo26506q2(Executor executor, InterfaceC12631a<b> interfaceC12631a);
}
