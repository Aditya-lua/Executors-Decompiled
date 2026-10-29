package p082dp;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.C1759R;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.C3686i;
import com.withpersona.sdk2.inquiry.internal.network.TransitionBackRequest;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.p057ui.network.TransitionInquiryRequest;
import fo.InterfaceC5720a;
import gp.InquiryAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p231jv.C7396x;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p471um.AbstractC11873h;
import p471um.C11888w;
import p610zo.EnumC13962h;
import pt.AbstractC10342d;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: dp.i */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R(\u0010%\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\u001f\u0010$R\u0014\u0010(\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010'¨\u0006)"}, m31665d2 = {"Ldp/i;", "Lfo/a;", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "fallbackMode", "Ldp/a;", "apiController", "Lzo/h;", "environment", "Lum/w;", "moshi", "<init>", "(Lcom/withpersona/sdk2/inquiry/FallbackMode;Ldp/a;Lzo/h;Lum/w;)V", "Lgp/e;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "c", "(Lgp/e;Lnt/b;)Ljava/lang/Object;", "", "sessionToken", "", "body", "Ljv/x;", "a", "(Ljava/lang/String;Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "f", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "e", "()Lcom/withpersona/sdk2/inquiry/FallbackMode;", "b", "Ldp/a;", "Lzo/h;", "d", "Lum/w;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "value", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "currentSession", "", "()Z", "isFallbackModeActive", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4655i implements InterfaceC5720a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final FallbackMode fallbackMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4647a apiController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final EnumC13962h environment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C11888w moshi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public C3686i currentSession;

    /* JADX INFO: renamed from: dp.i$a */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager", m39664f = "RealFallbackModeManager.kt", m39665l = {49}, m39666m = "createFallbackSession")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f19057t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f19058u;

        /* JADX INFO: renamed from: w */
        public int f19060w;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19058u = obj;
            this.f19060w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C4655i.this.m22893c(null, this);
        }
    }

    /* JADX INFO: renamed from: dp.i$b */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager", m39664f = "RealFallbackModeManager.kt", m39665l = {68, 89, 101}, m39666m = "transition")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f19061A;

        /* JADX INFO: renamed from: t */
        public Object f19062t;

        /* JADX INFO: renamed from: u */
        public Object f19063u;

        /* JADX INFO: renamed from: v */
        public Object f19064v;

        /* JADX INFO: renamed from: w */
        public Object f19065w;

        /* JADX INFO: renamed from: x */
        public Object f19066x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f19067y;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19067y = obj;
            this.f19061A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C4655i.this.mo22891a(null, null, this);
        }
    }

    /* JADX INFO: renamed from: dp.i$c */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager", m39664f = "RealFallbackModeManager.kt", m39665l = {C1759R.styleable.AppCompatTheme_windowMinWidthMinor, 137}, m39666m = "transitionBack")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f19069A;

        /* JADX INFO: renamed from: t */
        public Object f19070t;

        /* JADX INFO: renamed from: u */
        public Object f19071u;

        /* JADX INFO: renamed from: v */
        public Object f19072v;

        /* JADX INFO: renamed from: w */
        public Object f19073w;

        /* JADX INFO: renamed from: x */
        public Object f19074x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f19075y;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19075y = obj;
            this.f19069A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C4655i.this.m22896f(null, null, this);
        }
    }

    public C4655i(@NotNull FallbackMode fallbackMode, @NotNull InterfaceC4647a apiController, @NotNull EnumC13962h environment, @NotNull C11888w moshi) {
        Intrinsics.checkNotNullParameter(fallbackMode, "fallbackMode");
        Intrinsics.checkNotNullParameter(apiController, "apiController");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.fallbackMode = fallbackMode;
        this.apiController = apiController;
        this.environment = environment;
        this.moshi = moshi;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v12, resolved type: java.lang.Object[] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0166, code lost:
    
        if (r1 == r3) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // fo.InterfaceC5720a
    @Nullable
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo22891a(@NotNull String str, @NotNull Object obj, @NotNull InterfaceC9557b<? super C7396x<?>> interfaceC9557b) {
        b bVar;
        String str2;
        Object obj2;
        C7396x c7396xM30651i;
        if (interfaceC9557b instanceof b) {
            bVar = (b) interfaceC9557b;
            int i10 = bVar.f19061A;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                bVar.f19061A = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                bVar = new b(interfaceC9557b);
            }
        } else {
            bVar = new b(interfaceC9557b);
        }
        Object objMo18489c = bVar.f19067y;
        Object objM38805e = C10047c.m38805e();
        int i11 = bVar.f19061A;
        int i12 = 1;
        if (i11 != 0) {
            if (i11 == 1) {
                Object obj3 = bVar.f19063u;
                String str3 = (String) bVar.f19062t;
                C7348o.m30470b(objMo18489c);
                obj2 = obj3;
                str2 = str3;
            } else {
                if (i11 == 2) {
                    C7348o.m30470b(objMo18489c);
                    return objMo18489c;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(objMo18489c);
            }
            c7396xM30651i = (C7396x) objMo18489c;
            Intrinsics.checkNotNull(c7396xM30651i);
            return c7396xM30651i;
        }
        C7348o.m30470b(objMo18489c);
        if (this.currentSession == null) {
            str2 = str;
            InquiryAttributes c6185e = new InquiryAttributes(null, null, null, str2, this.environment, null, null, null, null, null, null, null, 4071, null);
            bVar.f19062t = str2;
            obj2 = obj;
            bVar.f19063u = obj2;
            bVar.f19061A = 1;
            if (m22893c(c6185e, bVar) != objM38805e) {
            }
            return objM38805e;
        }
        str2 = str;
        obj2 = obj;
        C3686i c3686i = this.currentSession;
        if (c3686i != null) {
            c3686i.m18510f();
        }
        String str4 = null;
        Object[] objArr = 0;
        if (obj2 instanceof SubmitDocumentRequest) {
            C7396x c7396xM30651i2 = C7396x.m30651i(null);
            Intrinsics.checkNotNull(c7396xM30651i2);
            return c7396xM30651i2;
        }
        if (!(obj2 instanceof TransitionInquiryRequest)) {
            if (!(obj2 instanceof List) || ((Collection) obj2).isEmpty()) {
                C7396x c7396xM30651i3 = C7396x.m30651i(null);
                Intrinsics.checkNotNull(c7396xM30651i3);
                return c7396xM30651i3;
            }
            if (CollectionsKt.m31706d0((List) obj2) instanceof MultipartBody.Part) {
                MultipartBody.Builder builder = new MultipartBody.Builder(str4, i12, objArr == true ? 1 : 0);
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : (Iterable) obj2) {
                    if (obj4 instanceof MultipartBody.Part) {
                        arrayList.add(obj4);
                    }
                }
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj5 = arrayList.get(i13);
                    i13++;
                    builder.addPart((MultipartBody.Part) obj5);
                }
                MultipartBody multipartBodyBuild = builder.build();
                InterfaceC4647a interfaceC4647a = this.apiController;
                bVar.f19062t = C10350l.m39676a(str2);
                bVar.f19063u = C10350l.m39676a(obj2);
                bVar.f19064v = C10350l.m39676a(multipartBodyBuild);
                bVar.f19061A = 3;
                objMo18489c = interfaceC4647a.mo18489c(str2, multipartBodyBuild, bVar);
            } else {
                c7396xM30651i = C7396x.m30651i(null);
            }
            Intrinsics.checkNotNull(c7396xM30651i);
            return c7396xM30651i;
        }
        AbstractC11873h abstractC11873hM44436c = this.moshi.m44436c(TransitionInquiryRequest.class);
        String json = abstractC11873hM44436c.toJson(obj2);
        RequestBody.Companion companion = RequestBody.INSTANCE;
        Intrinsics.checkNotNull(json);
        RequestBody requestBodyCreate = companion.create(json, MediaType.INSTANCE.get("application/json"));
        InterfaceC4647a interfaceC4647a2 = this.apiController;
        bVar.f19062t = C10350l.m39676a(str2);
        bVar.f19063u = C10350l.m39676a(obj2);
        bVar.f19064v = C10350l.m39676a(abstractC11873hM44436c);
        bVar.f19065w = C10350l.m39676a(json);
        bVar.f19066x = C10350l.m39676a(requestBodyCreate);
        bVar.f19061A = 2;
        Object objMo18489c2 = interfaceC4647a2.mo18489c(str2, requestBodyCreate, bVar);
        if (objMo18489c2 != objM38805e) {
            return objMo18489c2;
        }
        return objM38805e;
    }

    @Override // fo.InterfaceC5720a
    /* JADX INFO: renamed from: b */
    public boolean mo22892b() {
        return getFallbackMode() == FallbackMode.ALWAYS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m22893c(@NotNull InquiryAttributes c6185e, @NotNull InterfaceC9557b<? super InternalErrorInfo.NetworkErrorInfo> interfaceC9557b) {
        a aVar;
        Object objMo18488b;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f19060w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f19060w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object obj = aVar.f19058u;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f19060w;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            InterfaceC4647a interfaceC4647a = this.apiController;
            aVar.f19057t = C10350l.m39676a(c6185e);
            aVar.f19060w = 1;
            objMo18488b = interfaceC4647a.mo18488b(c6185e, aVar);
            if (objMo18488b == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            objMo18488b = ((C7347n) obj).getValue();
        }
        if (C7347n.m30466h(objMo18488b)) {
            this.currentSession = (C3686i) objMo18488b;
        }
        if (C7347n.m30463e(objMo18488b) != null) {
            return new InternalErrorInfo.NetworkErrorInfo(0, "Failed to create fallback session.", false, null, 8, null);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final C3686i getCurrentSession() {
        return this.currentSession;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public FallbackMode getFallbackMode() {
        return this.fallbackMode;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    /* JADX INFO: renamed from: f */
    public Object m22896f(@NotNull String str, @NotNull Object obj, @NotNull InterfaceC9557b<? super C7396x<?>> interfaceC9557b) {
        c cVar;
        String str2;
        Object obj2 = obj;
        if (interfaceC9557b instanceof c) {
            cVar = (c) interfaceC9557b;
            int i10 = cVar.f19069A;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                cVar.f19069A = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                cVar = new c(interfaceC9557b);
            }
        } else {
            cVar = new c(interfaceC9557b);
        }
        Object obj3 = cVar.f19075y;
        Object objM38805e = C10047c.m38805e();
        int i11 = cVar.f19069A;
        if (i11 == 0) {
            C7348o.m30470b(obj3);
            if (!(obj2 instanceof TransitionBackRequest)) {
                ResponseBody.Companion companion = ResponseBody.INSTANCE;
                String json = this.moshi.m44436c(ErrorResponse.class).toJson(ErrorResponse.Companion.create("Body is not a TransitionBackRequest"));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                C7396x c7396xM30649c = C7396x.m30649c(0, companion.create(json, MediaType.INSTANCE.get("application/json")));
                Intrinsics.checkNotNullExpressionValue(c7396xM30649c, "error(...)");
                return c7396xM30649c;
            }
            if (this.currentSession == null) {
                str2 = str;
                InquiryAttributes c6185e = new InquiryAttributes(null, null, null, str2, this.environment, null, null, null, null, null, null, null, 4071, null);
                cVar.f19070t = str2;
                cVar.f19071u = obj2;
                cVar.f19069A = 1;
                if (m22893c(c6185e, cVar) != objM38805e) {
                }
            }
            str2 = str;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj3);
                return obj3;
            }
            obj2 = cVar.f19071u;
            String str3 = (String) cVar.f19070t;
            C7348o.m30470b(obj3);
            str2 = str3;
        }
        C3686i c3686i = this.currentSession;
        if (c3686i != null) {
            c3686i.m18511g();
        }
        AbstractC11873h abstractC11873hM44436c = this.moshi.m44436c(TransitionBackRequest.class);
        String json2 = abstractC11873hM44436c.toJson(obj2);
        RequestBody.Companion companion2 = RequestBody.INSTANCE;
        Intrinsics.checkNotNull(json2);
        RequestBody requestBodyCreate = companion2.create(json2, MediaType.INSTANCE.get("application/json"));
        InterfaceC4647a interfaceC4647a = this.apiController;
        cVar.f19070t = C10350l.m39676a(str2);
        cVar.f19071u = C10350l.m39676a(obj2);
        cVar.f19072v = C10350l.m39676a(abstractC11873hM44436c);
        cVar.f19073w = C10350l.m39676a(json2);
        cVar.f19074x = C10350l.m39676a(requestBodyCreate);
        cVar.f19069A = 2;
        Object objMo18487a = interfaceC4647a.mo18487a(str2, requestBodyCreate, cVar);
        return objMo18487a == objM38805e ? objM38805e : objMo18487a;
    }
}
