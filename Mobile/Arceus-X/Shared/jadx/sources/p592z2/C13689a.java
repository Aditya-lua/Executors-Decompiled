package p592z2;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: renamed from: z2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13689a {

    /* JADX INFO: renamed from: z2.a$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static Interpolator m50009a(float f10, float f11, float f12, float f13) {
            return new PathInterpolator(f10, f11, f12, f13);
        }

        /* JADX INFO: renamed from: b */
        public static Interpolator m50010b(Path path) {
            return new PathInterpolator(path);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Interpolator m50007a(float f10, float f11, float f12, float f13) {
        return a.m50009a(f10, f11, f12, f13);
    }

    /* JADX INFO: renamed from: b */
    public static Interpolator m50008b(Path path) {
        return a.m50010b(path);
    }
}
