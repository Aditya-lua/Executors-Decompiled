package w2;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public class e implements Spannable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f33846d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spannable f33847a;
    public final a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PrecomputedText f33848c;

    public a a() {
        return this.b;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f33847a;
        if (b.a(spannable)) {
            return c.a(spannable);
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f33847a.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f33847a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f33847a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f33847a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f33848c.getSpans(i10, i11, cls) : (T[]) this.f33847a.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f33847a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f33847a.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f33848c.removeSpan(obj);
        } else {
            this.f33847a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f33848c.setSpan(obj, i10, i11, i12);
        } else {
            this.f33847a.setSpan(obj, i10, i11, i12);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f33847a.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f33847a.toString();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextPaint f33849a;
        public final TextDirectionHeuristic b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f33850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f33851d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final PrecomputedText.Params f33852e;

        /* JADX INFO: renamed from: w2.e$a$a, reason: collision with other inner class name */
        public static class C0626a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TextPaint f33853a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f33854c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f33855d = 1;
            public TextDirectionHeuristic b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0626a(TextPaint textPaint) {
                this.f33853a = textPaint;
            }

            public a a() {
                return new a(this.f33853a, this.b, this.f33854c, this.f33855d);
            }

            public C0626a b(int i10) {
                this.f33854c = i10;
                return this;
            }

            public C0626a c(int i10) {
                this.f33855d = i10;
                return this;
            }

            public C0626a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.b = textDirectionHeuristic;
                return this;
            }
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f33852e = d.a(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f33852e = null;
            }
            this.f33849a = textPaint;
            this.b = textDirectionHeuristic;
            this.f33850c = i10;
            this.f33851d = i11;
        }

        public boolean a(a aVar) {
            if (this.f33850c != aVar.b() || this.f33851d != aVar.c() || this.f33849a.getTextSize() != aVar.e().getTextSize() || this.f33849a.getTextScaleX() != aVar.e().getTextScaleX() || this.f33849a.getTextSkewX() != aVar.e().getTextSkewX() || this.f33849a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f33849a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f33849a.getFlags() != aVar.e().getFlags() || !this.f33849a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return false;
            }
            if (this.f33849a.getTypeface() == null) {
                return aVar.e().getTypeface() == null;
            }
            return this.f33849a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f33850c;
        }

        public int c() {
            return this.f33851d;
        }

        public TextDirectionHeuristic d() {
            return this.b;
        }

        public TextPaint e() {
            return this.f33849a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.b == aVar.d();
        }

        public int hashCode() {
            return x2.b.b(Float.valueOf(this.f33849a.getTextSize()), Float.valueOf(this.f33849a.getTextScaleX()), Float.valueOf(this.f33849a.getTextSkewX()), Float.valueOf(this.f33849a.getLetterSpacing()), Integer.valueOf(this.f33849a.getFlags()), this.f33849a.getTextLocales(), this.f33849a.getTypeface(), Boolean.valueOf(this.f33849a.isElegantTextHeight()), this.b, Integer.valueOf(this.f33850c), Integer.valueOf(this.f33851d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f33849a.getTextSize());
            sb2.append(", textScaleX=" + this.f33849a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f33849a.getTextSkewX());
            sb2.append(", letterSpacing=" + this.f33849a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f33849a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f33849a.getTextLocales());
            sb2.append(", typeface=" + this.f33849a.getTypeface());
            sb2.append(", variationSettings=" + this.f33849a.getFontVariationSettings());
            sb2.append(", textDir=" + this.b);
            sb2.append(", breakStrategy=" + this.f33850c);
            sb2.append(", hyphenationFrequency=" + this.f33851d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f33849a = params.getTextPaint();
            this.b = params.getTextDirection();
            this.f33850c = params.getBreakStrategy();
            this.f33851d = params.getHyphenationFrequency();
            this.f33852e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
