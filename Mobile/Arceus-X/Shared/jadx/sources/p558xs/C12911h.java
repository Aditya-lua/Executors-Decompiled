package p558xs;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;
import androidx.annotation.NonNull;
import bt.AbstractC1492c;
import p500vs.C12260c;

/* JADX INFO: renamed from: xs.h */
/* JADX INFO: loaded from: classes3.dex */
public class C12911h implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a */
    public final C12260c f45797a;

    /* JADX INFO: renamed from: b */
    public final String f45798b;

    /* JADX INFO: renamed from: c */
    public final Paint f45799c = AbstractC12910g.m47936a();

    /* JADX INFO: renamed from: d */
    public int f45800d;

    public C12911h(@NonNull C12260c c12260c, @NonNull String str) {
        this.f45797a = c12260c;
        this.f45798b = str;
    }

    /* JADX INFO: renamed from: a */
    public static void m47939a(@NonNull TextView textView, @NonNull CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            C12911h[] c12911hArr = (C12911h[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), C12911h.class);
            if (c12911hArr != null) {
                TextPaint paint = textView.getPaint();
                for (C12911h c12911h : c12911hArr) {
                    c12911h.f45800d = (int) (paint.measureText(c12911h.f45798b) + 0.5f);
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        if (z10 && AbstractC1492c.m7619b(i15, charSequence, this)) {
            this.f45799c.set(paint);
            this.f45797a.m45472g(this.f45799c);
            int iMeasureText = (int) (this.f45799c.measureText(this.f45798b) + 0.5f);
            int iM45474j = this.f45797a.m45474j();
            if (iMeasureText > iM45474j) {
                this.f45800d = iMeasureText;
                iM45474j = iMeasureText;
            } else {
                this.f45800d = 0;
            }
            canvas.drawText(this.f45798b, i11 > 0 ? (i10 + (iM45474j * i11)) - iMeasureText : i10 + (i11 * iM45474j) + (iM45474j - iMeasureText), i13, this.f45799c);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return Math.max(this.f45800d, this.f45797a.m45474j());
    }
}
