package ws;

import androidx.annotation.NonNull;
import p500vs.AbstractC12259b;
import p558xs.C12905b;
import p558xs.C12911h;
import us.C11941g;
import us.InterfaceC11952r;
import us.InterfaceC11954t;

/* JADX INFO: renamed from: ws.g */
/* JADX INFO: loaded from: classes3.dex */
public class C12564g implements InterfaceC11954t {
    @Override // us.InterfaceC11954t
    /* JADX INFO: renamed from: a */
    public Object mo44613a(@NonNull C11941g c11941g, @NonNull InterfaceC11952r interfaceC11952r) {
        if (AbstractC12259b.a.BULLET == AbstractC12259b.f43341a.m44607c(interfaceC11952r)) {
            return new C12905b(c11941g.m44571e(), AbstractC12259b.f43342b.m44607c(interfaceC11952r).intValue());
        }
        return new C12911h(c11941g.m44571e(), String.valueOf(AbstractC12259b.f43343c.m44607c(interfaceC11952r)) + ". ");
    }
}
