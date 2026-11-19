package ln;

import av.p0;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u0001*\u0006\b\u0003\u0010\u0004 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005:\u0001\u001cB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00028\u00012\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u0016\u001a\u00028\u00032\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00012\"\u0010\u0015\u001a\u001e0\u0014R\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00028\u0001H&¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lln/k;", "PropsT", "StateT", "OutputT", "RenderingT", "Lln/q;", "<init>", "()V", "props", "Lln/i;", "snapshot", "d", "(Ljava/lang/Object;Lln/i;)Ljava/lang/Object;", "old", "new", "state", "e", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "renderProps", "renderState", "Lln/k$a;", "context", "f", "(Ljava/lang/Object;Ljava/lang/Object;Lln/k$a;)Ljava/lang/Object;", "g", "(Ljava/lang/Object;)Lln/i;", "b", "()Lln/k;", "a", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class k<PropsT, StateT, OutputT, RenderingT> implements q<PropsT, OutputT, RenderingT> {

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001B#\b\u0000\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004Jt\u0010\u0010\u001a\u00028\u0006\"\u0004\b\u0004\u0010\u0005\"\u0004\b\u0005\u0010\u0006\"\u0004\b\u0006\u0010\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\b2\u0006\u0010\n\u001a\u00028\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2$\u0010\u000f\u001a \u0012\u0004\u0012\u00028\u0005\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e0\rH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0018\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0012H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R,\u0010\u001d\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e0\u001a8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lln/k$a;", "Lln/a;", "baseContext", "<init>", "(Lln/k;Lln/a;)V", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Lln/q;", "child", "props", BuildConfig.FLAVOR, "key", "Lkotlin/Function1;", "Lln/r;", "handler", "c", "(Lln/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lav/p0;", "Leu/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "sideEffect", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lln/h;", "d", "()Lln/h;", "actionSink", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class a implements ln.a<PropsT, StateT, OutputT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ln.a<PropsT, StateT, OutputT> f22333a;
        public final /* synthetic */ k<PropsT, StateT, OutputT, RenderingT> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull k this$0, ln.a<? extends PropsT, StateT, ? super OutputT> baseContext) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(baseContext, "baseContext");
            this.b = this$0;
            this.f22333a = baseContext;
        }

        @Override // ln.a
        public void b(@NotNull String key, @NotNull Function2<? super p0, ? super eu.b<? super Unit>, ? extends Object> sideEffect) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
            this.f22333a.b(key, sideEffect);
        }

        @Override // ln.a
        public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT c(@NotNull q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, @NotNull String key, @NotNull Function1<? super ChildOutputT, ? extends r<? super PropsT, StateT, ? extends OutputT>> handler) {
            Intrinsics.checkNotNullParameter(child, "child");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(handler, "handler");
            return (ChildRenderingT) this.f22333a.c(child, props, key, handler);
        }

        @Override // ln.a
        @NotNull
        public h<r<? super PropsT, StateT, ? extends OutputT>> d() {
            return this.f22333a.d();
        }
    }

    @Override // ln.q
    @NotNull
    public final k<PropsT, StateT, OutputT, RenderingT> b() {
        return this;
    }

    public abstract StateT d(PropsT props, @Nullable Snapshot snapshot);

    public StateT e(PropsT old, PropsT propst, StateT state) {
        return state;
    }

    public abstract RenderingT f(PropsT renderProps, StateT renderState, @NotNull k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT>.a context);

    @Nullable
    public abstract Snapshot g(StateT state);
}
