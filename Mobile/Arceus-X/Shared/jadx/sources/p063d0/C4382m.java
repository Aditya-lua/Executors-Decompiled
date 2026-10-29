package p063d0;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p036c0.C1500e;
import p140g0.C5931r1;

/* JADX INFO: renamed from: d0.m */
/* JADX INFO: loaded from: classes.dex */
public class C4382m {

    /* JADX INFO: renamed from: a */
    public final String f18235a;

    /* JADX INFO: renamed from: b */
    public final ExtraSupportedOutputSizeQuirk f18236b = (ExtraSupportedOutputSizeQuirk) C1500e.m7653b(ExtraSupportedOutputSizeQuirk.class);

    /* JADX INFO: renamed from: c */
    public final C4374e f18237c;

    public C4382m(String str) {
        this.f18235a = str;
        this.f18237c = new C4374e(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m22043a(List<Size> list, int i10) {
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.f18236b;
        if (extraSupportedOutputSizeQuirk == null) {
            return;
        }
        Size[] sizeArrM2078g = extraSupportedOutputSizeQuirk.m2078g(i10);
        if (sizeArrM2078g.length > 0) {
            list.addAll(Arrays.asList(sizeArrM2078g));
        }
    }

    /* JADX INFO: renamed from: b */
    public Size[] m22044b(Size[] sizeArr, int i10) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        m22043a(arrayList, i10);
        m22045c(arrayList, i10);
        if (arrayList.isEmpty()) {
            C5931r1.m26572l("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    /* JADX INFO: renamed from: c */
    public final void m22045c(List<Size> list, int i10) {
        List<Size> listM22029a = this.f18237c.m22029a(i10);
        if (listM22029a.isEmpty()) {
            return;
        }
        list.removeAll(listM22029a);
    }
}
