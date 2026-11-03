package vs;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class h implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ts.c f33642a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f33643c = g.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33644d;

    public h(@NonNull ts.c cVar, @NonNull String str) {
        this.f33642a = cVar;
        this.b = str;
    }

    public static void a(@NonNull TextView textView, @NonNull CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            h[] hVarArr = (h[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), h.class);
            if (hVarArr != null) {
                TextPaint paint = textView.getPaint();
                for (h hVar : hVarArr) {
                    hVar.f33644d = (int) (paint.measureText(hVar.b) + 0.5f);
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        if (z10 && zs.c.b(i15, charSequence, this)) {
            this.f33643c.set(paint);
            this.f33642a.g(this.f33643c);
            int iMeasureText = (int) (this.f33643c.measureText(this.b) + 0.5f);
            int iJ = this.f33642a.j();
            if (iMeasureText > iJ) {
                this.f33644d = iMeasureText;
                iJ = iMeasureText;
            } else {
                this.f33644d = 0;
            }
            canvas.drawText(this.b, i11 > 0 ? (i10 + (iJ * i11)) - iMeasureText : i10 + (i11 * iJ) + (iJ - iMeasureText), i13, this.f33643c);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return Math.max(this.f33644d, this.f33642a.j());
    }
}
