package sn;

import android.view.View;
import com.github.luben.zstd.BuildConfig;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0004J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH¦@¢\u0006\u0004\b\u000f\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH¦@¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\tR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#À\u0006\u0003"}, d2 = {"Lsn/i;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "j", "()V", "destroy", BuildConfig.FLAVOR, "enable", "a", "(Z)V", "d", "Lzt/n;", "Ljava/io/File;", "g", "(Leu/b;)Ljava/lang/Object;", "i", "k", "enableAnalyzer", "e", "Ldv/p0;", "Lsn/y;", "b", "()Ldv/p0;", "cameraState", "Landroid/view/View;", "c", "()Landroid/view/View;", "previewView", "Lsn/v;", "f", "()Lsn/v;", "cameraProperties", "h", "()Z", "isRecordingLocally", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {
    void a(boolean enable);

    @NotNull
    dv.p0<y> b();

    @NotNull
    View c();

    void d();

    void destroy();

    void e(boolean enableAnalyzer);

    @NotNull
    v f();

    @Nullable
    Object g(@NotNull eu.b<? super zt.n<? extends File>> bVar);

    boolean h();

    @Nullable
    Object i(@NotNull eu.b<? super zt.n<Boolean>> bVar);

    void j();

    @Nullable
    Object k(@NotNull eu.b<? super zt.n<? extends File>> bVar);
}
