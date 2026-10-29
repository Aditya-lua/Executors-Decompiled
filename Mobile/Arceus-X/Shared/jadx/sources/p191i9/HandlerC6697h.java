package p191i9;

import android.os.Looper;
import android.os.Message;
import p046cb.HandlerC1619f;

/* JADX INFO: renamed from: i9.h */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC6697h extends HandlerC1619f {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C6686b f25794b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC6697h(C6686b c6686b, Looper looper) {
        super(looper);
        this.f25794b = c6686b;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C6686b.m28780g(this.f25794b, message);
    }
}
