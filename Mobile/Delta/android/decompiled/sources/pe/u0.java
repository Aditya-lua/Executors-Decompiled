package pe;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends pe.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f28552a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f28553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pe.c f28554d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f28555a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f28556c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public pe.c f28557d;

        public static boolean b(c cVar, pe.c cVar2) {
            if (cVar.equals(c.b) && (cVar2 instanceof u)) {
                return true;
            }
            if (cVar.equals(c.f28559d) && (cVar2 instanceof e0)) {
                return true;
            }
            if (cVar.equals(c.f28558c) && (cVar2 instanceof t1)) {
                return true;
            }
            if (cVar.equals(c.f28560e) && (cVar2 instanceof k)) {
                return true;
            }
            if (cVar.equals(c.f28561f) && (cVar2 instanceof p)) {
                return true;
            }
            return cVar.equals(c.f28562g) && (cVar2 instanceof z);
        }

        public u0 a() throws GeneralSecurityException {
            if (this.f28555a == null) {
                this.f28555a = d.f28564c;
            }
            if (this.b == null) {
                throw new GeneralSecurityException("kekUri must be set");
            }
            if (this.f28556c == null) {
                throw new GeneralSecurityException("dekParsingStrategy must be set");
            }
            pe.c cVar = this.f28557d;
            if (cVar == null) {
                throw new GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            if (cVar.a()) {
                throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
            }
            if (b(this.f28556c, this.f28557d)) {
                return new u0(this.f28555a, this.b, this.f28556c, this.f28557d);
            }
            throw new GeneralSecurityException("Cannot use parsing strategy " + this.f28556c.toString() + " when new keys are picked according to " + this.f28557d + ".");
        }

        public b c(pe.c cVar) {
            this.f28557d = cVar;
            return this;
        }

        public b d(c cVar) {
            this.f28556c = cVar;
            return this;
        }

        public b e(String str) {
            this.b = str;
            return this;
        }

        public b f(d dVar) {
            this.f28555a = dVar;
            return this;
        }

        public b() {
        }
    }

    public static final class c {
        public static final c b = new c("ASSUME_AES_GCM");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f28558c = new c("ASSUME_XCHACHA20POLY1305");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f28559d = new c("ASSUME_CHACHA20POLY1305");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f28560e = new c("ASSUME_AES_CTR_HMAC");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f28561f = new c("ASSUME_AES_EAX");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f28562g = new c("ASSUME_AES_GCM_SIV");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28563a;

        public c(String str) {
            this.f28563a = str;
        }

        public String toString() {
            return this.f28563a;
        }
    }

    public static final class d {
        public static final d b = new d("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f28564c = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28565a;

        public d(String str) {
            this.f28565a = str;
        }

        public String toString() {
            return this.f28565a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // oe.x
    public boolean a() {
        return this.f28552a != d.f28564c;
    }

    public pe.c c() {
        return this.f28554d;
    }

    public String d() {
        return this.b;
    }

    public d e() {
        return this.f28552a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return u0Var.f28553c.equals(this.f28553c) && u0Var.f28554d.equals(this.f28554d) && u0Var.b.equals(this.b) && u0Var.f28552a.equals(this.f28552a);
    }

    public int hashCode() {
        return Objects.hash(u0.class, this.b, this.f28553c, this.f28554d, this.f28552a);
    }

    public String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.b + ", dekParsingStrategy: " + this.f28553c + ", dekParametersForNewKeys: " + this.f28554d + ", variant: " + this.f28552a + ")";
    }

    public u0(d dVar, String str, c cVar, pe.c cVar2) {
        this.f28552a = dVar;
        this.b = str;
        this.f28553c = cVar;
        this.f28554d = cVar2;
    }
}
