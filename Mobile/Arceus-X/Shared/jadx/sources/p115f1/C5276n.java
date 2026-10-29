package p115f1;

import android.util.Range;

/* JADX INFO: renamed from: f1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C5276n extends AbstractC5245c2 {

    /* JADX INFO: renamed from: c */
    public final C5235a0 f20404c;

    /* JADX INFO: renamed from: d */
    public final int f20405d;

    /* JADX INFO: renamed from: e */
    public final Range<Integer> f20406e;

    /* JADX INFO: renamed from: f */
    public final int f20407f;

    /* JADX INFO: renamed from: f1.n$b */
    public static final class b extends AbstractC5245c2.a {

        /* JADX INFO: renamed from: a */
        public C5235a0 f20408a;

        /* JADX INFO: renamed from: b */
        public Integer f20409b;

        /* JADX INFO: renamed from: c */
        public Range<Integer> f20410c;

        /* JADX INFO: renamed from: d */
        public Integer f20411d;

        @Override // p115f1.AbstractC5245c2.a
        /* JADX INFO: renamed from: a */
        public AbstractC5245c2 mo24268a() {
            String str = "";
            if (this.f20408a == null) {
                str = " qualitySelector";
            }
            if (this.f20409b == null) {
                str = str + " encodeFrameRate";
            }
            if (this.f20410c == null) {
                str = str + " bitrate";
            }
            if (this.f20411d == null) {
                str = str + " aspectRatio";
            }
            if (str.isEmpty()) {
                return new C5276n(this.f20408a, this.f20409b.intValue(), this.f20410c, this.f20411d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p115f1.AbstractC5245c2.a
        /* JADX INFO: renamed from: b */
        public AbstractC5245c2.a mo24269b(int i10) {
            this.f20411d = Integer.valueOf(i10);
            return this;
        }

        @Override // p115f1.AbstractC5245c2.a
        /* JADX INFO: renamed from: c */
        public AbstractC5245c2.a mo24270c(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f20410c = range;
            return this;
        }

        @Override // p115f1.AbstractC5245c2.a
        /* JADX INFO: renamed from: d */
        public AbstractC5245c2.a mo24271d(int i10) {
            this.f20409b = Integer.valueOf(i10);
            return this;
        }

        @Override // p115f1.AbstractC5245c2.a
        /* JADX INFO: renamed from: e */
        public AbstractC5245c2.a mo24272e(C5235a0 c5235a0) {
            if (c5235a0 == null) {
                throw new NullPointerException("Null qualitySelector");
            }
            this.f20408a = c5235a0;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }

        public b(AbstractC5245c2 abstractC5245c2) {
            this.f20408a = abstractC5245c2.mo24266e();
            this.f20409b = Integer.valueOf(abstractC5245c2.mo24265d());
            this.f20410c = abstractC5245c2.mo24264c();
            this.f20411d = Integer.valueOf(abstractC5245c2.mo24263b());
        }
    }

    @Override // p115f1.AbstractC5245c2
    /* JADX INFO: renamed from: b */
    public int mo24263b() {
        return this.f20407f;
    }

    @Override // p115f1.AbstractC5245c2
    /* JADX INFO: renamed from: c */
    public Range<Integer> mo24264c() {
        return this.f20406e;
    }

    @Override // p115f1.AbstractC5245c2
    /* JADX INFO: renamed from: d */
    public int mo24265d() {
        return this.f20405d;
    }

    @Override // p115f1.AbstractC5245c2
    /* JADX INFO: renamed from: e */
    public C5235a0 mo24266e() {
        return this.f20404c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5245c2) {
            AbstractC5245c2 abstractC5245c2 = (AbstractC5245c2) obj;
            if (this.f20404c.equals(abstractC5245c2.mo24266e()) && this.f20405d == abstractC5245c2.mo24265d() && this.f20406e.equals(abstractC5245c2.mo24264c()) && this.f20407f == abstractC5245c2.mo24263b()) {
                return true;
            }
        }
        return false;
    }

    @Override // p115f1.AbstractC5245c2
    /* JADX INFO: renamed from: f */
    public AbstractC5245c2.a mo24267f() {
        return new b(this);
    }

    public int hashCode() {
        return ((((((this.f20404c.hashCode() ^ 1000003) * 1000003) ^ this.f20405d) * 1000003) ^ this.f20406e.hashCode()) * 1000003) ^ this.f20407f;
    }

    public String toString() {
        return "VideoSpec{qualitySelector=" + this.f20404c + ", encodeFrameRate=" + this.f20405d + ", bitrate=" + this.f20406e + ", aspectRatio=" + this.f20407f + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5276n(C5235a0 c5235a0, int i10, Range<Integer> range, int i11) {
        this.f20404c = c5235a0;
        this.f20405d = i10;
        this.f20406e = range;
        this.f20407f = i11;
    }
}
