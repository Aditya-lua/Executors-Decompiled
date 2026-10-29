package p589z;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7688j0;
import kotlin.collections.C7699p;
import kotlin.collections.C7700p0;
import kotlin.collections.C7702q0;
import kotlin.jvm.internal.C7737g0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p001a0.C0008c0;
import p021b1.C1198i;
import p140g0.C5931r1;
import p296n0.AbstractC8754g;
import p296n0.AbstractC8827t3;
import p296n0.AbstractC8830u1;
import p296n0.C8757g2;
import p296n0.C8802o3;
import p296n0.C8846x2;
import p296n0.InterfaceC8763h2;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8777j4;
import p296n0.InterfaceC8795n1;
import p296n0.SurfaceConfig;
import p533x2.C12637g;
import p561y.C12964a;

/* JADX INFO: renamed from: z.c5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJQ\u0010#\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0016\u0010!\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020 0\t2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020 0\tH\u0007¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001dH\u0007¢\u0006\u0004\b'\u0010(JK\u0010/\u001a\u00020\u00162\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0006\u0012\u0004\u0018\u00010\u001e0)2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070)2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020%0-H\u0007¢\u0006\u0004\b/\u00100Ju\u00101\u001a\u00020\r2\u0016\u0010!\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020 0\t2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020 0\t2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001e0)2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070)2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020%0-H\u0007¢\u0006\u0004\b1\u00102J/\u00104\u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0-2\u0010\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070-H\u0007¢\u0006\u0004\b4\u00105J-\u0010:\u001a\u00020\u00162\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u000b2\f\u00109\u001a\b\u0012\u0004\u0012\u0002060-H\u0002¢\u0006\u0004\b:\u0010;J#\u0010>\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020<2\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010A\u001a\u00020\u00162\u0006\u0010@\u001a\u00020<2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\bA\u0010BJ+\u0010F\u001a\u00020\u00162\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000b0C2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000b0CH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\rH\u0002¢\u0006\u0004\bH\u0010\u0003J=\u0010J\u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0-2\u0010\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070-2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000b0CH\u0002¢\u0006\u0004\bJ\u0010KR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000b0L8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010MR&\u0010P\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002060C0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010OR&\u0010Q\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002060C0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010O¨\u0006R"}, m31665d2 = {"Lz/c5;", "", "<init>", "()V", "", "Ln0/o3;", "sessionConfigs", "Ln0/i4;", "useCaseConfigs", "", "Ln0/u1;", "", "streamUseCaseMap", "", "m", "(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Map;)V", "useCaseConfig", "Ly/a;", "e", "(Ln0/i4;)Ly/a;", "La0/c0;", "characteristicsCompat", "", "h", "(La0/c0;)Z", "Lz/g5$d;", "featureSettings", "n", "(Lz/g5$d;)Z", "", "Ln0/g;", "attachedSurfaces", "Ln0/t3;", "suggestedStreamSpecMap", "attachedSurfaceStreamSpecMap", "k", "(La0/c0;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Z", "Ln0/w3;", "surfaceConfigs", "c", "(La0/c0;Ljava/util/List;)Z", "", "", "surfaceConfigIndexAttachedSurfaceInfoMap", "surfaceConfigIndexUseCaseConfigMap", "", "surfaceConfigsWithStreamUseCase", "a", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)Z", "l", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "newUseCaseConfigs", "d", "(Ljava/util/List;Ljava/util/List;)Z", "Ln0/j4$b;", "captureType", "streamUseCase", "streamSharingTypes", "g", "(Ln0/j4$b;JLjava/util/List;)Z", "Ln0/n1;", "oldImplementationOptions", "f", "(Ln0/n1;Ljava/lang/Long;)Ln0/n1;", "config", "j", "(Ln0/n1;Ln0/j4$b;)Z", "", "availableStreamUseCasesSet", "streamUseCases", "b", "(Ljava/util/Set;Ljava/util/Set;)Z", "o", "availableStreamUseCases", "i", "(Ljava/util/List;Ljava/util/List;Ljava/util/Set;)Z", "Ln0/n1$a;", "Ln0/n1$a;", "STREAM_USE_CASE_STREAM_SPEC_OPTION", "Ljava/util/Map;", "STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP", "STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP", "camera-camera2_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C13497c5 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C13497c5 f47237a = new C13497c5();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC8795n1.a<Long> STREAM_USE_CASE_STREAM_SPEC_OPTION;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Map<Long, Set<InterfaceC8777j4.b>> STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Map<Long, Set<InterfaceC8777j4.b>> STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP;

    static {
        Class cls = Long.TYPE;
        Intrinsics.checkNotNull(cls);
        InterfaceC8795n1.a<Long> aVarM35291a = InterfaceC8795n1.a.m35291a("camera2.streamSpec.streamUseCase", cls);
        Intrinsics.checkNotNullExpressionValue(aVarM35291a, "create(...)");
        STREAM_USE_CASE_STREAM_SPEC_OPTION = aVarM35291a;
        Map mapM31788d = C7688j0.m31788d();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            InterfaceC8777j4.b bVar = InterfaceC8777j4.b.PREVIEW;
            InterfaceC8777j4.b bVar2 = InterfaceC8777j4.b.METERING_REPEATING;
            InterfaceC8777j4.b bVar3 = InterfaceC8777j4.b.IMAGE_ANALYSIS;
            mapM31788d.put(4L, C7702q0.m31911g(bVar, bVar2, bVar3));
            mapM31788d.put(1L, C7702q0.m31911g(bVar, bVar2, bVar3));
            mapM31788d.put(2L, C7700p0.m31904c(InterfaceC8777j4.b.IMAGE_CAPTURE));
            mapM31788d.put(3L, C7700p0.m31904c(InterfaceC8777j4.b.VIDEO_CAPTURE));
        }
        STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP = C7688j0.m31787c(mapM31788d);
        Map mapM31788d2 = C7688j0.m31788d();
        if (i10 >= 33) {
            InterfaceC8777j4.b bVar4 = InterfaceC8777j4.b.PREVIEW;
            InterfaceC8777j4.b bVar5 = InterfaceC8777j4.b.IMAGE_CAPTURE;
            InterfaceC8777j4.b bVar6 = InterfaceC8777j4.b.VIDEO_CAPTURE;
            mapM31788d2.put(4L, C7702q0.m31911g(bVar4, bVar5, bVar6));
            mapM31788d2.put(3L, C7702q0.m31911g(bVar4, bVar6));
        }
        STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP = C7688j0.m31787c(mapM31788d2);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m49190a(@NotNull Map<Integer, ? extends AbstractC8754g> surfaceConfigIndexAttachedSurfaceInfoMap, @NotNull Map<Integer, ? extends InterfaceC8771i4<?>> surfaceConfigIndexUseCaseConfigMap, @NotNull List<SurfaceConfig> surfaceConfigsWithStreamUseCase) {
        List<InterfaceC8777j4.b> listM31892k;
        Intrinsics.checkNotNullParameter(surfaceConfigIndexAttachedSurfaceInfoMap, "surfaceConfigIndexAttachedSurfaceInfoMap");
        Intrinsics.checkNotNullParameter(surfaceConfigIndexUseCaseConfigMap, "surfaceConfigIndexUseCaseConfigMap");
        Intrinsics.checkNotNullParameter(surfaceConfigsWithStreamUseCase, "surfaceConfigsWithStreamUseCase");
        int size = surfaceConfigsWithStreamUseCase.size();
        for (int i10 = 0; i10 < size; i10++) {
            long value = surfaceConfigsWithStreamUseCase.get(i10).getStreamUseCase().getValue();
            if (surfaceConfigIndexAttachedSurfaceInfoMap.containsKey(Integer.valueOf(i10))) {
                AbstractC8754g abstractC8754g = surfaceConfigIndexAttachedSurfaceInfoMap.get(Integer.valueOf(i10));
                C13497c5 c13497c5 = f47237a;
                Intrinsics.checkNotNull(abstractC8754g);
                InterfaceC8777j4.b bVar = abstractC8754g.mo35095b().size() == 1 ? abstractC8754g.mo35095b().get(0) : InterfaceC8777j4.b.STREAM_SHARING;
                Intrinsics.checkNotNull(bVar);
                List<InterfaceC8777j4.b> listMo35095b = abstractC8754g.mo35095b();
                Intrinsics.checkNotNullExpressionValue(listMo35095b, "getCaptureTypes(...)");
                if (!c13497c5.m49201g(bVar, value, listMo35095b)) {
                    return false;
                }
            } else {
                if (!surfaceConfigIndexUseCaseConfigMap.containsKey(Integer.valueOf(i10))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                InterfaceC8771i4<?> interfaceC8771i4 = surfaceConfigIndexUseCaseConfigMap.get(Integer.valueOf(i10));
                Intrinsics.checkNotNull(interfaceC8771i4);
                InterfaceC8771i4<?> interfaceC8771i5 = interfaceC8771i4;
                C13497c5 c13497c6 = f47237a;
                InterfaceC8777j4.b bVarMo35207X = interfaceC8771i5.mo35207X();
                Intrinsics.checkNotNullExpressionValue(bVarMo35207X, "getCaptureType(...)");
                if (interfaceC8771i5.mo35207X() == InterfaceC8777j4.b.STREAM_SHARING) {
                    listM31892k = ((C1198i) interfaceC8771i5).m6690h0();
                    Intrinsics.checkNotNullExpressionValue(listM31892k, "getCaptureTypes(...)");
                } else {
                    listM31892k = C7699p.m31892k();
                }
                if (!c13497c6.m49201g(bVarMo35207X, value, listM31892k)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m49191c(@NotNull C0008c0 characteristicsCompat, @NotNull List<SurfaceConfig> surfaceConfigs) {
        long[] jArr;
        Intrinsics.checkNotNullParameter(characteristicsCompat, "characteristicsCompat");
        Intrinsics.checkNotNullParameter(surfaceConfigs, "surfaceConfigs");
        if (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) characteristicsCompat.m9a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (long j10 : jArr) {
            hashSet.add(Long.valueOf(j10));
        }
        Iterator<SurfaceConfig> it = surfaceConfigs.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(Long.valueOf(it.next().getStreamUseCase().getValue()))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m49192d(@NotNull List<? extends AbstractC8754g> attachedSurfaces, @NotNull List<? extends InterfaceC8771i4<?>> newUseCaseConfigs) {
        Intrinsics.checkNotNullParameter(attachedSurfaces, "attachedSurfaces");
        Intrinsics.checkNotNullParameter(newUseCaseConfigs, "newUseCaseConfigs");
        for (AbstractC8754g abstractC8754g : attachedSurfaces) {
            List<InterfaceC8777j4.b> listMo35095b = abstractC8754g.mo35095b();
            Intrinsics.checkNotNullExpressionValue(listMo35095b, "getCaptureTypes(...)");
            InterfaceC8777j4.b bVar = listMo35095b.get(0);
            C13497c5 c13497c5 = f47237a;
            InterfaceC8795n1 interfaceC8795n1Mo35098e = abstractC8754g.mo35098e();
            Intrinsics.checkNotNull(interfaceC8795n1Mo35098e);
            Intrinsics.checkNotNull(bVar);
            if (c13497c5.m49203j(interfaceC8795n1Mo35098e, bVar)) {
                return true;
            }
        }
        for (InterfaceC8771i4<?> interfaceC8771i4 : newUseCaseConfigs) {
            C13497c5 c13497c6 = f47237a;
            InterfaceC8777j4.b bVarMo35207X = interfaceC8771i4.mo35207X();
            Intrinsics.checkNotNullExpressionValue(bVarMo35207X, "getCaptureType(...)");
            if (c13497c6.m49203j(interfaceC8771i4, bVarMo35207X)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final C12964a m49193e(@NotNull InterfaceC8771i4<?> useCaseConfig) {
        Intrinsics.checkNotNullParameter(useCaseConfig, "useCaseConfig");
        C8846x2 c8846x2M35505k0 = C8846x2.m35505k0();
        Intrinsics.checkNotNullExpressionValue(c8846x2M35505k0, "create(...)");
        InterfaceC8795n1.a<?> aVar = C12964a.f45917R;
        if (useCaseConfig.mo35023a(aVar)) {
            c8846x2M35505k0.mo35473G(aVar, useCaseConfig.mo35027e(aVar));
        }
        InterfaceC8795n1.a<?> aVar2 = InterfaceC8771i4.f31900E;
        if (useCaseConfig.mo35023a(aVar2)) {
            c8846x2M35505k0.mo35473G(aVar2, useCaseConfig.mo35027e(aVar2));
        }
        InterfaceC8795n1.a<?> aVar3 = C8757g2.f31831Q;
        if (useCaseConfig.mo35023a(aVar3)) {
            c8846x2M35505k0.mo35473G(aVar3, useCaseConfig.mo35027e(aVar3));
        }
        InterfaceC8795n1.a<?> aVar4 = InterfaceC8763h2.f31863j;
        if (useCaseConfig.mo35023a(aVar4)) {
            c8846x2M35505k0.mo35473G(aVar4, useCaseConfig.mo35027e(aVar4));
        }
        return new C12964a(c8846x2M35505k0);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m49194h(@NotNull C0008c0 characteristicsCompat) {
        long[] jArr;
        Intrinsics.checkNotNullParameter(characteristicsCompat, "characteristicsCompat");
        return (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) characteristicsCompat.m9a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m49195k(@NotNull C0008c0 characteristicsCompat, @NotNull List<AbstractC8754g> attachedSurfaces, @NotNull Map<InterfaceC8771i4<?>, AbstractC8827t3> suggestedStreamSpecMap, @NotNull Map<AbstractC8754g, AbstractC8827t3> attachedSurfaceStreamSpecMap) {
        Intrinsics.checkNotNullParameter(characteristicsCompat, "characteristicsCompat");
        Intrinsics.checkNotNullParameter(attachedSurfaces, "attachedSurfaces");
        Intrinsics.checkNotNullParameter(suggestedStreamSpecMap, "suggestedStreamSpecMap");
        Intrinsics.checkNotNullParameter(attachedSurfaceStreamSpecMap, "attachedSurfaceStreamSpecMap");
        int i10 = 0;
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        ArrayList arrayList = new ArrayList(suggestedStreamSpecMap.keySet());
        Iterator<AbstractC8754g> it = attachedSurfaces.iterator();
        while (it.hasNext()) {
            C12637g.m47075g(it.next().mo35098e());
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            C12637g.m47075g(((AbstractC8827t3) C12637g.m47075g(suggestedStreamSpecMap.get((InterfaceC8771i4) obj))).mo35393d());
        }
        long[] jArr = (long[]) characteristicsCompat.m9a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
        if (jArr != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j10 : jArr) {
                hashSet.add(Long.valueOf(j10));
            }
            if (f47237a.m49202i(attachedSurfaces, arrayList, hashSet)) {
                for (AbstractC8754g abstractC8754g : attachedSurfaces) {
                    InterfaceC8795n1 interfaceC8795n1Mo35098e = abstractC8754g.mo35098e();
                    C13497c5 c13497c5 = f47237a;
                    Intrinsics.checkNotNull(interfaceC8795n1Mo35098e);
                    InterfaceC8795n1 interfaceC8795n1M49200f = c13497c5.m49200f(interfaceC8795n1Mo35098e, (Long) interfaceC8795n1Mo35098e.mo35027e(C12964a.f45917R));
                    if (interfaceC8795n1M49200f != null) {
                        attachedSurfaceStreamSpecMap.put(abstractC8754g, abstractC8754g.m35104k(interfaceC8795n1M49200f));
                    }
                }
                int size2 = arrayList.size();
                while (i10 < size2) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    InterfaceC8771i4<?> interfaceC8771i4 = (InterfaceC8771i4) obj2;
                    AbstractC8827t3 abstractC8827t3 = suggestedStreamSpecMap.get(interfaceC8771i4);
                    Intrinsics.checkNotNull(abstractC8827t3);
                    InterfaceC8795n1 interfaceC8795n1Mo35393d = abstractC8827t3.mo35393d();
                    C13497c5 c13497c6 = f47237a;
                    Intrinsics.checkNotNull(interfaceC8795n1Mo35393d);
                    InterfaceC8795n1 interfaceC8795n1M49200f2 = c13497c6.m49200f(interfaceC8795n1Mo35393d, (Long) interfaceC8795n1Mo35393d.mo35027e(C12964a.f45917R));
                    if (interfaceC8795n1M49200f2 != null) {
                        suggestedStreamSpecMap.put(interfaceC8771i4, abstractC8827t3.mo35398i().mo35402d(interfaceC8795n1M49200f2).mo35399a());
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static final void m49196l(@NotNull Map<InterfaceC8771i4<?>, AbstractC8827t3> suggestedStreamSpecMap, @NotNull Map<AbstractC8754g, AbstractC8827t3> attachedSurfaceStreamSpecMap, @NotNull Map<Integer, ? extends AbstractC8754g> surfaceConfigIndexAttachedSurfaceInfoMap, @NotNull Map<Integer, ? extends InterfaceC8771i4<?>> surfaceConfigIndexUseCaseConfigMap, @NotNull List<SurfaceConfig> surfaceConfigsWithStreamUseCase) {
        Intrinsics.checkNotNullParameter(suggestedStreamSpecMap, "suggestedStreamSpecMap");
        Intrinsics.checkNotNullParameter(attachedSurfaceStreamSpecMap, "attachedSurfaceStreamSpecMap");
        Intrinsics.checkNotNullParameter(surfaceConfigIndexAttachedSurfaceInfoMap, "surfaceConfigIndexAttachedSurfaceInfoMap");
        Intrinsics.checkNotNullParameter(surfaceConfigIndexUseCaseConfigMap, "surfaceConfigIndexUseCaseConfigMap");
        Intrinsics.checkNotNullParameter(surfaceConfigsWithStreamUseCase, "surfaceConfigsWithStreamUseCase");
        int size = surfaceConfigsWithStreamUseCase.size();
        for (int i10 = 0; i10 < size; i10++) {
            long value = surfaceConfigsWithStreamUseCase.get(i10).getStreamUseCase().getValue();
            if (surfaceConfigIndexAttachedSurfaceInfoMap.containsKey(Integer.valueOf(i10))) {
                AbstractC8754g abstractC8754g = surfaceConfigIndexAttachedSurfaceInfoMap.get(Integer.valueOf(i10));
                Intrinsics.checkNotNull(abstractC8754g);
                InterfaceC8795n1 interfaceC8795n1Mo35098e = abstractC8754g.mo35098e();
                C13497c5 c13497c5 = f47237a;
                Intrinsics.checkNotNull(interfaceC8795n1Mo35098e);
                InterfaceC8795n1 interfaceC8795n1M49200f = c13497c5.m49200f(interfaceC8795n1Mo35098e, Long.valueOf(value));
                if (interfaceC8795n1M49200f != null) {
                    attachedSurfaceStreamSpecMap.put(abstractC8754g, abstractC8754g.m35104k(interfaceC8795n1M49200f));
                }
            } else {
                if (!surfaceConfigIndexUseCaseConfigMap.containsKey(Integer.valueOf(i10))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                InterfaceC8771i4<?> interfaceC8771i4 = surfaceConfigIndexUseCaseConfigMap.get(Integer.valueOf(i10));
                Intrinsics.checkNotNull(interfaceC8771i4);
                InterfaceC8771i4<?> interfaceC8771i5 = interfaceC8771i4;
                AbstractC8827t3 abstractC8827t3 = suggestedStreamSpecMap.get(interfaceC8771i5);
                Intrinsics.checkNotNull(abstractC8827t3);
                InterfaceC8795n1 interfaceC8795n1Mo35393d = abstractC8827t3.mo35393d();
                C13497c5 c13497c6 = f47237a;
                Intrinsics.checkNotNull(interfaceC8795n1Mo35393d);
                InterfaceC8795n1 interfaceC8795n1M49200f2 = c13497c6.m49200f(interfaceC8795n1Mo35393d, Long.valueOf(value));
                if (interfaceC8795n1M49200f2 != null) {
                    AbstractC8827t3 abstractC8827t3Mo35399a = abstractC8827t3.mo35398i().mo35402d(interfaceC8795n1M49200f2).mo35399a();
                    Intrinsics.checkNotNullExpressionValue(abstractC8827t3Mo35399a, "build(...)");
                    suggestedStreamSpecMap.put(interfaceC8771i5, abstractC8827t3Mo35399a);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: java.util.Map<n0.u1, java.lang.Long> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static final void m49197m(@NotNull Collection<C8802o3> sessionConfigs, @NotNull Collection<? extends InterfaceC8771i4<?>> useCaseConfigs, @NotNull Map<AbstractC8830u1, Long> streamUseCaseMap) {
        Intrinsics.checkNotNullParameter(sessionConfigs, "sessionConfigs");
        Intrinsics.checkNotNullParameter(useCaseConfigs, "useCaseConfigs");
        Intrinsics.checkNotNullParameter(streamUseCaseMap, "streamUseCaseMap");
        ArrayList arrayList = new ArrayList(useCaseConfigs);
        for (C8802o3 c8802o3 : sessionConfigs) {
            InterfaceC8795n1 interfaceC8795n1M35301g = c8802o3.m35301g();
            InterfaceC8795n1.a<Long> aVar = STREAM_USE_CASE_STREAM_SPEC_OPTION;
            if (interfaceC8795n1M35301g.mo35023a(aVar) && c8802o3.m35310p().size() != 1) {
                C7737g0 c7737g0 = C7737g0.f29434a;
                String str = String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Arrays.copyOf(new Object[]{Integer.valueOf(c8802o3.m35310p().size())}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                C5931r1.m26563c("StreamUseCaseUtil", str);
                return;
            }
            if (c8802o3.m35301g().mo35023a(aVar)) {
                int i10 = 0;
                for (C8802o3 c8802o4 : sessionConfigs) {
                    if (((InterfaceC8771i4) arrayList.get(i10)).mo35207X() == InterfaceC8777j4.b.METERING_REPEATING) {
                        List<AbstractC8830u1> listM35310p = c8802o4.m35310p();
                        Intrinsics.checkNotNullExpressionValue(listM35310p, "getSurfaces(...)");
                        C12637g.m47078j(!listM35310p.isEmpty(), "MeteringRepeating should contain a surface");
                        streamUseCaseMap.put(c8802o4.m35310p().get(0), 1L);
                    } else {
                        InterfaceC8795n1 interfaceC8795n1M35301g2 = c8802o4.m35301g();
                        InterfaceC8795n1.a<Long> aVar2 = STREAM_USE_CASE_STREAM_SPEC_OPTION;
                        if (interfaceC8795n1M35301g2.mo35023a(aVar2)) {
                            List<AbstractC8830u1> listM35310p2 = c8802o4.m35310p();
                            Intrinsics.checkNotNullExpressionValue(listM35310p2, "getSurfaces(...)");
                            if (!listM35310p2.isEmpty()) {
                                AbstractC8830u1 abstractC8830u1 = c8802o4.m35310p().get(0);
                                Object objMo35027e = c8802o4.m35301g().mo35027e(aVar2);
                                Intrinsics.checkNotNull(objMo35027e);
                                streamUseCaseMap.put(abstractC8830u1, objMo35027e);
                            }
                        }
                    }
                    i10++;
                }
                break;
            }
        }
        C5931r1.m26561a("StreamUseCaseUtil", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + streamUseCaseMap);
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m49198n(@NotNull C13529g5.d featureSettings) {
        Intrinsics.checkNotNullParameter(featureSettings, "featureSettings");
        return featureSettings.mo49221a() == 0 && featureSettings.mo49222b() == 8 && !featureSettings.mo49226f();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m49199b(Set<Long> availableStreamUseCasesSet, Set<Long> streamUseCases) {
        Iterator<Long> it = streamUseCases.iterator();
        while (it.hasNext()) {
            if (!availableStreamUseCasesSet.contains(Long.valueOf(it.next().longValue()))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC8795n1 m49200f(InterfaceC8795n1 oldImplementationOptions, Long streamUseCase) {
        InterfaceC8795n1.a<Long> aVar = STREAM_USE_CASE_STREAM_SPEC_OPTION;
        if (oldImplementationOptions.mo35023a(aVar) && Intrinsics.m31980c(oldImplementationOptions.mo35027e(aVar), streamUseCase)) {
            return null;
        }
        C8846x2 c8846x2M35506l0 = C8846x2.m35506l0(oldImplementationOptions);
        Intrinsics.checkNotNullExpressionValue(c8846x2M35506l0, "from(...)");
        c8846x2M35506l0.mo35473G(aVar, streamUseCase);
        return new C12964a(c8846x2M35506l0);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m49201g(InterfaceC8777j4.b captureType, long streamUseCase, List<? extends InterfaceC8777j4.b> streamSharingTypes) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (captureType != InterfaceC8777j4.b.STREAM_SHARING) {
            Map<Long, Set<InterfaceC8777j4.b>> map = STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP;
            if (map.containsKey(Long.valueOf(streamUseCase))) {
                Set<InterfaceC8777j4.b> set = map.get(Long.valueOf(streamUseCase));
                Intrinsics.checkNotNull(set);
                if (set.contains(captureType)) {
                    return true;
                }
            }
            return false;
        }
        Map<Long, Set<InterfaceC8777j4.b>> map2 = STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP;
        if (!map2.containsKey(Long.valueOf(streamUseCase))) {
            return false;
        }
        Set<InterfaceC8777j4.b> set2 = map2.get(Long.valueOf(streamUseCase));
        Intrinsics.checkNotNull(set2);
        Set<InterfaceC8777j4.b> set3 = set2;
        if (streamSharingTypes.size() != set3.size()) {
            return false;
        }
        Iterator<? extends InterfaceC8777j4.b> it = streamSharingTypes.iterator();
        while (it.hasNext()) {
            if (!set3.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0028  */
    /* JADX INFO: renamed from: i */
    public final boolean m49202i(List<? extends AbstractC8754g> attachedSurfaces, List<? extends InterfaceC8771i4<?>> newUseCaseConfigs, Set<Long> availableStreamUseCases) {
        boolean z10;
        boolean z11;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<? extends AbstractC8754g> it = attachedSurfaces.iterator();
        if (it.hasNext()) {
            AbstractC8754g next = it.next();
            InterfaceC8795n1 interfaceC8795n1Mo35098e = next.mo35098e();
            Intrinsics.checkNotNull(interfaceC8795n1Mo35098e);
            InterfaceC8795n1.a<Long> aVar = C12964a.f45917R;
            if (interfaceC8795n1Mo35098e.mo35023a(aVar)) {
                InterfaceC8795n1 interfaceC8795n1Mo35098e2 = next.mo35098e();
                Intrinsics.checkNotNull(interfaceC8795n1Mo35098e2);
                Object objMo35027e = interfaceC8795n1Mo35098e2.mo35027e(aVar);
                Intrinsics.checkNotNull(objMo35027e);
                if (((Number) objMo35027e).longValue() == 0) {
                    z11 = true;
                    z10 = false;
                } else {
                    z10 = true;
                    z11 = false;
                }
            } else {
                z11 = true;
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        for (InterfaceC8771i4<?> interfaceC8771i4 : newUseCaseConfigs) {
            InterfaceC8795n1.a<?> aVar2 = C12964a.f45917R;
            if (interfaceC8771i4.mo35023a(aVar2)) {
                Object objMo35027e2 = interfaceC8771i4.mo35027e(aVar2);
                Intrinsics.checkNotNull(objMo35027e2);
                long jLongValue = ((Number) objMo35027e2).longValue();
                if (jLongValue != 0) {
                    if (z11) {
                        m49204o();
                    }
                    linkedHashSet.add(Long.valueOf(jLongValue));
                    z10 = true;
                } else if (z10) {
                    m49204o();
                }
            } else if (z10) {
                m49204o();
            }
            z11 = true;
        }
        return !z11 && m49199b(availableStreamUseCases, linkedHashSet);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m49203j(InterfaceC8795n1 config, InterfaceC8777j4.b captureType) {
        Object objMo35030h = config.mo35030h(InterfaceC8771i4.f31900E, Boolean.FALSE);
        Intrinsics.checkNotNull(objMo35030h);
        if (((Boolean) objMo35030h).booleanValue()) {
            return false;
        }
        InterfaceC8795n1.a<Integer> aVar = C8757g2.f31831Q;
        if (!config.mo35023a(aVar)) {
            return false;
        }
        Object objMo35027e = config.mo35027e(aVar);
        Intrinsics.checkNotNull(objMo35027e);
        return C13629t5.m49623b(captureType, ((Number) objMo35027e).intValue()) == 5;
    }

    /* JADX INFO: renamed from: o */
    public final void m49204o() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }
}
