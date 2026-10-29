package p296n0;

import android.util.Range;
import android.util.Size;
import p140g0.C5902k0;

/* JADX INFO: renamed from: n0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C8818s extends AbstractC8827t3 {

    /* JADX INFO: renamed from: b */
    public final Size f32058b;

    /* JADX INFO: renamed from: c */
    public final Size f32059c;

    /* JADX INFO: renamed from: d */
    public final C5902k0 f32060d;

    /* JADX INFO: renamed from: e */
    public final int f32061e;

    /* JADX INFO: renamed from: f */
    public final Range<Integer> f32062f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC8795n1 f32063g;

    /* JADX INFO: renamed from: h */
    public final boolean f32064h;

    /* JADX INFO: renamed from: n0.s$b */
    public static final class b extends AbstractC8827t3.a {

        /* JADX INFO: renamed from: a */
        public Size f32065a;

        /* JADX INFO: renamed from: b */
        public Size f32066b;

        /* JADX INFO: renamed from: c */
        public C5902k0 f32067c;

        /* JADX INFO: renamed from: d */
        public Integer f32068d;

        /* JADX INFO: renamed from: e */
        public Range<Integer> f32069e;

        /* JADX INFO: renamed from: f */
        public InterfaceC8795n1 f32070f;

        /* JADX INFO: renamed from: g */
        public Boolean f32071g;

        @Override // p296n0.AbstractC8827t3.a
        /* JADX INFO: renamed from: a */
        public AbstractC8827t3 mo35399a() {
            String str = "";
            if (this.f32065a == null) {
                str = " resolution";
            }
            if (this.f32066b == null) {
                str = str + " originalConfiguredResolution";
            }
            if (this.f32067c == null) {
                str = str + " dynamicRange";
            }
            if (this.f32068d == null) {
                str = str + " sessionType";
            }
            if (this.f32069e == null) {
                str = str + " expectedFrameRateRange";
            }
            if (this.f32071g == null) {
                str = str + " zslDisabled";
            }
            if (str.isEmpty()) {
                return new C8818s(this.f32065a, this.f32066b, this.f32067c, this.f32068d.intValue(), this.f32069e, this.f32070f, this.f32071g.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p296n0.AbstractC8827t3.a
        /* JADX INFO: renamed from: b */
        public AbstractC8827t3.a mo35400b(C5902k0 c5902k0) {
            if (c5902k0 == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f32067c = c5902k0;
            return this;
        }

        @Override // p296n0.AbstractC8827t3.a
        /* JADX INFO: renamed from: c */
        public AbstractC8827t3.a mo35401c(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f32069e = range;
            return this;
        }

        @Override // p296n0.AbstractC8827t3.a
        /* JADX INFO: renamed from: d */
        public AbstractC8827t3.a mo35402d(InterfaceC8795n1 interfaceC8795n1) {
            this.f32070f = interfaceC8795n1;
            return this;
        }

        @Override // p296n0.AbstractC8827t3.a
        /* JADX INFO: renamed from: e */
        public AbstractC8827t3.a mo35403e(Size size) {
            if (size == null) {
                throw new NullPointerException("Null originalConfiguredResolution");
            }
            this.f32066b = size;
            return this;
        }

        @Override // p296n0.AbstractC8827t3.a
        /* JADX INFO: renamed from: f */
        public AbstractC8827t3.a mo35404f(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f32065a = size;
            return this;
        }

        @Override // p296n0.AbstractC8827t3.a
        /* JADX INFO: renamed from: g */
        public AbstractC8827t3.a mo35405g(int i10) {
            this.f32068d = Integer.valueOf(i10);
            return this;
        }

        @Override // p296n0.AbstractC8827t3.a
        /* JADX INFO: renamed from: h */
        public AbstractC8827t3.a mo35406h(boolean z10) {
            this.f32071g = Boolean.valueOf(z10);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }

        public b(AbstractC8827t3 abstractC8827t3) {
            this.f32065a = abstractC8827t3.mo35395f();
            this.f32066b = abstractC8827t3.mo35394e();
            this.f32067c = abstractC8827t3.mo35391b();
            this.f32068d = Integer.valueOf(abstractC8827t3.mo35396g());
            this.f32069e = abstractC8827t3.mo35392c();
            this.f32070f = abstractC8827t3.mo35393d();
            this.f32071g = Boolean.valueOf(abstractC8827t3.mo35397h());
        }
    }

    @Override // p296n0.AbstractC8827t3
    /* JADX INFO: renamed from: b */
    public C5902k0 mo35391b() {
        return this.f32060d;
    }

    @Override // p296n0.AbstractC8827t3
    /* JADX INFO: renamed from: c */
    public Range<Integer> mo35392c() {
        return this.f32062f;
    }

    @Override // p296n0.AbstractC8827t3
    /* JADX INFO: renamed from: d */
    public InterfaceC8795n1 mo35393d() {
        return this.f32063g;
    }

    @Override // p296n0.AbstractC8827t3
    /* JADX INFO: renamed from: e */
    public Size mo35394e() {
        return this.f32059c;
    }

    public boolean equals(Object obj) {
        InterfaceC8795n1 interfaceC8795n1;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8827t3) {
            AbstractC8827t3 abstractC8827t3 = (AbstractC8827t3) obj;
            if (this.f32058b.equals(abstractC8827t3.mo35395f()) && this.f32059c.equals(abstractC8827t3.mo35394e()) && this.f32060d.equals(abstractC8827t3.mo35391b()) && this.f32061e == abstractC8827t3.mo35396g() && this.f32062f.equals(abstractC8827t3.mo35392c()) && ((interfaceC8795n1 = this.f32063g) != null ? interfaceC8795n1.equals(abstractC8827t3.mo35393d()) : abstractC8827t3.mo35393d() == null) && this.f32064h == abstractC8827t3.mo35397h()) {
                return true;
            }
        }
        return false;
    }

    @Override // p296n0.AbstractC8827t3
    /* JADX INFO: renamed from: f */
    public Size mo35395f() {
        return this.f32058b;
    }

    @Override // p296n0.AbstractC8827t3
    /* JADX INFO: renamed from: g */
    public int mo35396g() {
        return this.f32061e;
    }

    @Override // p296n0.AbstractC8827t3
    /* JADX INFO: renamed from: h */
    public boolean mo35397h() {
        return this.f32064h;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.f32058b.hashCode() ^ 1000003) * 1000003) ^ this.f32059c.hashCode()) * 1000003) ^ this.f32060d.hashCode()) * 1000003) ^ this.f32061e) * 1000003) ^ this.f32062f.hashCode()) * 1000003;
        InterfaceC8795n1 interfaceC8795n1 = this.f32063g;
        return ((iHashCode ^ (interfaceC8795n1 == null ? 0 : interfaceC8795n1.hashCode())) * 1000003) ^ (this.f32064h ? 1231 : 1237);
    }

    @Override // p296n0.AbstractC8827t3
    /* JADX INFO: renamed from: i */
    public AbstractC8827t3.a mo35398i() {
        return new b(this);
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.f32058b + ", originalConfiguredResolution=" + this.f32059c + ", dynamicRange=" + this.f32060d + ", sessionType=" + this.f32061e + ", expectedFrameRateRange=" + this.f32062f + ", implementationOptions=" + this.f32063g + ", zslDisabled=" + this.f32064h + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8818s(Size size, Size size2, C5902k0 c5902k0, int i10, Range<Integer> range, InterfaceC8795n1 interfaceC8795n1, boolean z10) {
        this.f32058b = size;
        this.f32059c = size2;
        this.f32060d = c5902k0;
        this.f32061e = i10;
        this.f32062f = range;
        this.f32063g = interfaceC8795n1;
        this.f32064h = z10;
    }
}
