package vs;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class a implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ts.c f33627a;
    public final Rect b = g.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f33628c = g.a();

    public a(@NonNull ts.c cVar) {
        this.f33627a = cVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int iK = this.f33627a.k();
        this.f33628c.set(paint);
        this.f33627a.a(this.f33628c);
        int i17 = i11 * iK;
        int i18 = i10 + i17;
        int i19 = i17 + i18;
        this.b.set(Math.min(i18, i19), i12, Math.max(i18, i19), i14);
        canvas.drawRect(this.b, this.f33628c);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return this.f33627a.j();
    }
}
