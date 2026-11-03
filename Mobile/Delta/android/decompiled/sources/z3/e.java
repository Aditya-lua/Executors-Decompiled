package z3;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends ReplacementSpan {

    @NonNull
    public final i b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f37829a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public short f37830c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public short f37831d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f37832e = 1.0f;

    public e(@NonNull i iVar) {
        x2.g.h(iVar, "rasterizer cannot be null");
        this.b = iVar;
    }

    @NonNull
    public final i a() {
        return this.b;
    }

    public final int b() {
        return this.f37830c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f37829a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f37829a;
        this.f37832e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.b.e();
        this.f37831d = (short) (this.b.e() * this.f37832e);
        short sI = (short) (this.b.i() * this.f37832e);
        this.f37830c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f37829a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
