package p544xe;

import java.security.GeneralSecurityException;
import p102ef.C5109a;
import p102ef.C5111c;
import p515we.C12366e0;

/* JADX INFO: renamed from: xe.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C12811i extends AbstractC12819q {

    /* JADX INFO: renamed from: a */
    public final C12817o f45571a;

    /* JADX INFO: renamed from: b */
    public final C5111c f45572b;

    /* JADX INFO: renamed from: c */
    public final C5109a f45573c;

    /* JADX INFO: renamed from: d */
    public final Integer f45574d;

    /* JADX INFO: renamed from: xe.i$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public C12817o f45575a;

        /* JADX INFO: renamed from: b */
        public C5111c f45576b;

        /* JADX INFO: renamed from: c */
        public Integer f45577c;

        /* JADX INFO: renamed from: a */
        public C12811i m47714a() throws GeneralSecurityException {
            C12817o c12817o = this.f45575a;
            if (c12817o == null || this.f45576b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c12817o.m47727e() != this.f45576b.m23855c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f45575a.mo7230a() && this.f45577c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f45575a.mo7230a() && this.f45577c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C12811i(this.f45575a, this.f45576b, m47715b(), this.f45577c);
        }

        /* JADX INFO: renamed from: b */
        public final C5109a m47715b() {
            if (this.f45575a.m47729g() == C12817o.d.f45601e) {
                return C12366e0.f44235a;
            }
            if (this.f45575a.m47729g() == C12817o.d.f45600d || this.f45575a.m47729g() == C12817o.d.f45599c) {
                return C12366e0.m46287a(this.f45577c.intValue());
            }
            if (this.f45575a.m47729g() == C12817o.d.f45598b) {
                return C12366e0.m46288b(this.f45577c.intValue());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f45575a.m47729g());
        }

        /* JADX INFO: renamed from: c */
        public b m47716c(Integer num) {
            this.f45577c = num;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m47717d(C5111c c5111c) {
            this.f45576b = c5111c;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m47718e(C12817o c12817o) {
            this.f45575a = c12817o;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f45575a = null;
            this.f45576b = null;
            this.f45577c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static b m47710b() {
        return new b();
    }

    @Override // pe.AbstractC10231l
    /* JADX INFO: renamed from: a */
    public Integer mo7250a() {
        return this.f45574d;
    }

    /* JADX INFO: renamed from: c */
    public C5111c m47711c() {
        return this.f45572b;
    }

    /* JADX INFO: renamed from: d */
    public C5109a m47712d() {
        return this.f45573c;
    }

    /* JADX INFO: renamed from: e */
    public C12817o m47713e() {
        return this.f45571a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12811i(C12817o c12817o, C5111c c5111c, C5109a c5109a, Integer num) {
        this.f45571a = c12817o;
        this.f45572b = c5111c;
        this.f45573c = c5109a;
        this.f45574d = num;
    }
}
