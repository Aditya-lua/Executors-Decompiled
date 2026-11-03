package vs;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class b implements LeadingMarginSpan {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f33629f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ts.c f33630a;
    public final Paint b = g.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f33631c = g.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f33632d = g.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f33633e;

    public b(@NonNull ts.c cVar, int i10) {
        this.f33630a = cVar;
        this.f33633e = i10;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int iMin;
        int iMax;
        if (z10 && zs.c.b(i15, charSequence, this)) {
            this.b.set(paint);
            this.f33630a.g(this.b);
            int iSave = canvas.save();
            try {
                int iJ = this.f33630a.j();
                int iL = this.f33630a.l((int) ((this.b.descent() - this.b.ascent()) + 0.5f));
                int i17 = (iJ - iL) / 2;
                if (f33629f) {
                    int width = i11 < 0 ? i10 - (layout.getWidth() - (iJ * this.f33633e)) : (iJ * this.f33633e) - i10;
                    int i18 = i10 + (i17 * i11);
                    int i19 = (i11 * iL) + i18;
                    int i20 = i11 * width;
                    iMin = Math.min(i18, i19) + i20;
                    iMax = Math.max(i18, i19) + i20;
                } else {
                    if (i11 <= 0) {
                        i10 -= iJ;
                    }
                    iMin = i10 + i17;
                    iMax = iMin + iL;
                }
                int iDescent = (i13 + ((int) (((this.b.descent() + this.b.ascent()) / 2.0f) + 0.5f))) - (iL / 2);
                int i21 = iL + iDescent;
                int i22 = this.f33633e;
                if (i22 == 0 || i22 == 1) {
                    this.f33631c.set(iMin, iDescent, iMax, i21);
                    this.b.setStyle(this.f33633e == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(this.f33631c, this.b);
                } else {
                    this.f33632d.set(iMin, iDescent, iMax, i21);
                    this.b.setStyle(Paint.Style.FILL);
                    canvas.drawRect(this.f33632d, this.b);
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return this.f33630a.j();
    }
}
