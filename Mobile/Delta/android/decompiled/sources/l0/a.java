package l0;

import g0.a2;
import g0.f1;
import g0.g2;
import g0.r1;
import g0.w2;
import j0.ResolvedFeatureGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jt.l;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.collections.r0;
import kotlin.jvm.internal.Intrinsics;
import n0.o0;
import org.jetbrains.annotations.NotNull;
import s0.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u0019"}, d2 = {"Ll0/a;", "Ll0/c;", "Ln0/o0;", "cameraInfoInternal", "<init>", "(Ln0/o0;)V", "Lg0/g2;", "sessionConfig", "Ll0/b;", "a", "(Lg0/g2;)Ll0/b;", "Li0/b;", "", "Lg0/w2;", "useCases", "Ll0/b$d;", "d", "(Li0/b;Ljava/util/List;)Ll0/b$d;", "orderedPreferredFeatures", "", "index", "currentOptionalFeatures", "b", "(Lg0/g2;Ljava/util/List;ILjava/util/List;)Ll0/b;", "Ln0/o0;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o0 cameraInfoInternal;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22883a;

        static {
            int[] iArr = new int[k0.b.values().length];
            try {
                iArr[k0.b.IMAGE_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k0.b.DYNAMIC_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k0.b.FPS_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k0.b.VIDEO_STABILIZATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f22883a = iArr;
        }
    }

    public a(@NotNull o0 cameraInfoInternal) {
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        this.cameraInfoInternal = cameraInfoInternal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l0.b c(a aVar, g2 g2Var, List list, int i10, List list2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        if ((i11 & 8) != 0) {
            list2 = p.k();
        }
        return aVar.b(g2Var, list, i10, list2);
    }

    @Override // l0.c
    @NotNull
    public l0.b a(@NotNull g2 sessionConfig) {
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        List<w2> listK = sessionConfig.k();
        Set<i0.b> setH = sessionConfig.h();
        List<i0.b> listG = sessionConfig.g();
        if (setH.isEmpty() && listG.isEmpty()) {
            throw new IllegalArgumentException("Must have at least one required or preferred feature");
        }
        for (w2 w2Var : listK) {
            if (j0.c.INSTANCE.b(w2Var) == j0.c.UNDEFINED) {
                return new l0.b.UnsupportedUseCase(w2Var);
            }
        }
        Iterator<T> it = setH.iterator();
        while (it.hasNext()) {
            l0.b.UseCaseMissing useCaseMissingD = d((i0.b) it.next(), listK);
            if (useCaseMissingD != null) {
                return useCaseMissingD;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG) {
            l0.b.UseCaseMissing useCaseMissingD2 = d((i0.b) obj, listK);
            if (useCaseMissingD2 != null) {
                r1.a("DefaultFeatureGroupResolver", "resolveFeatureGroup: filtered out preferred feature due to " + useCaseMissingD2);
            } else {
                useCaseMissingD2 = null;
            }
            if (useCaseMissingD2 == null) {
                arrayList.add(obj);
            }
        }
        r1.a("DefaultFeatureGroupResolver", "resolveFeatureGroup: filteredPreferredFeatures = " + arrayList);
        return c(this, sessionConfig, arrayList, 0, null, 12, null);
    }

    public final l0.b b(g2 sessionConfig, List<? extends i0.b> orderedPreferredFeatures, int index, List<? extends i0.b> currentOptionalFeatures) {
        if (index < orderedPreferredFeatures.size()) {
            int i10 = index + 1;
            l0.b bVarB = b(sessionConfig, orderedPreferredFeatures, i10, CollectionsKt.x0(currentOptionalFeatures, orderedPreferredFeatures.get(index)));
            return bVarB instanceof l0.b.Supported ? bVarB : b(sessionConfig, orderedPreferredFeatures, i10, currentOptionalFeatures);
        }
        Set setI = r0.i(sessionConfig.h(), currentOptionalFeatures);
        r1.a("DefaultFeatureGroupResolver", "getFeatureListResolvedByPriority: features = " + setI + ", useCases = " + sessionConfig.k());
        return this.cameraInfoInternal.A(new ResolvedFeatureGroup(setI), sessionConfig) ? new l0.b.Supported(new ResolvedFeatureGroup(setI)) : l0.b.C0408b.f22885a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    public final l0.b.UseCaseMissing d(i0.b bVar, List<? extends w2> list) {
        boolean z10;
        String string;
        List<? extends w2> list2 = list;
        boolean z11 = list2 instanceof Collection;
        boolean z12 = false;
        if (!z11 || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                if (((w2) it.next()) instanceof f1) {
                    z10 = true;
                    break;
                }
            }
        } else {
            z10 = false;
            break;
        }
        if (!z11 || !list2.isEmpty()) {
            for (w2 w2Var : list2) {
                if ((w2Var instanceof a2) || f.e0(w2Var)) {
                    z12 = true;
                    break;
                }
            }
        }
        int i10 = b.f22883a[bVar.getFeatureTypeInternal().ordinal()];
        if (i10 == 1) {
            string = j0.c.IMAGE_CAPTURE.toString();
            if (z10) {
                string = null;
            }
        } else {
            if (i10 != 2 && i10 != 3 && i10 != 4) {
                throw new l();
            }
            string = j0.c.PREVIEW + " or " + j0.c.VIDEO_CAPTURE;
            if (z12) {
                string = null;
            }
        }
        if (string != null) {
            return new l0.b.UseCaseMissing(string, bVar);
        }
        return null;
    }
}
