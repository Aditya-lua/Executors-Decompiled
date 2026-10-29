package fk;

import androidx.p616lifecycle.AbstractC0940a0;
import androidx.p616lifecycle.C0949d0;
import p337ol.EnumC9799a;

/* JADX INFO: renamed from: fk.c */
/* JADX INFO: loaded from: classes2.dex */
public class C5654c {

    /* JADX INFO: renamed from: k */
    public static final EnumC9799a f21700k = EnumC9799a.LIGHT;

    /* JADX INFO: renamed from: a */
    public long f21701a;

    /* JADX INFO: renamed from: b */
    public int f21702b;

    /* JADX INFO: renamed from: c */
    public String f21703c;

    /* JADX INFO: renamed from: d */
    public String f21704d;

    /* JADX INFO: renamed from: e */
    public String f21705e;

    /* JADX INFO: renamed from: f */
    public boolean f21706f;

    /* JADX INFO: renamed from: g */
    public int f21707g;

    /* JADX INFO: renamed from: h */
    public int f21708h;

    /* JADX INFO: renamed from: i */
    public boolean f21709i;

    /* JADX INFO: renamed from: j */
    public C0949d0<EnumC9799a> f21710j;

    /* JADX INFO: renamed from: fk.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C5654c f21711a = new C5654c();
    }

    /* JADX INFO: renamed from: c */
    public static C5654c m25669c() {
        return a.f21711a;
    }

    /* JADX INFO: renamed from: a */
    public void m25670a() {
        this.f21702b = 0;
        this.f21707g = 0;
        this.f21705e = "";
        this.f21703c = null;
        this.f21706f = true;
        m25690v(-1L);
        m25689u(f21700k);
    }

    /* JADX INFO: renamed from: b */
    public String m25671b() {
        String str = this.f21705e;
        return (str == null || str.equals("null")) ? "" : this.f21705e;
    }

    /* JADX INFO: renamed from: d */
    public int m25672d() {
        return this.f21708h;
    }

    /* JADX INFO: renamed from: e */
    public int m25673e() {
        return this.f21702b;
    }

    /* JADX INFO: renamed from: f */
    public int m25674f() {
        return this.f21707g;
    }

    /* JADX INFO: renamed from: g */
    public EnumC9799a m25675g() {
        EnumC9799a enumC9799aMo4854f = this.f21710j.mo4854f();
        return enumC9799aMo4854f != null ? enumC9799aMo4854f : f21700k;
    }

    /* JADX INFO: renamed from: h */
    public AbstractC0940a0<EnumC9799a> m25676h() {
        return this.f21710j;
    }

    /* JADX INFO: renamed from: i */
    public String m25677i() {
        return m25675g().toString();
    }

    /* JADX INFO: renamed from: j */
    public long m25678j() {
        return this.f21701a;
    }

    /* JADX INFO: renamed from: k */
    public String m25679k() {
        String str = this.f21704d;
        return (str == null || str.equals("null")) ? "" : this.f21704d;
    }

    /* JADX INFO: renamed from: l */
    public boolean m25680l() {
        return this.f21709i;
    }

    /* JADX INFO: renamed from: m */
    public void m25681m() {
        if (this.f21710j.mo4854f() == null) {
            m25689u(f21700k);
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m25682n() {
        return this.f21706f;
    }

    /* JADX INFO: renamed from: o */
    public void m25683o(String str) {
        this.f21705e = str;
    }

    /* JADX INFO: renamed from: p */
    public void m25684p(boolean z10) {
        this.f21709i = z10;
    }

    /* JADX INFO: renamed from: q */
    public void m25685q(boolean z10) {
        this.f21706f = z10;
    }

    /* JADX INFO: renamed from: r */
    public void m25686r(int i10) {
        this.f21708h = i10;
    }

    /* JADX INFO: renamed from: s */
    public void m25687s(int i10) {
        this.f21702b = i10;
    }

    /* JADX INFO: renamed from: t */
    public void m25688t(int i10) {
        this.f21707g = i10;
    }

    /* JADX INFO: renamed from: u */
    public void m25689u(EnumC9799a enumC9799a) {
        this.f21710j.mo4863o(enumC9799a);
    }

    /* JADX INFO: renamed from: v */
    public void m25690v(long j10) {
        this.f21701a = j10;
        C5656e.f21712a.m25695c(j10);
    }

    /* JADX INFO: renamed from: w */
    public void m25691w(String str) {
        this.f21704d = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5654c() {
        this.f21701a = -1L;
        this.f21706f = true;
        this.f21710j = new C0949d0<>();
    }
}
