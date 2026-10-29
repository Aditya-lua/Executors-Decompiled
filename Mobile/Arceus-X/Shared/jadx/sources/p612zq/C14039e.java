package p612zq;

import android.content.Context;
import com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zq.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lzq/e;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/withpersona/sdk2/inquiry/sna/SilentNetworkAuthConfig;", "config", "Lzq/c;", "a", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/sna/SilentNetworkAuthConfig;)Lzq/c;", "Ljava/lang/Class;", "b", "()Ljava/lang/Class;", "sna_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C14039e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C14039e f49070a = new C14039e();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final InterfaceC14037c m50724a(@NotNull Context context, @NotNull SilentNetworkAuthConfig config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        try {
            Class<?> clsM50725b = m50725b();
            if (clsM50725b == null) {
                return null;
            }
            Object objNewInstance = clsM50725b.newInstance();
            Intrinsics.m31981d(objNewInstance, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.sna.SnaClient.Factory");
            return ((InterfaceC14037c.a) objNewInstance).m50717a(context, config);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Class<?> m50725b() {
        try {
            return Class.forName("com.withpersona.sdk2.inquiry.sna.impl.VonageSnaClientFactory");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
