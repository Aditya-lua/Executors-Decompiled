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
import androidx.core.view.inputmethod.EditorInfoCompat;
import md.C8485a;
import p101ed.C5050c;
import p168hd.C6363g;
import p168hd.C6367k;
import p168hd.C6368l;
import p168hd.InterfaceC6370n;
import p194ic.C6746j;
import p194ic.C6747k;
import p232k.C7399a;
import p365q.C10395q;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeableImageView extends C10395q implements InterfaceC6370n {

    /* JADX INFO: renamed from: v */
    public static final int f10283v = C6746j.f26106B;

    /* JADX INFO: renamed from: d */
    public final C6368l f10284d;

    /* JADX INFO: renamed from: e */
    public final RectF f10285e;

    /* JADX INFO: renamed from: f */
    public final RectF f10286f;

    /* JADX INFO: renamed from: g */
    public final Paint f10287g;

    /* JADX INFO: renamed from: h */
    public final Paint f10288h;

    /* JADX INFO: renamed from: i */
    public final Path f10289i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f10290j;

    /* JADX INFO: renamed from: k */
    public C6363g f10291k;

    /* JADX INFO: renamed from: l */
    public C6367k f10292l;

    /* JADX INFO: renamed from: m */
    public float f10293m;

    /* JADX INFO: renamed from: n */
    public Path f10294n;

    /* JADX INFO: renamed from: o */
    public int f10295o;

    /* JADX INFO: renamed from: p */
    public int f10296p;

    /* JADX INFO: renamed from: q */
    public int f10297q;

    /* JADX INFO: renamed from: r */
    public int f10298r;

    /* JADX INFO: renamed from: s */
    public int f10299s;

    /* JADX INFO: renamed from: t */
    public int f10300t;

    /* JADX INFO: renamed from: u */
    public boolean f10301u;

    /* JADX INFO: renamed from: com.google.android.material.imageview.ShapeableImageView$a */
    @TargetApi(21)
    public class C2816a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final Rect f10302a = new Rect();

        public C2816a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f10292l == null) {
                return;
            }
            if (ShapeableImageView.this.f10291k == null) {
                ShapeableImageView.this.f10291k = new C6363g(ShapeableImageView.this.f10292l);
            }
            ShapeableImageView.this.f10285e.round(this.f10302a);
            ShapeableImageView.this.f10291k.setBounds(this.f10302a);
            ShapeableImageView.this.f10291k.getOutline(outline);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: renamed from: i */
    private boolean m12844i() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: g */
    public final void m12845g(Canvas canvas) {
        if (this.f10290j == null) {
            return;
        }
        this.f10287g.setStrokeWidth(this.f10293m);
        int colorForState = this.f10290j.getColorForState(getDrawableState(), this.f10290j.getDefaultColor());
        if (this.f10293m <= 0.0f || colorForState == 0) {
            return;
        }
        this.f10287g.setColor(colorForState);
        canvas.drawPath(this.f10289i, this.f10287g);
    }

    public int getContentPaddingBottom() {
        return this.f10298r;
    }

    public final int getContentPaddingEnd() {
        int i10 = this.f10300t;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return m12844i() ? this.f10295o : this.f10297q;
    }

    public int getContentPaddingLeft() {
        int i10;
        int i11;
        if (m12846h()) {
            if (m12844i() && (i11 = this.f10300t) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!m12844i() && (i10 = this.f10299s) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f10295o;
    }

    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (m12846h()) {
            if (m12844i() && (i11 = this.f10299s) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!m12844i() && (i10 = this.f10300t) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f10297q;
    }

    public final int getContentPaddingStart() {
        int i10 = this.f10299s;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return m12844i() ? this.f10297q : this.f10295o;
    }

    public int getContentPaddingTop() {
        return this.f10296p;
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
    public C6367k getShapeAppearanceModel() {
        return this.f10292l;
    }

    public ColorStateList getStrokeColor() {
        return this.f10290j;
    }

    public float getStrokeWidth() {
        return this.f10293m;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m12846h() {
        return (this.f10299s == Integer.MIN_VALUE && this.f10300t == Integer.MIN_VALUE) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public final void m12847j(int i10, int i11) {
        this.f10285e.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        this.f10284d.m27823d(this.f10292l, 1.0f, this.f10285e, this.f10289i);
        this.f10294n.rewind();
        this.f10294n.addPath(this.f10289i);
        this.f10286f.set(0.0f, 0.0f, i10, i11);
        this.f10294n.addRect(this.f10286f, Path.Direction.CCW);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f10294n, this.f10288h);
        m12845g(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f10301u && isLayoutDirectionResolved()) {
            this.f10301u = true;
            if (isPaddingRelative() || m12846h()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        m12847j(i10, i11);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10 + getContentPaddingLeft(), i11 + getContentPaddingTop(), i12 + getContentPaddingRight(), i13 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10 + getContentPaddingStart(), i11 + getContentPaddingTop(), i12 + getContentPaddingEnd(), i13 + getContentPaddingBottom());
    }

    @Override // p168hd.InterfaceC6370n
    public void setShapeAppearanceModel(@NonNull C6367k c6367k) {
        this.f10292l = c6367k;
        C6363g c6363g = this.f10291k;
        if (c6363g != null) {
            c6363g.setShapeAppearanceModel(c6367k);
        }
        m12847j(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f10290j = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i10) {
        setStrokeColor(C7399a.m30678a(getContext(), i10));
    }

    public void setStrokeWidth(float f10) {
        if (this.f10293m != f10) {
            this.f10293m = f10;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i10) {
        setStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f10283v;
        super(C8485a.m34268c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f10284d = C6368l.m27819k();
        this.f10289i = new Path();
        this.f10301u = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f10288h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f10285e = new RectF();
        this.f10286f = new RectF();
        this.f10294n = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C6747k.f26549t5, i10, i11);
        setLayerType(2, null);
        this.f10290j = C5050c.m23736a(context2, typedArrayObtainStyledAttributes, C6747k.f26150B5);
        this.f10293m = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6747k.f26159C5, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6747k.f26558u5, 0);
        this.f10295o = dimensionPixelSize;
        this.f10296p = dimensionPixelSize;
        this.f10297q = dimensionPixelSize;
        this.f10298r = dimensionPixelSize;
        this.f10295o = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6747k.f26585x5, dimensionPixelSize);
        this.f10296p = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6747k.f26141A5, dimensionPixelSize);
        this.f10297q = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6747k.f26594y5, dimensionPixelSize);
        this.f10298r = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6747k.f26567v5, dimensionPixelSize);
        this.f10299s = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6747k.f26603z5, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        this.f10300t = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6747k.f26576w5, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f10287g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f10292l = C6367k.m27766e(context2, attributeSet, i10, i11).m27806m();
        setOutlineProvider(new C2816a());
    }
}
