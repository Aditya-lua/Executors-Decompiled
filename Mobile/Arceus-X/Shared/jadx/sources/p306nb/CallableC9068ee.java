package p306nb;

import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.Callable;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.ee */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC9068ee implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzr f32900a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9197me f32901b;

    public CallableC9068ee(C9197me c9197me, zzr zzrVar) {
        this.f32900a = zzrVar;
        Objects.requireNonNull(c9197me);
        this.f32901b = c9197me;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzr zzrVar = this.f32900a;
        String str = (String) C8953m.m36047l(zzrVar.f9535f);
        C9197me c9197me = this.f32901b;
        C9255q8 c9255q8M36542g = c9197me.m36542g(str);
        EnumC9239p8 enumC9239p8 = EnumC9239p8.ANALYTICS_STORAGE;
        if (c9255q8M36542g.m36656o(enumC9239p8) && C9255q8.m36644f(zzrVar.f9553x, 100).m36656o(enumC9239p8)) {
            return c9197me.m36559o0(zzrVar).m36229p0();
        }
        c9197me.mo36321a().m37011w().m36911a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
