package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import p001a0.C0008c0;
import p296n0.AbstractC8827t3;

/* JADX INFO: loaded from: classes.dex */
public class AeFpsRangeLegacyQuirk implements AeFpsRangeQuirk {

    /* JADX INFO: renamed from: a */
    public final Range<Integer> f1728a;

    public AeFpsRangeLegacyQuirk(C0008c0 c0008c0) {
        this.f1728a = m2039i((Range[]) c0008c0.m9a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2036h(C0008c0 c0008c0) {
        Integer num = (Integer) c0008c0.m9a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    @Override // androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk
    /* JADX INFO: renamed from: a */
    public Range<Integer> mo2037a() {
        Range<Integer> range = this.f1728a;
        return range != null ? range : AbstractC8827t3.f32104a;
    }

    /* JADX INFO: renamed from: g */
    public final Range<Integer> m2038g(Range<Integer> range) {
        int iIntValue = ((Integer) range.getUpper()).intValue();
        int iIntValue2 = ((Integer) range.getLower()).intValue();
        if (((Integer) range.getUpper()).intValue() >= 1000) {
            iIntValue = ((Integer) range.getUpper()).intValue() / 1000;
        }
        if (((Integer) range.getLower()).intValue() >= 1000) {
            iIntValue2 = ((Integer) range.getLower()).intValue() / 1000;
        }
        return new Range<>(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
    }

    /* JADX INFO: renamed from: i */
    public final Range<Integer> m2039i(Range<Integer>[] rangeArr) {
        Range<Integer> range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range<Integer> range2 : rangeArr) {
                Range<Integer> rangeM2038g = m2038g(range2);
                if (((Integer) rangeM2038g.getUpper()).intValue() == 30 && (range == null || ((Integer) rangeM2038g.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = rangeM2038g;
                }
            }
        }
        return range;
    }
}
