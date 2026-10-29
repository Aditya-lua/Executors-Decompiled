package p443t6;

import com.google.mlkit.common.MlKitException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: t6.q, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJM\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u001f\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, m31665d2 = {"Lt6/q;", "", "", "code", "", "requestMillis", "responseMillis", "Lt6/n;", "headers", "Lt6/r;", "body", "delegate", "<init>", "(IJJLt6/n;Lt6/r;Ljava/lang/Object;)V", "a", "(IJJLt6/n;Lt6/r;Ljava/lang/Object;)Lt6/q;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "d", "b", "J", "f", "()J", "c", "g", "Lt6/n;", "e", "()Lt6/n;", "Lt6/r;", "()Lt6/r;", "Ljava/lang/Object;", "getDelegate", "()Ljava/lang/Object;", "coil-network-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class NetworkResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long requestMillis;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public final long responseMillis;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final NetworkHeaders headers;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final InterfaceC11548r body;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final Object delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NetworkResponse() {
        this(0, 0L, 0L, null, null, null, 63, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ NetworkResponse m43160b(NetworkResponse networkResponse, int i10, long j10, long j11, NetworkHeaders networkHeaders, InterfaceC11548r interfaceC11548r, Object obj, int i11, Object obj2) {
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
            interfaceC11548r = networkResponse.body;
        }
        if ((i11 & 32) != 0) {
            obj = networkResponse.delegate;
        }
        Object obj3 = obj;
        NetworkHeaders networkHeaders2 = networkHeaders;
        long j12 = j11;
        return networkResponse.m43161a(i10, j10, j12, networkHeaders2, interfaceC11548r, obj3);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final NetworkResponse m43161a(int code, long requestMillis, long responseMillis, @NotNull NetworkHeaders headers, @Nullable InterfaceC11548r body, @Nullable Object delegate) {
        return new NetworkResponse(code, requestMillis, responseMillis, headers, body, delegate);
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC11548r getBody() {
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
        return this.code == networkResponse.code && this.requestMillis == networkResponse.requestMillis && this.responseMillis == networkResponse.responseMillis && Intrinsics.m31980c(this.headers, networkResponse.headers) && Intrinsics.m31980c(this.body, networkResponse.body) && Intrinsics.m31980c(this.delegate, networkResponse.delegate);
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
        InterfaceC11548r interfaceC11548r = this.body;
        int iHashCode2 = (iHashCode + (interfaceC11548r == null ? 0 : interfaceC11548r.hashCode())) * 31;
        Object obj = this.delegate;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NetworkResponse(code=" + this.code + ", requestMillis=" + this.requestMillis + ", responseMillis=" + this.responseMillis + ", headers=" + this.headers + ", body=" + this.body + ", delegate=" + this.delegate + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public NetworkResponse(int i10, long j10, long j11, @NotNull NetworkHeaders networkHeaders, @Nullable InterfaceC11548r interfaceC11548r, @Nullable Object obj) {
        this.code = i10;
        this.requestMillis = j10;
        this.responseMillis = j11;
        this.headers = networkHeaders;
        this.body = interfaceC11548r;
        this.delegate = obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002e: CONSTRUCTOR 
      (wrap int:?: TERNARY null = ((wrap int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap int:0x0004: SGET  A[WRAPPED] com.google.mlkit.common.MlKitException.CODE_SCANNER_UNAVAILABLE int) : (r3v0 int))
      (wrap long:?: TERNARY null = ((wrap int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r4v0 long))
      (wrap long:?: TERNARY null = ((wrap int:0x000d: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r6v0 long))
      (wrap t6.n:?: TERNARY null = ((wrap int:0x0012: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap t6.n:0x0016: SGET  A[WRAPPED] (LINE:9) t6.n.c t6.n) : (r8v0 t6.n))
      (wrap t6.r:?: TERNARY null = ((wrap int:0x0018: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null t6.r) : (r9v0 t6.r))
      (wrap java.lang.Object:?: TERNARY null = ((wrap int:0x001e: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r10v0 java.lang.Object))
     A[MD:(int, long, long, t6.n, t6.r, java.lang.Object):void (m)] (LINE:10) call: t6.q.<init>(int, long, long, t6.n, t6.r, java.lang.Object):void type: THIS */
    public /* synthetic */ NetworkResponse(int i10, long j10, long j11, NetworkHeaders networkHeaders, InterfaceC11548r interfaceC11548r, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? MlKitException.CODE_SCANNER_UNAVAILABLE : i10, (i11 & 2) != 0 ? 0L : j10, (i11 & 4) != 0 ? 0L : j11, (i11 & 8) != 0 ? NetworkHeaders.f40873c : networkHeaders, (i11 & 16) != 0 ? null : interfaceC11548r, (i11 & 32) != 0 ? null : obj);
    }
}
