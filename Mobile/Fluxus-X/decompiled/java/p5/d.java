package p5;

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

/* JADX INFO: loaded from: classes.dex */
public class d extends q {
    public static final String[] Q = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    public static final TypeEvaluator<Matrix> R = new a();
    public static final Property<ImageView, Matrix> S = new b(Matrix.class, "animatedTransform");

    public class a implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    public class b extends Property<ImageView, Matrix> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ImageView imageView, Matrix matrix) {
            h.a(imageView, matrix);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28821a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f28821a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28821a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: p5.d$d, reason: collision with other inner class name */
    public static class C0556d extends AnimatorListenerAdapter implements q.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f28822a;
        public final Matrix b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Matrix f28823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f28824d = true;

        public C0556d(ImageView imageView, Matrix matrix, Matrix matrix2) {
            this.f28822a = imageView;
            this.b = matrix;
            this.f28823c = matrix2;
        }

        public final void a() {
            Matrix matrix = (Matrix) this.f28822a.getTag(l.f28864d);
            if (matrix != null) {
                h.a(this.f28822a, matrix);
                this.f28822a.setTag(l.f28864d, null);
            }
        }

        @Override // p5.q.h
        public void b(@NonNull q qVar) {
        }

        @Override // p5.q.h
        public void c(@NonNull q qVar) {
        }

        public final void d(Matrix matrix) {
            this.f28822a.setTag(l.f28864d, matrix);
            h.a(this.f28822a, this.f28823c);
        }

        @Override // p5.q.h
        public void f(@NonNull q qVar) {
            if (this.f28824d) {
                d(this.b);
            }
        }

        @Override // p5.q.h
        public void h(@NonNull q qVar) {
            a();
        }

        @Override // p5.q.h
        public void k(@NonNull q qVar) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            this.f28824d = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            d((Matrix) ((ObjectAnimator) animator).getAnimatedValue());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z10) {
            this.f28824d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f28824d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f28824d = false;
        }
    }

    private void F0(d0 d0Var, boolean z10) {
        View view = d0Var.b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = d0Var.f28825a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrixH0 = z10 ? (Matrix) imageView.getTag(l.f28864d) : null;
            if (matrixH0 == null) {
                matrixH0 = H0(imageView);
            }
            map.put("android:changeImageTransform:matrix", matrixH0);
        }
    }

    public static Matrix G0(ImageView imageView) {
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
    public static Matrix H0(@NonNull ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return new Matrix(imageView.getImageMatrix());
        }
        int i10 = c.f28821a[imageView.getScaleType().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? new Matrix(imageView.getImageMatrix()) : G0(imageView);
        }
        return K0(imageView);
    }

    public static Matrix K0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    public final ObjectAnimator I0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) S, (TypeEvaluator) new c0.b(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    @NonNull
    public final ObjectAnimator J0(@NonNull ImageView imageView) {
        Property<ImageView, Matrix> property = S;
        TypeEvaluator<Matrix> typeEvaluator = R;
        Matrix matrix = i.f28855a;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    @Override // p5.q
    @NonNull
    public String[] Y() {
        return Q;
    }

    @Override // p5.q
    public boolean c0() {
        return true;
    }

    @Override // p5.q
    public void l(@NonNull d0 d0Var) {
        F0(d0Var, false);
    }

    @Override // p5.q
    public void q(@NonNull d0 d0Var) {
        F0(d0Var, true);
    }

    @Override // p5.q
    public Animator u(@NonNull ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        if (d0Var == null || d0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) d0Var.f28825a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) d0Var2.f28825a.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) d0Var.f28825a.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) d0Var2.f28825a.get("android:changeImageTransform:matrix");
        boolean z10 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z10) {
            return null;
        }
        ImageView imageView = (ImageView) d0Var2.b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return J0(imageView);
        }
        if (matrix == null) {
            matrix = i.f28855a;
        }
        if (matrix2 == null) {
            matrix2 = i.f28855a;
        }
        S.set(imageView, matrix);
        ObjectAnimator objectAnimatorI0 = I0(imageView, matrix, matrix2);
        C0556d c0556d = new C0556d(imageView, matrix, matrix2);
        objectAnimatorI0.addListener(c0556d);
        objectAnimatorI0.addPauseListener(c0556d);
        c(c0556d);
        return objectAnimatorI0;
    }
}
