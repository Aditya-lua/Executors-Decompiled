package p268l9;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.AbstractC1899a;
import p242k9.AbstractC7495e;
import p242k9.C7491a;
import p242k9.InterfaceC7504n;

/* JADX INFO: renamed from: l9.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8061o0 extends C8025c0 {

    /* JADX INFO: renamed from: c */
    public final AbstractC7495e f30064c;

    public C8061o0(AbstractC7495e abstractC7495e) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f30064c = abstractC7495e;
    }

    @Override // p242k9.AbstractC7496f
    /* JADX INFO: renamed from: a */
    public final <A extends C7491a.b, T extends AbstractC1899a<? extends InterfaceC7504n, A>> T mo31155a(@NonNull T t8) {
        return (T) this.f30064c.m31135C(t8);
    }

    @Override // p242k9.AbstractC7496f
    /* JADX INFO: renamed from: c */
    public final Looper mo31156c() {
        return this.f30064c.m31141I();
    }
}
