package mv;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u001a\u0018\u0000 (2\u00020\u0001:\u0002\u0016\u001aBs\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b \u0010\u0019R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\f\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b&\u0010\u0019R\u0017\u0010\u000f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010'\u001a\u0004\b\u0016\u0010\u0015\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lmv/d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "noCache", "noStore", BuildConfig.FLAVOR, "maxAgeSeconds", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", BuildConfig.FLAVOR, "headerValue", "<init>", "(ZZIIZZZIIZZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Z", "i", "()Z", "b", "j", "c", "I", "e", "()I", "d", "m", "f", "g", "h", "l", "k", "Ljava/lang/String;", "n", "(Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final d f24507o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final d f24508p;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean noCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean noStore;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int maxAgeSeconds;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int sMaxAgeSeconds;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean isPrivate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean isPublic;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean mustRevalidate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final int maxStaleSeconds;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final int minFreshSeconds;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final boolean onlyIfCached;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final boolean noTransform;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final boolean immutable;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String headerValue;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0014\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\"\u0010\u001f\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\"\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\"\u0010%\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\"\u0010(\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013R\"\u0010+\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010\u0013R\"\u0010-\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b,\u0010\u0013¨\u0006."}, d2 = {"Lmv/d$a;", BuildConfig.FLAVOR, "<init>", "()V", "k", "()Lmv/d$a;", "l", "Lkotlin/time/a;", "maxStale", "j", "(J)Lmv/d$a;", "Lmv/d;", "a", "()Lmv/d;", BuildConfig.FLAVOR, "Z", "f", "()Z", "m", "(Z)V", "noCache", "b", "g", "setNoStore$okhttp", "noStore", BuildConfig.FLAVOR, "c", "I", "()I", "setMaxAgeSeconds$okhttp", "(I)V", "maxAgeSeconds", "d", "setMaxStaleSeconds$okhttp", "maxStaleSeconds", "e", "setMinFreshSeconds$okhttp", "minFreshSeconds", "i", "n", "onlyIfCached", "h", "setNoTransform$okhttp", "noTransform", "setImmutable$okhttp", "immutable", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public boolean noCache;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean noStore;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public int maxAgeSeconds = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public int maxStaleSeconds = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public int minFreshSeconds = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public boolean onlyIfCached;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public boolean noTransform;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public boolean immutable;

        @NotNull
        public final d a() {
            return nv.j.a(this);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getImmutable() {
            return this.immutable;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getMaxAgeSeconds() {
            return this.maxAgeSeconds;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getMaxStaleSeconds() {
            return this.maxStaleSeconds;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getMinFreshSeconds() {
            return this.minFreshSeconds;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getNoCache() {
            return this.noCache;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getNoStore() {
            return this.noStore;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getNoTransform() {
            return this.noTransform;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getOnlyIfCached() {
            return this.onlyIfCached;
        }

        @NotNull
        public final a j(long maxStale) {
            long jY = p001kotlin.time.a.y(maxStale);
            if (jY >= 0) {
                this.maxStaleSeconds = nv.j.b(jY);
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + jY).toString());
        }

        @NotNull
        public final a k() {
            return nv.j.e(this);
        }

        @NotNull
        public final a l() {
            return nv.j.f(this);
        }

        public final void m(boolean z10) {
            this.noCache = z10;
        }

        public final void n(boolean z10) {
            this.onlyIfCached = z10;
        }
    }

    /* JADX INFO: renamed from: mv.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lmv/d$b;", BuildConfig.FLAVOR, "<init>", "()V", "Lmv/y;", "headers", "Lmv/d;", "a", "(Lmv/y;)Lmv/d;", "FORCE_NETWORK", "Lmv/d;", "FORCE_CACHE", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final d a(@NotNull y headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            return nv.j.g(this, headers);
        }

        public Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f24507o = nv.j.d(companion);
        f24508p = nv.j.c(companion);
    }

    public d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, @Nullable String str) {
        this.noCache = z10;
        this.noStore = z11;
        this.maxAgeSeconds = i10;
        this.sMaxAgeSeconds = i11;
        this.isPrivate = z12;
        this.isPublic = z13;
        this.mustRevalidate = z14;
        this.maxStaleSeconds = i12;
        this.minFreshSeconds = i13;
        this.onlyIfCached = z15;
        this.noTransform = z16;
        this.immutable = z17;
        this.headerValue = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getHeaderValue() {
        return this.headerValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsPublic() {
        return this.isPublic;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMaxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getMinFreshSeconds() {
        return this.minFreshSeconds;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getNoCache() {
        return this.noCache;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getNoStore() {
        return this.noStore;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getNoTransform() {
        return this.noTransform;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getOnlyIfCached() {
        return this.onlyIfCached;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getSMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final void n(@Nullable String str) {
        this.headerValue = str;
    }

    @NotNull
    public String toString() {
        return nv.j.h(this);
    }
}
