package androidx.camera.video.internal.compat.quirk;

import android.graphics.Rect;
import android.os.Build;
import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p282m1.InterfaceC8389r1;
import p296n0.InterfaceC8758g3;
import p347p0.C10085a0;

/* JADX INFO: loaded from: classes.dex */
public class SizeCannotEncodeVideoQuirk implements InterfaceC8758g3 {
    /* JADX INFO: renamed from: h */
    public static Set<Size> m2330h() {
        return m2331i() ? new HashSet(Collections.singletonList(new Size(720, 1280))) : Collections.EMPTY_SET;
    }

    /* JADX INFO: renamed from: i */
    private static boolean m2331i() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2332k() {
        return m2331i();
    }

    /* JADX INFO: renamed from: g */
    public Rect m2333g(Rect rect, int i10, InterfaceC8389r1 interfaceC8389r1) {
        Size sizeM38889q = C10085a0.m38889q(C10085a0.m38885m(rect), i10);
        if (!m2334j(sizeM38889q)) {
            return rect;
        }
        int iMo34054c = interfaceC8389r1 != null ? interfaceC8389r1.mo34054c() / 2 : 8;
        Rect rect2 = new Rect(rect);
        if (rect.width() == sizeM38889q.getHeight()) {
            rect2.left += iMo34054c;
            rect2.right -= iMo34054c;
            return rect2;
        }
        rect2.top += iMo34054c;
        rect2.bottom -= iMo34054c;
        return rect2;
    }

    /* JADX INFO: renamed from: j */
    public boolean m2334j(Size size) {
        return m2330h().contains(size);
    }
}
