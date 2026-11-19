package androidx.camera.video.internal.compat.quirk;

import android.graphics.Rect;
import android.os.Build;
import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import m1.r1;
import n0.g3;
import p0.a0;

/* JADX INFO: loaded from: classes.dex */
public class SizeCannotEncodeVideoQuirk implements g3 {
    public static Set<Size> h() {
        return i() ? new HashSet(Collections.singletonList(new Size(720, 1280))) : Collections.EMPTY_SET;
    }

    private static boolean i() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean k() {
        return i();
    }

    public Rect g(Rect rect, int i10, r1 r1Var) {
        Size sizeQ = a0.q(a0.m(rect), i10);
        if (!j(sizeQ)) {
            return rect;
        }
        int iC = r1Var != null ? r1Var.c() / 2 : 8;
        Rect rect2 = new Rect(rect);
        if (rect.width() == sizeQ.getHeight()) {
            rect2.left += iC;
            rect2.right -= iC;
            return rect2;
        }
        rect2.top += iC;
        rect2.bottom -= iC;
        return rect2;
    }

    public boolean j(Size size) {
        return h().contains(size);
    }
}
