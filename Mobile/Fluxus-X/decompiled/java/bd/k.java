package bd;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f3932n = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f3933a;
    public final TextPaint b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3934c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3936e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3943l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3935d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Layout.Alignment f3937f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3938g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3939h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f3940i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3941j = f3932n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3942k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextUtils.TruncateAt f3944m = null;

    public static class a extends Exception {
    }

    public k(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f3933a = charSequence;
        this.b = textPaint;
        this.f3934c = i10;
        this.f3936e = charSequence.length();
    }

    @NonNull
    public static k b(@NonNull CharSequence charSequence, @NonNull TextPaint textPaint, int i10) {
        return new k(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        if (this.f3933a == null) {
            this.f3933a = BuildConfig.FLAVOR;
        }
        int iMax = Math.max(0, this.f3934c);
        CharSequence charSequenceEllipsize = this.f3933a;
        if (this.f3938g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.b, iMax, this.f3944m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f3936e);
        this.f3936e = iMin;
        if (this.f3943l && this.f3938g == 1) {
            this.f3937f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f3935d, iMin, this.b, iMax);
        builderObtain.setAlignment(this.f3937f);
        builderObtain.setIncludePad(this.f3942k);
        builderObtain.setTextDirection(this.f3943l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f3944m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f3938g);
        float f10 = this.f3939h;
        if (f10 != 0.0f || this.f3940i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f3940i);
        }
        if (this.f3938g > 1) {
            builderObtain.setHyphenationFrequency(this.f3941j);
        }
        return builderObtain.build();
    }

    @NonNull
    public k c(@NonNull Layout.Alignment alignment) {
        this.f3937f = alignment;
        return this;
    }

    @NonNull
    public k d(TextUtils.TruncateAt truncateAt) {
        this.f3944m = truncateAt;
        return this;
    }

    @NonNull
    public k e(int i10) {
        this.f3941j = i10;
        return this;
    }

    @NonNull
    public k f(boolean z10) {
        this.f3942k = z10;
        return this;
    }

    public k g(boolean z10) {
        this.f3943l = z10;
        return this;
    }

    @NonNull
    public k h(float f10, float f11) {
        this.f3939h = f10;
        this.f3940i = f11;
        return this;
    }

    @NonNull
    public k i(int i10) {
        this.f3938g = i10;
        return this;
    }

    @NonNull
    public k j(l lVar) {
        return this;
    }
}
