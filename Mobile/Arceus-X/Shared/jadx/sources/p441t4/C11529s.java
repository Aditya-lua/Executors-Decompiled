package p441t4;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p092e3.ExecutorC4775n;
import p229jt.C7348o;
import p256ku.C7905p;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import p456u2.C11785n;
import pt.AbstractC10342d;
import pt.C10346h;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: t4.s */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0097@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000bH\u0083@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Lt4/s;", "Lt4/j;", "Landroid/adservices/topics/TopicsManager;", "mTopicsManager", "<init>", "(Landroid/adservices/topics/TopicsManager;)V", "Lt4/b;", "request", "Lt4/e;", "a", "(Lt4/b;Lnt/b;)Ljava/lang/Object;", "Landroid/adservices/topics/GetTopicsRequest;", "c", "(Lt4/b;)Landroid/adservices/topics/GetTopicsRequest;", "Landroid/adservices/topics/GetTopicsResponse;", Payload.RESPONSE, "d", "(Landroid/adservices/topics/GetTopicsResponse;)Lt4/e;", "getTopicsRequest", "f", "(Landroid/adservices/topics/GetTopicsRequest;Lnt/b;)Ljava/lang/Object;", "b", "Landroid/adservices/topics/TopicsManager;", "ads-adservices_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
@SuppressLint({"NewApi"})
public class C11529s extends AbstractC11520j {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final TopicsManager mTopicsManager;

    /* JADX INFO: renamed from: t4.s$a */
    @InterfaceC10344f(m39663c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", m39664f = "TopicsManagerImplCommon.kt", m39665l = {40}, m39666m = "getTopics$suspendImpl")
    @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f40804t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f40805u;

        /* JADX INFO: renamed from: w */
        public int f40807w;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40805u = obj;
            this.f40807w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C11529s.m43100e(C11529s.this, null, this);
        }
    }

    public C11529s(@NotNull TopicsManager mTopicsManager) {
        Intrinsics.checkNotNullParameter(mTopicsManager, "mTopicsManager");
        this.mTopicsManager = mTopicsManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m43100e(C11529s c11529s, C11512b c11512b, InterfaceC9557b<? super C11515e> interfaceC9557b) {
        a aVar;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f40807w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f40807w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = c11529s.new a(interfaceC9557b);
            }
        } else {
            aVar = c11529s.new a(interfaceC9557b);
        }
        Object objM43101f = aVar.f40805u;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f40807w;
        if (i11 == 0) {
            C7348o.m30470b(objM43101f);
            GetTopicsRequest getTopicsRequestMo43094c = c11529s.mo43094c(c11512b);
            aVar.f40804t = c11529s;
            aVar.f40807w = 1;
            objM43101f = c11529s.m43101f(getTopicsRequestMo43094c, aVar);
            if (objM43101f == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c11529s = (C11529s) aVar.f40804t;
            C7348o.m30470b(objM43101f);
        }
        return c11529s.mo43095d(C11528r.m43098a(objM43101f));
    }

    @Override // p441t4.AbstractC11520j
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo43090a(@NotNull C11512b c11512b, @NotNull InterfaceC9557b<? super C11515e> interfaceC9557b) {
        return m43100e(this, c11512b, interfaceC9557b);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public GetTopicsRequest mo43094c(@NotNull C11512b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return C11514d.f40793a.m43081b(request);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public C11515e mo43095d(@NotNull GetTopicsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return C11518h.f40796a.m43085a(response);
    }

    /* JADX INFO: renamed from: f */
    public final Object m43101f(GetTopicsRequest getTopicsRequest, InterfaceC9557b<? super GetTopicsResponse> interfaceC9557b) {
        C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
        c7905p.m32860H();
        this.mTopicsManager.getTopics(getTopicsRequest, new ExecutorC4775n(), C11785n.m44080a(c7905p));
        Object objM32857A = c7905p.m32857A();
        if (objM32857A == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32857A;
    }
}
