package i9;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class h extends cb.f {
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, Looper looper) {
        super(looper);
        this.b = bVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        b.g(this.b, message);
    }
}
