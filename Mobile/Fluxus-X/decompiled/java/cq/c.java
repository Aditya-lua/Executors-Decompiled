package cq;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u00042\u00020\u0006B-\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u001a\u0010\u001a\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcq/c;", BuildConfig.FLAVOR, "B", "T", "Lrn/f;", "Lpn/c;", "Lnn/g;", "baseScreen", BuildConfig.FLAVOR, "modals", BuildConfig.FLAVOR, "compatibilityKey", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;)V", "b", "Ljava/lang/Object;", "getBaseScreen", "()Ljava/lang/Object;", "c", "Ljava/util/List;", "a", "()Ljava/util/List;", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "e", "beneathModals", "modal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c<B, T> implements rn.f<B, pn.c<T>>, nn.g {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final B baseScreen;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<pn.c<T>> modals;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String compatibilityKey;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final B beneathModals;

    public c(@NotNull B baseScreen, @NotNull List<pn.c<T>> modals, @NotNull String compatibilityKey) {
        Intrinsics.checkNotNullParameter(baseScreen, "baseScreen");
        Intrinsics.checkNotNullParameter(modals, "modals");
        Intrinsics.checkNotNullParameter(compatibilityKey, "compatibilityKey");
        this.baseScreen = baseScreen;
        this.modals = modals;
        this.compatibilityKey = compatibilityKey;
        this.beneathModals = baseScreen;
    }

    @Override // rn.f
    @NotNull
    public List<pn.c<T>> a() {
        return this.modals;
    }

    @Override // rn.f
    @NotNull
    public B b() {
        return this.beneathModals;
    }

    @Override // nn.g
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public String getCompatibilityKey() {
        return this.compatibilityKey;
    }
}
