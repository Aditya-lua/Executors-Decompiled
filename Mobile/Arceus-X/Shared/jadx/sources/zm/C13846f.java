package zm;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.InterfaceC8690y;
import org.jetbrains.annotations.NotNull;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p581ym.AbstractC13225r;
import p581ym.InterfaceC13205a;
import p581ym.InterfaceC13215h;
import p581ym.InterfaceC13224q;

/* JADX INFO: renamed from: zm.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u0005:\u00022$BI\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001e\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012Jq\u0010\u001d\u001a\u00028\u0005\"\u0004\b\u0003\u0010\u0013\"\u0004\b\u0004\u0010\u0014\"\u0004\b\u0005\u0010\u00152\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00162\u0006\u0010\u0018\u001a\u00028\u00032\u0006\u0010\u001a\u001a\u00020\u00192$\u0010\u001c\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ>\u0010$\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\"\u0010#\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100!\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0010H\u0002¢\u0006\u0004\b(\u0010'R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00078\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R,\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010,R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010.R,\u00101\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, m31665d2 = {"Lzm/f;", "PropsT", "StateT", "OutputT", "Lym/a;", "Lym/h;", "Lym/r;", "Lzm/f$a;", "renderer", "Lzm/f$b;", "sideEffectRunner", "Lmu/y;", "eventActionsChannel", "<init>", "(Lzm/f$a;Lzm/f$b;Lmu/y;)V", "value", "", "g", "(Lym/r;)V", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Lym/q;", "child", "props", "", "key", "Lkotlin/Function1;", "handler", "c", "(Lym/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lku/p0;", "Lnt/b;", "", "sideEffect", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "f", "()V", "e", "Lzm/f$a;", "d", "Lzm/f$b;", "Lmu/y;", "", "Z", "frozen", "()Lym/h;", "actionSink", "a", "wf1-workflow-runtime"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C13846f<PropsT, StateT, OutputT> implements InterfaceC13205a<PropsT, StateT, OutputT>, InterfaceC13215h<AbstractC13225r<? super PropsT, StateT, ? extends OutputT>> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final a<PropsT, StateT, OutputT> renderer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final b sideEffectRunner;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8690y<AbstractC13225r<? super PropsT, StateT, ? extends OutputT>> eventActionsChannel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean frozen;

    /* JADX INFO: renamed from: zm.f$a */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\u00020\u0004Jq\u0010\u0010\u001a\u00028\b\"\u0004\b\u0006\u0010\u0005\"\u0004\b\u0007\u0010\u0006\"\u0004\b\b\u0010\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0\b2\u0006\u0010\n\u001a\u00028\u00062\u0006\u0010\f\u001a\u00020\u000b2$\u0010\u000f\u001a \u0012\u0004\u0012\u00028\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lzm/f$a;", "PropsT", "StateT", "OutputT", "", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Lym/q;", "child", "props", "", "key", "Lkotlin/Function1;", "Lym/r;", "handler", "a", "(Lym/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "wf1-workflow-runtime"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public interface a<PropsT, StateT, OutputT> {
        /* JADX INFO: renamed from: a */
        <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT mo50370a(@NotNull InterfaceC13224q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, @NotNull String key, @NotNull Function1<? super ChildOutputT, ? extends AbstractC13225r<? super PropsT, StateT, ? extends OutputT>> handler);
    }

    /* JADX INFO: renamed from: zm.f$b */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J>\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m31665d2 = {"Lzm/f$b;", "", "", "key", "Lkotlin/Function2;", "Lku/p0;", "Lnt/b;", "", "sideEffect", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "wf1-workflow-runtime"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public interface b {
        /* JADX INFO: renamed from: b */
        void mo50371b(@NotNull String key, @NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super Unit>, ? extends Object> sideEffect);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: mu.y<? super ym.r<? super PropsT, StateT, ? extends OutputT>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C13846f(@NotNull a<PropsT, StateT, OutputT> renderer, @NotNull b sideEffectRunner, @NotNull InterfaceC8690y<? super AbstractC13225r<? super PropsT, StateT, ? extends OutputT>> eventActionsChannel) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(sideEffectRunner, "sideEffectRunner");
        Intrinsics.checkNotNullParameter(eventActionsChannel, "eventActionsChannel");
        this.renderer = renderer;
        this.sideEffectRunner = sideEffectRunner;
        this.eventActionsChannel = eventActionsChannel;
    }

    @Override // p581ym.InterfaceC13205a
    /* JADX INFO: renamed from: b */
    public void mo48835b(@NotNull String key, @NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super Unit>, ? extends Object> sideEffect) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        m50367e();
        this.sideEffectRunner.mo50371b(key, sideEffect);
    }

    @Override // p581ym.InterfaceC13205a
    /* JADX INFO: renamed from: c */
    public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT mo48836c(@NotNull InterfaceC13224q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, @NotNull String key, @NotNull Function1<? super ChildOutputT, ? extends AbstractC13225r<? super PropsT, StateT, ? extends OutputT>> handler) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        m50367e();
        return (ChildRenderingT) this.renderer.mo50370a(child, props, key, handler);
    }

    @Override // p581ym.InterfaceC13205a
    @NotNull
    /* JADX INFO: renamed from: d */
    public InterfaceC13215h<AbstractC13225r<? super PropsT, StateT, ? extends OutputT>> mo48837d() {
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m50367e() {
        if (this.frozen) {
            throw new IllegalStateException("RenderContext cannot be used after render method returns.");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m50368f() {
        m50367e();
        this.frozen = true;
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
    @Override // p581ym.InterfaceC13215h
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo17905a(@NotNull AbstractC13225r<? super PropsT, StateT, ? extends OutputT> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!this.frozen) {
            throw new UnsupportedOperationException(Intrinsics.m31989l("Expected sink to not be sent to until after the render pass. Received action: ", value));
        }
        this.eventActionsChannel.offer(value);
    }
}
