package p296n0;

/* JADX INFO: renamed from: n0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C8813r extends AbstractC8822s3.a {

    /* JADX INFO: renamed from: a */
    public final Throwable f32053a;

    public C8813r(Throwable th2) {
        if (th2 == null) {
            throw new NullPointerException("Null error");
        }
        this.f32053a = th2;
    }

    @Override // p296n0.AbstractC8822s3.a
    /* JADX INFO: renamed from: a */
    public Throwable mo35389a() {
        return this.f32053a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8822s3.a) {
            return this.f32053a.equals(((AbstractC8822s3.a) obj).mo35389a());
        }
        return false;
    }

    public int hashCode() {
        return this.f32053a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.f32053a + "}";
    }
}
