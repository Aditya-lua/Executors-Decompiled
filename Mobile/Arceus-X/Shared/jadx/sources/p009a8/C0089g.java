package p009a8;

import java.util.List;

/* JADX INFO: renamed from: a8.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0089g extends AbstractC0095m {

    /* JADX INFO: renamed from: a */
    public final long f245a;

    /* JADX INFO: renamed from: b */
    public final long f246b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0093k f247c;

    /* JADX INFO: renamed from: d */
    public final Integer f248d;

    /* JADX INFO: renamed from: e */
    public final String f249e;

    /* JADX INFO: renamed from: f */
    public final List<AbstractC0094l> f250f;

    /* JADX INFO: renamed from: g */
    public final EnumC0098p f251g;

    /* JADX INFO: renamed from: a8.g$b */
    public static final class b extends AbstractC0095m.a {

        /* JADX INFO: renamed from: a */
        public Long f252a;

        /* JADX INFO: renamed from: b */
        public Long f253b;

        /* JADX INFO: renamed from: c */
        public AbstractC0093k f254c;

        /* JADX INFO: renamed from: d */
        public Integer f255d;

        /* JADX INFO: renamed from: e */
        public String f256e;

        /* JADX INFO: renamed from: f */
        public List<AbstractC0094l> f257f;

        /* JADX INFO: renamed from: g */
        public EnumC0098p f258g;

        @Override // p009a8.AbstractC0095m.a
        /* JADX INFO: renamed from: a */
        public AbstractC0095m mo267a() {
            String str = "";
            if (this.f252a == null) {
                str = " requestTimeMs";
            }
            if (this.f253b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C0089g(this.f252a.longValue(), this.f253b.longValue(), this.f254c, this.f255d, this.f256e, this.f257f, this.f258g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p009a8.AbstractC0095m.a
        /* JADX INFO: renamed from: b */
        public AbstractC0095m.a mo268b(AbstractC0093k abstractC0093k) {
            this.f254c = abstractC0093k;
            return this;
        }

        @Override // p009a8.AbstractC0095m.a
        /* JADX INFO: renamed from: c */
        public AbstractC0095m.a mo269c(List<AbstractC0094l> list) {
            this.f257f = list;
            return this;
        }

        @Override // p009a8.AbstractC0095m.a
        /* JADX INFO: renamed from: d */
        public AbstractC0095m.a mo270d(Integer num) {
            this.f255d = num;
            return this;
        }

        @Override // p009a8.AbstractC0095m.a
        /* JADX INFO: renamed from: e */
        public AbstractC0095m.a mo271e(String str) {
            this.f256e = str;
            return this;
        }

        @Override // p009a8.AbstractC0095m.a
        /* JADX INFO: renamed from: f */
        public AbstractC0095m.a mo272f(EnumC0098p enumC0098p) {
            this.f258g = enumC0098p;
            return this;
        }

        @Override // p009a8.AbstractC0095m.a
        /* JADX INFO: renamed from: g */
        public AbstractC0095m.a mo273g(long j10) {
            this.f252a = Long.valueOf(j10);
            return this;
        }

        @Override // p009a8.AbstractC0095m.a
        /* JADX INFO: renamed from: h */
        public AbstractC0095m.a mo274h(long j10) {
            this.f253b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // p009a8.AbstractC0095m
    /* JADX INFO: renamed from: b */
    public AbstractC0093k mo260b() {
        return this.f247c;
    }

    @Override // p009a8.AbstractC0095m
    /* JADX INFO: renamed from: c */
    public List<AbstractC0094l> mo261c() {
        return this.f250f;
    }

    @Override // p009a8.AbstractC0095m
    /* JADX INFO: renamed from: d */
    public Integer mo262d() {
        return this.f248d;
    }

    @Override // p009a8.AbstractC0095m
    /* JADX INFO: renamed from: e */
    public String mo263e() {
        return this.f249e;
    }

    public boolean equals(Object obj) {
        AbstractC0093k abstractC0093k;
        Integer num;
        String str;
        List<AbstractC0094l> list;
        EnumC0098p enumC0098p;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0095m) {
            AbstractC0095m abstractC0095m = (AbstractC0095m) obj;
            if (this.f245a == abstractC0095m.mo265g() && this.f246b == abstractC0095m.mo266h() && ((abstractC0093k = this.f247c) != null ? abstractC0093k.equals(abstractC0095m.mo260b()) : abstractC0095m.mo260b() == null) && ((num = this.f248d) != null ? num.equals(abstractC0095m.mo262d()) : abstractC0095m.mo262d() == null) && ((str = this.f249e) != null ? str.equals(abstractC0095m.mo263e()) : abstractC0095m.mo263e() == null) && ((list = this.f250f) != null ? list.equals(abstractC0095m.mo261c()) : abstractC0095m.mo261c() == null) && ((enumC0098p = this.f251g) != null ? enumC0098p.equals(abstractC0095m.mo264f()) : abstractC0095m.mo264f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // p009a8.AbstractC0095m
    /* JADX INFO: renamed from: f */
    public EnumC0098p mo264f() {
        return this.f251g;
    }

    @Override // p009a8.AbstractC0095m
    /* JADX INFO: renamed from: g */
    public long mo265g() {
        return this.f245a;
    }

    @Override // p009a8.AbstractC0095m
    /* JADX INFO: renamed from: h */
    public long mo266h() {
        return this.f246b;
    }

    public int hashCode() {
        long j10 = this.f245a;
        long j11 = this.f246b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        AbstractC0093k abstractC0093k = this.f247c;
        int iHashCode = (i10 ^ (abstractC0093k == null ? 0 : abstractC0093k.hashCode())) * 1000003;
        Integer num = this.f248d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f249e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<AbstractC0094l> list = this.f250f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        EnumC0098p enumC0098p = this.f251g;
        return iHashCode4 ^ (enumC0098p != null ? enumC0098p.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f245a + ", requestUptimeMs=" + this.f246b + ", clientInfo=" + this.f247c + ", logSource=" + this.f248d + ", logSourceName=" + this.f249e + ", logEvents=" + this.f250f + ", qosTier=" + this.f251g + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0089g(long j10, long j11, AbstractC0093k abstractC0093k, Integer num, String str, List<AbstractC0094l> list, EnumC0098p enumC0098p) {
        this.f245a = j10;
        this.f246b = j11;
        this.f247c = abstractC0093k;
        this.f248d = num;
        this.f249e = str;
        this.f250f = list;
        this.f251g = enumC0098p;
    }
}
