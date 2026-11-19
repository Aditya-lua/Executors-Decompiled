package rp;

import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest;
import com.withpersona.sdk2.inquiry.internal.network.TransitionBackRequest;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.ui.network.TransitionInquiryRequest;
import gu.l;
import hn.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import mv.b0;
import mv.c0;
import mv.g0;
import mv.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.internal.Intrinsics;
import sw.x;
import up.InquiryAttributes;
import zt.n;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R(\u0010%\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\u001f\u0010$R\u0014\u0010(\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010'¨\u0006)"}, d2 = {"Lrp/i;", "Lso/a;", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "fallbackMode", "Lrp/a;", "apiController", "Lnp/h;", "environment", "Lhn/w;", "moshi", "<init>", "(Lcom/withpersona/sdk2/inquiry/FallbackMode;Lrp/a;Lnp/h;Lhn/w;)V", "Lup/e;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "c", "(Lup/e;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "sessionToken", BuildConfig.FLAVOR, "body", "Lsw/x;", "a", "(Ljava/lang/String;Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", "f", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "e", "()Lcom/withpersona/sdk2/inquiry/FallbackMode;", "b", "Lrp/a;", "Lnp/h;", "d", "Lhn/w;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "value", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "currentSession", BuildConfig.FLAVOR, "()Z", "isFallbackModeActive", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements so.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FallbackMode fallbackMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final rp.a apiController;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final np.h environment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final w moshi;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public com.withpersona.sdk2.inquiry.internal.fallbackmode.i currentSession;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager", f = "RealFallbackModeManager.kt", l = {49}, m = "createFallbackSession")
    public static final class a extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f30850t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f30851u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f30853w;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30851u = obj;
            this.f30853w |= Integer.MIN_VALUE;
            return i.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager", f = "RealFallbackModeManager.kt", l = {68, 89, MlKitException.NOT_ENOUGH_SPACE}, m = "transition")
    public static final class b extends gu.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f30854t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f30855u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f30856v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f30857w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f30858x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f30859y;

        public b(eu.b<? super b> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30859y = obj;
            this.A |= Integer.MIN_VALUE;
            return i.this.a(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager", f = "RealFallbackModeManager.kt", l = {125, 137}, m = "transitionBack")
    public static final class c extends gu.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f30861t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f30862u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f30863v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f30864w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f30865x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f30866y;

        public c(eu.b<? super c> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30866y = obj;
            this.A |= Integer.MIN_VALUE;
            return i.this.f(null, null, this);
        }
    }

    public i(@NotNull FallbackMode fallbackMode, @NotNull rp.a apiController, @NotNull np.h environment, @NotNull w moshi) {
        Intrinsics.checkNotNullParameter(fallbackMode, "fallbackMode");
        Intrinsics.checkNotNullParameter(apiController, "apiController");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.fallbackMode = fallbackMode;
        this.apiController = apiController;
        this.environment = environment;
        this.moshi = moshi;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0166, code lost:
    
        if (r1 == r3) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // so.a
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(@NotNull String str, @NotNull Object obj, @NotNull eu.b<? super x<?>> bVar) {
        b bVar2;
        String str2;
        Object obj2;
        x xVarI;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.A;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.A = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objA = bVar2.f30859y;
        Object objE = fu.c.e();
        int i11 = bVar2.A;
        int i12 = 1;
        if (i11 != 0) {
            if (i11 == 1) {
                Object obj3 = bVar2.f30855u;
                String str3 = (String) bVar2.f30854t;
                o.b(objA);
                obj2 = obj3;
                str2 = str3;
            } else {
                if (i11 == 2) {
                    o.b(objA);
                    return objA;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(objA);
            }
            xVarI = (x) objA;
            Intrinsics.checkNotNull(xVarI);
            return xVarI;
        }
        o.b(objA);
        if (this.currentSession == null) {
            str2 = str;
            InquiryAttributes eVar = new InquiryAttributes(null, null, null, str2, this.environment, null, null, null, null, null, null, null, 4071, null);
            bVar2.f30854t = str2;
            obj2 = obj;
            bVar2.f30855u = obj2;
            bVar2.A = 1;
            if (c(eVar, bVar2) != objE) {
            }
            return objE;
        }
        str2 = str;
        obj2 = obj;
        com.withpersona.sdk2.inquiry.internal.fallbackmode.i iVar = this.currentSession;
        if (iVar != null) {
            iVar.f();
        }
        String str4 = null;
        Object[] objArr = 0;
        if (obj2 instanceof SubmitDocumentRequest) {
            x xVarI2 = x.i(null);
            Intrinsics.checkNotNull(xVarI2);
            return xVarI2;
        }
        if (!(obj2 instanceof TransitionInquiryRequest)) {
            if (!(obj2 instanceof List) || ((Collection) obj2).isEmpty()) {
                x xVarI3 = x.i(null);
                Intrinsics.checkNotNull(xVarI3);
                return xVarI3;
            }
            if (CollectionsKt.d0((List) obj2) instanceof c0.c) {
                c0.a aVar = new c0.a(str4, i12, objArr == true ? 1 : 0);
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : (Iterable) obj2) {
                    if (obj4 instanceof c0.c) {
                        arrayList.add(obj4);
                    }
                }
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj5 = arrayList.get(i13);
                    i13++;
                    aVar.c((c0.c) obj5);
                }
                c0 c0VarD = aVar.d();
                rp.a aVar2 = this.apiController;
                bVar2.f30854t = l.a(str2);
                bVar2.f30855u = l.a(obj2);
                bVar2.f30856v = l.a(c0VarD);
                bVar2.A = 3;
                objA = aVar2.a(str2, c0VarD, bVar2);
            } else {
                xVarI = x.i(null);
            }
            Intrinsics.checkNotNull(xVarI);
            return xVarI;
        }
        hn.h hVarC = this.moshi.c(TransitionInquiryRequest.class);
        String json = hVarC.toJson(obj2);
        g0.Companion aVar3 = g0.INSTANCE;
        Intrinsics.checkNotNull(json);
        g0 g0VarC = aVar3.c(json, b0.INSTANCE.a("application/json"));
        rp.a aVar4 = this.apiController;
        bVar2.f30854t = l.a(str2);
        bVar2.f30855u = l.a(obj2);
        bVar2.f30856v = l.a(hVarC);
        bVar2.f30857w = l.a(json);
        bVar2.f30858x = l.a(g0VarC);
        bVar2.A = 2;
        Object objA2 = aVar4.a(str2, g0VarC, bVar2);
        if (objA2 != objE) {
            return objA2;
        }
        return objE;
    }

    @Override // so.a
    public boolean b() {
        return getFallbackMode() == FallbackMode.ALWAYS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull InquiryAttributes eVar, @NotNull eu.b<? super InternalErrorInfo.NetworkErrorInfo> bVar) {
        a aVar;
        Object objB;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f30853w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f30853w = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f30851u;
        Object objE = fu.c.e();
        int i11 = aVar.f30853w;
        if (i11 == 0) {
            o.b(obj);
            rp.a aVar2 = this.apiController;
            aVar.f30850t = l.a(eVar);
            aVar.f30853w = 1;
            objB = aVar2.b(eVar, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            objB = ((n) obj).getValue();
        }
        if (n.h(objB)) {
            this.currentSession = (com.withpersona.sdk2.inquiry.internal.fallbackmode.i) objB;
        }
        if (n.e(objB) != null) {
            return new InternalErrorInfo.NetworkErrorInfo(0, "Failed to create fallback session.", false, null, 8, null);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final com.withpersona.sdk2.inquiry.internal.fallbackmode.i getCurrentSession() {
        return this.currentSession;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public FallbackMode getFallbackMode() {
        return this.fallbackMode;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public Object f(@NotNull String str, @NotNull Object obj, @NotNull eu.b<? super x<?>> bVar) {
        c cVar;
        String str2;
        Object obj2 = obj;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.A;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.A = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object obj3 = cVar.f30866y;
        Object objE = fu.c.e();
        int i11 = cVar.A;
        if (i11 == 0) {
            o.b(obj3);
            if (!(obj2 instanceof TransitionBackRequest)) {
                i0.Companion companion = i0.INSTANCE;
                String json = this.moshi.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create("Body is not a TransitionBackRequest"));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                x xVarC = x.c(0, companion.c(json, b0.INSTANCE.a("application/json")));
                Intrinsics.checkNotNullExpressionValue(xVarC, "error(...)");
                return xVarC;
            }
            if (this.currentSession == null) {
                str2 = str;
                InquiryAttributes eVar = new InquiryAttributes(null, null, null, str2, this.environment, null, null, null, null, null, null, null, 4071, null);
                cVar.f30861t = str2;
                cVar.f30862u = obj2;
                cVar.A = 1;
                if (c(eVar, cVar) != objE) {
                }
            }
            str2 = str;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj3);
                return obj3;
            }
            obj2 = cVar.f30862u;
            String str3 = (String) cVar.f30861t;
            o.b(obj3);
            str2 = str3;
        }
        com.withpersona.sdk2.inquiry.internal.fallbackmode.i iVar = this.currentSession;
        if (iVar != null) {
            iVar.g();
        }
        hn.h hVarC = this.moshi.c(TransitionBackRequest.class);
        String json2 = hVarC.toJson(obj2);
        g0.Companion aVar = g0.INSTANCE;
        Intrinsics.checkNotNull(json2);
        g0 g0VarC = aVar.c(json2, b0.INSTANCE.a("application/json"));
        rp.a aVar2 = this.apiController;
        cVar.f30861t = l.a(str2);
        cVar.f30862u = l.a(obj2);
        cVar.f30863v = l.a(hVarC);
        cVar.f30864w = l.a(json2);
        cVar.f30865x = l.a(g0VarC);
        cVar.A = 2;
        Object objC = aVar2.c(str2, g0VarC, cVar);
        return objC == objE ? objE : objC;
    }
}
