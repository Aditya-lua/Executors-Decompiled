package fd;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.annotation.NonNull;
import jc.k;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f15904a;
    public final ColorStateList b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f15905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f15909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f15910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f15911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f15912j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f15913k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f15914l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f15915m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f15916n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f15917o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15918p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Typeface f15919q;

    public class a extends n2.h.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f15920a;

        public a(f fVar) {
            this.f15920a = fVar;
        }

        @Override // n2.h.f
        public void f(int i10) {
            d.this.f15918p = true;
            this.f15920a.a(i10);
        }

        @Override // n2.h.f
        public void g(@NonNull Typeface typeface) {
            d dVar = d.this;
            dVar.f15919q = Typeface.create(typeface, dVar.f15907e);
            d.this.f15918p = true;
            this.f15920a.b(d.this.f15919q, false);
        }
    }

    public class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f15921a;
        public final /* synthetic */ TextPaint b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f15922c;

        public b(Context context, TextPaint textPaint, f fVar) {
            this.f15921a = context;
            this.b = textPaint;
            this.f15922c = fVar;
        }

        @Override // fd.f
        public void a(int i10) {
            this.f15922c.a(i10);
        }

        @Override // fd.f
        public void b(@NonNull Typeface typeface, boolean z10) {
            d.this.p(this.f15921a, this.b, typeface);
            this.f15922c.b(typeface, z10);
        }
    }

    public d(@NonNull Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, k.f20520f6);
        l(typedArrayObtainStyledAttributes.getDimension(k.f20529g6, 0.0f));
        k(c.a(context, typedArrayObtainStyledAttributes, k.f20556j6));
        this.f15904a = c.a(context, typedArrayObtainStyledAttributes, k.f20565k6);
        this.b = c.a(context, typedArrayObtainStyledAttributes, k.f20574l6);
        this.f15907e = typedArrayObtainStyledAttributes.getInt(k.f20547i6, 0);
        this.f15908f = typedArrayObtainStyledAttributes.getInt(k.f20538h6, 1);
        int iE = c.e(typedArrayObtainStyledAttributes, k.f20628r6, k.f20619q6);
        this.f15917o = typedArrayObtainStyledAttributes.getResourceId(iE, 0);
        this.f15906d = typedArrayObtainStyledAttributes.getString(iE);
        this.f15909g = typedArrayObtainStyledAttributes.getBoolean(k.f20637s6, false);
        this.f15905c = c.a(context, typedArrayObtainStyledAttributes, k.f20583m6);
        this.f15910h = typedArrayObtainStyledAttributes.getFloat(k.f20592n6, 0.0f);
        this.f15911i = typedArrayObtainStyledAttributes.getFloat(k.f20601o6, 0.0f);
        this.f15912j = typedArrayObtainStyledAttributes.getFloat(k.f20610p6, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, k.f20617q4);
        this.f15913k = typedArrayObtainStyledAttributes2.hasValue(k.f20626r4);
        this.f15914l = typedArrayObtainStyledAttributes2.getFloat(k.f20626r4, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void d() {
        String str;
        if (this.f15919q == null && (str = this.f15906d) != null) {
            this.f15919q = Typeface.create(str, this.f15907e);
        }
        if (this.f15919q == null) {
            int i10 = this.f15908f;
            if (i10 == 1) {
                this.f15919q = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f15919q = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f15919q = Typeface.DEFAULT;
            } else {
                this.f15919q = Typeface.MONOSPACE;
            }
            this.f15919q = Typeface.create(this.f15919q, this.f15907e);
        }
    }

    public Typeface e() {
        d();
        return this.f15919q;
    }

    @NonNull
    public Typeface f(@NonNull Context context) {
        if (this.f15918p) {
            return this.f15919q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceH = n2.h.h(context, this.f15917o);
                this.f15919q = typefaceH;
                if (typefaceH != null) {
                    this.f15919q = Typeface.create(typefaceH, this.f15907e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f15906d, e10);
            }
        }
        d();
        this.f15918p = true;
        return this.f15919q;
    }

    public void g(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull f fVar) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, fVar));
    }

    public void h(@NonNull Context context, @NonNull f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f15917o;
        if (i10 == 0) {
            this.f15918p = true;
        }
        if (this.f15918p) {
            fVar.b(this.f15919q, true);
            return;
        }
        try {
            n2.h.j(context, i10, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f15918p = true;
            fVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f15906d, e10);
            this.f15918p = true;
            fVar.a(-3);
        }
    }

    public ColorStateList i() {
        return this.f15915m;
    }

    public float j() {
        return this.f15916n;
    }

    public void k(ColorStateList colorStateList) {
        this.f15915m = colorStateList;
    }

    public void l(float f10) {
        this.f15916n = f10;
    }

    public final boolean m(Context context) {
        if (e.a()) {
            return true;
        }
        int i10 = this.f15917o;
        return (i10 != 0 ? n2.h.c(context, i10) : null) != null;
    }

    public void n(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f15915m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f15912j;
        float f11 = this.f15910h;
        float f12 = this.f15911i;
        ColorStateList colorStateList2 = this.f15905c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void p(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        Typeface typefaceA = h.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f15907e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f15916n);
        if (this.f15913k) {
            textPaint.setLetterSpacing(this.f15914l);
        }
    }
}
