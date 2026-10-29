package p132fn;

import android.view.View;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.InterfaceC3404d;
import java.io.File;
import kotlin.Metadata;
import nu.InterfaceC9592p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: fn.g */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0004J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH¦@¢\u0006\u0004\b\u000f\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH¦@¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\tR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#À\u0006\u0003"}, m31665d2 = {"Lfn/g;", "", "", "h", "()V", "destroy", "", "enable", "c", "(Z)V", "e", "Ljt/n;", "Ljava/io/File;", "k", "(Lnt/b;)Ljava/lang/Object;", "j", "i", "enableAnalyzer", "f", "Lnu/p0;", "Lcom/withpersona/sdk2/camera/d;", "b", "()Lnu/p0;", "cameraState", "Landroid/view/View;", "d", "()Landroid/view/View;", "previewView", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "g", "()Z", "isRecordingLocally", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC5683g {
    @NotNull
    /* JADX INFO: renamed from: a */
    CameraProperties mo16217a();

    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC9592p0<InterfaceC3404d> mo16218b();

    /* JADX INFO: renamed from: c */
    void mo16219c(boolean enable);

    @NotNull
    /* JADX INFO: renamed from: d */
    View mo16220d();

    void destroy();

    /* JADX INFO: renamed from: e */
    void mo16221e();

    /* JADX INFO: renamed from: f */
    void mo16222f(boolean enableAnalyzer);

    /* JADX INFO: renamed from: g */
    boolean mo16223g();

    /* JADX INFO: renamed from: h */
    void mo16224h();

    @Nullable
    /* JADX INFO: renamed from: i */
    Object mo16225i(@NotNull InterfaceC9557b<? super C7347n<? extends File>> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: j */
    Object mo16226j(@NotNull InterfaceC9557b<? super C7347n<Boolean>> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: k */
    Object mo16227k(@NotNull InterfaceC9557b<? super C7347n<? extends File>> interfaceC9557b);
}
