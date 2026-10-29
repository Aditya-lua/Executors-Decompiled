package ym;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004B#\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00028\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\u00020\u000f*\u00180\u000eR\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00028\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lym/b;", "P", "S", "O", "Lym/r;", "Lym/o;", "worker", "", "renderKey", "output", "<init>", "(Lym/o;Ljava/lang/String;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "Lym/r$c;", "", "a", "(Lym/r$c;)V", "c", "Lym/o;", "d", "Ljava/lang/String;", "e", "Ljava/lang/Object;", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class b<P, S, O> extends r<P, S, O> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final o<?> worker;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final O output;

    public b(@NotNull o<?> worker, @NotNull String renderKey, O o8) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(renderKey, "renderKey");
        this.worker = worker;
        this.key = renderKey;
        this.output = o8;
    }

    @Override // ym.r
    public void a(@NotNull r<? super P, S, ? extends O>.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        cVar.d(this.output);
    }

    @NotNull
    public String toString() {
        return ((Object) d0.b(b.class).f()) + "(worker=" + this.worker + ", key=\"" + this.key + "\")";
    }
}
