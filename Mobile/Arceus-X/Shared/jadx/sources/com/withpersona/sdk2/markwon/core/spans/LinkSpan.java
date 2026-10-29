package com.withpersona.sdk2.markwon.core.spans;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import androidx.annotation.NonNull;
import p500vs.C12260c;
import us.InterfaceC11937c;

/* JADX INFO: loaded from: classes3.dex */
public class LinkSpan extends URLSpan {

    /* JADX INFO: renamed from: a */
    public final C12260c f17912a;

    /* JADX INFO: renamed from: b */
    public final String f17913b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC11937c f17914c;

    public LinkSpan(@NonNull C12260c c12260c, @NonNull String str, @NonNull InterfaceC11937c interfaceC11937c) {
        super(str);
        this.f17912a = c12260c;
        this.f17913b = str;
        this.f17914c = interfaceC11937c;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        this.f17914c.mo44558a(view, this.f17913b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        this.f17912a.m45471f(textPaint);
    }
}
