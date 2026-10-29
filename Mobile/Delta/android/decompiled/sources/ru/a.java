package ru;

import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ku.b1;
import org.jetbrains.annotations.NotNull;
import qu.j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aQ\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u00032\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000f\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"R", "T", "Lkotlin/Function2;", "Lnt/b;", "", "receiver", "completion", "", "b", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lnt/b;)V", "fatalCompletion", "c", "(Lnt/b;Lnt/b;)V", "", "e", "a", "(Lnt/b;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    public static final void a(nt.b<?> bVar, Throwable th2) throws Throwable {
        if (th2 instanceof b1) {
            th2 = ((b1) th2).getCause();
        }
        n.Companion companion = n.INSTANCE;
        bVar.resumeWith(n.b(o.a(th2)));
        throw th2;
    }

    public static final <R, T> void b(@NotNull Function2<? super R, ? super nt.b<? super T>, ? extends Object> function2, R r8, @NotNull nt.b<? super T> bVar) {
        try {
            nt.b bVarC = ot.b.c(ot.b.a(function2, r8, bVar));
            n.Companion companion = n.INSTANCE;
            j.b(bVarC, n.b(Unit.f22483a));
        } catch (Throwable th2) {
            a(bVar, th2);
        }
    }

    public static final void c(@NotNull nt.b<? super Unit> bVar, @NotNull nt.b<?> bVar2) throws Throwable {
        try {
            nt.b bVarC = ot.b.c(bVar);
            n.Companion companion = n.INSTANCE;
            j.b(bVarC, n.b(Unit.f22483a));
        } catch (Throwable th2) {
            a(bVar2, th2);
        }
    }
}
