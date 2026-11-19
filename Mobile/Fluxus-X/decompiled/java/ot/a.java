package ot;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class a implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mt.c f28528a;
    public final Rect b = h.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f28529c = h.a();

    public a(@NonNull mt.c cVar) {
        this.f28528a = cVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int iK = this.f28528a.k();
        this.f28529c.set(paint);
        this.f28528a.a(this.f28529c);
        int i17 = i11 * iK;
        int i18 = i10 + i17;
        int i19 = i17 + i18;
        this.b.set(Math.min(i18, i19), i12, Math.max(i18, i19), i14);
        canvas.drawRect(this.b, this.f28529c);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return this.f28528a.j();
    }
}
