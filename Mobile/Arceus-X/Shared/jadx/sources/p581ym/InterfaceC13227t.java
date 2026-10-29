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
import p615zt.InterfaceC14057n;
import p615zt.InterfaceC14058o;

/* JADX INFO: renamed from: ym.t */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0016\u0007J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJQ\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J[\u0010\u0016\u001a\u00028\u0001\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00012\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u008d\u0001\u0010\u001f\u001a\u00028\u0003\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00192\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001c22\u0010\u000f\u001a.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001e\u0012\u0004\u0012\u00028\u00030\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 J=\u0010\"\u001a\u0004\u0018\u00010\f\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0014\u001a\u00028\u00002\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#¨\u0006$"}, m31665d2 = {"Lym/t;", "", "Lku/p0;", "workflowScope", "Lym/t$c;", "session", "", "c", "(Lku/p0;Lym/t$c;)V", "P", "S", "props", "Lym/i;", "snapshot", "Lkotlin/Function2;", "proceed", "d", "(Ljava/lang/Object;Lym/i;Lkotlin/jvm/functions/Function2;Lym/t$c;)Ljava/lang/Object;", "old", "new", "state", "Lkotlin/Function3;", "b", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lzt/n;Lym/t$c;)Ljava/lang/Object;", "O", "R", "renderProps", "renderState", "Lym/a;", "context", "Lym/t$b;", "e", "(Ljava/lang/Object;Ljava/lang/Object;Lym/a;Lzt/n;Lym/t$c;)Ljava/lang/Object;", "Lkotlin/Function1;", "a", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lym/t$c;)Lym/i;", "wf1-workflow-runtime"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public interface InterfaceC13227t {

    /* JADX INFO: renamed from: ym.t$a */
    @Metadata(m31666k = 3, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static <P, S> S m48913a(@NotNull InterfaceC13227t interfaceC13227t, P p8, @Nullable Snapshot snapshot, @NotNull Function2<? super P, ? super Snapshot, ? extends S> proceed, @NotNull c session) {
            Intrinsics.checkNotNullParameter(interfaceC13227t, "this");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            Intrinsics.checkNotNullParameter(session, "session");
            return proceed.invoke(p8, snapshot);
        }

        /* JADX INFO: renamed from: b */
        public static <P, S> S m48914b(@NotNull InterfaceC13227t interfaceC13227t, P p8, P p10, S s8, @NotNull InterfaceC14057n<? super P, ? super P, ? super S, ? extends S> proceed, @NotNull c session) {
            Intrinsics.checkNotNullParameter(interfaceC13227t, "this");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            Intrinsics.checkNotNullParameter(session, "session");
            return proceed.invoke(p8, p10, s8);
        }

        /* JADX INFO: renamed from: c */
        public static <P, S, O, R> R m48915c(@NotNull InterfaceC13227t interfaceC13227t, P p8, S s8, @NotNull InterfaceC13205a<? extends P, S, ? super O> context, @NotNull InterfaceC14057n<? super P, ? super S, ? super b<P, S, O>, ? extends R> proceed, @NotNull c session) {
            Intrinsics.checkNotNullParameter(interfaceC13227t, "this");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            Intrinsics.checkNotNullParameter(session, "session");
            return proceed.invoke(p8, s8, null);
        }

        /* JADX INFO: renamed from: d */
        public static void m48916d(@NotNull InterfaceC13227t interfaceC13227t, @NotNull InterfaceC7906p0 workflowScope, @NotNull c session) {
            Intrinsics.checkNotNullParameter(interfaceC13227t, "this");
            Intrinsics.checkNotNullParameter(workflowScope, "workflowScope");
            Intrinsics.checkNotNullParameter(session, "session");
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public static <S> Snapshot m48917e(@NotNull InterfaceC13227t interfaceC13227t, S s8, @NotNull Function1<? super S, Snapshot> proceed, @NotNull c session) {
            Intrinsics.checkNotNullParameter(interfaceC13227t, "this");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            Intrinsics.checkNotNullParameter(session, "session");
            return proceed.invoke(s8);
        }
    }

    /* JADX INFO: renamed from: ym.t$b */
    @Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004JO\u0010\n\u001a\u00020\b2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052$\u0010\t\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJh\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u001c\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00072.\u0010\t\u001a*\u0012\u0004\u0012\u00020\f\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0007\u0012\u0004\u0012\u00020\b0\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012JÇ\u0001\u0010\u001b\u001a\u00028\u0005\"\u0004\b\u0003\u0010\u0013\"\u0004\b\u0004\u0010\u0014\"\u0004\b\u0005\u0010\u00152\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00162\u0006\u0010\u0018\u001a\u00028\u00032\u0006\u0010\r\u001a\u00020\f2$\u0010\u0019\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u00072T\u0010\t\u001aP\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0016\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\f\u0012\"\u0012 \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u0007\u0012\u0004\u0012\u00028\u00050\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m31665d2 = {"Lym/t$b;", "P", "S", "O", "", "Lym/r;", "action", "Lkotlin/Function1;", "", "proceed", "b", "(Lym/r;Lkotlin/jvm/functions/Function1;)V", "", "key", "Lnt/b;", "sideEffect", "Lkotlin/Function2;", "c", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "CP", "CO", "CR", "Lym/q;", "child", "childProps", "handler", "Lkotlin/Function4;", "a", "(Lym/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lzt/o;)Ljava/lang/Object;", "wf1-workflow-runtime"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public interface b<P, S, O> {
        /* JADX INFO: renamed from: a */
        <CP, CO, CR> CR mo48918a(@NotNull InterfaceC13224q<? super CP, ? extends CO, ? extends CR> child, CP childProps, @NotNull String key, @NotNull Function1<? super CO, ? extends AbstractC13225r<? super P, S, ? extends O>> handler, @NotNull InterfaceC14058o<? super InterfaceC13224q<? super CP, ? extends CO, ? extends CR>, ? super CP, ? super String, ? super Function1<? super CO, ? extends AbstractC13225r<? super P, S, ? extends O>>, ? extends CR> proceed);

        /* JADX INFO: renamed from: b */
        void mo48919b(@NotNull AbstractC13225r<? super P, S, ? extends O> action, @NotNull Function1<? super AbstractC13225r<? super P, S, ? extends O>, Unit> proceed);

        /* JADX INFO: renamed from: c */
        void mo48920c(@NotNull String key, @NotNull Function1<? super InterfaceC9557b<? super Unit>, ? extends Object> sideEffect, @NotNull Function2<? super String, ? super Function1<? super InterfaceC9557b<? super Unit>, ? extends Object>, Unit> proceed);
    }

    /* JADX INFO: renamed from: ym.t$c */
    @Metadata(m31664d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31665d2 = {"Lym/t$c;", "", "wf1-workflow-runtime"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public interface c {
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    <S> Snapshot mo48861a(S state, @NotNull Function1<? super S, Snapshot> proceed, @NotNull c session);

    /* JADX INFO: renamed from: b */
    <P, S> S mo48862b(P old, P p8, S state, @NotNull InterfaceC14057n<? super P, ? super P, ? super S, ? extends S> proceed, @NotNull c session);

    /* JADX INFO: renamed from: c */
    void mo48863c(@NotNull InterfaceC7906p0 workflowScope, @NotNull c session);

    /* JADX INFO: renamed from: d */
    <P, S> S mo48864d(P props, @Nullable Snapshot snapshot, @NotNull Function2<? super P, ? super Snapshot, ? extends S> proceed, @NotNull c session);

    /* JADX INFO: renamed from: e */
    <P, S, O, R> R mo48865e(P renderProps, S renderState, @NotNull InterfaceC13205a<? extends P, S, ? super O> context, @NotNull InterfaceC14057n<? super P, ? super S, ? super b<P, S, O>, ? extends R> proceed, @NotNull c session);
}
