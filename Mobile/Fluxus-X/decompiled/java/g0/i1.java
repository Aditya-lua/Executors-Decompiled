package g0;

import android.graphics.Matrix;
import n0.z3;

/* JADX INFO: loaded from: classes.dex */
public interface i1 {
    void a(p0.i.b bVar);

    default int b() {
        return 0;
    }

    z3 c();

    int d();

    default Matrix e() {
        return new Matrix();
    }

    long getTimestamp();
}
