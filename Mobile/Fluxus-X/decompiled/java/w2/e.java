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
    public static final Object f35535d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spannable f35536a;
    public final a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PrecomputedText f35537c;

    public a a() {
        return this.b;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f35536a;
        if (b.a(spannable)) {
            return c.a(spannable);
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f35536a.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f35536a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f35536a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f35536a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f35537c.getSpans(i10, i11, cls) : (T[]) this.f35536a.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f35536a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f35536a.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f35537c.removeSpan(obj);
        } else {
            this.f35536a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f35537c.setSpan(obj, i10, i11, i12);
        } else {
            this.f35536a.setSpan(obj, i10, i11, i12);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f35536a.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f35536a.toString();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextPaint f35538a;
        public final TextDirectionHeuristic b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f35539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f35540d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final PrecomputedText.Params f35541e;

        /* JADX INFO: renamed from: w2.e$a$a, reason: collision with other inner class name */
        public static class C0733a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TextPaint f35542a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f35543c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f35544d = 1;
            public TextDirectionHeuristic b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0733a(TextPaint textPaint) {
                this.f35542a = textPaint;
            }

            public a a() {
                return new a(this.f35542a, this.b, this.f35543c, this.f35544d);
            }

            public C0733a b(int i10) {
                this.f35543c = i10;
                return this;
            }

            public C0733a c(int i10) {
                this.f35544d = i10;
                return this;
            }

            public C0733a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.b = textDirectionHeuristic;
                return this;
            }
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f35541e = d.a(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f35541e = null;
            }
            this.f35538a = textPaint;
            this.b = textDirectionHeuristic;
            this.f35539c = i10;
            this.f35540d = i11;
        }

        public boolean a(a aVar) {
            if (this.f35539c != aVar.b() || this.f35540d != aVar.c() || this.f35538a.getTextSize() != aVar.e().getTextSize() || this.f35538a.getTextScaleX() != aVar.e().getTextScaleX() || this.f35538a.getTextSkewX() != aVar.e().getTextSkewX() || this.f35538a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f35538a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f35538a.getFlags() != aVar.e().getFlags() || !this.f35538a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return false;
            }
            if (this.f35538a.getTypeface() == null) {
                return aVar.e().getTypeface() == null;
            }
            return this.f35538a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f35539c;
        }

        public int c() {
            return this.f35540d;
        }

        public TextDirectionHeuristic d() {
            return this.b;
        }

        public TextPaint e() {
            return this.f35538a;
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
            return x2.b.b(Float.valueOf(this.f35538a.getTextSize()), Float.valueOf(this.f35538a.getTextScaleX()), Float.valueOf(this.f35538a.getTextSkewX()), Float.valueOf(this.f35538a.getLetterSpacing()), Integer.valueOf(this.f35538a.getFlags()), this.f35538a.getTextLocales(), this.f35538a.getTypeface(), Boolean.valueOf(this.f35538a.isElegantTextHeight()), this.b, Integer.valueOf(this.f35539c), Integer.valueOf(this.f35540d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f35538a.getTextSize());
            sb2.append(", textScaleX=" + this.f35538a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f35538a.getTextSkewX());
            sb2.append(", letterSpacing=" + this.f35538a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f35538a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f35538a.getTextLocales());
            sb2.append(", typeface=" + this.f35538a.getTypeface());
            sb2.append(", variationSettings=" + this.f35538a.getFontVariationSettings());
            sb2.append(", textDir=" + this.b);
            sb2.append(", breakStrategy=" + this.f35539c);
            sb2.append(", hyphenationFrequency=" + this.f35540d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f35538a = params.getTextPaint();
            this.b = params.getTextDirection();
            this.f35539c = params.getBreakStrategy();
            this.f35540d = params.getHyphenationFrequency();
            this.f35541e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
