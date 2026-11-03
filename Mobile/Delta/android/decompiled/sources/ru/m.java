package ru;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import ou.e0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00010\u00002\"\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\"6\u0010\u0011\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u0014\u0010\u0019\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014\"\u0014\u0010\u001b\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014\"\u001a\u0010\u001f\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001e*H\b\u0007\u0010!\" \u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00010\u00022 \u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00010\u0002*H\b\u0007\u0010\"\" \u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022 \u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002*\u0080\u0001\b\u0007\u0010#\"<\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00020\u00022<\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00020\u0002¨\u0006$"}, d2 = {"Liu/n;", "", "Lkotlin/Function3;", "", "", "Lkotlin/coroutines/CoroutineContext;", "onCancellation", "", "j", "(Liu/n;Lxt/n;)Z", "", "trySelectInternalResult", "Lru/o;", "a", "(I)Lru/o;", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "Lxt/n;", "DUMMY_PROCESS_RESULT_FUNCTION", "Lou/e0;", "b", "Lou/e0;", "STATE_REG", "c", "STATE_COMPLETED", "d", "STATE_CANCELLED", "e", "NO_RESULT", "f", "i", "()Lou/e0;", "PARAM_CLAUSE_0", "Lru/l;", "RegistrationFunction", "ProcessResultFunction", "OnCancellationConstructor", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final xt.n<Object, Object, Object, Object> f30924a = a.f30929a;

    @NotNull
    public static final e0 b = new e0("STATE_REG");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final e0 f30925c = new e0("STATE_COMPLETED");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final e0 f30926d = new e0("STATE_CANCELLED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final e0 f30927e = new e0("NO_RESULT");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final e0 f30928f = new e0("PARAM_CLAUSE_0");

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements xt.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30929a = new a();

        @Override // xt.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    public static final o a(int i10) {
        if (i10 == 0) {
            return o.SUCCESSFUL;
        }
        if (i10 == 1) {
            return o.REREGISTER;
        }
        if (i10 == 2) {
            return o.CANCELLED;
        }
        if (i10 == 3) {
            return o.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    @NotNull
    public static final e0 i() {
        return f30928f;
    }

    public static final boolean j(iu.n<? super Unit> nVar, xt.n<? super Throwable, Object, ? super CoroutineContext, Unit> nVar2) {
        Object objW = nVar.w(Unit.f22938a, null, nVar2);
        if (objW == null) {
            return false;
        }
        nVar.K(objW);
        return true;
    }
}
