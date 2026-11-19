package eh;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: eh.h0, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Leh/h0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "bucket", "state", "trigger", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FirebaseTimeToDecisionEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String bucket;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String trigger;

    public FirebaseTimeToDecisionEvent(@NotNull String bucket, @NotNull String state, @NotNull String trigger) {
        Intrinsics.checkNotNullParameter(bucket, "bucket");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        this.bucket = bucket;
        this.state = state;
        this.trigger = trigger;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBucket() {
        return this.bucket;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getState() {
        return this.state;
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
        if (!(other instanceof FirebaseTimeToDecisionEvent)) {
            return false;
        }
        FirebaseTimeToDecisionEvent firebaseTimeToDecisionEvent = (FirebaseTimeToDecisionEvent) other;
        return Intrinsics.c(this.bucket, firebaseTimeToDecisionEvent.bucket) && Intrinsics.c(this.state, firebaseTimeToDecisionEvent.state) && Intrinsics.c(this.trigger, firebaseTimeToDecisionEvent.trigger);
    }

    public int hashCode() {
        return (((this.bucket.hashCode() * 31) + this.state.hashCode()) * 31) + this.trigger.hashCode();
    }

    @NotNull
    public String toString() {
        return "FirebaseTimeToDecisionEvent(bucket=" + this.bucket + ", state=" + this.state + ", trigger=" + this.trigger + ")";
    }
}
