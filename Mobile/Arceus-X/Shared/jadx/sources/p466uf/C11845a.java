package p466uf;

import java.lang.annotation.Annotation;

/* JADX INFO: renamed from: uf.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C11845a {

    /* JADX INFO: renamed from: a */
    public int f41604a;

    /* JADX INFO: renamed from: b */
    public InterfaceC11848d.a f41605b = InterfaceC11848d.a.DEFAULT;

    /* JADX INFO: renamed from: uf.a$a */
    public static final class a implements InterfaceC11848d {

        /* JADX INFO: renamed from: a */
        public final int f41606a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC11848d.a f41607b;

        public a(int i10, InterfaceC11848d.a aVar) {
            this.f41606a = i10;
            this.f41607b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return InterfaceC11848d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InterfaceC11848d)) {
                return false;
            }
            InterfaceC11848d interfaceC11848d = (InterfaceC11848d) obj;
            return this.f41606a == interfaceC11848d.tag() && this.f41607b.equals(interfaceC11848d.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f41606a) + (this.f41607b.hashCode() ^ 2041407134);
        }

        @Override // p466uf.InterfaceC11848d
        public InterfaceC11848d.a intEncoding() {
            return this.f41607b;
        }

        @Override // p466uf.InterfaceC11848d
        public int tag() {
            return this.f41606a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f41606a + "intEncoding=" + this.f41607b + ')';
        }
    }

    /* JADX INFO: renamed from: b */
    public static C11845a m44244b() {
        return new C11845a();
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC11848d m44245a() {
        return new a(this.f41604a, this.f41605b);
    }

    /* JADX INFO: renamed from: c */
    public C11845a m44246c(int i10) {
        this.f41604a = i10;
        return this;
    }
}
