package qe;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends qe.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f29800a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f29801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qe.c f29802d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f29803a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f29804c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public qe.c f29805d;

        public static boolean b(c cVar, qe.c cVar2) {
            if (cVar.equals(c.b) && (cVar2 instanceof u)) {
                return true;
            }
            if (cVar.equals(c.f29807d) && (cVar2 instanceof e0)) {
                return true;
            }
            if (cVar.equals(c.f29806c) && (cVar2 instanceof t1)) {
                return true;
            }
            if (cVar.equals(c.f29808e) && (cVar2 instanceof k)) {
                return true;
            }
            if (cVar.equals(c.f29809f) && (cVar2 instanceof p)) {
                return true;
            }
            return cVar.equals(c.f29810g) && (cVar2 instanceof z);
        }

        public u0 a() throws GeneralSecurityException {
            if (this.f29803a == null) {
                this.f29803a = d.f29812c;
            }
            if (this.b == null) {
                throw new GeneralSecurityException("kekUri must be set");
            }
            if (this.f29804c == null) {
                throw new GeneralSecurityException("dekParsingStrategy must be set");
            }
            qe.c cVar = this.f29805d;
            if (cVar == null) {
                throw new GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            if (cVar.a()) {
                throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
            }
            if (b(this.f29804c, this.f29805d)) {
                return new u0(this.f29803a, this.b, this.f29804c, this.f29805d);
            }
            throw new GeneralSecurityException("Cannot use parsing strategy " + this.f29804c.toString() + " when new keys are picked according to " + this.f29805d + ".");
        }

        public b c(qe.c cVar) {
            this.f29805d = cVar;
            return this;
        }

        public b d(c cVar) {
            this.f29804c = cVar;
            return this;
        }

        public b e(String str) {
            this.b = str;
            return this;
        }

        public b f(d dVar) {
            this.f29803a = dVar;
            return this;
        }

        public b() {
        }
    }

    public static final class c {
        public static final c b = new c("ASSUME_AES_GCM");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f29806c = new c("ASSUME_XCHACHA20POLY1305");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f29807d = new c("ASSUME_CHACHA20POLY1305");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f29808e = new c("ASSUME_AES_CTR_HMAC");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f29809f = new c("ASSUME_AES_EAX");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f29810g = new c("ASSUME_AES_GCM_SIV");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29811a;

        public c(String str) {
            this.f29811a = str;
        }

        public String toString() {
            return this.f29811a;
        }
    }

    public static final class d {
        public static final d b = new d("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f29812c = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29813a;

        public d(String str) {
            this.f29813a = str;
        }

        public String toString() {
            return this.f29813a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.x
    public boolean a() {
        return this.f29800a != d.f29812c;
    }

    public qe.c c() {
        return this.f29802d;
    }

    public String d() {
        return this.b;
    }

    public d e() {
        return this.f29800a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return u0Var.f29801c.equals(this.f29801c) && u0Var.f29802d.equals(this.f29802d) && u0Var.b.equals(this.b) && u0Var.f29800a.equals(this.f29800a);
    }

    public int hashCode() {
        return Objects.hash(u0.class, this.b, this.f29801c, this.f29802d, this.f29800a);
    }

    public String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.b + ", dekParsingStrategy: " + this.f29801c + ", dekParametersForNewKeys: " + this.f29802d + ", variant: " + this.f29800a + ")";
    }

    public u0(d dVar, String str, c cVar, qe.c cVar2) {
        this.f29800a = dVar;
        this.b = str;
        this.f29801c = cVar;
        this.f29802d = cVar2;
    }
}
