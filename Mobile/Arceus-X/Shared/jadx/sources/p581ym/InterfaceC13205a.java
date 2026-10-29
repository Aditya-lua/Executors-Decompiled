package p581ym;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: ym.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00002\u00020\u0004Js\u0010\u0010\u001a\u00028\u0005\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u0006\"\u0004\b\u0005\u0010\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\b2\u0006\u0010\n\u001a\u00028\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2$\u0010\u000f\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011J>\u0010\u0017\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\"\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0012H&ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R,\u0010\u001c\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e0\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m31665d2 = {"Lym/a;", "PropsT", "StateT", "OutputT", "", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Lym/q;", "child", "props", "", "key", "Lkotlin/Function1;", "Lym/r;", "handler", "c", "(Lym/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lku/p0;", "Lnt/b;", "", "sideEffect", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lym/h;", "d", "()Lym/h;", "actionSink", "wf1-workflow-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public interface InterfaceC13205a<PropsT, StateT, OutputT> {

    /* JADX INFO: renamed from: ym.a$a */
    @Metadata(m31666k = 3, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Object m48838a(InterfaceC13205a interfaceC13205a, InterfaceC13224q interfaceC13224q, Object obj, String str, Function1 function1, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderChild");
            }
            if ((i10 & 4) != 0) {
                str = "";
            }
            return interfaceC13205a.mo48836c(interfaceC13224q, obj, str, function1);
        }
    }

    /* JADX INFO: renamed from: b */
    void mo48835b(@NotNull String key, @NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super Unit>, ? extends Object> sideEffect);

    /* JADX INFO: renamed from: c */
    <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT mo48836c(@NotNull InterfaceC13224q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, @NotNull String key, @NotNull Function1<? super ChildOutputT, ? extends AbstractC13225r<? super PropsT, StateT, ? extends OutputT>> handler);

    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC13215h<AbstractC13225r<? super PropsT, StateT, ? extends OutputT>> mo48837d();
}
