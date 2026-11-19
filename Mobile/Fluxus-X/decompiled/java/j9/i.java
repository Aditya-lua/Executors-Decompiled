package j9;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class i extends db.f {
    public final /* synthetic */ c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar, Looper looper) {
        super(looper);
        this.b = cVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c.g(this.b, message);
    }
}
