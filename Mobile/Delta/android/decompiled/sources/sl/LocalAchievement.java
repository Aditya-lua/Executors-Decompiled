package sl;

import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sl.l, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, d2 = {"Lsl/l;", "", "", "codeName", "Ljava/time/Instant;", "createdTs", "<init>", "(Ljava/lang/String;Ljava/time/Instant;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/Instant;", "()Ljava/time/Instant;", "Lsl/m;", "c", "Lsl/m;", "()Lsl/m;", "origin", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocalAchievement {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String codeName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Instant createdTs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final m origin;

    public LocalAchievement(@NotNull String codeName, @NotNull Instant createdTs) {
        Intrinsics.checkNotNullParameter(codeName, "codeName");
        Intrinsics.checkNotNullParameter(createdTs, "createdTs");
        this.codeName = codeName;
        this.createdTs = createdTs;
        this.origin = m.LOCAL;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCodeName() {
        return this.codeName;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Instant getCreatedTs() {
        return this.createdTs;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final m getOrigin() {
        return this.origin;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalAchievement)) {
            return false;
        }
        LocalAchievement localAchievement = (LocalAchievement) other;
        return Intrinsics.c(this.codeName, localAchievement.codeName) && Intrinsics.c(this.createdTs, localAchievement.createdTs);
    }

    public int hashCode() {
        return (this.codeName.hashCode() * 31) + this.createdTs.hashCode();
    }

    @NotNull
    public String toString() {
        return "LocalAchievement(codeName=" + this.codeName + ", createdTs=" + this.createdTs + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LocalAchievement(String str, Instant instant, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 2) != 0) {
            instant = Instant.now();
            Intrinsics.checkNotNullExpressionValue(instant, "now(...)");
        }
        this(str, instant);
    }
}
