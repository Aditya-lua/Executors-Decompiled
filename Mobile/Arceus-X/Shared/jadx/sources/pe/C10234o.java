package pe;

import af.C0222h0;
import java.security.GeneralSecurityException;
import p515we.C12364d0;
import p515we.C12382m0;
import p515we.C12389q;
import p515we.C12392r0;

/* JADX INFO: renamed from: pe.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C10234o {

    /* JADX INFO: renamed from: a */
    public final C0222h0 f36837a = null;

    /* JADX INFO: renamed from: b */
    public final AbstractC10243x f36838b;

    public C10234o(AbstractC10243x abstractC10243x) {
        this.f36838b = abstractC10243x;
    }

    /* JADX INFO: renamed from: a */
    public static C10234o m39339a(AbstractC10243x abstractC10243x) {
        return new C10234o(abstractC10243x);
    }

    /* JADX INFO: renamed from: b */
    public C0222h0 m39340b() {
        try {
            return m39341c();
        } catch (GeneralSecurityException e10) {
            throw new C12392r0("Parsing parameters failed in getProto(). You probably want to call some Tink register function for " + this.f36838b, e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public C0222h0 m39341c() {
        C0222h0 c0222h0 = this.f36837a;
        if (c0222h0 != null) {
            return c0222h0;
        }
        AbstractC10243x abstractC10243x = this.f36838b;
        return abstractC10243x instanceof C12389q ? ((C12389q) abstractC10243x).m46421b().m46404d() : ((C12382m0) C12364d0.m46238c().m46250o(this.f36838b, C12382m0.class)).m46404d();
    }

    /* JADX INFO: renamed from: d */
    public AbstractC10243x m39342d() {
        AbstractC10243x abstractC10243x = this.f36838b;
        return abstractC10243x != null ? abstractC10243x : C10226h0.m39315a(m39340b().m13375n());
    }
}
