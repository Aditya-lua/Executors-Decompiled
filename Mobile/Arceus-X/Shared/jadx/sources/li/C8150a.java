package li;

import android.os.Build;
import ck.AsyncTaskC1673b;
import ck.C1675d;
import ck.InterfaceC1672a;
import java.security.SecureRandom;
import java.util.ArrayList;
import p220jh.InterfaceC7155a;
import p220jh.InterfaceC7157c;
import th.C11659h;

/* JADX INFO: renamed from: li.a */
/* JADX INFO: loaded from: classes2.dex */
public class C8150a implements InterfaceC7157c {

    /* JADX INFO: renamed from: g */
    public static int f30218g;

    /* JADX INFO: renamed from: a */
    public StringBuilder f30219a;

    /* JADX INFO: renamed from: b */
    public StringBuilder f30220b;

    /* JADX INFO: renamed from: c */
    public String f30221c;

    /* JADX INFO: renamed from: d */
    public boolean f30222d = false;

    /* JADX INFO: renamed from: e */
    public long f30223e = 0;

    /* JADX INFO: renamed from: f */
    public ArrayList<String> f30224f = new ArrayList<>();

    /* JADX INFO: renamed from: li.a$a */
    public class a implements InterfaceC1672a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC7155a f30225a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(InterfaceC7155a interfaceC7155a) {
            this.f30225a = interfaceC7155a;
        }

        @Override // ck.InterfaceC1672a
        /* JADX INFO: renamed from: a */
        public void mo8379a(C1675d c1675d) {
            InterfaceC7155a interfaceC7155a = this.f30225a;
            if (interfaceC7155a != null) {
                interfaceC7155a.mo29956a();
            }
        }
    }

    public C8150a(String str) {
        this.f30219a = null;
        this.f30220b = null;
        this.f30221c = "";
        this.f30221c = str;
        this.f30220b = new StringBuilder();
        this.f30219a = new StringBuilder();
    }

    /* JADX INFO: renamed from: h */
    public static void m33401h() {
        f30218g = new SecureRandom().nextInt(100);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m33402k() {
        return f30218g < C11659h.m43403a().mo43481L();
    }

    @Override // p220jh.InterfaceC7157c
    /* JADX INFO: renamed from: a */
    public void mo29961a(InterfaceC7155a interfaceC7155a) {
        if (this.f30222d || m33402k()) {
            if (this.f30223e == 0) {
                this.f30223e = m33408i();
            }
            new AsyncTaskC1673b(C11659h.m43403a().mo43684n3(), C11659h.m43403a().mo43471J3(), m33409j(), new a(interfaceC7155a)).m8380d();
        } else if (interfaceC7155a != null) {
            interfaceC7155a.mo29956a();
        }
    }

    @Override // p220jh.InterfaceC7157c
    /* JADX INFO: renamed from: b */
    public boolean mo29962b() {
        return C11659h.m43403a().mo43684n3() != null;
    }

    /* JADX INFO: renamed from: c */
    public C8150a m33403c(String str, long j10) {
        StringBuilder sb2 = this.f30219a;
        sb2.append(str);
        sb2.append("=");
        sb2.append(j10);
        sb2.append("i,");
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C8150a m33404d(String str, Object obj) {
        StringBuilder sb2 = this.f30219a;
        sb2.append(str);
        sb2.append("=");
        sb2.append('\"');
        sb2.append(obj);
        sb2.append('\"');
        sb2.append(",");
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C8150a m33405e(String str, boolean z10) {
        StringBuilder sb2 = this.f30219a;
        sb2.append(str);
        sb2.append("=");
        sb2.append(z10);
        sb2.append(",");
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C8150a m33406f(String str, Object obj) {
        StringBuilder sb2 = this.f30220b;
        sb2.append(str);
        sb2.append('=');
        sb2.append(obj.toString().replace(" ", "\\ ").replace(",", "\\,"));
        sb2.append(",");
        return this;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC7157c m33407g() {
        C8151b.m33414f().m29958b(this);
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final long m33408i() {
        return System.currentTimeMillis() * 1000000;
    }

    /* JADX INFO: renamed from: j */
    public String m33409j() {
        m33406f("appVersion", "2.744.1081");
        m33404d("deviceType", Build.MODEL);
        m33406f("deviceOSVersion", Integer.valueOf(Build.VERSION.SDK_INT));
        m33406f("platform", "Android");
        m33406f("reporter", "App");
        if (this.f30223e == 0) {
            this.f30223e = m33408i();
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f30224f.size(); i10++) {
            sb2.append(this.f30224f.get(i10));
        }
        return ((CharSequence) sb2) + this.f30221c + "," + m33410l(this.f30220b.toString()) + " " + m33410l(this.f30219a.toString()) + " " + this.f30223e + "\n";
    }

    /* JADX INFO: renamed from: l */
    public final String m33410l(String str) {
        int iLastIndexOf = str.lastIndexOf(",");
        return iLastIndexOf != -1 ? str.substring(0, iLastIndexOf) : str;
    }

    /* JADX INFO: renamed from: m */
    public C8150a m33411m(boolean z10) {
        this.f30222d = z10;
        return this;
    }
}
