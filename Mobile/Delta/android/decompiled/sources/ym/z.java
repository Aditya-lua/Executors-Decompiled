package ym;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a{\u0010\t\u001a\u001e0\bR\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u0087\u0001\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2(\u0010\u0011\u001a$\u0012\u001a\u0012\u00180\u000eR\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0004\u0012\u00020\u00100\r¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u008b\u0001\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142(\u0010\u0011\u001a$\u0012\u001a\u0012\u00180\u000eR\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0004\u0012\u00020\u00100\r¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"PropsT", "StateT", "OutputT", "RenderingT", "Lym/a;", "baseContext", "Lym/k;", "workflow", "Lym/k$a;", "a", "(Lym/a;Lym/k;)Lym/k$a;", "", "name", "Lkotlin/Function1;", "Lym/r$c;", "Lym/r;", "", "update", "b", "(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lym/r;", "Lkotlin/Function0;", "c", "(Lym/k;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lym/r;", "wf1-workflow-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "com/squareup/workflow1/Workflows")
public final /* synthetic */ class z {

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"PropsT", "StateT", "OutputT", "RenderingT", "", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    public static final class a extends kotlin.jvm.internal.m implements Function0<String> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f35983i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f35983i = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f35983i;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [StateT, OutputT, PropsT] */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001J)\u0010\u0004\u001a\u00020\u0003*\u00180\u0002R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ym/z$b", "Lym/r;", "Lym/r$c;", "", "a", "(Lym/r$c;)V", "", "toString", "()Ljava/lang/String;", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class b<OutputT, PropsT, StateT> extends r<PropsT, StateT, OutputT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function1<r<? super PropsT, StateT, ? extends OutputT>.c, Unit> f35984c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0<String> f35985d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ k<PropsT, StateT, OutputT, RenderingT> f35986e;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super r<? super PropsT, StateT, ? extends OutputT>.c, Unit> function1, Function0<String> function0, k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> kVar) {
            this.f35984c = function1;
            this.f35985d = function0;
            this.f35986e = kVar;
        }

        @Override // ym.r
        public void a(@NotNull r<? super PropsT, StateT, ? extends OutputT>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            this.f35984c.invoke(cVar);
        }

        @NotNull
        public String toString() {
            return "action(" + this.f35985d.invoke() + ")-" + this.f35986e;
        }
    }

    @NotNull
    public static final <PropsT, StateT, OutputT, RenderingT> k<PropsT, StateT, OutputT, RenderingT>.a a(@NotNull ym.a<? extends PropsT, StateT, ? super OutputT> baseContext, @NotNull k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> workflow) {
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        k<PropsT, StateT, OutputT, RenderingT>.a aVar = baseContext instanceof k.a ? (k.a) baseContext : null;
        return aVar == null ? new k.a(workflow, baseContext) : aVar;
    }

    @NotNull
    public static final <PropsT, StateT, OutputT, RenderingT> r<PropsT, StateT, OutputT> b(@NotNull k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> kVar, @NotNull String name, @NotNull Function1<? super r<? super PropsT, StateT, ? extends OutputT>.c, Unit> update) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(update, "update");
        return w.e(kVar, new a(name), update);
    }

    @NotNull
    public static final <PropsT, StateT, OutputT, RenderingT> r<PropsT, StateT, OutputT> c(@NotNull k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> kVar, @NotNull Function0<String> name, @NotNull Function1<? super r<? super PropsT, StateT, ? extends OutputT>.c, Unit> update) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(update, "update");
        return new b(update, name, kVar);
    }

    public static /* synthetic */ r d(k kVar, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return w.d(kVar, str, function1);
    }
}
