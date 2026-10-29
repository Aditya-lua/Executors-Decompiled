package p561y;

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7728c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001a0.C0008c0;
import p001a0.C0013f;
import p001a0.C0034p0;
import p020b0.C1177c;
import p020b0.C1179e;
import p037c1.C1506e;
import p037c1.InterfaceC1505d;
import p088e.C4711j0;
import p140g0.C5931r1;
import p140g0.C5953x;
import p204j0.InterfaceC7011a;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import p296n0.C8802o3;
import p366q0.C10417c;
import p589z.C13479a3;

/* JADX INFO: renamed from: y.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 C2\u00020\u0001:\u0002D%B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0010*\u00020\u0013H\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0010*\u00020\u0013H\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u001b\u0010\u001a\u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f2\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\u0004*\u00020\nH\u0002¢\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u00105\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u00104R\u001b\u00109\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010-\u001a\u0004\b7\u00108R\u001d\u0010>\u001a\u0004\u0018\u00010:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010-\u001a\u0004\b<\u0010=R\u001b\u0010B\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010-\u001a\u0004\b@\u0010A¨\u0006E"}, m31665d2 = {"Ly/m;", "Lj0/a;", "Landroid/content/Context;", "context", "", "cameraId", "La0/p0;", "cameraManagerCompat", "<init>", "(Landroid/content/Context;Ljava/lang/String;La0/p0;)V", "Ln0/o3;", "sessionConfig", "", "b", "(Ln0/o3;)Z", "", "Ly/m$a;", "l", "(Ln0/o3;)Ljava/util/List;", "Ln0/o3$f;", "v", "(Ln0/o3$f;)Ly/m$a;", "w", "Landroid/hardware/camera2/params/OutputConfiguration;", "outputConfig", "", "h", "(Landroid/hardware/camera2/params/OutputConfiguration;Ln0/o3$f;)V", "outputConfigs", "cameraXSessionConfig", "Landroid/hardware/camera2/params/SessionConfiguration;", "n", "(Ljava/util/List;Ln0/o3;)Landroid/hardware/camera2/params/SessionConfiguration;", "x", "(Ln0/o3;)Ljava/lang/String;", "s", "()Ljava/lang/Boolean;", "c", "Landroid/content/Context;", "d", "Ljava/lang/String;", "e", "La0/p0;", "Lc1/d;", "f", "Ljt/h;", "q", "()Lc1/d;", "cameraDeviceSetupCompat", "Landroid/hardware/camera2/CameraDevice$CameraDeviceSetup;", "g", "p", "()Landroid/hardware/camera2/CameraDevice$CameraDeviceSetup;", "cameraDeviceSetup", "La0/c0;", "o", "()La0/c0;", "cameraCharacteristics", "Landroid/hardware/camera2/params/DynamicRangeProfiles;", "i", "r", "()Landroid/hardware/camera2/params/DynamicRangeProfiles;", "dynamicRangeProfiles", "j", "t", "()Z", "isDeferredSurfaceSupported", "k", "a", "camera-camera2_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C12976m implements InterfaceC7011a {

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final b f45930l = new b();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String cameraId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C0034p0 cameraManagerCompat;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h cameraDeviceSetupCompat;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h cameraDeviceSetup;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h cameraCharacteristics;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h dynamicRangeProfiles;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h isDeferredSurfaceSupported;

    /* JADX INFO: renamed from: y.m$b */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m31665d2 = {"y/m$b", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "Landroid/hardware/camera2/CameraCaptureSession;", "p0", "", "onConfigured", "(Landroid/hardware/camera2/CameraCaptureSession;)V", "onConfigureFailed", "camera-camera2_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
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

    public C12976m(@NotNull Context context, @NotNull String cameraId, @NotNull C0034p0 cameraManagerCompat) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Intrinsics.checkNotNullParameter(cameraManagerCompat, "cameraManagerCompat");
        this.context = context;
        this.cameraId = cameraId;
        this.cameraManagerCompat = cameraManagerCompat;
        this.cameraDeviceSetupCompat = C7342i.m30456b(new Function0() { // from class: y.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C12976m.m48235j(this.f45925a);
            }
        });
        this.cameraDeviceSetup = C7342i.m30456b(new Function0() { // from class: y.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C12976m.m48236k(this.f45926a);
            }
        });
        this.cameraCharacteristics = C7342i.m30456b(new Function0() { // from class: y.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C12976m.m48234i(this.f45927a);
            }
        });
        this.dynamicRangeProfiles = C7342i.m30456b(new Function0() { // from class: y.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C12976m.m48237m(this.f45928a);
            }
        });
        this.isDeferredSurfaceSupported = C7342i.m30456b(new Function0() { // from class: y.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C12976m.m48238u(this.f45924a));
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static final C0008c0 m48234i(C12976m c12976m) throws C5953x {
        try {
            C0008c0 c0008c0M64c = c12976m.cameraManagerCompat.m64c(c12976m.cameraId);
            Intrinsics.checkNotNull(c0008c0M64c);
            return c0008c0M64c;
        } catch (C0013f e10) {
            throw C13479a3.m49169a(e10);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC1505d m48235j(C12976m c12976m) {
        return new C1506e(c12976m.context).m7660a(c12976m.cameraId);
    }

    /* JADX INFO: renamed from: k */
    public static final CameraDevice.CameraDeviceSetup m48236k(C12976m c12976m) {
        if (c12976m.cameraManagerCompat.m70i().isCameraDeviceSetupSupported(c12976m.cameraId)) {
            return c12976m.cameraManagerCompat.m70i().getCameraDeviceSetup(c12976m.cameraId);
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static final DynamicRangeProfiles m48237m(C12976m c12976m) {
        return C1179e.m6542a(c12976m.m48242o()).m6546d();
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m48238u(C12976m c12976m) {
        return Intrinsics.m31980c(c12976m.m48246s(), Boolean.FALSE);
    }

    @Override // p204j0.InterfaceC7011a
    /* JADX INFO: renamed from: b */
    public boolean mo29674b(@NotNull C8802o3 sessionConfig) throws Exception {
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        List<CloseableOutputConfiguration> listM48240l = m48240l(sessionConfig);
        ArrayList arrayList = new ArrayList(C7701q.m31905u(listM48240l, 10));
        Iterator<T> it = listM48240l.iterator();
        while (it.hasNext()) {
            arrayList.add(((CloseableOutputConfiguration) it.next()).getValue());
        }
        SessionConfiguration sessionConfigurationM48241n = m48241n(arrayList, sessionConfig);
        if (sessionConfigurationM48241n == null) {
            return false;
        }
        int iM7659a = m48244q().mo7656a(sessionConfigurationM48241n).m7659a();
        C5931r1.m26561a("FeatureCombinationQueryImpl", "isSupported: supported = " + iM7659a + " for session config with " + m48250x(sessionConfig));
        boolean z10 = iM7659a == 1;
        Iterator<T> it2 = listM48240l.iterator();
        while (it2.hasNext()) {
            C4711j0.m23003a((AutoCloseable) it2.next());
        }
        return z10;
    }

    /* JADX INFO: renamed from: h */
    public final void m48239h(OutputConfiguration outputConfiguration, C8802o3.f fVar) {
        DynamicRangeProfiles dynamicRangeProfilesM48245r = m48245r();
        if (dynamicRangeProfilesM48245r == null) {
            return;
        }
        Long lM6539a = C1177c.m6539a(fVar.mo35344b(), dynamicRangeProfilesM48245r);
        if (lM6539a == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        outputConfiguration.setDynamicRangeProfile(lM6539a.longValue());
    }

    /* JADX INFO: renamed from: l */
    public final List<CloseableOutputConfiguration> m48240l(C8802o3 sessionConfig) {
        CloseableOutputConfiguration closeableOutputConfigurationM48248v;
        List<C8802o3.f> listM35303i = sessionConfig.m35303i();
        Intrinsics.checkNotNullExpressionValue(listM35303i, "getOutputConfigs(...)");
        List<C8802o3.f> list = listM35303i;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
        for (C8802o3.f fVar : list) {
            if (m48247t()) {
                Intrinsics.checkNotNull(fVar);
                closeableOutputConfigurationM48248v = m48249w(fVar);
            } else {
                Intrinsics.checkNotNull(fVar);
                closeableOutputConfigurationM48248v = m48248v(fVar);
            }
            if (fVar.mo35348f().m35433g() != null) {
                m48239h(closeableOutputConfigurationM48248v.getValue(), fVar);
            }
            arrayList.add(closeableOutputConfigurationM48248v);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public final SessionConfiguration m48241n(List<OutputConfiguration> outputConfigs, C8802o3 cameraXSessionConfig) {
        C12968e.m48226a();
        SessionConfiguration sessionConfigurationM48225a = C12967d.m48225a(0, outputConfigs, C10417c.m40081b(), f45930l);
        CameraDevice.CameraDeviceSetup cameraDeviceSetupM48243p = m48243p();
        if (cameraDeviceSetupM48243p == null) {
            return null;
        }
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDeviceSetupM48243p.createCaptureRequest(cameraXSessionConfig.m35311q());
        builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, cameraXSessionConfig.m35300e());
        if (cameraXSessionConfig.m35306l().m35245h() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        }
        sessionConfigurationM48225a.setSessionParameters(builderCreateCaptureRequest.build());
        return sessionConfigurationM48225a;
    }

    /* JADX INFO: renamed from: o */
    public final C0008c0 m48242o() {
        return (C0008c0) this.cameraCharacteristics.getValue();
    }

    /* JADX INFO: renamed from: p */
    public final CameraDevice.CameraDeviceSetup m48243p() {
        return C12970g.m48228a(this.cameraDeviceSetup.getValue());
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC1505d m48244q() {
        return (InterfaceC1505d) this.cameraDeviceSetupCompat.getValue();
    }

    /* JADX INFO: renamed from: r */
    public final DynamicRangeProfiles m48245r() {
        return C12969f.m48227a(this.dynamicRangeProfiles.getValue());
    }

    /* JADX INFO: renamed from: s */
    public final Boolean m48246s() {
        try {
            ServiceInfo[] serviceInfoArr = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 132).services;
            if (serviceInfoArr == null) {
                return Boolean.FALSE;
            }
            Iterator itM31999a = C7728c.m31999a(serviceInfoArr);
            while (itM31999a.hasNext()) {
                Bundle bundle = ((ServiceInfo) itM31999a.next()).metaData;
                if (bundle != null && bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m48247t() {
        return ((Boolean) this.isDeferredSurfaceSupported.getValue()).booleanValue();
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: v */
    public final CloseableOutputConfiguration m48248v(C8802o3.f fVar) {
        long j10;
        Class<?> clsM35433g = fVar.mo35348f().m35433g();
        if (Intrinsics.m31980c(clsM35433g, MediaCodec.class)) {
            j10 = 65536;
        } else if (Intrinsics.m31980c(clsM35433g, SurfaceHolder.class)) {
            j10 = 2048;
        } else {
            j10 = Intrinsics.m31980c(clsM35433g, SurfaceTexture.class) ? 256L : 0L;
        }
        long j11 = j10;
        C5931r1.m26561a("FeatureCombinationQueryImpl", "toConcreteOutputConfiguration: surface containerClass = " + fVar.mo35348f().m35433g() + ", usageFlag = " + j11);
        ImageReader imageReaderNewInstance = ImageReader.newInstance(fVar.mo35348f().m35434h().getWidth(), fVar.mo35348f().m35434h().getHeight(), fVar.mo35348f().m35435i(), 1, j11);
        Intrinsics.checkNotNullExpressionValue(imageReaderNewInstance, "newInstance(...)");
        return new CloseableOutputConfiguration(new OutputConfiguration(imageReaderNewInstance.getSurface()), imageReaderNewInstance);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: w */
    public final CloseableOutputConfiguration m48249w(C8802o3.f fVar) {
        OutputConfiguration outputConfigurationM48223a;
        Class<?> clsM35433g = fVar.mo35348f().m35433g();
        C5931r1.m26561a("FeatureCombinationQueryImpl", "toDeferredOutputConfiguration: surface containerClass = " + fVar.mo35348f().m35433g());
        if (clsM35433g != null) {
            Size sizeM35434h = fVar.mo35348f().m35434h();
            if (sizeM35434h == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            outputConfigurationM48223a = new OutputConfiguration(sizeM35434h, clsM35433g);
        } else {
            C12966c.m48224a();
            outputConfigurationM48223a = C12965b.m48223a(fVar.mo35348f().m35435i(), fVar.mo35348f().m35434h());
        }
        return new CloseableOutputConfiguration(outputConfigurationM48223a, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: x */
    public final String m48250x(C8802o3 c8802o3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sessionParameters=[");
        sb2.append("fpsRange=" + c8802o3.m35300e());
        sb2.append(", previewStabilizationMode=" + c8802o3.m35306l().m35245h());
        sb2.append("], ");
        sb2.append("outputConfigurations=[");
        List<C8802o3.f> listM35303i = c8802o3.m35303i();
        Intrinsics.checkNotNullExpressionValue(listM35303i, "getOutputConfigs(...)");
        int i10 = 0;
        for (Object obj : listM35303i) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C7699p.m31901t();
            }
            C8802o3.f fVar = (C8802o3.f) obj;
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append("{format=" + fVar.mo35348f().m35435i() + ", size=" + fVar.mo35348f().m35434h() + ", dynamicRange=" + fVar.mo35344b() + ", class=" + fVar.mo35348f().m35433g() + '}');
            i10 = i11;
        }
        sb2.append("]");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: y.m$a, reason: from toString */
    @Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m31665d2 = {"Ly/m$a;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Landroid/hardware/camera2/params/OutputConfiguration;", "value", "Landroid/media/ImageReader;", "backingImageReader", "<init>", "(Landroid/hardware/camera2/params/OutputConfiguration;Landroid/media/ImageReader;)V", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/hardware/camera2/params/OutputConfiguration;", "()Landroid/hardware/camera2/params/OutputConfiguration;", "b", "Landroid/media/ImageReader;", "camera-camera2_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final /* data */ class CloseableOutputConfiguration implements AutoCloseable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final OutputConfiguration value;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final ImageReader backingImageReader;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            return Intrinsics.m31980c(this.value, closeableOutputConfiguration.value) && Intrinsics.m31980c(this.backingImageReader, closeableOutputConfiguration.backingImageReader);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
          (r1v0 android.hardware.camera2.params.OutputConfiguration)
          (wrap android.media.ImageReader:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.media.ImageReader) : (r2v0 android.media.ImageReader))
         A[MD:(android.hardware.camera2.params.OutputConfiguration, android.media.ImageReader):void (m)] (LINE:4) call: y.m.a.<init>(android.hardware.camera2.params.OutputConfiguration, android.media.ImageReader):void type: THIS */
        public /* synthetic */ CloseableOutputConfiguration(OutputConfiguration outputConfiguration, ImageReader imageReader, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(outputConfiguration, (i10 & 2) != 0 ? null : imageReader);
        }
    }
}
