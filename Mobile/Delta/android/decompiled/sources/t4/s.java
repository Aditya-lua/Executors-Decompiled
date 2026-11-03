package t4;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0097@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000bH\u0083@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lt4/s;", "Lt4/j;", "Landroid/adservices/topics/TopicsManager;", "mTopicsManager", "<init>", "(Landroid/adservices/topics/TopicsManager;)V", "Lt4/b;", "request", "Lt4/e;", "a", "(Lt4/b;Llt/b;)Ljava/lang/Object;", "Landroid/adservices/topics/GetTopicsRequest;", "c", "(Lt4/b;)Landroid/adservices/topics/GetTopicsRequest;", "Landroid/adservices/topics/GetTopicsResponse;", Payload.RESPONSE, "d", "(Landroid/adservices/topics/GetTopicsResponse;)Lt4/e;", "getTopicsRequest", "f", "(Landroid/adservices/topics/GetTopicsRequest;Llt/b;)Ljava/lang/Object;", "b", "Landroid/adservices/topics/TopicsManager;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi"})
public class s extends j {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final TopicsManager mTopicsManager;

    @nt.f(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", l = {40}, m = "getTopics$suspendImpl")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f32119t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f32120u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f32122w;

        public a(lt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32120u = obj;
            this.f32122w |= Integer.MIN_VALUE;
            return s.e(s.this, null, this);
        }
    }

    public s(@NotNull TopicsManager mTopicsManager) {
        Intrinsics.checkNotNullParameter(mTopicsManager, "mTopicsManager");
        this.mTopicsManager = mTopicsManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object e(s sVar, b bVar, lt.b<? super e> bVar2) {
        a aVar;
        if (bVar2 instanceof a) {
            aVar = (a) bVar2;
            int i10 = aVar.f32122w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f32122w = i10 - Integer.MIN_VALUE;
            } else {
                aVar = sVar.new a(bVar2);
            }
        } else {
            aVar = sVar.new a(bVar2);
        }
        Object objF = aVar.f32120u;
        Object objE = mt.c.e();
        int i11 = aVar.f32122w;
        if (i11 == 0) {
            gt.o.b(objF);
            GetTopicsRequest getTopicsRequestC = sVar.c(bVar);
            aVar.f32119t = sVar;
            aVar.f32122w = 1;
            objF = sVar.f(getTopicsRequestC, aVar);
            if (objF == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = (s) aVar.f32119t;
            gt.o.b(objF);
        }
        return sVar.d(r.a(objF));
    }

    @Override // t4.j
    @Nullable
    public Object a(@NotNull b bVar, @NotNull lt.b<? super e> bVar2) {
        return e(this, bVar, bVar2);
    }

    @NotNull
    public GetTopicsRequest c(@NotNull b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return d.f32111a.b(request);
    }

    @NotNull
    public e d(@NotNull GetTopicsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return h.f32113a.a(response);
    }

    public final Object f(GetTopicsRequest getTopicsRequest, lt.b<? super GetTopicsResponse> bVar) {
        iu.p pVar = new iu.p(mt.b.c(bVar), 1);
        pVar.H();
        this.mTopicsManager.getTopics(getTopicsRequest, new e3.n(), u2.n.a(pVar));
        Object objA = pVar.A();
        if (objA == mt.c.e()) {
            nt.h.c(bVar);
        }
        return objA;
    }
}
