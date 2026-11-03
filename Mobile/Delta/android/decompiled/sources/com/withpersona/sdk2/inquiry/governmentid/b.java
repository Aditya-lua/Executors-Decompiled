package com.withpersona.sdk2.inquiry.governmentid;

import androidx.camera.view.PreviewView;
import dn.s;
import dn.x;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "Landroid/content/Context;", "context", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "camera2Preview", "Landroidx/camera/view/PreviewView;", "cameraXPreview", "Ldn/x;", "governmentIdFeed", "", "useCameraXForVideo", "Ldn/g;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Landroid/content/Context;Lcom/withpersona/sdk2/camera/b;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Landroidx/camera/view/PreviewView;Ldn/x;Z)Ldn/g;", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10950a;

        static {
            int[] iArr = new int[kn.a.values().length];
            try {
                iArr[kn.a.Stream.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kn.a.Upload.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kn.a.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10950a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/withpersona/sdk2/inquiry/governmentid/b$b", "Ldn/s;", "", "a", "()V", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0197b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Screen.b f10951a;
        public final /* synthetic */ com.withpersona.sdk2.camera.b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PreviewView f10952c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x f10953d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f10954e;

        public C0197b(Screen.b bVar, com.withpersona.sdk2.camera.b bVar2, PreviewView previewView, x xVar, boolean z10) {
            this.f10951a = bVar;
            this.b = bVar2;
            this.f10952c = previewView;
            this.f10953d = xVar;
            this.f10954e = z10;
        }

        @Override // dn.s
        public void a() {
            this.b.f(this.f10952c, com.withpersona.sdk2.camera.b.a.BACK, this.f10953d, true, this.f10954e, this.f10951a.D());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r14 == false) goto L12;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dn.g a(@org.jetbrains.annotations.NotNull com.withpersona.sdk2.inquiry.governmentid.Screen.b r8, @org.jetbrains.annotations.NotNull android.content.Context r9, @org.jetbrains.annotations.NotNull com.withpersona.sdk2.camera.b r10, @org.jetbrains.annotations.NotNull com.withpersona.sdk2.camera.camera2.Camera2PreviewView r11, @org.jetbrains.annotations.NotNull androidx.camera.view.PreviewView r12, @org.jetbrains.annotations.NotNull dn.x r13, boolean r14) throws android.hardware.camera2.CameraAccessException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "cameraPreview"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "camera2Preview"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "cameraXPreview"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "governmentIdFeed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            kn.a r0 = r8.getVideoCaptureMethod()
            int[] r1 = com.withpersona.sdk2.inquiry.governmentid.b.a.f10950a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L3c
            r2 = 2
            if (r0 == r2) goto L3a
            r9 = 3
            if (r0 != r9) goto L34
            goto L3e
        L34:
            gt.l r8 = new gt.l
            r8.<init>()
            throw r8
        L3a:
            if (r14 != 0) goto L3e
        L3c:
            r12 = r13
            goto L61
        L3e:
            kn.a r9 = r8.getVideoCaptureMethod()
            kn.a r11 = kn.a.Upload
            if (r9 != r11) goto L47
            goto L48
        L47:
            r1 = 0
        L48:
            com.withpersona.sdk2.camera.e$a r14 = r8.getCameraXControllerFactory()
            r9 = r8
            com.withpersona.sdk2.inquiry.governmentid.b$b r8 = new com.withpersona.sdk2.inquiry.governmentid.b$b
            r11 = r12
            r12 = r13
            r13 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            r7 = r9
            r9 = r8
            r8 = r7
            boolean r8 = r8.getIsAudioRequired()
            com.withpersona.sdk2.camera.e r8 = r14.a(r10, r11, r9, r8)
            return r8
        L61:
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.String r10 = "getApplicationContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            fn.m0 r10 = fn.m0.BACK
            fn.k0 r1 = fn.f0.b(r9, r10)
            if (r1 != 0) goto L84
            kotlin.jvm.functions.Function1 r8 = r8.D()
            dn.i0 r9 = new dn.i0
            r9.<init>()
            r8.invoke(r9)
            com.withpersona.sdk2.camera.g r8 = new com.withpersona.sdk2.camera.g
            r8.<init>(r11)
            return r8
        L84:
            fn.c$a r0 = r8.getCamera2ControllerFactory()
            kn.a r4 = r8.getVideoCaptureMethod()
            sr.a r5 = r8.getWebRtcManager()
            boolean r6 = r8.getIsAudioRequired()
            r2 = r11
            r3 = r12
            fn.c r8 = r0.a(r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.governmentid.b.a(com.withpersona.sdk2.inquiry.governmentid.Screen$b, android.content.Context, com.withpersona.sdk2.camera.b, com.withpersona.sdk2.camera.camera2.Camera2PreviewView, androidx.camera.view.PreviewView, dn.x, boolean):dn.g");
    }
}
