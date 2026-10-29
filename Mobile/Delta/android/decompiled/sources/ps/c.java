package ps;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lps/c;", "Lps/k;", "Lps/j;", "replaceData", "", "times", "<init>", "(Lps/j;I)V", "", "b", "()Ljava/lang/String;", "Lps/j;", "a", "()Lps/j;", "c", "I", "getTimes", "()I", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ReplaceData replaceData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int times;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull ReplaceData replaceData, int i10) {
        super(null);
        Intrinsics.checkNotNullParameter(replaceData, "replaceData");
        this.replaceData = replaceData;
        this.times = i10;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public ReplaceData getReplaceData() {
        return this.replaceData;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String invoke() {
        return l.b(getReplaceData().getReplaceCandidate(), getReplaceData().getOldString(), getReplaceData().getNewString(), this.times);
    }
}
