package l1;

import com.github.luben.zstd.BuildConfig;
import n0.a2;

/* JADX INFO: loaded from: classes.dex */
public final class h extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21846a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2.a f21847c;

    public static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f21848a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a2.a f21849c;

        @Override // l1.e.a
        public e b() {
            String str = this.f21848a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " mimeType";
            }
            if (this.b == null) {
                str2 = str2 + " profile";
            }
            if (str2.isEmpty()) {
                return new h(this.f21848a, this.b.intValue(), this.f21849c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // l1.e.a
        public e.a c(a2.a aVar) {
            this.f21849c = aVar;
            return this;
        }

        public e.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f21848a = str;
            return this;
        }

        @Override // l1.l.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public e.a a(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // l1.l
    public String a() {
        return this.f21846a;
    }

    @Override // l1.l
    public int b() {
        return this.b;
    }

    @Override // l1.e
    public a2.a d() {
        return this.f21847c;
    }

    public boolean equals(Object obj) {
        a2.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f21846a.equals(eVar.a()) && this.b == eVar.b() && ((aVar = this.f21847c) != null ? aVar.equals(eVar.d()) : eVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f21846a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        a2.a aVar = this.f21847c;
        return iHashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "AudioMimeInfo{mimeType=" + this.f21846a + ", profile=" + this.b + ", compatibleAudioProfile=" + this.f21847c + "}";
    }

    public h(String str, int i10, a2.a aVar) {
        this.f21846a = str;
        this.b = i10;
        this.f21847c = aVar;
    }
}
