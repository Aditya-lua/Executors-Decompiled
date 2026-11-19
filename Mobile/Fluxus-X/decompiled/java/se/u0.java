package se;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends se.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f31431a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f31432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final se.c f31433d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f31434a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f31435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public se.c f31436d;

        public static boolean b(c cVar, se.c cVar2) {
            if (cVar.equals(c.b) && (cVar2 instanceof u)) {
                return true;
            }
            if (cVar.equals(c.f31438d) && (cVar2 instanceof e0)) {
                return true;
            }
            if (cVar.equals(c.f31437c) && (cVar2 instanceof t1)) {
                return true;
            }
            if (cVar.equals(c.f31439e) && (cVar2 instanceof k)) {
                return true;
            }
            if (cVar.equals(c.f31440f) && (cVar2 instanceof p)) {
                return true;
            }
            return cVar.equals(c.f31441g) && (cVar2 instanceof z);
        }

        public u0 a() throws GeneralSecurityException {
            if (this.f31434a == null) {
                this.f31434a = d.f31443c;
            }
            if (this.b == null) {
                throw new GeneralSecurityException("kekUri must be set");
            }
            if (this.f31435c == null) {
                throw new GeneralSecurityException("dekParsingStrategy must be set");
            }
            se.c cVar = this.f31436d;
            if (cVar == null) {
                throw new GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            if (cVar.a()) {
                throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
            }
            if (b(this.f31435c, this.f31436d)) {
                return new u0(this.f31434a, this.b, this.f31435c, this.f31436d);
            }
            throw new GeneralSecurityException("Cannot use parsing strategy " + this.f31435c.toString() + " when new keys are picked according to " + this.f31436d + ".");
        }

        public b c(se.c cVar) {
            this.f31436d = cVar;
            return this;
        }

        public b d(c cVar) {
            this.f31435c = cVar;
            return this;
        }

        public b e(String str) {
            this.b = str;
            return this;
        }

        public b f(d dVar) {
            this.f31434a = dVar;
            return this;
        }

        public b() {
        }
    }

    public static final class c {
        public static final c b = new c("ASSUME_AES_GCM");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f31437c = new c("ASSUME_XCHACHA20POLY1305");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f31438d = new c("ASSUME_CHACHA20POLY1305");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f31439e = new c("ASSUME_AES_CTR_HMAC");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f31440f = new c("ASSUME_AES_EAX");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f31441g = new c("ASSUME_AES_GCM_SIV");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31442a;

        public c(String str) {
            this.f31442a = str;
        }

        public String toString() {
            return this.f31442a;
        }
    }

    public static final class d {
        public static final d b = new d("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f31443c = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31444a;

        public d(String str) {
            this.f31444a = str;
        }

        public String toString() {
            return this.f31444a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // re.x
    public boolean a() {
        return this.f31431a != d.f31443c;
    }

    public se.c c() {
        return this.f31433d;
    }

    public String d() {
        return this.b;
    }

    public d e() {
        return this.f31431a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return u0Var.f31432c.equals(this.f31432c) && u0Var.f31433d.equals(this.f31433d) && u0Var.b.equals(this.b) && u0Var.f31431a.equals(this.f31431a);
    }

    public int hashCode() {
        return Objects.hash(u0.class, this.b, this.f31432c, this.f31433d, this.f31431a);
    }

    public String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.b + ", dekParsingStrategy: " + this.f31432c + ", dekParametersForNewKeys: " + this.f31433d + ", variant: " + this.f31431a + ")";
    }

    public u0(d dVar, String str, c cVar, se.c cVar2) {
        this.f31431a = dVar;
        this.b = str;
        this.f31432c = cVar;
        this.f31433d = cVar2;
    }
}
