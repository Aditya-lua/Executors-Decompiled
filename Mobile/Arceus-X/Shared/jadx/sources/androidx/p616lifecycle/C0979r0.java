package androidx.p616lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7690k0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p068d5.C4439c;
import p068d5.C4442f;
import p068d5.C4446j;
import p229jt.C7342i;
import p229jt.C7352s;
import p229jt.InterfaceC7341h;
import p456u2.C11775d;

/* JADX INFO: renamed from: androidx.lifecycle.r0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, m31665d2 = {"Landroidx/lifecycle/r0;", "Ld5/f$b;", "Ld5/f;", "savedStateRegistry", "Landroidx/lifecycle/c1;", "viewModelStoreOwner", "<init>", "(Ld5/f;Landroidx/lifecycle/c1;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "a", "()Landroid/os/Bundle;", "", "e", "()V", "", "key", "c", "(Ljava/lang/String;)Landroid/os/Bundle;", "Ld5/f;", "", "b", "Z", "restored", "Landroid/os/Bundle;", "restoredState", "Landroidx/lifecycle/s0;", "d", "Ljt/h;", "()Landroidx/lifecycle/s0;", "viewModel", "lifecycle-viewmodel-savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C0979r0 implements C4442f.b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C4442f savedStateRegistry;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean restored;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Bundle restoredState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h viewModel;

    public C0979r0(@NotNull C4442f savedStateRegistry, @NotNull final InterfaceC0947c1 viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.savedStateRegistry = savedStateRegistry;
        this.viewModel = C7342i.m30456b(new Function0() { // from class: androidx.lifecycle.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C0979r0.m4973f(viewModelStoreOwner);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static final C0981s0 m4973f(InterfaceC0947c1 interfaceC0947c1) {
        return C0973o0.m4968e(interfaceC0947c1);
    }

    @Override // p068d5.C4442f.b
    @NotNull
    /* JADX INFO: renamed from: a */
    public Bundle mo4974a() {
        Pair[] pairArr;
        Map mapM31795j = C7690k0.m31795j();
        if (mapM31795j.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM31795j.size());
            for (Map.Entry entry : mapM31795j.entrySet()) {
                arrayList.add(C7352s.m30477a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleM44057a = C11775d.m44057a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleM22365a = C4446j.m22365a(bundleM44057a);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            C4446j.m22366b(bundleM22365a, bundle);
        }
        for (Map.Entry<String, C0967l0> entry2 : m4976d().m4978e().entrySet()) {
            String key = entry2.getKey();
            Bundle bundleMo4974a = entry2.getValue().m4953h().mo4974a();
            if (!C4439c.m22348f(C4439c.m22343a(bundleMo4974a))) {
                C4446j.m22367c(bundleM22365a, key, bundleMo4974a);
            }
        }
        this.restored = false;
        return bundleM44057a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Bundle m4975c(@NotNull String key) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(key, "key");
        m4977e();
        Bundle bundle = this.restoredState;
        if (bundle == null || !C4439c.m22344b(C4439c.m22343a(bundle), key)) {
            return null;
        }
        Bundle bundleM22346d = C4439c.m22346d(C4439c.m22343a(bundle), key);
        if (bundleM22346d == null) {
            Map mapM31795j = C7690k0.m31795j();
            if (mapM31795j.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(mapM31795j.size());
                for (Map.Entry entry : mapM31795j.entrySet()) {
                    arrayList.add(C7352s.m30477a((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            bundleM22346d = C11775d.m44057a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            C4446j.m22365a(bundleM22346d);
        }
        C4446j.m22369e(C4446j.m22365a(bundle), key);
        if (C4439c.m22348f(C4439c.m22343a(bundle))) {
            this.restoredState = null;
        }
        return bundleM22346d;
    }

    /* JADX INFO: renamed from: d */
    public final C0981s0 m4976d() {
        return (C0981s0) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m4977e() {
        Pair[] pairArr;
        if (this.restored) {
            return;
        }
        Bundle bundleM22352a = this.savedStateRegistry.m22352a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Map mapM31795j = C7690k0.m31795j();
        if (mapM31795j.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM31795j.size());
            for (Map.Entry entry : mapM31795j.entrySet()) {
                arrayList.add(C7352s.m30477a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleM44057a = C11775d.m44057a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleM22365a = C4446j.m22365a(bundleM44057a);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            C4446j.m22366b(bundleM22365a, bundle);
        }
        if (bundleM22352a != null) {
            C4446j.m22366b(bundleM22365a, bundleM22352a);
        }
        this.restoredState = bundleM44057a;
        this.restored = true;
        m4976d();
    }
}
