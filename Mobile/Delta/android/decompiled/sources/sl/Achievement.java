package sl;

import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sl.a, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u0019\u0010 ¨\u0006\""}, d2 = {"Lsl/a;", "", "", "Id", "", "codeName", "Lsl/m;", "origin", "Ljava/time/Instant;", "createdTs", "syncedTs", "<init>", "(ILjava/lang/String;Lsl/m;Ljava/time/Instant;Ljava/time/Instant;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "Lsl/m;", "getOrigin", "()Lsl/m;", "d", "Ljava/time/Instant;", "getCreatedTs", "()Ljava/time/Instant;", "e", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Achievement {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final int Id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String codeName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final m origin;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Instant createdTs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Instant syncedTs;

    public Achievement(int i10, @NotNull String codeName, @NotNull m origin, @NotNull Instant createdTs, @Nullable Instant instant) {
        Intrinsics.checkNotNullParameter(codeName, "codeName");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(createdTs, "createdTs");
        this.Id = i10;
        this.codeName = codeName;
        this.origin = origin;
        this.createdTs = createdTs;
        this.syncedTs = instant;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCodeName() {
        return this.codeName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getId() {
        return this.Id;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Instant getSyncedTs() {
        return this.syncedTs;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Achievement)) {
            return false;
        }
        Achievement achievement = (Achievement) other;
        return this.Id == achievement.Id && Intrinsics.c(this.codeName, achievement.codeName) && this.origin == achievement.origin && Intrinsics.c(this.createdTs, achievement.createdTs) && Intrinsics.c(this.syncedTs, achievement.syncedTs);
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.Id) * 31) + this.codeName.hashCode()) * 31) + this.origin.hashCode()) * 31) + this.createdTs.hashCode()) * 31;
        Instant instant = this.syncedTs;
        return iHashCode + (instant == null ? 0 : instant.hashCode());
    }

    @NotNull
    public String toString() {
        return "Achievement(Id=" + this.Id + ", codeName=" + this.codeName + ", origin=" + this.origin + ", createdTs=" + this.createdTs + ", syncedTs=" + this.syncedTs + ")";
    }
}
