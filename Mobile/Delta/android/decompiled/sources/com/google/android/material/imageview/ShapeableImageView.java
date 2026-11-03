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
import ed.c;
import hd.g;
import hd.k;
import hd.l;
import hd.n;
import ic.j;
import q.q;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeableImageView extends q implements n {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f8080v = j.B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f8081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f8082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f8083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f8084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f8085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Path f8086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f8087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f8088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k f8089l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f8090m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Path f8091n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8092o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8093p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8094q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8095r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8096s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8097t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8098u;

    @TargetApi(21)
    public class a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f8099a = new Rect();

        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f8089l == null) {
                return;
            }
            if (ShapeableImageView.this.f8088k == null) {
                ShapeableImageView.this.f8088k = new g(ShapeableImageView.this.f8089l);
            }
            ShapeableImageView.this.f8082e.round(this.f8099a);
            ShapeableImageView.this.f8088k.setBounds(this.f8099a);
            ShapeableImageView.this.f8088k.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    private boolean i() {
        return getLayoutDirection() == 1;
    }

    public final void g(Canvas canvas) {
        if (this.f8087j == null) {
            return;
        }
        this.f8084g.setStrokeWidth(this.f8090m);
        int colorForState = this.f8087j.getColorForState(getDrawableState(), this.f8087j.getDefaultColor());
        if (this.f8090m <= 0.0f || colorForState == 0) {
            return;
        }
        this.f8084g.setColor(colorForState);
        canvas.drawPath(this.f8086i, this.f8084g);
    }

    public int getContentPaddingBottom() {
        return this.f8095r;
    }

    public final int getContentPaddingEnd() {
        int i10 = this.f8097t;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return i() ? this.f8092o : this.f8094q;
    }

    public int getContentPaddingLeft() {
        int i10;
        int i11;
        if (h()) {
            if (i() && (i11 = this.f8097t) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!i() && (i10 = this.f8096s) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f8092o;
    }

    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (h()) {
            if (i() && (i11 = this.f8096s) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!i() && (i10 = this.f8097t) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f8094q;
    }

    public final int getContentPaddingStart() {
        int i10 = this.f8096s;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return i() ? this.f8094q : this.f8092o;
    }

    public int getContentPaddingTop() {
        return this.f8093p;
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
        return this.f8089l;
    }

    public ColorStateList getStrokeColor() {
        return this.f8087j;
    }

    public float getStrokeWidth() {
        return this.f8090m;
    }

    public final boolean h() {
        return (this.f8096s == Integer.MIN_VALUE && this.f8097t == Integer.MIN_VALUE) ? false : true;
    }

    public final void j(int i10, int i11) {
        this.f8082e.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        this.f8081d.d(this.f8089l, 1.0f, this.f8082e, this.f8086i);
        this.f8091n.rewind();
        this.f8091n.addPath(this.f8086i);
        this.f8083f.set(0.0f, 0.0f, i10, i11);
        this.f8091n.addRect(this.f8083f, Path.Direction.CCW);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f8091n, this.f8085h);
        g(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f8098u && isLayoutDirectionResolved()) {
            this.f8098u = true;
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

    @Override // hd.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        this.f8089l = kVar;
        g gVar = this.f8088k;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        j(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f8087j = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i10) {
        setStrokeColor(k.a.a(getContext(), i10));
    }

    public void setStrokeWidth(float f10) {
        if (this.f8090m != f10) {
            this.f8090m = f10;
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
        int i11 = f8080v;
        super(md.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f8081d = l.k();
        this.f8086i = new Path();
        this.f8098u = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f8085h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f8082e = new RectF();
        this.f8083f = new RectF();
        this.f8091n = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ic.k.f20957t5, i10, i11);
        setLayerType(2, null);
        this.f8087j = c.a(context2, typedArrayObtainStyledAttributes, ic.k.B5);
        this.f8090m = typedArrayObtainStyledAttributes.getDimensionPixelSize(ic.k.C5, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(ic.k.f20966u5, 0);
        this.f8092o = dimensionPixelSize;
        this.f8093p = dimensionPixelSize;
        this.f8094q = dimensionPixelSize;
        this.f8095r = dimensionPixelSize;
        this.f8092o = typedArrayObtainStyledAttributes.getDimensionPixelSize(ic.k.f20991x5, dimensionPixelSize);
        this.f8093p = typedArrayObtainStyledAttributes.getDimensionPixelSize(ic.k.A5, dimensionPixelSize);
        this.f8094q = typedArrayObtainStyledAttributes.getDimensionPixelSize(ic.k.f21000y5, dimensionPixelSize);
        this.f8095r = typedArrayObtainStyledAttributes.getDimensionPixelSize(ic.k.v5, dimensionPixelSize);
        this.f8096s = typedArrayObtainStyledAttributes.getDimensionPixelSize(ic.k.f21009z5, Integer.MIN_VALUE);
        this.f8097t = typedArrayObtainStyledAttributes.getDimensionPixelSize(ic.k.w5, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f8084g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f8089l = k.e(context2, attributeSet, i10, i11).m();
        setOutlineProvider(new a());
    }
}
