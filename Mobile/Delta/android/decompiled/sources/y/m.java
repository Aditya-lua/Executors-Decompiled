package y;

import a0.c0;
import a0.p0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.os.Bundle;
import android.util.Size;
import android.view.SurfaceHolder;
import e.j0;
import g0.r1;
import g0.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n0.o3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z.a3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 C2\u00020\u0001:\u0002D%B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0010*\u00020\u0013H\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0010*\u00020\u0013H\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u001b\u0010\u001a\u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f2\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\u0004*\u00020\nH\u0002¢\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u00105\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u00104R\u001b\u00109\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010-\u001a\u0004\b7\u00108R\u001d\u0010>\u001a\u0004\u0018\u00010:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010-\u001a\u0004\b<\u0010=R\u001b\u0010B\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010-\u001a\u0004\b@\u0010A¨\u0006E"}, d2 = {"Ly/m;", "Lj0/a;", "Landroid/content/Context;", "context", "", "cameraId", "La0/p0;", "cameraManagerCompat", "<init>", "(Landroid/content/Context;Ljava/lang/String;La0/p0;)V", "Ln0/o3;", "sessionConfig", "", "b", "(Ln0/o3;)Z", "", "Ly/m$a;", "l", "(Ln0/o3;)Ljava/util/List;", "Ln0/o3$f;", "v", "(Ln0/o3$f;)Ly/m$a;", "w", "Landroid/hardware/camera2/params/OutputConfiguration;", "outputConfig", "", "h", "(Landroid/hardware/camera2/params/OutputConfiguration;Ln0/o3$f;)V", "outputConfigs", "cameraXSessionConfig", "Landroid/hardware/camera2/params/SessionConfiguration;", "n", "(Ljava/util/List;Ln0/o3;)Landroid/hardware/camera2/params/SessionConfiguration;", "x", "(Ln0/o3;)Ljava/lang/String;", "s", "()Ljava/lang/Boolean;", "c", "Landroid/content/Context;", "d", "Ljava/lang/String;", "e", "La0/p0;", "Lc1/d;", "f", "Ljt/h;", "q", "()Lc1/d;", "cameraDeviceSetupCompat", "Landroid/hardware/camera2/CameraDevice$CameraDeviceSetup;", "g", "p", "()Landroid/hardware/camera2/CameraDevice$CameraDeviceSetup;", "cameraDeviceSetup", "La0/c0;", "o", "()La0/c0;", "cameraCharacteristics", "Landroid/hardware/camera2/params/DynamicRangeProfiles;", "i", "r", "()Landroid/hardware/camera2/params/DynamicRangeProfiles;", "dynamicRangeProfiles", "j", "t", "()Z", "isDeferredSurfaceSupported", "k", "a", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m implements j0.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final b f35418l = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String cameraId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 cameraManagerCompat;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h cameraDeviceSetupCompat;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h cameraDeviceSetup;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h cameraCharacteristics;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h dynamicRangeProfiles;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h isDeferredSurfaceSupported;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"y/m$b", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "Landroid/hardware/camera2/CameraCaptureSession;", "p0", "", "onConfigured", "(Landroid/hardware/camera2/CameraCaptureSession;)V", "onConfigureFailed", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends CameraCaptureSession.StateCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
        }
    }

    public m(@NotNull Context context, @NotNull String cameraId, @NotNull p0 cameraManagerCompat) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Intrinsics.checkNotNullParameter(cameraManagerCompat, "cameraManagerCompat");
        this.context = context;
        this.cameraId = cameraId;
        this.cameraManagerCompat = cameraManagerCompat;
        this.cameraDeviceSetupCompat = jt.i.b(new Function0() { // from class: y.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.j(this.f35413a);
            }
        });
        this.cameraDeviceSetup = jt.i.b(new Function0() { // from class: y.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.k(this.f35414a);
            }
        });
        this.cameraCharacteristics = jt.i.b(new Function0() { // from class: y.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.i(this.f35415a);
            }
        });
        this.dynamicRangeProfiles = jt.i.b(new Function0() { // from class: y.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.m(this.f35416a);
            }
        });
        this.isDeferredSurfaceSupported = jt.i.b(new Function0() { // from class: y.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(m.u(this.f35412a));
            }
        });
    }

    public static final c0 i(m mVar) throws x {
        try {
            c0 c0VarC = mVar.cameraManagerCompat.c(mVar.cameraId);
            Intrinsics.checkNotNull(c0VarC);
            return c0VarC;
        } catch (a0.f e10) {
            throw a3.a(e10);
        }
    }

    public static final c1.d j(m mVar) {
        return new c1.e(mVar.context).a(mVar.cameraId);
    }

    public static final CameraDevice.CameraDeviceSetup k(m mVar) {
        if (mVar.cameraManagerCompat.i().isCameraDeviceSetupSupported(mVar.cameraId)) {
            return mVar.cameraManagerCompat.i().getCameraDeviceSetup(mVar.cameraId);
        }
        return null;
    }

    public static final DynamicRangeProfiles m(m mVar) {
        return b0.e.a(mVar.o()).d();
    }

    public static final boolean u(m mVar) {
        return Intrinsics.c(mVar.s(), Boolean.FALSE);
    }

    @Override // j0.a
    public boolean b(@NotNull o3 sessionConfig) throws Exception {
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        List<CloseableOutputConfiguration> listL = l(sessionConfig);
        ArrayList arrayList = new ArrayList(q.u(listL, 10));
        Iterator<T> it = listL.iterator();
        while (it.hasNext()) {
            arrayList.add(((CloseableOutputConfiguration) it.next()).getValue());
        }
        SessionConfiguration sessionConfigurationN = n(arrayList, sessionConfig);
        if (sessionConfigurationN == null) {
            return false;
        }
        int iA = q().a(sessionConfigurationN).a();
        r1.a("FeatureCombinationQueryImpl", "isSupported: supported = " + iA + " for session config with " + x(sessionConfig));
        boolean z10 = iA == 1;
        Iterator<T> it2 = listL.iterator();
        while (it2.hasNext()) {
            j0.a((AutoCloseable) it2.next());
        }
        return z10;
    }

    public final void h(OutputConfiguration outputConfiguration, o3.f fVar) {
        DynamicRangeProfiles dynamicRangeProfilesR = r();
        if (dynamicRangeProfilesR == null) {
            return;
        }
        Long lA = b0.c.a(fVar.b(), dynamicRangeProfilesR);
        if (lA == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        outputConfiguration.setDynamicRangeProfile(lA.longValue());
    }

    public final List<CloseableOutputConfiguration> l(o3 sessionConfig) {
        CloseableOutputConfiguration closeableOutputConfigurationV;
        List<o3.f> listI = sessionConfig.i();
        Intrinsics.checkNotNullExpressionValue(listI, "getOutputConfigs(...)");
        List<o3.f> list = listI;
        ArrayList arrayList = new ArrayList(q.u(list, 10));
        for (o3.f fVar : list) {
            if (t()) {
                Intrinsics.checkNotNull(fVar);
                closeableOutputConfigurationV = w(fVar);
            } else {
                Intrinsics.checkNotNull(fVar);
                closeableOutputConfigurationV = v(fVar);
            }
            if (fVar.f().g() != null) {
                h(closeableOutputConfigurationV.getValue(), fVar);
            }
            arrayList.add(closeableOutputConfigurationV);
        }
        return arrayList;
    }

    public final SessionConfiguration n(List<OutputConfiguration> outputConfigs, o3 cameraXSessionConfig) {
        e.a();
        SessionConfiguration sessionConfigurationA = d.a(0, outputConfigs, q0.c.b(), f35418l);
        CameraDevice.CameraDeviceSetup cameraDeviceSetupP = p();
        if (cameraDeviceSetupP == null) {
            return null;
        }
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDeviceSetupP.createCaptureRequest(cameraXSessionConfig.q());
        builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, cameraXSessionConfig.e());
        if (cameraXSessionConfig.l().h() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        }
        sessionConfigurationA.setSessionParameters(builderCreateCaptureRequest.build());
        return sessionConfigurationA;
    }

    public final c0 o() {
        return (c0) this.cameraCharacteristics.getValue();
    }

    public final CameraDevice.CameraDeviceSetup p() {
        return g.a(this.cameraDeviceSetup.getValue());
    }

    public final c1.d q() {
        return (c1.d) this.cameraDeviceSetupCompat.getValue();
    }

    public final DynamicRangeProfiles r() {
        return f.a(this.dynamicRangeProfiles.getValue());
    }

    public final Boolean s() {
        try {
            ServiceInfo[] serviceInfoArr = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 132).services;
            if (serviceInfoArr == null) {
                return Boolean.FALSE;
            }
            Iterator itA = kotlin.jvm.internal.c.a(serviceInfoArr);
            while (itA.hasNext()) {
                Bundle bundle = ((ServiceInfo) itA.next()).metaData;
                if (bundle != null && bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final boolean t() {
        return ((Boolean) this.isDeferredSurfaceSupported.getValue()).booleanValue();
    }

    @SuppressLint({"WrongConstant"})
    public final CloseableOutputConfiguration v(o3.f fVar) {
        long j10;
        Class<?> clsG = fVar.f().g();
        if (Intrinsics.c(clsG, MediaCodec.class)) {
            j10 = 65536;
        } else if (Intrinsics.c(clsG, SurfaceHolder.class)) {
            j10 = 2048;
        } else {
            j10 = Intrinsics.c(clsG, SurfaceTexture.class) ? 256L : 0L;
        }
        long j11 = j10;
        r1.a("FeatureCombinationQueryImpl", "toConcreteOutputConfiguration: surface containerClass = " + fVar.f().g() + ", usageFlag = " + j11);
        ImageReader imageReaderNewInstance = ImageReader.newInstance(fVar.f().h().getWidth(), fVar.f().h().getHeight(), fVar.f().i(), 1, j11);
        Intrinsics.checkNotNullExpressionValue(imageReaderNewInstance, "newInstance(...)");
        return new CloseableOutputConfiguration(new OutputConfiguration(imageReaderNewInstance.getSurface()), imageReaderNewInstance);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"WrongConstant"})
    public final CloseableOutputConfiguration w(o3.f fVar) {
        OutputConfiguration outputConfigurationA;
        Class<?> clsG = fVar.f().g();
        r1.a("FeatureCombinationQueryImpl", "toDeferredOutputConfiguration: surface containerClass = " + fVar.f().g());
        if (clsG != null) {
            Size sizeH = fVar.f().h();
            if (sizeH == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            outputConfigurationA = new OutputConfiguration(sizeH, clsG);
        } else {
            c.a();
            outputConfigurationA = y.b.a(fVar.f().i(), fVar.f().h());
        }
        return new CloseableOutputConfiguration(outputConfigurationA, null, 2, 0 == true ? 1 : 0);
    }

    public final String x(o3 o3Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sessionParameters=[");
        sb2.append("fpsRange=" + o3Var.e());
        sb2.append(", previewStabilizationMode=" + o3Var.l().h());
        sb2.append("], ");
        sb2.append("outputConfigurations=[");
        List<o3.f> listI = o3Var.i();
        Intrinsics.checkNotNullExpressionValue(listI, "getOutputConfigs(...)");
        int i10 = 0;
        for (Object obj : listI) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p.t();
            }
            o3.f fVar = (o3.f) obj;
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append("{format=" + fVar.f().i() + ", size=" + fVar.f().h() + ", dynamicRange=" + fVar.b() + ", class=" + fVar.f().g() + '}');
            i10 = i11;
        }
        sb2.append("]");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: y.m$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ly/m$a;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Landroid/hardware/camera2/params/OutputConfiguration;", "value", "Landroid/media/ImageReader;", "backingImageReader", "<init>", "(Landroid/hardware/camera2/params/OutputConfiguration;Landroid/media/ImageReader;)V", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/hardware/camera2/params/OutputConfiguration;", "()Landroid/hardware/camera2/params/OutputConfiguration;", "b", "Landroid/media/ImageReader;", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CloseableOutputConfiguration implements AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final OutputConfiguration value;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final ImageReader backingImageReader;

        public CloseableOutputConfiguration(@NotNull OutputConfiguration value, @Nullable ImageReader imageReader) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
            this.backingImageReader = imageReader;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final OutputConfiguration getValue() {
            return this.value;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            ImageReader imageReader = this.backingImageReader;
            if (imageReader != null) {
                imageReader.close();
            }
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CloseableOutputConfiguration)) {
                return false;
            }
            CloseableOutputConfiguration closeableOutputConfiguration = (CloseableOutputConfiguration) other;
            return Intrinsics.c(this.value, closeableOutputConfiguration.value) && Intrinsics.c(this.backingImageReader, closeableOutputConfiguration.backingImageReader);
        }

        public int hashCode() {
            int iHashCode = this.value.hashCode() * 31;
            ImageReader imageReader = this.backingImageReader;
            return iHashCode + (imageReader == null ? 0 : imageReader.hashCode());
        }

        @NotNull
        public String toString() {
            return "CloseableOutputConfiguration(value=" + this.value + ", backingImageReader=" + this.backingImageReader + ')';
        }

        public /* synthetic */ CloseableOutputConfiguration(OutputConfiguration outputConfiguration, ImageReader imageReader, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(outputConfiguration, (i10 & 2) != 0 ? null : imageReader);
        }
    }
}
