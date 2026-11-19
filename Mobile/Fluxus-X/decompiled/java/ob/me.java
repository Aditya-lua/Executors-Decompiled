package ob;

import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class me extends z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ve f27592e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(ve veVar, q8 q8Var) {
        super(q8Var);
        Objects.requireNonNull(veVar);
        this.f27592e = veVar;
    }

    @Override // ob.z
    public final void a() {
        ve veVar = this.f27592e;
        veVar.b().h();
        String str = (String) veVar.y0().pollFirst();
        if (str != null) {
            veVar.z0(veVar.e().b());
            veVar.a().w().b("Sending trigger URI notification to app", str);
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            ve.W(veVar.d(), intent);
        }
        veVar.v0();
    }
}
