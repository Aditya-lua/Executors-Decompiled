package d0;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class w {
    public static final Size b = new Size(320, 240);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator<Size> f11633c = new p0.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RepeatingStreamConstraintForVideoRecordingQuirk f11634a = (RepeatingStreamConstraintForVideoRecordingQuirk) c0.e.b(RepeatingStreamConstraintForVideoRecordingQuirk.class);

    public Size[] a(Size[] sizeArr) {
        if (this.f11634a == null || !RepeatingStreamConstraintForVideoRecordingQuirk.g()) {
            return sizeArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            if (f11633c.compare(size, b) >= 0) {
                arrayList.add(size);
            }
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
