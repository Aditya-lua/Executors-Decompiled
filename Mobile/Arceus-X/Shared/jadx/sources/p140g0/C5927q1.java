package p140g0;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: g0.q1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"Lg0/q1;", "Lg0/g2;", "", "Lg0/w2;", "useCases", "Lg0/y2;", "viewPort", "Lg0/n;", "effects", "<init>", "(Ljava/util/List;Lg0/y2;Ljava/util/List;)V", "Lg0/x2;", "useCaseGroup", "(Lg0/x2;)V", "", "j", "Z", "m", "()Z", "isLegacy", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C5927q1 extends C5888g2 {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final boolean isLegacy;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
      (r1v0 java.util.List)
      (wrap g0.y2:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null g0.y2) : (r2v0 g0.y2))
      (wrap java.util.List:?: TERNARY null = ((wrap int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.List:0x0009: INVOKE  STATIC call: kotlin.collections.p.k():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:1)) : (r3v0 java.util.List))
     A[MD:(java.util.List<? extends g0.w2>, g0.y2, java.util.List<? extends g0.n>):void (m)] (LINE:2) call: g0.q1.<init>(java.util.List, g0.y2, java.util.List):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5927q1(List list, C5960y2 c5960y2, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? null : c5960y2, (i10 & 4) != 0 ? C7699p.m31892k() : list2);
    }

    @Override // p140g0.C5888g2
    /* JADX INFO: renamed from: m, reason: from getter */
    public boolean getIsLegacy() {
        return this.isLegacy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5927q1(@NotNull List<? extends AbstractC5952w2> useCases, @Nullable C5960y2 c5960y2, @NotNull List<? extends AbstractC5913n> effects) {
        super(useCases, c5960y2, effects, null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Intrinsics.checkNotNullParameter(effects, "effects");
        this.isLegacy = true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5927q1(@NotNull C5956x2 useCaseGroup) {
        Intrinsics.checkNotNullParameter(useCaseGroup, "useCaseGroup");
        List<AbstractC5952w2> listM26741b = useCaseGroup.m26741b();
        Intrinsics.checkNotNullExpressionValue(listM26741b, "getUseCases(...)");
        C5960y2 c5960y2M26742c = useCaseGroup.m26742c();
        List<AbstractC5913n> listM26740a = useCaseGroup.m26740a();
        Intrinsics.checkNotNullExpressionValue(listM26740a, "getEffects(...)");
        this(listM26741b, c5960y2M26742c, listM26740a);
    }
}
