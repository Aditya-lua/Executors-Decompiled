package s0;

import android.graphics.Rect;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import g0.w2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;
import n0.SurfaceConfig;
import n0.SurfaceStreamSpecQueryResult;
import n0.h0;
import n0.i4;
import n0.j4;
import n0.m0;
import n0.n1;
import n0.o0;
import n0.t3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJi\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJQ\u0010\"\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020 0\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00100\u001f0\u001e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\"\u0010#Je\u0010'\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00100\u001f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020%0\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010)R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010*¨\u0006+"}, d2 = {"Ls0/n;", "Ls0/m;", "Ln0/j4;", "useCaseConfigFactory", "Ln0/m0;", "cameraDeviceSurfaceManager", "<init>", "(Ln0/j4;Ln0/m0;)V", "", "b", "(Ln0/m0;)V", "", "cameraMode", "Ln0/o0;", "cameraInfoInternal", "", "Lg0/w2;", "newUseCases", "attachedUseCases", "Ln0/h0;", "cameraConfig", "sessionType", "Landroid/util/Range;", "targetFrameRate", "", "isFeatureComboInvocation", "findMaxSupportedFrameRate", "Ls0/l;", "a", "(ILn0/o0;Ljava/util/List;Ljava/util/List;Ln0/h0;ILandroid/util/Range;ZZ)Ls0/l;", "Landroid/util/Pair;", "", "Ln0/t3;", "Ln0/g;", "c", "(ILn0/o0;Ljava/util/List;)Landroid/util/Pair;", "attachedSurfaceInfoToUseCaseMap", "Ls0/f$b;", "configPairMap", "d", "(ILn0/o0;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ZZ)Ls0/l;", "Ln0/j4;", "Ln0/m0;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j4 useCaseConfigFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public m0 cameraDeviceSurfaceManager;

    public n(@NotNull j4 useCaseConfigFactory, @Nullable m0 m0Var) {
        Intrinsics.checkNotNullParameter(useCaseConfigFactory, "useCaseConfigFactory");
        this.useCaseConfigFactory = useCaseConfigFactory;
        this.cameraDeviceSurfaceManager = m0Var;
    }

    @Override // s0.m
    @NotNull
    public StreamSpecQueryResult a(int cameraMode, @NotNull o0 cameraInfoInternal, @NotNull List<? extends w2> newUseCases, @NotNull List<? extends w2> attachedUseCases, @NotNull h0 cameraConfig, int sessionType, @NotNull Range<Integer> targetFrameRate, boolean isFeatureComboInvocation, boolean findMaxSupportedFrameRate) {
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        Intrinsics.checkNotNullParameter(newUseCases, "newUseCases");
        Intrinsics.checkNotNullParameter(attachedUseCases, "attachedUseCases");
        Intrinsics.checkNotNullParameter(cameraConfig, "cameraConfig");
        Intrinsics.checkNotNullParameter(targetFrameRate, "targetFrameRate");
        Pair<Map<w2, t3>, Map<n0.g, w2>> pairC = c(cameraMode, cameraInfoInternal, attachedUseCases);
        Object second = pairC.second;
        Intrinsics.checkNotNullExpressionValue(second, "second");
        Map<w2, f.b> mapL = f.L(newUseCases, cameraConfig.k(), this.useCaseConfigFactory, sessionType, targetFrameRate);
        Intrinsics.checkNotNullExpressionValue(mapL, "getConfigs(...)");
        StreamSpecQueryResult streamSpecQueryResultD = d(cameraMode, cameraInfoInternal, newUseCases, (Map) second, mapL, isFeatureComboInvocation, findMaxSupportedFrameRate);
        Object first = pairC.first;
        Intrinsics.checkNotNullExpressionValue(first, "first");
        return new StreamSpecQueryResult(k0.p((Map) first, streamSpecQueryResultD.b()), streamSpecQueryResultD.getMaxSupportedFrameRate());
    }

    @Override // s0.m
    public void b(@NotNull m0 cameraDeviceSurfaceManager) {
        Intrinsics.checkNotNullParameter(cameraDeviceSurfaceManager, "cameraDeviceSurfaceManager");
        this.cameraDeviceSurfaceManager = cameraDeviceSurfaceManager;
    }

    public final Pair<Map<w2, t3>, Map<n0.g, w2>> c(int cameraMode, o0 cameraInfoInternal, List<? extends w2> attachedUseCases) {
        ArrayList arrayList = new ArrayList();
        String strE = cameraInfoInternal.e();
        Intrinsics.checkNotNullExpressionValue(strE, "getCameraId(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (w2 w2Var : attachedUseCases) {
            t3 t3VarG = w2Var.g();
            if (t3VarG == null) {
                throw new IllegalArgumentException("Attached stream spec cannot be null for already attached use cases.");
            }
            m0 m0Var = this.cameraDeviceSurfaceManager;
            if (m0Var == null) {
                throw new IllegalStateException("Required value was null.");
            }
            int iP = w2Var.p();
            Size sizeH = w2Var.h();
            if (sizeH == null) {
                throw new IllegalArgumentException("Attached surface resolution cannot be null for already attached use cases.");
            }
            SurfaceConfig surfaceConfigB = m0Var.b(cameraMode, strE, iP, sizeH, w2Var.l().W());
            Intrinsics.checkNotNullExpressionValue(surfaceConfigB, "transformSurfaceConfig(...)");
            int iP2 = w2Var.p();
            Size sizeH2 = w2Var.h();
            Intrinsics.checkNotNull(sizeH2);
            g0.k0 k0VarB = t3VarG.b();
            List<j4.b> listQ0 = b1.g.q0(w2Var);
            n1 n1VarD = t3VarG.d();
            int iO = w2Var.l().o(0);
            Range<Integer> rangeZ = w2Var.l().z(t3.f24861a);
            if (rangeZ == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            n0.g gVarA = n0.g.a(surfaceConfigB, iP2, sizeH2, k0VarB, listQ0, n1VarD, iO, rangeZ, w2Var.l().H());
            Intrinsics.checkNotNullExpressionValue(gVarA, "create(...)");
            arrayList.add(gVarA);
            linkedHashMap2.put(gVarA, w2Var);
            linkedHashMap.put(w2Var, t3VarG);
        }
        return new Pair<>(linkedHashMap, linkedHashMap2);
    }

    public final StreamSpecQueryResult d(int cameraMode, o0 cameraInfoInternal, List<? extends w2> newUseCases, Map<n0.g, ? extends w2> attachedSurfaceInfoToUseCaseMap, Map<w2, ? extends f.b> configPairMap, boolean isFeatureComboInvocation, boolean findMaxSupportedFrameRate) {
        int maxSupportedFrameRate;
        Rect rectH;
        String strE = cameraInfoInternal.e();
        Intrinsics.checkNotNullExpressionValue(strE, "getCameraId(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (newUseCases.isEmpty()) {
            maxSupportedFrameRate = Integer.MAX_VALUE;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            try {
                rectH = cameraInfoInternal.h();
            } catch (NullPointerException unused) {
                rectH = null;
            }
            o oVar = new o(cameraInfoInternal, rectH != null ? a0.m(rectH) : null);
            boolean z10 = false;
            for (w2 w2Var : newUseCases) {
                f.b bVar = configPairMap.get(w2Var);
                if (bVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                f.b bVar2 = bVar;
                i4<?> i4VarI = w2Var.I(cameraInfoInternal, bVar2.f30432a, bVar2.b);
                Intrinsics.checkNotNullExpressionValue(i4VarI, "mergeConfigs(...)");
                linkedHashMap2.put(i4VarI, w2Var);
                List<Size> listM = oVar.m(i4VarI);
                Intrinsics.checkNotNullExpressionValue(listM, "getSortedSupportedOutputSizes(...)");
                linkedHashMap3.put(i4VarI, listM);
                if (i4VarI.E() == 2) {
                    z10 = true;
                }
            }
            m0 m0Var = this.cameraDeviceSurfaceManager;
            if (m0Var == null) {
                throw new IllegalStateException("Required value was null.");
            }
            SurfaceStreamSpecQueryResult surfaceStreamSpecQueryResultG = m0Var.g(cameraMode, strE, new ArrayList(attachedSurfaceInfoToUseCaseMap.keySet()), linkedHashMap3, z10, f.U(newUseCases), isFeatureComboInvocation, findMaxSupportedFrameRate);
            Intrinsics.checkNotNullExpressionValue(surfaceStreamSpecQueryResultG, "getSuggestedStreamSpecs(...)");
            Map<i4<?>, t3> mapA = surfaceStreamSpecQueryResultG.a();
            Map<n0.g, t3> mapB = surfaceStreamSpecQueryResultG.b();
            maxSupportedFrameRate = surfaceStreamSpecQueryResultG.getMaxSupportedFrameRate();
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                Object value = entry.getValue();
                t3 t3Var = mapA.get(entry.getKey());
                if (t3Var == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                linkedHashMap.put(value, t3Var);
            }
            for (Map.Entry<n0.g, t3> entry2 : mapB.entrySet()) {
                if (attachedSurfaceInfoToUseCaseMap.containsKey(entry2.getKey())) {
                    w2 w2Var2 = attachedSurfaceInfoToUseCaseMap.get(entry2.getKey());
                    if (w2Var2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    linkedHashMap.put(w2Var2, entry2.getValue());
                }
            }
        }
        return new StreamSpecQueryResult(linkedHashMap, maxSupportedFrameRate);
    }
}
