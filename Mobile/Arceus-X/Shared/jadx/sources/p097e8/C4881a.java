package p097e8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p028b8.AbstractC1264l;
import p466uf.InterfaceC11848d;

/* JADX INFO: renamed from: e8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4881a {

    /* JADX INFO: renamed from: e */
    public static final C4881a f19582e = new a().m23511b();

    /* JADX INFO: renamed from: a */
    public final C4886f f19583a;

    /* JADX INFO: renamed from: b */
    public final List<C4884d> f19584b;

    /* JADX INFO: renamed from: c */
    public final C4882b f19585c;

    /* JADX INFO: renamed from: d */
    public final String f19586d;

    /* JADX INFO: renamed from: e8.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public C4886f f19587a = null;

        /* JADX INFO: renamed from: b */
        public List<C4884d> f19588b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public C4882b f19589c = null;

        /* JADX INFO: renamed from: d */
        public String f19590d = "";

        /* JADX INFO: renamed from: a */
        public a m23510a(C4884d c4884d) {
            this.f19588b.add(c4884d);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C4881a m23511b() {
            return new C4881a(this.f19587a, Collections.unmodifiableList(this.f19588b), this.f19589c, this.f19590d);
        }

        /* JADX INFO: renamed from: c */
        public a m23512c(String str) {
            this.f19590d = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m23513d(C4882b c4882b) {
            this.f19589c = c4882b;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m23514e(C4886f c4886f) {
            this.f19587a = c4886f;
            return this;
        }
    }

    public C4881a(C4886f c4886f, List<C4884d> list, C4882b c4882b, String str) {
        this.f19583a = c4886f;
        this.f19584b = list;
        this.f19585c = c4882b;
        this.f19586d = str;
    }

    /* JADX INFO: renamed from: e */
    public static a m23504e() {
        return new a();
    }

    @InterfaceC11848d(tag = 4)
    /* JADX INFO: renamed from: a */
    public String m23505a() {
        return this.f19586d;
    }

    @InterfaceC11848d(tag = 3)
    /* JADX INFO: renamed from: b */
    public C4882b m23506b() {
        return this.f19585c;
    }

    @InterfaceC11848d(tag = 2)
    /* JADX INFO: renamed from: c */
    public List<C4884d> m23507c() {
        return this.f19584b;
    }

    @InterfaceC11848d(tag = 1)
    /* JADX INFO: renamed from: d */
    public C4886f m23508d() {
        return this.f19583a;
    }

    /* JADX INFO: renamed from: f */
    public byte[] m23509f() {
        return AbstractC1264l.m7036a(this);
    }
}
