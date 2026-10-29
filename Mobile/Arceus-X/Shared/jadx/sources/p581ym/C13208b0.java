package p581ym;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ym.b0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032(\u0010\t\u001a$\u0012\u001a\u0012\u00180\u0006R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000b\u001ai\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\f2(\u0010\t\u001a$\u0012\u001a\u0012\u00180\u0006R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\r\u0010\u000e\u001aY\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00028\u0001\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00120\u0011\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"PropsT", "StateT", "OutputT", "", "name", "Lkotlin/Function1;", "Lym/r$c;", "Lym/r;", "", "apply", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lym/r;", "Lkotlin/Function0;", "b", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lym/r;", "props", "state", "Lkotlin/Pair;", "Lym/v;", "d", "(Lym/r;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "wf1-workflow-core"}, m31666k = 5, m31667mv = {1, 6, 0}, m31669xi = 48, m31670xs = "com/squareup/workflow1/Workflows")
public final /* synthetic */ class C13208b0 {

    /* JADX INFO: renamed from: ym.b0$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"PropsT", "StateT", "OutputT", "", "b", "()Ljava/lang/String;"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class a extends AbstractC7746m implements Function0<String> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ String f46494i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f46494i = str;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f46494i;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [StateT, OutputT, PropsT] */
    /* JADX INFO: renamed from: ym.b0$b */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001J)\u0010\u0004\u001a\u00020\u0003*\u00180\u0002R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"ym/b0$b", "Lym/r;", "Lym/r$c;", "", "a", "(Lym/r$c;)V", "", "toString", "()Ljava/lang/String;", "wf1-workflow-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class b<OutputT, PropsT, StateT> extends AbstractC13225r<PropsT, StateT, OutputT> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function1<AbstractC13225r<? super PropsT, StateT, ? extends OutputT>.c, Unit> f46495c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Function0<String> f46496d;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super ym.r<? super PropsT, StateT, ? extends OutputT>$c, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super AbstractC13225r<? super PropsT, StateT, ? extends OutputT>.c, Unit> function1, Function0<String> function0) {
            this.f46495c = function1;
            this.f46496d = function0;
        }

        @Override // p581ym.AbstractC13225r
        /* JADX INFO: renamed from: a */
        public void mo48844a(@NotNull AbstractC13225r<? super PropsT, StateT, ? extends OutputT>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            this.f46495c.invoke(cVar);
        }

        @NotNull
        public String toString() {
            return "WorkflowAction(" + this.f46496d.invoke() + ")@" + hashCode();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <PropsT, StateT, OutputT> AbstractC13225r<PropsT, StateT, OutputT> m48845a(@NotNull String name, @NotNull Function1<? super AbstractC13225r<? super PropsT, StateT, ? extends OutputT>.c, Unit> apply) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(apply, "apply");
        return C13230w.m48928c(new a(name), apply);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <PropsT, StateT, OutputT> AbstractC13225r<PropsT, StateT, OutputT> m48846b(@NotNull Function0<String> name, @NotNull Function1<? super AbstractC13225r<? super PropsT, StateT, ? extends OutputT>.c, Unit> apply) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(apply, "apply");
        return new b(apply, name);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ AbstractC13225r m48847c(String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return C13230w.m48927b(str, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <PropsT, StateT, OutputT> Pair<StateT, WorkflowOutput<OutputT>> m48848d(@NotNull AbstractC13225r<? super PropsT, StateT, ? extends OutputT> abstractC13225r, PropsT propst, StateT statet) {
        Intrinsics.checkNotNullParameter(abstractC13225r, "<this>");
        AbstractC13225r<? super Object, StateT, ? extends Object>.c cVar = new AbstractC13225r.c(abstractC13225r, propst, statet);
        abstractC13225r.mo48844a(cVar);
        return new Pair<>(cVar.m48901c(), cVar.m48899a());
    }
}
