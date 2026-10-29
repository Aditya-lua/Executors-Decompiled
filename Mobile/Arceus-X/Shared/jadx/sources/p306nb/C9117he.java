package p306nb;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: nb.he */
/* JADX INFO: loaded from: classes.dex */
public final class C9117he implements InterfaceC9325ue {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9197me f33019a;

    public C9117he(C9197me c9197me) {
        Objects.requireNonNull(c9197me);
        this.f33019a = c9197me;
    }

    @Override // p306nb.InterfaceC9325ue
    /* JADX INFO: renamed from: a */
    public final void mo36347a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f33019a.mo36322b().m36263t(new RunnableC9101ge(this, str, str2, bundle));
            return;
        }
        C9197me c9197me = this.f33019a;
        if (c9197me.m36576x0() != null) {
            c9197me.m36576x0().mo36321a().m37003o().m36912b("AppId not known when logging event", str2);
        }
    }
}
