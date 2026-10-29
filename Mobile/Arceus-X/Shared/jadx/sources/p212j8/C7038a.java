package p212j8;

/* JADX INFO: renamed from: j8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7038a extends AbstractC7046e {

    /* JADX INFO: renamed from: b */
    public final long f27602b;

    /* JADX INFO: renamed from: c */
    public final int f27603c;

    /* JADX INFO: renamed from: d */
    public final int f27604d;

    /* JADX INFO: renamed from: e */
    public final long f27605e;

    /* JADX INFO: renamed from: f */
    public final int f27606f;

    /* JADX INFO: renamed from: j8.a$b */
    public static final class b extends AbstractC7046e.a {

        /* JADX INFO: renamed from: a */
        public Long f27607a;

        /* JADX INFO: renamed from: b */
        public Integer f27608b;

        /* JADX INFO: renamed from: c */
        public Integer f27609c;

        /* JADX INFO: renamed from: d */
        public Long f27610d;

        /* JADX INFO: renamed from: e */
        public Integer f27611e;

        @Override // p212j8.AbstractC7046e.a
        /* JADX INFO: renamed from: a */
        public AbstractC7046e mo29740a() {
            String str = "";
            if (this.f27607a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f27608b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f27609c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f27610d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f27611e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C7038a(this.f27607a.longValue(), this.f27608b.intValue(), this.f27609c.intValue(), this.f27610d.longValue(), this.f27611e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p212j8.AbstractC7046e.a
        /* JADX INFO: renamed from: b */
        public AbstractC7046e.a mo29741b(int i10) {
            this.f27609c = Integer.valueOf(i10);
            return this;
        }

        @Override // p212j8.AbstractC7046e.a
        /* JADX INFO: renamed from: c */
        public AbstractC7046e.a mo29742c(long j10) {
            this.f27610d = Long.valueOf(j10);
            return this;
        }

        @Override // p212j8.AbstractC7046e.a
        /* JADX INFO: renamed from: d */
        public AbstractC7046e.a mo29743d(int i10) {
            this.f27608b = Integer.valueOf(i10);
            return this;
        }

        @Override // p212j8.AbstractC7046e.a
        /* JADX INFO: renamed from: e */
        public AbstractC7046e.a mo29744e(int i10) {
            this.f27611e = Integer.valueOf(i10);
            return this;
        }

        @Override // p212j8.AbstractC7046e.a
        /* JADX INFO: renamed from: f */
        public AbstractC7046e.a mo29745f(long j10) {
            this.f27607a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // p212j8.AbstractC7046e
    /* JADX INFO: renamed from: b */
    public int mo29735b() {
        return this.f27604d;
    }

    @Override // p212j8.AbstractC7046e
    /* JADX INFO: renamed from: c */
    public long mo29736c() {
        return this.f27605e;
    }

    @Override // p212j8.AbstractC7046e
    /* JADX INFO: renamed from: d */
    public int mo29737d() {
        return this.f27603c;
    }

    @Override // p212j8.AbstractC7046e
    /* JADX INFO: renamed from: e */
    public int mo29738e() {
        return this.f27606f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7046e) {
            AbstractC7046e abstractC7046e = (AbstractC7046e) obj;
            if (this.f27602b == abstractC7046e.mo29739f() && this.f27603c == abstractC7046e.mo29737d() && this.f27604d == abstractC7046e.mo29735b() && this.f27605e == abstractC7046e.mo29736c() && this.f27606f == abstractC7046e.mo29738e()) {
                return true;
            }
        }
        return false;
    }

    @Override // p212j8.AbstractC7046e
    /* JADX INFO: renamed from: f */
    public long mo29739f() {
        return this.f27602b;
    }

    public int hashCode() {
        long j10 = this.f27602b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f27603c) * 1000003) ^ this.f27604d) * 1000003;
        long j11 = this.f27605e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f27606f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f27602b + ", loadBatchSize=" + this.f27603c + ", criticalSectionEnterTimeoutMs=" + this.f27604d + ", eventCleanUpAge=" + this.f27605e + ", maxBlobByteSizePerRow=" + this.f27606f + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7038a(long j10, int i10, int i11, long j11, int i12) {
        this.f27602b = j10;
        this.f27603c = i10;
        this.f27604d = i11;
        this.f27605e = j11;
        this.f27606f = i12;
    }
}
