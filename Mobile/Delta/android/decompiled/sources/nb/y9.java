package nb;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f26130a;
    public final /* synthetic */ qa b;

    public y9(qa qaVar, x xVar) {
        this.f26130a = xVar;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qa qaVar = this.b;
        g7 g7Var = qaVar.f25625a;
        k6 k6VarX = g7Var.x();
        g7 g7Var2 = k6VarX.f25625a;
        k6VarX.h();
        x xVarU = k6VarX.u();
        x xVar = this.f26130a;
        if (!q8.u(xVar.b(), xVarU.b())) {
            g7Var.a().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(xVar.b()));
            return;
        }
        SharedPreferences.Editor editorEdit = k6VarX.p().edit();
        editorEdit.putString("dma_consent_settings", xVar.e());
        editorEdit.apply();
        g7Var.a().w().b("Setting DMA consent(FE)", xVar);
        g7 g7Var3 = qaVar.f25625a;
        if (g7Var3.J().D()) {
            g7Var3.J().a0();
        } else {
            g7Var3.J().Y(false);
        }
    }
}
