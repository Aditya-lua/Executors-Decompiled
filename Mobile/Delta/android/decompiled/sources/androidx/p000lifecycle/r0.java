package androidx.p000lifecycle;

import android.os.Bundle;
import d5.c;
import d5.f;
import d5.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import jt.h;
import jt.i;
import jt.s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u2.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/lifecycle/r0;", "Ld5/f$b;", "Ld5/f;", "savedStateRegistry", "Landroidx/lifecycle/c1;", "viewModelStoreOwner", "<init>", "(Ld5/f;Landroidx/lifecycle/c1;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "a", "()Landroid/os/Bundle;", "", "e", "()V", "", "key", "c", "(Ljava/lang/String;)Landroid/os/Bundle;", "Ld5/f;", "", "b", "Z", "restored", "Landroid/os/Bundle;", "restoredState", "Landroidx/lifecycle/s0;", "d", "Ljt/h;", "()Landroidx/lifecycle/s0;", "viewModel", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r0 implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f savedStateRegistry;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean restored;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Bundle restoredState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h viewModel;

    public r0(@NotNull f savedStateRegistry, @NotNull final c1 viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.savedStateRegistry = savedStateRegistry;
        this.viewModel = i.b(new Function0() { // from class: androidx.lifecycle.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r0.f(viewModelStoreOwner);
            }
        });
    }

    public static final s0 f(c1 c1Var) {
        return o0.e(c1Var);
    }

    @Override // d5.f.b
    @NotNull
    public Bundle a() {
        Pair[] pairArr;
        Map mapJ = k0.j();
        if (mapJ.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapJ.size());
            for (Map.Entry entry : mapJ.entrySet()) {
                arrayList.add(s.a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleA = d.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleA2 = j.a(bundleA);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            j.b(bundleA2, bundle);
        }
        for (Map.Entry<String, l0> entry2 : d().e().entrySet()) {
            String key = entry2.getKey();
            Bundle bundleA3 = entry2.getValue().h().a();
            if (!c.f(c.a(bundleA3))) {
                j.c(bundleA2, key, bundleA3);
            }
        }
        this.restored = false;
        return bundleA;
    }

    @Nullable
    public final Bundle c(@NotNull String key) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(key, "key");
        e();
        Bundle bundle = this.restoredState;
        if (bundle == null || !c.b(c.a(bundle), key)) {
            return null;
        }
        Bundle bundleD = c.d(c.a(bundle), key);
        if (bundleD == null) {
            Map mapJ = k0.j();
            if (mapJ.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(mapJ.size());
                for (Map.Entry entry : mapJ.entrySet()) {
                    arrayList.add(s.a((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            bundleD = d.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            j.a(bundleD);
        }
        j.e(j.a(bundle), key);
        if (c.f(c.a(bundle))) {
            this.restoredState = null;
        }
        return bundleD;
    }

    public final s0 d() {
        return (s0) this.viewModel.getValue();
    }

    public final void e() {
        Pair[] pairArr;
        if (this.restored) {
            return;
        }
        Bundle bundleA = this.savedStateRegistry.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Map mapJ = k0.j();
        if (mapJ.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapJ.size());
            for (Map.Entry entry : mapJ.entrySet()) {
                arrayList.add(s.a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleA2 = d.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleA3 = j.a(bundleA2);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            j.b(bundleA3, bundle);
        }
        if (bundleA != null) {
            j.b(bundleA3, bundleA);
        }
        this.restoredState = bundleA2;
        this.restored = true;
        d();
    }
}
