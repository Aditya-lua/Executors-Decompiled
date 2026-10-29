package p558xs;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
import p500vs.C12260c;

/* JADX INFO: renamed from: xs.d */
/* JADX INFO: loaded from: classes3.dex */
public class C12907d extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a */
    public final C12260c f45789a;

    public C12907d(@NonNull C12260c c12260c) {
        this.f45789a = c12260c;
    }

    /* JADX INFO: renamed from: a */
    public final void m47934a(TextPaint textPaint) {
        this.f45789a.m45468c(textPaint);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        m47934a(textPaint);
        textPaint.bgColor = this.f45789a.m45477m(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        m47934a(textPaint);
    }
}
