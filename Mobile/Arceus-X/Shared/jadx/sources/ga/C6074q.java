package ga;

/* JADX INFO: renamed from: ga.q */
/* JADX INFO: loaded from: classes.dex */
public final class C6074q {

    /* JADX INFO: renamed from: d */
    public static final C6074q f23372d = new C6074q(new C6073p(null));

    /* JADX INFO: renamed from: a */
    public final boolean f23373a;

    /* JADX INFO: renamed from: b */
    public final boolean f23374b;

    /* JADX INFO: renamed from: c */
    public final boolean f23375c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6074q(C6073p c6073p) {
        this.f23373a = c6073p.m26937e();
        this.f23374b = c6073p.m26938f();
        this.f23375c = c6073p.m26939g();
    }

    /* JADX INFO: renamed from: d */
    public static C6073p m26940d() {
        return new C6073p(null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m26941a() {
        return this.f23373a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m26942b() {
        return this.f23374b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m26943c() {
        return this.f23375c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6074q.class == obj.getClass()) {
            C6074q c6074q = (C6074q) obj;
            if (this.f23373a == c6074q.f23373a && this.f23374b == c6074q.f23374b && this.f23375c == c6074q.f23375c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f23373a ? 1 : 0) * 31) + (this.f23374b ? 1 : 0)) * 31) + (this.f23375c ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 ga.p) A[MD:(ga.p):void (m)] (LINE:2) call: ga.q.<init>(ga.p):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C6074q(C6073p c6073p, byte[] bArr) {
        this(c6073p);
    }
}
