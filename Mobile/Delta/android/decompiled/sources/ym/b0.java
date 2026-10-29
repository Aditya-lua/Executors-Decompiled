package ym;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032(\u0010\t\u001a$\u0012\u001a\u0012\u00180\u0006R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000b\u001ai\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\f2(\u0010\t\u001a$\u0012\u001a\u0012\u00180\u0006R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\r\u0010\u000e\u001aY\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00028\u0001\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00120\u0011\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"PropsT", "StateT", "OutputT", "", "name", "Lkotlin/Function1;", "Lym/r$c;", "Lym/r;", "", "apply", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lym/r;", "Lkotlin/Function0;", "b", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lym/r;", "props", "state", "Lkotlin/Pair;", "Lym/v;", "d", "(Lym/r;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "wf1-workflow-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "com/squareup/workflow1/Workflows")
public final /* synthetic */ class b0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"PropsT", "StateT", "OutputT", "", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    public static final class a extends kotlin.jvm.internal.m implements Function0<String> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f35918i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f35918i = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f35918i;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [StateT, OutputT, PropsT] */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001J)\u0010\u0004\u001a\u00020\u0003*\u00180\u0002R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ym/b0$b", "Lym/r;", "Lym/r$c;", "", "a", "(Lym/r$c;)V", "", "toString", "()Ljava/lang/String;", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class b<OutputT, PropsT, StateT> extends r<PropsT, StateT, OutputT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function1<r<? super PropsT, StateT, ? extends OutputT>.c, Unit> f35919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0<String> f35920d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super r<? super PropsT, StateT, ? extends OutputT>.c, Unit> function1, Function0<String> function0) {
            this.f35919c = function1;
            this.f35920d = function0;
        }

        @Override // ym.r
        public void a(@NotNull r<? super PropsT, StateT, ? extends OutputT>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            this.f35919c.invoke(cVar);
        }

        @NotNull
        public String toString() {
            return "WorkflowAction(" + this.f35920d.invoke() + ")@" + hashCode();
        }
    }

    @NotNull
    public static final <PropsT, StateT, OutputT> r<PropsT, StateT, OutputT> a(@NotNull String name, @NotNull Function1<? super r<? super PropsT, StateT, ? extends OutputT>.c, Unit> apply) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(apply, "apply");
        return w.c(new a(name), apply);
    }

    @NotNull
    public static final <PropsT, StateT, OutputT> r<PropsT, StateT, OutputT> b(@NotNull Function0<String> name, @NotNull Function1<? super r<? super PropsT, StateT, ? extends OutputT>.c, Unit> apply) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(apply, "apply");
        return new b(apply, name);
    }

    public static /* synthetic */ r c(String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return w.b(str, function1);
    }

    @NotNull
    public static final <PropsT, StateT, OutputT> Pair<StateT, WorkflowOutput<OutputT>> d(@NotNull r<? super PropsT, StateT, ? extends OutputT> rVar, PropsT propst, StateT statet) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        r<? super Object, StateT, ? extends Object>.c cVar = new r.c(rVar, propst, statet);
        rVar.a(cVar);
        return new Pair<>(cVar.c(), cVar.a());
    }
}
