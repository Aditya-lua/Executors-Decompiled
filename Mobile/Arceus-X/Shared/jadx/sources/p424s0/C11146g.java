package p424s0;

import android.media.MediaCodec;
import android.util.Range;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p140g0.C5931r1;
import p296n0.AbstractC8830u1;
import p296n0.C8785l1;
import p296n0.C8802o3;

/* JADX INFO: renamed from: s0.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u000e*\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u000e*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m31665d2 = {"Ls0/g;", "", "<init>", "()V", "", "Ln0/o3$f;", "outputConfigs", "Ln0/l1$a;", "repeatingConfigBuilder", "", "e", "(Ljava/util/Collection;Ln0/l1$a;)V", "Landroid/util/Range;", "", "", "c", "(Landroid/util/Range;)Z", "f", "(Landroid/util/Range;)Landroid/util/Range;", "a", "(Ljava/util/Collection;)Z", "b", "(Ln0/l1$a;)Z", "Ln0/u1;", "d", "(Ln0/u1;)Z", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C11146g {
    /* JADX INFO: renamed from: a */
    public final boolean m41997a(Collection<? extends C8802o3.f> collection) {
        Collection<? extends C8802o3.f> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return false;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            AbstractC8830u1 abstractC8830u1Mo35348f = ((C8802o3.f) it.next()).mo35348f();
            Intrinsics.checkNotNullExpressionValue(abstractC8830u1Mo35348f, "getSurface(...)");
            if (m42000d(abstractC8830u1Mo35348f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m41998b(C8785l1.a aVar) {
        Set<AbstractC8830u1> setM35264m = aVar.m35264m();
        Intrinsics.checkNotNullExpressionValue(setM35264m, "getSurfaces(...)");
        Set<AbstractC8830u1> set = setM35264m;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (AbstractC8830u1 abstractC8830u1 : set) {
            Intrinsics.checkNotNull(abstractC8830u1);
            if (m42000d(abstractC8830u1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m41999c(Range<Integer> range) {
        return ((Number) range.getUpper()).intValue() >= 120 && Intrinsics.m31980c(range.getLower(), range.getUpper());
    }

    /* JADX INFO: renamed from: d */
    public final boolean m42000d(AbstractC8830u1 abstractC8830u1) {
        return Intrinsics.m31980c(abstractC8830u1.m35433g(), MediaCodec.class);
    }

    /* JADX INFO: renamed from: e */
    public final void m42001e(@NotNull Collection<? extends C8802o3.f> outputConfigs, @NotNull C8785l1.a repeatingConfigBuilder) {
        Range<Integer> rangeM35263l;
        Intrinsics.checkNotNullParameter(outputConfigs, "outputConfigs");
        Intrinsics.checkNotNullParameter(repeatingConfigBuilder, "repeatingConfigBuilder");
        if (outputConfigs.size() != 2 || !m41997a(outputConfigs) || m41998b(repeatingConfigBuilder) || (rangeM35263l = repeatingConfigBuilder.m35263l()) == null) {
            return;
        }
        if (!m41999c(rangeM35263l)) {
            rangeM35263l = null;
        }
        if (rangeM35263l != null) {
            repeatingConfigBuilder.m35268q(m42002f(rangeM35263l));
        }
    }

    /* JADX INFO: renamed from: f */
    public final Range<Integer> m42002f(Range<Integer> range) {
        Range<Integer> range2 = new Range<>(30, range.getUpper());
        C5931r1.m26561a("HighSpeedFpsModifier", "Modified high-speed FPS range from " + range + " to " + range2);
        return range2;
    }
}
