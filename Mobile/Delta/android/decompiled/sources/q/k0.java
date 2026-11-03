package q;

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

/* JADX INFO: loaded from: classes.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f29358a = {R.attr.state_checked};
    public static final int[] b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f29359c = new Rect();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final boolean f29360a;
        public static final Method b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Field f29361c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Field f29362d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Field f29363e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Field f29364f;

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
                            b = method;
                            f29361c = field;
                            f29362d = field2;
                            f29363e = field3;
                            f29364f = field4;
                            f29360a = true;
                            return;
                        }
                        b = null;
                        f29361c = null;
                        f29362d = null;
                        f29363e = null;
                        f29364f = null;
                        f29360a = false;
                    } catch (NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                            b = method;
                            f29361c = field;
                            f29362d = field2;
                            f29363e = field3;
                            f29364f = field4;
                            f29360a = true;
                            return;
                        }
                        b = null;
                        f29361c = null;
                        f29362d = null;
                        f29363e = null;
                        f29364f = null;
                        f29360a = false;
                    } catch (NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                            b = method;
                            f29361c = field;
                            f29362d = field2;
                            f29363e = field3;
                            f29364f = field4;
                            f29360a = true;
                            return;
                        }
                        b = null;
                        f29361c = null;
                        f29362d = null;
                        f29363e = null;
                        f29364f = null;
                        f29360a = false;
                    }
                } catch (ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        b = method;
                        f29361c = field;
                        f29362d = field2;
                        f29363e = field3;
                        f29364f = field4;
                        f29360a = true;
                        return;
                    }
                    b = null;
                    f29361c = null;
                    f29362d = null;
                    f29363e = null;
                    f29364f = null;
                    f29360a = false;
                } catch (NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        b = method;
                        f29361c = field;
                        f29362d = field2;
                        f29363e = field3;
                        f29364f = field4;
                        f29360a = true;
                        return;
                    }
                    b = null;
                    f29361c = null;
                    f29362d = null;
                    f29363e = null;
                    f29364f = null;
                    f29360a = false;
                } catch (NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        b = method;
                        f29361c = field;
                        f29362d = field2;
                        f29363e = field3;
                        f29364f = field4;
                        f29360a = true;
                        return;
                    }
                    b = null;
                    f29361c = null;
                    f29362d = null;
                    f29363e = null;
                    f29364f = null;
                    f29360a = false;
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
                b = method;
                f29361c = field;
                f29362d = field2;
                f29363e = field3;
                f29364f = field4;
                f29360a = true;
                return;
            }
            b = null;
            f29361c = null;
            f29362d = null;
            f29363e = null;
            f29364f = null;
            f29360a = false;
        }

        @NonNull
        public static Rect a(@NonNull Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f29360a) {
                try {
                    Object objInvoke = b.invoke(drawable, null);
                    if (objInvoke != null) {
                        return new Rect(f29361c.getInt(objInvoke), f29362d.getInt(objInvoke), f29363e.getInt(objInvoke), f29364f.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return k0.f29359c;
        }
    }

    public static class b {
        public static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    @Deprecated
    public static boolean a(@NonNull Drawable drawable) {
        return true;
    }

    public static void b(@NonNull Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || i10 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        c(drawable);
    }

    public static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f29358a);
        } else {
            drawable.setState(b);
        }
        drawable.setState(state);
    }

    @NonNull
    public static Rect d(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return a.a(q2.a.q(drawable));
        }
        Insets insetsA = b.a(drawable);
        return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
    }

    public static PorterDuff.Mode e(int i10, PorterDuff.Mode mode) {
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
