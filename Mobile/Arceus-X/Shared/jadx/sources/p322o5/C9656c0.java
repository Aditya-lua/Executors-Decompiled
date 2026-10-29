package p322o5;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: renamed from: o5.c0 */
/* JADX INFO: loaded from: classes.dex */
public class C9656c0 {

    /* JADX INFO: renamed from: a */
    public static final boolean f35032a;

    /* JADX INFO: renamed from: o5.c0$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static Bitmap m38153a(Picture picture) {
            return Bitmap.createBitmap(picture);
        }
    }

    /* JADX INFO: renamed from: o5.c0$b */
    public static class b implements TypeEvaluator<Matrix> {

        /* JADX INFO: renamed from: a */
        public final float[] f35033a = new float[9];

        /* JADX INFO: renamed from: b */
        public final float[] f35034b = new float[9];

        /* JADX INFO: renamed from: c */
        public final Matrix f35035c = new Matrix();

        /* JADX DEBUG: Method merged with bridge method: evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f35033a);
            matrix2.getValues(this.f35034b);
            for (int i10 = 0; i10 < 9; i10++) {
                float[] fArr = this.f35034b;
                float f11 = fArr[i10];
                float f12 = this.f35033a[i10];
                fArr[i10] = f12 + ((f11 - f12) * f10);
            }
            this.f35035c.setValues(this.f35034b);
            return this.f35035c;
        }
    }

    static {
        f35032a = Build.VERSION.SDK_INT >= 28;
    }

    /* JADX INFO: renamed from: a */
    public static View m38150a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        C9668i0.m38195g(view, matrix);
        C9668i0.m38196h(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int iRound = Math.round(rectF.left);
        int iRound2 = Math.round(rectF.top);
        int iRound3 = Math.round(rectF.right);
        int iRound4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap bitmapM38151b = m38151b(view, matrix, rectF, viewGroup);
        if (bitmapM38151b != null) {
            imageView.setImageBitmap(bitmapM38151b);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
        imageView.layout(iRound, iRound2, iRound3, iRound4);
        return imageView;
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m38151b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        int iIndexOfChild;
        ViewGroup viewGroup2;
        boolean zIsAttachedToWindow = view.isAttachedToWindow();
        boolean z10 = viewGroup != null && viewGroup.isAttachedToWindow();
        Bitmap bitmapCreateBitmap = null;
        if (zIsAttachedToWindow) {
            iIndexOfChild = 0;
            viewGroup2 = null;
        } else {
            if (!z10) {
                return null;
            }
            viewGroup2 = (ViewGroup) view.getParent();
            iIndexOfChild = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        }
        int iRound = Math.round(rectF.width());
        int iRound2 = Math.round(rectF.height());
        if (iRound > 0 && iRound2 > 0) {
            float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound2));
            int iRound3 = Math.round(iRound * fMin);
            int iRound4 = Math.round(iRound2 * fMin);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(fMin, fMin);
            if (f35032a) {
                Picture picture = new Picture();
                Canvas canvasBeginRecording = picture.beginRecording(iRound3, iRound4);
                canvasBeginRecording.concat(matrix);
                view.draw(canvasBeginRecording);
                picture.endRecording();
                bitmapCreateBitmap = a.m38153a(picture);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(iRound3, iRound4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (!zIsAttachedToWindow) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, iIndexOfChild);
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: c */
    public static Animator m38152c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
