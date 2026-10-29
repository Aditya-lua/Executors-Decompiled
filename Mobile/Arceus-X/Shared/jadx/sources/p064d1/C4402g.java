package p064d1;

import android.content.Context;
import androidx.p616lifecycle.InterfaceC0980s;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7693m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7737g0;
import kotlin.jvm.internal.Intrinsics;
import ne.InterfaceFutureC9440x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140g0.AbstractC5952w2;
import p140g0.C5882f0;
import p140g0.C5886g0;
import p140g0.C5888g2;
import p140g0.C5894i0;
import p140g0.C5927q1;
import p140g0.C5933s;
import p140g0.C5945v;
import p140g0.C5956x2;
import p140g0.InterfaceC5905l;
import p140g0.InterfaceC5929r;
import p140g0.InterfaceC5937t;
import p296n0.C8727b2;
import p296n0.C8742e;
import p296n0.C8779k0;
import p296n0.InterfaceC8761h0;
import p296n0.InterfaceC8773j0;
import p296n0.InterfaceC8799o0;
import p296n0.InterfaceC8804p0;
import p301n5.C8884a;
import p347p0.C10090f;
import p347p0.C10110z;
import p366q0.C10417c;
import p397r0.C10763d;
import p397r0.C10773n;
import p397r0.InterfaceC10760a;
import p397r0.InterfaceC10762c;
import p533x2.C12637g;

/* JADX INFO: renamed from: d1.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0002\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J'\u0010)\u001a\u00020\u001f2\u0016\u0010(\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010'0&\"\u0004\u0018\u00010'H\u0017¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001fH\u0017¢\u0006\u0004\b+\u0010\u0003J'\u0010.\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0017¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R*\u0010=\u001a\u0004\u0018\u0001058\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b6\u00107\u0012\u0004\b<\u0010\u0003\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u0010?R$\u0010C\u001a\u0010\u0012\f\u0012\n A*\u0004\u0018\u00010\u001c0\u001c0\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u0010?R\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR*\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bL\u0010M\u0012\u0004\bR\u0010\u0003\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR \u0010X\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020U0S8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bV\u0010WR$\u0010^\u001a\u0012\u0012\u0004\u0012\u00020Z0Yj\b\u0012\u0004\u0012\u00020Z`[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\"\u0010f\u001a\u00020_8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010g\u001a\u00020_2\u0006\u0010g\u001a\u00020_8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bh\u0010c\"\u0004\bi\u0010e¨\u0006j"}, m31665d2 = {"Ld1/g;", "", "<init>", "()V", "Landroidx/lifecycle/s;", "lifecycleOwner", "Lg0/v;", "primaryCameraSelector", "secondaryCameraSelector", "Lg0/i0;", "primaryCompositionSettings", "secondaryCompositionSettings", "Lg0/g2;", "sessionConfig", "Lg0/l;", "n", "(Landroidx/lifecycle/s;Lg0/v;Lg0/v;Lg0/i0;Lg0/i0;Lg0/g2;)Lg0/l;", "cameraSelector", "Lg0/t;", "cameraInfo", "Ln0/h0;", "q", "(Lg0/v;Lg0/t;)Ln0/h0;", "Landroid/content/Context;", "context", "Lg0/g0;", "cameraXConfig", "Lne/x;", "Ljava/lang/Void;", "u", "(Landroid/content/Context;Lg0/g0;)Lne/x;", "", "p", "(Lg0/g0;)V", "", "clearConfigProvider", "B", "(Z)Lne/x;", "", "Lg0/w2;", "useCases", "D", "([Lg0/w2;)V", "E", "Lg0/x2;", "useCaseGroup", "m", "(Landroidx/lifecycle/s;Lg0/v;Lg0/x2;)Lg0/l;", "r", "(Lg0/v;)Lg0/t;", "a", "Ljava/lang/Object;", "lock", "Lg0/g0$b;", "b", "Lg0/g0$b;", "t", "()Lg0/g0$b;", "y", "(Lg0/g0$b;)V", "getCameraXConfigProvider$camera_lifecycle_release$annotations", "cameraXConfigProvider", "c", "Lne/x;", "cameraXInitializeFuture", "kotlin.jvm.PlatformType", "d", "cameraXShutdownFuture", "Ld1/h;", "e", "Ld1/h;", "lifecycleCameraRepository", "Lg0/f0;", "f", "Lg0/f0;", "cameraX", "g", "Landroid/content/Context;", "getContext$camera_lifecycle_release", "()Landroid/content/Context;", "A", "(Landroid/content/Context;)V", "getContext$camera_lifecycle_release$annotations", "", "Lg0/s;", "Ln0/e;", "h", "Ljava/util/Map;", "cameraInfoMap", "Ljava/util/HashSet;", "Ld1/h$a;", "Lkotlin/collections/HashSet;", "i", "Ljava/util/HashSet;", "lifecycleCameraKeys", "", "j", "I", "getConfigImplType", "()I", "z", "(I)V", "configImplType", "cameraOperatingMode", "s", "x", "camera-lifecycle_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C4402g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Object lock = new Object();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public C5886g0.b cameraXConfigProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public InterfaceFutureC9440x<Void> cameraXInitializeFuture;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public InterfaceFutureC9440x<Void> cameraXShutdownFuture;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C4403h lifecycleCameraRepository;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public C5882f0 cameraX;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Context context;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Map<C5933s, C8742e> cameraInfoMap;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final HashSet<C4403h.a> lifecycleCameraKeys;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int configImplType;

    /* JADX INFO: renamed from: d1.g$a */
    @Metadata(m31666k = 3, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class a implements C5886g0.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5886g0 f18282a;

        public a(C5886g0 c5886g0) {
            this.f18282a = c5886g0;
        }

        @Override // p140g0.C5886g0.b
        public final C5886g0 getCameraXConfig() {
            return this.f18282a;
        }
    }

    /* JADX INFO: renamed from: d1.g$b */
    @Metadata(m31664d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"d1/g$b", "Lr0/c;", "Ljava/lang/Void;", "void", "", "a", "(Ljava/lang/Void;)V", "", "t", "onFailure", "(Ljava/lang/Throwable;)V", "camera-lifecycle_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class b implements InterfaceC10762c<Void> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C5882f0 f18284b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Context f18285c;

        public b(C5882f0 c5882f0, Context context) {
            this.f18284b = c5882f0;
            this.f18285c = context;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            C4402g.this.cameraX = this.f18284b;
            C4402g.this.m22100A(C10090f.m38911a(this.f18285c));
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable t8) {
            Intrinsics.checkNotNullParameter(t8, "t");
            C4402g.this.m22101B(false);
        }
    }

    public C4402g() {
        InterfaceFutureC9440x<Void> interfaceFutureC9440xM40993p = C10773n.m40993p(null);
        Intrinsics.checkNotNullExpressionValue(interfaceFutureC9440xM40993p, "immediateFuture(...)");
        this.cameraXShutdownFuture = interfaceFutureC9440xM40993p;
        C4403h c4403hM22116c = C4403h.m22116c();
        Intrinsics.checkNotNullExpressionValue(c4403hM22116c, "getInstance(...)");
        this.lifecycleCameraRepository = c4403hM22116c;
        this.cameraInfoMap = new HashMap();
        this.lifecycleCameraKeys = new HashSet<>();
        this.configImplType = -1;
    }

    /* JADX INFO: renamed from: C */
    public static final void m22084C(C4402g c4402g) {
        c4402g.m22103E();
        c4402g.lifecycleCameraRepository.m22124i(c4402g.lifecycleCameraKeys);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ InterfaceC5905l m22097o(C4402g c4402g, InterfaceC0980s interfaceC0980s, C5945v c5945v, C5945v c5945v2, C5894i0 c5894i0, C5894i0 c5894i1, C5888g2 c5888g2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            c5945v2 = null;
        }
        C5945v c5945v3 = c5945v2;
        if ((i10 & 8) != 0) {
            c5894i0 = C5894i0.f22527d;
        }
        C5894i0 c5894i2 = c5894i0;
        if ((i10 & 16) != 0) {
            c5894i1 = C5894i0.f22527d;
        }
        return c4402g.m22105n(interfaceC0980s, c5945v, c5945v3, c5894i2, c5894i1, c5888g2);
    }

    /* JADX INFO: renamed from: v */
    public static final InterfaceFutureC9440x m22098v(C5882f0 c5882f0, Void r8) {
        return c5882f0.m26345l();
    }

    /* JADX INFO: renamed from: w */
    public static final InterfaceFutureC9440x m22099w(Function1 function1, Object obj) {
        return (InterfaceFutureC9440x) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: A */
    public final void m22100A(@Nullable Context context) {
        this.context = context;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final InterfaceFutureC9440x<Void> m22101B(boolean clearConfigProvider) {
        InterfaceFutureC9440x<Void> interfaceFutureC9440xM40993p;
        C10110z.m39012f(new Runnable() { // from class: d1.f
            @Override // java.lang.Runnable
            public final void run() {
                C4402g.m22084C(this.f18271a);
            }
        });
        C5882f0 c5882f0 = this.cameraX;
        if (c5882f0 != null) {
            Intrinsics.checkNotNull(c5882f0);
            interfaceFutureC9440xM40993p = c5882f0.m26349q();
        } else {
            interfaceFutureC9440xM40993p = C10773n.m40993p(null);
        }
        Intrinsics.checkNotNull(interfaceFutureC9440xM40993p);
        synchronized (this.lock) {
            if (clearConfigProvider) {
                try {
                    this.cameraXConfigProvider = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.cameraXInitializeFuture = null;
            this.cameraXShutdownFuture = interfaceFutureC9440xM40993p;
            this.cameraInfoMap.clear();
            this.lifecycleCameraKeys.clear();
            Unit unit = Unit.f29331a;
        }
        this.cameraX = null;
        this.context = null;
        return interfaceFutureC9440xM40993p;
    }

    /* JADX INFO: renamed from: D */
    public void m22102D(@NotNull AbstractC5952w2... useCases) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        C8884a.m35746c("CX:unbind");
        try {
            C10110z.m39008b();
            if (m22109s() == 2) {
                throw new UnsupportedOperationException("Unbind UseCase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            this.lifecycleCameraRepository.m22128m(new C5927q1(C7693m.m31840I(useCases), null, null, 6, null), this.lifecycleCameraKeys);
            Unit unit = Unit.f29331a;
            C8884a.m35749f();
        } catch (Throwable th2) {
            C8884a.m35749f();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: E */
    public void m22103E() {
        C8884a.m35746c("CX:unbindAll");
        try {
            C10110z.m39008b();
            m22112x(0);
            this.lifecycleCameraRepository.m22129n(this.lifecycleCameraKeys);
            Unit unit = Unit.f29331a;
        } finally {
            C8884a.m35749f();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public InterfaceC5905l m22104m(@NotNull InterfaceC0980s lifecycleOwner, @NotNull C5945v cameraSelector, @NotNull C5956x2 useCaseGroup) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(useCaseGroup, "useCaseGroup");
        C8884a.m35746c("CX:bindToLifecycle-UseCaseGroup");
        try {
            if (m22109s() == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
            }
            m22112x(1);
            InterfaceC5905l interfaceC5905lM22097o = m22097o(this, lifecycleOwner, cameraSelector, null, null, null, new C5927q1(useCaseGroup), 28, null);
            C8884a.m35749f();
            return interfaceC5905lM22097o;
        } catch (Throwable th2) {
            C8884a.m35749f();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC5905l m22105n(InterfaceC0980s lifecycleOwner, C5945v primaryCameraSelector, C5945v secondaryCameraSelector, C5894i0 primaryCompositionSettings, C5894i0 secondaryCompositionSettings, C5888g2 sessionConfig) {
        InterfaceC8804p0 interfaceC8804p0;
        C8742e c8742e;
        C8884a.m35746c("CX:bindToLifecycle-internal");
        try {
            C10110z.m39008b();
            C5882f0 c5882f0 = this.cameraX;
            Intrinsics.checkNotNull(c5882f0);
            InterfaceC8804p0 interfaceC8804p0M26632g = primaryCameraSelector.m26632g(c5882f0.m26342h().m35040m());
            Intrinsics.checkNotNullExpressionValue(interfaceC8804p0M26632g, "select(...)");
            interfaceC8804p0M26632g.mo35086r(true);
            InterfaceC5937t interfaceC5937tM22108r = m22108r(primaryCameraSelector);
            Intrinsics.m31981d(interfaceC5937tM22108r, "null cannot be cast to non-null type androidx.camera.core.impl.AdapterCameraInfo");
            C8742e c8742e2 = (C8742e) interfaceC5937tM22108r;
            if (secondaryCameraSelector != null) {
                C5882f0 c5882f1 = this.cameraX;
                Intrinsics.checkNotNull(c5882f1);
                InterfaceC8804p0 interfaceC8804p0M26632g2 = secondaryCameraSelector.m26632g(c5882f1.m26342h().m35040m());
                interfaceC8804p0M26632g2.mo35086r(false);
                InterfaceC5937t interfaceC5937tM22108r2 = m22108r(secondaryCameraSelector);
                Intrinsics.m31981d(interfaceC5937tM22108r2, "null cannot be cast to non-null type androidx.camera.core.impl.AdapterCameraInfo");
                interfaceC8804p0 = interfaceC8804p0M26632g2;
                c8742e = (C8742e) interfaceC5937tM22108r2;
            } else {
                interfaceC8804p0 = null;
                c8742e = null;
            }
            C5933s c5933sM26581e = C5933s.INSTANCE.m26581e(c8742e2, c8742e);
            C4398c c4398cM22119d = this.lifecycleCameraRepository.m22119d(lifecycleOwner, c5933sM26581e);
            Collection<C4398c> collectionM22121f = this.lifecycleCameraRepository.m22121f();
            for (AbstractC5952w2 abstractC5952w2 : sessionConfig.m26474k()) {
                for (C4398c c4398c : collectionM22121f) {
                    Intrinsics.checkNotNullExpressionValue(c4398c, "next(...)");
                    C4398c c4398c2 = c4398c;
                    if (c4398c2.m22079v(abstractC5952w2) && !Intrinsics.m31980c(c4398c2.m22077t(), lifecycleOwner)) {
                        C7737g0 c7737g0 = C7737g0.f29434a;
                        String str = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{abstractC5952w2}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        throw new IllegalStateException(str);
                    }
                }
            }
            if (c4398cM22119d == null) {
                C4403h c4403h = this.lifecycleCameraRepository;
                C5882f0 c5882f2 = this.cameraX;
                Intrinsics.checkNotNull(c5882f2);
                c4398cM22119d = c4403h.m22118b(lifecycleOwner, c5882f2.m26343i().mo26749b(interfaceC8804p0M26632g, interfaceC8804p0, c8742e2, c8742e, primaryCompositionSettings, secondaryCompositionSettings));
            }
            if (sessionConfig.m26474k().isEmpty()) {
                Intrinsics.checkNotNull(c4398cM22119d);
            } else {
                C4403h c4403h2 = this.lifecycleCameraRepository;
                Intrinsics.checkNotNull(c4398cM22119d);
                C5882f0 c5882f3 = this.cameraX;
                Intrinsics.checkNotNull(c5882f3);
                c4403h2.m22117a(c4398cM22119d, sessionConfig, c5882f3.m26341g().mo35286f());
                this.lifecycleCameraKeys.add(C4403h.a.m22133a(lifecycleOwner, c5933sM26581e));
            }
            C8884a.m35749f();
            return c4398cM22119d;
        } catch (Throwable th2) {
            C8884a.m35749f();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m22106p(@NotNull C5886g0 cameraXConfig) {
        Intrinsics.checkNotNullParameter(cameraXConfig, "cameraXConfig");
        C8884a.m35746c("CX:configureInstanceInternal");
        try {
            synchronized (this.lock) {
                C12637g.m47075g(cameraXConfig);
                C12637g.m47078j(getCameraXConfigProvider() == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
                m22113y(new a(cameraXConfig));
                Unit unit = Unit.f29331a;
            }
            C8884a.m35749f();
        } catch (Throwable th2) {
            C8884a.m35749f();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC8761h0 m22107q(C5945v cameraSelector, InterfaceC5937t cameraInfo) {
        Iterator<InterfaceC5929r> it = cameraSelector.m26628c().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        InterfaceC8761h0 interfaceC8761h0 = null;
        while (it.hasNext()) {
            InterfaceC5929r next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            InterfaceC5929r interfaceC5929r = next;
            if (!Intrinsics.m31980c(interfaceC5929r.m26559a(), InterfaceC5929r.f22597a)) {
                InterfaceC8773j0 interfaceC8773j0M35008a = C8727b2.m35008a(interfaceC5929r.m26559a());
                Context context = this.context;
                Intrinsics.checkNotNull(context);
                InterfaceC8761h0 interfaceC8761h0Mo35181a = interfaceC8773j0M35008a.mo35181a(cameraInfo, context);
                if (interfaceC8761h0Mo35181a == null) {
                    continue;
                } else {
                    if (interfaceC8761h0 != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    interfaceC8761h0 = interfaceC8761h0Mo35181a;
                }
            }
        }
        return interfaceC8761h0 == null ? C8779k0.m35231a() : interfaceC8761h0;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public InterfaceC5937t m22108r(@NotNull C5945v cameraSelector) {
        Object c8742e;
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        C8884a.m35746c("CX:getCameraInfo");
        try {
            C5882f0 c5882f0 = this.cameraX;
            Intrinsics.checkNotNull(c5882f0);
            InterfaceC8799o0 interfaceC8799o0Mo6698k = cameraSelector.m26632g(c5882f0.m26342h().m35040m()).mo6698k();
            Intrinsics.checkNotNullExpressionValue(interfaceC8799o0Mo6698k, "getCameraInfoInternal(...)");
            InterfaceC8761h0 interfaceC8761h0M22107q = m22107q(cameraSelector, interfaceC8799o0Mo6698k);
            C5933s.Companion companion = C5933s.INSTANCE;
            String strMo6750e = interfaceC8799o0Mo6698k.mo6750e();
            Intrinsics.checkNotNullExpressionValue(strMo6750e, "getCameraId(...)");
            C5933s c5933sM26579b = companion.m26579b(strMo6750e, null, interfaceC8761h0M22107q.mo35135b0());
            synchronized (this.lock) {
                try {
                    c8742e = this.cameraInfoMap.get(c5933sM26579b);
                    if (c8742e == null) {
                        c8742e = new C8742e(interfaceC8799o0Mo6698k, interfaceC8761h0M22107q);
                        this.cameraInfoMap.put(c5933sM26579b, c8742e);
                    }
                    Unit unit = Unit.f29331a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C8742e c8742e2 = (C8742e) c8742e;
            C8884a.m35749f();
            return c8742e2;
        } catch (Throwable th3) {
            C8884a.m35749f();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: s */
    public final int m22109s() {
        C5882f0 c5882f0 = this.cameraX;
        if (c5882f0 == null) {
            return 0;
        }
        Intrinsics.checkNotNull(c5882f0);
        return c5882f0.m26341g().mo35286f().mo23116e();
    }

    @Nullable
    /* JADX INFO: renamed from: t, reason: from getter */
    public final C5886g0.b getCameraXConfigProvider() {
        return this.cameraXConfigProvider;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final InterfaceFutureC9440x<Void> m22111u(@NotNull Context context, @Nullable C5886g0 cameraXConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (this.lock) {
            InterfaceFutureC9440x<Void> interfaceFutureC9440x = this.cameraXInitializeFuture;
            if (interfaceFutureC9440x != null) {
                Intrinsics.m31981d(interfaceFutureC9440x, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<java.lang.Void>");
                return interfaceFutureC9440x;
            }
            if (cameraXConfig != null) {
                m22106p(cameraXConfig);
            }
            final C5882f0 c5882f0 = new C5882f0(context, this.cameraXConfigProvider);
            m22114z(c5882f0.m26344j());
            C10763d c10763dM40973c = C10763d.m40973c(this.cameraXShutdownFuture);
            final Function1 function1 = new Function1() { // from class: d1.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4402g.m22098v(c5882f0, (Void) obj);
                }
            };
            C10763d c10763dM40977g = c10763dM40973c.m40977g(new InterfaceC10760a() { // from class: d1.e
                @Override // p397r0.InterfaceC10760a
                public final InterfaceFutureC9440x apply(Object obj) {
                    return C4402g.m22099w(function1, obj);
                }
            }, C10417c.m40081b());
            Intrinsics.checkNotNullExpressionValue(c10763dM40977g, "transformAsync(...)");
            this.cameraXInitializeFuture = c10763dM40977g;
            C10773n.m40987j(c10763dM40977g, new b(c5882f0, context), C10417c.m40081b());
            InterfaceFutureC9440x<Void> interfaceFutureC9440xM40996s = C10773n.m40996s(c10763dM40977g);
            Intrinsics.checkNotNullExpressionValue(interfaceFutureC9440xM40996s, "nonCancellationPropagating(...)");
            return interfaceFutureC9440xM40996s;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m22112x(int i10) {
        C5882f0 c5882f0 = this.cameraX;
        if (c5882f0 == null) {
            return;
        }
        Intrinsics.checkNotNull(c5882f0);
        c5882f0.m26341g().mo35286f().mo23118h(i10);
    }

    /* JADX INFO: renamed from: y */
    public final void m22113y(@Nullable C5886g0.b bVar) {
        this.cameraXConfigProvider = bVar;
    }

    /* JADX INFO: renamed from: z */
    public void m22114z(int i10) {
        this.configImplType = i10;
    }
}
