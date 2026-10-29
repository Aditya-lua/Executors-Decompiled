package l9;

import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k9.e f23062c;

    public o0(k9.e eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f23062c = eVar;
    }

    @Override // k9.f
    public final <A extends k9.a.b, T extends com.google.android.gms.common.api.internal.a<? extends k9.n, A>> T a(@NonNull T t8) {
        return (T) this.f23062c.C(t8);
    }

    @Override // k9.f
    public final Looper c() {
        return this.f23062c.I();
    }
}
