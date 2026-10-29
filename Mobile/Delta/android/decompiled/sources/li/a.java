package li;

import android.os.Build;
import ck.d;
import java.security.SecureRandom;
import java.util.ArrayList;
import th.h;

/* JADX INFO: loaded from: classes2.dex */
public class a implements jh.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f23266g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StringBuilder f23267a;
    public StringBuilder b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f23268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23269d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f23270e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<String> f23271f = new ArrayList<>();

    /* JADX INFO: renamed from: li.a$a, reason: collision with other inner class name */
    public class C0411a implements ck.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ jh.a f23272a;

        public C0411a(jh.a aVar) {
            this.f23272a = aVar;
        }

        @Override // ck.a
        public void a(d dVar) {
            jh.a aVar = this.f23272a;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public a(String str) {
        this.f23267a = null;
        this.b = null;
        this.f23268c = "";
        this.f23268c = str;
        this.b = new StringBuilder();
        this.f23267a = new StringBuilder();
    }

    public static void h() {
        f23266g = new SecureRandom().nextInt(100);
    }

    public static boolean k() {
        return f23266g < h.a().I();
    }

    @Override // jh.c
    public void a(jh.a aVar) {
        if (this.f23269d || k()) {
            if (this.f23270e == 0) {
                this.f23270e = i();
            }
            new ck.b(h.a().h3(), h.a().E3(), j(), new C0411a(aVar)).d();
        } else if (aVar != null) {
            aVar.a();
        }
    }

    @Override // jh.c
    public boolean b() {
        return h.a().h3() != null;
    }

    public a c(String str, long j10) {
        StringBuilder sb2 = this.f23267a;
        sb2.append(str);
        sb2.append("=");
        sb2.append(j10);
        sb2.append("i,");
        return this;
    }

    public a d(String str, Object obj) {
        StringBuilder sb2 = this.f23267a;
        sb2.append(str);
        sb2.append("=");
        sb2.append('\"');
        sb2.append(obj);
        sb2.append('\"');
        sb2.append(",");
        return this;
    }

    public a e(String str, boolean z10) {
        StringBuilder sb2 = this.f23267a;
        sb2.append(str);
        sb2.append("=");
        sb2.append(z10);
        sb2.append(",");
        return this;
    }

    public a f(String str, Object obj) {
        StringBuilder sb2 = this.b;
        sb2.append(str);
        sb2.append('=');
        sb2.append(obj.toString().replace(" ", "\\ ").replace(",", "\\,"));
        sb2.append(",");
        return this;
    }

    public jh.c g() {
        b.f().b(this);
        return this;
    }

    public final long i() {
        return System.currentTimeMillis() * 1000000;
    }

    public String j() {
        f("appVersion", "2.743.1136");
        d("deviceType", Build.MODEL);
        f("deviceOSVersion", Integer.valueOf(Build.VERSION.SDK_INT));
        f("platform", "Android");
        f("reporter", "App");
        if (this.f23270e == 0) {
            this.f23270e = i();
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f23271f.size(); i10++) {
            sb2.append(this.f23271f.get(i10));
        }
        return ((CharSequence) sb2) + this.f23268c + "," + l(this.b.toString()) + " " + l(this.f23267a.toString()) + " " + this.f23270e + "\n";
    }

    public final String l(String str) {
        int iLastIndexOf = str.lastIndexOf(",");
        return iLastIndexOf != -1 ? str.substring(0, iLastIndexOf) : str;
    }

    public a m(boolean z10) {
        this.f23269d = z10;
        return this;
    }
}
