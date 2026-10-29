package xs;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class f extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vs.c f35315a;
    public final Rect b = g.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f35316c = g.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35317d;

    public f(@NonNull vs.c cVar, int i10) {
        this.f35315a = cVar;
        this.f35317d = i10;
    }

    public final void a(TextPaint textPaint) {
        this.f35315a.e(textPaint, this.f35317d);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int width;
        int i17 = this.f35317d;
        if ((i17 == 1 || i17 == 2) && bt.c.a(i16, charSequence, this)) {
            this.f35316c.set(paint);
            this.f35315a.d(this.f35316c);
            float strokeWidth = this.f35316c.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i18 = (int) ((i14 - strokeWidth) + 0.5f);
                if (i11 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i10;
                    i10 -= canvas.getWidth();
                }
                this.b.set(i10, i18, width, i14);
                canvas.drawRect(this.b, this.f35316c);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return 0;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
