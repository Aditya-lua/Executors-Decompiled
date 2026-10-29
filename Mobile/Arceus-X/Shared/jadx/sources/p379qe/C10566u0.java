package p379qe;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: renamed from: qe.u0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10566u0 extends AbstractC10511c {

    /* JADX INFO: renamed from: a */
    public final d f37898a;

    /* JADX INFO: renamed from: b */
    public final String f37899b;

    /* JADX INFO: renamed from: c */
    public final c f37900c;

    /* JADX INFO: renamed from: d */
    public final AbstractC10511c f37901d;

    /* JADX INFO: renamed from: qe.u0$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public d f37902a;

        /* JADX INFO: renamed from: b */
        public String f37903b;

        /* JADX INFO: renamed from: c */
        public c f37904c;

        /* JADX INFO: renamed from: d */
        public AbstractC10511c f37905d;

        /* JADX INFO: renamed from: b */
        public static boolean m40509b(c cVar, AbstractC10511c abstractC10511c) {
            if (cVar.equals(c.f37906b) && (abstractC10511c instanceof C10565u)) {
                return true;
            }
            if (cVar.equals(c.f37908d) && (abstractC10511c instanceof C10518e0)) {
                return true;
            }
            if (cVar.equals(c.f37907c) && (abstractC10511c instanceof C10564t1)) {
                return true;
            }
            if (cVar.equals(c.f37909e) && (abstractC10511c instanceof C10535k)) {
                return true;
            }
            if (cVar.equals(c.f37910f) && (abstractC10511c instanceof C10550p)) {
                return true;
            }
            return cVar.equals(c.f37911g) && (abstractC10511c instanceof C10575z);
        }

        /* JADX INFO: renamed from: a */
        public C10566u0 m40510a() throws GeneralSecurityException {
            if (this.f37902a == null) {
                this.f37902a = d.f37914c;
            }
            if (this.f37903b == null) {
                throw new GeneralSecurityException("kekUri must be set");
            }
            if (this.f37904c == null) {
                throw new GeneralSecurityException("dekParsingStrategy must be set");
            }
            AbstractC10511c abstractC10511c = this.f37905d;
            if (abstractC10511c == null) {
                throw new GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            if (abstractC10511c.mo7230a()) {
                throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
            }
            if (m40509b(this.f37904c, this.f37905d)) {
                return new C10566u0(this.f37902a, this.f37903b, this.f37904c, this.f37905d);
            }
            throw new GeneralSecurityException("Cannot use parsing strategy " + this.f37904c.toString() + " when new keys are picked according to " + this.f37905d + ".");
        }

        /* JADX INFO: renamed from: c */
        public b m40511c(AbstractC10511c abstractC10511c) {
            this.f37905d = abstractC10511c;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m40512d(c cVar) {
            this.f37904c = cVar;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m40513e(String str) {
            this.f37903b = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public b m40514f(d dVar) {
            this.f37902a = dVar;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    /* JADX INFO: renamed from: qe.u0$c */
    public static final class c {

        /* JADX INFO: renamed from: b */
        public static final c f37906b = new c("ASSUME_AES_GCM");

        /* JADX INFO: renamed from: c */
        public static final c f37907c = new c("ASSUME_XCHACHA20POLY1305");

        /* JADX INFO: renamed from: d */
        public static final c f37908d = new c("ASSUME_CHACHA20POLY1305");

        /* JADX INFO: renamed from: e */
        public static final c f37909e = new c("ASSUME_AES_CTR_HMAC");

        /* JADX INFO: renamed from: f */
        public static final c f37910f = new c("ASSUME_AES_EAX");

        /* JADX INFO: renamed from: g */
        public static final c f37911g = new c("ASSUME_AES_GCM_SIV");

        /* JADX INFO: renamed from: a */
        public final String f37912a;

        public c(String str) {
            this.f37912a = str;
        }

        public String toString() {
            return this.f37912a;
        }
    }

    /* JADX INFO: renamed from: qe.u0$d */
    public static final class d {

        /* JADX INFO: renamed from: b */
        public static final d f37913b = new d("TINK");

        /* JADX INFO: renamed from: c */
        public static final d f37914c = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a */
        public final String f37915a;

        public d(String str) {
            this.f37915a = str;
        }

        public String toString() {
            return this.f37915a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static b m40505b() {
        return new b();
    }

    @Override // pe.AbstractC10243x
    /* JADX INFO: renamed from: a */
    public boolean mo7230a() {
        return this.f37898a != d.f37914c;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC10511c m40506c() {
        return this.f37901d;
    }

    /* JADX INFO: renamed from: d */
    public String m40507d() {
        return this.f37899b;
    }

    /* JADX INFO: renamed from: e */
    public d m40508e() {
        return this.f37898a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10566u0)) {
            return false;
        }
        C10566u0 c10566u0 = (C10566u0) obj;
        return c10566u0.f37900c.equals(this.f37900c) && c10566u0.f37901d.equals(this.f37901d) && c10566u0.f37899b.equals(this.f37899b) && c10566u0.f37898a.equals(this.f37898a);
    }

    public int hashCode() {
        return Objects.hash(C10566u0.class, this.f37899b, this.f37900c, this.f37901d, this.f37898a);
    }

    public String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f37899b + ", dekParsingStrategy: " + this.f37900c + ", dekParametersForNewKeys: " + this.f37901d + ", variant: " + this.f37898a + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10566u0(d dVar, String str, c cVar, AbstractC10511c abstractC10511c) {
        this.f37898a = dVar;
        this.f37899b = str;
        this.f37900c = cVar;
        this.f37901d = abstractC10511c;
    }
}
