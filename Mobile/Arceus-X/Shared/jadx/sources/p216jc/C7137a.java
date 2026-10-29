package p216jc;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p144g4.C6002a;
import p144g4.C6003b;
import p144g4.C6004c;

/* JADX INFO: renamed from: jc.a */
/* JADX INFO: loaded from: classes2.dex */
public class C7137a {

    /* JADX INFO: renamed from: a */
    public static final TimeInterpolator f27784a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final TimeInterpolator f27785b = new C6003b();

    /* JADX INFO: renamed from: c */
    public static final TimeInterpolator f27786c = new C6002a();

    /* JADX INFO: renamed from: d */
    public static final TimeInterpolator f27787d = new C6004c();

    /* JADX INFO: renamed from: e */
    public static final TimeInterpolator f27788e = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    public static float m29919a(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    /* JADX INFO: renamed from: b */
    public static float m29920b(float f10, float f11, float f12, float f13, float f14) {
        if (f14 <= f12) {
            return f10;
        }
        return f14 >= f13 ? f11 : m29919a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    /* JADX INFO: renamed from: c */
    public static int m29921c(int i10, int i11, float f10) {
        return i10 + Math.round(f10 * (i11 - i10));
    }
}
