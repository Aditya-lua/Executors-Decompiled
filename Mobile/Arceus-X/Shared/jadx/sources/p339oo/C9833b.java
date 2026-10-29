package p339oo;

import android.content.Context;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import p132fn.C5717x;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: oo.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C9833b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f35664a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C5717x> f35665b;

    public C9833b(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C5717x> interfaceC5835i2) {
        this.f35664a = interfaceC5835i;
        this.f35665b = interfaceC5835i2;
    }

    /* JADX INFO: renamed from: a */
    public static C9833b m38714a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C5717x> interfaceC5835i2) {
        return new C9833b(interfaceC5835i, interfaceC5835i2);
    }

    /* JADX INFO: renamed from: c */
    public static GovernmentIdHintWorker m38715c(Context context, C5717x c5717x, IdConfig.EnumC3514b enumC3514b) {
        return new GovernmentIdHintWorker(context, c5717x, enumC3514b);
    }

    /* JADX INFO: renamed from: b */
    public GovernmentIdHintWorker m38716b(IdConfig.EnumC3514b enumC3514b) {
        return m38715c(this.f35664a.get(), this.f35665b.get(), enumC3514b);
    }
}
