package p558xs;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
import p500vs.C12260c;

/* JADX INFO: renamed from: xs.c */
/* JADX INFO: loaded from: classes3.dex */
public class C12906c extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a */
    public final C12260c f45786a;

    /* JADX INFO: renamed from: b */
    public final Rect f45787b = AbstractC12910g.m47937b();

    /* JADX INFO: renamed from: c */
    public final Paint f45788c = AbstractC12910g.m47936a();

    public C12906c(@NonNull C12260c c12260c) {
        this.f45786a = c12260c;
    }

    /* JADX INFO: renamed from: a */
    public final void m47933a(TextPaint textPaint) {
        this.f45786a.m45467b(textPaint);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int width;
        this.f45788c.setStyle(Paint.Style.FILL);
        this.f45788c.setColor(this.f45786a.m45478n(paint));
        if (i11 > 0) {
            width = canvas.getWidth();
        } else {
            i10 -= canvas.getWidth();
            width = i10;
        }
        this.f45787b.set(i10, i12, width, i14);
        canvas.drawRect(this.f45787b, this.f45788c);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return this.f45786a.m45479o();
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        m47933a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        m47933a(textPaint);
    }
}
