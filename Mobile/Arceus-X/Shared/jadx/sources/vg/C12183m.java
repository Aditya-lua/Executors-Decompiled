package vg;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.roblox.client.RobloxApplication;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.p050db.RobloxDatabase;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kh.C7613c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p104ei.C5125c;
import p104ei.C5132j;
import p151gk.C6107c;
import p229jt.C7342i;
import p229jt.C7348o;
import p229jt.InterfaceC7341h;
import p256ku.AbstractC7888l0;
import p256ku.AbstractC7923t1;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.C7910q0;
import p256ku.C7931v1;
import p256ku.InterfaceC7906p0;
import p272lh.InterfaceC8137a;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;
import sg.C11295a1;
import th.C11659h;
import vi.C12216g;

/* JADX INFO: renamed from: vg.m */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010%\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, m31665d2 = {"Lvg/m;", "", "<init>", "()V", "", "evt", "ctx", "", "Lcom/roblox/client/datastructures/NameValuePair;", "params", "", "waitForFullBatch", "", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "i", "(Z)V", "Lku/l0;", "b", "Lku/l0;", "eventUploadDispatcher", "Lku/p0;", "Lku/p0;", "eventUploadScope", "Lvg/p$c;", "d", "Lvg/p$c;", "eventUploader", "Llh/a;", "e", "Ljt/h;", "f", "()Llh/a;", "analyticEventDao", "Lvg/p;", "g", "()Lvg/p;", "eventUploadWorker", "Lvg/p$b;", "h", "()Lvg/p$b;", "eventUploaderConfig", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12183m {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12183m f42874a = new C12183m();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AbstractC7888l0 eventUploadDispatcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7906p0 eventUploadScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final C12186p.c eventUploader;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h analyticEventDao;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h eventUploadWorker;

    /* JADX INFO: renamed from: vg.m$a */
    @Metadata(m31664d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"vg/m$a", "Lvg/p$c;", "", "url", "body", "contentType", "Lei/j;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "counterName", "", "a", "(Ljava/lang/String;)V", "", "value", "b", "(Ljava/lang/String;J)V", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements C12186p.c {

        /* JADX INFO: renamed from: vg.m$a$a, reason: collision with other inner class name */
        @InterfaceC10344f(m39663c = "com.roblox.client.analytics.EventUploadJob$eventUploader$1", m39664f = "EventUploadJob.kt", m39665l = {55}, m39666m = "upload", m39667v = 1)
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14270a extends AbstractC10342d {

            /* JADX INFO: renamed from: t */
            public Object f42880t;

            /* JADX INFO: renamed from: u */
            public Object f42881u;

            /* JADX INFO: renamed from: v */
            public Object f42882v;

            /* JADX INFO: renamed from: w */
            public /* synthetic */ Object f42883w;

            /* JADX INFO: renamed from: y */
            public int f42885y;

            public C14270a(InterfaceC9557b<? super C14270a> interfaceC9557b) {
                super(interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                this.f42883w = obj;
                this.f42885y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return a.this.mo45117c(null, null, null, this);
            }
        }

        /* JADX INFO: renamed from: vg.m$a$b */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Lei/j;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lku/p0;)Lei/j;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.roblox.client.analytics.EventUploadJob$eventUploader$1$upload$2", m39664f = "EventUploadJob.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
        public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super C5132j>, Object> {

            /* JADX INFO: renamed from: t */
            public int f42886t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ String f42887u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ String f42888v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ String f42889w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, String str2, String str3, InterfaceC9557b<? super b> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f42887u = str;
                this.f42888v = str2;
                this.f42889w = str3;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new b(this.f42887u, this.f42888v, this.f42889w, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f42886t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return C5125c.m23928l(this.f42887u, this.f42888v, null, this.f42889w, -1, -1);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C5132j> interfaceC9557b) {
                return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        @Override // vg.C12186p.c
        /* JADX INFO: renamed from: a */
        public void mo45115a(String counterName) {
            Intrinsics.checkNotNullParameter(counterName, "counterName");
            C12216g.m45228b().m45278q(counterName);
        }

        @Override // vg.C12186p.c
        /* JADX INFO: renamed from: b */
        public void mo45116b(String counterName, long value) {
            Intrinsics.checkNotNullParameter(counterName, "counterName");
            C12216g.m45228b().m45279r(counterName, value);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // vg.C12186p.c
        /* JADX INFO: renamed from: c */
        public Object mo45117c(String str, String str2, String str3, InterfaceC9557b<? super C5132j> interfaceC9557b) {
            C14270a c14270a;
            if (interfaceC9557b instanceof C14270a) {
                c14270a = (C14270a) interfaceC9557b;
                int i10 = c14270a.f42885y;
                if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                    c14270a.f42885y = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    c14270a = new C14270a(interfaceC9557b);
                }
            } else {
                c14270a = new C14270a(interfaceC9557b);
            }
            Object objM32684g = c14270a.f42883w;
            Object objM38805e = C10047c.m38805e();
            int i11 = c14270a.f42885y;
            if (i11 == 0) {
                C7348o.m30470b(objM32684g);
                AbstractC7888l0 abstractC7888l0M32644b = C7864g1.m32644b();
                b bVar = new b(str, str2, str3, null);
                c14270a.f42880t = C10350l.m39676a(str);
                c14270a.f42881u = C10350l.m39676a(str2);
                c14270a.f42882v = C10350l.m39676a(str3);
                c14270a.f42885y = 1;
                objM32684g = C7872i.m32684g(abstractC7888l0M32644b, bVar, c14270a);
                if (objM32684g == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(objM32684g);
            }
            Intrinsics.checkNotNullExpressionValue(objM32684g, "withContext(...)");
            return objM32684g;
        }
    }

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        AbstractC7923t1 abstractC7923t1M32926c = C7931v1.m32926c(executorServiceNewSingleThreadExecutor);
        eventUploadDispatcher = abstractC7923t1M32926c;
        eventUploadScope = C7910q0.m32885a(abstractC7923t1M32926c);
        eventUploader = new a();
        analyticEventDao = C7342i.m30456b(new Function0() { // from class: vg.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C12183m.m45109d();
            }
        });
        eventUploadWorker = C7342i.m30456b(new Function0() { // from class: vg.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C12183m.m45110e();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static final void m45108c(@NotNull String evt, @NotNull String ctx, @NotNull List<? extends NameValuePair> params, boolean waitForFullBatch) {
        Intrinsics.checkNotNullParameter(evt, "evt");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(params, "params");
        f42874a.m45113g().m45127h(evt, ctx, params, waitForFullBatch);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC8137a m45109d() {
        C7613c c7613c = C7613c.f29132a;
        Context contextM14834f = RobloxApplication.m14834f();
        Intrinsics.checkNotNullExpressionValue(contextM14834f, "getAppContext(...)");
        RobloxDatabase robloxDatabaseM31498b = c7613c.m31498b(contextM14834f);
        if (robloxDatabaseM31498b != null) {
            return robloxDatabaseM31498b.mo15101X();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final C12186p m45110e() {
        InterfaceC7906p0 interfaceC7906p0 = eventUploadScope;
        C12183m c12183m = f42874a;
        return new C12186p(interfaceC7906p0, c12183m.m45112f(), eventUploader, c12183m.m45114h());
    }

    /* JADX INFO: renamed from: i */
    public static final void m45111i(boolean waitForFullBatch) {
        f42874a.m45113g().m45134q(waitForFullBatch);
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC8137a m45112f() {
        return (InterfaceC8137a) analyticEventDao.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final C12186p m45113g() {
        return (C12186p) eventUploadWorker.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final C12186p.Config m45114h() {
        int iMo43743w = C11659h.m43403a().mo43743w();
        String strM42387C0 = C11295a1.m42387C0();
        Intrinsics.checkNotNullExpressionValue(strM42387C0, "rbxAnalyticsBatchUrl(...)");
        String strM42418S = C11295a1.m42418S();
        Intrinsics.checkNotNullExpressionValue(strM42418S, "getJsonContentType(...)");
        String mDeviceId = C11295a1.f39656t;
        Intrinsics.checkNotNullExpressionValue(mDeviceId, "mDeviceId");
        return new C12186p.Config(strM42387C0, iMo43743w, strM42418S, mDeviceId, C6107c.m27009d(), false, C11659h.m43403a().mo43665k5(), C11659h.m43403a().mo43563X(), C11659h.m43403a().mo43437E4(), C11659h.m43403a().mo43407A2());
    }
}
