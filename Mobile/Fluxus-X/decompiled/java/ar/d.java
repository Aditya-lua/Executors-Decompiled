package ar;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lar/d;", "Lar/a;", "<init>", "()V", "Lar/f;", "stepData", BuildConfig.FLAVOR, "c", "(Lar/f;)V", BuildConfig.FLAVOR, "a", "Z", "b", "()Z", "isActive", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isActive;

    @Override // ar.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getIsActive() {
        return this.isActive;
    }

    @Override // ar.a
    public void c(@NotNull f stepData) {
        Intrinsics.checkNotNullParameter(stepData, "stepData");
    }
}
