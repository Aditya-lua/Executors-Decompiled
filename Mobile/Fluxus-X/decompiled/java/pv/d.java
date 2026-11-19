package pv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import mv.f0;
import mv.h0;
import mv.y;
import nv.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.x;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0002\n\bB\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"Lpv/d;", BuildConfig.FLAVOR, "Lmv/f0;", "networkRequest", "Lmv/h0;", "cacheResponse", "<init>", "(Lmv/f0;Lmv/h0;)V", "a", "Lmv/f0;", "b", "()Lmv/f0;", "Lmv/h0;", "()Lmv/h0;", "c", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final f0 networkRequest;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final h0 cacheResponse;

    /* JADX INFO: renamed from: pv.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpv/d$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lmv/h0;", Payload.RESPONSE, "Lmv/f0;", "request", BuildConfig.FLAVOR, "a", "(Lmv/h0;Lmv/f0;)Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:24:0x003b  */
        public final boolean a(@NotNull h0 response, @NotNull f0 request) {
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(request, "request");
            int code = response.getCode();
            if (code != 200 && code != 410 && code != 414 && code != 501 && code != 203 && code != 204) {
                if (code == 307) {
                    if (h0.n(response, "Expires", null, 2, null) == null && response.c().getMaxAgeSeconds() == -1 && !response.c().getIsPublic() && !response.c().getIsPrivate()) {
                        return false;
                    }
                } else if (code != 308 && code != 404 && code != 405) {
                    switch (code) {
                        case MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE /* 300 */:
                        case MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE /* 301 */:
                            break;
                        case 302:
                            if (h0.n(response, "Expires", null, 2, null) == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (response.c().getNoStore() || request.b().getNoStore()) ? false : true;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u0018\u0010#\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0018\u0010%\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0016R\u0016\u0010)\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0016R\u0018\u0010+\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001fR\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lpv/d$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "nowMillis", "Lmv/f0;", "request", "Lmv/h0;", "cacheResponse", "<init>", "(JLmv/f0;Lmv/h0;)V", "Lpv/d;", "b", "()Lpv/d;", BuildConfig.FLAVOR, "f", "()Z", "c", "d", "()J", "a", "e", "(Lmv/f0;)Z", "J", "Lmv/f0;", "getRequest$okhttp", "()Lmv/f0;", "Lmv/h0;", "Ljava/util/Date;", "Ljava/util/Date;", "servedDate", BuildConfig.FLAVOR, "Ljava/lang/String;", "servedDateString", "lastModified", "g", "lastModifiedString", "h", "expires", "i", "sentRequestMillis", "j", "receivedResponseMillis", "k", "etag", BuildConfig.FLAVOR, "l", "I", "ageSeconds", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final long nowMillis;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final f0 request;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final h0 cacheResponse;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Date servedDate;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String servedDateString;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Date lastModified;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String lastModifiedString;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Date expires;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public long sentRequestMillis;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public long receivedResponseMillis;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String etag;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public int ageSeconds;

        public b(long j10, @NotNull f0 request, @Nullable h0 h0Var) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.nowMillis = j10;
            this.request = request;
            this.cacheResponse = h0Var;
            this.ageSeconds = -1;
            if (h0Var != null) {
                this.sentRequestMillis = h0Var.getSentRequestAtMillis();
                this.receivedResponseMillis = h0Var.getReceivedResponseAtMillis();
                y headers = h0Var.getHeaders();
                int size = headers.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strC = headers.c(i10);
                    String strG = headers.g(i10);
                    if (x.E(strC, "Date", true)) {
                        this.servedDate = sv.c.a(strG);
                        this.servedDateString = strG;
                    } else if (x.E(strC, "Expires", true)) {
                        this.expires = sv.c.a(strG);
                    } else if (x.E(strC, "Last-Modified", true)) {
                        this.lastModified = sv.c.a(strG);
                        this.lastModifiedString = strG;
                    } else if (x.E(strC, "ETag", true)) {
                        this.etag = strG;
                    } else if (x.E(strC, "Age", true)) {
                        this.ageSeconds = n.D(strG, -1);
                    }
                }
            }
        }

        public final long a() {
            Date date = this.servedDate;
            long jMax = date != null ? Math.max(0L, this.receivedResponseMillis - date.getTime()) : 0L;
            int i10 = this.ageSeconds;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            return jMax + Math.max(0L, this.receivedResponseMillis - this.sentRequestMillis) + Math.max(0L, this.nowMillis - this.receivedResponseMillis);
        }

        @NotNull
        public final d b() {
            d dVarC = c();
            return (dVarC.getNetworkRequest() == null || !this.request.b().getOnlyIfCached()) ? dVarC : new d(null, null);
        }

        public final d c() {
            String str;
            if (this.cacheResponse == null) {
                return new d(this.request, null);
            }
            if ((!this.request.h() || this.cacheResponse.getHandshake() != null) && d.INSTANCE.a(this.cacheResponse, this.request)) {
                mv.d dVarB = this.request.b();
                if (dVarB.getNoCache() || e(this.request)) {
                    return new d(this.request, null);
                }
                mv.d dVarC = this.cacheResponse.c();
                long jA = a();
                long jD = d();
                if (dVarB.getMaxAgeSeconds() != -1) {
                    jD = Math.min(jD, TimeUnit.SECONDS.toMillis(dVarB.getMaxAgeSeconds()));
                }
                long millis = 0;
                long millis2 = dVarB.getMinFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(dVarB.getMinFreshSeconds()) : 0L;
                if (!dVarC.getMustRevalidate() && dVarB.getMaxStaleSeconds() != -1) {
                    millis = TimeUnit.SECONDS.toMillis(dVarB.getMaxStaleSeconds());
                }
                if (!dVarC.getNoCache()) {
                    long j10 = millis2 + jA;
                    if (j10 < millis + jD) {
                        h0.a aVarS = this.cacheResponse.s();
                        if (j10 >= jD) {
                            aVarS.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jA > 86400000 && f()) {
                            aVarS.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new d(null, aVarS.c());
                    }
                }
                String str2 = this.etag;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.lastModified != null) {
                        str2 = this.lastModifiedString;
                    } else {
                        if (this.servedDate == null) {
                            return new d(this.request, null);
                        }
                        str2 = this.servedDateString;
                    }
                    str = "If-Modified-Since";
                }
                y.a aVarE = this.request.getHeaders().e();
                Intrinsics.checkNotNull(str2);
                aVarE.d(str, str2);
                return new d(this.request.j().n(aVarE.f()).b(), this.cacheResponse);
            }
            return new d(this.request, null);
        }

        public final long d() {
            h0 h0Var = this.cacheResponse;
            Intrinsics.checkNotNull(h0Var);
            mv.d dVarC = h0Var.c();
            if (dVarC.getMaxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(dVarC.getMaxAgeSeconds());
            }
            Date date = this.expires;
            if (date != null) {
                Date date2 = this.servedDate;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.receivedResponseMillis);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.lastModified != null && this.cacheResponse.getRequest().getUrl().n() == null) {
                Date date3 = this.servedDate;
                long time2 = date3 != null ? date3.getTime() : this.sentRequestMillis;
                Date date4 = this.lastModified;
                Intrinsics.checkNotNull(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
            }
            return 0L;
        }

        public final boolean e(f0 request) {
            return (request.e("If-Modified-Since") == null && request.e("If-None-Match") == null) ? false : true;
        }

        public final boolean f() {
            h0 h0Var = this.cacheResponse;
            Intrinsics.checkNotNull(h0Var);
            return h0Var.c().getMaxAgeSeconds() == -1 && this.expires == null;
        }
    }

    public d(@Nullable f0 f0Var, @Nullable h0 h0Var) {
        this.networkRequest = f0Var;
        this.cacheResponse = h0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final h0 getCacheResponse() {
        return this.cacheResponse;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final f0 getNetworkRequest() {
        return this.networkRequest;
    }
}
