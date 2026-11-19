package ot;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class l implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mt.c f28549a;
    public final Rect b = h.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f28550c = h.a();

    public l(@NonNull mt.c cVar) {
        this.f28549a = cVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int width;
        int i17 = i12 + ((i14 - i12) / 2);
        this.f28550c.set(paint);
        this.f28549a.h(this.f28550c);
        int strokeWidth = (int) ((((int) (this.f28550c.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i11 > 0) {
            width = canvas.getWidth();
        } else {
            width = i10;
            i10 -= canvas.getWidth();
        }
        this.b.set(i10, i17 - strokeWidth, width, i17 + strokeWidth);
        canvas.drawRect(this.b, this.f28550c);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return 0;
    }
}
