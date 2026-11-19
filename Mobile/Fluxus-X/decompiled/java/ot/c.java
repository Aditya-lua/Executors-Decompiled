package ot;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class c extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mt.c f28535a;
    public final Rect b = h.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f28536c = h.a();

    public c(@NonNull mt.c cVar) {
        this.f28535a = cVar;
    }

    public final void a(TextPaint textPaint) {
        this.f28535a.b(textPaint);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int width;
        this.f28536c.setStyle(Paint.Style.FILL);
        this.f28536c.setColor(this.f28535a.n(paint));
        if (i11 > 0) {
            width = canvas.getWidth();
        } else {
            i10 -= canvas.getWidth();
            width = i10;
        }
        this.b.set(i10, i12, width, i14);
        canvas.drawRect(this.b, this.f28536c);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return this.f28535a.o();
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
