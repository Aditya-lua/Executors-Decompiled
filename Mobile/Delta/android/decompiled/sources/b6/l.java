package b6;

import f6.j0;
import gt.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xt.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lb6/l;", "", "", "Lc6/e;", "controllers", "<init>", "(Ljava/util/List;)V", "Ld6/n;", "trackers", "(Ld6/n;)V", "Lf6/j0;", "spec", "Llu/h;", "Lb6/b;", "a", "(Lf6/j0;)Llu/h;", "Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<c6.e> controllers;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Llu/h;", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements lu.h<b6.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lu.h[] f3874a;

        /* JADX INFO: renamed from: b6.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0074a implements Function0<b6.b[]> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ lu.h[] f3875a;

            public C0074a(lu.h[] hVarArr) {
                this.f3875a = hVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b6.b[] invoke() {
                return new b6.b[this.f3875a.length];
            }
        }

        @nt.f(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {288}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Llu/i;", "", "it", "", "<anonymous>", "(Llu/i;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
        public static final class b extends nt.m implements n<lu.i<? super b6.b>, b6.b[], lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f3876t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f3877u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f3878v;

            public b(lt.b bVar) {
                super(3, bVar);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                b6.b bVar;
                Object objE = mt.c.e();
                int i10 = this.f3876t;
                if (i10 == 0) {
                    o.b(obj);
                    lu.i iVar = (lu.i) this.f3877u;
                    b6.b[] bVarArr = (b6.b[]) ((Object[]) this.f3878v);
                    int length = bVarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            bVar = null;
                            break;
                        }
                        bVar = bVarArr[i11];
                        if (!Intrinsics.c(bVar, b6.b.a.f3848a)) {
                            break;
                        }
                        i11++;
                    }
                    if (bVar == null) {
                        bVar = b6.b.a.f3848a;
                    }
                    this.f3876t = 1;
                    if (iVar.emit(bVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return Unit.f22938a;
            }

            @Override // xt.n
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(lu.i<? super b6.b> iVar, b6.b[] bVarArr, lt.b<? super Unit> bVar) {
                b bVar2 = new b(bVar);
                bVar2.f3877u = iVar;
                bVar2.f3878v = bVarArr;
                return bVar2.invokeSuspend(Unit.f22938a);
            }
        }

        public a(lu.h[] hVarArr) {
            this.f3874a = hVarArr;
        }

        @Override // lu.h
        public Object collect(lu.i<? super b6.b> iVar, lt.b bVar) {
            lu.h[] hVarArr = this.f3874a;
            Object objA = p001mu.l.a(iVar, hVarArr, new C0074a(hVarArr), new b(null), bVar);
            return objA == mt.c.e() ? objA : Unit.f22938a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull List<? extends c6.e> controllers) {
        Intrinsics.checkNotNullParameter(controllers, "controllers");
        this.controllers = controllers;
    }

    @NotNull
    public final lu.h<b> a(@NotNull j0 spec) {
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
        return lu.j.m(new a((lu.h[]) CollectionsKt.M0(arrayList2).toArray(new lu.h[0])));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(@NotNull d6.n trackers) {
        this((List<? extends c6.e>) m.d(trackers));
        Intrinsics.checkNotNullParameter(trackers, "trackers");
    }
}
