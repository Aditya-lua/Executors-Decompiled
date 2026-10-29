package s0;

import android.media.MediaCodec;
import android.util.Range;
import g0.r1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n0.l1;
import n0.o3;
import n0.u1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u000e*\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u000e*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ls0/g;", "", "<init>", "()V", "", "Ln0/o3$f;", "outputConfigs", "Ln0/l1$a;", "repeatingConfigBuilder", "", "e", "(Ljava/util/Collection;Ln0/l1$a;)V", "Landroid/util/Range;", "", "", "c", "(Landroid/util/Range;)Z", "f", "(Landroid/util/Range;)Landroid/util/Range;", "a", "(Ljava/util/Collection;)Z", "b", "(Ln0/l1$a;)Z", "Ln0/u1;", "d", "(Ln0/u1;)Z", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {
    public final boolean a(Collection<? extends o3.f> collection) {
        Collection<? extends o3.f> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return false;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            u1 u1VarF = ((o3.f) it.next()).f();
            Intrinsics.checkNotNullExpressionValue(u1VarF, "getSurface(...)");
            if (d(u1VarF)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(l1.a aVar) {
        Set<u1> setM = aVar.m();
        Intrinsics.checkNotNullExpressionValue(setM, "getSurfaces(...)");
        Set<u1> set = setM;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (u1 u1Var : set) {
            Intrinsics.checkNotNull(u1Var);
            if (d(u1Var)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(Range<Integer> range) {
        return ((Number) range.getUpper()).intValue() >= 120 && Intrinsics.c(range.getLower(), range.getUpper());
    }

    public final boolean d(u1 u1Var) {
        return Intrinsics.c(u1Var.g(), MediaCodec.class);
    }

    public final void e(@NotNull Collection<? extends o3.f> outputConfigs, @NotNull l1.a repeatingConfigBuilder) {
        Range<Integer> rangeL;
        Intrinsics.checkNotNullParameter(outputConfigs, "outputConfigs");
        Intrinsics.checkNotNullParameter(repeatingConfigBuilder, "repeatingConfigBuilder");
        if (outputConfigs.size() != 2 || !a(outputConfigs) || b(repeatingConfigBuilder) || (rangeL = repeatingConfigBuilder.l()) == null) {
            return;
        }
        if (!c(rangeL)) {
            rangeL = null;
        }
        if (rangeL != null) {
            repeatingConfigBuilder.q(f(rangeL));
        }
    }

    public final Range<Integer> f(Range<Integer> range) {
        Range<Integer> range2 = new Range<>(30, range.getUpper());
        r1.a("HighSpeedFpsModifier", "Modified high-speed FPS range from " + range + " to " + range2);
        return range2;
    }
}
