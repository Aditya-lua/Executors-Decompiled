package p306nb;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: nb.s9 */
/* JADX INFO: loaded from: classes.dex */
public final class C9288s9 implements InterfaceC9325ue {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9257qa f33463a;

    public C9288s9(C9257qa c9257qa) {
        Objects.requireNonNull(c9257qa);
        this.f33463a = c9257qa;
    }

    @Override // p306nb.InterfaceC9325ue
    /* JADX INFO: renamed from: a */
    public final void mo36347a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f33463a.m36704p("auto", "_err", bundle);
        } else {
            this.f33463a.m36718w("auto", "_err", bundle, str);
        }
    }
}
