package d1;

import android.content.Context;
import g0.f0;
import g0.g0;
import g0.g2;
import g0.i0;
import g0.l;
import g0.q1;
import g0.r;
import g0.s;
import g0.t;
import g0.v;
import g0.w2;
import g0.x2;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.x;
import n0.b2;
import n0.h0;
import n0.j0;
import n0.k0;
import n0.o0;
import n0.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.z;
import r0.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0002\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J'\u0010)\u001a\u00020\u001f2\u0016\u0010(\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010'0&\"\u0004\u0018\u00010'H\u0017¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001fH\u0017¢\u0006\u0004\b+\u0010\u0003J'\u0010.\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0017¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R*\u0010=\u001a\u0004\u0018\u0001058\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b6\u00107\u0012\u0004\b<\u0010\u0003\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u0010?R$\u0010C\u001a\u0010\u0012\f\u0012\n A*\u0004\u0018\u00010\u001c0\u001c0\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u0010?R\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR*\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bL\u0010M\u0012\u0004\bR\u0010\u0003\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR \u0010X\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020U0S8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bV\u0010WR$\u0010^\u001a\u0012\u0012\u0004\u0012\u00020Z0Yj\b\u0012\u0004\u0012\u00020Z`[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\"\u0010f\u001a\u00020_8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010g\u001a\u00020_2\u0006\u0010g\u001a\u00020_8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bh\u0010c\"\u0004\bi\u0010e¨\u0006j"}, d2 = {"Ld1/g;", "", "<init>", "()V", "Landroidx/lifecycle/s;", "lifecycleOwner", "Lg0/v;", "primaryCameraSelector", "secondaryCameraSelector", "Lg0/i0;", "primaryCompositionSettings", "secondaryCompositionSettings", "Lg0/g2;", "sessionConfig", "Lg0/l;", "n", "(Landroidx/lifecycle/s;Lg0/v;Lg0/v;Lg0/i0;Lg0/i0;Lg0/g2;)Lg0/l;", "cameraSelector", "Lg0/t;", "cameraInfo", "Ln0/h0;", "q", "(Lg0/v;Lg0/t;)Ln0/h0;", "Landroid/content/Context;", "context", "Lg0/g0;", "cameraXConfig", "Lme/x;", "Ljava/lang/Void;", "u", "(Landroid/content/Context;Lg0/g0;)Lme/x;", "", "p", "(Lg0/g0;)V", "", "clearConfigProvider", "B", "(Z)Lme/x;", "", "Lg0/w2;", "useCases", "D", "([Lg0/w2;)V", "E", "Lg0/x2;", "useCaseGroup", "m", "(Landroidx/lifecycle/s;Lg0/v;Lg0/x2;)Lg0/l;", "r", "(Lg0/v;)Lg0/t;", "a", "Ljava/lang/Object;", "lock", "Lg0/g0$b;", "b", "Lg0/g0$b;", "t", "()Lg0/g0$b;", "y", "(Lg0/g0$b;)V", "getCameraXConfigProvider$camera_lifecycle_release$annotations", "cameraXConfigProvider", "c", "Lme/x;", "cameraXInitializeFuture", "kotlin.jvm.PlatformType", "d", "cameraXShutdownFuture", "Ld1/h;", "e", "Ld1/h;", "lifecycleCameraRepository", "Lg0/f0;", "f", "Lg0/f0;", "cameraX", "g", "Landroid/content/Context;", "getContext$camera_lifecycle_release", "()Landroid/content/Context;", "A", "(Landroid/content/Context;)V", "getContext$camera_lifecycle_release$annotations", "", "Lg0/s;", "Ln0/e;", "h", "Ljava/util/Map;", "cameraInfoMap", "Ljava/util/HashSet;", "Ld1/h$a;", "Lkotlin/collections/HashSet;", "i", "Ljava/util/HashSet;", "lifecycleCameraKeys", "", "j", "I", "getConfigImplType", "()I", "z", "(I)V", "configImplType", "cameraOperatingMode", "s", "x", "camera-lifecycle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object lock = new Object();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public g0.b cameraXConfigProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public x<Void> cameraXInitializeFuture;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public x<Void> cameraXShutdownFuture;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h lifecycleCameraRepository;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public f0 cameraX;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Context context;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<s, n0.e> cameraInfoMap;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HashSet<h.a> lifecycleCameraKeys;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int configImplType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements g0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g0 f14292a;

        public a(g0 g0Var) {
            this.f14292a = g0Var;
        }

        @Override // g0.g0.b
        public final g0 getCameraXConfig() {
            return this.f14292a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"d1/g$b", "Lr0/c;", "Ljava/lang/Void;", "void", "", "a", "(Ljava/lang/Void;)V", "", "t", "onFailure", "(Ljava/lang/Throwable;)V", "camera-lifecycle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements r0.c<Void> {
        public final /* synthetic */ f0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f14294c;

        public b(f0 f0Var, Context context) {
            this.b = f0Var;
            this.f14294c = context;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            g.this.cameraX = this.b;
            g.this.A(p0.f.a(this.f14294c));
        }

        @Override // r0.c
        public void onFailure(Throwable t8) {
            Intrinsics.checkNotNullParameter(t8, "t");
            g.this.B(false);
        }
    }

    public g() {
        x<Void> xVarP = n.p(null);
        Intrinsics.checkNotNullExpressionValue(xVarP, "immediateFuture(...)");
        this.cameraXShutdownFuture = xVarP;
        h hVarC = h.c();
        Intrinsics.checkNotNullExpressionValue(hVarC, "getInstance(...)");
        this.lifecycleCameraRepository = hVarC;
        this.cameraInfoMap = new HashMap();
        this.lifecycleCameraKeys = new HashSet<>();
        this.configImplType = -1;
    }

    public static final void C(g gVar) {
        gVar.E();
        gVar.lifecycleCameraRepository.i(gVar.lifecycleCameraKeys);
    }

    public static /* synthetic */ l o(g gVar, androidx.p000lifecycle.s sVar, v vVar, v vVar2, i0 i0Var, i0 i0Var2, g2 g2Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            vVar2 = null;
        }
        v vVar3 = vVar2;
        if ((i10 & 8) != 0) {
            i0Var = i0.f17453d;
        }
        i0 i0Var3 = i0Var;
        if ((i10 & 16) != 0) {
            i0Var2 = i0.f17453d;
        }
        return gVar.n(sVar, vVar, vVar3, i0Var3, i0Var2, g2Var);
    }

    public static final x v(f0 f0Var, Void r8) {
        return f0Var.l();
    }

    public static final x w(Function1 function1, Object obj) {
        return (x) function1.invoke(obj);
    }

    public final void A(@Nullable Context context) {
        this.context = context;
    }

    @NotNull
    public final x<Void> B(boolean clearConfigProvider) {
        x<Void> xVarP;
        z.f(new Runnable() { // from class: d1.f
            @Override // java.lang.Runnable
            public final void run() {
                g.C(this.f14282a);
            }
        });
        f0 f0Var = this.cameraX;
        if (f0Var != null) {
            Intrinsics.checkNotNull(f0Var);
            xVarP = f0Var.q();
        } else {
            xVarP = n.p(null);
        }
        Intrinsics.checkNotNull(xVarP);
        synchronized (this.lock) {
            if (clearConfigProvider) {
                try {
                    this.cameraXConfigProvider = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.cameraXInitializeFuture = null;
            this.cameraXShutdownFuture = xVarP;
            this.cameraInfoMap.clear();
            this.lifecycleCameraKeys.clear();
            Unit unit = Unit.f22483a;
        }
        this.cameraX = null;
        this.context = null;
        return xVarP;
    }

    public void D(@NotNull w2... useCases) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        n5.a.c("CX:unbind");
        try {
            z.b();
            if (s() == 2) {
                throw new UnsupportedOperationException("Unbind UseCase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            this.lifecycleCameraRepository.m(new q1(m.I(useCases), null, null, 6, null), this.lifecycleCameraKeys);
            Unit unit = Unit.f22483a;
            n5.a.f();
        } catch (Throwable th2) {
            n5.a.f();
            throw th2;
        }
    }

    public void E() {
        n5.a.c("CX:unbindAll");
        try {
            z.b();
            x(0);
            this.lifecycleCameraRepository.n(this.lifecycleCameraKeys);
            Unit unit = Unit.f22483a;
        } finally {
            n5.a.f();
        }
    }

    @NotNull
    public l m(@NotNull androidx.p000lifecycle.s lifecycleOwner, @NotNull v cameraSelector, @NotNull x2 useCaseGroup) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(useCaseGroup, "useCaseGroup");
        n5.a.c("CX:bindToLifecycle-UseCaseGroup");
        try {
            if (s() == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
            }
            x(1);
            l lVarO = o(this, lifecycleOwner, cameraSelector, null, null, null, new q1(useCaseGroup), 28, null);
            n5.a.f();
            return lVarO;
        } catch (Throwable th2) {
            n5.a.f();
            throw th2;
        }
    }

    public final l n(androidx.p000lifecycle.s lifecycleOwner, v primaryCameraSelector, v secondaryCameraSelector, i0 primaryCompositionSettings, i0 secondaryCompositionSettings, g2 sessionConfig) {
        p0 p0Var;
        n0.e eVar;
        n5.a.c("CX:bindToLifecycle-internal");
        try {
            z.b();
            f0 f0Var = this.cameraX;
            Intrinsics.checkNotNull(f0Var);
            p0 p0VarG = primaryCameraSelector.g(f0Var.h().m());
            Intrinsics.checkNotNullExpressionValue(p0VarG, "select(...)");
            p0VarG.r(true);
            t tVarR = r(primaryCameraSelector);
            Intrinsics.d(tVarR, "null cannot be cast to non-null type androidx.camera.core.impl.AdapterCameraInfo");
            n0.e eVar2 = (n0.e) tVarR;
            if (secondaryCameraSelector != null) {
                f0 f0Var2 = this.cameraX;
                Intrinsics.checkNotNull(f0Var2);
                p0 p0VarG2 = secondaryCameraSelector.g(f0Var2.h().m());
                p0VarG2.r(false);
                t tVarR2 = r(secondaryCameraSelector);
                Intrinsics.d(tVarR2, "null cannot be cast to non-null type androidx.camera.core.impl.AdapterCameraInfo");
                p0Var = p0VarG2;
                eVar = (n0.e) tVarR2;
            } else {
                p0Var = null;
                eVar = null;
            }
            s sVarE = s.INSTANCE.e(eVar2, eVar);
            c cVarD = this.lifecycleCameraRepository.d(lifecycleOwner, sVarE);
            Collection<c> collectionF = this.lifecycleCameraRepository.f();
            for (w2 w2Var : sessionConfig.k()) {
                for (c cVar : collectionF) {
                    Intrinsics.checkNotNullExpressionValue(cVar, "next(...)");
                    c cVar2 = cVar;
                    if (cVar2.v(w2Var) && !Intrinsics.c(cVar2.t(), lifecycleOwner)) {
                        kotlin.jvm.internal.g0 g0Var = kotlin.jvm.internal.g0.f22559a;
                        String str = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{w2Var}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        throw new IllegalStateException(str);
                    }
                }
            }
            if (cVarD == null) {
                h hVar = this.lifecycleCameraRepository;
                f0 f0Var3 = this.cameraX;
                Intrinsics.checkNotNull(f0Var3);
                cVarD = hVar.b(lifecycleOwner, f0Var3.i().b(p0VarG, p0Var, eVar2, eVar, primaryCompositionSettings, secondaryCompositionSettings));
            }
            if (sessionConfig.k().isEmpty()) {
                Intrinsics.checkNotNull(cVarD);
            } else {
                h hVar2 = this.lifecycleCameraRepository;
                Intrinsics.checkNotNull(cVarD);
                f0 f0Var4 = this.cameraX;
                Intrinsics.checkNotNull(f0Var4);
                hVar2.a(cVarD, sessionConfig, f0Var4.g().f());
                this.lifecycleCameraKeys.add(h.a.a(lifecycleOwner, sVarE));
            }
            n5.a.f();
            return cVarD;
        } catch (Throwable th2) {
            n5.a.f();
            throw th2;
        }
    }

    public final void p(@NotNull g0 cameraXConfig) {
        Intrinsics.checkNotNullParameter(cameraXConfig, "cameraXConfig");
        n5.a.c("CX:configureInstanceInternal");
        try {
            synchronized (this.lock) {
                x2.g.g(cameraXConfig);
                x2.g.j(getCameraXConfigProvider() == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
                y(new a(cameraXConfig));
                Unit unit = Unit.f22483a;
            }
            n5.a.f();
        } catch (Throwable th2) {
            n5.a.f();
            throw th2;
        }
    }

    public final h0 q(v cameraSelector, t cameraInfo) {
        Iterator<r> it = cameraSelector.c().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        h0 h0Var = null;
        while (it.hasNext()) {
            r next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            r rVar = next;
            if (!Intrinsics.c(rVar.a(), r.f17505a)) {
                j0 j0VarA = b2.a(rVar.a());
                Context context = this.context;
                Intrinsics.checkNotNull(context);
                h0 h0VarA = j0VarA.a(cameraInfo, context);
                if (h0VarA == null) {
                    continue;
                } else {
                    if (h0Var != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    h0Var = h0VarA;
                }
            }
        }
        return h0Var == null ? k0.a() : h0Var;
    }

    @NotNull
    public t r(@NotNull v cameraSelector) {
        Object eVar;
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        n5.a.c("CX:getCameraInfo");
        try {
            f0 f0Var = this.cameraX;
            Intrinsics.checkNotNull(f0Var);
            o0 o0VarK = cameraSelector.g(f0Var.h().m()).k();
            Intrinsics.checkNotNullExpressionValue(o0VarK, "getCameraInfoInternal(...)");
            h0 h0VarQ = q(cameraSelector, o0VarK);
            s.Companion companion = s.INSTANCE;
            String strE = o0VarK.e();
            Intrinsics.checkNotNullExpressionValue(strE, "getCameraId(...)");
            s sVarB = companion.b(strE, null, h0VarQ.b0());
            synchronized (this.lock) {
                try {
                    eVar = this.cameraInfoMap.get(sVarB);
                    if (eVar == null) {
                        eVar = new n0.e(o0VarK, h0VarQ);
                        this.cameraInfoMap.put(sVarB, eVar);
                    }
                    Unit unit = Unit.f22483a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            n0.e eVar2 = (n0.e) eVar;
            n5.a.f();
            return eVar2;
        } catch (Throwable th3) {
            n5.a.f();
            throw th3;
        }
    }

    public final int s() {
        f0 f0Var = this.cameraX;
        if (f0Var == null) {
            return 0;
        }
        Intrinsics.checkNotNull(f0Var);
        return f0Var.g().f().e();
    }

    @Nullable
    /* JADX INFO: renamed from: t, reason: from getter */
    public final g0.b getCameraXConfigProvider() {
        return this.cameraXConfigProvider;
    }

    @NotNull
    public final x<Void> u(@NotNull Context context, @Nullable g0 cameraXConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (this.lock) {
            x<Void> xVar = this.cameraXInitializeFuture;
            if (xVar != null) {
                Intrinsics.d(xVar, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<java.lang.Void>");
                return xVar;
            }
            if (cameraXConfig != null) {
                p(cameraXConfig);
            }
            final f0 f0Var = new f0(context, this.cameraXConfigProvider);
            z(f0Var.j());
            r0.d dVarC = r0.d.c(this.cameraXShutdownFuture);
            final Function1 function1 = new Function1() { // from class: d1.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.v(f0Var, (Void) obj);
                }
            };
            r0.d dVarG = dVarC.g(new r0.a() { // from class: d1.e
                @Override // r0.a
                public final x apply(Object obj) {
                    return g.w(function1, obj);
                }
            }, q0.c.b());
            Intrinsics.checkNotNullExpressionValue(dVarG, "transformAsync(...)");
            this.cameraXInitializeFuture = dVarG;
            n.j(dVarG, new b(f0Var, context), q0.c.b());
            x<Void> xVarS = n.s(dVarG);
            Intrinsics.checkNotNullExpressionValue(xVarS, "nonCancellationPropagating(...)");
            return xVarS;
        }
    }

    public final void x(int i10) {
        f0 f0Var = this.cameraX;
        if (f0Var == null) {
            return;
        }
        Intrinsics.checkNotNull(f0Var);
        f0Var.g().f().h(i10);
    }

    public final void y(@Nullable g0.b bVar) {
        this.cameraXConfigProvider = bVar;
    }

    public void z(int i10) {
        this.configImplType = i10;
    }
}
