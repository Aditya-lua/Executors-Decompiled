package androidx.p616lifecycle;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface LifecycleRegistryOwner extends LifecycleOwner {
    @Override // androidx.p616lifecycle.LifecycleOwner
    @NonNull
    LifecycleRegistry getLifecycle();
}
