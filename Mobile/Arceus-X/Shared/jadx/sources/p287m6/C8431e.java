package p287m6;

import android.content.res.AssetFileDescriptor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p239k6.C7466h0;

/* JADX INFO: renamed from: m6.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lm6/e;", "Lm6/s$a;", "Lk6/h0;", "uri", "Landroid/content/res/AssetFileDescriptor;", "assetFileDescriptor", "<init>", "(Lk6/h0;Landroid/content/res/AssetFileDescriptor;)V", "a", "Lk6/h0;", "getUri", "()Lk6/h0;", "b", "Landroid/content/res/AssetFileDescriptor;", "()Landroid/content/res/AssetFileDescriptor;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8431e extends InterfaceC8445s.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C7466h0 uri;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AssetFileDescriptor assetFileDescriptor;

    public C8431e(@NotNull C7466h0 c7466h0, @NotNull AssetFileDescriptor assetFileDescriptor) {
        this.uri = c7466h0;
        this.assetFileDescriptor = assetFileDescriptor;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AssetFileDescriptor getAssetFileDescriptor() {
        return this.assetFileDescriptor;
    }
}
