package p042c6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p069d6.AbstractC4457h;
import p120f6.C5390j0;

/* JADX INFO: renamed from: c6.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0014X\u0094D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"Lc6/c;", "Lc6/b;", "", "Ld6/h;", "tracker", "<init>", "(Ld6/h;)V", "Lf6/j0;", "workSpec", "a", "(Lf6/j0;)Z", "value", "f", "(Z)Z", "", "b", "I", "d", "()I", "reason", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1543c extends AbstractC1542b<Boolean> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1543c(@NotNull AbstractC4457h<Boolean> tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.reason = 6;
    }

    @Override // p042c6.InterfaceC1545e
    /* JADX INFO: renamed from: a */
    public boolean mo6939a(@NotNull C5390j0 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.constraints.getRequiresCharging();
    }

    @Override // p042c6.AbstractC1542b
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getReason() {
        return this.reason;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p042c6.AbstractC1542b
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ boolean mo8133e(Boolean bool) {
        return m8137f(bool.booleanValue());
    }

    /* JADX INFO: renamed from: f */
    public boolean m8137f(boolean value) {
        return !value;
    }
}
