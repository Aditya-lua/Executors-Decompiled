package b6;

import f6.j0;
import java.util.ArrayList;
import java.util.List;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zt.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lb6/l;", "", "", "Lc6/e;", "controllers", "<init>", "(Ljava/util/List;)V", "Ld6/n;", "trackers", "(Ld6/n;)V", "Lf6/j0;", "spec", "Lnu/h;", "Lb6/b;", "a", "(Lf6/j0;)Lnu/h;", "Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<c6.e> controllers;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements nu.h<b6.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nu.h[] f3976a;

        /* JADX INFO: renamed from: b6.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0075a implements Function0<b6.b[]> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ nu.h[] f3977a;

            public C0075a(nu.h[] hVarArr) {
                this.f3977a = hVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b6.b[] invoke() {
                return new b6.b[this.f3977a.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lnu/i;", "", "it", "", "<anonymous>", "(Lnu/i;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
        @pt.f(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {288}, m = "invokeSuspend")
        public static final class b extends pt.m implements n<nu.i<? super b6.b>, b6.b[], nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f3978t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f3979u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f3980v;

            public b(nt.b bVar) {
                super(3, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                b6.b bVar;
                Object objE = ot.c.e();
                int i10 = this.f3978t;
                if (i10 == 0) {
                    o.b(obj);
                    nu.i iVar = (nu.i) this.f3979u;
                    b6.b[] bVarArr = (b6.b[]) ((Object[]) this.f3980v);
                    int length = bVarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            bVar = null;
                            break;
                        }
                        bVar = bVarArr[i11];
                        if (!Intrinsics.c(bVar, b6.b.a.f3950a)) {
                            break;
                        }
                        i11++;
                    }
                    if (bVar == null) {
                        bVar = b6.b.a.f3950a;
                    }
                    this.f3978t = 1;
                    if (iVar.emit(bVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return Unit.f22483a;
            }

            @Override // zt.n
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nu.i<? super b6.b> iVar, b6.b[] bVarArr, nt.b<? super Unit> bVar) {
                b bVar2 = new b(bVar);
                bVar2.f3979u = iVar;
                bVar2.f3980v = bVarArr;
                return bVar2.invokeSuspend(Unit.f22483a);
            }
        }

        public a(nu.h[] hVarArr) {
            this.f3976a = hVarArr;
        }

        @Override // nu.h
        public Object collect(nu.i<? super b6.b> iVar, nt.b bVar) {
            nu.h[] hVarArr = this.f3976a;
            Object objA = p001ou.l.a(iVar, hVarArr, new C0075a(hVarArr), new b(null), bVar);
            return objA == ot.c.e() ? objA : Unit.f22483a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull List<? extends c6.e> controllers) {
        Intrinsics.checkNotNullParameter(controllers, "controllers");
        this.controllers = controllers;
    }

    @NotNull
    public final nu.h<b> a(@NotNull j0 spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        List<c6.e> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((c6.e) obj).a(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q.u(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            arrayList2.add(((c6.e) obj2).b(spec.constraints));
        }
        return nu.j.m(new a((nu.h[]) CollectionsKt.M0(arrayList2).toArray(new nu.h[0])));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(@NotNull d6.n trackers) {
        this((List<? extends c6.e>) m.d(trackers));
        Intrinsics.checkNotNullParameter(trackers, "trackers");
    }
}
