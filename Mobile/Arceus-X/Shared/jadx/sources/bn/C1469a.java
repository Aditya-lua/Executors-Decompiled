package bn;

import androidx.annotation.NonNull;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0980s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p068d5.C4442f;
import p068d5.C4444h;
import p068d5.InterfaceC4445i;

/* JADX INFO: renamed from: bn.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m31665d2 = {"Lbn/a;", "Ld5/i;", "Landroidx/lifecycle/s;", "", "key", "lifecycleOwner", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/s;)V", "Landroidx/lifecycle/l;", "a", "()Landroidx/lifecycle/l;", "Ld5/f;", "A", "()Ld5/f;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ld5/h;", "Ld5/h;", "b", "()Ld5/h;", "controller", "wf1-core-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C1469a implements InterfaceC4445i, InterfaceC0980s {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0980s f5706b;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C4444h controller;

    public C1469a(@NotNull String key, @NotNull InterfaceC0980s lifecycleOwner) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.key = key;
        this.f5706b = lifecycleOwner;
        C4444h c4444hM22357a = C4444h.m22357a(this);
        Intrinsics.checkNotNullExpressionValue(c4444hM22357a, "create(this)");
        this.controller = c4444hM22357a;
    }

    @Override // p068d5.InterfaceC4445i
    @NotNull
    /* JADX INFO: renamed from: A */
    public C4442f mo4583A() {
        C4442f savedStateRegistry = this.controller.getSavedStateRegistry();
        Intrinsics.checkNotNullExpressionValue(savedStateRegistry, "controller.savedStateRegistry");
        return savedStateRegistry;
    }

    @Override // androidx.p616lifecycle.InterfaceC0980s
    @NonNull
    @NotNull
    /* JADX INFO: renamed from: a */
    public AbstractC0966l mo4656a() {
        return this.f5706b.mo4656a();
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C4444h getController() {
        return this.controller;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getKey() {
        return this.key;
    }
}
