package l9;

import androidx.annotation.NonNull;
import k9.a.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class w<A extends k9.a.b, L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k.a f23098a;

    public w(@NonNull k.a<L> aVar) {
        this.f23098a = aVar;
    }

    @NonNull
    public k.a<L> a() {
        return this.f23098a;
    }

    public abstract void b(@NonNull A a10, @NonNull sb.k<Boolean> kVar);
}
