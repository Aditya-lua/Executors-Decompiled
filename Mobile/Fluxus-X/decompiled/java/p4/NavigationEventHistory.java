package p4;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.u;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: p4.f, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0010¢\u0006\u0004\b\u0007\u0010\tB1\b\u0011\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013¨\u0006\u001e"}, d2 = {"Lp4/f;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lp4/g;", "mergedHistory", BuildConfig.FLAVOR, "currentIndex", "<init>", "(Ljava/util/List;I)V", "()V", "currentInfo", "backInfo", "forwardInfo", "(Lp4/g;Ljava/util/List;Ljava/util/List;)V", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "getMergedHistory", "()Ljava/util/List;", "b", "I", "getCurrentIndex", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavigationEventHistory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<g> mergedHistory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int currentIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public NavigationEventHistory(List<? extends g> list, int i10) {
        this.mergedHistory = list;
        this.currentIndex = i10;
        if (list.isEmpty() && i10 == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i10 >= 0 && i10 < size) {
                return;
            }
        }
        throw new IllegalArgumentException(("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '" + i10 + "', bounds = '" + p001kotlin.collections.p.l(list) + "'.").toString());
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || NavigationEventHistory.class != other.getClass()) {
            return false;
        }
        NavigationEventHistory navigationEventHistory = (NavigationEventHistory) other;
        return this.currentIndex == navigationEventHistory.currentIndex && Intrinsics.c(this.mergedHistory, navigationEventHistory.mergedHistory);
    }

    public int hashCode() {
        return (this.currentIndex * 31) + this.mergedHistory.hashCode();
    }

    @NotNull
    public String toString() {
        return "NavigationEventHistory(currentIndex=" + this.currentIndex + ", mergedHistory=" + this.mergedHistory + ')';
    }

    public NavigationEventHistory() {
        this(p001kotlin.collections.p.k(), -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationEventHistory(@NotNull g currentInfo, @NotNull List<? extends g> backInfo, @NotNull List<? extends g> forwardInfo) {
        Intrinsics.checkNotNullParameter(currentInfo, "currentInfo");
        Intrinsics.checkNotNullParameter(backInfo, "backInfo");
        Intrinsics.checkNotNullParameter(forwardInfo, "forwardInfo");
        List listC = p001kotlin.collections.o.c();
        List list = listC;
        u.z(list, backInfo);
        list.add(currentInfo);
        u.z(list, forwardInfo);
        this(p001kotlin.collections.o.a(listC), backInfo.size());
    }
}
