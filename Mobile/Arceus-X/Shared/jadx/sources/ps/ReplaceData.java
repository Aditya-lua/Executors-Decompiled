package ps;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ps.j, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, m31665d2 = {"Lps/j;", "", "", "replaceCandidate", "oldString", "newString", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "operations-stdlib_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class ReplaceData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String replaceCandidate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String oldString;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final String newString;

    public ReplaceData(@NotNull String replaceCandidate, @NotNull String oldString, @NotNull String newString) {
        Intrinsics.checkNotNullParameter(replaceCandidate, "replaceCandidate");
        Intrinsics.checkNotNullParameter(oldString, "oldString");
        Intrinsics.checkNotNullParameter(newString, "newString");
        this.replaceCandidate = replaceCandidate;
        this.oldString = oldString;
        this.newString = newString;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getNewString() {
        return this.newString;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOldString() {
        return this.oldString;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getReplaceCandidate() {
        return this.replaceCandidate;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReplaceData)) {
            return false;
        }
        ReplaceData replaceData = (ReplaceData) other;
        return Intrinsics.m31980c(this.replaceCandidate, replaceData.replaceCandidate) && Intrinsics.m31980c(this.oldString, replaceData.oldString) && Intrinsics.m31980c(this.newString, replaceData.newString);
    }

    public int hashCode() {
        return (((this.replaceCandidate.hashCode() * 31) + this.oldString.hashCode()) * 31) + this.newString.hashCode();
    }

    @NotNull
    public String toString() {
        return "ReplaceData(replaceCandidate=" + this.replaceCandidate + ", oldString=" + this.oldString + ", newString=" + this.newString + ")";
    }
}
