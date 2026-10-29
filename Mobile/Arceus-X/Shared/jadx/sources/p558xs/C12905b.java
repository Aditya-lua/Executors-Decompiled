package p558xs;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;
import bt.AbstractC1492c;
import p500vs.C12260c;

/* JADX INFO: renamed from: xs.b */
/* JADX INFO: loaded from: classes3.dex */
public class C12905b implements LeadingMarginSpan {

    /* JADX INFO: renamed from: f */
    public static final boolean f45780f = false;

    /* JADX INFO: renamed from: a */
    public C12260c f45781a;

    /* JADX INFO: renamed from: b */
    public final Paint f45782b = AbstractC12910g.m47936a();

    /* JADX INFO: renamed from: c */
    public final RectF f45783c = AbstractC12910g.m47938c();

    /* JADX INFO: renamed from: d */
    public final Rect f45784d = AbstractC12910g.m47937b();

    /* JADX INFO: renamed from: e */
    public final int f45785e;

    public C12905b(@NonNull C12260c c12260c, int i10) {
        this.f45781a = c12260c;
        this.f45785e = i10;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int iMin;
        int iMax;
        if (z10 && AbstractC1492c.m7619b(i15, charSequence, this)) {
            this.f45782b.set(paint);
            this.f45781a.m45472g(this.f45782b);
            int iSave = canvas.save();
            try {
                int iM45474j = this.f45781a.m45474j();
                int iM45476l = this.f45781a.m45476l((int) ((this.f45782b.descent() - this.f45782b.ascent()) + 0.5f));
                int i17 = (iM45474j - iM45476l) / 2;
                if (f45780f) {
                    int width = i11 < 0 ? i10 - (layout.getWidth() - (iM45474j * this.f45785e)) : (iM45474j * this.f45785e) - i10;
                    int i18 = i10 + (i17 * i11);
                    int i19 = (i11 * iM45476l) + i18;
                    int i20 = i11 * width;
                    iMin = Math.min(i18, i19) + i20;
                    iMax = Math.max(i18, i19) + i20;
                } else {
                    if (i11 <= 0) {
                        i10 -= iM45474j;
                    }
                    iMin = i10 + i17;
                    iMax = iMin + iM45476l;
                }
                int iDescent = (i13 + ((int) (((this.f45782b.descent() + this.f45782b.ascent()) / 2.0f) + 0.5f))) - (iM45476l / 2);
                int i21 = iM45476l + iDescent;
                int i22 = this.f45785e;
                if (i22 == 0 || i22 == 1) {
                    this.f45783c.set(iMin, iDescent, iMax, i21);
                    this.f45782b.setStyle(this.f45785e == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(this.f45783c, this.f45782b);
                } else {
                    this.f45784d.set(iMin, iDescent, iMax, i21);
                    this.f45782b.setStyle(Paint.Style.FILL);
                    canvas.drawRect(this.f45784d, this.f45782b);
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return this.f45781a.m45474j();
    }
}
