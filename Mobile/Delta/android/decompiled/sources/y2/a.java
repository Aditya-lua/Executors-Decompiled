package y2;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35497a;
    public final p b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35498c;

    public a(int i10, p pVar, int i11) {
        this.f35497a = i10;
        this.b = pVar;
        this.f35498c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f35497a);
        this.b.b0(this.f35498c, bundle);
    }
}
