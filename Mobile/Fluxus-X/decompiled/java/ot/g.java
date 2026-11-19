package ot;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class g extends URLSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mt.c f28541a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lt.c f28542c;

    public g(@NonNull mt.c cVar, @NonNull String str, @NonNull lt.c cVar2) {
        super(str);
        this.f28541a = cVar;
        this.b = str;
        this.f28542c = cVar2;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        this.f28542c.a(view, this.b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        this.f28541a.f(textPaint);
    }
}
