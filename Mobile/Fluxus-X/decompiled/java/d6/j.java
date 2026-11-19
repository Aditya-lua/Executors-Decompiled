package d6;

import com.github.luben.zstd.BuildConfig;
import g6.j0;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000e8\u0014X\u0094D¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Ld6/j;", "Ld6/b;", BuildConfig.FLAVOR, "Le6/h;", "tracker", "<init>", "(Le6/h;)V", "Lg6/j0;", "workSpec", "b", "(Lg6/j0;)Z", "value", "f", "(Z)Z", BuildConfig.FLAVOR, "I", "d", "()I", "reason", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends b<Boolean> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull e6.h<Boolean> tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.reason = 9;
    }

    @Override // d6.e
    public boolean b(@NotNull j0 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.constraints.getRequiresStorageNotLow();
    }

    @Override // d6.b
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getReason() {
        return this.reason;
    }

    @Override // d6.b
    public /* bridge */ /* synthetic */ boolean e(Boolean bool) {
        return f(bool.booleanValue());
    }

    public boolean f(boolean value) {
        return !value;
    }
}
