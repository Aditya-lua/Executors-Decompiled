package androidx.p616lifecycle;

import androidx.p616lifecycle.AbstractC0991x0;
import hu.InterfaceC6567c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.InterfaceC7341h;
import p237k4.CreationExtras;

/* JADX INFO: renamed from: androidx.lifecycle.z0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001b¨\u0006\u001d"}, m31665d2 = {"Landroidx/lifecycle/z0;", "Landroidx/lifecycle/x0;", "VM", "Ljt/h;", "Lhu/c;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/b1;", "storeProducer", "Landroidx/lifecycle/a1$c;", "factoryProducer", "Lk4/a;", "extrasProducer", "<init>", "(Lhu/c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "isInitialized", "()Z", "a", "Lhu/c;", "b", "Lkotlin/jvm/functions/Function0;", "c", "d", "e", "Landroidx/lifecycle/x0;", "cached", "()Landroidx/lifecycle/x0;", "value", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C0995z0<VM extends AbstractC0991x0> implements InterfaceC7341h<VM> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6567c<VM> viewModelClass;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function0<C0944b1> storeProducer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function0<C0941a1.c> factoryProducer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Function0<CreationExtras> extrasProducer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public VM cached;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.lifecycle.b1> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.lifecycle.a1$c> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function0<? extends k4.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public C0995z0(@NotNull InterfaceC6567c<VM> viewModelClass, @NotNull Function0<? extends C0944b1> storeProducer, @NotNull Function0<? extends C0941a1.c> factoryProducer, @NotNull Function0<? extends CreationExtras> extrasProducer) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.viewModelClass = viewModelClass;
        this.storeProducer = storeProducer;
        this.factoryProducer = factoryProducer;
        this.extrasProducer = extrasProducer;
    }

    /* JADX DEBUG: Method merged with bridge method: getValue()Ljava/lang/Object; */
    @Override // p229jt.InterfaceC7341h
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public VM getValue() {
        VM vm2 = this.cached;
        if (vm2 != null) {
            return vm2;
        }
        VM vm3 = (VM) C0941a1.INSTANCE.m4876a(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).m4868a(this.viewModelClass);
        this.cached = vm3;
        return vm3;
    }

    @Override // p229jt.InterfaceC7341h
    public boolean isInitialized() {
        return this.cached != null;
    }
}
