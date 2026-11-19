package ol;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import ok.q;
import sw.x;

/* JADX INFO: loaded from: classes2.dex */
public class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28274a;
    public final T b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f28275c;

    public b() {
        this.f28274a = 0;
        this.b = null;
        this.f28275c = null;
    }

    public int a() {
        a aVar = this.f28275c;
        if (aVar != null) {
            return aVar.f28270a;
        }
        return -1;
    }

    public boolean b() {
        int i10 = this.f28274a;
        return i10 >= 200 && i10 < 300;
    }

    public b(x<T> xVar) throws IllegalAccessException, InvocationTargetException {
        String strH;
        this.f28274a = xVar.b();
        if (xVar.g()) {
            this.b = xVar.a();
            this.f28275c = null;
            return;
        }
        if (xVar.e() != null) {
            try {
                strH = xVar.e().h();
                try {
                    q.b("ApiResponse", "Error message: " + strH);
                } catch (IOException unused) {
                    q.e("ApiResponse", "error while parsing response");
                }
            } catch (IOException unused2) {
                strH = null;
            }
        } else {
            strH = null;
        }
        this.f28275c = new a((strH == null || strH.trim().length() == 0) ? xVar.h() : strH);
        this.b = null;
    }
}
