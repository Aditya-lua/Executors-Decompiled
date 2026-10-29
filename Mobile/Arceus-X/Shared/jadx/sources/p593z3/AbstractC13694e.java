package p593z3;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
import p533x2.C12637g;

/* JADX INFO: renamed from: z3.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13694e extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C13698i f48070b;

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt f48069a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c */
    public short f48071c = -1;

    /* JADX INFO: renamed from: d */
    public short f48072d = -1;

    /* JADX INFO: renamed from: e */
    public float f48073e = 1.0f;

    public AbstractC13694e(@NonNull C13698i c13698i) {
        C12637g.m47076h(c13698i, "rasterizer cannot be null");
        this.f48070b = c13698i;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public final C13698i m50018a() {
        return this.f48070b;
    }

    /* JADX INFO: renamed from: b */
    public final int m50019b() {
        return this.f48071c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f48069a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f48069a;
        this.f48073e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f48070b.m50044e();
        this.f48072d = (short) (this.f48070b.m50044e() * this.f48073e);
        short sM50048i = (short) (this.f48070b.m50048i() * this.f48073e);
        this.f48071c = sM50048i;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f48069a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sM50048i;
    }
}
