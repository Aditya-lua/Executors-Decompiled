package p026b6;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: b6.h, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJB\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001d"}, m31665d2 = {"Lb6/h;", "", "", "isConnected", "isValidated", "isMetered", "isNotRoaming", "isBlocked", "<init>", "(ZZZZZ)V", "a", "(ZZZZZ)Lb6/h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "g", "c", "e", "f", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final /* data */ class NetworkState {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean isConnected;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean isValidated;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public final boolean isMetered;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean isNotRoaming;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    public final boolean isBlocked;

    public NetworkState(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.isConnected = z10;
        this.isValidated = z11;
        this.isMetered = z12;
        this.isNotRoaming = z13;
        this.isBlocked = z14;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ NetworkState m6946b(NetworkState networkState, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = networkState.isConnected;
        }
        if ((i10 & 2) != 0) {
            z11 = networkState.isValidated;
        }
        if ((i10 & 4) != 0) {
            z12 = networkState.isMetered;
        }
        if ((i10 & 8) != 0) {
            z13 = networkState.isNotRoaming;
        }
        if ((i10 & 16) != 0) {
            z14 = networkState.isBlocked;
        }
        boolean z15 = z14;
        boolean z16 = z12;
        return networkState.m6947a(z10, z11, z16, z13, z15);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final NetworkState m6947a(boolean isConnected, boolean isValidated, boolean isMetered, boolean isNotRoaming, boolean isBlocked) {
        return new NetworkState(isConnected, isValidated, isMetered, isNotRoaming, isBlocked);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsBlocked() {
        return this.isBlocked;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsMetered() {
        return this.isMetered;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) other;
        return this.isConnected == networkState.isConnected && this.isValidated == networkState.isValidated && this.isMetered == networkState.isMetered && this.isNotRoaming == networkState.isNotRoaming && this.isBlocked == networkState.isBlocked;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsNotRoaming() {
        return this.isNotRoaming;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsValidated() {
        return this.isValidated;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isConnected) * 31) + Boolean.hashCode(this.isValidated)) * 31) + Boolean.hashCode(this.isMetered)) * 31) + Boolean.hashCode(this.isNotRoaming)) * 31) + Boolean.hashCode(this.isBlocked);
    }

    @NotNull
    public String toString() {
        return "NetworkState(isConnected=" + this.isConnected + ", isValidated=" + this.isValidated + ", isMetered=" + this.isMetered + ", isNotRoaming=" + this.isNotRoaming + ", isBlocked=" + this.isBlocked + ')';
    }
}
