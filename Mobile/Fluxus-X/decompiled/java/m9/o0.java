package m9;

import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l9.g f23047c;

    public o0(l9.g gVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f23047c = gVar;
    }

    @Override // l9.h
    public final <A extends l9.a.b, T extends com.google.android.gms.common.api.internal.a<? extends l9.p, A>> T a(@NonNull T t8) {
        return (T) this.f23047c.C(t8);
    }

    @Override // l9.h
    public final Looper c() {
        return this.f23047c.I();
    }
}
