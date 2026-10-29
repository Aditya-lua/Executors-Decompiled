package ym;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"ym/x", "ym/y", "ym/z", "ym/a0", "ym/b0", "ym/c0"}, d2 = {}, k = 4, mv = {1, 6, 0}, xi = 48)
public final class w {
    @NotNull
    public static final <PropsT, StateT, OutputT, RenderingT> k<PropsT, StateT, OutputT, RenderingT>.a a(@NotNull a<? extends PropsT, StateT, ? super OutputT> aVar, @NotNull k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> kVar) {
        return z.a(aVar, kVar);
    }

    @NotNull
    public static final <PropsT, StateT, OutputT> r<PropsT, StateT, OutputT> b(@NotNull String str, @NotNull Function1<? super r<? super PropsT, StateT, ? extends OutputT>.c, Unit> function1) {
        return b0.a(str, function1);
    }

    @NotNull
    public static final <PropsT, StateT, OutputT> r<PropsT, StateT, OutputT> c(@NotNull Function0<String> function0, @NotNull Function1<? super r<? super PropsT, StateT, ? extends OutputT>.c, Unit> function1) {
        return b0.b(function0, function1);
    }

    @NotNull
    public static final <PropsT, StateT, OutputT, RenderingT> r<PropsT, StateT, OutputT> d(@NotNull k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> kVar, @NotNull String str, @NotNull Function1<? super r<? super PropsT, StateT, ? extends OutputT>.c, Unit> function1) {
        return z.b(kVar, str, function1);
    }

    @NotNull
    public static final <PropsT, StateT, OutputT, RenderingT> r<PropsT, StateT, OutputT> e(@NotNull k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> kVar, @NotNull Function0<String> function0, @NotNull Function1<? super r<? super PropsT, StateT, ? extends OutputT>.c, Unit> function1) {
        return z.c(kVar, function0, function1);
    }

    @NotNull
    public static final <PropsT, StateT, OutputT> Pair<StateT, WorkflowOutput<OutputT>> h(@NotNull r<? super PropsT, StateT, ? extends OutputT> rVar, PropsT propst, StateT statet) {
        return b0.d(rVar, propst, statet);
    }

    @Nullable
    public static final <T, PropsT, StateT, OutputT> Object i(@NotNull nu.h<? extends T> hVar, @NotNull h<? super r<? super PropsT, StateT, ? extends OutputT>> hVar2, @NotNull Function1<? super T, ? extends r<? super PropsT, StateT, ? extends OutputT>> function1, @NotNull nt.b<? super Unit> bVar) {
        return y.a(hVar, hVar2, function1, bVar);
    }

    @NotNull
    public static final s j(@NotNull q<?, ?, ?> qVar) {
        return c0.a(qVar);
    }

    @Nullable
    public static final <OutputT> Object k(@NotNull o<? extends OutputT> oVar, @NotNull String str, @NotNull h<? super r<? super o<? extends OutputT>, Integer, ? extends OutputT>> hVar, @NotNull nt.b<? super Unit> bVar) {
        return a0.d(oVar, str, hVar, bVar);
    }

    public static final <T, PropsT, StateT, OutputT> void l(@NotNull a<? extends PropsT, StateT, ? super OutputT> aVar, @NotNull o<? extends T> oVar, @NotNull hu.m mVar, @NotNull String str, @NotNull Function1<? super T, ? extends r<? super PropsT, StateT, ? extends OutputT>> function1) {
        x.a(aVar, oVar, mVar, str, function1);
    }

    @Nullable
    public static final <PropsT, StateT, OutputT> Object m(@NotNull h<? super r<? super PropsT, StateT, ? extends OutputT>> hVar, @NotNull r<? super PropsT, StateT, ? extends OutputT> rVar, @NotNull nt.b<? super Unit> bVar) {
        return y.b(hVar, rVar, bVar);
    }

    @NotNull
    public static final s n(@NotNull hu.m mVar) {
        return c0.b(mVar);
    }
}
