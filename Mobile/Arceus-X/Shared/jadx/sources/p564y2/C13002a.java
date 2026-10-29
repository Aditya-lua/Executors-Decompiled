package p564y2;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: y2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13002a extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final int f46034a;

    /* JADX INFO: renamed from: b */
    public final C13017p f46035b;

    /* JADX INFO: renamed from: c */
    public final int f46036c;

    public C13002a(int i10, C13017p c13017p, int i11) {
        this.f46034a = i10;
        this.f46035b = c13017p;
        this.f46036c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f46034a);
        this.f46035b.m48389b0(this.f46036c, bundle);
    }
}
