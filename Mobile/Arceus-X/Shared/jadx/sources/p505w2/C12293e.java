package p505w2;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p533x2.C12632b;

/* JADX INFO: renamed from: w2.e */
/* JADX INFO: loaded from: classes.dex */
public class C12293e implements Spannable {

    /* JADX INFO: renamed from: d */
    public static final Object f43548d = new Object();

    /* JADX INFO: renamed from: a */
    public final Spannable f43549a;

    /* JADX INFO: renamed from: b */
    public final a f43550b;

    /* JADX INFO: renamed from: c */
    public final PrecomputedText f43551c;

    /* JADX INFO: renamed from: a */
    public a m45669a() {
        return this.f43550b;
    }

    /* JADX INFO: renamed from: b */
    public PrecomputedText m45670b() {
        Spannable spannable = this.f43549a;
        if (C12290b.m45666a(spannable)) {
            return C12291c.m45667a(spannable);
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f43549a.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f43549a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f43549a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f43549a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f43551c.getSpans(i10, i11, cls) : (T[]) this.f43549a.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f43549a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f43549a.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f43551c.removeSpan(obj);
        } else {
            this.f43549a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f43551c.setSpan(obj, i10, i11, i12);
        } else {
            this.f43549a.setSpan(obj, i10, i11, i12);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f43549a.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f43549a.toString();
    }

    /* JADX INFO: renamed from: w2.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final TextPaint f43552a;

        /* JADX INFO: renamed from: b */
        public final TextDirectionHeuristic f43553b;

        /* JADX INFO: renamed from: c */
        public final int f43554c;

        /* JADX INFO: renamed from: d */
        public final int f43555d;

        /* JADX INFO: renamed from: e */
        public final PrecomputedText.Params f43556e;

        /* JADX INFO: renamed from: w2.e$a$a, reason: collision with other inner class name */
        public static class C14276a {

            /* JADX INFO: renamed from: a */
            public final TextPaint f43557a;

            /* JADX INFO: renamed from: c */
            public int f43559c = 1;

            /* JADX INFO: renamed from: d */
            public int f43560d = 1;

            /* JADX INFO: renamed from: b */
            public TextDirectionHeuristic f43558b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C14276a(TextPaint textPaint) {
                this.f43557a = textPaint;
            }

            /* JADX INFO: renamed from: a */
            public a m45676a() {
                return new a(this.f43557a, this.f43558b, this.f43559c, this.f43560d);
            }

            /* JADX INFO: renamed from: b */
            public C14276a m45677b(int i10) {
                this.f43559c = i10;
                return this;
            }

            /* JADX INFO: renamed from: c */
            public C14276a m45678c(int i10) {
                this.f43560d = i10;
                return this;
            }

            /* JADX INFO: renamed from: d */
            public C14276a m45679d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f43558b = textDirectionHeuristic;
                return this;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f43556e = C12292d.m45668a(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f43556e = null;
            }
            this.f43552a = textPaint;
            this.f43553b = textDirectionHeuristic;
            this.f43554c = i10;
            this.f43555d = i11;
        }

        /* JADX INFO: renamed from: a */
        public boolean m45671a(a aVar) {
            if (this.f43554c != aVar.m45672b() || this.f43555d != aVar.m45673c() || this.f43552a.getTextSize() != aVar.m45675e().getTextSize() || this.f43552a.getTextScaleX() != aVar.m45675e().getTextScaleX() || this.f43552a.getTextSkewX() != aVar.m45675e().getTextSkewX() || this.f43552a.getLetterSpacing() != aVar.m45675e().getLetterSpacing() || !TextUtils.equals(this.f43552a.getFontFeatureSettings(), aVar.m45675e().getFontFeatureSettings()) || this.f43552a.getFlags() != aVar.m45675e().getFlags() || !this.f43552a.getTextLocales().equals(aVar.m45675e().getTextLocales())) {
                return false;
            }
            if (this.f43552a.getTypeface() == null) {
                return aVar.m45675e().getTypeface() == null;
            }
            return this.f43552a.getTypeface().equals(aVar.m45675e().getTypeface());
        }

        /* JADX INFO: renamed from: b */
        public int m45672b() {
            return this.f43554c;
        }

        /* JADX INFO: renamed from: c */
        public int m45673c() {
            return this.f43555d;
        }

        /* JADX INFO: renamed from: d */
        public TextDirectionHeuristic m45674d() {
            return this.f43553b;
        }

        /* JADX INFO: renamed from: e */
        public TextPaint m45675e() {
            return this.f43552a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m45671a(aVar) && this.f43553b == aVar.m45674d();
        }

        public int hashCode() {
            return C12632b.m47061b(Float.valueOf(this.f43552a.getTextSize()), Float.valueOf(this.f43552a.getTextScaleX()), Float.valueOf(this.f43552a.getTextSkewX()), Float.valueOf(this.f43552a.getLetterSpacing()), Integer.valueOf(this.f43552a.getFlags()), this.f43552a.getTextLocales(), this.f43552a.getTypeface(), Boolean.valueOf(this.f43552a.isElegantTextHeight()), this.f43553b, Integer.valueOf(this.f43554c), Integer.valueOf(this.f43555d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f43552a.getTextSize());
            sb2.append(", textScaleX=" + this.f43552a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f43552a.getTextSkewX());
            sb2.append(", letterSpacing=" + this.f43552a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f43552a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f43552a.getTextLocales());
            sb2.append(", typeface=" + this.f43552a.getTypeface());
            sb2.append(", variationSettings=" + this.f43552a.getFontVariationSettings());
            sb2.append(", textDir=" + this.f43553b);
            sb2.append(", breakStrategy=" + this.f43554c);
            sb2.append(", hyphenationFrequency=" + this.f43555d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f43552a = params.getTextPaint();
            this.f43553b = params.getTextDirection();
            this.f43554c = params.getBreakStrategy();
            this.f43555d = params.getHyphenationFrequency();
            this.f43556e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
