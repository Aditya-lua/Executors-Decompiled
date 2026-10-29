package xs;

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
    public final vs.c f35320a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f35321c = g.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35322d;

    public h(@NonNull vs.c cVar, @NonNull String str) {
        this.f35320a = cVar;
        this.b = str;
    }

    public static void a(@NonNull TextView textView, @NonNull CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            h[] hVarArr = (h[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), h.class);
            if (hVarArr != null) {
                TextPaint paint = textView.getPaint();
                for (h hVar : hVarArr) {
                    hVar.f35322d = (int) (paint.measureText(hVar.b) + 0.5f);
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        if (z10 && bt.c.b(i15, charSequence, this)) {
            this.f35321c.set(paint);
            this.f35320a.g(this.f35321c);
            int iMeasureText = (int) (this.f35321c.measureText(this.b) + 0.5f);
            int iJ = this.f35320a.j();
            if (iMeasureText > iJ) {
                this.f35322d = iMeasureText;
                iJ = iMeasureText;
            } else {
                this.f35322d = 0;
            }
            canvas.drawText(this.b, i11 > 0 ? (i10 + (iJ * i11)) - iMeasureText : i10 + (i11 * iJ) + (iJ - iMeasureText), i13, this.f35321c);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return Math.max(this.f35322d, this.f35320a.j());
    }
}
