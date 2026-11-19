package c6;

import com.github.luben.zstd.BuildConfig;
import g6.j0;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.q;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;
import pu.n;
import zt.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lc6/l;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Ld6/e;", "controllers", "<init>", "(Ljava/util/List;)V", "Le6/n;", "trackers", "(Le6/n;)V", "Lg6/j0;", "spec", "Ldv/h;", "Lc6/b;", "a", "(Lg6/j0;)Ldv/h;", "Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<d6.e> controllers;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements dv.h<c6.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ dv.h[] f4859a;

        /* JADX INFO: renamed from: c6.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0096a implements Function0<c6.b[]> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ dv.h[] f4860a;

            public C0096a(dv.h[] hVarArr) {
                this.f4860a = hVarArr;
            }

            @Override // p001kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c6.b[] invoke() {
                return new c6.b[this.f4860a.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Ldv/i;", BuildConfig.FLAVOR, "it", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
        @gu.f(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {288}, m = "invokeSuspend")
        public static final class b extends gu.m implements n<dv.i<? super c6.b>, c6.b[], eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f4861t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f4862u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f4863v;

            public b(eu.b bVar) {
                super(3, bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                c6.b bVar;
                Object objE = fu.c.e();
                int i10 = this.f4861t;
                if (i10 == 0) {
                    o.b(obj);
                    dv.i iVar = (dv.i) this.f4862u;
                    c6.b[] bVarArr = (c6.b[]) ((Object[]) this.f4863v);
                    int length = bVarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            bVar = null;
                            break;
                        }
                        bVar = bVarArr[i11];
                        if (!Intrinsics.c(bVar, c6.b.a.f4833a)) {
                            break;
                        }
                        i11++;
                    }
                    if (bVar == null) {
                        bVar = c6.b.a.f4833a;
                    }
                    this.f4861t = 1;
                    if (iVar.emit(bVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return Unit.f21506a;
            }

            @Override // pu.n
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(dv.i<? super c6.b> iVar, c6.b[] bVarArr, eu.b<? super Unit> bVar) {
                b bVar2 = new b(bVar);
                bVar2.f4862u = iVar;
                bVar2.f4863v = bVarArr;
                return bVar2.invokeSuspend(Unit.f21506a);
            }
        }

        public a(dv.h[] hVarArr) {
            this.f4859a = hVarArr;
        }

        @Override // dv.h
        public Object collect(dv.i<? super c6.b> iVar, eu.b bVar) {
            dv.h[] hVarArr = this.f4859a;
            Object objA = kotlin.l.a(iVar, hVarArr, new C0096a(hVarArr), new b(null), bVar);
            return objA == fu.c.e() ? objA : Unit.f21506a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull List<? extends d6.e> controllers) {
        Intrinsics.checkNotNullParameter(controllers, "controllers");
        this.controllers = controllers;
    }

    @NotNull
    public final dv.h<b> a(@NotNull j0 spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        List<d6.e> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((d6.e) obj).b(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q.u(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            arrayList2.add(((d6.e) obj2).a(spec.constraints));
        }
        return dv.j.m(new a((dv.h[]) CollectionsKt.M0(arrayList2).toArray(new dv.h[0])));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(@NotNull e6.n trackers) {
        this((List<? extends d6.e>) m.d(trackers));
        Intrinsics.checkNotNullParameter(trackers, "trackers");
    }
}
