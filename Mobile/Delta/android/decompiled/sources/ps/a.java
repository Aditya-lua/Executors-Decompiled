package ps;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lps/a;", "Lps/k;", "Lps/j;", "replaceData", "<init>", "(Lps/j;)V", "", "b", "()Ljava/lang/String;", "Lps/j;", "a", "()Lps/j;", "c", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ReplaceData replaceData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReplaceData replaceData) {
        super(null);
        Intrinsics.checkNotNullParameter(replaceData, "replaceData");
        this.replaceData = replaceData;
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
        return x.N(getReplaceData().getReplaceCandidate(), getReplaceData().getOldString(), getReplaceData().getNewString(), false, 4, null);
    }
}
