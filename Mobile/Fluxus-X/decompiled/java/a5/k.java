package a5;

import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import y4.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"R", "Ly4/u;", "db", BuildConfig.FLAVOR, "inTransaction", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "tableNames", "Lkotlin/Function1;", "Lg5/b;", "block", "Ldv/h;", "a", "(Ly4/u;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ldv/h;", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<R> implements dv.h<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ dv.h f150a;
        public final /* synthetic */ u b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function1 f152d;

        /* JADX INFO: renamed from: a5.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", BuildConfig.FLAVOR, "emit", "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        public static final class C0001a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ dv.i f153a;
            public final /* synthetic */ u b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f154c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Function1 f155d;

            /* JADX INFO: renamed from: a5.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @gu.f(c = "androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2", f = "FlowBuilder.kt", l = {220, 219}, m = "emit")
            public static final class C0002a extends gu.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f156t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f157u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public Object f158v;

                public C0002a(eu.b bVar) {
                    super(bVar);
                }

                @Override // gu.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f156t = obj;
                    this.f157u |= Integer.MIN_VALUE;
                    return C0001a.this.emit(null, this);
                }
            }

            public C0001a(dv.i iVar, u uVar, boolean z10, Function1 function1) {
                this.f153a = iVar;
                this.b = uVar;
                this.f154c = z10;
                this.f155d = function1;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
            
                if (r8.emit(r9, r0) == r1) goto L22;
             */
            @Override // dv.i
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull eu.b bVar) {
                C0002a c0002a;
                dv.i iVar;
                if (bVar instanceof C0002a) {
                    c0002a = (C0002a) bVar;
                    int i10 = c0002a.f157u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0002a.f157u = i10 - Integer.MIN_VALUE;
                    } else {
                        c0002a = new C0002a(bVar);
                    }
                } else {
                    c0002a = new C0002a(bVar);
                }
                Object obj2 = c0002a.f156t;
                Object objE = fu.c.e();
                int i11 = c0002a.f157u;
                if (i11 != 0) {
                    if (i11 == 1) {
                        dv.i iVar2 = (dv.i) c0002a.f158v;
                        zt.o.b(obj2);
                        iVar = iVar2;
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zt.o.b(obj2);
                    }
                    return Unit.f21506a;
                }
                zt.o.b(obj2);
                dv.i iVar3 = this.f153a;
                u uVar = this.b;
                boolean z10 = this.f154c;
                Function1 function1 = this.f155d;
                c0002a.f158v = iVar3;
                c0002a.f157u = 1;
                Object objE2 = d5.a.e(uVar, true, z10, function1, c0002a);
                if (objE2 != objE) {
                    obj2 = objE2;
                    iVar = iVar3;
                }
                return objE;
                c0002a.f158v = null;
                c0002a.f157u = 2;
            }
        }

        public a(dv.h hVar, u uVar, boolean z10, Function1 function1) {
            this.f150a = hVar;
            this.b = uVar;
            this.f151c = z10;
            this.f152d = function1;
        }

        @Override // dv.h
        @Nullable
        public Object collect(@NotNull dv.i iVar, @NotNull eu.b bVar) {
            Object objCollect = this.f150a.collect(new C0001a(iVar, this.b, this.f151c, this.f152d), bVar);
            return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
        }
    }

    @NotNull
    public static final <R> dv.h<R> a(@NotNull u db2, boolean z10, @NotNull String[] tableNames, @NotNull Function1<? super g5.b, ? extends R> block) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(block, "block");
        return new a(dv.j.k(db2.t().j((String[]) Arrays.copyOf(tableNames, tableNames.length), true)), db2, z10, block);
    }
}
