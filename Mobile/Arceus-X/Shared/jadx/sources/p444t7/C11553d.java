package p444t7;

/* JADX INFO: renamed from: t7.d */
/* JADX INFO: loaded from: classes3.dex */
public class C11553d {

    /* JADX INFO: renamed from: a */
    public float f40914a;

    /* JADX INFO: renamed from: b */
    public float f40915b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C11553d(float f10, float f11) {
        this.f40914a = f10;
        this.f40915b = f11;
    }

    /* JADX INFO: renamed from: a */
    public boolean m43197a(float f10, float f11) {
        return this.f40914a == f10 && this.f40915b == f11;
    }

    /* JADX INFO: renamed from: b */
    public float m43198b() {
        return this.f40914a;
    }

    /* JADX INFO: renamed from: c */
    public float m43199c() {
        return this.f40915b;
    }

    /* JADX INFO: renamed from: d */
    public void m43200d(float f10, float f11) {
        this.f40914a = f10;
        this.f40915b = f11;
    }

    public String toString() {
        return m43198b() + "x" + m43199c();
    }

    public C11553d() {
        this(1.0f, 1.0f);
    }
}
