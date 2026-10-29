package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;
import p140g0.InterfaceC5895i1;

/* JADX INFO: renamed from: androidx.camera.core.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0494d extends AutoCloseable {

    /* JADX INFO: renamed from: androidx.camera.core.d$a */
    public interface a {
        /* JADX INFO: renamed from: k */
        ByteBuffer mo2188k();

        /* JADX INFO: renamed from: l */
        int mo2189l();

        /* JADX INFO: renamed from: m */
        int mo2190m();
    }

    @SuppressLint({"ArrayReturn"})
    /* JADX INFO: renamed from: H1 */
    a[] mo2186H1();

    /* JADX INFO: renamed from: H2 */
    InterfaceC5895i1 mo2192H2();

    /* JADX INFO: renamed from: M0 */
    void mo2193M0(Rect rect);

    @Override // java.lang.AutoCloseable
    void close();

    int getFormat();

    int getHeight();

    int getWidth();

    /* JADX INFO: renamed from: p */
    Image mo2194p();
}
