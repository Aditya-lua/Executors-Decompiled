package cl;

import gk.p;
import java.io.IOException;
import jv.x;

/* JADX INFO: loaded from: classes2.dex */
public class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4945a;
    public final T b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f4946c;

    public b() {
        this.f4945a = 0;
        this.b = null;
        this.f4946c = null;
    }

    public int a() {
        a aVar = this.f4946c;
        if (aVar != null) {
            return aVar.f4941a;
        }
        return -1;
    }

    public boolean b() {
        int i10 = this.f4945a;
        return i10 >= 200 && i10 < 300;
    }

    public b(x<T> xVar) {
        String strString;
        this.f4945a = xVar.b();
        if (xVar.g()) {
            this.b = xVar.a();
            this.f4946c = null;
            return;
        }
        if (xVar.e() != null) {
            try {
                strString = xVar.e().string();
                try {
                    p.b("ApiResponse", "Error message: " + strString);
                } catch (IOException unused) {
                    p.e("ApiResponse", "error while parsing response");
                }
            } catch (IOException unused2) {
                strString = null;
            }
        } else {
            strString = null;
        }
        this.f4946c = new a((strString == null || strString.trim().length() == 0) ? xVar.h() : strString);
        this.b = null;
    }
}
