package sd;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class b1 implements d1 {
    @Override // sd.d1
    public final k9.b a(Bundle bundle) {
        int i10 = bundle.getInt("error");
        if (i10 == 0) {
            return null;
        }
        return new a(i10, null);
    }
}
