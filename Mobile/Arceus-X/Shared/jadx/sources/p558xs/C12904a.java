package p558xs;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;
import p500vs.C12260c;

/* JADX INFO: renamed from: xs.a */
/* JADX INFO: loaded from: classes3.dex */
public class C12904a implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a */
    public final C12260c f45777a;

    /* JADX INFO: renamed from: b */
    public final Rect f45778b = AbstractC12910g.m47937b();

    /* JADX INFO: renamed from: c */
    public final Paint f45779c = AbstractC12910g.m47936a();

    public C12904a(@NonNull C12260c c12260c) {
        this.f45777a = c12260c;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int iM45475k = this.f45777a.m45475k();
        this.f45779c.set(paint);
        this.f45777a.m45466a(this.f45779c);
        int i17 = i11 * iM45475k;
        int i18 = i10 + i17;
        int i19 = i17 + i18;
        this.f45778b.set(Math.min(i18, i19), i12, Math.max(i18, i19), i14);
        canvas.drawRect(this.f45778b, this.f45779c);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return this.f45777a.m45474j();
    }
}
