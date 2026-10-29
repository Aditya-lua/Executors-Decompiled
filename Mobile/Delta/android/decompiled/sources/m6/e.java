package m6;

import android.content.res.AssetFileDescriptor;
import k6.h0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lm6/e;", "Lm6/s$a;", "Lk6/h0;", "uri", "Landroid/content/res/AssetFileDescriptor;", "assetFileDescriptor", "<init>", "(Lk6/h0;Landroid/content/res/AssetFileDescriptor;)V", "a", "Lk6/h0;", "getUri", "()Lk6/h0;", "b", "Landroid/content/res/AssetFileDescriptor;", "()Landroid/content/res/AssetFileDescriptor;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 uri;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AssetFileDescriptor assetFileDescriptor;

    public e(@NotNull h0 h0Var, @NotNull AssetFileDescriptor assetFileDescriptor) {
        this.uri = h0Var;
        this.assetFileDescriptor = assetFileDescriptor;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AssetFileDescriptor getAssetFileDescriptor() {
        return this.assetFileDescriptor;
    }
}
