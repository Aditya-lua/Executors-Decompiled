package bn;

import androidx.annotation.NonNull;
import androidx.p000lifecycle.l;
import androidx.p000lifecycle.s;
import d5.h;
import d5.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lbn/a;", "Ld5/i;", "Landroidx/lifecycle/s;", "", "key", "lifecycleOwner", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/s;)V", "Landroidx/lifecycle/l;", "a", "()Landroidx/lifecycle/l;", "Ld5/f;", "A", "()Ld5/f;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ld5/h;", "Ld5/h;", "b", "()Ld5/h;", "controller", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class a implements i, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String key;
    public final /* synthetic */ s b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h controller;

    public a(@NotNull String key, @NotNull s lifecycleOwner) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.key = key;
        this.b = lifecycleOwner;
        h hVarA = h.a(this);
        Intrinsics.checkNotNullExpressionValue(hVarA, "create(this)");
        this.controller = hVarA;
    }

    @Override // d5.i
    @NotNull
    public d5.f A() {
        d5.f savedStateRegistry = this.controller.getSavedStateRegistry();
        Intrinsics.checkNotNullExpressionValue(savedStateRegistry, "controller.savedStateRegistry");
        return savedStateRegistry;
    }

    @Override // androidx.p000lifecycle.s
    @NonNull
    @NotNull
    public l a() {
        return this.b.a();
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getController() {
        return this.controller;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getKey() {
        return this.key;
    }
}
