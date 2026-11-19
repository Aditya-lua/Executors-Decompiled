package okhttp3.internal.platform;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.collections.p;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Ll5/b;", "Lokhttp3/internal/platform/c;", "<init>", "()V", "Landroid/content/Context;", "context", "b", "(Landroid/content/Context;)Lokhttp3/internal/platform/c;", BuildConfig.FLAVOR, "Ljava/lang/Class;", "a", "()Ljava/util/List;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlatformInitializer implements l5.b<c> {
    @Override // l5.b
    @NotNull
    public List<Class<l5.b<?>>> a() {
        return p.k();
    }

    @Override // l5.b
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c create(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        d.f28269a.d(context);
        return c.INSTANCE.e();
    }
}
