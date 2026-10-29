package p101ed;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import p194ic.C6747k;
import p298n2.C8870h;

/* JADX INFO: renamed from: ed.d */
/* JADX INFO: loaded from: classes2.dex */
public class C5051d {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f19852a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f19853b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f19854c;

    /* JADX INFO: renamed from: d */
    public final String f19855d;

    /* JADX INFO: renamed from: e */
    public final int f19856e;

    /* JADX INFO: renamed from: f */
    public final int f19857f;

    /* JADX INFO: renamed from: g */
    public final boolean f19858g;

    /* JADX INFO: renamed from: h */
    public final float f19859h;

    /* JADX INFO: renamed from: i */
    public final float f19860i;

    /* JADX INFO: renamed from: j */
    public final float f19861j;

    /* JADX INFO: renamed from: k */
    public final boolean f19862k;

    /* JADX INFO: renamed from: l */
    public final float f19863l;

    /* JADX INFO: renamed from: m */
    public ColorStateList f19864m;

    /* JADX INFO: renamed from: n */
    public float f19865n;

    /* JADX INFO: renamed from: o */
    public final int f19866o;

    /* JADX INFO: renamed from: p */
    public boolean f19867p = false;

    /* JADX INFO: renamed from: q */
    public Typeface f19868q;

    /* JADX INFO: renamed from: ed.d$a */
    public class a extends C8870h.f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC5053f f19869a;

        public a(AbstractC5053f abstractC5053f) {
            this.f19869a = abstractC5053f;
        }

        @Override // p298n2.C8870h.f
        /* JADX INFO: renamed from: f */
        public void mo23760f(int i10) {
            C5051d.this.f19867p = true;
            this.f19869a.mo425a(i10);
        }

        @Override // p298n2.C8870h.f
        /* JADX INFO: renamed from: g */
        public void mo23761g(@NonNull Typeface typeface) {
            C5051d c5051d = C5051d.this;
            c5051d.f19868q = Typeface.create(typeface, c5051d.f19856e);
            C5051d.this.f19867p = true;
            this.f19869a.mo426b(C5051d.this.f19868q, false);
        }
    }

    /* JADX INFO: renamed from: ed.d$b */
    public class b extends AbstractC5053f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f19871a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TextPaint f19872b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC5053f f19873c;

        public b(Context context, TextPaint textPaint, AbstractC5053f abstractC5053f) {
            this.f19871a = context;
            this.f19872b = textPaint;
            this.f19873c = abstractC5053f;
        }

        @Override // p101ed.AbstractC5053f
        /* JADX INFO: renamed from: a */
        public void mo425a(int i10) {
            this.f19873c.mo425a(i10);
        }

        @Override // p101ed.AbstractC5053f
        /* JADX INFO: renamed from: b */
        public void mo426b(@NonNull Typeface typeface, boolean z10) {
            C5051d.this.m23759p(this.f19871a, this.f19872b, typeface);
            this.f19873c.mo426b(typeface, z10);
        }
    }

    public C5051d(@NonNull Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, C6747k.f26424f6);
        m23755l(typedArrayObtainStyledAttributes.getDimension(C6747k.f26433g6, 0.0f));
        m23754k(C5050c.m23736a(context, typedArrayObtainStyledAttributes, C6747k.f26460j6));
        this.f19852a = C5050c.m23736a(context, typedArrayObtainStyledAttributes, C6747k.f26469k6);
        this.f19853b = C5050c.m23736a(context, typedArrayObtainStyledAttributes, C6747k.f26478l6);
        this.f19856e = typedArrayObtainStyledAttributes.getInt(C6747k.f26451i6, 0);
        this.f19857f = typedArrayObtainStyledAttributes.getInt(C6747k.f26442h6, 1);
        int iM23740e = C5050c.m23740e(typedArrayObtainStyledAttributes, C6747k.f26532r6, C6747k.f26523q6);
        this.f19866o = typedArrayObtainStyledAttributes.getResourceId(iM23740e, 0);
        this.f19855d = typedArrayObtainStyledAttributes.getString(iM23740e);
        this.f19858g = typedArrayObtainStyledAttributes.getBoolean(C6747k.f26541s6, false);
        this.f19854c = C5050c.m23736a(context, typedArrayObtainStyledAttributes, C6747k.f26487m6);
        this.f19859h = typedArrayObtainStyledAttributes.getFloat(C6747k.f26496n6, 0.0f);
        this.f19860i = typedArrayObtainStyledAttributes.getFloat(C6747k.f26505o6, 0.0f);
        this.f19861j = typedArrayObtainStyledAttributes.getFloat(C6747k.f26514p6, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, C6747k.f26521q4);
        int i11 = C6747k.f26530r4;
        this.f19862k = typedArrayObtainStyledAttributes2.hasValue(i11);
        this.f19863l = typedArrayObtainStyledAttributes2.getFloat(i11, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: d */
    public final void m23747d() {
        String str;
        if (this.f19868q == null && (str = this.f19855d) != null) {
            this.f19868q = Typeface.create(str, this.f19856e);
        }
        if (this.f19868q == null) {
            int i10 = this.f19857f;
            if (i10 == 1) {
                this.f19868q = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f19868q = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f19868q = Typeface.DEFAULT;
            } else {
                this.f19868q = Typeface.MONOSPACE;
            }
            this.f19868q = Typeface.create(this.f19868q, this.f19856e);
        }
    }

    /* JADX INFO: renamed from: e */
    public Typeface m23748e() {
        m23747d();
        return this.f19868q;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public Typeface m23749f(@NonNull Context context) {
        if (this.f19867p) {
            return this.f19868q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM35665h = C8870h.m35665h(context, this.f19866o);
                this.f19868q = typefaceM35665h;
                if (typefaceM35665h != null) {
                    this.f19868q = Typeface.create(typefaceM35665h, this.f19856e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f19855d, e10);
            }
        }
        m23747d();
        this.f19867p = true;
        return this.f19868q;
    }

    /* JADX INFO: renamed from: g */
    public void m23750g(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull AbstractC5053f abstractC5053f) {
        m23759p(context, textPaint, m23748e());
        m23751h(context, new b(context, textPaint, abstractC5053f));
    }

    /* JADX INFO: renamed from: h */
    public void m23751h(@NonNull Context context, @NonNull AbstractC5053f abstractC5053f) {
        if (m23756m(context)) {
            m23749f(context);
        } else {
            m23747d();
        }
        int i10 = this.f19866o;
        if (i10 == 0) {
            this.f19867p = true;
        }
        if (this.f19867p) {
            abstractC5053f.mo426b(this.f19868q, true);
            return;
        }
        try {
            C8870h.m35667j(context, i10, new a(abstractC5053f), null);
        } catch (Resources.NotFoundException unused) {
            this.f19867p = true;
            abstractC5053f.mo425a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f19855d, e10);
            this.f19867p = true;
            abstractC5053f.mo425a(-3);
        }
    }

    /* JADX INFO: renamed from: i */
    public ColorStateList m23752i() {
        return this.f19864m;
    }

    /* JADX INFO: renamed from: j */
    public float m23753j() {
        return this.f19865n;
    }

    /* JADX INFO: renamed from: k */
    public void m23754k(ColorStateList colorStateList) {
        this.f19864m = colorStateList;
    }

    /* JADX INFO: renamed from: l */
    public void m23755l(float f10) {
        this.f19865n = f10;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m23756m(Context context) {
        if (C5052e.m23762a()) {
            return true;
        }
        int i10 = this.f19866o;
        return (i10 != 0 ? C8870h.m35660c(context, i10) : null) != null;
    }

    /* JADX INFO: renamed from: n */
    public void m23757n(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull AbstractC5053f abstractC5053f) {
        m23758o(context, textPaint, abstractC5053f);
        ColorStateList colorStateList = this.f19864m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : ViewCompat.MEASURED_STATE_MASK);
        float f10 = this.f19861j;
        float f11 = this.f19859h;
        float f12 = this.f19860i;
        ColorStateList colorStateList2 = this.f19854c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: o */
    public void m23758o(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull AbstractC5053f abstractC5053f) {
        if (m23756m(context)) {
            m23759p(context, textPaint, m23749f(context));
        } else {
            m23750g(context, textPaint, abstractC5053f);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m23759p(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        Typeface typefaceM23764a = C5055h.m23764a(context, typeface);
        if (typefaceM23764a != null) {
            typeface = typefaceM23764a;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f19856e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f19865n);
        if (this.f19862k) {
            textPaint.setLetterSpacing(this.f19863l);
        }
    }
}
