package cl;

import java.io.IOException;
import p151gk.C6124q;
import p231jv.C7396x;

/* JADX INFO: renamed from: cl.b */
/* JADX INFO: loaded from: classes2.dex */
public class C1677b<T> {

    /* JADX INFO: renamed from: a */
    public final int f6455a;

    /* JADX INFO: renamed from: b */
    public final T f6456b;

    /* JADX INFO: renamed from: c */
    public final C1676a f6457c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1677b() {
        this.f6455a = 0;
        this.f6456b = null;
        this.f6457c = null;
    }

    /* JADX INFO: renamed from: a */
    public int m8386a() {
        C1676a c1676a = this.f6457c;
        if (c1676a != null) {
            return c1676a.f6450a;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public boolean m8387b() {
        int i10 = this.f6455a;
        return i10 >= 200 && i10 < 300;
    }

    public C1677b(C7396x<T> c7396x) {
        String strString;
        this.f6455a = c7396x.m30654b();
        if (c7396x.m30657g()) {
            this.f6456b = c7396x.m30653a();
            this.f6457c = null;
            return;
        }
        if (c7396x.m30655e() != null) {
            try {
                strString = c7396x.m30655e().string();
                try {
                    C6124q.m27057b("ApiResponse", "Error message: " + strString);
                } catch (IOException unused) {
                    C6124q.m27060e("ApiResponse", "error while parsing response");
                }
            } catch (IOException unused2) {
                strString = null;
            }
        } else {
            strString = null;
        }
        this.f6457c = new C1676a((strString == null || strString.trim().length() == 0) ? c7396x.m30658h() : strString);
        this.f6456b = null;
    }
}
