package eh;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: eh.t, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u0014\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Leh/t;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "consentRequired", "Leh/b0;", "cache", "trackingOptedOut", "attributionBlocked", "eligibilityPending", "<init>", "(Ljava/lang/Boolean;Leh/b0;ZZZ)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "b", "Leh/b0;", "()Leh/b0;", "Z", "e", "()Z", "d", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FirebaseColdStartInputs {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Boolean consentRequired;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final b0 cache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean trackingOptedOut;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean attributionBlocked;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean eligibilityPending;

    public FirebaseColdStartInputs(@Nullable Boolean bool, @NotNull b0 cache, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.consentRequired = bool;
        this.cache = cache;
        this.trackingOptedOut = z10;
        this.attributionBlocked = z11;
        this.eligibilityPending = z12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAttributionBlocked() {
        return this.attributionBlocked;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getCache() {
        return this.cache;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getConsentRequired() {
        return this.consentRequired;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getEligibilityPending() {
        return this.eligibilityPending;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getTrackingOptedOut() {
        return this.trackingOptedOut;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FirebaseColdStartInputs)) {
            return false;
        }
        FirebaseColdStartInputs firebaseColdStartInputs = (FirebaseColdStartInputs) other;
        return Intrinsics.c(this.consentRequired, firebaseColdStartInputs.consentRequired) && Intrinsics.c(this.cache, firebaseColdStartInputs.cache) && this.trackingOptedOut == firebaseColdStartInputs.trackingOptedOut && this.attributionBlocked == firebaseColdStartInputs.attributionBlocked && this.eligibilityPending == firebaseColdStartInputs.eligibilityPending;
    }

    public int hashCode() {
        Boolean bool = this.consentRequired;
        return ((((((((bool == null ? 0 : bool.hashCode()) * 31) + this.cache.hashCode()) * 31) + Boolean.hashCode(this.trackingOptedOut)) * 31) + Boolean.hashCode(this.attributionBlocked)) * 31) + Boolean.hashCode(this.eligibilityPending);
    }

    @NotNull
    public String toString() {
        return "FirebaseColdStartInputs(consentRequired=" + this.consentRequired + ", cache=" + this.cache + ", trackingOptedOut=" + this.trackingOptedOut + ", attributionBlocked=" + this.attributionBlocked + ", eligibilityPending=" + this.eligibilityPending + ")";
    }
}
