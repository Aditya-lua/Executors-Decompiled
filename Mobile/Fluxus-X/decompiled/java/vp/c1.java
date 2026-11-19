package vp;

import com.github.luben.zstd.BuildConfig;
import es.i4;
import es.s6;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001BC\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001f¨\u0006&"}, d2 = {"Lvp/c1;", "Lvp/e1;", "Les/s6$b;", "Les/i4;", "Les/s6$c;", BuildConfig.FLAVOR, "isEnabled", "Les/s6;", "child", "props", BuildConfig.FLAVOR, "key", "didGoBack", "Lkotlin/Function1;", BuildConfig.FLAVOR, "handler", "<init>", "(ZLes/s6;Les/s6$b;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "a", "Z", "()Z", "b", "Les/s6;", "d", "()Les/s6;", "c", "Les/s6$b;", "e", "()Les/s6$b;", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "f", "Lkotlin/jvm/functions/Function1;", "getHandler", "()Lkotlin/jvm/functions/Function1;", "getName", "name", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c1 implements e1<s6.Input, i4, s6.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final s6 child;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s6.Input props;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean didGoBack;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<s6.c, Unit> handler;

    /* JADX WARN: Multi-variable type inference failed */
    public c1(boolean z10, @NotNull s6 child, @NotNull s6.Input props, @NotNull String key, boolean z11, @NotNull Function1<? super s6.c, Unit> handler) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.isEnabled = z10;
        this.child = child;
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

    @Override // vp.e1
    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter and merged with bridge method [inline-methods] */
    public s6 getChild() {
        return this.child;
    }

    @Override // vp.e1
    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter and merged with bridge method [inline-methods] */
    public s6.Input getProps() {
        return this.props;
    }

    @Override // vp.e1
    @NotNull
    public Function1<s6.c, Unit> getHandler() {
        return this.handler;
    }

    @Override // vp.s0
    @NotNull
    /* JADX INFO: renamed from: getName, reason: from getter */
    public String getKey() {
        return this.key;
    }
}
