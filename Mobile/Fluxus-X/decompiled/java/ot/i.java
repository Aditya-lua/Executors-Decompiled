package ot;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class i implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mt.c f28545a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f28546c = h.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28547d;

    public i(@NonNull mt.c cVar, @NonNull String str) {
        this.f28545a = cVar;
        this.b = str;
    }

    public static void a(@NonNull TextView textView, @NonNull CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            i[] iVarArr = (i[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), i.class);
            if (iVarArr != null) {
                TextPaint paint = textView.getPaint();
                for (i iVar : iVarArr) {
                    iVar.f28547d = (int) (paint.measureText(iVar.b) + 0.5f);
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        if (z10 && st.c.b(i15, charSequence, this)) {
            this.f28546c.set(paint);
            this.f28545a.g(this.f28546c);
            int iMeasureText = (int) (this.f28546c.measureText(this.b) + 0.5f);
            int iJ = this.f28545a.j();
            if (iMeasureText > iJ) {
                this.f28547d = iMeasureText;
                iJ = iMeasureText;
            } else {
                this.f28547d = 0;
            }
            canvas.drawText(this.b, i11 > 0 ? (i10 + (iJ * i11)) - iMeasureText : i10 + (i11 * iJ) + (iJ - iMeasureText), i13, this.f28546c);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return Math.max(this.f28547d, this.f28545a.j());
    }
}
