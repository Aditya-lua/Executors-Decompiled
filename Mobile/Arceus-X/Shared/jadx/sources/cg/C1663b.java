package cg;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: cg.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1663b extends AbstractC1667f {

    /* JADX INFO: renamed from: a */
    public final String f6413a;

    /* JADX INFO: renamed from: b */
    public final long f6414b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1667f.b f6415c;

    /* JADX INFO: renamed from: cg.b$b */
    public static final class b extends AbstractC1667f.a {

        /* JADX INFO: renamed from: a */
        public String f6416a;

        /* JADX INFO: renamed from: b */
        public long f6417b;

        /* JADX INFO: renamed from: c */
        public AbstractC1667f.b f6418c;

        /* JADX INFO: renamed from: d */
        public byte f6419d;

        @Override // cg.AbstractC1667f.a
        /* JADX INFO: renamed from: a */
        public AbstractC1667f mo8339a() {
            if (this.f6419d == 1) {
                return new C1663b(this.f6416a, this.f6417b, this.f6418c);
            }
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }

        @Override // cg.AbstractC1667f.a
        /* JADX INFO: renamed from: b */
        public AbstractC1667f.a mo8340b(AbstractC1667f.b bVar) {
            this.f6418c = bVar;
            return this;
        }

        @Override // cg.AbstractC1667f.a
        /* JADX INFO: renamed from: c */
        public AbstractC1667f.a mo8341c(String str) {
            this.f6416a = str;
            return this;
        }

        @Override // cg.AbstractC1667f.a
        /* JADX INFO: renamed from: d */
        public AbstractC1667f.a mo8342d(long j10) {
            this.f6417b = j10;
            this.f6419d = (byte) (this.f6419d | 1);
            return this;
        }
    }

    @Override // cg.AbstractC1667f
    /* JADX INFO: renamed from: b */
    public AbstractC1667f.b mo8336b() {
        return this.f6415c;
    }

    @Override // cg.AbstractC1667f
    /* JADX INFO: renamed from: c */
    public String mo8337c() {
        return this.f6413a;
    }

    @Override // cg.AbstractC1667f
    @NonNull
    /* JADX INFO: renamed from: d */
    public long mo8338d() {
        return this.f6414b;
    }

    public boolean equals(Object obj) {
        AbstractC1667f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1667f) {
            AbstractC1667f abstractC1667f = (AbstractC1667f) obj;
            String str = this.f6413a;
            if (str != null ? str.equals(abstractC1667f.mo8337c()) : abstractC1667f.mo8337c() == null) {
                if (this.f6414b == abstractC1667f.mo8338d() && ((bVar = this.f6415c) != null ? bVar.equals(abstractC1667f.mo8336b()) : abstractC1667f.mo8336b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f6413a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f6414b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        AbstractC1667f.b bVar = this.f6415c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f6413a + ", tokenExpirationTimestamp=" + this.f6414b + ", responseCode=" + this.f6415c + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1663b(String str, long j10, AbstractC1667f.b bVar) {
        this.f6413a = str;
        this.f6414b = j10;
        this.f6415c = bVar;
    }
}
