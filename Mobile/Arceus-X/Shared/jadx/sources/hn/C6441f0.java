package hn;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.util.Range;
import android.util.Size;
import com.withpersona.sdk2.camera.CameraProperties;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C7693m;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import mt.C8662a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;

/* JADX INFO: renamed from: hn.f0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Landroid/content/Context;", "context", "", "cameraId", "d", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "Landroid/hardware/camera2/CameraCharacteristics;", "", "preferredFps", "Landroid/util/Range;", "c", "(Landroid/hardware/camera2/CameraCharacteristics;I)Landroid/util/Range;", "", "Lhn/h0;", "a", "(Landroid/content/Context;)Ljava/util/List;", "Lhn/m0;", "cameraDirection", "Lhn/k0;", "b", "(Landroid/content/Context;Lhn/m0;)Lhn/k0;", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "e", "(Lhn/m0;)Lcom/withpersona/sdk2/camera/CameraProperties$b;", "camera_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6441f0 {

    /* JADX INFO: renamed from: hn.f0$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24431a;

        static {
            int[] iArr = new int[EnumC6455m0.values().length];
            try {
                iArr[EnumC6455m0.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6455m0.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6455m0.EXTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24431a = iArr;
        }
    }

    /* JADX INFO: renamed from: hn.f0$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            C6445h0 c6445h0 = (C6445h0) t10;
            C6445h0 c6445h1 = (C6445h0) t8;
            return C8662a.m34743a(Integer.valueOf(c6445h0.getSize().getWidth() * c6445h0.getSize().getHeight()), Integer.valueOf(c6445h1.getSize().getWidth() * c6445h1.getSize().getHeight()));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<C6445h0> m28078a(@NotNull Context context) throws CameraAccessException {
        CameraProperties.EnumC3397b enumC3397b;
        StreamConfigurationMap streamConfigurationMap;
        Range<Integer> range;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("camera");
        Intrinsics.m31981d(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) systemService;
        ArrayList arrayList = new ArrayList();
        String[] cameraIdList = cameraManager.getCameraIdList();
        Intrinsics.checkNotNullExpressionValue(cameraIdList, "getCameraIdList(...)");
        int length = cameraIdList.length;
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            String str = cameraIdList[i11];
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "getCameraCharacteristics(...)");
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            int iIntValue = num2 != null ? num2.intValue() : i10;
            if (num != null && num.intValue() == 0) {
                enumC3397b = CameraProperties.EnumC3397b.User;
            } else {
                enumC3397b = (num != null && num.intValue() == 1) ? CameraProperties.EnumC3397b.Environment : CameraProperties.EnumC3397b.Unknown;
            }
            CameraProperties.EnumC3397b enumC3397b2 = enumC3397b;
            int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && C7693m.m31836E(iArr, i10)) {
                Range<Integer> rangeM28080c = m28080c(cameraCharacteristics, 30);
                Class<MediaRecorder> cls = MediaRecorder.class;
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(cls);
                Intrinsics.checkNotNullExpressionValue(outputSizes, "getOutputSizes(...)");
                int length2 = outputSizes.length;
                int i12 = i10;
                while (i12 < length2) {
                    Size[] sizeArr = outputSizes;
                    Size size = sizeArr[i12];
                    int i13 = i11;
                    double outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(cls, size) / 1.0E9d;
                    Class<MediaRecorder> cls2 = cls;
                    double d10 = outputMinFrameDuration > 0.0d ? 1.0d / outputMinFrameDuration : 0.0d;
                    Intrinsics.checkNotNull(str);
                    Intrinsics.checkNotNull(size);
                    CameraManager cameraManager2 = cameraManager;
                    if (rangeM28080c == null) {
                        int i14 = (int) d10;
                        range = new Range<>(Integer.valueOf(i14), Integer.valueOf(i14));
                    } else {
                        range = rangeM28080c;
                    }
                    arrayList.add(new C6445h0(str, size, d10, range, iIntValue, enumC3397b2, new ExtraCameraOptions(0L, false, 3, null)));
                    i12++;
                    outputSizes = sizeArr;
                    length2 = length2;
                    cls = cls2;
                    i11 = i13;
                    cameraManager = cameraManager2;
                    cameraIdList = cameraIdList;
                    length = length;
                }
            }
            i11++;
            cameraManager = cameraManager;
            cameraIdList = cameraIdList;
            length = length;
            i10 = 0;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj = arrayList.get(i15);
            i15++;
            C6445h0 c6445h0 = (C6445h0) obj;
            if (c6445h0.getSize().getWidth() < 2000 && c6445h0.getSize().getHeight() < 2000) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final CameraChoices m28079b(@NotNull Context context, @NotNull EnumC6455m0 cameraDirection) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraDirection, "cameraDirection");
        List<C6445h0> listM28078a = m28078a(context);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM28078a) {
            if (((C6445h0) obj).getFacing() == m28082e(cameraDirection)) {
                arrayList.add(obj);
            }
        }
        List listF0 = CollectionsKt.m31680F0(arrayList, new b());
        if (listF0.isEmpty()) {
            return null;
        }
        return new CameraChoices((C6445h0) CollectionsKt.m31706d0(listF0), CollectionsKt.m31682H0(CollectionsKt.m31701Y(listF0, 1), 5));
    }

    /* JADX INFO: renamed from: c */
    public static final Range<Integer> m28080c(CameraCharacteristics cameraCharacteristics, int i10) {
        Range<Integer>[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        Range<Integer> range = null;
        if (rangeArr == null || rangeArr.length == 0) {
            return null;
        }
        for (Range<Integer> range2 : rangeArr) {
            Object upper = range2.getUpper();
            Intrinsics.checkNotNullExpressionValue(upper, "getUpper(...)");
            int iIntValue = ((Number) upper).intValue();
            if (iIntValue >= i10 && (range == null || iIntValue < ((Number) range.getUpper()).intValue())) {
                range = range2;
            }
        }
        if (range != null) {
            return range;
        }
        if (rangeArr.length == 0) {
            throw new NoSuchElementException();
        }
        Range<Integer> range3 = rangeArr[0];
        int iM31844M = C7693m.m31844M(rangeArr);
        if (iM31844M == 0) {
            return range3;
        }
        Integer num = (Integer) range3.getUpper();
        int i11 = 1;
        if (1 <= iM31844M) {
            while (true) {
                Range<Integer> range4 = rangeArr[i11];
                Integer num2 = (Integer) range4.getUpper();
                if (num.compareTo(num2) < 0) {
                    range3 = range4;
                    num = num2;
                }
                if (i11 == iM31844M) {
                    break;
                }
                i11++;
            }
        }
        return range3;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m28081d(@NotNull Context context, @NotNull String cameraId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Object systemService = context.getSystemService("camera");
        Intrinsics.m31981d(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        try {
            Integer num = (Integer) ((CameraManager) systemService).getCameraCharacteristics(cameraId).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (num != null && num.intValue() == 2) {
                return "LEGACY";
            }
            if (num != null && num.intValue() == 0) {
                return "LIMITED";
            }
            if (num != null && num.intValue() == 1) {
                return "FULL";
            }
            if (num != null && num.intValue() == 3) {
                return "LEVEL_3";
            }
            if (num != null && num.intValue() == 4) {
                return "EXTERNAL";
            }
            return "unknown(" + num + ")";
        } catch (Exception e10) {
            return "unknown(" + C7731d0.m32002b(e10.getClass()).mo28427g() + ")";
        }
    }

    /* JADX INFO: renamed from: e */
    public static final CameraProperties.EnumC3397b m28082e(EnumC6455m0 enumC6455m0) {
        int i10 = a.f24431a[enumC6455m0.ordinal()];
        if (i10 == 1) {
            return CameraProperties.EnumC3397b.User;
        }
        if (i10 == 2) {
            return CameraProperties.EnumC3397b.Environment;
        }
        if (i10 == 3) {
            return CameraProperties.EnumC3397b.Unknown;
        }
        throw new C7345l();
    }
}
