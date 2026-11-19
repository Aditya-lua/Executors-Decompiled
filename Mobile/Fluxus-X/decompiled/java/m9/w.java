package m9;

import androidx.annotation.NonNull;
import l9.a.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class w<A extends l9.a.b, L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k.a f23083a;

    public w(@NonNull k.a<L> aVar) {
        this.f23083a = aVar;
    }

    @NonNull
    public k.a<L> a() {
        return this.f23083a;
    }

    public abstract void b(@NonNull A a10, @NonNull tb.k<Boolean> kVar);
}
