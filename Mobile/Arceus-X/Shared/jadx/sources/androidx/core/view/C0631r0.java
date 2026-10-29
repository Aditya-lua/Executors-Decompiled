package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Objects;
import p533x2.InterfaceC12638h;

/* JADX INFO: renamed from: androidx.core.view.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0631r0 {

    /* JADX INFO: renamed from: androidx.core.view.r0$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static float m3170a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        /* JADX INFO: renamed from: b */
        public static float m3171b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.r0$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static boolean m3172a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.r0$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static int m3173a(ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i10, i11, i12);
        }

        /* JADX INFO: renamed from: b */
        public static int m3174b(ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i10, i11, i12);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m3160a(Resources resources, int i10, InterfaceC12638h<Integer> interfaceC12638h, int i11) {
        int dimensionPixelSize;
        if (i10 != -1) {
            return (i10 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i10)) < 0) ? i11 : dimensionPixelSize;
        }
        return interfaceC12638h.get().intValue();
    }

    /* JADX INFO: renamed from: b */
    public static int m3161b(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    /* JADX INFO: renamed from: c */
    public static int m3162c(Resources resources, int i10, int i11) {
        if (i10 == 4194304 && i11 == 26) {
            return m3161b(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static int m3163d(Resources resources, int i10, int i11) {
        if (i10 == 4194304 && i11 == 26) {
            return m3161b(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public static float m3164e(ViewConfiguration viewConfiguration, Context context) {
        return a.m3170a(viewConfiguration);
    }

    /* JADX INFO: renamed from: f */
    public static int m3165f(Context context, final ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.m3173a(viewConfiguration, i10, i11, i12);
        }
        if (!m3168i(i10, i11, i12)) {
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        Resources resources = context.getResources();
        int iM3162c = m3162c(resources, i12, i11);
        Objects.requireNonNull(viewConfiguration);
        return m3160a(resources, iM3162c, new InterfaceC12638h() { // from class: androidx.core.view.p0
            @Override // p533x2.InterfaceC12638h
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
    }

    /* JADX INFO: renamed from: g */
    public static int m3166g(Context context, final ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.m3174b(viewConfiguration, i10, i11, i12);
        }
        if (!m3168i(i10, i11, i12)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int iM3163d = m3163d(resources, i12, i11);
        Objects.requireNonNull(viewConfiguration);
        return m3160a(resources, iM3163d, new InterfaceC12638h() { // from class: androidx.core.view.q0
            @Override // p533x2.InterfaceC12638h
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: h */
    public static float m3167h(ViewConfiguration viewConfiguration, Context context) {
        return a.m3171b(viewConfiguration);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m3168i(int i10, int i11, int i12) {
        InputDevice device = InputDevice.getDevice(i10);
        return (device == null || device.getMotionRange(i11, i12) == null) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m3169j(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.m3172a(viewConfiguration);
        }
        Resources resources = context.getResources();
        int iM3161b = m3161b(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return iM3161b != 0 && resources.getBoolean(iM3161b);
    }
}
