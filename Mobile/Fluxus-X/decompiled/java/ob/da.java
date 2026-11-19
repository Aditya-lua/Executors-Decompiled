package ob;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class da implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f27192a;
    public final /* synthetic */ va b;

    public da(va vaVar, a0 a0Var) {
        this.f27192a = a0Var;
        Objects.requireNonNull(vaVar);
        this.b = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar = this.b;
        l7 l7Var = vaVar.f27641a;
        p6 p6VarX = l7Var.x();
        l7 l7Var2 = p6VarX.f27641a;
        p6VarX.h();
        a0 a0VarU = p6VarX.u();
        a0 a0Var = this.f27192a;
        if (!v8.u(a0Var.b(), a0VarU.b())) {
            l7Var.a().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(a0Var.b()));
            return;
        }
        SharedPreferences.Editor editorEdit = p6VarX.p().edit();
        editorEdit.putString("dma_consent_settings", a0Var.e());
        editorEdit.apply();
        l7Var.a().w().b("Setting DMA consent(FE)", a0Var);
        l7 l7Var3 = vaVar.f27641a;
        if (l7Var3.J().D()) {
            l7Var3.J().a0();
        } else {
            l7Var3.J().Y(false);
        }
    }
}
