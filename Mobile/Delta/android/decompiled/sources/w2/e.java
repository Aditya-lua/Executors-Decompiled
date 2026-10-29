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
    public static final Object f33640d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spannable f33641a;
    public final a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PrecomputedText f33642c;

    public a a() {
        return this.b;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f33641a;
        if (b.a(spannable)) {
            return c.a(spannable);
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f33641a.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f33641a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f33641a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f33641a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f33642c.getSpans(i10, i11, cls) : (T[]) this.f33641a.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f33641a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f33641a.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f33642c.removeSpan(obj);
        } else {
            this.f33641a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f33642c.setSpan(obj, i10, i11, i12);
        } else {
            this.f33641a.setSpan(obj, i10, i11, i12);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f33641a.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f33641a.toString();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextPaint f33643a;
        public final TextDirectionHeuristic b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f33644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f33645d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final PrecomputedText.Params f33646e;

        /* JADX INFO: renamed from: w2.e$a$a, reason: collision with other inner class name */
        public static class C0616a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TextPaint f33647a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f33648c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f33649d = 1;
            public TextDirectionHeuristic b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0616a(TextPaint textPaint) {
                this.f33647a = textPaint;
            }

            public a a() {
                return new a(this.f33647a, this.b, this.f33648c, this.f33649d);
            }

            public C0616a b(int i10) {
                this.f33648c = i10;
                return this;
            }

            public C0616a c(int i10) {
                this.f33649d = i10;
                return this;
            }

            public C0616a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.b = textDirectionHeuristic;
                return this;
            }
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f33646e = d.a(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f33646e = null;
            }
            this.f33643a = textPaint;
            this.b = textDirectionHeuristic;
            this.f33644c = i10;
            this.f33645d = i11;
        }

        public boolean a(a aVar) {
            if (this.f33644c != aVar.b() || this.f33645d != aVar.c() || this.f33643a.getTextSize() != aVar.e().getTextSize() || this.f33643a.getTextScaleX() != aVar.e().getTextScaleX() || this.f33643a.getTextSkewX() != aVar.e().getTextSkewX() || this.f33643a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f33643a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f33643a.getFlags() != aVar.e().getFlags() || !this.f33643a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return false;
            }
            if (this.f33643a.getTypeface() == null) {
                return aVar.e().getTypeface() == null;
            }
            return this.f33643a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f33644c;
        }

        public int c() {
            return this.f33645d;
        }

        public TextDirectionHeuristic d() {
            return this.b;
        }

        public TextPaint e() {
            return this.f33643a;
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
            return x2.b.b(Float.valueOf(this.f33643a.getTextSize()), Float.valueOf(this.f33643a.getTextScaleX()), Float.valueOf(this.f33643a.getTextSkewX()), Float.valueOf(this.f33643a.getLetterSpacing()), Integer.valueOf(this.f33643a.getFlags()), this.f33643a.getTextLocales(), this.f33643a.getTypeface(), Boolean.valueOf(this.f33643a.isElegantTextHeight()), this.b, Integer.valueOf(this.f33644c), Integer.valueOf(this.f33645d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f33643a.getTextSize());
            sb2.append(", textScaleX=" + this.f33643a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f33643a.getTextSkewX());
            sb2.append(", letterSpacing=" + this.f33643a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f33643a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f33643a.getTextLocales());
            sb2.append(", typeface=" + this.f33643a.getTypeface());
            sb2.append(", variationSettings=" + this.f33643a.getFontVariationSettings());
            sb2.append(", textDir=" + this.b);
            sb2.append(", breakStrategy=" + this.f33644c);
            sb2.append(", hyphenationFrequency=" + this.f33645d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f33643a = params.getTextPaint();
            this.b = params.getTextDirection();
            this.f33644c = params.getBreakStrategy();
            this.f33645d = params.getHyphenationFrequency();
            this.f33646e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
