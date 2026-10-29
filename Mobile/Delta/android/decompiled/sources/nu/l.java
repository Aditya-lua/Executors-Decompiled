package nu;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a6\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"T", "Lnu/i;", "Lmu/x;", "channel", "", "b", "(Lnu/i;Lmu/x;Lnt/b;)Ljava/lang/Object;", "", "consume", "c", "(Lnu/i;Lmu/x;ZLnt/b;)Ljava/lang/Object;", "Lnu/h;", "e", "(Lmu/x;)Lnu/h;", "Lku/p0;", "scope", "d", "(Lnu/h;Lku/p0;)Lmu/x;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @pt.f(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {32, 33}, m = "emitAllImpl$FlowKt__ChannelsKt")
    public static final class a<T> extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f26728t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f26729u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f26730v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f26731w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f26732x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f26733y;

        public a(nt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f26732x = obj;
            this.f26733y |= Integer.MIN_VALUE;
            return l.c(null, null, false, this);
        }
    }

    @Nullable
    public static final <T> Object b(@NotNull i<? super T> iVar, @NotNull mu.x<? extends T> xVar, @NotNull nt.b<? super Unit> bVar) {
        Object objC = c(iVar, xVar, true, bVar);
        return objC == ot.c.e() ? objC : Unit.f22483a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(nu.i<? super T> r6, mu.x<? extends T> r7, boolean r8, nt.b<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof nu.l.a
            if (r0 == 0) goto L13
            r0 = r9
            nu.l$a r0 = (nu.l.a) r0
            int r1 = r0.f26733y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26733y = r1
            goto L18
        L13:
            nu.l$a r0 = new nu.l$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f26732x
            java.lang.Object r1 = ot.c.e()
            int r2 = r0.f26733y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f26731w
            java.lang.Object r6 = r0.f26730v
            mu.i r6 = (mu.i) r6
            java.lang.Object r7 = r0.f26729u
            mu.x r7 = (mu.x) r7
            java.lang.Object r2 = r0.f26728t
            nu.i r2 = (nu.i) r2
            jt.o.b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f26731w
            java.lang.Object r6 = r0.f26730v
            mu.i r6 = (mu.i) r6
            java.lang.Object r7 = r0.f26729u
            mu.x r7 = (mu.x) r7
            java.lang.Object r2 = r0.f26728t
            nu.i r2 = (nu.i) r2
            jt.o.b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            jt.o.b(r9)
            nu.j.r(r6)
            mu.i r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f26728t = r6     // Catch: java.lang.Throwable -> L3c
            r0.f26729u = r7     // Catch: java.lang.Throwable -> L3c
            r0.f26730v = r9     // Catch: java.lang.Throwable -> L3c
            r0.f26731w = r8     // Catch: java.lang.Throwable -> L3c
            r0.f26733y = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            goto L93
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f26728t = r2     // Catch: java.lang.Throwable -> L3c
            r0.f26729u = r7     // Catch: java.lang.Throwable -> L3c
            r0.f26730v = r6     // Catch: java.lang.Throwable -> L3c
            r0.f26731w = r8     // Catch: java.lang.Throwable -> L3c
            r0.f26733y = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
        L93:
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            mu.n.a(r7, r6)
        L9a:
            kotlin.Unit r6 = kotlin.Unit.f22483a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            mu.n.a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nu.l.c(nu.i, mu.x, boolean, nt.b):java.lang.Object");
    }

    @NotNull
    public static final <T> mu.x<T> d(@NotNull h<? extends T> hVar, @NotNull ku.p0 p0Var) {
        return p001ou.f.b(hVar).m(p0Var);
    }

    @NotNull
    public static final <T> h<T> e(@NotNull mu.x<? extends T> xVar) {
        return new e(xVar, false, null, 0, null, 28, null);
    }
}
