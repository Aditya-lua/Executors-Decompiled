package p177hp;

import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: hp.h */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001BC\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001f¨\u0006&"}, m31665d2 = {"Lhp/h;", "Lhp/e1;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "", "isEnabled", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;", "child", "props", "", "key", "didGoBack", "Lkotlin/Function1;", "", "handler", "<init>", "(ZLcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "a", "Z", "()Z", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;", "d", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;", "c", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "e", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "f", "Lkotlin/jvm/functions/Function1;", "getHandler", "()Lkotlin/jvm/functions/Function1;", "getName", "name", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6497h implements InterfaceC6492e1<GovernmentIdWorkflow.Input, GovernmentIdState, GovernmentIdWorkflow.AbstractC3503a> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final GovernmentIdWorkflow child;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final GovernmentIdWorkflow.Input props;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean didGoBack;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Function1<GovernmentIdWorkflow.AbstractC3503a, Unit> handler;

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C6497h(boolean z10, @NotNull GovernmentIdWorkflow child, @NotNull GovernmentIdWorkflow.Input props, @NotNull String key, boolean z11, @NotNull Function1<? super GovernmentIdWorkflow.AbstractC3503a, Unit> handler) {
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

    @Override // p177hp.InterfaceC6520s0
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getDidGoBack() {
        return this.didGoBack;
    }

    /* JADX DEBUG: Method merged with bridge method: c()Lym/k; */
    @Override // p177hp.InterfaceC6492e1
    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter and merged with bridge method [inline-methods] */
    public GovernmentIdWorkflow mo28241c() {
        return this.child;
    }

    /* JADX DEBUG: Method merged with bridge method: a()Ljava/lang/Object; */
    @Override // p177hp.InterfaceC6492e1
    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter and merged with bridge method [inline-methods] */
    public GovernmentIdWorkflow.Input mo28240a() {
        return this.props;
    }

    @Override // p177hp.InterfaceC6492e1
    @NotNull
    public Function1<GovernmentIdWorkflow.AbstractC3503a, Unit> getHandler() {
        return this.handler;
    }

    @Override // p177hp.InterfaceC6520s0
    @NotNull
    /* JADX INFO: renamed from: getName, reason: from getter */
    public String getKey() {
        return this.key;
    }
}
