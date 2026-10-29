package g0;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lg0/q1;", "Lg0/g2;", "", "Lg0/w2;", "useCases", "Lg0/y2;", "viewPort", "Lg0/n;", "effects", "<init>", "(Ljava/util/List;Lg0/y2;Ljava/util/List;)V", "Lg0/x2;", "useCaseGroup", "(Lg0/x2;)V", "", "j", "Z", "m", "()Z", "isLegacy", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q1 extends g2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final boolean isLegacy;

    public /* synthetic */ q1(List list, y2 y2Var, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? null : y2Var, (i10 & 4) != 0 ? kotlin.collections.p.k() : list2);
    }

    @Override // g0.g2
    /* JADX INFO: renamed from: m, reason: from getter */
    public boolean getIsLegacy() {
        return this.isLegacy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(@NotNull List<? extends w2> useCases, @Nullable y2 y2Var, @NotNull List<? extends n> effects) {
        super(useCases, y2Var, effects, null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Intrinsics.checkNotNullParameter(effects, "effects");
        this.isLegacy = true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q1(@NotNull x2 useCaseGroup) {
        Intrinsics.checkNotNullParameter(useCaseGroup, "useCaseGroup");
        List<w2> listB = useCaseGroup.b();
        Intrinsics.checkNotNullExpressionValue(listB, "getUseCases(...)");
        y2 y2VarC = useCaseGroup.c();
        List<n> listA = useCaseGroup.a();
        Intrinsics.checkNotNullExpressionValue(listA, "getEffects(...)");
        this(listB, y2VarC, listA);
    }
}
