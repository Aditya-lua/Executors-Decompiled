package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import u1.d;
import v1.b;
import v1.c;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f1476h = {R.attr.colorBackground};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f1477i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1478a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f1481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f1482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f1483g;

    public class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f1484a;

        public a() {
        }

        @Override // v1.b
        public void a(int i10, int i11, int i12, int i13) {
            CardView.this.f1482f.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1481e;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // v1.b
        public void b(Drawable drawable) {
            this.f1484a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // v1.b
        public boolean c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // v1.b
        public Drawable d() {
            return this.f1484a;
        }

        @Override // v1.b
        public boolean e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // v1.b
        public View f() {
            return CardView.this;
        }
    }

    static {
        v1.a aVar = new v1.a();
        f1477i = aVar;
        aVar.o();
    }

    public CardView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u1.a.f32012a);
    }

    public void d(int i10, int i11, int i12, int i13) {
        this.f1481e.set(i10, i11, i12, i13);
        f1477i.l(this.f1483g);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return f1477i.g(this.f1483g);
    }

    public float getCardElevation() {
        return f1477i.d(this.f1483g);
    }

    public int getContentPaddingBottom() {
        return this.f1481e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1481e.left;
    }

    public int getContentPaddingRight() {
        return this.f1481e.right;
    }

    public int getContentPaddingTop() {
        return this.f1481e.top;
    }

    public float getMaxCardElevation() {
        return f1477i.i(this.f1483g);
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return f1477i.a(this.f1483g);
    }

    public boolean getUseCompatPadding() {
        return this.f1478a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        c cVar = f1477i;
        if (cVar instanceof v1.a) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cVar.b(this.f1483g)), View.MeasureSpec.getSize(i10)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cVar.h(this.f1483g)), View.MeasureSpec.getSize(i11)), mode2);
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f1477i.c(this.f1483g, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f1477i.k(this.f1483g, f10);
    }

    public void setMaxCardElevation(float f10) {
        f1477i.f(this.f1483g, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f1480d = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f1479c = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.b) {
            this.b = z10;
            f1477i.j(this.f1483g);
        }
    }

    public void setRadius(float f10) {
        f1477i.n(this.f1483g, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f1478a != z10) {
            this.f1478a = z10;
            f1477i.m(this.f1483g);
        }
    }

    public CardView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i10);
        Rect rect = new Rect();
        this.f1481e = rect;
        this.f1482f = new Rect();
        a aVar = new a();
        this.f1483g = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f32015a, i10, u1.c.f32014a);
        int i11 = d.f32017d;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i11);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f1476h);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(u1.b.b) : getResources().getColor(u1.b.f32013a));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(d.f32018e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(d.f32019f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(d.f32020g, 0.0f);
        this.f1478a = typedArrayObtainStyledAttributes.getBoolean(d.f32022i, false);
        this.b = typedArrayObtainStyledAttributes.getBoolean(d.f32021h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.f32023j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.f32025l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.f32027n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.f32026m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.f32024k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1479c = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.b, 0);
        this.f1480d = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.f32016c, 0);
        typedArrayObtainStyledAttributes.recycle();
        f1477i.e(aVar, context, colorStateList, dimension, dimension2, f10);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1477i.c(this.f1483g, colorStateList);
    }
}
