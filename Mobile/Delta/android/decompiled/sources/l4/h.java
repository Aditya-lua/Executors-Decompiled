package l4;

import androidx.p000lifecycle.a1;
import androidx.p000lifecycle.b1;
import androidx.p000lifecycle.x0;
import com.appsflyer.sdk_base.referrer.Payload;
import k4.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001b"}, d2 = {"Ll4/h;", "", "Landroidx/lifecycle/b1;", Payload.TYPE_STORE, "Landroidx/lifecycle/a1$c;", "factory", "Lk4/a;", "defaultExtras", "<init>", "(Landroidx/lifecycle/b1;Landroidx/lifecycle/a1$c;Lk4/a;)V", "Landroidx/lifecycle/x0;", "T", "Lhu/c;", "modelClass", "", "key", "d", "(Lhu/c;Ljava/lang/String;)Landroidx/lifecycle/x0;", "a", "Landroidx/lifecycle/b1;", "b", "Landroidx/lifecycle/a1$c;", "c", "Lk4/a;", "Ll4/f;", "Ll4/f;", "lock", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b1 store;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final a1.c factory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CreationExtras defaultExtras;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f lock;

    public h(@NotNull b1 store, @NotNull a1.c factory, @NotNull CreationExtras defaultExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultExtras, "defaultExtras");
        this.store = store;
        this.factory = factory;
        this.defaultExtras = defaultExtras;
        this.lock = new f();
    }

    public static /* synthetic */ x0 e(h hVar, hu.c cVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = j.f22948a.c(cVar);
        }
        return hVar.d(cVar, str);
    }

    @NotNull
    public final <T extends x0> T d(@NotNull hu.c<T> modelClass, @NotNull String key) {
        T t8;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            try {
                t8 = (T) this.store.b(key);
                if (modelClass.b(t8)) {
                    if (this.factory instanceof a1.e) {
                        a1.e eVar = (a1.e) this.factory;
                        Intrinsics.checkNotNull(t8);
                        eVar.d(t8);
                    }
                    Intrinsics.d(t8, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
                } else {
                    k4.b bVar = new k4.b(this.defaultExtras);
                    bVar.c(a1.f2748c, key);
                    t8 = (T) i.a(this.factory, modelClass, bVar);
                    this.store.d(key, t8);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t8;
    }
}
