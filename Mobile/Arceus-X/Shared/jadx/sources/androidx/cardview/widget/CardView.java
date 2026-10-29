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
import p455u1.C11768a;
import p455u1.C11769b;
import p455u1.C11770c;
import p455u1.C11771d;
import p481v1.C11993a;
import p481v1.InterfaceC11994b;
import p481v1.InterfaceC11995c;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: h */
    public static final int[] f1915h = {R.attr.colorBackground};

    /* JADX INFO: renamed from: i */
    public static final InterfaceC11995c f1916i;

    /* JADX INFO: renamed from: a */
    public boolean f1917a;

    /* JADX INFO: renamed from: b */
    public boolean f1918b;

    /* JADX INFO: renamed from: c */
    public int f1919c;

    /* JADX INFO: renamed from: d */
    public int f1920d;

    /* JADX INFO: renamed from: e */
    public final Rect f1921e;

    /* JADX INFO: renamed from: f */
    public final Rect f1922f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC11994b f1923g;

    /* JADX INFO: renamed from: androidx.cardview.widget.CardView$a */
    public class C0509a implements InterfaceC11994b {

        /* JADX INFO: renamed from: a */
        public Drawable f1924a;

        public C0509a() {
        }

        @Override // p481v1.InterfaceC11994b
        /* JADX INFO: renamed from: a */
        public void mo2431a(int i10, int i11, int i12, int i13) {
            CardView.this.f1922f.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1921e;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // p481v1.InterfaceC11994b
        /* JADX INFO: renamed from: b */
        public void mo2432b(Drawable drawable) {
            this.f1924a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // p481v1.InterfaceC11994b
        /* JADX INFO: renamed from: c */
        public boolean mo2433c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // p481v1.InterfaceC11994b
        /* JADX INFO: renamed from: d */
        public Drawable mo2434d() {
            return this.f1924a;
        }

        @Override // p481v1.InterfaceC11994b
        /* JADX INFO: renamed from: e */
        public boolean mo2435e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // p481v1.InterfaceC11994b
        /* JADX INFO: renamed from: f */
        public View mo2436f() {
            return CardView.this;
        }
    }

    static {
        C11993a c11993a = new C11993a();
        f1916i = c11993a;
        c11993a.mo44762o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CardView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C11768a.f41471a);
    }

    /* JADX INFO: renamed from: d */
    public void m2430d(int i10, int i11, int i12, int i13) {
        this.f1921e.set(i10, i11, i12, i13);
        f1916i.mo44759l(this.f1923g);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return f1916i.mo44754g(this.f1923g);
    }

    public float getCardElevation() {
        return f1916i.mo44751d(this.f1923g);
    }

    public int getContentPaddingBottom() {
        return this.f1921e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1921e.left;
    }

    public int getContentPaddingRight() {
        return this.f1921e.right;
    }

    public int getContentPaddingTop() {
        return this.f1921e.top;
    }

    public float getMaxCardElevation() {
        return f1916i.mo44756i(this.f1923g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1918b;
    }

    public float getRadius() {
        return f1916i.mo44748a(this.f1923g);
    }

    public boolean getUseCompatPadding() {
        return this.f1917a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        InterfaceC11995c interfaceC11995c = f1916i;
        if (interfaceC11995c instanceof C11993a) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC11995c.mo44749b(this.f1923g)), View.MeasureSpec.getSize(i10)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC11995c.mo44755h(this.f1923g)), View.MeasureSpec.getSize(i11)), mode2);
        }
        super.onMeasure(i10, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCardBackgroundColor(int i10) {
        f1916i.mo44750c(this.f1923g, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f1916i.mo44758k(this.f1923g, f10);
    }

    public void setMaxCardElevation(float f10) {
        f1916i.mo44753f(this.f1923g, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f1920d = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f1919c = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f1918b) {
            this.f1918b = z10;
            f1916i.mo44757j(this.f1923g);
        }
    }

    public void setRadius(float f10) {
        f1916i.mo44761n(this.f1923g, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f1917a != z10) {
            this.f1917a = z10;
            f1916i.mo44760m(this.f1923g);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CardView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i10);
        Rect rect = new Rect();
        this.f1921e = rect;
        this.f1922f = new Rect();
        C0509a c0509a = new C0509a();
        this.f1923g = c0509a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11771d.f41475a, i10, C11770c.f41474a);
        int i11 = C11771d.f41478d;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i11);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f1915h);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(C11769b.f41473b) : getResources().getColor(C11769b.f41472a));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(C11771d.f41479e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(C11771d.f41480f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(C11771d.f41481g, 0.0f);
        this.f1917a = typedArrayObtainStyledAttributes.getBoolean(C11771d.f41483i, false);
        this.f1918b = typedArrayObtainStyledAttributes.getBoolean(C11771d.f41482h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C11771d.f41484j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(C11771d.f41486l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(C11771d.f41488n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(C11771d.f41487m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(C11771d.f41485k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1919c = typedArrayObtainStyledAttributes.getDimensionPixelSize(C11771d.f41476b, 0);
        this.f1920d = typedArrayObtainStyledAttributes.getDimensionPixelSize(C11771d.f41477c, 0);
        typedArrayObtainStyledAttributes.recycle();
        f1916i.mo44752e(c0509a, context, colorStateList, dimension, dimension2, f10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1916i.mo44750c(this.f1923g, colorStateList);
    }
}
