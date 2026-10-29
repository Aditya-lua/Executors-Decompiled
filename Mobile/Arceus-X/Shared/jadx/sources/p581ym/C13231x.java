package p581ym;

import hu.InterfaceC6577m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ym.x */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2$\u0010\r\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\f0\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"T", "PropsT", "StateT", "OutputT", "Lym/a;", "Lym/o;", "worker", "Lhu/m;", "workerType", "", "key", "Lkotlin/Function1;", "Lym/r;", "handler", "", "a", "(Lym/a;Lym/o;Lhu/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "wf1-workflow-core"}, m31666k = 5, m31667mv = {1, 6, 0}, m31669xi = 48, m31670xs = "com/squareup/workflow1/Workflows")
public final /* synthetic */ class C13231x {
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super T, ? extends ym.r<? super PropsT, StateT, ? extends OutputT>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final <T, PropsT, StateT, OutputT> void m48940a(@NotNull InterfaceC13205a<? extends PropsT, StateT, ? super OutputT> interfaceC13205a, @NotNull InterfaceC13222o<? extends T> worker, @NotNull InterfaceC6577m workerType, @NotNull String key, @NotNull Function1<? super T, ? extends AbstractC13225r<? super PropsT, StateT, ? extends OutputT>> handler) {
        Intrinsics.checkNotNullParameter(interfaceC13205a, "<this>");
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(workerType, "workerType");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        interfaceC13205a.mo48836c(new C13223p(workerType, key), worker, key, handler);
    }
}
