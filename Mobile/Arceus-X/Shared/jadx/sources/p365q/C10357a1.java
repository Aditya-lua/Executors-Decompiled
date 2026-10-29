package p365q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p232k.C7399a;
import p298n2.C8870h;

/* JADX INFO: renamed from: q.a1 */
/* JADX INFO: loaded from: classes.dex */
public class C10357a1 {

    /* JADX INFO: renamed from: a */
    public final Context f37239a;

    /* JADX INFO: renamed from: b */
    public final TypedArray f37240b;

    /* JADX INFO: renamed from: c */
    public TypedValue f37241c;

    public C10357a1(Context context, TypedArray typedArray) {
        this.f37239a = context;
        this.f37240b = typedArray;
    }

    /* JADX INFO: renamed from: t */
    public static C10357a1 m39726t(Context context, int i10, int[] iArr) {
        return new C10357a1(context, context.obtainStyledAttributes(i10, iArr));
    }

    /* JADX INFO: renamed from: u */
    public static C10357a1 m39727u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C10357a1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* JADX INFO: renamed from: v */
    public static C10357a1 m39728v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new C10357a1(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    /* JADX INFO: renamed from: a */
    public boolean m39729a(int i10, boolean z10) {
        return this.f37240b.getBoolean(i10, z10);
    }

    /* JADX INFO: renamed from: b */
    public int m39730b(int i10, int i11) {
        return this.f37240b.getColor(i10, i11);
    }

    /* JADX INFO: renamed from: c */
    public ColorStateList m39731c(int i10) {
        int resourceId;
        ColorStateList colorStateListM30678a;
        return (!this.f37240b.hasValue(i10) || (resourceId = this.f37240b.getResourceId(i10, 0)) == 0 || (colorStateListM30678a = C7399a.m30678a(this.f37239a, resourceId)) == null) ? this.f37240b.getColorStateList(i10) : colorStateListM30678a;
    }

    /* JADX INFO: renamed from: d */
    public float m39732d(int i10, float f10) {
        return this.f37240b.getDimension(i10, f10);
    }

    /* JADX INFO: renamed from: e */
    public int m39733e(int i10, int i11) {
        return this.f37240b.getDimensionPixelOffset(i10, i11);
    }

    /* JADX INFO: renamed from: f */
    public int m39734f(int i10, int i11) {
        return this.f37240b.getDimensionPixelSize(i10, i11);
    }

    /* JADX INFO: renamed from: g */
    public Drawable m39735g(int i10) {
        int resourceId;
        return (!this.f37240b.hasValue(i10) || (resourceId = this.f37240b.getResourceId(i10, 0)) == 0) ? this.f37240b.getDrawable(i10) : C7399a.m30679b(this.f37239a, resourceId);
    }

    /* JADX INFO: renamed from: h */
    public Drawable m39736h(int i10) {
        int resourceId;
        if (!this.f37240b.hasValue(i10) || (resourceId = this.f37240b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return C10383k.m39862b().m39867d(this.f37239a, resourceId, true);
    }

    /* JADX INFO: renamed from: i */
    public float m39737i(int i10, float f10) {
        return this.f37240b.getFloat(i10, f10);
    }

    /* JADX INFO: renamed from: j */
    public Typeface m39738j(int i10, int i11, C8870h.f fVar) {
        int resourceId = this.f37240b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f37241c == null) {
            this.f37241c = new TypedValue();
        }
        return C8870h.m35666i(this.f37239a, resourceId, this.f37241c, i11, fVar);
    }

    /* JADX INFO: renamed from: k */
    public int m39739k(int i10, int i11) {
        return this.f37240b.getInt(i10, i11);
    }

    /* JADX INFO: renamed from: l */
    public int m39740l(int i10, int i11) {
        return this.f37240b.getInteger(i10, i11);
    }

    /* JADX INFO: renamed from: m */
    public int m39741m(int i10, int i11) {
        return this.f37240b.getLayoutDimension(i10, i11);
    }

    /* JADX INFO: renamed from: n */
    public int m39742n(int i10, int i11) {
        return this.f37240b.getResourceId(i10, i11);
    }

    /* JADX INFO: renamed from: o */
    public String m39743o(int i10) {
        return this.f37240b.getString(i10);
    }

    /* JADX INFO: renamed from: p */
    public CharSequence m39744p(int i10) {
        return this.f37240b.getText(i10);
    }

    /* JADX INFO: renamed from: q */
    public CharSequence[] m39745q(int i10) {
        return this.f37240b.getTextArray(i10);
    }

    /* JADX INFO: renamed from: r */
    public TypedArray m39746r() {
        return this.f37240b;
    }

    /* JADX INFO: renamed from: s */
    public boolean m39747s(int i10) {
        return this.f37240b.hasValue(i10);
    }

    /* JADX INFO: renamed from: w */
    public TypedValue m39748w(int i10) {
        return this.f37240b.peekValue(i10);
    }

    /* JADX INFO: renamed from: x */
    public void m39749x() {
        this.f37240b.recycle();
    }
}
