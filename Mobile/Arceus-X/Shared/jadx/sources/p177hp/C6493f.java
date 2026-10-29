package p177hp;

import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: hp.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0012\u0010\u0011R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019¨\u0006 "}, m31665d2 = {"Lhp/f;", "Lhp/s0;", "", "isEnabled", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "props", "", "key", "didGoBack", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "", "handler", "<init>", "(ZLcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "a", "Z", "()Z", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "d", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "c", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "e", "Lkotlin/jvm/functions/Function1;", "getHandler", "()Lkotlin/jvm/functions/Function1;", "getName", "name", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6493f implements InterfaceC6520s0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final GovernmentIdWorkflow.Input props;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean didGoBack;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Function1<GovernmentIdWorkflow.AbstractC3503a, Unit> handler;

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C6493f(boolean z10, @NotNull GovernmentIdWorkflow.Input props, @NotNull String key, boolean z11, @NotNull Function1<? super GovernmentIdWorkflow.AbstractC3503a, Unit> handler) {
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.isEnabled = z10;
        this.props = props;
        this.key = key;
        this.didGoBack = z11;
        this.handler = handler;
    }

    @Override // p177hp.InterfaceC6520s0
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getDidGoBack() {
        return this.didGoBack;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final GovernmentIdWorkflow.Input getProps() {
        return this.props;
    }

    @NotNull
    public final Function1<GovernmentIdWorkflow.AbstractC3503a, Unit> getHandler() {
        return this.handler;
    }

    @Override // p177hp.InterfaceC6520s0
    @NotNull
    /* JADX INFO: renamed from: getName, reason: from getter */
    public String getKey() {
        return this.key;
    }
}
