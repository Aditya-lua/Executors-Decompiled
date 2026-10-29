package dd;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.annotation.NonNull;
import hc.k;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f14552a;
    public final ColorStateList b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f14553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f14558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f14559i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f14560j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f14561k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f14562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f14563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f14564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f14565o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14566p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Typeface f14567q;

    public class a extends n2.h.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f14568a;

        public a(f fVar) {
            this.f14568a = fVar;
        }

        @Override // n2.h.f
        public void f(int i10) {
            d.this.f14566p = true;
            this.f14568a.a(i10);
        }

        @Override // n2.h.f
        public void g(@NonNull Typeface typeface) {
            d dVar = d.this;
            dVar.f14567q = Typeface.create(typeface, dVar.f14555e);
            d.this.f14566p = true;
            this.f14568a.b(d.this.f14567q, false);
        }
    }

    public class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f14569a;
        public final /* synthetic */ TextPaint b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f14570c;

        public b(Context context, TextPaint textPaint, f fVar) {
            this.f14569a = context;
            this.b = textPaint;
            this.f14570c = fVar;
        }

        @Override // dd.f
        public void a(int i10) {
            this.f14570c.a(i10);
        }

        @Override // dd.f
        public void b(@NonNull Typeface typeface, boolean z10) {
            d.this.p(this.f14569a, this.b, typeface);
            this.f14570c.b(typeface, z10);
        }
    }

    public d(@NonNull Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, k.f19010f6);
        l(typedArrayObtainStyledAttributes.getDimension(k.f19019g6, 0.0f));
        k(c.a(context, typedArrayObtainStyledAttributes, k.f19046j6));
        this.f14552a = c.a(context, typedArrayObtainStyledAttributes, k.f19055k6);
        this.b = c.a(context, typedArrayObtainStyledAttributes, k.f19064l6);
        this.f14555e = typedArrayObtainStyledAttributes.getInt(k.f19037i6, 0);
        this.f14556f = typedArrayObtainStyledAttributes.getInt(k.f19028h6, 1);
        int iE = c.e(typedArrayObtainStyledAttributes, k.f19118r6, k.f19109q6);
        this.f14565o = typedArrayObtainStyledAttributes.getResourceId(iE, 0);
        this.f14554d = typedArrayObtainStyledAttributes.getString(iE);
        this.f14557g = typedArrayObtainStyledAttributes.getBoolean(k.f19127s6, false);
        this.f14553c = c.a(context, typedArrayObtainStyledAttributes, k.f19073m6);
        this.f14558h = typedArrayObtainStyledAttributes.getFloat(k.f19082n6, 0.0f);
        this.f14559i = typedArrayObtainStyledAttributes.getFloat(k.f19091o6, 0.0f);
        this.f14560j = typedArrayObtainStyledAttributes.getFloat(k.f19100p6, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, k.f19107q4);
        int i11 = k.f19116r4;
        this.f14561k = typedArrayObtainStyledAttributes2.hasValue(i11);
        this.f14562l = typedArrayObtainStyledAttributes2.getFloat(i11, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void d() {
        String str;
        if (this.f14567q == null && (str = this.f14554d) != null) {
            this.f14567q = Typeface.create(str, this.f14555e);
        }
        if (this.f14567q == null) {
            int i10 = this.f14556f;
            if (i10 == 1) {
                this.f14567q = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f14567q = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f14567q = Typeface.DEFAULT;
            } else {
                this.f14567q = Typeface.MONOSPACE;
            }
            this.f14567q = Typeface.create(this.f14567q, this.f14555e);
        }
    }

    public Typeface e() {
        d();
        return this.f14567q;
    }

    @NonNull
    public Typeface f(@NonNull Context context) {
        if (this.f14566p) {
            return this.f14567q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceH = n2.h.h(context, this.f14565o);
                this.f14567q = typefaceH;
                if (typefaceH != null) {
                    this.f14567q = Typeface.create(typefaceH, this.f14555e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f14554d, e10);
            }
        }
        d();
        this.f14566p = true;
        return this.f14567q;
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
        int i10 = this.f14565o;
        if (i10 == 0) {
            this.f14566p = true;
        }
        if (this.f14566p) {
            fVar.b(this.f14567q, true);
            return;
        }
        try {
            n2.h.j(context, i10, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f14566p = true;
            fVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f14554d, e10);
            this.f14566p = true;
            fVar.a(-3);
        }
    }

    public ColorStateList i() {
        return this.f14563m;
    }

    public float j() {
        return this.f14564n;
    }

    public void k(ColorStateList colorStateList) {
        this.f14563m = colorStateList;
    }

    public void l(float f10) {
        this.f14564n = f10;
    }

    public final boolean m(Context context) {
        if (e.a()) {
            return true;
        }
        int i10 = this.f14565o;
        return (i10 != 0 ? n2.h.c(context, i10) : null) != null;
    }

    public void n(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f14563m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f14560j;
        float f11 = this.f14558h;
        float f12 = this.f14559i;
        ColorStateList colorStateList2 = this.f14553c;
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
        int i10 = this.f14555e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f14564n);
        if (this.f14561k) {
            textPaint.setLetterSpacing(this.f14562l);
        }
    }
}
