package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import androidx.camera.view.PreviewView;
import com.withpersona.sdk2.camera.C3402b;
import com.withpersona.sdk2.camera.C3407g;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import hn.C6441f0;
import hn.CameraChoices;
import hn.EnumC6455m0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mn.EnumC8598a;
import org.jetbrains.annotations.NotNull;
import p132fn.C5688i0;
import p132fn.C5717x;
import p132fn.InterfaceC5683g;
import p132fn.InterfaceC5707s;
import p229jt.C7345l;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "Landroid/content/Context;", "context", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "camera2Preview", "Landroidx/camera/view/PreviewView;", "cameraXPreview", "Lfn/x;", "governmentIdFeed", "", "useCameraXForVideo", "Lfn/g;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Landroid/content/Context;Lcom/withpersona/sdk2/camera/b;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Landroidx/camera/view/PreviewView;Lfn/x;Z)Lfn/g;", "government-id_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3539b {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.b$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14037a;

        static {
            int[] iArr = new int[EnumC8598a.values().length];
            try {
                iArr[EnumC8598a.Stream.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8598a.Upload.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8598a.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14037a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.b$b */
    @Metadata(m31664d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"com/withpersona/sdk2/inquiry/governmentid/b$b", "Lfn/s;", "", "a", "()V", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b implements InterfaceC5707s {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Screen.C3527b f14038a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C3402b f14039b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ PreviewView f14040c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C5717x f14041d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f14042e;

        public b(Screen.C3527b c3527b, C3402b c3402b, PreviewView previewView, C5717x c5717x, boolean z10) {
            this.f14038a = c3527b;
            this.f14039b = c3402b;
            this.f14040c = previewView;
            this.f14041d = c5717x;
            this.f14042e = z10;
        }

        @Override // p132fn.InterfaceC5707s
        /* JADX INFO: renamed from: a */
        public void mo17506a() {
            this.f14039b.m16201f(this.f14040c, C3402b.a.BACK, this.f14041d, true, this.f14042e, this.f14038a.m17357D());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r14 == false) goto L12;
     */
    @NotNull
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC5683g m17505a(@NotNull Screen.C3527b c3527b, @NotNull Context context, @NotNull C3402b cameraPreview, @NotNull Camera2PreviewView camera2Preview, @NotNull PreviewView cameraXPreview, @NotNull C5717x governmentIdFeed, boolean z10) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(c3527b, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(camera2Preview, "camera2Preview");
        Intrinsics.checkNotNullParameter(cameraXPreview, "cameraXPreview");
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        int i10 = a.f14037a[c3527b.getVideoCaptureMethod().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new C7345l();
                }
            }
            return c3527b.getCameraXControllerFactory().mo16229a(cameraPreview, cameraXPreview, new b(c3527b, cameraPreview, cameraXPreview, governmentIdFeed, c3527b.getVideoCaptureMethod() == EnumC8598a.Upload), c3527b.getIsAudioRequired());
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        CameraChoices cameraChoicesM28079b = C6441f0.m28079b(applicationContext, EnumC6455m0.BACK);
        if (cameraChoicesM28079b != null) {
            return c3527b.getCamera2ControllerFactory().mo28063a(cameraChoicesM28079b, camera2Preview, governmentIdFeed, c3527b.getVideoCaptureMethod(), c3527b.getWebRtcManager(), c3527b.getIsAudioRequired());
        }
        c3527b.m17357D().invoke(new C5688i0());
        return new C3407g(camera2Preview);
    }
}
