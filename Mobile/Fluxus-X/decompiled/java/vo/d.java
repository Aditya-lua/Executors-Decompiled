package vo;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import androidx.camera.view.PreviewView;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import un.CameraChoices;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lvo/y3$b;", "Landroid/content/Context;", "context", "Lsn/t;", "cameraPreview", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "camera2Preview", "Landroidx/camera/view/PreviewView;", "cameraXPreview", "Lsn/h0;", "governmentIdFeed", BuildConfig.FLAVOR, "useCameraXForVideo", "Lsn/i;", "a", "(Lvo/y3$b;Landroid/content/Context;Lsn/t;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Landroidx/camera/view/PreviewView;Lsn/h0;Z)Lsn/i;", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34511a;

        static {
            int[] iArr = new int[zn.a.values().length];
            try {
                iArr[zn.a.Stream.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zn.a.Upload.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zn.a.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34511a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"vo/d$b", "Lsn/z;", BuildConfig.FLAVOR, "a", "()V", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements sn.z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y3.b f34512a;
        public final /* synthetic */ sn.t b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PreviewView f34513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sn.h0 f34514d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f34515e;

        public b(y3.b bVar, sn.t tVar, PreviewView previewView, sn.h0 h0Var, boolean z10) {
            this.f34512a = bVar;
            this.b = tVar;
            this.f34513c = previewView;
            this.f34514d = h0Var;
            this.f34515e = z10;
        }

        @Override // sn.z
        public void a() {
            this.b.f(this.f34513c, sn.t.a.BACK, this.f34514d, true, this.f34515e, this.f34512a.D());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r14 == false) goto L12;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final sn.i a(@NotNull y3.b bVar, @NotNull Context context, @NotNull sn.t cameraPreview, @NotNull Camera2PreviewView camera2Preview, @NotNull PreviewView cameraXPreview, @NotNull sn.h0 governmentIdFeed, boolean z10) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(camera2Preview, "camera2Preview");
        Intrinsics.checkNotNullParameter(cameraXPreview, "cameraXPreview");
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        int i10 = a.f34511a[bVar.getVideoCaptureMethod().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new zt.l();
                }
            }
            return bVar.getCameraXControllerFactory().a(cameraPreview, cameraXPreview, new b(bVar, cameraPreview, cameraXPreview, governmentIdFeed, bVar.getVideoCaptureMethod() == zn.a.Upload), bVar.getIsAudioRequired());
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        CameraChoices cameraChoicesB = un.f0.b(applicationContext, un.m0.BACK);
        if (cameraChoicesB != null) {
            return bVar.getCamera2ControllerFactory().a(cameraChoicesB, camera2Preview, governmentIdFeed, bVar.getVideoCaptureMethod(), bVar.getWebRtcManager(), bVar.getIsAudioRequired());
        }
        bVar.D().invoke(new sn.v0());
        return new sn.u0(camera2Preview);
    }
}
