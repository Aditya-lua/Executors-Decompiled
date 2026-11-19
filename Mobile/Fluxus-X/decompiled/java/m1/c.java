package m1;

import com.github.luben.zstd.BuildConfig;
import n0.a4;

/* JADX INFO: loaded from: classes.dex */
public final class c extends m1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22714a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4 f22715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22719g;

    public static final class b extends m1.a.AbstractC0450a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f22720a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a4 f22721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f22722d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f22723e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Integer f22724f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f22725g;

        @Override // m1.a.AbstractC0450a
        public m1.a a() {
            String str = this.f22720a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " mimeType";
            }
            if (this.b == null) {
                str2 = str2 + " profile";
            }
            if (this.f22721c == null) {
                str2 = str2 + " inputTimebase";
            }
            if (this.f22722d == null) {
                str2 = str2 + " bitrate";
            }
            if (this.f22723e == null) {
                str2 = str2 + " captureSampleRate";
            }
            if (this.f22724f == null) {
                str2 = str2 + " encodeSampleRate";
            }
            if (this.f22725g == null) {
                str2 = str2 + " channelCount";
            }
            if (str2.isEmpty()) {
                return new c(this.f22720a, this.b.intValue(), this.f22721c, this.f22722d.intValue(), this.f22723e.intValue(), this.f22724f.intValue(), this.f22725g.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // m1.a.AbstractC0450a
        public m1.a.AbstractC0450a c(int i10) {
            this.f22722d = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.a.AbstractC0450a
        public m1.a.AbstractC0450a d(int i10) {
            this.f22723e = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.a.AbstractC0450a
        public m1.a.AbstractC0450a e(int i10) {
            this.f22725g = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.a.AbstractC0450a
        public m1.a.AbstractC0450a f(int i10) {
            this.f22724f = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.a.AbstractC0450a
        public m1.a.AbstractC0450a g(a4 a4Var) {
            if (a4Var == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.f22721c = a4Var;
            return this;
        }

        @Override // m1.a.AbstractC0450a
        public m1.a.AbstractC0450a h(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f22720a = str;
            return this;
        }

        @Override // m1.a.AbstractC0450a
        public m1.a.AbstractC0450a i(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // m1.a, m1.n
    public String b() {
        return this.f22714a;
    }

    @Override // m1.a, m1.n
    public a4 c() {
        return this.f22715c;
    }

    @Override // m1.a
    public int e() {
        return this.f22716d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1.a) {
            m1.a aVar = (m1.a) obj;
            if (this.f22714a.equals(aVar.b()) && this.b == aVar.i() && this.f22715c.equals(aVar.c()) && this.f22716d == aVar.e() && this.f22717e == aVar.f() && this.f22718f == aVar.h() && this.f22719g == aVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // m1.a
    public int f() {
        return this.f22717e;
    }

    @Override // m1.a
    public int g() {
        return this.f22719g;
    }

    @Override // m1.a
    public int h() {
        return this.f22718f;
    }

    public int hashCode() {
        return ((((((((((((this.f22714a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f22715c.hashCode()) * 1000003) ^ this.f22716d) * 1000003) ^ this.f22717e) * 1000003) ^ this.f22718f) * 1000003) ^ this.f22719g;
    }

    @Override // m1.a
    public int i() {
        return this.b;
    }

    public String toString() {
        return "AudioEncoderConfig{mimeType=" + this.f22714a + ", profile=" + this.b + ", inputTimebase=" + this.f22715c + ", bitrate=" + this.f22716d + ", captureSampleRate=" + this.f22717e + ", encodeSampleRate=" + this.f22718f + ", channelCount=" + this.f22719g + "}";
    }

    public c(String str, int i10, a4 a4Var, int i11, int i12, int i13, int i14) {
        this.f22714a = str;
        this.b = i10;
        this.f22715c = a4Var;
        this.f22716d = i11;
        this.f22717e = i12;
        this.f22718f = i13;
        this.f22719g = i14;
    }
}
