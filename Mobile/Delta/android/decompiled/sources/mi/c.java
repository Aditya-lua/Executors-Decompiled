package mi;

import android.util.Log;
import iu.g1;
import iu.k;
import iu.m0;
import iu.p0;
import iu.q0;
import iu.z2;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.j;
import nt.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u00020\u00072\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R<\u0010\u0016\u001a*\u0012\u0004\u0012\u00020\u000b\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r0\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, d2 = {"Lmi/c;", "", "<init>", "()V", "Lkotlin/Function2;", "Liu/p0;", "Llt/b;", "", "block", "f", "(Lkotlin/jvm/functions/Function2;)V", "", "conversationId", "Lkotlin/Function1;", "c", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "b", "Liu/p0;", "scope", "Ljava/util/concurrent/ConcurrentHashMap;", "Lku/g;", "Ljava/util/concurrent/ConcurrentHashMap;", "conversationChannels", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f24802a = new c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final p0 scope = q0.a(z2.b(null, 1, null).plus(g1.b()).plus(new b(m0.INSTANCE)));

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, ku.g<Function1<lt.b<? super Unit>, Object>>> conversationChannels = new ConcurrentHashMap<>();

    @nt.f(c = "com.roblox.client.job.BackgroundJobDispatcher$enqueueOrdered$channel$1$1$1", f = "BackgroundJobDispatcher.kt", l = {35, 37}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class a extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f24804t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f24805u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f24806v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ ku.g<Function1<lt.b<? super Unit>, Object>> f24807w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f24808x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ku.g<Function1<lt.b<? super Unit>, Object>> gVar, String str, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f24807w = gVar;
            this.f24808x = str;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new a(this.f24807w, this.f24808x, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0043  */
        /* JADX WARN: Code duplicated, block: B:21:0x004e  */
        /* JADX WARN: Code duplicated, block: B:27:0x007f  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
        
            if (r9.invoke(r8) == r0) goto L24;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0062 -> B:26:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0065 -> B:26:0x007d). Please report as a decompilation issue!!! */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r8.f24806v
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L24
                if (r1 != r2) goto L1c
                java.lang.Object r1 = r8.f24805u
                kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                java.lang.Object r1 = r8.f24804t
                ku.i r1 = (ku.i) r1
                gt.o.b(r9)     // Catch: java.lang.Exception -> L1a
                goto L7d
            L1a:
                r9 = move-exception
                goto L65
            L1c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L24:
                java.lang.Object r1 = r8.f24804t
                ku.i r1 = (ku.i) r1
                gt.o.b(r9)
                goto L46
            L2c:
                gt.o.b(r9)
                ku.g<kotlin.jvm.functions.Function1<lt.b<? super kotlin.Unit>, java.lang.Object>> r9 = r8.f24807w
                ku.i r9 = r9.iterator()
            L35:
                r8.f24804t = r9
                r1 = 0
                r8.f24805u = r1
                r8.f24806v = r3
                java.lang.Object r1 = r9.a(r8)
                if (r1 != r0) goto L43
                goto L64
            L43:
                r7 = r1
                r1 = r9
                r9 = r7
            L46:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L7f
                java.lang.Object r9 = r1.next()
                kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
                r8.f24804t = r1     // Catch: java.lang.Exception -> L1a
                java.lang.Object r4 = nt.l.a(r9)     // Catch: java.lang.Exception -> L1a
                r8.f24805u = r4     // Catch: java.lang.Exception -> L1a
                r8.f24806v = r2     // Catch: java.lang.Exception -> L1a
                java.lang.Object r9 = r9.invoke(r8)     // Catch: java.lang.Exception -> L1a
                if (r9 != r0) goto L7d
            L64:
                return r0
            L65:
                java.lang.String r4 = r8.f24808x
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Failed to execute ordered job for "
                r5.append(r6)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                java.lang.String r5 = "BackgroundJobDispatcher"
                android.util.Log.e(r5, r4, r9)
            L7d:
                r9 = r1
                goto L35
            L7f:
                kotlin.Unit r9 = kotlin.Unit.f22938a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: mi.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"mi/c$b", "Lkotlin/coroutines/a;", "Liu/m0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends kotlin.coroutines.a implements m0 {
        public b(m0.Companion companion) {
            super(companion);
        }

        @Override // iu.m0
        public void handleException(CoroutineContext context, Throwable exception) {
            Log.e("BackgroundJobDispatcher", "Uncaught exception in background job", exception);
        }
    }

    public static final ku.g d(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        ku.g gVarB = j.b(Integer.MAX_VALUE, null, null, 6, null);
        k.d(scope, null, null, new a(gVarB, str, null), 3, null);
        return gVarB;
    }

    public static final ku.g e(Function1 function1, Object obj) {
        return (ku.g) function1.invoke(obj);
    }

    public final void c(@NotNull final String conversationId, @NotNull Function1<? super lt.b<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(block, "block");
        ConcurrentHashMap<String, ku.g<Function1<lt.b<? super Unit>, Object>>> concurrentHashMap = conversationChannels;
        final Function1 function1 = new Function1() { // from class: mi.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.d(conversationId, (String) obj);
            }
        };
        ku.g<Function1<lt.b<? super Unit>, Object>> gVarComputeIfAbsent = concurrentHashMap.computeIfAbsent(conversationId, new Function() { // from class: mi.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return c.e(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(gVarComputeIfAbsent, "computeIfAbsent(...)");
        gVarComputeIfAbsent.y(block);
    }

    public final void f(@NotNull Function2<? super p0, ? super lt.b<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        k.d(scope, null, null, block, 3, null);
    }
}
