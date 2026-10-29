package p558xs;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
import bt.AbstractC1492c;
import p500vs.C12260c;

/* JADX INFO: renamed from: xs.f */
/* JADX INFO: loaded from: classes3.dex */
public class C12909f extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a */
    public final C12260c f45790a;

    /* JADX INFO: renamed from: b */
    public final Rect f45791b = AbstractC12910g.m47937b();

    /* JADX INFO: renamed from: c */
    public final Paint f45792c = AbstractC12910g.m47936a();

    /* JADX INFO: renamed from: d */
    public final int f45793d;

    public C12909f(@NonNull C12260c c12260c, int i10) {
        this.f45790a = c12260c;
        this.f45793d = i10;
    }

    /* JADX INFO: renamed from: a */
    public final void m47935a(TextPaint textPaint) {
        this.f45790a.m45470e(textPaint, this.f45793d);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int width;
        int i17 = this.f45793d;
        if ((i17 == 1 || i17 == 2) && AbstractC1492c.m7618a(i16, charSequence, this)) {
            this.f45792c.set(paint);
            this.f45790a.m45469d(this.f45792c);
            float strokeWidth = this.f45792c.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i18 = (int) ((i14 - strokeWidth) + 0.5f);
                if (i11 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i10;
                    i10 -= canvas.getWidth();
                }
                this.f45791b.set(i10, i18, width, i14);
                canvas.drawRect(this.f45791b, this.f45792c);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return 0;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        m47935a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        m47935a(textPaint);
    }
}
