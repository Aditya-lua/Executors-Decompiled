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
import dd.c;
import gd.g;
import gd.k;
import gd.l;
import gd.n;
import hc.j;
import q.q;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeableImageView extends q implements n {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f8006v = j.B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f8007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f8008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f8009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f8010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f8011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Path f8012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f8013j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f8014k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k f8015l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f8016m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Path f8017n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8018o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8019p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8020q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8021r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8022s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8023t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8024u;

    @TargetApi(21)
    public class a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f8025a = new Rect();

        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f8015l == null) {
                return;
            }
            if (ShapeableImageView.this.f8014k == null) {
                ShapeableImageView.this.f8014k = new g(ShapeableImageView.this.f8015l);
            }
            ShapeableImageView.this.f8008e.round(this.f8025a);
            ShapeableImageView.this.f8014k.setBounds(this.f8025a);
            ShapeableImageView.this.f8014k.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    private boolean i() {
        return getLayoutDirection() == 1;
    }

    public final void g(Canvas canvas) {
        if (this.f8013j == null) {
            return;
        }
        this.f8010g.setStrokeWidth(this.f8016m);
        int colorForState = this.f8013j.getColorForState(getDrawableState(), this.f8013j.getDefaultColor());
        if (this.f8016m <= 0.0f || colorForState == 0) {
            return;
        }
        this.f8010g.setColor(colorForState);
        canvas.drawPath(this.f8012i, this.f8010g);
    }

    public int getContentPaddingBottom() {
        return this.f8021r;
    }

    public final int getContentPaddingEnd() {
        int i10 = this.f8023t;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return i() ? this.f8018o : this.f8020q;
    }

    public int getContentPaddingLeft() {
        int i10;
        int i11;
        if (h()) {
            if (i() && (i11 = this.f8023t) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!i() && (i10 = this.f8022s) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f8018o;
    }

    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (h()) {
            if (i() && (i11 = this.f8022s) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!i() && (i10 = this.f8023t) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f8020q;
    }

    public final int getContentPaddingStart() {
        int i10 = this.f8022s;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return i() ? this.f8020q : this.f8018o;
    }

    public int getContentPaddingTop() {
        return this.f8019p;
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
        return this.f8015l;
    }

    public ColorStateList getStrokeColor() {
        return this.f8013j;
    }

    public float getStrokeWidth() {
        return this.f8016m;
    }

    public final boolean h() {
        return (this.f8022s == Integer.MIN_VALUE && this.f8023t == Integer.MIN_VALUE) ? false : true;
    }

    public final void j(int i10, int i11) {
        this.f8008e.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        this.f8007d.d(this.f8015l, 1.0f, this.f8008e, this.f8012i);
        this.f8017n.rewind();
        this.f8017n.addPath(this.f8012i);
        this.f8009f.set(0.0f, 0.0f, i10, i11);
        this.f8017n.addRect(this.f8009f, Path.Direction.CCW);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f8017n, this.f8011h);
        g(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f8024u && isLayoutDirectionResolved()) {
            this.f8024u = true;
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

    @Override // gd.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        this.f8015l = kVar;
        g gVar = this.f8014k;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        j(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f8013j = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i10) {
        setStrokeColor(k.a.a(getContext(), i10));
    }

    public void setStrokeWidth(float f10) {
        if (this.f8016m != f10) {
            this.f8016m = f10;
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
        int i11 = f8006v;
        super(ld.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f8007d = l.k();
        this.f8012i = new Path();
        this.f8024u = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f8011h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f8008e = new RectF();
        this.f8009f = new RectF();
        this.f8017n = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, hc.k.f19135t5, i10, i11);
        setLayerType(2, null);
        this.f8013j = c.a(context2, typedArrayObtainStyledAttributes, hc.k.B5);
        this.f8016m = typedArrayObtainStyledAttributes.getDimensionPixelSize(hc.k.C5, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(hc.k.f19144u5, 0);
        this.f8018o = dimensionPixelSize;
        this.f8019p = dimensionPixelSize;
        this.f8020q = dimensionPixelSize;
        this.f8021r = dimensionPixelSize;
        this.f8018o = typedArrayObtainStyledAttributes.getDimensionPixelSize(hc.k.f19169x5, dimensionPixelSize);
        this.f8019p = typedArrayObtainStyledAttributes.getDimensionPixelSize(hc.k.A5, dimensionPixelSize);
        this.f8020q = typedArrayObtainStyledAttributes.getDimensionPixelSize(hc.k.f19178y5, dimensionPixelSize);
        this.f8021r = typedArrayObtainStyledAttributes.getDimensionPixelSize(hc.k.v5, dimensionPixelSize);
        this.f8022s = typedArrayObtainStyledAttributes.getDimensionPixelSize(hc.k.f19187z5, Integer.MIN_VALUE);
        this.f8023t = typedArrayObtainStyledAttributes.getDimensionPixelSize(hc.k.w5, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f8010g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f8015l = k.e(context2, attributeSet, i10, i11).m();
        setOutlineProvider(new a());
    }
}
