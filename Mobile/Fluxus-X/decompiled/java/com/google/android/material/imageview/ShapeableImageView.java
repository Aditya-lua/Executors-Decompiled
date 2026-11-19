package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import fd.c;
import id.g;
import id.k;
import id.l;
import id.n;
import jc.j;
import q.q;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeableImageView extends q implements n {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f7924v = j.B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f7925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f7926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f7927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f7928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f7929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Path f7930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f7931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f7932k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k f7933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f7934m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Path f7935n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7936o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7937p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7938q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7939r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7940s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7941t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7942u;

    @TargetApi(21)
    public class a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f7943a = new Rect();

        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f7933l == null) {
                return;
            }
            if (ShapeableImageView.this.f7932k == null) {
                ShapeableImageView.this.f7932k = new g(ShapeableImageView.this.f7933l);
            }
            ShapeableImageView.this.f7926e.round(this.f7943a);
            ShapeableImageView.this.f7932k.setBounds(this.f7943a);
            ShapeableImageView.this.f7932k.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    private boolean i() {
        return getLayoutDirection() == 1;
    }

    public final void g(Canvas canvas) {
        if (this.f7931j == null) {
            return;
        }
        this.f7928g.setStrokeWidth(this.f7934m);
        int colorForState = this.f7931j.getColorForState(getDrawableState(), this.f7931j.getDefaultColor());
        if (this.f7934m <= 0.0f || colorForState == 0) {
            return;
        }
        this.f7928g.setColor(colorForState);
        canvas.drawPath(this.f7930i, this.f7928g);
    }

    public int getContentPaddingBottom() {
        return this.f7939r;
    }

    public final int getContentPaddingEnd() {
        int i10 = this.f7941t;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return i() ? this.f7936o : this.f7938q;
    }

    public int getContentPaddingLeft() {
        int i10;
        int i11;
        if (h()) {
            if (i() && (i11 = this.f7941t) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!i() && (i10 = this.f7940s) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f7936o;
    }

    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (h()) {
            if (i() && (i11 = this.f7940s) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!i() && (i10 = this.f7941t) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f7938q;
    }

    public final int getContentPaddingStart() {
        int i10 = this.f7940s;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return i() ? this.f7938q : this.f7936o;
    }

    public int getContentPaddingTop() {
        return this.f7937p;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @NonNull
    public k getShapeAppearanceModel() {
        return this.f7933l;
    }

    public ColorStateList getStrokeColor() {
        return this.f7931j;
    }

    public float getStrokeWidth() {
        return this.f7934m;
    }

    public final boolean h() {
        return (this.f7940s == Integer.MIN_VALUE && this.f7941t == Integer.MIN_VALUE) ? false : true;
    }

    public final void j(int i10, int i11) {
        this.f7926e.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        this.f7925d.d(this.f7933l, 1.0f, this.f7926e, this.f7930i);
        this.f7935n.rewind();
        this.f7935n.addPath(this.f7930i);
        this.f7927f.set(0.0f, 0.0f, i10, i11);
        this.f7935n.addRect(this.f7927f, Path.Direction.CCW);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f7935n, this.f7929h);
        g(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f7942u && isLayoutDirectionResolved()) {
            this.f7942u = true;
            if (isPaddingRelative() || h()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        j(i10, i11);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10 + getContentPaddingLeft(), i11 + getContentPaddingTop(), i12 + getContentPaddingRight(), i13 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10 + getContentPaddingStart(), i11 + getContentPaddingTop(), i12 + getContentPaddingEnd(), i13 + getContentPaddingBottom());
    }

    @Override // id.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        this.f7933l = kVar;
        g gVar = this.f7932k;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        j(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f7931j = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i10) {
        setStrokeColor(k.a.a(getContext(), i10));
    }

    public void setStrokeWidth(float f10) {
        if (this.f7934m != f10) {
            this.f7934m = f10;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i10) {
        setStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f7924v;
        super(od.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f7925d = l.k();
        this.f7930i = new Path();
        this.f7942u = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f7929h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f7926e = new RectF();
        this.f7927f = new RectF();
        this.f7935n = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, jc.k.f20645t5, i10, i11);
        setLayerType(2, null);
        this.f7931j = c.a(context2, typedArrayObtainStyledAttributes, jc.k.B5);
        this.f7934m = typedArrayObtainStyledAttributes.getDimensionPixelSize(jc.k.C5, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(jc.k.f20654u5, 0);
        this.f7936o = dimensionPixelSize;
        this.f7937p = dimensionPixelSize;
        this.f7938q = dimensionPixelSize;
        this.f7939r = dimensionPixelSize;
        this.f7936o = typedArrayObtainStyledAttributes.getDimensionPixelSize(jc.k.x5, dimensionPixelSize);
        this.f7937p = typedArrayObtainStyledAttributes.getDimensionPixelSize(jc.k.A5, dimensionPixelSize);
        this.f7938q = typedArrayObtainStyledAttributes.getDimensionPixelSize(jc.k.f20688y5, dimensionPixelSize);
        this.f7939r = typedArrayObtainStyledAttributes.getDimensionPixelSize(jc.k.f20663v5, dimensionPixelSize);
        this.f7940s = typedArrayObtainStyledAttributes.getDimensionPixelSize(jc.k.f20697z5, Integer.MIN_VALUE);
        this.f7941t = typedArrayObtainStyledAttributes.getDimensionPixelSize(jc.k.w5, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f7928g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f7933l = k.e(context2, attributeSet, i10, i11).m();
        setOutlineProvider(new a());
    }
}
