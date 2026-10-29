package hk;

import android.content.Context;
import android.view.View;
import gk.i;

/* JADX INFO: loaded from: classes2.dex */
public class c extends a {
    public c(Context context, String str, String str2, int i10, int i11) {
        super(str, context, str2, i10, i11);
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Context context = this.b;
        if (context != null) {
            i.b(context);
        }
    }
}
