package n5;

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
import androidx.core.view.o0;

/* JADX INFO: loaded from: classes.dex */
public class a extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Animation.AnimationListener f25343a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25344c;

    /* JADX INFO: renamed from: n5.a$a, reason: collision with other inner class name */
    public static class C0492a extends OvalShape {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Paint f25345a = new Paint();
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f25346c;

        public C0492a(a aVar, int i10) {
            this.f25346c = aVar;
            this.b = i10;
            a((int) rect().width());
        }

        public final void a(int i10) {
            float f10 = i10 / 2;
            this.f25345a.setShader(new RadialGradient(f10, f10, this.b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width = this.f25346c.getWidth() / 2;
            float f10 = width;
            float height = this.f25346c.getHeight() / 2;
            canvas.drawCircle(f10, height, f10, this.f25345a);
            canvas.drawCircle(f10, height, width - this.b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            a((int) f10);
        }
    }

    public a(Context context) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int i10 = (int) (1.75f * f10);
        int i11 = (int) (0.0f * f10);
        this.b = (int) (3.5f * f10);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(m5.a.f22934a);
        this.f25344c = typedArrayObtainStyledAttributes.getColor(m5.a.b, -328966);
        typedArrayObtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            o0.u0(this, f10 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0492a(this, this.b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.b, i11, i10, 503316480);
            int i12 = this.b;
            setPadding(i12, i12, i12, i12);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f25344c);
        setBackground(shapeDrawable);
    }

    public final boolean a() {
        return true;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f25343a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f25343a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f25343a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.b * 2), getMeasuredHeight() + (this.b * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
            this.f25344c = i10;
        }
    }
}
