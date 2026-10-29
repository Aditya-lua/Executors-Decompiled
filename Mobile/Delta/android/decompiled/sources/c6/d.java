package c6;

import f6.j0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0014X\u0094D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lc6/d;", "Lc6/b;", "", "Ld6/c;", "tracker", "<init>", "(Ld6/c;)V", "Lf6/j0;", "workSpec", "a", "(Lf6/j0;)Z", "value", "f", "(Z)Z", "", "b", "I", "d", "()I", "reason", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends b<Boolean> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull d6.c tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.reason = 5;
    }

    @Override // c6.e
    public boolean a(@NotNull j0 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.constraints.getRequiresBatteryNotLow();
    }

    @Override // c6.b
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getReason() {
        return this.reason;
    }

    @Override // c6.b
    public /* bridge */ /* synthetic */ boolean e(Boolean bool) {
        return f(bool.booleanValue());
    }

    public boolean f(boolean value) {
        return !value;
    }
}
