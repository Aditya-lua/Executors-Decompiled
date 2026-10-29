package z;

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
import kotlin.jvm.internal.Intrinsics;
import n0.SurfaceConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJQ\u0010#\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0016\u0010!\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020 0\t2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020 0\tH\u0007¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001dH\u0007¢\u0006\u0004\b'\u0010(JK\u0010/\u001a\u00020\u00162\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0006\u0012\u0004\u0018\u00010\u001e0)2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070)2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020%0-H\u0007¢\u0006\u0004\b/\u00100Ju\u00101\u001a\u00020\r2\u0016\u0010!\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020 0\t2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020 0\t2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001e0)2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070)2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020%0-H\u0007¢\u0006\u0004\b1\u00102J/\u00104\u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0-2\u0010\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070-H\u0007¢\u0006\u0004\b4\u00105J-\u0010:\u001a\u00020\u00162\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u000b2\f\u00109\u001a\b\u0012\u0004\u0012\u0002060-H\u0002¢\u0006\u0004\b:\u0010;J#\u0010>\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020<2\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010A\u001a\u00020\u00162\u0006\u0010@\u001a\u00020<2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\bA\u0010BJ+\u0010F\u001a\u00020\u00162\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000b0C2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000b0CH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\rH\u0002¢\u0006\u0004\bH\u0010\u0003J=\u0010J\u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0-2\u0010\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070-2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000b0CH\u0002¢\u0006\u0004\bJ\u0010KR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000b0L8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010MR&\u0010P\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002060C0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010OR&\u0010Q\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002060C0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010O¨\u0006R"}, d2 = {"Lz/c5;", "", "<init>", "()V", "", "Ln0/o3;", "sessionConfigs", "Ln0/i4;", "useCaseConfigs", "", "Ln0/u1;", "", "streamUseCaseMap", "", "m", "(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Map;)V", "useCaseConfig", "Ly/a;", "e", "(Ln0/i4;)Ly/a;", "La0/c0;", "characteristicsCompat", "", "h", "(La0/c0;)Z", "Lz/g5$d;", "featureSettings", "n", "(Lz/g5$d;)Z", "", "Ln0/g;", "attachedSurfaces", "Ln0/t3;", "suggestedStreamSpecMap", "attachedSurfaceStreamSpecMap", "k", "(La0/c0;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Z", "Ln0/w3;", "surfaceConfigs", "c", "(La0/c0;Ljava/util/List;)Z", "", "", "surfaceConfigIndexAttachedSurfaceInfoMap", "surfaceConfigIndexUseCaseConfigMap", "", "surfaceConfigsWithStreamUseCase", "a", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)Z", "l", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "newUseCaseConfigs", "d", "(Ljava/util/List;Ljava/util/List;)Z", "Ln0/j4$b;", "captureType", "streamUseCase", "streamSharingTypes", "g", "(Ln0/j4$b;JLjava/util/List;)Z", "Ln0/n1;", "oldImplementationOptions", "f", "(Ln0/n1;Ljava/lang/Long;)Ln0/n1;", "config", "j", "(Ln0/n1;Ln0/j4$b;)Z", "", "availableStreamUseCasesSet", "streamUseCases", "b", "(Ljava/util/Set;Ljava/util/Set;)Z", "o", "availableStreamUseCases", "i", "(Ljava/util/List;Ljava/util/List;Ljava/util/Set;)Z", "Ln0/n1$a;", "Ln0/n1$a;", "STREAM_USE_CASE_STREAM_SPEC_OPTION", "Ljava/util/Map;", "STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP", "STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c5 f36461a = new c5();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final n0.n1.a<Long> STREAM_USE_CASE_STREAM_SPEC_OPTION;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Map<Long, Set<n0.j4.b>> STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Map<Long, Set<n0.j4.b>> STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP;

    static {
        Class cls = Long.TYPE;
        Intrinsics.checkNotNull(cls);
        n0.n1.a<Long> aVarA = n0.n1.a.a("camera2.streamSpec.streamUseCase", cls);
        Intrinsics.checkNotNullExpressionValue(aVarA, "create(...)");
        STREAM_USE_CASE_STREAM_SPEC_OPTION = aVarA;
        Map mapD = kotlin.collections.j0.d();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            n0.j4.b bVar = n0.j4.b.PREVIEW;
            n0.j4.b bVar2 = n0.j4.b.METERING_REPEATING;
            n0.j4.b bVar3 = n0.j4.b.IMAGE_ANALYSIS;
            mapD.put(4L, kotlin.collections.q0.g(bVar, bVar2, bVar3));
            mapD.put(1L, kotlin.collections.q0.g(bVar, bVar2, bVar3));
            mapD.put(2L, kotlin.collections.p0.c(n0.j4.b.IMAGE_CAPTURE));
            mapD.put(3L, kotlin.collections.p0.c(n0.j4.b.VIDEO_CAPTURE));
        }
        STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP = kotlin.collections.j0.c(mapD);
        Map mapD2 = kotlin.collections.j0.d();
        if (i10 >= 33) {
            n0.j4.b bVar4 = n0.j4.b.PREVIEW;
            n0.j4.b bVar5 = n0.j4.b.IMAGE_CAPTURE;
            n0.j4.b bVar6 = n0.j4.b.VIDEO_CAPTURE;
            mapD2.put(4L, kotlin.collections.q0.g(bVar4, bVar5, bVar6));
            mapD2.put(3L, kotlin.collections.q0.g(bVar4, bVar6));
        }
        STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP = kotlin.collections.j0.c(mapD2);
    }

    public static final boolean a(@NotNull Map<Integer, ? extends n0.g> surfaceConfigIndexAttachedSurfaceInfoMap, @NotNull Map<Integer, ? extends n0.i4<?>> surfaceConfigIndexUseCaseConfigMap, @NotNull List<SurfaceConfig> surfaceConfigsWithStreamUseCase) {
        List<n0.j4.b> listK;
        Intrinsics.checkNotNullParameter(surfaceConfigIndexAttachedSurfaceInfoMap, "surfaceConfigIndexAttachedSurfaceInfoMap");
        Intrinsics.checkNotNullParameter(surfaceConfigIndexUseCaseConfigMap, "surfaceConfigIndexUseCaseConfigMap");
        Intrinsics.checkNotNullParameter(surfaceConfigsWithStreamUseCase, "surfaceConfigsWithStreamUseCase");
        int size = surfaceConfigsWithStreamUseCase.size();
        for (int i10 = 0; i10 < size; i10++) {
            long value = surfaceConfigsWithStreamUseCase.get(i10).getStreamUseCase().getValue();
            if (surfaceConfigIndexAttachedSurfaceInfoMap.containsKey(Integer.valueOf(i10))) {
                n0.g gVar = surfaceConfigIndexAttachedSurfaceInfoMap.get(Integer.valueOf(i10));
                c5 c5Var = f36461a;
                Intrinsics.checkNotNull(gVar);
                n0.j4.b bVar = gVar.b().size() == 1 ? gVar.b().get(0) : n0.j4.b.STREAM_SHARING;
                Intrinsics.checkNotNull(bVar);
                List<n0.j4.b> listB = gVar.b();
                Intrinsics.checkNotNullExpressionValue(listB, "getCaptureTypes(...)");
                if (!c5Var.g(bVar, value, listB)) {
                    return false;
                }
            } else {
                if (!surfaceConfigIndexUseCaseConfigMap.containsKey(Integer.valueOf(i10))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                n0.i4<?> i4Var = surfaceConfigIndexUseCaseConfigMap.get(Integer.valueOf(i10));
                Intrinsics.checkNotNull(i4Var);
                n0.i4<?> i4Var2 = i4Var;
                c5 c5Var2 = f36461a;
                n0.j4.b bVarX = i4Var2.X();
                Intrinsics.checkNotNullExpressionValue(bVarX, "getCaptureType(...)");
                if (i4Var2.X() == n0.j4.b.STREAM_SHARING) {
                    listK = ((b1.i) i4Var2).h0();
                    Intrinsics.checkNotNullExpressionValue(listK, "getCaptureTypes(...)");
                } else {
                    listK = kotlin.collections.p.k();
                }
                if (!c5Var2.g(bVarX, value, listK)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean c(@NotNull a0.c0 characteristicsCompat, @NotNull List<SurfaceConfig> surfaceConfigs) {
        long[] jArr;
        Intrinsics.checkNotNullParameter(characteristicsCompat, "characteristicsCompat");
        Intrinsics.checkNotNullParameter(surfaceConfigs, "surfaceConfigs");
        if (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) characteristicsCompat.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) {
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

    public static final boolean d(@NotNull List<? extends n0.g> attachedSurfaces, @NotNull List<? extends n0.i4<?>> newUseCaseConfigs) {
        Intrinsics.checkNotNullParameter(attachedSurfaces, "attachedSurfaces");
        Intrinsics.checkNotNullParameter(newUseCaseConfigs, "newUseCaseConfigs");
        for (n0.g gVar : attachedSurfaces) {
            List<n0.j4.b> listB = gVar.b();
            Intrinsics.checkNotNullExpressionValue(listB, "getCaptureTypes(...)");
            n0.j4.b bVar = listB.get(0);
            c5 c5Var = f36461a;
            n0.n1 n1VarE = gVar.e();
            Intrinsics.checkNotNull(n1VarE);
            Intrinsics.checkNotNull(bVar);
            if (c5Var.j(n1VarE, bVar)) {
                return true;
            }
        }
        for (n0.i4<?> i4Var : newUseCaseConfigs) {
            c5 c5Var2 = f36461a;
            n0.j4.b bVarX = i4Var.X();
            Intrinsics.checkNotNullExpressionValue(bVarX, "getCaptureType(...)");
            if (c5Var2.j(i4Var, bVarX)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final y.a e(@NotNull n0.i4<?> useCaseConfig) {
        Intrinsics.checkNotNullParameter(useCaseConfig, "useCaseConfig");
        n0.x2 x2VarK0 = n0.x2.k0();
        Intrinsics.checkNotNullExpressionValue(x2VarK0, "create(...)");
        n0.n1.a<?> aVar = y.a.R;
        if (useCaseConfig.a(aVar)) {
            x2VarK0.G(aVar, useCaseConfig.e(aVar));
        }
        n0.n1.a<?> aVar2 = n0.i4.E;
        if (useCaseConfig.a(aVar2)) {
            x2VarK0.G(aVar2, useCaseConfig.e(aVar2));
        }
        n0.n1.a<?> aVar3 = n0.g2.Q;
        if (useCaseConfig.a(aVar3)) {
            x2VarK0.G(aVar3, useCaseConfig.e(aVar3));
        }
        n0.n1.a<?> aVar4 = n0.h2.f24670j;
        if (useCaseConfig.a(aVar4)) {
            x2VarK0.G(aVar4, useCaseConfig.e(aVar4));
        }
        return new y.a(x2VarK0);
    }

    public static final boolean h(@NotNull a0.c0 characteristicsCompat) {
        long[] jArr;
        Intrinsics.checkNotNullParameter(characteristicsCompat, "characteristicsCompat");
        return (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) characteristicsCompat.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
    }

    public static final boolean k(@NotNull a0.c0 characteristicsCompat, @NotNull List<n0.g> attachedSurfaces, @NotNull Map<n0.i4<?>, n0.t3> suggestedStreamSpecMap, @NotNull Map<n0.g, n0.t3> attachedSurfaceStreamSpecMap) {
        Intrinsics.checkNotNullParameter(characteristicsCompat, "characteristicsCompat");
        Intrinsics.checkNotNullParameter(attachedSurfaces, "attachedSurfaces");
        Intrinsics.checkNotNullParameter(suggestedStreamSpecMap, "suggestedStreamSpecMap");
        Intrinsics.checkNotNullParameter(attachedSurfaceStreamSpecMap, "attachedSurfaceStreamSpecMap");
        int i10 = 0;
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        ArrayList arrayList = new ArrayList(suggestedStreamSpecMap.keySet());
        Iterator<n0.g> it = attachedSurfaces.iterator();
        while (it.hasNext()) {
            x2.g.g(it.next().e());
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            x2.g.g(((n0.t3) x2.g.g(suggestedStreamSpecMap.get((n0.i4) obj))).d());
        }
        long[] jArr = (long[]) characteristicsCompat.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
        if (jArr != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j10 : jArr) {
                hashSet.add(Long.valueOf(j10));
            }
            if (f36461a.i(attachedSurfaces, arrayList, hashSet)) {
                for (n0.g gVar : attachedSurfaces) {
                    n0.n1 n1VarE = gVar.e();
                    c5 c5Var = f36461a;
                    Intrinsics.checkNotNull(n1VarE);
                    n0.n1 n1VarF = c5Var.f(n1VarE, (Long) n1VarE.e(y.a.R));
                    if (n1VarF != null) {
                        attachedSurfaceStreamSpecMap.put(gVar, gVar.k(n1VarF));
                    }
                }
                int size2 = arrayList.size();
                while (i10 < size2) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    n0.i4<?> i4Var = (n0.i4) obj2;
                    n0.t3 t3Var = suggestedStreamSpecMap.get(i4Var);
                    Intrinsics.checkNotNull(t3Var);
                    n0.n1 n1VarD = t3Var.d();
                    c5 c5Var2 = f36461a;
                    Intrinsics.checkNotNull(n1VarD);
                    n0.n1 n1VarF2 = c5Var2.f(n1VarD, (Long) n1VarD.e(y.a.R));
                    if (n1VarF2 != null) {
                        suggestedStreamSpecMap.put(i4Var, t3Var.i().d(n1VarF2).a());
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final void l(@NotNull Map<n0.i4<?>, n0.t3> suggestedStreamSpecMap, @NotNull Map<n0.g, n0.t3> attachedSurfaceStreamSpecMap, @NotNull Map<Integer, ? extends n0.g> surfaceConfigIndexAttachedSurfaceInfoMap, @NotNull Map<Integer, ? extends n0.i4<?>> surfaceConfigIndexUseCaseConfigMap, @NotNull List<SurfaceConfig> surfaceConfigsWithStreamUseCase) {
        Intrinsics.checkNotNullParameter(suggestedStreamSpecMap, "suggestedStreamSpecMap");
        Intrinsics.checkNotNullParameter(attachedSurfaceStreamSpecMap, "attachedSurfaceStreamSpecMap");
        Intrinsics.checkNotNullParameter(surfaceConfigIndexAttachedSurfaceInfoMap, "surfaceConfigIndexAttachedSurfaceInfoMap");
        Intrinsics.checkNotNullParameter(surfaceConfigIndexUseCaseConfigMap, "surfaceConfigIndexUseCaseConfigMap");
        Intrinsics.checkNotNullParameter(surfaceConfigsWithStreamUseCase, "surfaceConfigsWithStreamUseCase");
        int size = surfaceConfigsWithStreamUseCase.size();
        for (int i10 = 0; i10 < size; i10++) {
            long value = surfaceConfigsWithStreamUseCase.get(i10).getStreamUseCase().getValue();
            if (surfaceConfigIndexAttachedSurfaceInfoMap.containsKey(Integer.valueOf(i10))) {
                n0.g gVar = surfaceConfigIndexAttachedSurfaceInfoMap.get(Integer.valueOf(i10));
                Intrinsics.checkNotNull(gVar);
                n0.n1 n1VarE = gVar.e();
                c5 c5Var = f36461a;
                Intrinsics.checkNotNull(n1VarE);
                n0.n1 n1VarF = c5Var.f(n1VarE, Long.valueOf(value));
                if (n1VarF != null) {
                    attachedSurfaceStreamSpecMap.put(gVar, gVar.k(n1VarF));
                }
            } else {
                if (!surfaceConfigIndexUseCaseConfigMap.containsKey(Integer.valueOf(i10))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                n0.i4<?> i4Var = surfaceConfigIndexUseCaseConfigMap.get(Integer.valueOf(i10));
                Intrinsics.checkNotNull(i4Var);
                n0.i4<?> i4Var2 = i4Var;
                n0.t3 t3Var = suggestedStreamSpecMap.get(i4Var2);
                Intrinsics.checkNotNull(t3Var);
                n0.n1 n1VarD = t3Var.d();
                c5 c5Var2 = f36461a;
                Intrinsics.checkNotNull(n1VarD);
                n0.n1 n1VarF2 = c5Var2.f(n1VarD, Long.valueOf(value));
                if (n1VarF2 != null) {
                    n0.t3 t3VarA = t3Var.i().d(n1VarF2).a();
                    Intrinsics.checkNotNullExpressionValue(t3VarA, "build(...)");
                    suggestedStreamSpecMap.put(i4Var2, t3VarA);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(@NotNull Collection<n0.o3> sessionConfigs, @NotNull Collection<? extends n0.i4<?>> useCaseConfigs, @NotNull Map<n0.u1, Long> streamUseCaseMap) {
        Intrinsics.checkNotNullParameter(sessionConfigs, "sessionConfigs");
        Intrinsics.checkNotNullParameter(useCaseConfigs, "useCaseConfigs");
        Intrinsics.checkNotNullParameter(streamUseCaseMap, "streamUseCaseMap");
        ArrayList arrayList = new ArrayList(useCaseConfigs);
        for (n0.o3 o3Var : sessionConfigs) {
            n0.n1 n1VarG = o3Var.g();
            n0.n1.a<Long> aVar = STREAM_USE_CASE_STREAM_SPEC_OPTION;
            if (n1VarG.a(aVar) && o3Var.p().size() != 1) {
                kotlin.jvm.internal.g0 g0Var = kotlin.jvm.internal.g0.f22559a;
                String str = String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Arrays.copyOf(new Object[]{Integer.valueOf(o3Var.p().size())}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                g0.r1.c("StreamUseCaseUtil", str);
                return;
            }
            if (o3Var.g().a(aVar)) {
                int i10 = 0;
                for (n0.o3 o3Var2 : sessionConfigs) {
                    if (((n0.i4) arrayList.get(i10)).X() == n0.j4.b.METERING_REPEATING) {
                        List<n0.u1> listP = o3Var2.p();
                        Intrinsics.checkNotNullExpressionValue(listP, "getSurfaces(...)");
                        x2.g.j(!listP.isEmpty(), "MeteringRepeating should contain a surface");
                        streamUseCaseMap.put(o3Var2.p().get(0), 1L);
                    } else {
                        n0.n1 n1VarG2 = o3Var2.g();
                        n0.n1.a<Long> aVar2 = STREAM_USE_CASE_STREAM_SPEC_OPTION;
                        if (n1VarG2.a(aVar2)) {
                            List<n0.u1> listP2 = o3Var2.p();
                            Intrinsics.checkNotNullExpressionValue(listP2, "getSurfaces(...)");
                            if (!listP2.isEmpty()) {
                                n0.u1 u1Var = o3Var2.p().get(0);
                                Object objE = o3Var2.g().e(aVar2);
                                Intrinsics.checkNotNull(objE);
                                streamUseCaseMap.put(u1Var, objE);
                            }
                        }
                    }
                    i10++;
                }
                break;
            }
        }
        g0.r1.a("StreamUseCaseUtil", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + streamUseCaseMap);
    }

    public static final boolean n(@NotNull g5.d featureSettings) {
        Intrinsics.checkNotNullParameter(featureSettings, "featureSettings");
        return featureSettings.a() == 0 && featureSettings.b() == 8 && !featureSettings.f();
    }

    public final boolean b(Set<Long> availableStreamUseCasesSet, Set<Long> streamUseCases) {
        Iterator<Long> it = streamUseCases.iterator();
        while (it.hasNext()) {
            if (!availableStreamUseCasesSet.contains(Long.valueOf(it.next().longValue()))) {
                return false;
            }
        }
        return true;
    }

    public final n0.n1 f(n0.n1 oldImplementationOptions, Long streamUseCase) {
        n0.n1.a<Long> aVar = STREAM_USE_CASE_STREAM_SPEC_OPTION;
        if (oldImplementationOptions.a(aVar) && Intrinsics.c(oldImplementationOptions.e(aVar), streamUseCase)) {
            return null;
        }
        n0.x2 x2VarL0 = n0.x2.l0(oldImplementationOptions);
        Intrinsics.checkNotNullExpressionValue(x2VarL0, "from(...)");
        x2VarL0.G(aVar, streamUseCase);
        return new y.a(x2VarL0);
    }

    public final boolean g(n0.j4.b captureType, long streamUseCase, List<? extends n0.j4.b> streamSharingTypes) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (captureType != n0.j4.b.STREAM_SHARING) {
            Map<Long, Set<n0.j4.b>> map = STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP;
            if (map.containsKey(Long.valueOf(streamUseCase))) {
                Set<n0.j4.b> set = map.get(Long.valueOf(streamUseCase));
                Intrinsics.checkNotNull(set);
                if (set.contains(captureType)) {
                    return true;
                }
            }
            return false;
        }
        Map<Long, Set<n0.j4.b>> map2 = STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP;
        if (!map2.containsKey(Long.valueOf(streamUseCase))) {
            return false;
        }
        Set<n0.j4.b> set2 = map2.get(Long.valueOf(streamUseCase));
        Intrinsics.checkNotNull(set2);
        Set<n0.j4.b> set3 = set2;
        if (streamSharingTypes.size() != set3.size()) {
            return false;
        }
        Iterator<? extends n0.j4.b> it = streamSharingTypes.iterator();
        while (it.hasNext()) {
            if (!set3.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0028  */
    public final boolean i(List<? extends n0.g> attachedSurfaces, List<? extends n0.i4<?>> newUseCaseConfigs, Set<Long> availableStreamUseCases) {
        boolean z10;
        boolean z11;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<? extends n0.g> it = attachedSurfaces.iterator();
        if (it.hasNext()) {
            n0.g next = it.next();
            n0.n1 n1VarE = next.e();
            Intrinsics.checkNotNull(n1VarE);
            n0.n1.a<Long> aVar = y.a.R;
            if (n1VarE.a(aVar)) {
                n0.n1 n1VarE2 = next.e();
                Intrinsics.checkNotNull(n1VarE2);
                Object objE = n1VarE2.e(aVar);
                Intrinsics.checkNotNull(objE);
                if (((Number) objE).longValue() == 0) {
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
        for (n0.i4<?> i4Var : newUseCaseConfigs) {
            n0.n1.a<?> aVar2 = y.a.R;
            if (i4Var.a(aVar2)) {
                Object objE2 = i4Var.e(aVar2);
                Intrinsics.checkNotNull(objE2);
                long jLongValue = ((Number) objE2).longValue();
                if (jLongValue != 0) {
                    if (z11) {
                        o();
                    }
                    linkedHashSet.add(Long.valueOf(jLongValue));
                    z10 = true;
                } else if (z10) {
                    o();
                }
            } else if (z10) {
                o();
            }
            z11 = true;
        }
        return !z11 && b(availableStreamUseCases, linkedHashSet);
    }

    public final boolean j(n0.n1 config, n0.j4.b captureType) {
        Object objH = config.h(n0.i4.E, Boolean.FALSE);
        Intrinsics.checkNotNull(objH);
        if (((Boolean) objH).booleanValue()) {
            return false;
        }
        n0.n1.a<Integer> aVar = n0.g2.Q;
        if (!config.a(aVar)) {
            return false;
        }
        Object objE = config.e(aVar);
        Intrinsics.checkNotNull(objE);
        return t5.b(captureType, ((Number) objE).intValue()) == 5;
    }

    public final void o() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }
}
