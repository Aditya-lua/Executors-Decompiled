package z;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 \u00192\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\"\u0004\b\u0000\u0010\u00062\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\b2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\b¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0016\u0018\u00010\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0006*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00160\b2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010'\u001a\u0004\u0018\u00010\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010&R!\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lz/m4;", "", "La0/c0;", "characteristics", "<init>", "(La0/c0;)V", "T", "", "", "Landroid/util/Size;", "sizesMap", "d", "(Ljava/util/Map;)Ljava/util/Map;", "size", "", "h", "(Landroid/util/Size;)I", "sizesList", "j", "(Ljava/util/List;)Ljava/util/List;", "surfaceSizes", "", "Landroid/util/Range;", "f", "(Ljava/util/List;)[Landroid/util/Range;", "e", "g", "(Landroid/util/Size;)Ljava/util/List;", "a", "La0/c0;", "", "b", "Ljt/h;", "m", "()Z", "isHighSpeedSupported", "c", "i", "()Landroid/util/Size;", "maxSize", "k", "()Ljava/util/List;", "supportedSizes", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Range<Integer> f36695f = new Range<>(120, 120);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a0.c0 characteristics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final jt.h isHighSpeedSupported;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h maxSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h supportedSizes;

    /* JADX INFO: renamed from: z.m4$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lz/m4$a;", "", "<init>", "()V", "", "Ln0/g;", "attachedSurfaces", "Ln0/i4;", "newUseCaseConfigs", "", "a", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "", "TAG", "Ljava/lang/String;", "Landroid/util/Range;", "", "DEFAULT_FPS", "Landroid/util/Range;", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(@NotNull Collection<? extends n0.g> attachedSurfaces, @NotNull Collection<? extends n0.i4<?>> newUseCaseConfigs) {
            boolean z10;
            Intrinsics.checkNotNullParameter(attachedSurfaces, "attachedSurfaces");
            Intrinsics.checkNotNullParameter(newUseCaseConfigs, "newUseCaseConfigs");
            Collection<? extends n0.g> collection = attachedSurfaces;
            ArrayList arrayList = new ArrayList(kotlin.collections.q.u(collection, 10));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((n0.g) it.next()).f()));
            }
            Collection<? extends n0.i4<?>> collection2 = newUseCaseConfigs;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.q.u(collection2, 10));
            Iterator<T> it2 = collection2.iterator();
            while (true) {
                z10 = false;
                if (!it2.hasNext()) {
                    break;
                }
                arrayList2.add(Integer.valueOf(((n0.i4) it2.next()).o(0)));
            }
            List listW0 = CollectionsKt.w0(arrayList, arrayList2);
            boolean z11 = listW0 instanceof Collection;
            if (!z11 || !listW0.isEmpty()) {
                Iterator it3 = listW0.iterator();
                while (it3.hasNext()) {
                    if (((Number) it3.next()).intValue() == 1) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (!z10 || (z11 && listW0.isEmpty())) {
                return z10;
            }
            Iterator it4 = listW0.iterator();
            while (it4.hasNext()) {
                if (((Number) it4.next()).intValue() != 1) {
                    throw new IllegalArgumentException("All sessionTypes should be high-speed when any of them is high-speed");
                }
            }
            return z10;
        }

        public Companion() {
        }
    }

    public m4(@NotNull a0.c0 characteristics) {
        Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        this.characteristics = characteristics;
        this.isHighSpeedSupported = jt.i.b(new Function0() { // from class: z.j4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(m4.n(this.f36638a));
            }
        });
        this.maxSize = jt.i.b(new Function0() { // from class: z.k4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m4.o(this.f36674a);
            }
        });
        this.supportedSizes = jt.i.b(new Function0() { // from class: z.l4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m4.p(this.f36683a);
            }
        });
    }

    public static final boolean l(@NotNull Collection<? extends n0.g> collection, @NotNull Collection<? extends n0.i4<?>> collection2) {
        return INSTANCE.a(collection, collection2);
    }

    public static final boolean n(m4 m4Var) {
        int[] iArr = (int[]) m4Var.characteristics.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == 9) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final Size o(m4 m4Var) {
        List<Size> listK = m4Var.k();
        if (listK.isEmpty()) {
            listK = null;
        }
        if (listK == null) {
            return null;
        }
        Iterator<T> it = listK.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            int iC = w0.d.c((Size) next);
            do {
                Object next2 = it.next();
                int iC2 = w0.d.c((Size) next2);
                if (iC < iC2) {
                    next = next2;
                    iC = iC2;
                }
            } while (it.hasNext());
        }
        return (Size) next;
    }

    public static final List p(m4 m4Var) {
        List listI;
        Size[] sizeArrC = m4Var.characteristics.e().c();
        return (sizeArrC == null || (listI = kotlin.collections.m.I(sizeArrC)) == null) ? kotlin.collections.p.k() : listI;
    }

    @NotNull
    public final <T> Map<T, List<Size>> d(@NotNull Map<T, ? extends List<Size>> sizesMap) {
        Intrinsics.checkNotNullParameter(sizesMap, "sizesMap");
        List<T> listE = e(CollectionsKt.M0(sizesMap.values()));
        ArrayList arrayList = new ArrayList();
        for (T t8 : listE) {
            if (k().contains((Size) t8)) {
                arrayList.add(t8);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.j0.f(sizesMap.size()));
        Iterator<T> it = sizesMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (arrayList.contains((Size) obj)) {
                    arrayList2.add(obj);
                }
            }
            linkedHashMap.put(key, arrayList2);
        }
        return linkedHashMap;
    }

    public final <T> List<T> e(List<? extends List<? extends T>> list) {
        if (list.isEmpty()) {
            return kotlin.collections.p.k();
        }
        List<T> listO0 = CollectionsKt.O0((Collection) CollectionsKt.d0(list));
        Iterator<T> it = CollectionsKt.Y(list, 1).iterator();
        while (it.hasNext()) {
            listO0.retainAll((List) it.next());
        }
        return listO0;
    }

    @Nullable
    public final Range<Integer>[] f(@NotNull List<Size> surfaceSizes) {
        Intrinsics.checkNotNullParameter(surfaceSizes, "surfaceSizes");
        int size = surfaceSizes.size();
        if (1 > size || size >= 3 || CollectionsKt.X(surfaceSizes).size() != 1) {
            return null;
        }
        List<Range<Integer>> listG = g(surfaceSizes.get(0));
        if (listG.isEmpty()) {
            listG = null;
        }
        if (listG == null) {
            return null;
        }
        if (surfaceSizes.size() == 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listG) {
                Range range = (Range) obj;
                if (Intrinsics.c(range.getLower(), range.getUpper())) {
                    arrayList.add(obj);
                }
            }
            listG = arrayList;
        }
        return (Range[]) listG.toArray(new Range[0]);
    }

    public final List<Range<Integer>> g(Size size) {
        Object objB;
        List listI;
        List<Range<Integer>> listM0;
        try {
            jt.n.Companion companion = jt.n.INSTANCE;
            objB = jt.n.b(this.characteristics.e().b(size));
        } catch (Throwable th2) {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            objB = jt.n.b(jt.o.a(th2));
        }
        if (jt.n.g(objB)) {
            objB = null;
        }
        Range[] rangeArr = (Range[]) objB;
        return (rangeArr == null || (listI = kotlin.collections.m.I(rangeArr)) == null || (listM0 = CollectionsKt.M0(listI)) == null) ? kotlin.collections.p.k() : listM0;
    }

    public final int h(@NotNull Size size) {
        Intrinsics.checkNotNullParameter(size, "size");
        List<Range<Integer>> listG = g(size);
        if (listG.isEmpty()) {
            listG = null;
        }
        if (listG == null) {
            g0.r1.l("HighSpeedResolver", "No supported high speed  fps for " + size);
            return 0;
        }
        Iterator<T> it = listG.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Integer num = (Integer) ((Range) it.next()).getUpper();
        while (it.hasNext()) {
            Integer num2 = (Integer) ((Range) it.next()).getUpper();
            if (num.compareTo(num2) < 0) {
                num = num2;
            }
        }
        Intrinsics.checkNotNullExpressionValue(num, "maxOf(...)");
        return num.intValue();
    }

    @Nullable
    public final Size i() {
        return (Size) this.maxSize.getValue();
    }

    @NotNull
    public final List<List<Size>> j(@NotNull List<? extends List<Size>> sizesList) {
        Intrinsics.checkNotNullParameter(sizesList, "sizesList");
        if (sizesList.isEmpty()) {
            return kotlin.collections.p.k();
        }
        List<Size> listE = e(sizesList);
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(listE, 10));
        for (Size size : listE) {
            int size2 = sizesList.size();
            ArrayList arrayList2 = new ArrayList(size2);
            for (int i10 = 0; i10 < size2; i10++) {
                arrayList2.add(size);
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public final List<Size> k() {
        return (List) this.supportedSizes.getValue();
    }

    public final boolean m() {
        return ((Boolean) this.isHighSpeedSupported.getValue()).booleanValue();
    }
}
