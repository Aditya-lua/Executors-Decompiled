package p558xs;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;
import p500vs.C12260c;

/* JADX INFO: renamed from: xs.k */
/* JADX INFO: loaded from: classes3.dex */
public class C12914k implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a */
    public final C12260c f45802a;

    /* JADX INFO: renamed from: b */
    public final Rect f45803b = AbstractC12910g.m47937b();

    /* JADX INFO: renamed from: c */
    public final Paint f45804c = AbstractC12910g.m47936a();

    public C12914k(@NonNull C12260c c12260c) {
        this.f45802a = c12260c;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int width;
        int i17 = i12 + ((i14 - i12) / 2);
        this.f45804c.set(paint);
        this.f45802a.m45473h(this.f45804c);
        int strokeWidth = (int) ((((int) (this.f45804c.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i11 > 0) {
            width = canvas.getWidth();
        } else {
            width = i10;
            i10 -= canvas.getWidth();
        }
        this.f45803b.set(i10, i17 - strokeWidth, width, i17 + strokeWidth);
        canvas.drawRect(this.f45803b, this.f45804c);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return 0;
    }
}
