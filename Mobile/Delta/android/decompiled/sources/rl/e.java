package rl;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lrl/e;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lrl/g;", "reason", "", "cause", "<init>", "(Lrl/g;Ljava/lang/Throwable;)V", "a", "Lrl/g;", "()Lrl/g;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g reason;

    public /* synthetic */ e(g gVar, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, (i10 & 2) != 0 ? null : th2);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final g getReason() {
        return this.reason;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(@NotNull g reason, @Nullable Throwable th2) {
        String message;
        Intrinsics.checkNotNullParameter(reason, "reason");
        super((th2 == null || (message = th2.getMessage()) == null) ? reason.name() : message, th2);
        this.reason = reason;
    }
}
