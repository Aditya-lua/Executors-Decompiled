package f1;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class g extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f14924a;
    public final f1.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14925c;

    public static final class b extends s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c2 f14926a;
        public f1.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f14927c;

        @Override // f1.s.a
        public s a() {
            c2 c2Var = this.f14926a;
            String str = BuildConfig.FLAVOR;
            if (c2Var == null) {
                str = BuildConfig.FLAVOR + " videoSpec";
            }
            if (this.b == null) {
                str = str + " audioSpec";
            }
            if (this.f14927c == null) {
                str = str + " outputFormat";
            }
            if (str.isEmpty()) {
                return new g(this.f14926a, this.b, this.f14927c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f1.s.a
        public c2 c() {
            c2 c2Var = this.f14926a;
            if (c2Var != null) {
                return c2Var;
            }
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }

        @Override // f1.s.a
        public s.a d(f1.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null audioSpec");
            }
            this.b = aVar;
            return this;
        }

        @Override // f1.s.a
        public s.a e(int i10) {
            this.f14927c = Integer.valueOf(i10);
            return this;
        }

        @Override // f1.s.a
        public s.a f(c2 c2Var) {
            if (c2Var == null) {
                throw new NullPointerException("Null videoSpec");
            }
            this.f14926a = c2Var;
            return this;
        }

        public b() {
        }

        public b(s sVar) {
            this.f14926a = sVar.d();
            this.b = sVar.b();
            this.f14927c = Integer.valueOf(sVar.c());
        }
    }

    @Override // f1.s
    public f1.a b() {
        return this.b;
    }

    @Override // f1.s
    public int c() {
        return this.f14925c;
    }

    @Override // f1.s
    public c2 d() {
        return this.f14924a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f14924a.equals(sVar.d()) && this.b.equals(sVar.b()) && this.f14925c == sVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f14924a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f14925c;
    }

    @Override // f1.s
    public s.a i() {
        return new b(this);
    }

    public String toString() {
        return "MediaSpec{videoSpec=" + this.f14924a + ", audioSpec=" + this.b + ", outputFormat=" + this.f14925c + "}";
    }

    public g(c2 c2Var, f1.a aVar, int i10) {
        this.f14924a = c2Var;
        this.b = aVar;
        this.f14925c = i10;
    }
}
