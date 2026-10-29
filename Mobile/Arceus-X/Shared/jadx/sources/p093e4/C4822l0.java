package p093e4;

import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.p616lifecycle.AbstractC0991x0;
import androidx.p616lifecycle.C0941a1;
import androidx.p616lifecycle.C0944b1;
import androidx.p616lifecycle.C0995z0;
import androidx.p616lifecycle.InterfaceC0947c1;
import hu.InterfaceC6567c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7746m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.InterfaceC7341h;
import p237k4.CreationExtras;

/* JADX INFO: renamed from: e4.l0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", "Lhu/c;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/b1;", "storeProducer", "Lk4/a;", "extrasProducer", "Landroidx/lifecycle/a1$c;", "factoryProducer", "Ljt/h;", "b", "(Landroidx/fragment/app/c;Lhu/c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljt/h;", "Landroidx/lifecycle/c1;", "owner", "fragment-ktx_release"}, m31666k = 2, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C4822l0 {

    /* JADX INFO: renamed from: e4.l0$a */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/a1$c;", "b", "()Landroidx/lifecycle/a1$c;"}, m31666k = 3, m31667mv = {1, 8, 0})
    public static final class a extends AbstractC7746m implements Function0<C0941a1.c> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ ComponentCallbacksC0929c f19491i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacksC0929c componentCallbacksC0929c) {
            super(0);
            this.f19491i = componentCallbacksC0929c;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C0941a1.c invoke() {
            return this.f19491i.mo4647X();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <VM extends AbstractC0991x0> InterfaceC7341h<VM> m23348b(@NotNull ComponentCallbacksC0929c componentCallbacksC0929c, @NotNull InterfaceC6567c<VM> interfaceC6567c, @NotNull Function0<? extends C0944b1> function0, @NotNull Function0<? extends CreationExtras> function1, @Nullable Function0<? extends C0941a1.c> function2) {
        if (function2 == null) {
            function2 = new a(componentCallbacksC0929c);
        }
        return new C0995z0(interfaceC6567c, function0, function2, function1);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0947c1 m23349c(InterfaceC7341h<? extends InterfaceC0947c1> interfaceC7341h) {
        return interfaceC7341h.getValue();
    }
}
