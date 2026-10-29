package com.withpersona.sdk2.markwon.core.spans;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import androidx.annotation.NonNull;
import vs.c;

/* JADX INFO: loaded from: classes3.dex */
public class LinkSpan extends URLSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14035a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final us.c f14036c;

    public LinkSpan(@NonNull c cVar, @NonNull String str, @NonNull us.c cVar2) {
        super(str);
        this.f14035a = cVar;
        this.b = str;
        this.f14036c = cVar2;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        this.f14036c.a(view, this.b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        this.f14035a.f(textPaint);
    }
}
