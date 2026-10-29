package p263l4;

import androidx.p616lifecycle.AbstractC0991x0;
import androidx.p616lifecycle.C0941a1;
import androidx.p616lifecycle.C0944b1;
import com.appsflyer.sdk_base.referrer.Payload;
import hu.InterfaceC6567c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p237k4.C7445b;
import p237k4.CreationExtras;

/* JADX INFO: renamed from: l4.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001b"}, m31665d2 = {"Ll4/h;", "", "Landroidx/lifecycle/b1;", Payload.TYPE_STORE, "Landroidx/lifecycle/a1$c;", "factory", "Lk4/a;", "defaultExtras", "<init>", "(Landroidx/lifecycle/b1;Landroidx/lifecycle/a1$c;Lk4/a;)V", "Landroidx/lifecycle/x0;", "T", "Lhu/c;", "modelClass", "", "key", "d", "(Lhu/c;Ljava/lang/String;)Landroidx/lifecycle/x0;", "a", "Landroidx/lifecycle/b1;", "b", "Landroidx/lifecycle/a1$c;", "c", "Lk4/a;", "Ll4/f;", "Ll4/f;", "lock", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C7997h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C0944b1 store;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C0941a1.c factory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final CreationExtras defaultExtras;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C7995f lock;

    public C7997h(@NotNull C0944b1 store, @NotNull C0941a1.c factory, @NotNull CreationExtras defaultExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultExtras, "defaultExtras");
        this.store = store;
        this.factory = factory;
        this.defaultExtras = defaultExtras;
        this.lock = new C7995f();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ AbstractC0991x0 m33053e(C7997h c7997h, InterfaceC6567c interfaceC6567c, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = C7999j.f29922a.m33058c(interfaceC6567c);
        }
        return c7997h.m33054d(interfaceC6567c, str);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final <T extends AbstractC0991x0> T m33054d(@NotNull InterfaceC6567c<T> modelClass, @NotNull String key) {
        T t8;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            try {
                t8 = (T) this.store.m4888b(key);
                if (modelClass.mo28425b(t8)) {
                    if (this.factory instanceof C0941a1.e) {
                        C0941a1.e eVar = (C0941a1.e) this.factory;
                        Intrinsics.checkNotNull(t8);
                        eVar.mo4848d(t8);
                    }
                    Intrinsics.m31981d(t8, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
                } else {
                    C7445b c7445b = new C7445b(this.defaultExtras);
                    c7445b.m30960c(C0941a1.f3607c, key);
                    t8 = (T) C7998i.m33055a(this.factory, modelClass, c7445b);
                    this.store.m4890d(key, t8);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t8;
    }
}
