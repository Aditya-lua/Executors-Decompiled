package ed;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.annotation.NonNull;
import ic.k;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f16048a;
    public final ColorStateList b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f16049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f16053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f16054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f16055i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f16056j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f16057k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f16058l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f16059m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f16060n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f16061o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f16062p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Typeface f16063q;

    public class a extends n2.h.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f16064a;

        public a(f fVar) {
            this.f16064a = fVar;
        }

        @Override // n2.h.f
        public void f(int i10) {
            d.this.f16062p = true;
            this.f16064a.a(i10);
        }

        @Override // n2.h.f
        public void g(@NonNull Typeface typeface) {
            d dVar = d.this;
            dVar.f16063q = Typeface.create(typeface, dVar.f16051e);
            d.this.f16062p = true;
            this.f16064a.b(d.this.f16063q, false);
        }
    }

    public class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16065a;
        public final /* synthetic */ TextPaint b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f16066c;

        public b(Context context, TextPaint textPaint, f fVar) {
            this.f16065a = context;
            this.b = textPaint;
            this.f16066c = fVar;
        }

        @Override // ed.f
        public void a(int i10) {
            this.f16066c.a(i10);
        }

        @Override // ed.f
        public void b(@NonNull Typeface typeface, boolean z10) {
            d.this.p(this.f16065a, this.b, typeface);
            this.f16066c.b(typeface, z10);
        }
    }

    public d(@NonNull Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, k.f20832f6);
        l(typedArrayObtainStyledAttributes.getDimension(k.f20841g6, 0.0f));
        k(c.a(context, typedArrayObtainStyledAttributes, k.f20868j6));
        this.f16048a = c.a(context, typedArrayObtainStyledAttributes, k.f20877k6);
        this.b = c.a(context, typedArrayObtainStyledAttributes, k.f20886l6);
        this.f16051e = typedArrayObtainStyledAttributes.getInt(k.f20859i6, 0);
        this.f16052f = typedArrayObtainStyledAttributes.getInt(k.f20850h6, 1);
        int iE = c.e(typedArrayObtainStyledAttributes, k.f20940r6, k.f20931q6);
        this.f16061o = typedArrayObtainStyledAttributes.getResourceId(iE, 0);
        this.f16050d = typedArrayObtainStyledAttributes.getString(iE);
        this.f16053g = typedArrayObtainStyledAttributes.getBoolean(k.f20949s6, false);
        this.f16049c = c.a(context, typedArrayObtainStyledAttributes, k.f20895m6);
        this.f16054h = typedArrayObtainStyledAttributes.getFloat(k.f20904n6, 0.0f);
        this.f16055i = typedArrayObtainStyledAttributes.getFloat(k.f20913o6, 0.0f);
        this.f16056j = typedArrayObtainStyledAttributes.getFloat(k.f20922p6, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, k.f20929q4);
        int i11 = k.f20938r4;
        this.f16057k = typedArrayObtainStyledAttributes2.hasValue(i11);
        this.f16058l = typedArrayObtainStyledAttributes2.getFloat(i11, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void d() {
        String str;
        if (this.f16063q == null && (str = this.f16050d) != null) {
            this.f16063q = Typeface.create(str, this.f16051e);
        }
        if (this.f16063q == null) {
            int i10 = this.f16052f;
            if (i10 == 1) {
                this.f16063q = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f16063q = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f16063q = Typeface.DEFAULT;
            } else {
                this.f16063q = Typeface.MONOSPACE;
            }
            this.f16063q = Typeface.create(this.f16063q, this.f16051e);
        }
    }

    public Typeface e() {
        d();
        return this.f16063q;
    }

    @NonNull
    public Typeface f(@NonNull Context context) {
        if (this.f16062p) {
            return this.f16063q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceH = n2.h.h(context, this.f16061o);
                this.f16063q = typefaceH;
                if (typefaceH != null) {
                    this.f16063q = Typeface.create(typefaceH, this.f16051e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f16050d, e10);
            }
        }
        d();
        this.f16062p = true;
        return this.f16063q;
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
        int i10 = this.f16061o;
        if (i10 == 0) {
            this.f16062p = true;
        }
        if (this.f16062p) {
            fVar.b(this.f16063q, true);
            return;
        }
        try {
            n2.h.j(context, i10, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f16062p = true;
            fVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f16050d, e10);
            this.f16062p = true;
            fVar.a(-3);
        }
    }

    public ColorStateList i() {
        return this.f16059m;
    }

    public float j() {
        return this.f16060n;
    }

    public void k(ColorStateList colorStateList) {
        this.f16059m = colorStateList;
    }

    public void l(float f10) {
        this.f16060n = f10;
    }

    public final boolean m(Context context) {
        if (e.a()) {
            return true;
        }
        int i10 = this.f16061o;
        return (i10 != 0 ? n2.h.c(context, i10) : null) != null;
    }

    public void n(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f16059m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f16056j;
        float f11 = this.f16054h;
        float f12 = this.f16055i;
        ColorStateList colorStateList2 = this.f16049c;
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
        int i10 = this.f16051e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f16060n);
        if (this.f16057k) {
            textPaint.setLetterSpacing(this.f16058l);
        }
    }
}
