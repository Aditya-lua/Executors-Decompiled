package p322o5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: renamed from: o5.d */
/* JADX INFO: loaded from: classes.dex */
public class C9657d extends AbstractC9683q {

    /* JADX INFO: renamed from: Q */
    public static final String[] f35036Q = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* JADX INFO: renamed from: R */
    public static final TypeEvaluator<Matrix> f35037R = new a();

    /* JADX INFO: renamed from: S */
    public static final Property<ImageView, Matrix> f35038S = new b(Matrix.class, "animatedTransform");

    /* JADX INFO: renamed from: o5.d$a */
    public class a implements TypeEvaluator<Matrix> {
        /* JADX DEBUG: Method merged with bridge method: evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: o5.d$b */
    public class b extends Property<ImageView, Matrix> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix get(ImageView imageView) {
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ImageView imageView, Matrix matrix) {
            C9665h.m38181a(imageView, matrix);
        }
    }

    /* JADX INFO: renamed from: o5.d$c */
    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35039a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f35039a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35039a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: o5.d$d */
    public static class d extends AnimatorListenerAdapter implements AbstractC9683q.h {

        /* JADX INFO: renamed from: a */
        public final ImageView f35040a;

        /* JADX INFO: renamed from: b */
        public final Matrix f35041b;

        /* JADX INFO: renamed from: c */
        public final Matrix f35042c;

        /* JADX INFO: renamed from: d */
        public boolean f35043d = true;

        public d(ImageView imageView, Matrix matrix, Matrix matrix2) {
            this.f35040a = imageView;
            this.f35041b = matrix;
            this.f35042c = matrix2;
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: a */
        public void mo38105a(@NonNull AbstractC9683q abstractC9683q) {
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: b */
        public void mo38106b(@NonNull AbstractC9683q abstractC9683q) {
            m38164c();
        }

        /* JADX INFO: renamed from: c */
        public final void m38164c() {
            ImageView imageView = this.f35040a;
            int i10 = C9673l.f35097d;
            Matrix matrix = (Matrix) imageView.getTag(i10);
            if (matrix != null) {
                C9665h.m38181a(this.f35040a, matrix);
                this.f35040a.setTag(i10, null);
            }
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: d */
        public void mo38107d(@NonNull AbstractC9683q abstractC9683q) {
            if (this.f35043d) {
                m38165e(this.f35041b);
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m38165e(Matrix matrix) {
            this.f35040a.setTag(C9673l.f35097d, matrix);
            C9665h.m38181a(this.f35040a, this.f35042c);
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: g */
        public void mo38108g(@NonNull AbstractC9683q abstractC9683q) {
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: k */
        public void mo38109k(@NonNull AbstractC9683q abstractC9683q) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            this.f35043d = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            m38165e((Matrix) ((ObjectAnimator) animator).getAnimatedValue());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            m38164c();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z10) {
            this.f35043d = false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f35043d = false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f35043d = false;
        }
    }

    /* JADX INFO: renamed from: B0 */
    private void m38155B0(C9658d0 c9658d0, boolean z10) {
        View view = c9658d0.f35045b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = c9658d0.f35044a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrixM38157D0 = z10 ? (Matrix) imageView.getTag(C9673l.f35097d) : null;
            if (matrixM38157D0 == null) {
                matrixM38157D0 = m38157D0(imageView);
            }
            map.put("android:changeImageTransform:matrix", matrixM38157D0);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public static Matrix m38156C0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f10 = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f11 = intrinsicHeight;
        float fMax = Math.max(width / f10, height / f11);
        int iRound = Math.round((width - (f10 * fMax)) / 2.0f);
        int iRound2 = Math.round((height - (f11 * fMax)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(iRound, iRound2);
        return matrix;
    }

    @NonNull
    /* JADX INFO: renamed from: D0 */
    public static Matrix m38157D0(@NonNull ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return new Matrix(imageView.getImageMatrix());
        }
        int i10 = c.f35039a[imageView.getScaleType().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? new Matrix(imageView.getImageMatrix()) : m38156C0(imageView);
        }
        return m38158G0(imageView);
    }

    /* JADX INFO: renamed from: G0 */
    public static Matrix m38158G0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    /* JADX INFO: renamed from: E0 */
    public final ObjectAnimator m38159E0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) f35038S, (TypeEvaluator) new C9656c0.b(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    @NonNull
    /* JADX INFO: renamed from: F0 */
    public final ObjectAnimator m38160F0(@NonNull ImageView imageView) {
        Property<ImageView, Matrix> property = f35038S;
        TypeEvaluator<Matrix> typeEvaluator = f35037R;
        Matrix matrix = C9667i.f35085a;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    @Override // p322o5.AbstractC9683q
    @NonNull
    /* JADX INFO: renamed from: V */
    public String[] mo38090V() {
        return f35036Q;
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: Y */
    public boolean mo38091Y() {
        return true;
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: j */
    public void mo38092j(@NonNull C9658d0 c9658d0) {
        m38155B0(c9658d0, false);
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: o */
    public void mo38093o(@NonNull C9658d0 c9658d0) {
        m38155B0(c9658d0, true);
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: s */
    public Animator mo38094s(@NonNull ViewGroup viewGroup, C9658d0 c9658d0, C9658d0 c9658d1) {
        if (c9658d0 == null || c9658d1 == null) {
            return null;
        }
        Rect rect = (Rect) c9658d0.f35044a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) c9658d1.f35044a.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) c9658d0.f35044a.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) c9658d1.f35044a.get("android:changeImageTransform:matrix");
        boolean z10 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z10) {
            return null;
        }
        ImageView imageView = (ImageView) c9658d1.f35045b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return m38160F0(imageView);
        }
        if (matrix == null) {
            matrix = C9667i.f35085a;
        }
        if (matrix2 == null) {
            matrix2 = C9667i.f35085a;
        }
        f35038S.set(imageView, matrix);
        ObjectAnimator objectAnimatorM38159E0 = m38159E0(imageView, matrix, matrix2);
        d dVar = new d(imageView, matrix, matrix2);
        objectAnimatorM38159E0.addListener(dVar);
        objectAnimatorM38159E0.addPauseListener(dVar);
        mo38129c(dVar);
        return objectAnimatorM38159E0;
    }
}
