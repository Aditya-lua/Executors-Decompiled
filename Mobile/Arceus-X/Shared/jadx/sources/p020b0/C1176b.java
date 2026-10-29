package p020b0;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p296n0.InterfaceC8795n1;
import p561y.C12964a;

/* JADX INFO: renamed from: b0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lb0/b;", "", "<init>", "()V", "Ly/a$a;", "options", "Ln0/n1$c;", "priority", "", "a", "(Ly/a$a;Ln0/n1$c;)V", "camera-camera2_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C1176b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C1176b f4919a = new C1176b();

    /* JADX INFO: renamed from: a */
    public static final void m6538a(@NotNull C12964a.a options, @NotNull InterfaceC8795n1.c priority) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(priority, "priority");
        if (Build.VERSION.SDK_INT >= 34) {
            options.m48222g(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, priority);
        }
    }
}
