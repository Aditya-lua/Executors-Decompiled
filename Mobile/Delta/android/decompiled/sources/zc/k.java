package zc;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f37419n = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f37420a;
    public final TextPaint b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37421c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37423e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f37430l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37422d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Layout.Alignment f37424f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37425g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f37426h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f37427i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f37428j = f37419n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f37429k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextUtils.TruncateAt f37431m = null;

    public static class a extends Exception {
    }

    public k(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f37420a = charSequence;
        this.b = textPaint;
        this.f37421c = i10;
        this.f37423e = charSequence.length();
    }

    @NonNull
    public static k b(@NonNull CharSequence charSequence, @NonNull TextPaint textPaint, int i10) {
        return new k(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        if (this.f37420a == null) {
            this.f37420a = "";
        }
        int iMax = Math.max(0, this.f37421c);
        CharSequence charSequenceEllipsize = this.f37420a;
        if (this.f37425g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.b, iMax, this.f37431m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f37423e);
        this.f37423e = iMin;
        if (this.f37430l && this.f37425g == 1) {
            this.f37424f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f37422d, iMin, this.b, iMax);
        builderObtain.setAlignment(this.f37424f);
        builderObtain.setIncludePad(this.f37429k);
        builderObtain.setTextDirection(this.f37430l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f37431m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f37425g);
        float f10 = this.f37426h;
        if (f10 != 0.0f || this.f37427i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f37427i);
        }
        if (this.f37425g > 1) {
            builderObtain.setHyphenationFrequency(this.f37428j);
        }
        return builderObtain.build();
    }

    @NonNull
    public k c(@NonNull Layout.Alignment alignment) {
        this.f37424f = alignment;
        return this;
    }

    @NonNull
    public k d(TextUtils.TruncateAt truncateAt) {
        this.f37431m = truncateAt;
        return this;
    }

    @NonNull
    public k e(int i10) {
        this.f37428j = i10;
        return this;
    }

    @NonNull
    public k f(boolean z10) {
        this.f37429k = z10;
        return this;
    }

    public k g(boolean z10) {
        this.f37430l = z10;
        return this;
    }

    @NonNull
    public k h(float f10, float f11) {
        this.f37426h = f10;
        this.f37427i = f11;
        return this;
    }

    @NonNull
    public k i(int i10) {
        this.f37425g = i10;
        return this;
    }

    @NonNull
    public k j(l lVar) {
        return this;
    }
}
