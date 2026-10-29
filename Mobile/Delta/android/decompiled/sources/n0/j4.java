package n0;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public interface j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j4 f24707a = new a();

    public class a implements j4 {
        @Override // n0.j4
        public n1 a(b bVar, int i10) {
            return null;
        }
    }

    public enum b {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE,
        STREAM_SHARING,
        METERING_REPEATING
    }

    public interface c {
        j4 a(Context context);
    }

    n1 a(b bVar, int i10);
}
