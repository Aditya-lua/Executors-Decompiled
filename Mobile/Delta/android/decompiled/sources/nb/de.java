package nb;

import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class de extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ me f25464e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(me meVar, l8 l8Var) {
        super(l8Var);
        Objects.requireNonNull(meVar);
        this.f25464e = meVar;
    }

    @Override // nb.w
    public final void a() {
        me meVar = this.f25464e;
        meVar.b().h();
        String str = (String) meVar.y0().pollFirst();
        if (str != null) {
            meVar.z0(meVar.e().b());
            meVar.a().w().b("Sending trigger URI notification to app", str);
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            me.W(meVar.d(), intent);
        }
        meVar.v0();
    }
}
