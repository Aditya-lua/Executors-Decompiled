package ob;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class ne implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf f27629a;
    public final /* synthetic */ ve b;

    public ne(ve veVar, hf hfVar) {
        this.f27629a = hfVar;
        Objects.requireNonNull(veVar);
        this.b = veVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        hf hfVar = this.f27629a;
        String str = (String) o9.s.l(hfVar.f27424f);
        ve veVar = this.b;
        v8 v8VarG = veVar.g(str);
        u8 u8Var = u8.ANALYTICS_STORAGE;
        if (v8VarG.o(u8Var) && v8.f(hfVar.f27442x, 100).o(u8Var)) {
            return veVar.o0(hfVar).p0();
        }
        veVar.a().w().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
