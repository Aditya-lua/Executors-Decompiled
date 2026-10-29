package ym;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0016\u0007J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJQ\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J[\u0010\u0016\u001a\u00028\u0001\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00012\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u008d\u0001\u0010\u001f\u001a\u00028\u0003\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00192\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001c22\u0010\u000f\u001a.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001e\u0012\u0004\u0012\u00028\u00030\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 J=\u0010\"\u001a\u0004\u0018\u00010\f\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0014\u001a\u00028\u00002\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lym/t;", "", "Lku/p0;", "workflowScope", "Lym/t$c;", "session", "", "c", "(Lku/p0;Lym/t$c;)V", "P", "S", "props", "Lym/i;", "snapshot", "Lkotlin/Function2;", "proceed", "d", "(Ljava/lang/Object;Lym/i;Lkotlin/jvm/functions/Function2;Lym/t$c;)Ljava/lang/Object;", "old", "new", "state", "Lkotlin/Function3;", "b", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lzt/n;Lym/t$c;)Ljava/lang/Object;", "O", "R", "renderProps", "renderState", "Lym/a;", "context", "Lym/t$b;", "e", "(Ljava/lang/Object;Ljava/lang/Object;Lym/a;Lzt/n;Lym/t$c;)Ljava/lang/Object;", "Lkotlin/Function1;", "a", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lym/t$c;)Lym/i;", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface t {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static <P, S> S a(@NotNull t tVar, P p8, @Nullable Snapshot snapshot, @NotNull Function2<? super P, ? super Snapshot, ? extends S> proceed, @NotNull c session) {
            Intrinsics.checkNotNullParameter(tVar, "this");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            Intrinsics.checkNotNullParameter(session, "session");
            return proceed.invoke(p8, snapshot);
        }

        public static <P, S> S b(@NotNull t tVar, P p8, P p10, S s8, @NotNull zt.n<? super P, ? super P, ? super S, ? extends S> proceed, @NotNull c session) {
            Intrinsics.checkNotNullParameter(tVar, "this");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            Intrinsics.checkNotNullParameter(session, "session");
            return proceed.invoke(p8, p10, s8);
        }

        public static <P, S, O, R> R c(@NotNull t tVar, P p8, S s8, @NotNull ym.a<? extends P, S, ? super O> context, @NotNull zt.n<? super P, ? super S, ? super b<P, S, O>, ? extends R> proceed, @NotNull c session) {
            Intrinsics.checkNotNullParameter(tVar, "this");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            Intrinsics.checkNotNullParameter(session, "session");
            return proceed.invoke(p8, s8, null);
        }

        public static void d(@NotNull t tVar, @NotNull p0 workflowScope, @NotNull c session) {
            Intrinsics.checkNotNullParameter(tVar, "this");
            Intrinsics.checkNotNullParameter(workflowScope, "workflowScope");
            Intrinsics.checkNotNullParameter(session, "session");
        }

        @Nullable
        public static <S> Snapshot e(@NotNull t tVar, S s8, @NotNull Function1<? super S, Snapshot> proceed, @NotNull c session) {
            Intrinsics.checkNotNullParameter(tVar, "this");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            Intrinsics.checkNotNullParameter(session, "session");
            return proceed.invoke(s8);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004JO\u0010\n\u001a\u00020\b2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052$\u0010\t\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJh\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u001c\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00072.\u0010\t\u001a*\u0012\u0004\u0012\u00020\f\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0007\u0012\u0004\u0012\u00020\b0\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012JÇ\u0001\u0010\u001b\u001a\u00028\u0005\"\u0004\b\u0003\u0010\u0013\"\u0004\b\u0004\u0010\u0014\"\u0004\b\u0005\u0010\u00152\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00162\u0006\u0010\u0018\u001a\u00028\u00032\u0006\u0010\r\u001a\u00020\f2$\u0010\u0019\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u00072T\u0010\t\u001aP\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0016\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\f\u0012\"\u0012 \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u0007\u0012\u0004\u0012\u00028\u00050\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lym/t$b;", "P", "S", "O", "", "Lym/r;", "action", "Lkotlin/Function1;", "", "proceed", "b", "(Lym/r;Lkotlin/jvm/functions/Function1;)V", "", "key", "Lnt/b;", "sideEffect", "Lkotlin/Function2;", "c", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "CP", "CO", "CR", "Lym/q;", "child", "childProps", "handler", "Lkotlin/Function4;", "a", "(Lym/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lzt/o;)Ljava/lang/Object;", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface b<P, S, O> {
        <CP, CO, CR> CR a(@NotNull q<? super CP, ? extends CO, ? extends CR> child, CP childProps, @NotNull String key, @NotNull Function1<? super CO, ? extends r<? super P, S, ? extends O>> handler, @NotNull zt.o<? super q<? super CP, ? extends CO, ? extends CR>, ? super CP, ? super String, ? super Function1<? super CO, ? extends r<? super P, S, ? extends O>>, ? extends CR> proceed);

        void b(@NotNull r<? super P, S, ? extends O> action, @NotNull Function1<? super r<? super P, S, ? extends O>, Unit> proceed);

        void c(@NotNull String key, @NotNull Function1<? super nt.b<? super Unit>, ? extends Object> sideEffect, @NotNull Function2<? super String, ? super Function1<? super nt.b<? super Unit>, ? extends Object>, Unit> proceed);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lym/t$c;", "", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface c {
    }

    @Nullable
    <S> Snapshot a(S state, @NotNull Function1<? super S, Snapshot> proceed, @NotNull c session);

    <P, S> S b(P old, P p8, S state, @NotNull zt.n<? super P, ? super P, ? super S, ? extends S> proceed, @NotNull c session);

    void c(@NotNull p0 workflowScope, @NotNull c session);

    <P, S> S d(P props, @Nullable Snapshot snapshot, @NotNull Function2<? super P, ? super Snapshot, ? extends S> proceed, @NotNull c session);

    <P, S, O, R> R e(P renderProps, S renderState, @NotNull ym.a<? extends P, S, ? super O> context, @NotNull zt.n<? super P, ? super S, ? super b<P, S, O>, ? extends R> proceed, @NotNull c session);
}
