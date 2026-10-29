package p581ym;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: ym.k */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u0001*\u0006\b\u0003\u0010\u0004 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005:\u0001\u001cB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00028\u00012\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u0016\u001a\u00028\u00032\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00012\"\u0010\u0015\u001a\u001e0\u0014R\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00028\u0001H&¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m31665d2 = {"Lym/k;", "PropsT", "StateT", "OutputT", "RenderingT", "Lym/q;", "<init>", "()V", "props", "Lym/i;", "snapshot", "d", "(Ljava/lang/Object;Lym/i;)Ljava/lang/Object;", "old", "new", "state", "e", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "renderProps", "renderState", "Lym/k$a;", "context", "f", "(Ljava/lang/Object;Ljava/lang/Object;Lym/k$a;)Ljava/lang/Object;", "g", "(Ljava/lang/Object;)Lym/i;", "b", "()Lym/k;", "a", "wf1-workflow-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public abstract class AbstractC13218k<PropsT, StateT, OutputT, RenderingT> implements InterfaceC13224q<PropsT, OutputT, RenderingT> {

    /* JADX INFO: renamed from: ym.k$a */
    @Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001B#\b\u0000\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004Jt\u0010\u0010\u001a\u00028\u0006\"\u0004\b\u0004\u0010\u0005\"\u0004\b\u0005\u0010\u0006\"\u0004\b\u0006\u0010\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\b2\u0006\u0010\n\u001a\u00028\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2$\u0010\u000f\u001a \u0012\u0004\u0012\u00028\u0005\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e0\rH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0018\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0012H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R,\u0010\u001d\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e0\u001a8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m31665d2 = {"Lym/k$a;", "Lym/a;", "baseContext", "<init>", "(Lym/k;Lym/a;)V", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Lym/q;", "child", "props", "", "key", "Lkotlin/Function1;", "Lym/r;", "handler", "c", "(Lym/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lku/p0;", "Lnt/b;", "", "", "sideEffect", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lym/h;", "d", "()Lym/h;", "actionSink", "wf1-workflow-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public final class a implements InterfaceC13205a<PropsT, StateT, OutputT> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC13205a<PropsT, StateT, OutputT> f46521c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC13218k<PropsT, StateT, OutputT, RenderingT> f46522d;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: ym.a<? extends PropsT, StateT, ? super OutputT> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull AbstractC13218k this$0, InterfaceC13205a<? extends PropsT, StateT, ? super OutputT> baseContext) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(baseContext, "baseContext");
            this.f46522d = this$0;
            this.f46521c = baseContext;
        }

        @Override // p581ym.InterfaceC13205a
        /* JADX INFO: renamed from: b */
        public void mo48835b(@NotNull String key, @NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super Unit>, ? extends Object> sideEffect) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
            this.f46521c.mo48835b(key, sideEffect);
        }

        @Override // p581ym.InterfaceC13205a
        /* JADX INFO: renamed from: c */
        public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT mo48836c(@NotNull InterfaceC13224q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, @NotNull String key, @NotNull Function1<? super ChildOutputT, ? extends AbstractC13225r<? super PropsT, StateT, ? extends OutputT>> handler) {
            Intrinsics.checkNotNullParameter(child, "child");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(handler, "handler");
            return (ChildRenderingT) this.f46521c.mo48836c(child, props, key, handler);
        }

        @Override // p581ym.InterfaceC13205a
        @NotNull
        /* JADX INFO: renamed from: d */
        public InterfaceC13215h<AbstractC13225r<? super PropsT, StateT, ? extends OutputT>> mo48837d() {
            return this.f46521c.mo48837d();
        }
    }

    @Override // p581ym.InterfaceC13224q
    @NotNull
    /* JADX INFO: renamed from: b */
    public final AbstractC13218k<PropsT, StateT, OutputT, RenderingT> mo48881b() {
        return this;
    }

    /* JADX INFO: renamed from: d */
    public abstract StateT mo16430d(PropsT props, @Nullable Snapshot snapshot);

    /* JADX INFO: renamed from: e */
    public StateT mo48882e(PropsT old, PropsT propst, StateT state) {
        return state;
    }

    /* JADX INFO: renamed from: f */
    public abstract RenderingT mo16431f(PropsT renderProps, StateT renderState, @NotNull AbstractC13218k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT>.a context);

    @Nullable
    /* JADX INFO: renamed from: g */
    public abstract Snapshot mo16432g(StateT state);
}
