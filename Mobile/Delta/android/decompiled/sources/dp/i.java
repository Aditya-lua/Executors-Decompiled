package dp;

import com.appsflyer.R;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.internal.network.TransitionBackRequest;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import gp.InquiryAttributes;
import jt.n;
import jt.o;
import jv.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.l;
import um.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R(\u0010%\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\u001f\u0010$R\u0014\u0010(\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010'¨\u0006)"}, d2 = {"Ldp/i;", "Lfo/a;", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "fallbackMode", "Ldp/a;", "apiController", "Lzo/h;", "environment", "Lum/w;", "moshi", "<init>", "(Lcom/withpersona/sdk2/inquiry/FallbackMode;Ldp/a;Lzo/h;Lum/w;)V", "Lgp/e;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "c", "(Lgp/e;Lnt/b;)Ljava/lang/Object;", "", "sessionToken", "", "body", "Ljv/x;", "a", "(Ljava/lang/String;Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "f", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "e", "()Lcom/withpersona/sdk2/inquiry/FallbackMode;", "b", "Ldp/a;", "Lzo/h;", "d", "Lum/w;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "value", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "currentSession", "", "()Z", "isFallbackModeActive", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements fo.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FallbackMode fallbackMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final dp.a apiController;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zo.h environment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final w moshi;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public com.withpersona.sdk2.inquiry.internal.fallbackmode.i currentSession;

    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager", f = "RealFallbackModeManager.kt", l = {49}, m = "createFallbackSession")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f14778t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f14779u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f14781w;

        public a(nt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14779u = obj;
            this.f14781w |= Integer.MIN_VALUE;
            return i.this.c(null, this);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager", f = "RealFallbackModeManager.kt", l = {68, 89, 101}, m = "transition")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends pt.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f14782t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f14783u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f14784v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f14785w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f14786x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f14787y;

        public b(nt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14787y = obj;
            this.A |= Integer.MIN_VALUE;
            return i.this.a(null, null, this);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager", f = "RealFallbackModeManager.kt", l = {R.styleable.AppCompatTheme_windowMinWidthMinor, 137}, m = "transitionBack")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c extends pt.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f14789t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f14790u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f14791v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f14792w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f14793x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f14794y;

        public c(nt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14794y = obj;
            this.A |= Integer.MIN_VALUE;
            return i.this.f(null, null, this);
        }
    }

    public i(@NotNull FallbackMode fallbackMode, @NotNull dp.a apiController, @NotNull zo.h environment, @NotNull w moshi) {
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
    @Override // fo.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r24, @org.jetbrains.annotations.NotNull java.lang.Object r25, @org.jetbrains.annotations.NotNull nt.b<? super jv.x<?>> r26) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.i.a(java.lang.String, java.lang.Object, nt.b):java.lang.Object");
    }

    @Override // fo.a
    public boolean b() {
        return getFallbackMode() == FallbackMode.ALWAYS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull InquiryAttributes eVar, @NotNull nt.b<? super InternalErrorInfo.NetworkErrorInfo> bVar) {
        a aVar;
        Object objB;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f14781w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f14781w = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f14779u;
        Object objE = ot.c.e();
        int i11 = aVar.f14781w;
        if (i11 == 0) {
            o.b(obj);
            dp.a aVar2 = this.apiController;
            aVar.f14778t = l.a(eVar);
            aVar.f14781w = 1;
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
    public Object f(@NotNull String str, @NotNull Object obj, @NotNull nt.b<? super x<?>> bVar) {
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
        Object obj3 = cVar.f14794y;
        Object objE = ot.c.e();
        int i11 = cVar.A;
        if (i11 == 0) {
            o.b(obj3);
            if (!(obj2 instanceof TransitionBackRequest)) {
                ResponseBody.Companion companion = ResponseBody.INSTANCE;
                String json = this.moshi.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create("Body is not a TransitionBackRequest"));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                x xVarC = x.c(0, companion.create(json, MediaType.INSTANCE.get("application/json")));
                Intrinsics.checkNotNullExpressionValue(xVarC, "error(...)");
                return xVarC;
            }
            if (this.currentSession == null) {
                str2 = str;
                InquiryAttributes eVar = new InquiryAttributes(null, null, null, str2, this.environment, null, null, null, null, null, null, null, 4071, null);
                cVar.f14789t = str2;
                cVar.f14790u = obj2;
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
            obj2 = cVar.f14790u;
            String str3 = (String) cVar.f14789t;
            o.b(obj3);
            str2 = str3;
        }
        com.withpersona.sdk2.inquiry.internal.fallbackmode.i iVar = this.currentSession;
        if (iVar != null) {
            iVar.g();
        }
        um.h hVarC = this.moshi.c(TransitionBackRequest.class);
        String json2 = hVarC.toJson(obj2);
        RequestBody.Companion companion2 = RequestBody.INSTANCE;
        Intrinsics.checkNotNull(json2);
        RequestBody requestBodyCreate = companion2.create(json2, MediaType.INSTANCE.get("application/json"));
        dp.a aVar = this.apiController;
        cVar.f14789t = l.a(str2);
        cVar.f14790u = l.a(obj2);
        cVar.f14791v = l.a(hVarC);
        cVar.f14792w = l.a(json2);
        cVar.f14793x = l.a(requestBodyCreate);
        cVar.A = 2;
        Object objA = aVar.a(str2, requestBodyCreate, cVar);
        return objA == objE ? objE : objA;
    }
}
