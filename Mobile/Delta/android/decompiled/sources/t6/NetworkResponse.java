package t6;

import com.google.mlkit.common.MlKitException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: t6.q, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJM\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u001f\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lt6/q;", "", "", "code", "", "requestMillis", "responseMillis", "Lt6/n;", "headers", "Lt6/r;", "body", "delegate", "<init>", "(IJJLt6/n;Lt6/r;Ljava/lang/Object;)V", "a", "(IJJLt6/n;Lt6/r;Ljava/lang/Object;)Lt6/q;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "d", "b", "J", "f", "()J", "c", "g", "Lt6/n;", "e", "()Lt6/n;", "Lt6/r;", "()Lt6/r;", "Ljava/lang/Object;", "getDelegate", "()Ljava/lang/Object;", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NetworkResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long requestMillis;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long responseMillis;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final NetworkHeaders headers;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final r body;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Object delegate;

    public NetworkResponse() {
        this(0, 0L, 0L, null, null, null, 63, null);
    }

    public static /* synthetic */ NetworkResponse b(NetworkResponse networkResponse, int i10, long j10, long j11, NetworkHeaders networkHeaders, r rVar, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            i10 = networkResponse.code;
        }
        if ((i11 & 2) != 0) {
            j10 = networkResponse.requestMillis;
        }
        if ((i11 & 4) != 0) {
            j11 = networkResponse.responseMillis;
        }
        if ((i11 & 8) != 0) {
            networkHeaders = networkResponse.headers;
        }
        if ((i11 & 16) != 0) {
            rVar = networkResponse.body;
        }
        if ((i11 & 32) != 0) {
            obj = networkResponse.delegate;
        }
        Object obj3 = obj;
        NetworkHeaders networkHeaders2 = networkHeaders;
        long j12 = j11;
        return networkResponse.a(i10, j10, j12, networkHeaders2, rVar, obj3);
    }

    @NotNull
    public final NetworkResponse a(int code, long requestMillis, long responseMillis, @NotNull NetworkHeaders headers, @Nullable r body, @Nullable Object delegate) {
        return new NetworkResponse(code, requestMillis, responseMillis, headers, body, delegate);
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final r getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final NetworkHeaders getHeaders() {
        return this.headers;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkResponse)) {
            return false;
        }
        NetworkResponse networkResponse = (NetworkResponse) other;
        return this.code == networkResponse.code && this.requestMillis == networkResponse.requestMillis && this.responseMillis == networkResponse.responseMillis && Intrinsics.c(this.headers, networkResponse.headers) && Intrinsics.c(this.body, networkResponse.body) && Intrinsics.c(this.delegate, networkResponse.delegate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getRequestMillis() {
        return this.requestMillis;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getResponseMillis() {
        return this.responseMillis;
    }

    public int hashCode() {
        int iHashCode = ((((((this.code * 31) + Long.hashCode(this.requestMillis)) * 31) + Long.hashCode(this.responseMillis)) * 31) + this.headers.hashCode()) * 31;
        r rVar = this.body;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        Object obj = this.delegate;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NetworkResponse(code=" + this.code + ", requestMillis=" + this.requestMillis + ", responseMillis=" + this.responseMillis + ", headers=" + this.headers + ", body=" + this.body + ", delegate=" + this.delegate + ')';
    }

    public NetworkResponse(int i10, long j10, long j11, @NotNull NetworkHeaders networkHeaders, @Nullable r rVar, @Nullable Object obj) {
        this.code = i10;
        this.requestMillis = j10;
        this.responseMillis = j11;
        this.headers = networkHeaders;
        this.body = rVar;
        this.delegate = obj;
    }

    public /* synthetic */ NetworkResponse(int i10, long j10, long j11, NetworkHeaders networkHeaders, r rVar, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? MlKitException.CODE_SCANNER_UNAVAILABLE : i10, (i11 & 2) != 0 ? 0L : j10, (i11 & 4) != 0 ? 0L : j11, (i11 & 8) != 0 ? NetworkHeaders.f31657c : networkHeaders, (i11 & 16) != 0 ? null : rVar, (i11 & 32) != 0 ? null : obj);
    }
}
