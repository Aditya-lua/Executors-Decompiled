package o4;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lo4/j;", "", "<init>", "()V", "a", "b", "c", "Lo4/j$b;", "Lo4/j$c;", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class j {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo4/j$b;", "Lo4/j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends j {

        @NotNull
        public static final b b = new b();

        public b() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "Idle()";
        }
    }

    /* JADX INFO: renamed from: o4.j$c, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, d2 = {"Lo4/j$c;", "Lo4/j;", "Lo4/b;", "latestEvent", "", "direction", "<init>", "(Lo4/b;I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Lo4/b;", "getLatestEvent", "()Lo4/b;", "c", "I", "getDirection", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InProgress extends j {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final NavigationEvent latestEvent;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final int direction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InProgress(@NotNull NavigationEvent latestEvent, int i10) {
            super(null);
            Intrinsics.checkNotNullParameter(latestEvent, "latestEvent");
            this.latestEvent = latestEvent;
            this.direction = i10;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || InProgress.class != other.getClass()) {
                return false;
            }
            InProgress inProgress = (InProgress) other;
            return this.direction == inProgress.direction && Intrinsics.c(this.latestEvent, inProgress.latestEvent);
        }

        public int hashCode() {
            return (this.direction * 31) + this.latestEvent.hashCode();
        }

        @NotNull
        public String toString() {
            return "InProgress(latestEvent=" + this.latestEvent + ", direction=" + this.direction + ')';
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public j() {
    }
}
