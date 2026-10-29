package ad;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: ad.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C0139k {

    /* JADX INFO: renamed from: n */
    public static final int f481n = 1;

    /* JADX INFO: renamed from: a */
    public CharSequence f482a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f483b;

    /* JADX INFO: renamed from: c */
    public final int f484c;

    /* JADX INFO: renamed from: e */
    public int f486e;

    /* JADX INFO: renamed from: l */
    public boolean f493l;

    /* JADX INFO: renamed from: d */
    public int f485d = 0;

    /* JADX INFO: renamed from: f */
    public Layout.Alignment f487f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g */
    public int f488g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h */
    public float f489h = 0.0f;

    /* JADX INFO: renamed from: i */
    public float f490i = 1.0f;

    /* JADX INFO: renamed from: j */
    public int f491j = f481n;

    /* JADX INFO: renamed from: k */
    public boolean f492k = true;

    /* JADX INFO: renamed from: m */
    public TextUtils.TruncateAt f494m = null;

    /* JADX INFO: renamed from: ad.k$a */
    public static class a extends Exception {
    }

    public C0139k(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f482a = charSequence;
        this.f483b = textPaint;
        this.f484c = i10;
        this.f486e = charSequence.length();
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C0139k m403b(@NonNull CharSequence charSequence, @NonNull TextPaint textPaint, int i10) {
        return new C0139k(charSequence, textPaint, i10);
    }

    /* JADX INFO: renamed from: a */
    public StaticLayout m404a() {
        if (this.f482a == null) {
            this.f482a = "";
        }
        int iMax = Math.max(0, this.f484c);
        CharSequence charSequenceEllipsize = this.f482a;
        if (this.f488g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f483b, iMax, this.f494m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f486e);
        this.f486e = iMin;
        if (this.f493l && this.f488g == 1) {
            this.f487f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f485d, iMin, this.f483b, iMax);
        builderObtain.setAlignment(this.f487f);
        builderObtain.setIncludePad(this.f492k);
        builderObtain.setTextDirection(this.f493l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f494m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f488g);
        float f10 = this.f489h;
        if (f10 != 0.0f || this.f490i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f490i);
        }
        if (this.f488g > 1) {
            builderObtain.setHyphenationFrequency(this.f491j);
        }
        return builderObtain.build();
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public C0139k m405c(@NonNull Layout.Alignment alignment) {
        this.f487f = alignment;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public C0139k m406d(TextUtils.TruncateAt truncateAt) {
        this.f494m = truncateAt;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public C0139k m407e(int i10) {
        this.f491j = i10;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public C0139k m408f(boolean z10) {
        this.f492k = z10;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C0139k m409g(boolean z10) {
        this.f493l = z10;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public C0139k m410h(float f10, float f11) {
        this.f489h = f10;
        this.f490i = f11;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public C0139k m411i(int i10) {
        this.f488g = i10;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public C0139k m412j(InterfaceC0140l interfaceC0140l) {
        return this;
    }
}
