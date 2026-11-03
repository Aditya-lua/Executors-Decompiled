package ad;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f375n = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f376a;
    public final TextPaint b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f377c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f379e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f386l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f378d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Layout.Alignment f380f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f381g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f382h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f383i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f384j = f375n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f385k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextUtils.TruncateAt f387m = null;

    public static class a extends Exception {
    }

    public k(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f376a = charSequence;
        this.b = textPaint;
        this.f377c = i10;
        this.f379e = charSequence.length();
    }

    @NonNull
    public static k b(@NonNull CharSequence charSequence, @NonNull TextPaint textPaint, int i10) {
        return new k(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        if (this.f376a == null) {
            this.f376a = "";
        }
        int iMax = Math.max(0, this.f377c);
        CharSequence charSequenceEllipsize = this.f376a;
        if (this.f381g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.b, iMax, this.f387m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f379e);
        this.f379e = iMin;
        if (this.f386l && this.f381g == 1) {
            this.f380f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f378d, iMin, this.b, iMax);
        builderObtain.setAlignment(this.f380f);
        builderObtain.setIncludePad(this.f385k);
        builderObtain.setTextDirection(this.f386l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f387m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f381g);
        float f10 = this.f382h;
        if (f10 != 0.0f || this.f383i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f383i);
        }
        if (this.f381g > 1) {
            builderObtain.setHyphenationFrequency(this.f384j);
        }
        return builderObtain.build();
    }

    @NonNull
    public k c(@NonNull Layout.Alignment alignment) {
        this.f380f = alignment;
        return this;
    }

    @NonNull
    public k d(TextUtils.TruncateAt truncateAt) {
        this.f387m = truncateAt;
        return this;
    }

    @NonNull
    public k e(int i10) {
        this.f384j = i10;
        return this;
    }

    @NonNull
    public k f(boolean z10) {
        this.f385k = z10;
        return this;
    }

    public k g(boolean z10) {
        this.f386l = z10;
        return this;
    }

    @NonNull
    public k h(float f10, float f11) {
        this.f382h = f10;
        this.f383i = f11;
        return this;
    }

    @NonNull
    public k i(int i10) {
        this.f381g = i10;
        return this;
    }

    @NonNull
    public k j(l lVar) {
        return this;
    }
}
