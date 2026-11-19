package eh;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: eh.g0, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Leh/g0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "outcome", "geo", "trigger", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FirebaseOutcomeEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String outcome;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String geo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String trigger;

    public FirebaseOutcomeEvent(@NotNull String outcome, @NotNull String geo, @NotNull String trigger) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        Intrinsics.checkNotNullParameter(geo, "geo");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        this.outcome = outcome;
        this.geo = geo;
        this.trigger = trigger;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getGeo() {
        return this.geo;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOutcome() {
        return this.outcome;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTrigger() {
        return this.trigger;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FirebaseOutcomeEvent)) {
            return false;
        }
        FirebaseOutcomeEvent firebaseOutcomeEvent = (FirebaseOutcomeEvent) other;
        return Intrinsics.c(this.outcome, firebaseOutcomeEvent.outcome) && Intrinsics.c(this.geo, firebaseOutcomeEvent.geo) && Intrinsics.c(this.trigger, firebaseOutcomeEvent.trigger);
    }

    public int hashCode() {
        return (((this.outcome.hashCode() * 31) + this.geo.hashCode()) * 31) + this.trigger.hashCode();
    }

    @NotNull
    public String toString() {
        return "FirebaseOutcomeEvent(outcome=" + this.outcome + ", geo=" + this.geo + ", trigger=" + this.trigger + ")";
    }
}
