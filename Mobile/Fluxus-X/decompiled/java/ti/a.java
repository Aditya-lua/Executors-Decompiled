package ti;

import android.os.Build;
import bi.h;
import com.github.luben.zstd.BuildConfig;
import java.security.SecureRandom;
import java.util.ArrayList;
import kk.d;

/* JADX INFO: loaded from: classes2.dex */
public class a implements sh.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f32431g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StringBuilder f32432a;
    public StringBuilder b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f32433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f32434d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f32435e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<String> f32436f = new ArrayList<>();

    /* JADX INFO: renamed from: ti.a$a, reason: collision with other inner class name */
    public class C0647a implements kk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.a f32437a;

        public C0647a(sh.a aVar) {
            this.f32437a = aVar;
        }

        @Override // kk.a
        public void a(d dVar) {
            sh.a aVar = this.f32437a;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public a(String str) {
        this.f32432a = null;
        this.b = null;
        this.f32433c = BuildConfig.FLAVOR;
        this.f32433c = str;
        this.b = new StringBuilder();
        this.f32432a = new StringBuilder();
    }

    public static void h() {
        f32431g = new SecureRandom().nextInt(100);
    }

    public static boolean k() {
        return f32431g < h.a().K();
    }

    @Override // sh.c
    public void a(sh.a aVar) {
        if (this.f32434d || k()) {
            if (this.f32435e == 0) {
                this.f32435e = i();
            }
            new kk.b(h.a().u3(), h.a().U3(), j(), new C0647a(aVar)).d();
        } else if (aVar != null) {
            aVar.a();
        }
    }

    @Override // sh.c
    public boolean b() {
        return h.a().u3() != null;
    }

    public a c(String str, long j10) {
        StringBuilder sb2 = this.f32432a;
        sb2.append(str);
        sb2.append("=");
        sb2.append(j10);
        sb2.append("i,");
        return this;
    }

    public a d(String str, Object obj) {
        StringBuilder sb2 = this.f32432a;
        sb2.append(str);
        sb2.append("=");
        sb2.append('\"');
        sb2.append(obj);
        sb2.append('\"');
        sb2.append(",");
        return this;
    }

    public a e(String str, boolean z10) {
        StringBuilder sb2 = this.f32432a;
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

    public sh.c g() {
        b.f().b(this);
        return this;
    }

    public final long i() {
        return System.currentTimeMillis() * 1000000;
    }

    public String j() {
        f("appVersion", "2.747.1486");
        d("deviceType", Build.MODEL);
        f("deviceOSVersion", Integer.valueOf(Build.VERSION.SDK_INT));
        f("platform", "Android");
        f("reporter", "App");
        if (this.f32435e == 0) {
            this.f32435e = i();
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f32436f.size(); i10++) {
            sb2.append(this.f32436f.get(i10));
        }
        return ((CharSequence) sb2) + this.f32433c + "," + l(this.b.toString()) + " " + l(this.f32432a.toString()) + " " + this.f32435e + "\n";
    }

    public final String l(String str) {
        int iLastIndexOf = str.lastIndexOf(",");
        return iLastIndexOf != -1 ? str.substring(0, iLastIndexOf) : str;
    }

    public a m(boolean z10) {
        this.f32434d = z10;
        return this;
    }
}
