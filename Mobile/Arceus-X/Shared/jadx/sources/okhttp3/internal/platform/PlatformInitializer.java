package okhttp3.internal.platform;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p238k5.InterfaceC7448b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Lk5/b;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)Lokhttp3/internal/platform/Platform;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class PlatformInitializer implements InterfaceC7448b<Platform> {
    @Override // p238k5.InterfaceC7448b
    @NotNull
    public List<Class<InterfaceC7448b<?>>> dependencies() {
        return C7699p.m31892k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: create(Landroid/content/Context;)Ljava/lang/Object; */
    @Override // p238k5.InterfaceC7448b
    @NotNull
    public Platform create(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PlatformRegistry.INSTANCE.setApplicationContext(context);
        return Platform.INSTANCE.get();
    }
}
