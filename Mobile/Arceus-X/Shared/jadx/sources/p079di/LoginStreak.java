package p079di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: di.c, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, m31665d2 = {"Ldi/c;", "", "", "streakStartTimestamp", "lastActiveTimestamp", "<init>", "(JJ)V", "a", "(JJ)Ldi/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "d", "()J", "b", "c", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class LoginStreak {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long streakStartTimestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long lastActiveTimestamp;

    public LoginStreak(long j10, long j11) {
        this.streakStartTimestamp = j10;
        this.lastActiveTimestamp = j11;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ LoginStreak m22767b(LoginStreak loginStreak, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = loginStreak.streakStartTimestamp;
        }
        if ((i10 & 2) != 0) {
            j11 = loginStreak.lastActiveTimestamp;
        }
        return loginStreak.m22768a(j10, j11);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final LoginStreak m22768a(long streakStartTimestamp, long lastActiveTimestamp) {
        return new LoginStreak(streakStartTimestamp, lastActiveTimestamp);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getLastActiveTimestamp() {
        return this.lastActiveTimestamp;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getStreakStartTimestamp() {
        return this.streakStartTimestamp;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginStreak)) {
            return false;
        }
        LoginStreak loginStreak = (LoginStreak) other;
        return this.streakStartTimestamp == loginStreak.streakStartTimestamp && this.lastActiveTimestamp == loginStreak.lastActiveTimestamp;
    }

    public int hashCode() {
        return (Long.hashCode(this.streakStartTimestamp) * 31) + Long.hashCode(this.lastActiveTimestamp);
    }

    @NotNull
    public String toString() {
        return "LoginStreak(streakStartTimestamp=" + this.streakStartTimestamp + ", lastActiveTimestamp=" + this.lastActiveTimestamp + ")";
    }
}
