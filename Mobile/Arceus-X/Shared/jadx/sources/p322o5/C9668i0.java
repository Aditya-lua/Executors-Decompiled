package p322o5;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: o5.i0 */
/* JADX INFO: loaded from: classes.dex */
public class C9668i0 {

    /* JADX INFO: renamed from: a */
    public static final C9670j0 f35086a;

    /* JADX INFO: renamed from: b */
    public static final Property<View, Float> f35087b;

    /* JADX INFO: renamed from: c */
    public static final Property<View, Rect> f35088c;

    /* JADX INFO: renamed from: o5.i0$a */
    public class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(C9668i0.m38190b(view));
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            C9668i0.m38193e(view, f10.floatValue());
        }
    }

    /* JADX INFO: renamed from: o5.i0$b */
    public class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f35086a = new C9678n0();
        } else {
            f35086a = new C9676m0();
        }
        f35087b = new a(Float.class, "translationAlpha");
        f35088c = new b(Rect.class, "clipBounds");
    }

    /* JADX INFO: renamed from: a */
    public static void m38189a(@NonNull View view) {
        f35086a.m38203a(view);
    }

    /* JADX INFO: renamed from: b */
    public static float m38190b(@NonNull View view) {
        return f35086a.mo38204b(view);
    }

    /* JADX INFO: renamed from: c */
    public static void m38191c(@NonNull View view) {
        f35086a.m38205c(view);
    }

    /* JADX INFO: renamed from: d */
    public static void m38192d(@NonNull View view, int i10, int i11, int i12, int i13) {
        f35086a.mo38206d(view, i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: e */
    public static void m38193e(@NonNull View view, float f10) {
        f35086a.mo38207e(view, f10);
    }

    /* JADX INFO: renamed from: f */
    public static void m38194f(@NonNull View view, int i10) {
        f35086a.mo38208f(view, i10);
    }

    /* JADX INFO: renamed from: g */
    public static void m38195g(@NonNull View view, @NonNull Matrix matrix) {
        f35086a.mo38209g(view, matrix);
    }

    /* JADX INFO: renamed from: h */
    public static void m38196h(@NonNull View view, @NonNull Matrix matrix) {
        f35086a.mo38210h(view, matrix);
    }
}
