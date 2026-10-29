package p306nb;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: renamed from: nb.y9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9384y9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9358x f33681a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9257qa f33682b;

    public RunnableC9384y9(C9257qa c9257qa, C9358x c9358x) {
        this.f33681a = c9358x;
        Objects.requireNonNull(c9257qa);
        this.f33682b = c9257qa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9257qa c9257qa = this.f33682b;
        C9094g7 c9094g7 = c9257qa.f33067a;
        C9157k6 c9157k6M36339x = c9094g7.m36339x();
        C9094g7 c9094g8 = c9157k6M36339x.f33067a;
        c9157k6M36339x.mo36088h();
        C9358x c9358xM36448u = c9157k6M36339x.m36448u();
        C9358x c9358x = this.f33681a;
        if (!C9255q8.m36650u(c9358x.m37019b(), c9358xM36448u.m37019b())) {
            c9094g7.mo36321a().m37009u().m36912b("Lower precedence consent source ignored, proposed source", Integer.valueOf(c9358x.m37019b()));
            return;
        }
        SharedPreferences.Editor editorEdit = c9157k6M36339x.m36443p().edit();
        editorEdit.putString("dma_consent_settings", c9358x.m37022e());
        editorEdit.apply();
        c9094g7.mo36321a().m37011w().m36912b("Setting DMA consent(FE)", c9358x);
        C9094g7 c9094g9 = c9257qa.f33067a;
        if (c9094g9.m36315J().m36863D()) {
            c9094g9.m36315J().m36885a0();
        } else {
            c9094g9.m36315J().m36883Y(false);
        }
    }
}
