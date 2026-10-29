package p259l0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.C7704r0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p140g0.AbstractC5952w2;
import p140g0.C5864a2;
import p140g0.C5883f1;
import p140g0.C5888g2;
import p140g0.C5931r1;
import p182i0.AbstractC6600b;
import p204j0.EnumC7013c;
import p204j0.ResolvedFeatureGroup;
import p229jt.C7345l;
import p233k0.EnumC7401b;
import p296n0.InterfaceC8799o0;
import p424s0.C11145f;

/* JADX INFO: renamed from: l0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u0019"}, m31665d2 = {"Ll0/a;", "Ll0/c;", "Ln0/o0;", "cameraInfoInternal", "<init>", "(Ln0/o0;)V", "Lg0/g2;", "sessionConfig", "Ll0/b;", "a", "(Lg0/g2;)Ll0/b;", "Li0/b;", "", "Lg0/w2;", "useCases", "Ll0/b$d;", "d", "(Li0/b;Ljava/util/List;)Ll0/b$d;", "orderedPreferredFeatures", "", "index", "currentOptionalFeatures", "b", "(Lg0/g2;Ljava/util/List;ILjava/util/List;)Ll0/b;", "Ln0/o0;", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C7955a implements InterfaceC7957c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8799o0 cameraInfoInternal;

    /* JADX INFO: renamed from: l0.a$b */
    @Metadata(m31666k = 3, m31667mv = {2, 0, 0}, m31669xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29833a;

        static {
            int[] iArr = new int[EnumC7401b.values().length];
            try {
                iArr[EnumC7401b.IMAGE_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7401b.DYNAMIC_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7401b.FPS_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC7401b.VIDEO_STABILIZATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f29833a = iArr;
        }
    }

    public C7955a(@NotNull InterfaceC8799o0 cameraInfoInternal) {
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        this.cameraInfoInternal = cameraInfoInternal;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: l0.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC7956b m32952c(C7955a c7955a, C5888g2 c5888g2, List list, int i10, List list2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        if ((i11 & 8) != 0) {
            list2 = C7699p.m31892k();
        }
        return c7955a.m32954b(c5888g2, list, i10, list2);
    }

    @Override // p259l0.InterfaceC7957c
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC7956b mo32953a(@NotNull C5888g2 sessionConfig) {
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        List<AbstractC5952w2> listM26474k = sessionConfig.m26474k();
        Set<AbstractC6600b> setM26471h = sessionConfig.m26471h();
        List<AbstractC6600b> listM26470g = sessionConfig.m26470g();
        if (setM26471h.isEmpty() && listM26470g.isEmpty()) {
            throw new IllegalArgumentException("Must have at least one required or preferred feature");
        }
        for (AbstractC5952w2 abstractC5952w2 : listM26474k) {
            if (EnumC7013c.INSTANCE.m29684b(abstractC5952w2) == EnumC7013c.UNDEFINED) {
                return new InterfaceC7956b.UnsupportedUseCase(abstractC5952w2);
            }
        }
        Iterator<T> it = setM26471h.iterator();
        while (it.hasNext()) {
            InterfaceC7956b.UseCaseMissing useCaseMissingM32955d = m32955d((AbstractC6600b) it.next(), listM26474k);
            if (useCaseMissingM32955d != null) {
                return useCaseMissingM32955d;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM26470g) {
            InterfaceC7956b.UseCaseMissing useCaseMissingM32955d2 = m32955d((AbstractC6600b) obj, listM26474k);
            if (useCaseMissingM32955d2 != null) {
                C5931r1.m26561a("DefaultFeatureGroupResolver", "resolveFeatureGroup: filtered out preferred feature due to " + useCaseMissingM32955d2);
            } else {
                useCaseMissingM32955d2 = null;
            }
            if (useCaseMissingM32955d2 == null) {
                arrayList.add(obj);
            }
        }
        C5931r1.m26561a("DefaultFeatureGroupResolver", "resolveFeatureGroup: filteredPreferredFeatures = " + arrayList);
        return m32952c(this, sessionConfig, arrayList, 0, null, 12, null);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC7956b m32954b(C5888g2 sessionConfig, List<? extends AbstractC6600b> orderedPreferredFeatures, int index, List<? extends AbstractC6600b> currentOptionalFeatures) {
        if (index < orderedPreferredFeatures.size()) {
            int i10 = index + 1;
            InterfaceC7956b interfaceC7956bM32954b = m32954b(sessionConfig, orderedPreferredFeatures, i10, CollectionsKt.m31726x0(currentOptionalFeatures, orderedPreferredFeatures.get(index)));
            return interfaceC7956bM32954b instanceof InterfaceC7956b.Supported ? interfaceC7956bM32954b : m32954b(sessionConfig, orderedPreferredFeatures, i10, currentOptionalFeatures);
        }
        Set setM31913i = C7704r0.m31913i(sessionConfig.m26471h(), currentOptionalFeatures);
        C5931r1.m26561a("DefaultFeatureGroupResolver", "getFeatureListResolvedByPriority: features = " + setM31913i + ", useCases = " + sessionConfig.m26474k());
        return this.cameraInfoInternal.m35294A(new ResolvedFeatureGroup(setM31913i), sessionConfig) ? new InterfaceC7956b.Supported(new ResolvedFeatureGroup(setM31913i)) : InterfaceC7956b.b.f29835a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX INFO: renamed from: d */
    public final InterfaceC7956b.UseCaseMissing m32955d(AbstractC6600b abstractC6600b, List<? extends AbstractC5952w2> list) {
        boolean z10;
        String string;
        List<? extends AbstractC5952w2> list2 = list;
        boolean z11 = list2 instanceof Collection;
        boolean z12 = false;
        if (!z11 || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                if (((AbstractC5952w2) it.next()) instanceof C5883f1) {
                    z10 = true;
                    break;
                }
            }
        } else {
            z10 = false;
            break;
        }
        if (!z11 || !list2.isEmpty()) {
            for (AbstractC5952w2 abstractC5952w2 : list2) {
                if ((abstractC5952w2 instanceof C5864a2) || C11145f.m41959e0(abstractC5952w2)) {
                    z12 = true;
                    break;
                }
            }
        }
        int i10 = b.f29833a[abstractC6600b.getFeatureTypeInternal().ordinal()];
        if (i10 == 1) {
            string = EnumC7013c.IMAGE_CAPTURE.toString();
            if (z10) {
                string = null;
            }
        } else {
            if (i10 != 2 && i10 != 3 && i10 != 4) {
                throw new C7345l();
            }
            string = EnumC7013c.PREVIEW + " or " + EnumC7013c.VIDEO_CAPTURE;
            if (z12) {
                string = null;
            }
        }
        if (string != null) {
            return new InterfaceC7956b.UseCaseMissing(string, abstractC6600b);
        }
        return null;
    }
}
