package p365q;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p368q2.C10425a;

/* JADX INFO: renamed from: q.k0 */
/* JADX INFO: loaded from: classes.dex */
public class C10384k0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f37341a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b */
    public static final int[] f37342b = new int[0];

    /* JADX INFO: renamed from: c */
    public static final Rect f37343c = new Rect();

    /* JADX INFO: renamed from: q.k0$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final boolean f37344a;

        /* JADX INFO: renamed from: b */
        public static final Method f37345b;

        /* JADX INFO: renamed from: c */
        public static final Field f37346c;

        /* JADX INFO: renamed from: d */
        public static final Field f37347d;

        /* JADX INFO: renamed from: e */
        public static final Field f37348e;

        /* JADX INFO: renamed from: f */
        public static final Field f37349f;

        /* JADX WARN: Code duplicated, block: B:25:0x004a  */
        /* JADX WARN: Code duplicated, block: B:26:0x0057  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z10;
            try {
                Class<?> cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", null);
                try {
                    field = cls.getField("left");
                    try {
                        field2 = cls.getField("top");
                        try {
                            field3 = cls.getField("right");
                            try {
                                field4 = cls.getField("bottom");
                                z10 = true;
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                field4 = null;
                                z10 = false;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                            field3 = null;
                        }
                    } catch (ClassNotFoundException unused3) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                            f37345b = method;
                            f37346c = field;
                            f37347d = field2;
                            f37348e = field3;
                            f37349f = field4;
                            f37344a = true;
                            return;
                        }
                        f37345b = null;
                        f37346c = null;
                        f37347d = null;
                        f37348e = null;
                        f37349f = null;
                        f37344a = false;
                    } catch (NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                            f37345b = method;
                            f37346c = field;
                            f37347d = field2;
                            f37348e = field3;
                            f37349f = field4;
                            f37344a = true;
                            return;
                        }
                        f37345b = null;
                        f37346c = null;
                        f37347d = null;
                        f37348e = null;
                        f37349f = null;
                        f37344a = false;
                    } catch (NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                            f37345b = method;
                            f37346c = field;
                            f37347d = field2;
                            f37348e = field3;
                            f37349f = field4;
                            f37344a = true;
                            return;
                        }
                        f37345b = null;
                        f37346c = null;
                        f37347d = null;
                        f37348e = null;
                        f37349f = null;
                        f37344a = false;
                    }
                } catch (ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f37345b = method;
                        f37346c = field;
                        f37347d = field2;
                        f37348e = field3;
                        f37349f = field4;
                        f37344a = true;
                        return;
                    }
                    f37345b = null;
                    f37346c = null;
                    f37347d = null;
                    f37348e = null;
                    f37349f = null;
                    f37344a = false;
                } catch (NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f37345b = method;
                        f37346c = field;
                        f37347d = field2;
                        f37348e = field3;
                        f37349f = field4;
                        f37344a = true;
                        return;
                    }
                    f37345b = null;
                    f37346c = null;
                    f37347d = null;
                    f37348e = null;
                    f37349f = null;
                    f37344a = false;
                } catch (NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f37345b = method;
                        f37346c = field;
                        f37347d = field2;
                        f37348e = field3;
                        f37349f = field4;
                        f37344a = true;
                        return;
                    }
                    f37345b = null;
                    f37346c = null;
                    f37347d = null;
                    f37348e = null;
                    f37349f = null;
                    f37344a = false;
                }
            } catch (ClassNotFoundException unused9) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused10) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused11) {
                method = null;
                field = null;
            }
            if (z10) {
                f37345b = method;
                f37346c = field;
                f37347d = field2;
                f37348e = field3;
                f37349f = field4;
                f37344a = true;
                return;
            }
            f37345b = null;
            f37346c = null;
            f37347d = null;
            f37348e = null;
            f37349f = null;
            f37344a = false;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public static Rect m39888a(@NonNull Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f37344a) {
                try {
                    Object objInvoke = f37345b.invoke(drawable, null);
                    if (objInvoke != null) {
                        return new Rect(f37346c.getInt(objInvoke), f37347d.getInt(objInvoke), f37348e.getInt(objInvoke), f37349f.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return C10384k0.f37343c;
        }
    }

    /* JADX INFO: renamed from: q.k0$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static Insets m39889a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static boolean m39883a(@NonNull Drawable drawable) {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static void m39884b(@NonNull Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || i10 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        m39885c(drawable);
    }

    /* JADX INFO: renamed from: c */
    public static void m39885c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f37341a);
        } else {
            drawable.setState(f37342b);
        }
        drawable.setState(state);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static Rect m39886d(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return a.m39888a(C10425a.m40120q(drawable));
        }
        Insets insetsM39889a = b.m39889a(drawable);
        return new Rect(insetsM39889a.left, insetsM39889a.top, insetsM39889a.right, insetsM39889a.bottom);
    }

    /* JADX INFO: renamed from: e */
    public static PorterDuff.Mode m39887e(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
