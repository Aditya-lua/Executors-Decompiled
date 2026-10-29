package p306nb;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: renamed from: nb.w8 */
/* JADX INFO: loaded from: classes.dex */
public final class C9351w8 implements InterfaceC9220o5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9094g7 f33608a;

    public C9351w8(C9367x8 c9367x8, C9094g7 c9094g7) {
        this.f33608a = c9094g7;
        Objects.requireNonNull(c9367x8);
    }

    @Override // p306nb.InterfaceC9220o5
    public final boolean zza() {
        return Log.isLoggable(this.f33608a.mo36321a().m37013z(), 3);
    }
}
