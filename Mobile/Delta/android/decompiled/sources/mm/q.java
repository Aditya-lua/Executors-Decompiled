package mm;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u00016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u001f\u0010\u001eR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R(\u0010-\u001a\u00020\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010(\u0012\u0004\b,\u0010\u0003\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u000fR.\u00105\u001a\b\u0012\u0004\u0012\u00020\b0.8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010/\u0012\u0004\b4\u0010\u0003\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00067"}, d2 = {"Lmm/q;", "", "<init>", "()V", "", "notificationsEnabled", "shouldShowRationale", "userHasResponded", "", "b", "(ZZZ)Ljava/lang/String;", "Lmm/o;", "reporter", "", "i", "(Lmm/o;)V", "", "requestCode", "statusBefore", "shouldRequestAuthorization", "d", "(ILjava/lang/String;Z)V", "granted", "e", "(IZ)V", "service", "g", "(Ljava/lang/String;)V", "error", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "h", "Ljava/util/concurrent/ConcurrentHashMap;", "Lmm/q$a;", "Ljava/util/concurrent/ConcurrentHashMap;", "inFlight", "Ljava/util/concurrent/atomic/AtomicReference;", "c", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingRequestId", "Lmm/o;", "getEventReporter$universalapp_googleProdRelease", "()Lmm/o;", "setEventReporter$universalapp_googleProdRelease", "getEventReporter$universalapp_googleProdRelease$annotations", "eventReporter", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getNewRequestId$universalapp_googleProdRelease", "()Lkotlin/jvm/functions/Function0;", "setNewRequestId$universalapp_googleProdRelease", "(Lkotlin/jvm/functions/Function0;)V", "getNewRequestId$universalapp_googleProdRelease$annotations", "newRequestId", "a", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q f24914a = new q();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<Integer, InFlightAuthorization> inFlight = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final AtomicReference<String> pendingRequestId = new AtomicReference<>(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static o eventReporter = m.f24905a;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> newRequestId = new Function0() { // from class: mm.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return q.c();
        }
    };

    /* JADX INFO: renamed from: mm.q$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, d2 = {"Lmm/q$a;", "", "", "requestId", "statusBefore", "", "shouldRequestAuthorization", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InFlightAuthorization {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String requestId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String statusBefore;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean shouldRequestAuthorization;

        public InFlightAuthorization(@NotNull String requestId, @NotNull String statusBefore, boolean z10) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(statusBefore, "statusBefore");
            this.requestId = requestId;
            this.statusBefore = statusBefore;
            this.shouldRequestAuthorization = z10;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getShouldRequestAuthorization() {
            return this.shouldRequestAuthorization;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getStatusBefore() {
            return this.statusBefore;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InFlightAuthorization)) {
                return false;
            }
            InFlightAuthorization inFlightAuthorization = (InFlightAuthorization) other;
            return Intrinsics.c(this.requestId, inFlightAuthorization.requestId) && Intrinsics.c(this.statusBefore, inFlightAuthorization.statusBefore) && this.shouldRequestAuthorization == inFlightAuthorization.shouldRequestAuthorization;
        }

        public int hashCode() {
            return (((this.requestId.hashCode() * 31) + this.statusBefore.hashCode()) * 31) + Boolean.hashCode(this.shouldRequestAuthorization);
        }

        @NotNull
        public String toString() {
            return "InFlightAuthorization(requestId=" + this.requestId + ", statusBefore=" + this.statusBefore + ", shouldRequestAuthorization=" + this.shouldRequestAuthorization + ")";
        }
    }

    @NotNull
    public static final String b(boolean notificationsEnabled, boolean shouldShowRationale, boolean userHasResponded) {
        if (notificationsEnabled) {
            return "authorized";
        }
        return (shouldShowRationale || userHasResponded) ? "denied" : "notDetermined";
    }

    public static final String c() {
        return UUID.randomUUID().toString();
    }

    public static final void d(int requestCode, @NotNull String statusBefore, boolean shouldRequestAuthorization) {
        Intrinsics.checkNotNullParameter(statusBefore, "statusBefore");
        InFlightAuthorization inFlightAuthorization = new InFlightAuthorization(newRequestId.invoke(), statusBefore, shouldRequestAuthorization);
        inFlight.put(Integer.valueOf(requestCode), inFlightAuthorization);
        eventReporter.b(inFlightAuthorization.getRequestId(), inFlightAuthorization.getStatusBefore(), inFlightAuthorization.getShouldRequestAuthorization());
    }

    public static final void e(int requestCode, boolean granted) {
        InFlightAuthorization inFlightAuthorizationRemove = inFlight.remove(Integer.valueOf(requestCode));
        if (inFlightAuthorizationRemove == null) {
            return;
        }
        eventReporter.d(inFlightAuthorizationRemove.getRequestId(), inFlightAuthorizationRemove.getStatusBefore(), inFlightAuthorizationRemove.getShouldRequestAuthorization(), granted);
        if (granted) {
            pendingRequestId.set(inFlightAuthorizationRemove.getRequestId());
        }
    }

    public static final void f(@NotNull String service, @NotNull String error) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(error, "error");
        f24914a.h(service, error);
    }

    public static final void g(@NotNull String service) {
        Intrinsics.checkNotNullParameter(service, "service");
        f24914a.h(service, null);
    }

    public static final void i(@NotNull o reporter) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        eventReporter = reporter;
    }

    public final void h(String service, String error) {
        String andSet = pendingRequestId.getAndSet(null);
        if (andSet == null) {
            andSet = "";
        }
        if (error == null) {
            eventReporter.c(andSet, service);
        } else {
            eventReporter.a(andSet, service, error);
        }
    }
}
