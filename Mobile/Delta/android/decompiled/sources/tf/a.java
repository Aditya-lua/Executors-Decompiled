package tf;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31712a;
    public d.a b = d.a.DEFAULT;

    /* JADX INFO: renamed from: tf.a$a, reason: collision with other inner class name */
    public static final class C0571a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f31713a;
        public final d.a b;

        public C0571a(int i10, d.a aVar) {
            this.f31713a = i10;
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
            return this.f31713a == dVar.tag() && this.b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f31713a) + (this.b.hashCode() ^ 2041407134);
        }

        @Override // tf.d
        public d.a intEncoding() {
            return this.b;
        }

        @Override // tf.d
        public int tag() {
            return this.f31713a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f31713a + "intEncoding=" + this.b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0571a(this.f31712a, this.b);
    }

    public a c(int i10) {
        this.f31712a = i10;
        return this;
    }
}
