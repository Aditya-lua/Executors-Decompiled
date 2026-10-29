package p544xe;

import java.security.GeneralSecurityException;
import p102ef.C5109a;
import p102ef.C5111c;
import p515we.C12366e0;

/* JADX INFO: renamed from: xe.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C12803a extends AbstractC12819q {

    /* JADX INFO: renamed from: a */
    public final C12808f f45547a;

    /* JADX INFO: renamed from: b */
    public final C5111c f45548b;

    /* JADX INFO: renamed from: c */
    public final C5109a f45549c;

    /* JADX INFO: renamed from: d */
    public final Integer f45550d;

    /* JADX INFO: renamed from: xe.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public C12808f f45551a;

        /* JADX INFO: renamed from: b */
        public C5111c f45552b;

        /* JADX INFO: renamed from: c */
        public Integer f45553c;

        /* JADX INFO: renamed from: a */
        public C12803a m47685a() throws GeneralSecurityException {
            C12808f c12808f = this.f45551a;
            if (c12808f == null || this.f45552b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c12808f.m47701d() != this.f45552b.m23855c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f45551a.mo7230a() && this.f45553c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f45551a.mo7230a() && this.f45553c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C12803a(this.f45551a, this.f45552b, m47686b(), this.f45553c);
        }

        /* JADX INFO: renamed from: b */
        public final C5109a m47686b() {
            if (this.f45551a.m47703f() == C12808f.c.f45567e) {
                return C12366e0.f44235a;
            }
            if (this.f45551a.m47703f() == C12808f.c.f45566d || this.f45551a.m47703f() == C12808f.c.f45565c) {
                return C12366e0.m46287a(this.f45553c.intValue());
            }
            if (this.f45551a.m47703f() == C12808f.c.f45564b) {
                return C12366e0.m46288b(this.f45553c.intValue());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f45551a.m47703f());
        }

        /* JADX INFO: renamed from: c */
        public b m47687c(C5111c c5111c) {
            this.f45552b = c5111c;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m47688d(Integer num) {
            this.f45553c = num;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m47689e(C12808f c12808f) {
            this.f45551a = c12808f;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f45551a = null;
            this.f45552b = null;
            this.f45553c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static b m47681b() {
        return new b();
    }

    @Override // pe.AbstractC10231l
    /* JADX INFO: renamed from: a */
    public Integer mo7250a() {
        return this.f45550d;
    }

    /* JADX INFO: renamed from: c */
    public C5111c m47682c() {
        return this.f45548b;
    }

    /* JADX INFO: renamed from: d */
    public C5109a m47683d() {
        return this.f45549c;
    }

    /* JADX INFO: renamed from: e */
    public C12808f m47684e() {
        return this.f45547a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12803a(C12808f c12808f, C5111c c5111c, C5109a c5109a, Integer num) {
        this.f45547a = c12808f;
        this.f45548b = c5111c;
        this.f45549c = c5109a;
        this.f45550d = num;
    }
}
