package ru;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7839b1;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p395qu.C10728j;

/* JADX INFO: renamed from: ru.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aQ\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u00032\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000f\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"R", "T", "Lkotlin/Function2;", "Lnt/b;", "", "receiver", "completion", "", "b", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lnt/b;)V", "fatalCompletion", "c", "(Lnt/b;Lnt/b;)V", "", "e", "a", "(Lnt/b;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C11136a {
    /* JADX INFO: renamed from: a */
    public static final void m41908a(InterfaceC9557b<?> interfaceC9557b, Throwable th2) throws Throwable {
        if (th2 instanceof C7839b1) {
            th2 = ((C7839b1) th2).getCause();
        }
        C7347n.Companion companion = C7347n.INSTANCE;
        interfaceC9557b.resumeWith(C7347n.m30460b(C7348o.m30469a(th2)));
        throw th2;
    }

    /* JADX INFO: renamed from: b */
    public static final <R, T> void m41909b(@NotNull Function2<? super R, ? super InterfaceC9557b<? super T>, ? extends Object> function2, R r8, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        try {
            InterfaceC9557b interfaceC9557bM38803c = C10046b.m38803c(C10046b.m38801a(function2, r8, interfaceC9557b));
            C7347n.Companion companion = C7347n.INSTANCE;
            C10728j.m40867b(interfaceC9557bM38803c, C7347n.m30460b(Unit.f29331a));
        } catch (Throwable th2) {
            m41908a(interfaceC9557b, th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m41910c(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b, @NotNull InterfaceC9557b<?> interfaceC9557b2) throws Throwable {
        try {
            InterfaceC9557b interfaceC9557bM38803c = C10046b.m38803c(interfaceC9557b);
            C7347n.Companion companion = C7347n.INSTANCE;
            C10728j.m40867b(interfaceC9557bM38803c, C7347n.m30460b(Unit.f29331a));
        } catch (Throwable th2) {
            m41908a(interfaceC9557b2, th2);
        }
    }
}
