package wf;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35742a;
    public d.a b = d.a.DEFAULT;

    /* JADX INFO: renamed from: wf.a$a, reason: collision with other inner class name */
    public static final class C0738a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f35743a;
        public final d.a b;

        public C0738a(int i10, d.a aVar) {
            this.f35743a = i10;
            this.b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f35743a == dVar.tag() && this.b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f35743a) + (this.b.hashCode() ^ 2041407134);
        }

        @Override // wf.d
        public d.a intEncoding() {
            return this.b;
        }

        @Override // wf.d
        public int tag() {
            return this.f35743a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f35743a + "intEncoding=" + this.b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0738a(this.f35742a, this.b);
    }

    public a c(int i10) {
        this.f35742a = i10;
        return this;
    }
}
