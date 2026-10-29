package p286m5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.C0625o0;
import p264l5.C8000a;

/* JADX INFO: renamed from: m5.a */
/* JADX INFO: loaded from: classes.dex */
public class C8424a extends ImageView {

    /* JADX INFO: renamed from: a */
    public Animation.AnimationListener f31042a;

    /* JADX INFO: renamed from: b */
    public int f31043b;

    /* JADX INFO: renamed from: c */
    public int f31044c;

    /* JADX INFO: renamed from: m5.a$a */
    public static class a extends OvalShape {

        /* JADX INFO: renamed from: a */
        public Paint f31045a = new Paint();

        /* JADX INFO: renamed from: b */
        public int f31046b;

        /* JADX INFO: renamed from: c */
        public C8424a f31047c;

        public a(C8424a c8424a, int i10) {
            this.f31047c = c8424a;
            this.f31046b = i10;
            m34138a((int) rect().width());
        }

        /* JADX INFO: renamed from: a */
        public final void m34138a(int i10) {
            float f10 = i10 / 2;
            this.f31045a.setShader(new RadialGradient(f10, f10, this.f31046b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width = this.f31047c.getWidth() / 2;
            float f10 = width;
            float height = this.f31047c.getHeight() / 2;
            canvas.drawCircle(f10, height, f10, this.f31045a);
            canvas.drawCircle(f10, height, width - this.f31046b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            m34138a((int) f10);
        }
    }

    public C8424a(Context context) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int i10 = (int) (1.75f * f10);
        int i11 = (int) (0.0f * f10);
        this.f31043b = (int) (3.5f * f10);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(C8000a.f29923a);
        this.f31044c = typedArrayObtainStyledAttributes.getColor(C8000a.f29924b, -328966);
        typedArrayObtainStyledAttributes.recycle();
        if (m34136a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0625o0.m3056u0(this, f10 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this, this.f31043b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f31043b, i11, i10, 503316480);
            int i12 = this.f31043b;
            setPadding(i12, i12, i12, i12);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f31044c);
        setBackground(shapeDrawable);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m34136a() {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m34137b(Animation.AnimationListener animationListener) {
        this.f31042a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f31042a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f31042a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (m34136a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f31043b * 2), getMeasuredHeight() + (this.f31043b * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
            this.f31044c = i10;
        }
    }
}
