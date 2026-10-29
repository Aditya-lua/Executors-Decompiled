package p589z;

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
import kotlin.collections.C7688j0;
import kotlin.collections.C7693m;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001a0.C0008c0;
import p140g0.C5931r1;
import p229jt.C7342i;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.InterfaceC7341h;
import p296n0.AbstractC8754g;
import p296n0.InterfaceC8771i4;
import p503w0.C12274d;

/* JADX INFO: renamed from: z.m4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 \u00192\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\"\u0004\b\u0000\u0010\u00062\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\b2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\b¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0016\u0018\u00010\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0006*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00160\b2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010'\u001a\u0004\u0018\u00010\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010&R!\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b(\u0010)¨\u0006+"}, m31665d2 = {"Lz/m4;", "", "La0/c0;", "characteristics", "<init>", "(La0/c0;)V", "T", "", "", "Landroid/util/Size;", "sizesMap", "d", "(Ljava/util/Map;)Ljava/util/Map;", "size", "", "h", "(Landroid/util/Size;)I", "sizesList", "j", "(Ljava/util/List;)Ljava/util/List;", "surfaceSizes", "", "Landroid/util/Range;", "f", "(Ljava/util/List;)[Landroid/util/Range;", "e", "g", "(Landroid/util/Size;)Ljava/util/List;", "a", "La0/c0;", "", "b", "Ljt/h;", "m", "()Z", "isHighSpeedSupported", "c", "i", "()Landroid/util/Size;", "maxSize", "k", "()Ljava/util/List;", "supportedSizes", "camera-camera2_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C13576m4 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Range<Integer> f47526f = new Range<>(120, 120);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C0008c0 characteristics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h isHighSpeedSupported;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h maxSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h supportedSizes;

    /* JADX INFO: renamed from: z.m4$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lz/m4$a;", "", "<init>", "()V", "", "Ln0/g;", "attachedSurfaces", "Ln0/i4;", "newUseCaseConfigs", "", "a", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "", "TAG", "Ljava/lang/String;", "Landroid/util/Range;", "", "DEFAULT_FPS", "Landroid/util/Range;", "camera-camera2_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: z.m4.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m49522a(@NotNull Collection<? extends AbstractC8754g> attachedSurfaces, @NotNull Collection<? extends InterfaceC8771i4<?>> newUseCaseConfigs) {
            boolean z10;
            Intrinsics.checkNotNullParameter(attachedSurfaces, "attachedSurfaces");
            Intrinsics.checkNotNullParameter(newUseCaseConfigs, "newUseCaseConfigs");
            Collection<? extends AbstractC8754g> collection = attachedSurfaces;
            ArrayList arrayList = new ArrayList(C7701q.m31905u(collection, 10));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((AbstractC8754g) it.next()).mo35099f()));
            }
            Collection<? extends InterfaceC8771i4<?>> collection2 = newUseCaseConfigs;
            ArrayList arrayList2 = new ArrayList(C7701q.m31905u(collection2, 10));
            Iterator<T> it2 = collection2.iterator();
            while (true) {
                z10 = false;
                if (!it2.hasNext()) {
                    break;
                }
                arrayList2.add(Integer.valueOf(((InterfaceC8771i4) it2.next()).m35211o(0)));
            }
            List listW0 = CollectionsKt.m31725w0(arrayList, arrayList2);
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public C13576m4(@NotNull C0008c0 characteristics) {
        Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        this.characteristics = characteristics;
        this.isHighSpeedSupported = C7342i.m30456b(new Function0() { // from class: z.j4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C13576m4.m49510n(this.f47459a));
            }
        });
        this.maxSize = C7342i.m30456b(new Function0() { // from class: z.k4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13576m4.m49511o(this.f47498a);
            }
        });
        this.supportedSizes = C7342i.m30456b(new Function0() { // from class: z.l4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13576m4.m49512p(this.f47511a);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m49509l(@NotNull Collection<? extends AbstractC8754g> collection, @NotNull Collection<? extends InterfaceC8771i4<?>> collection2) {
        return INSTANCE.m49522a(collection, collection2);
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m49510n(C13576m4 c13576m4) {
        int[] iArr = (int[]) c13576m4.characteristics.m9a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == 9) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static final Size m49511o(C13576m4 c13576m4) {
        List<Size> listM49520k = c13576m4.m49520k();
        if (listM49520k.isEmpty()) {
            listM49520k = null;
        }
        if (listM49520k == null) {
            return null;
        }
        Iterator<T> it = listM49520k.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            int iM45571c = C12274d.m45571c((Size) next);
            do {
                Object next2 = it.next();
                int iM45571c2 = C12274d.m45571c((Size) next2);
                if (iM45571c < iM45571c2) {
                    next = next2;
                    iM45571c = iM45571c2;
                }
            } while (it.hasNext());
        }
        return (Size) next;
    }

    /* JADX INFO: renamed from: p */
    public static final List m49512p(C13576m4 c13576m4) {
        List listM31840I;
        Size[] sizeArrM91c = c13576m4.characteristics.m13e().m91c();
        return (sizeArrM91c == null || (listM31840I = C7693m.m31840I(sizeArrM91c)) == null) ? C7699p.m31892k() : listM31840I;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final <T> Map<T, List<Size>> m49513d(@NotNull Map<T, ? extends List<Size>> sizesMap) {
        Intrinsics.checkNotNullParameter(sizesMap, "sizesMap");
        List<T> listM49514e = m49514e(CollectionsKt.m31687M0(sizesMap.values()));
        ArrayList arrayList = new ArrayList();
        for (T t8 : listM49514e) {
            if (m49520k().contains((Size) t8)) {
                arrayList.add(t8);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7688j0.m31790f(sizesMap.size()));
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

    /* JADX INFO: renamed from: e */
    public final <T> List<T> m49514e(List<? extends List<? extends T>> list) {
        if (list.isEmpty()) {
            return C7699p.m31892k();
        }
        List<T> listO0 = CollectionsKt.m31689O0((Collection) CollectionsKt.m31706d0(list));
        Iterator<T> it = CollectionsKt.m31701Y(list, 1).iterator();
        while (it.hasNext()) {
            listO0.retainAll((List) it.next());
        }
        return listO0;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Range<Integer>[] m49515f(@NotNull List<Size> surfaceSizes) {
        Intrinsics.checkNotNullParameter(surfaceSizes, "surfaceSizes");
        int size = surfaceSizes.size();
        if (1 > size || size >= 3 || CollectionsKt.m31700X(surfaceSizes).size() != 1) {
            return null;
        }
        List<Range<Integer>> listM49516g = m49516g(surfaceSizes.get(0));
        if (listM49516g.isEmpty()) {
            listM49516g = null;
        }
        if (listM49516g == null) {
            return null;
        }
        if (surfaceSizes.size() == 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM49516g) {
                Range range = (Range) obj;
                if (Intrinsics.m31980c(range.getLower(), range.getUpper())) {
                    arrayList.add(obj);
                }
            }
            listM49516g = arrayList;
        }
        return (Range[]) listM49516g.toArray(new Range[0]);
    }

    /* JADX INFO: renamed from: g */
    public final List<Range<Integer>> m49516g(Size size) {
        Object objM30460b;
        List listM31840I;
        List<Range<Integer>> listM0;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(this.characteristics.m13e().m90b(size));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        if (C7347n.m30465g(objM30460b)) {
            objM30460b = null;
        }
        Range[] rangeArr = (Range[]) objM30460b;
        return (rangeArr == null || (listM31840I = C7693m.m31840I(rangeArr)) == null || (listM0 = CollectionsKt.m31687M0(listM31840I)) == null) ? C7699p.m31892k() : listM0;
    }

    /* JADX INFO: renamed from: h */
    public final int m49517h(@NotNull Size size) {
        Intrinsics.checkNotNullParameter(size, "size");
        List<Range<Integer>> listM49516g = m49516g(size);
        if (listM49516g.isEmpty()) {
            listM49516g = null;
        }
        if (listM49516g == null) {
            C5931r1.m26572l("HighSpeedResolver", "No supported high speed  fps for " + size);
            return 0;
        }
        Iterator<T> it = listM49516g.iterator();
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
    /* JADX INFO: renamed from: i */
    public final Size m49518i() {
        return (Size) this.maxSize.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final List<List<Size>> m49519j(@NotNull List<? extends List<Size>> sizesList) {
        Intrinsics.checkNotNullParameter(sizesList, "sizesList");
        if (sizesList.isEmpty()) {
            return C7699p.m31892k();
        }
        List<Size> listM49514e = m49514e(sizesList);
        ArrayList arrayList = new ArrayList(C7701q.m31905u(listM49514e, 10));
        for (Size size : listM49514e) {
            int size2 = sizesList.size();
            ArrayList arrayList2 = new ArrayList(size2);
            for (int i10 = 0; i10 < size2; i10++) {
                arrayList2.add(size);
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public final List<Size> m49520k() {
        return (List) this.supportedSizes.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m49521m() {
        return ((Boolean) this.isHighSpeedSupported.getValue()).booleanValue();
    }
}
