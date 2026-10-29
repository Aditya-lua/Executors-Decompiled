package p207j3;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: j3.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, m31665d2 = {"Lj3/b;", "", "<init>", "()V", "Landroid/content/Context;", "ctx", "", "b", "(Landroid/content/Context;)Z", "c", "a", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7027b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C7027b f27583a = new C7027b();

    /* JADX INFO: renamed from: a */
    public static final boolean m29707a(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        return ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m29708b(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        return ctx.getPackageManager().hasSystemFeature("android.software.leanback");
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m29709c(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        return ctx.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }
}
