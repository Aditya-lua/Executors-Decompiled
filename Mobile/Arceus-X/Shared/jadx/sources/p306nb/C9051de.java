package p306nb;

import android.content.Intent;
import java.util.Objects;

/* JADX INFO: renamed from: nb.de */
/* JADX INFO: loaded from: classes.dex */
public final class C9051de extends AbstractC9342w {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C9197me f32861e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9051de(C9197me c9197me, InterfaceC9175l8 interfaceC9175l8) {
        super(interfaceC9175l8);
        Objects.requireNonNull(c9197me);
        this.f32861e = c9197me;
    }

    @Override // p306nb.AbstractC9342w
    /* JADX INFO: renamed from: a */
    public final void mo36270a() {
        C9197me c9197me = this.f32861e;
        c9197me.mo36322b().mo36088h();
        String str = (String) c9197me.m36578y0().pollFirst();
        if (str != null) {
            c9197me.m36580z0(c9197me.mo36325e().mo44176b());
            c9197me.mo36321a().m37011w().m36912b("Sending trigger URI notification to app", str);
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            C9197me.m36492W(c9197me.mo36324d(), intent);
        }
        c9197me.m36573v0();
    }
}
