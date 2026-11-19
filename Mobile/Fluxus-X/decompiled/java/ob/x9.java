package ob;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class x9 implements ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ va f27970a;

    public x9(va vaVar) {
        Objects.requireNonNull(vaVar);
        this.f27970a = vaVar;
    }

    @Override // ob.ef
    public final void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f27970a.p("auto", "_err", bundle);
        } else {
            this.f27970a.w("auto", "_err", bundle, str);
        }
    }
}
