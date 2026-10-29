package t6;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.Options;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \r2\u00020\u0001:\u0003\t\u000f\rJ(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\nJ2\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lt6/b;", "", "Lt6/q;", "cacheResponse", "Lt6/o;", "networkRequest", "Lx6/p;", "options", "Lt6/b$b;", "b", "(Lt6/q;Lt6/o;Lx6/p;Lnt/b;)Ljava/lang/Object;", "networkResponse", "Lt6/b$c;", "a", "(Lt6/q;Lt6/o;Lt6/q;Lx6/p;Lnt/b;)Ljava/lang/Object;", "c", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f31606a;

    @NotNull
    public static final b b = new u6.a();

    /* JADX INFO: renamed from: t6.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lt6/b$a;", "", "<init>", "()V", "Lt6/b;", "DEFAULT", "Lt6/b;", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f31606a = new Companion();
    }

    /* JADX INFO: renamed from: t6.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lt6/b$b;", "", "Lt6/q;", Payload.RESPONSE, "<init>", "(Lt6/q;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lt6/o;", "a", "Lt6/o;", "()Lt6/o;", "request", "b", "Lt6/q;", "()Lt6/q;", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ReadResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final NetworkRequest request = null;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final NetworkResponse response;

        public ReadResult(@NotNull NetworkResponse networkResponse) {
            this.response = networkResponse;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final NetworkRequest getRequest() {
            return this.request;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final NetworkResponse getResponse() {
            return this.response;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReadResult)) {
                return false;
            }
            ReadResult readResult = (ReadResult) other;
            return Intrinsics.c(this.request, readResult.request) && Intrinsics.c(this.response, readResult.response);
        }

        public int hashCode() {
            NetworkRequest networkRequest = this.request;
            int iHashCode = (networkRequest != null ? networkRequest.hashCode() : 0) * 31;
            NetworkResponse networkResponse = this.response;
            return iHashCode + (networkResponse != null ? networkResponse.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ReadResult(request=" + this.request + ", response=" + this.response + ')';
        }
    }

    @Nullable
    Object a(@Nullable NetworkResponse networkResponse, @NotNull NetworkRequest networkRequest, @NotNull NetworkResponse networkResponse2, @NotNull Options options, @NotNull nt.b<? super WriteResult> bVar);

    @Nullable
    Object b(@NotNull NetworkResponse networkResponse, @NotNull NetworkRequest networkRequest, @NotNull Options options, @NotNull nt.b<? super ReadResult> bVar);

    /* JADX INFO: renamed from: t6.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0012¢\u0006\u0004\b\u0004\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lt6/b$c;", "", "Lt6/q;", Payload.RESPONSE, "<init>", "(Lt6/q;)V", "()V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lt6/q;", "()Lt6/q;", "b", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WriteResult {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final WriteResult f31608c = new WriteResult();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final NetworkResponse response;

        public WriteResult(@NotNull NetworkResponse networkResponse) {
            this.response = networkResponse;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final NetworkResponse getResponse() {
            return this.response;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WriteResult) && Intrinsics.c(this.response, ((WriteResult) other).response);
        }

        public int hashCode() {
            NetworkResponse networkResponse = this.response;
            if (networkResponse != null) {
                return networkResponse.hashCode();
            }
            return 0;
        }

        @NotNull
        public String toString() {
            return "WriteResult(response=" + this.response + ')';
        }

        public WriteResult() {
            this.response = null;
        }
    }
}
