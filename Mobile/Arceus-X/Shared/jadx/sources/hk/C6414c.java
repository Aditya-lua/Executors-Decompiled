package hk;

import android.content.Context;
import android.view.View;
import p151gk.C6116i;

/* JADX INFO: renamed from: hk.c */
/* JADX INFO: loaded from: classes2.dex */
public class C6414c extends AbstractC6412a {
    public C6414c(Context context, String str, String str2, int i10, int i11) {
        super(str, context, str2, i10, i11);
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Context context = this.f24345b;
        if (context != null) {
            C6116i.m27038b(context);
        }
    }
}
