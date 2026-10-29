package p190i8;

import java.util.Set;

/* JADX INFO: renamed from: i8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6662c extends AbstractC6665f.b {

    /* JADX INFO: renamed from: a */
    public final long f25693a;

    /* JADX INFO: renamed from: b */
    public final long f25694b;

    /* JADX INFO: renamed from: c */
    public final Set<AbstractC6665f.c> f25695c;

    /* JADX INFO: renamed from: i8.c$b */
    public static final class b extends AbstractC6665f.b.a {

        /* JADX INFO: renamed from: a */
        public Long f25696a;

        /* JADX INFO: renamed from: b */
        public Long f25697b;

        /* JADX INFO: renamed from: c */
        public Set<AbstractC6665f.c> f25698c;

        @Override // p190i8.AbstractC6665f.b.a
        /* JADX INFO: renamed from: a */
        public AbstractC6665f.b mo28732a() {
            String str = "";
            if (this.f25696a == null) {
                str = " delta";
            }
            if (this.f25697b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f25698c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C6662c(this.f25696a.longValue(), this.f25697b.longValue(), this.f25698c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p190i8.AbstractC6665f.b.a
        /* JADX INFO: renamed from: b */
        public AbstractC6665f.b.a mo28733b(long j10) {
            this.f25696a = Long.valueOf(j10);
            return this;
        }

        @Override // p190i8.AbstractC6665f.b.a
        /* JADX INFO: renamed from: c */
        public AbstractC6665f.b.a mo28734c(Set<AbstractC6665f.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f25698c = set;
            return this;
        }

        @Override // p190i8.AbstractC6665f.b.a
        /* JADX INFO: renamed from: d */
        public AbstractC6665f.b.a mo28735d(long j10) {
            this.f25697b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // p190i8.AbstractC6665f.b
    /* JADX INFO: renamed from: b */
    public long mo28729b() {
        return this.f25693a;
    }

    @Override // p190i8.AbstractC6665f.b
    /* JADX INFO: renamed from: c */
    public Set<AbstractC6665f.c> mo28730c() {
        return this.f25695c;
    }

    @Override // p190i8.AbstractC6665f.b
    /* JADX INFO: renamed from: d */
    public long mo28731d() {
        return this.f25694b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6665f.b) {
            AbstractC6665f.b bVar = (AbstractC6665f.b) obj;
            if (this.f25693a == bVar.mo28729b() && this.f25694b == bVar.mo28731d() && this.f25695c.equals(bVar.mo28730c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f25693a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f25694b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f25695c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f25693a + ", maxAllowedDelay=" + this.f25694b + ", flags=" + this.f25695c + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6662c(long j10, long j11, Set<AbstractC6665f.c> set) {
        this.f25693a = j10;
        this.f25694b = j11;
        this.f25695c = set;
    }
}
