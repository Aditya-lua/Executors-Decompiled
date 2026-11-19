package vp;

import com.github.luben.zstd.BuildConfig;
import no.u2;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0012\u0010\u0011R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019¨\u0006 "}, d2 = {"Lvp/b;", "Lvp/s0;", BuildConfig.FLAVOR, "isEnabled", "Lno/u2$b;", "props", BuildConfig.FLAVOR, "key", "didGoBack", "Lkotlin/Function1;", "Lno/u2$c;", BuildConfig.FLAVOR, "handler", "<init>", "(ZLno/u2$b;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "a", "Z", "()Z", "b", "Lno/u2$b;", "d", "()Lno/u2$b;", "c", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "e", "Lkotlin/jvm/functions/Function1;", "getHandler", "()Lkotlin/jvm/functions/Function1;", "getName", "name", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final u2.Input props;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean didGoBack;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<u2.c, Unit> handler;

    /* JADX WARN: Multi-variable type inference failed */
    public b(boolean z10, @NotNull u2.Input props, @NotNull String key, boolean z11, @NotNull Function1<? super u2.c, Unit> handler) {
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.isEnabled = z10;
        this.props = props;
        this.key = key;
        this.didGoBack = z11;
        this.handler = handler;
    }

    @Override // vp.s0
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getDidGoBack() {
        return this.didGoBack;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final u2.Input getProps() {
        return this.props;
    }

    @NotNull
    public final Function1<u2.c, Unit> getHandler() {
        return this.handler;
    }

    @Override // vp.s0
    @NotNull
    /* JADX INFO: renamed from: getName, reason: from getter */
    public String getKey() {
        return this.key;
    }
}
