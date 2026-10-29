package p452tu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import p256ku.InterfaceC7897n;
import p395qu.C10719e0;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: tu.m */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00010\u00002\"\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\"6\u0010\u0011\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u0014\u0010\u0019\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014\"\u0014\u0010\u001b\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014\"\u001a\u0010\u001f\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001e*H\b\u0007\u0010!\" \u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00010\u00022 \u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00010\u0002*H\b\u0007\u0010\"\" \u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022 \u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002*\u0080\u0001\b\u0007\u0010#\"<\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00020\u00022<\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00020\u0002¨\u0006$"}, m31665d2 = {"Lku/n;", "", "Lkotlin/Function3;", "", "", "Lkotlin/coroutines/CoroutineContext;", "onCancellation", "", "j", "(Lku/n;Lzt/n;)Z", "", "trySelectInternalResult", "Ltu/o;", "a", "(I)Ltu/o;", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "Lzt/n;", "DUMMY_PROCESS_RESULT_FUNCTION", "Lqu/e0;", "b", "Lqu/e0;", "STATE_REG", "c", "STATE_COMPLETED", "d", "STATE_CANCELLED", "e", "NO_RESULT", "f", "i", "()Lqu/e0;", "PARAM_CLAUSE_0", "Ltu/l;", "RegistrationFunction", "ProcessResultFunction", "OnCancellationConstructor", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C11761m {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final InterfaceC14057n<Object, Object, Object, Object> f41455a = a.f41461a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C10719e0 f41456b = new C10719e0("STATE_REG");

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final C10719e0 f41457c = new C10719e0("STATE_COMPLETED");

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final C10719e0 f41458d = new C10719e0("STATE_CANCELLED");

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final C10719e0 f41459e = new C10719e0("NO_RESULT");

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final C10719e0 f41460f = new C10719e0("PARAM_CLAUSE_0");

    /* JADX INFO: renamed from: tu.m$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a implements InterfaceC14057n {

        /* JADX INFO: renamed from: a */
        public static final a f41461a = new a();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p615zt.InterfaceC14057n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final EnumC11763o m44029a(int i10) {
        if (i10 == 0) {
            return EnumC11763o.SUCCESSFUL;
        }
        if (i10 == 1) {
            return EnumC11763o.REREGISTER;
        }
        if (i10 == 2) {
            return EnumC11763o.CANCELLED;
        }
        if (i10 == 3) {
            return EnumC11763o.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final C10719e0 m44037i() {
        return f41460f;
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m44038j(InterfaceC7897n<? super Unit> interfaceC7897n, InterfaceC14057n<? super Throwable, Object, ? super CoroutineContext, Unit> interfaceC14057n) {
        Object objMo32809G = interfaceC7897n.mo32809G(Unit.f29331a, null, interfaceC14057n);
        if (objMo32809G == null) {
            return false;
        }
        interfaceC7897n.mo32810J(objMo32809G);
        return true;
    }
}
