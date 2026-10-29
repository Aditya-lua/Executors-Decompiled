package z4;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x4.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"R", "Lx4/u;", "db", "", "inTransaction", "", "", "tableNames", "Lkotlin/Function1;", "Lf5/b;", "block", "Lnu/h;", "a", "(Lx4/u;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lnu/h;", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<R> implements nu.h<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nu.h f37180a;
        public final /* synthetic */ u b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f37181c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function1 f37182d;

        /* JADX INFO: renamed from: z4.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        public static final class C0671a<T> implements nu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ nu.i f37183a;
            public final /* synthetic */ u b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f37184c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Function1 f37185d;

            /* JADX INFO: renamed from: z4.k$a$a$a, reason: collision with other inner class name */
            @pt.f(c = "androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2", f = "FlowBuilder.kt", l = {220, 219}, m = "emit")
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C0672a extends pt.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f37186t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f37187u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public Object f37188v;

                public C0672a(nt.b bVar) {
                    super(bVar);
                }

                @Override // pt.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f37186t = obj;
                    this.f37187u |= Integer.MIN_VALUE;
                    return C0671a.this.emit(null, this);
                }
            }

            public C0671a(nu.i iVar, u uVar, boolean z10, Function1 function1) {
                this.f37183a = iVar;
                this.b = uVar;
                this.f37184c = z10;
                this.f37185d = function1;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
            
                if (r8.emit(r9, r0) == r1) goto L22;
             */
            @Override // nu.i
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, @org.jetbrains.annotations.NotNull nt.b r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof z4.k.a.C0671a.C0672a
                    if (r0 == 0) goto L13
                    r0 = r9
                    z4.k$a$a$a r0 = (z4.k.a.C0671a.C0672a) r0
                    int r1 = r0.f37187u
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f37187u = r1
                    goto L18
                L13:
                    z4.k$a$a$a r0 = new z4.k$a$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f37186t
                    java.lang.Object r1 = ot.c.e()
                    int r2 = r0.f37187u
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    jt.o.b(r9)
                    goto L63
                L2c:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L34:
                    java.lang.Object r8 = r0.f37188v
                    nu.i r8 = (nu.i) r8
                    jt.o.b(r9)
                    goto L57
                L3c:
                    jt.o.b(r9)
                    nu.i r9 = r7.f37183a
                    java.util.Set r8 = (java.util.Set) r8
                    x4.u r8 = r7.b
                    boolean r2 = r7.f37184c
                    kotlin.jvm.functions.Function1 r5 = r7.f37185d
                    r0.f37188v = r9
                    r0.f37187u = r4
                    java.lang.Object r8 = c5.a.e(r8, r4, r2, r5, r0)
                    if (r8 != r1) goto L54
                    goto L62
                L54:
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L57:
                    r2 = 0
                    r0.f37188v = r2
                    r0.f37187u = r3
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L63
                L62:
                    return r1
                L63:
                    kotlin.Unit r8 = kotlin.Unit.f22483a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: z4.k.a.C0671a.emit(java.lang.Object, nt.b):java.lang.Object");
            }
        }

        public a(nu.h hVar, u uVar, boolean z10, Function1 function1) {
            this.f37180a = hVar;
            this.b = uVar;
            this.f37181c = z10;
            this.f37182d = function1;
        }

        @Override // nu.h
        @Nullable
        public Object collect(@NotNull nu.i iVar, @NotNull nt.b bVar) {
            Object objCollect = this.f37180a.collect(new C0671a(iVar, this.b, this.f37181c, this.f37182d), bVar);
            return objCollect == ot.c.e() ? objCollect : Unit.f22483a;
        }
    }

    @NotNull
    public static final <R> nu.h<R> a(@NotNull u db2, boolean z10, @NotNull String[] tableNames, @NotNull Function1<? super f5.b, ? extends R> block) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(block, "block");
        return new a(nu.j.k(db2.t().j((String[]) Arrays.copyOf(tableNames, tableNames.length), true)), db2, z10, block);
    }
}
