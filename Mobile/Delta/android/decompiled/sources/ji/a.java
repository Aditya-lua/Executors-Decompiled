package ji;

import ak.d;
import android.os.Build;
import java.security.SecureRandom;
import java.util.ArrayList;
import rh.h;

/* JADX INFO: loaded from: classes2.dex */
public class a implements ih.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f21919g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StringBuilder f21920a;
    public StringBuilder b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f21921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21922d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f21923e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<String> f21924f = new ArrayList<>();

    /* JADX INFO: renamed from: ji.a$a, reason: collision with other inner class name */
    public class C0379a implements ak.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ih.a f21925a;

        public C0379a(ih.a aVar) {
            this.f21925a = aVar;
        }

        @Override // ak.a
        public void a(d dVar) {
            ih.a aVar = this.f21925a;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public a(String str) {
        this.f21920a = null;
        this.b = null;
        this.f21921c = "";
        this.f21921c = str;
        this.b = new StringBuilder();
        this.f21920a = new StringBuilder();
    }

    public static void h() {
        f21919g = new SecureRandom().nextInt(100);
    }

    public static boolean k() {
        return f21919g < h.a().K();
    }

    @Override // ih.c
    public void a(ih.a aVar) {
        if (this.f21922d || k()) {
            if (this.f21923e == 0) {
                this.f21923e = i();
            }
            new ak.b(h.a().r3(), h.a().Q3(), j(), new C0379a(aVar)).d();
        } else if (aVar != null) {
            aVar.a();
        }
    }

    @Override // ih.c
    public boolean b() {
        return h.a().r3() != null;
    }

    public a c(String str, long j10) {
        StringBuilder sb2 = this.f21920a;
        sb2.append(str);
        sb2.append("=");
        sb2.append(j10);
        sb2.append("i,");
        return this;
    }

    public a d(String str, Object obj) {
        StringBuilder sb2 = this.f21920a;
        sb2.append(str);
        sb2.append("=");
        sb2.append('\"');
        sb2.append(obj);
        sb2.append('\"');
        sb2.append(",");
        return this;
    }

    public a e(String str, boolean z10) {
        StringBuilder sb2 = this.f21920a;
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

    public ih.c g() {
        b.f().b(this);
        return this;
    }

    public final long i() {
        return System.currentTimeMillis() * 1000000;
    }

    public String j() {
        f("appVersion", "2.745.1142");
        d("deviceType", Build.MODEL);
        f("deviceOSVersion", Integer.valueOf(Build.VERSION.SDK_INT));
        f("platform", "Android");
        f("reporter", "App");
        if (this.f21923e == 0) {
            this.f21923e = i();
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f21924f.size(); i10++) {
            sb2.append(this.f21924f.get(i10));
        }
        return ((CharSequence) sb2) + this.f21921c + "," + l(this.b.toString()) + " " + l(this.f21920a.toString()) + " " + this.f21923e + "\n";
    }

    public final String l(String str) {
        int iLastIndexOf = str.lastIndexOf(",");
        return iLastIndexOf != -1 ? str.substring(0, iLastIndexOf) : str;
    }

    public a m(boolean z10) {
        this.f21922d = z10;
        return this;
    }
}
