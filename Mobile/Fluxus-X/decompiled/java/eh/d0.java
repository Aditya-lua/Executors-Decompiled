package eh;

import com.github.luben.zstd.BuildConfig;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Leh/d0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "collectionEnabled", "<init>", "(Ljava/lang/String;IZ)V", "a", "Z", "b", "()Z", "c", "d", "e", "f", "g", "h", "i", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum d0 {
    BLOCK_TRACKING_OPT_OUT(false),
    BLOCK_ATTRIBUTION_BLOCKED(false),
    ALLOW(true),
    NOT_REQUIRED(true),
    BLOCK_SHARING_FILTER(false),
    BLOCK_DMA_WITHDRAWAL(false),
    STAY_OFF_NO_DECISION(false),
    STAY_OFF_STALE_CACHE(false);


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ hu.a f13491k = hu.b.a(a());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean collectionEnabled;

    d0(boolean z10) {
        this.collectionEnabled = z10;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getCollectionEnabled() {
        return this.collectionEnabled;
    }
}
