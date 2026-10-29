package o5;

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
        public static final /* synthetic */ int[] f27085a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f27085a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27085a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: o5.d$d, reason: collision with other inner class name */
    public static class C0468d extends AnimatorListenerAdapter implements q.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f27086a;
        public final Matrix b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Matrix f27087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f27088d = true;

        public C0468d(ImageView imageView, Matrix matrix, Matrix matrix2) {
            this.f27086a = imageView;
            this.b = matrix;
            this.f27087c = matrix2;
        }

        @Override // o5.q.h
        public void a(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void b(@NonNull q qVar) {
            c();
        }

        public final void c() {
            ImageView imageView = this.f27086a;
            int i10 = l.f27128d;
            Matrix matrix = (Matrix) imageView.getTag(i10);
            if (matrix != null) {
                h.a(this.f27086a, matrix);
                this.f27086a.setTag(i10, null);
            }
        }

        @Override // o5.q.h
        public void d(@NonNull q qVar) {
            if (this.f27088d) {
                e(this.b);
            }
        }

        public final void e(Matrix matrix) {
            this.f27086a.setTag(l.f27128d, matrix);
            h.a(this.f27086a, this.f27087c);
        }

        @Override // o5.q.h
        public void g(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void k(@NonNull q qVar) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            this.f27088d = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            e((Matrix) ((ObjectAnimator) animator).getAnimatedValue());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            c();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z10) {
            this.f27088d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f27088d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f27088d = false;
        }
    }

    private void B0(d0 d0Var, boolean z10) {
        View view = d0Var.b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = d0Var.f27089a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrixD0 = z10 ? (Matrix) imageView.getTag(l.f27128d) : null;
            if (matrixD0 == null) {
                matrixD0 = D0(imageView);
            }
            map.put("android:changeImageTransform:matrix", matrixD0);
        }
    }

    public static Matrix C0(ImageView imageView) {
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
    public static Matrix D0(@NonNull ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return new Matrix(imageView.getImageMatrix());
        }
        int i10 = c.f27085a[imageView.getScaleType().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? new Matrix(imageView.getImageMatrix()) : C0(imageView);
        }
        return G0(imageView);
    }

    public static Matrix G0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    public final ObjectAnimator E0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) S, (TypeEvaluator) new c0.b(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    @NonNull
    public final ObjectAnimator F0(@NonNull ImageView imageView) {
        Property<ImageView, Matrix> property = S;
        TypeEvaluator<Matrix> typeEvaluator = R;
        Matrix matrix = i.f27119a;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    @Override // o5.q
    @NonNull
    public String[] V() {
        return Q;
    }

    @Override // o5.q
    public boolean Y() {
        return true;
    }

    @Override // o5.q
    public void j(@NonNull d0 d0Var) {
        B0(d0Var, false);
    }

    @Override // o5.q
    public void o(@NonNull d0 d0Var) {
        B0(d0Var, true);
    }

    @Override // o5.q
    public Animator s(@NonNull ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        if (d0Var == null || d0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) d0Var.f27089a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) d0Var2.f27089a.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) d0Var.f27089a.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) d0Var2.f27089a.get("android:changeImageTransform:matrix");
        boolean z10 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z10) {
            return null;
        }
        ImageView imageView = (ImageView) d0Var2.b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return F0(imageView);
        }
        if (matrix == null) {
            matrix = i.f27119a;
        }
        if (matrix2 == null) {
            matrix2 = i.f27119a;
        }
        S.set(imageView, matrix);
        ObjectAnimator objectAnimatorE0 = E0(imageView, matrix, matrix2);
        C0468d c0468d = new C0468d(imageView, matrix, matrix2);
        objectAnimatorE0.addListener(c0468d);
        objectAnimatorE0.addPauseListener(c0468d);
        c(c0468d);
        return objectAnimatorE0;
    }
}
