package p063d0;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import java.util.ArrayList;
import java.util.Comparator;
import p036c0.C1500e;
import p347p0.C10089e;

/* JADX INFO: renamed from: d0.w */
/* JADX INFO: loaded from: classes.dex */
public class C4392w {

    /* JADX INFO: renamed from: b */
    public static final Size f18252b = new Size(320, 240);

    /* JADX INFO: renamed from: c */
    public static final Comparator<Size> f18253c = new C10089e();

    /* JADX INFO: renamed from: a */
    public final RepeatingStreamConstraintForVideoRecordingQuirk f18254a = (RepeatingStreamConstraintForVideoRecordingQuirk) C1500e.m7653b(RepeatingStreamConstraintForVideoRecordingQuirk.class);

    /* JADX INFO: renamed from: a */
    public Size[] m22064a(Size[] sizeArr) {
        if (this.f18254a == null || !RepeatingStreamConstraintForVideoRecordingQuirk.m2143g()) {
            return sizeArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            if (f18253c.compare(size, f18252b) >= 0) {
                arrayList.add(size);
            }
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
