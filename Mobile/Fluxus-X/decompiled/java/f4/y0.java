package f4;

import l4.CreationExtras;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lf4/q;", "Lxu/c;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/b1;", "storeProducer", "Ll4/a;", "extrasProducer", "Landroidx/lifecycle/a1$c;", "factoryProducer", "Lzt/h;", "b", "(Lf4/q;Lxu/c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lzt/h;", "Landroidx/lifecycle/c1;", "owner", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class y0 {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/a1$c;", "b", "()Landroidx/lifecycle/a1$c;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends p001kotlin.jvm.internal.m implements Function0<androidx.lifecycle.a1.c> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ q f15619i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q qVar) {
            super(0);
            this.f15619i = qVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.a1.c invoke() {
            return this.f15619i.W();
        }
    }

    @NotNull
    public static final <VM extends androidx.p000lifecycle.x0> zt.h<VM> b(@NotNull q qVar, @NotNull xu.c<VM> cVar, @NotNull Function0<? extends androidx.p000lifecycle.b1> function0, @NotNull Function0<? extends CreationExtras> function1, @Nullable Function0<? extends androidx.lifecycle.a1.c> function2) {
        if (function2 == null) {
            function2 = new a(qVar);
        }
        return new androidx.p000lifecycle.z0(cVar, function0, function2, function1);
    }

    public static final androidx.p000lifecycle.c1 c(zt.h<? extends androidx.p000lifecycle.c1> hVar) {
        return hVar.getValue();
    }
}
