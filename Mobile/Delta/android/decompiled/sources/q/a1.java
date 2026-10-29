package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28922a;
    public final TypedArray b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f28923c;

    public a1(Context context, TypedArray typedArray) {
        this.f28922a = context;
        this.b = typedArray;
    }

    public static a1 t(Context context, int i10, int[] iArr) {
        return new a1(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static a1 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new a1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static a1 v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new a1(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.b.hasValue(i10) || (resourceId = this.b.getResourceId(i10, 0)) == 0 || (colorStateListA = k.a.a(this.f28922a, resourceId)) == null) ? this.b.getColorStateList(i10) : colorStateListA;
    }

    public float d(int i10, float f10) {
        return this.b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        return (!this.b.hasValue(i10) || (resourceId = this.b.getResourceId(i10, 0)) == 0) ? this.b.getDrawable(i10) : k.a.b(this.f28922a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.b.hasValue(i10) || (resourceId = this.b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return k.b().d(this.f28922a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, n2.h.f fVar) {
        int resourceId = this.b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f28923c == null) {
            this.f28923c = new TypedValue();
        }
        return n2.h.i(this.f28922a, resourceId, this.f28923c, i11, fVar);
    }

    public int k(int i10, int i11) {
        return this.b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.b;
    }

    public boolean s(int i10) {
        return this.b.hasValue(i10);
    }

    public TypedValue w(int i10) {
        return this.b.peekValue(i10);
    }

    public void x() {
        this.b.recycle();
    }
}
