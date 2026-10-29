package p424s0;

import android.graphics.Rect;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7690k0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p021b1.C1196g;
import p140g0.AbstractC5952w2;
import p140g0.C5902k0;
import p296n0.AbstractC8754g;
import p296n0.AbstractC8827t3;
import p296n0.InterfaceC8761h0;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8777j4;
import p296n0.InterfaceC8789m0;
import p296n0.InterfaceC8795n1;
import p296n0.InterfaceC8799o0;
import p296n0.SurfaceConfig;
import p296n0.SurfaceStreamSpecQueryResult;
import p347p0.C10085a0;

/* JADX INFO: renamed from: s0.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJi\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJQ\u0010\"\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020 0\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00100\u001f0\u001e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\"\u0010#Je\u0010'\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00100\u001f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020%0\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010)R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010*¨\u0006+"}, m31665d2 = {"Ls0/n;", "Ls0/m;", "Ln0/j4;", "useCaseConfigFactory", "Ln0/m0;", "cameraDeviceSurfaceManager", "<init>", "(Ln0/j4;Ln0/m0;)V", "", "b", "(Ln0/m0;)V", "", "cameraMode", "Ln0/o0;", "cameraInfoInternal", "", "Lg0/w2;", "newUseCases", "attachedUseCases", "Ln0/h0;", "cameraConfig", "sessionType", "Landroid/util/Range;", "targetFrameRate", "", "isFeatureComboInvocation", "findMaxSupportedFrameRate", "Ls0/l;", "a", "(ILn0/o0;Ljava/util/List;Ljava/util/List;Ln0/h0;ILandroid/util/Range;ZZ)Ls0/l;", "Landroid/util/Pair;", "", "Ln0/t3;", "Ln0/g;", "c", "(ILn0/o0;Ljava/util/List;)Landroid/util/Pair;", "attachedSurfaceInfoToUseCaseMap", "Ls0/f$b;", "configPairMap", "d", "(ILn0/o0;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ZZ)Ls0/l;", "Ln0/j4;", "Ln0/m0;", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C11153n implements InterfaceC11152m {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8777j4 useCaseConfigFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public InterfaceC8789m0 cameraDeviceSurfaceManager;

    public C11153n(@NotNull InterfaceC8777j4 useCaseConfigFactory, @Nullable InterfaceC8789m0 interfaceC8789m0) {
        Intrinsics.checkNotNullParameter(useCaseConfigFactory, "useCaseConfigFactory");
        this.useCaseConfigFactory = useCaseConfigFactory;
        this.cameraDeviceSurfaceManager = interfaceC8789m0;
    }

    @Override // p424s0.InterfaceC11152m
    @NotNull
    /* JADX INFO: renamed from: a */
    public StreamSpecQueryResult mo42015a(int cameraMode, @NotNull InterfaceC8799o0 cameraInfoInternal, @NotNull List<? extends AbstractC5952w2> newUseCases, @NotNull List<? extends AbstractC5952w2> attachedUseCases, @NotNull InterfaceC8761h0 cameraConfig, int sessionType, @NotNull Range<Integer> targetFrameRate, boolean isFeatureComboInvocation, boolean findMaxSupportedFrameRate) {
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        Intrinsics.checkNotNullParameter(newUseCases, "newUseCases");
        Intrinsics.checkNotNullParameter(attachedUseCases, "attachedUseCases");
        Intrinsics.checkNotNullParameter(cameraConfig, "cameraConfig");
        Intrinsics.checkNotNullParameter(targetFrameRate, "targetFrameRate");
        Pair<Map<AbstractC5952w2, AbstractC8827t3>, Map<AbstractC8754g, AbstractC5952w2>> pairM42017c = m42017c(cameraMode, cameraInfoInternal, attachedUseCases);
        Object second = pairM42017c.second;
        Intrinsics.checkNotNullExpressionValue(second, "second");
        Map<AbstractC5952w2, C11145f.b> mapM41946L = C11145f.m41946L(newUseCases, cameraConfig.m35137k(), this.useCaseConfigFactory, sessionType, targetFrameRate);
        Intrinsics.checkNotNullExpressionValue(mapM41946L, "getConfigs(...)");
        StreamSpecQueryResult streamSpecQueryResultM42018d = m42018d(cameraMode, cameraInfoInternal, newUseCases, (Map) second, mapM41946L, isFeatureComboInvocation, findMaxSupportedFrameRate);
        Object first = pairM42017c.first;
        Intrinsics.checkNotNullExpressionValue(first, "first");
        return new StreamSpecQueryResult(C7690k0.m31801p((Map) first, streamSpecQueryResultM42018d.m42014b()), streamSpecQueryResultM42018d.getMaxSupportedFrameRate());
    }

    @Override // p424s0.InterfaceC11152m
    /* JADX INFO: renamed from: b */
    public void mo42016b(@NotNull InterfaceC8789m0 cameraDeviceSurfaceManager) {
        Intrinsics.checkNotNullParameter(cameraDeviceSurfaceManager, "cameraDeviceSurfaceManager");
        this.cameraDeviceSurfaceManager = cameraDeviceSurfaceManager;
    }

    /* JADX INFO: renamed from: c */
    public final Pair<Map<AbstractC5952w2, AbstractC8827t3>, Map<AbstractC8754g, AbstractC5952w2>> m42017c(int cameraMode, InterfaceC8799o0 cameraInfoInternal, List<? extends AbstractC5952w2> attachedUseCases) {
        ArrayList arrayList = new ArrayList();
        String strMo6750e = cameraInfoInternal.mo6750e();
        Intrinsics.checkNotNullExpressionValue(strMo6750e, "getCameraId(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (AbstractC5952w2 abstractC5952w2 : attachedUseCases) {
            AbstractC8827t3 abstractC8827t3M26702g = abstractC5952w2.m26702g();
            if (abstractC8827t3M26702g == null) {
                throw new IllegalArgumentException("Attached stream spec cannot be null for already attached use cases.");
            }
            InterfaceC8789m0 interfaceC8789m0 = this.cameraDeviceSurfaceManager;
            if (interfaceC8789m0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            int iM26710p = abstractC5952w2.m26710p();
            Size sizeM26703h = abstractC5952w2.m26703h();
            if (sizeM26703h == null) {
                throw new IllegalArgumentException("Attached surface resolution cannot be null for already attached use cases.");
            }
            SurfaceConfig surfaceConfigMo35277b = interfaceC8789m0.mo35277b(cameraMode, strMo6750e, iM26710p, sizeM26703h, abstractC5952w2.m26707l().m35206W());
            Intrinsics.checkNotNullExpressionValue(surfaceConfigMo35277b, "transformSurfaceConfig(...)");
            int iM26710p2 = abstractC5952w2.m26710p();
            Size sizeM26703h2 = abstractC5952w2.m26703h();
            Intrinsics.checkNotNull(sizeM26703h2);
            C5902k0 c5902k0Mo35391b = abstractC8827t3M26702g.mo35391b();
            List<InterfaceC8777j4.b> listM6650q0 = C1196g.m6650q0(abstractC5952w2);
            InterfaceC8795n1 interfaceC8795n1Mo35393d = abstractC8827t3M26702g.mo35393d();
            int iM35211o = abstractC5952w2.m26707l().m35211o(0);
            Range<Integer> rangeM35215z = abstractC5952w2.m26707l().m35215z(AbstractC8827t3.f32104a);
            if (rangeM35215z == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AbstractC8754g abstractC8754gM35094a = AbstractC8754g.m35094a(surfaceConfigMo35277b, iM26710p2, sizeM26703h2, c5902k0Mo35391b, listM6650q0, interfaceC8795n1Mo35393d, iM35211o, rangeM35215z, abstractC5952w2.m26707l().m35202H());
            Intrinsics.checkNotNullExpressionValue(abstractC8754gM35094a, "create(...)");
            arrayList.add(abstractC8754gM35094a);
            linkedHashMap2.put(abstractC8754gM35094a, abstractC5952w2);
            linkedHashMap.put(abstractC5952w2, abstractC8827t3M26702g);
        }
        return new Pair<>(linkedHashMap, linkedHashMap2);
    }

    /* JADX INFO: renamed from: d */
    public final StreamSpecQueryResult m42018d(int cameraMode, InterfaceC8799o0 cameraInfoInternal, List<? extends AbstractC5952w2> newUseCases, Map<AbstractC8754g, ? extends AbstractC5952w2> attachedSurfaceInfoToUseCaseMap, Map<AbstractC5952w2, ? extends C11145f.b> configPairMap, boolean isFeatureComboInvocation, boolean findMaxSupportedFrameRate) {
        int maxSupportedFrameRate;
        Rect rectMo35046h;
        String strMo6750e = cameraInfoInternal.mo6750e();
        Intrinsics.checkNotNullExpressionValue(strMo6750e, "getCameraId(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (newUseCases.isEmpty()) {
            maxSupportedFrameRate = Integer.MAX_VALUE;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            try {
                rectMo35046h = cameraInfoInternal.mo35046h();
            } catch (NullPointerException unused) {
                rectMo35046h = null;
            }
            C11154o c11154o = new C11154o(cameraInfoInternal, rectMo35046h != null ? C10085a0.m38885m(rectMo35046h) : null);
            boolean z10 = false;
            for (AbstractC5952w2 abstractC5952w2 : newUseCases) {
                C11145f.b bVar = configPairMap.get(abstractC5952w2);
                if (bVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                C11145f.b bVar2 = bVar;
                InterfaceC8771i4<?> interfaceC8771i4M26682I = abstractC5952w2.m26682I(cameraInfoInternal, bVar2.f39374a, bVar2.f39375b);
                Intrinsics.checkNotNullExpressionValue(interfaceC8771i4M26682I, "mergeConfigs(...)");
                linkedHashMap2.put(interfaceC8771i4M26682I, abstractC5952w2);
                List<Size> listM42037m = c11154o.m42037m(interfaceC8771i4M26682I);
                Intrinsics.checkNotNullExpressionValue(listM42037m, "getSortedSupportedOutputSizes(...)");
                linkedHashMap3.put(interfaceC8771i4M26682I, listM42037m);
                if (interfaceC8771i4M26682I.m35200E() == 2) {
                    z10 = true;
                }
            }
            InterfaceC8789m0 interfaceC8789m0 = this.cameraDeviceSurfaceManager;
            if (interfaceC8789m0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            SurfaceStreamSpecQueryResult surfaceStreamSpecQueryResultMo35278g = interfaceC8789m0.mo35278g(cameraMode, strMo6750e, new ArrayList(attachedSurfaceInfoToUseCaseMap.keySet()), linkedHashMap3, z10, C11145f.m41951U(newUseCases), isFeatureComboInvocation, findMaxSupportedFrameRate);
            Intrinsics.checkNotNullExpressionValue(surfaceStreamSpecQueryResultMo35278g, "getSuggestedStreamSpecs(...)");
            Map<InterfaceC8771i4<?>, AbstractC8827t3> mapM35553a = surfaceStreamSpecQueryResultMo35278g.m35553a();
            Map<AbstractC8754g, AbstractC8827t3> mapM35554b = surfaceStreamSpecQueryResultMo35278g.m35554b();
            maxSupportedFrameRate = surfaceStreamSpecQueryResultMo35278g.getMaxSupportedFrameRate();
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                Object value = entry.getValue();
                AbstractC8827t3 abstractC8827t3 = mapM35553a.get(entry.getKey());
                if (abstractC8827t3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                linkedHashMap.put(value, abstractC8827t3);
            }
            for (Map.Entry<AbstractC8754g, AbstractC8827t3> entry2 : mapM35554b.entrySet()) {
                if (attachedSurfaceInfoToUseCaseMap.containsKey(entry2.getKey())) {
                    AbstractC5952w2 abstractC5952w3 = attachedSurfaceInfoToUseCaseMap.get(entry2.getKey());
                    if (abstractC5952w3 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    linkedHashMap.put(abstractC5952w3, entry2.getValue());
                }
            }
        }
        return new StreamSpecQueryResult(linkedHashMap, maxSupportedFrameRate);
    }
}
