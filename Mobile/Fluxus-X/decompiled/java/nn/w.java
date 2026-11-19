package nn;

import av.d2;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lnn/w;", BuildConfig.FLAVOR, "Lnn/s;", "controller", "Lav/d2;", "subscription", "<init>", "(Lnn/s;Lav/d2;)V", "a", "Lnn/s;", "()Lnn/s;", "b", "Lav/d2;", "()Lav/d2;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s controller;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final d2 subscription;

    public w(@NotNull s controller, @NotNull d2 subscription) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.controller = controller;
        this.subscription = subscription;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final s getController() {
        return this.controller;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final d2 getSubscription() {
        return this.subscription;
    }
}
