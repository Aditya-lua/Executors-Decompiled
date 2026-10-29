package p296n0;

import android.view.Surface;
import androidx.camera.core.InterfaceC0494d;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: n0.j2 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8775j2 {

    /* JADX INFO: renamed from: n0.j2$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo26326a(InterfaceC8775j2 interfaceC8775j2);
    }

    /* JADX INFO: renamed from: b */
    InterfaceC0494d mo2208b();

    /* JADX INFO: renamed from: c */
    int mo2209c();

    void close();

    /* JADX INFO: renamed from: d */
    void mo2210d();

    /* JADX INFO: renamed from: e */
    int mo2211e();

    /* JADX INFO: renamed from: f */
    void mo2212f(a aVar, Executor executor);

    /* JADX INFO: renamed from: g */
    InterfaceC0494d mo2213g();

    int getHeight();

    Surface getSurface();

    int getWidth();
}
