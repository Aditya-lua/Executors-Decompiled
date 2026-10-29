package td;

import android.os.Bundle;
import p242k9.C7492b;

/* JADX INFO: renamed from: td.c1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11573c1 implements InterfaceC11576d1 {
    @Override // td.InterfaceC11576d1
    /* JADX INFO: renamed from: a */
    public final C7492b mo43241a(Bundle bundle) {
        int i10 = bundle.getInt("error");
        if (i10 == 0) {
            return null;
        }
        return new C11568b(i10, null);
    }
}
