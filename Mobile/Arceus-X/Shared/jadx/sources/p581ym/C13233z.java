package p581ym;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ym.z */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a{\u0010\t\u001a\u001e0\bR\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u0087\u0001\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2(\u0010\u0011\u001a$\u0012\u001a\u0012\u00180\u000eR\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0004\u0012\u00020\u00100\r¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u008b\u0001\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142(\u0010\u0011\u001a$\u0012\u001a\u0012\u00180\u000eR\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0004\u0012\u00020\u00100\r¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"PropsT", "StateT", "OutputT", "RenderingT", "Lym/a;", "baseContext", "Lym/k;", "workflow", "Lym/k$a;", "a", "(Lym/a;Lym/k;)Lym/k$a;", "", "name", "Lkotlin/Function1;", "Lym/r$c;", "Lym/r;", "", "update", "b", "(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lym/r;", "Lkotlin/Function0;", "c", "(Lym/k;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lym/r;", "wf1-workflow-core"}, m31666k = 5, m31667mv = {1, 6, 0}, m31669xi = 48, m31670xs = "com/squareup/workflow1/Workflows")
public final /* synthetic */ class C13233z {

    /* JADX INFO: renamed from: ym.z$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m31665d2 = {"PropsT", "StateT", "OutputT", "RenderingT", "", "b", "()Ljava/lang/String;"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class a extends AbstractC7746m implements Function0<String> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ String f46571i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f46571i = str;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f46571i;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [StateT, OutputT, PropsT] */
    /* JADX INFO: renamed from: ym.z$b */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001J)\u0010\u0004\u001a\u00020\u0003*\u00180\u0002R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"ym/z$b", "Lym/r;", "Lym/r$c;", "", "a", "(Lym/r$c;)V", "", "toString", "()Ljava/lang/String;", "wf1-workflow-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class b<OutputT, PropsT, StateT> extends AbstractC13225r<PropsT, StateT, OutputT> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function1<AbstractC13225r<? super PropsT, StateT, ? extends OutputT>.c, Unit> f46572c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Function0<String> f46573d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AbstractC13218k<PropsT, StateT, OutputT, RenderingT> f46574e;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super ym.r<? super PropsT, StateT, ? extends OutputT>$c, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: ym.k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super AbstractC13225r<? super PropsT, StateT, ? extends OutputT>.c, Unit> function1, Function0<String> function0, AbstractC13218k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> abstractC13218k) {
            this.f46572c = function1;
            this.f46573d = function0;
            this.f46574e = abstractC13218k;
        }

        @Override // p581ym.AbstractC13225r
        /* JADX INFO: renamed from: a */
        public void mo48844a(@NotNull AbstractC13225r<? super PropsT, StateT, ? extends OutputT>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            this.f46572c.invoke(cVar);
        }

        @NotNull
        public String toString() {
            return "action(" + this.f46573d.invoke() + ")-" + this.f46574e;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <PropsT, StateT, OutputT, RenderingT> AbstractC13218k<PropsT, StateT, OutputT, RenderingT>.a m48943a(@NotNull InterfaceC13205a<? extends PropsT, StateT, ? super OutputT> baseContext, @NotNull AbstractC13218k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> workflow) {
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        AbstractC13218k<PropsT, StateT, OutputT, RenderingT>.a aVar = baseContext instanceof AbstractC13218k.a ? (AbstractC13218k.a) baseContext : null;
        return aVar == null ? new AbstractC13218k.a(workflow, baseContext) : aVar;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <PropsT, StateT, OutputT, RenderingT> AbstractC13225r<PropsT, StateT, OutputT> m48944b(@NotNull AbstractC13218k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> abstractC13218k, @NotNull String name, @NotNull Function1<? super AbstractC13225r<? super PropsT, StateT, ? extends OutputT>.c, Unit> update) {
        Intrinsics.checkNotNullParameter(abstractC13218k, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(update, "update");
        return C13230w.m48930e(abstractC13218k, new a(name), update);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <PropsT, StateT, OutputT, RenderingT> AbstractC13225r<PropsT, StateT, OutputT> m48945c(@NotNull AbstractC13218k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> abstractC13218k, @NotNull Function0<String> name, @NotNull Function1<? super AbstractC13225r<? super PropsT, StateT, ? extends OutputT>.c, Unit> update) {
        Intrinsics.checkNotNullParameter(abstractC13218k, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(update, "update");
        return new b(update, name, abstractC13218k);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ AbstractC13225r m48946d(AbstractC13218k abstractC13218k, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return C13230w.m48929d(abstractC13218k, str, function1);
    }
}
