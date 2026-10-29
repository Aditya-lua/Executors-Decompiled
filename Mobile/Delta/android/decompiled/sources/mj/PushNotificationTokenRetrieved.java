package mj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mj.i0, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lmj/i0;", "", "", "token", "", "isAuthorizePushForUser", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PushNotificationTokenRetrieved {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String token;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean isAuthorizePushForUser;

    public PushNotificationTokenRetrieved(@NotNull String token, boolean z10) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.token = token;
        this.isAuthorizePushForUser = z10;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsAuthorizePushForUser() {
        return this.isAuthorizePushForUser;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushNotificationTokenRetrieved)) {
            return false;
        }
        PushNotificationTokenRetrieved pushNotificationTokenRetrieved = (PushNotificationTokenRetrieved) other;
        return Intrinsics.c(this.token, pushNotificationTokenRetrieved.token) && this.isAuthorizePushForUser == pushNotificationTokenRetrieved.isAuthorizePushForUser;
    }

    public int hashCode() {
        return (this.token.hashCode() * 31) + Boolean.hashCode(this.isAuthorizePushForUser);
    }

    @NotNull
    public String toString() {
        return "PushNotificationTokenRetrieved(token=" + this.token + ", isAuthorizePushForUser=" + this.isAuthorizePushForUser + ")";
    }
}
