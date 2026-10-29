package d0;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import g0.r1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14256a;
    public final ExtraSupportedOutputSizeQuirk b = (ExtraSupportedOutputSizeQuirk) c0.e.b(ExtraSupportedOutputSizeQuirk.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f14257c;

    public m(String str) {
        this.f14256a = str;
        this.f14257c = new e(str);
    }

    public final void a(List<Size> list, int i10) {
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.b;
        if (extraSupportedOutputSizeQuirk == null) {
            return;
        }
        Size[] sizeArrG = extraSupportedOutputSizeQuirk.g(i10);
        if (sizeArrG.length > 0) {
            list.addAll(Arrays.asList(sizeArrG));
        }
    }

    public Size[] b(Size[] sizeArr, int i10) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        a(arrayList, i10);
        c(arrayList, i10);
        if (arrayList.isEmpty()) {
            r1.l("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    public final void c(List<Size> list, int i10) {
        List<Size> listA = this.f14257c.a(i10);
        if (listA.isEmpty()) {
            return;
        }
        list.removeAll(listA);
    }
}
