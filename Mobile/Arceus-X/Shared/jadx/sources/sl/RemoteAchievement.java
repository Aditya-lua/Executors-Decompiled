package sl;

import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sl.u, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u001d"}, m31665d2 = {"Lsl/u;", "", "", "codeName", "Ljava/time/Instant;", "syncedTs", "<init>", "(Ljava/lang/String;Ljava/time/Instant;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/Instant;", "d", "()Ljava/time/Instant;", "Lsl/m;", "c", "Lsl/m;", "()Lsl/m;", "origin", "createdTs", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class RemoteAchievement {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String codeName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Instant syncedTs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final EnumC11403m origin;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Instant createdTs;

    public RemoteAchievement(@NotNull String codeName, @NotNull Instant syncedTs) {
        Intrinsics.checkNotNullParameter(codeName, "codeName");
        Intrinsics.checkNotNullParameter(syncedTs, "syncedTs");
        this.codeName = codeName;
        this.syncedTs = syncedTs;
        this.origin = EnumC11403m.REMOTE;
        this.createdTs = syncedTs;
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
    public final EnumC11403m getOrigin() {
        return this.origin;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Instant getSyncedTs() {
        return this.syncedTs;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteAchievement)) {
            return false;
        }
        RemoteAchievement remoteAchievement = (RemoteAchievement) other;
        return Intrinsics.m31980c(this.codeName, remoteAchievement.codeName) && Intrinsics.m31980c(this.syncedTs, remoteAchievement.syncedTs);
    }

    public int hashCode() {
        return (this.codeName.hashCode() * 31) + this.syncedTs.hashCode();
    }

    @NotNull
    public String toString() {
        return "RemoteAchievement(codeName=" + this.codeName + ", syncedTs=" + this.syncedTs + ")";
    }
}
