package p028b8;

import p569y7.AbstractC13117d;
import p569y7.C13116c;
import p569y7.InterfaceC13120g;

/* JADX INFO: renamed from: b8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1255c extends AbstractC1266n {

    /* JADX INFO: renamed from: a */
    public final AbstractC1267o f5247a;

    /* JADX INFO: renamed from: b */
    public final String f5248b;

    /* JADX INFO: renamed from: c */
    public final AbstractC13117d<?> f5249c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC13120g<?, byte[]> f5250d;

    /* JADX INFO: renamed from: e */
    public final C13116c f5251e;

    /* JADX INFO: renamed from: b8.c$b */
    public static final class b extends AbstractC1266n.a {

        /* JADX INFO: renamed from: a */
        public AbstractC1267o f5252a;

        /* JADX INFO: renamed from: b */
        public String f5253b;

        /* JADX INFO: renamed from: c */
        public AbstractC13117d<?> f5254c;

        /* JADX INFO: renamed from: d */
        public InterfaceC13120g<?, byte[]> f5255d;

        /* JADX INFO: renamed from: e */
        public C13116c f5256e;

        @Override // p028b8.AbstractC1266n.a
        /* JADX INFO: renamed from: a */
        public AbstractC1266n mo7001a() {
            String str = "";
            if (this.f5252a == null) {
                str = " transportContext";
            }
            if (this.f5253b == null) {
                str = str + " transportName";
            }
            if (this.f5254c == null) {
                str = str + " event";
            }
            if (this.f5255d == null) {
                str = str + " transformer";
            }
            if (this.f5256e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C1255c(this.f5252a, this.f5253b, this.f5254c, this.f5255d, this.f5256e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p028b8.AbstractC1266n.a
        /* JADX INFO: renamed from: b */
        public AbstractC1266n.a mo7002b(C13116c c13116c) {
            if (c13116c == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f5256e = c13116c;
            return this;
        }

        @Override // p028b8.AbstractC1266n.a
        /* JADX INFO: renamed from: c */
        public AbstractC1266n.a mo7003c(AbstractC13117d<?> abstractC13117d) {
            if (abstractC13117d == null) {
                throw new NullPointerException("Null event");
            }
            this.f5254c = abstractC13117d;
            return this;
        }

        @Override // p028b8.AbstractC1266n.a
        /* JADX INFO: renamed from: d */
        public AbstractC1266n.a mo7004d(InterfaceC13120g<?, byte[]> interfaceC13120g) {
            if (interfaceC13120g == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f5255d = interfaceC13120g;
            return this;
        }

        @Override // p028b8.AbstractC1266n.a
        /* JADX INFO: renamed from: e */
        public AbstractC1266n.a mo7005e(AbstractC1267o abstractC1267o) {
            if (abstractC1267o == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f5252a = abstractC1267o;
            return this;
        }

        @Override // p028b8.AbstractC1266n.a
        /* JADX INFO: renamed from: f */
        public AbstractC1266n.a mo7006f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f5253b = str;
            return this;
        }
    }

    @Override // p028b8.AbstractC1266n
    /* JADX INFO: renamed from: b */
    public C13116c mo6996b() {
        return this.f5251e;
    }

    @Override // p028b8.AbstractC1266n
    /* JADX INFO: renamed from: c */
    public AbstractC13117d<?> mo6997c() {
        return this.f5249c;
    }

    @Override // p028b8.AbstractC1266n
    /* JADX INFO: renamed from: e */
    public InterfaceC13120g<?, byte[]> mo6998e() {
        return this.f5250d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1266n) {
            AbstractC1266n abstractC1266n = (AbstractC1266n) obj;
            if (this.f5247a.equals(abstractC1266n.mo6999f()) && this.f5248b.equals(abstractC1266n.mo7000g()) && this.f5249c.equals(abstractC1266n.mo6997c()) && this.f5250d.equals(abstractC1266n.mo6998e()) && this.f5251e.equals(abstractC1266n.mo6996b())) {
                return true;
            }
        }
        return false;
    }

    @Override // p028b8.AbstractC1266n
    /* JADX INFO: renamed from: f */
    public AbstractC1267o mo6999f() {
        return this.f5247a;
    }

    @Override // p028b8.AbstractC1266n
    /* JADX INFO: renamed from: g */
    public String mo7000g() {
        return this.f5248b;
    }

    public int hashCode() {
        return ((((((((this.f5247a.hashCode() ^ 1000003) * 1000003) ^ this.f5248b.hashCode()) * 1000003) ^ this.f5249c.hashCode()) * 1000003) ^ this.f5250d.hashCode()) * 1000003) ^ this.f5251e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f5247a + ", transportName=" + this.f5248b + ", event=" + this.f5249c + ", transformer=" + this.f5250d + ", encoding=" + this.f5251e + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1255c(AbstractC1267o abstractC1267o, String str, AbstractC13117d<?> abstractC13117d, InterfaceC13120g<?, byte[]> interfaceC13120g, C13116c c13116c) {
        this.f5247a = abstractC1267o;
        this.f5248b = str;
        this.f5249c = abstractC13117d;
        this.f5250d = interfaceC13120g;
        this.f5251e = c13116c;
    }
}
