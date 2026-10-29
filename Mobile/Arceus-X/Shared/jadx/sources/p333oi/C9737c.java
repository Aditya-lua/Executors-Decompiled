package p333oi;

import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.AbstractC7717a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.C8675j;
import mu.InterfaceC8672g;
import mu.InterfaceC8674i;
import org.jetbrains.annotations.NotNull;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7893m0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: oi.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u00020\u00072\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R<\u0010\u0016\u001a*\u0012\u0004\u0012\u00020\u000b\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r0\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, m31665d2 = {"Loi/c;", "", "<init>", "()V", "Lkotlin/Function2;", "Lku/p0;", "Lnt/b;", "", "block", "f", "(Lkotlin/jvm/functions/Function2;)V", "", "conversationId", "Lkotlin/Function1;", "c", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "b", "Lku/p0;", "scope", "Ljava/util/concurrent/ConcurrentHashMap;", "Lmu/g;", "Ljava/util/concurrent/ConcurrentHashMap;", "conversationChannels", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9737c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C9737c f35430a = new C9737c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7906p0 scope = C7910q0.m32885a(C7948z2.m32943b(null, 1, null).plus(C7864g1.m32644b()).plus(new b(InterfaceC7893m0.INSTANCE)));

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, InterfaceC8672g<Function1<InterfaceC9557b<? super Unit>, Object>>> conversationChannels = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: oi.c$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.job.BackgroundJobDispatcher$enqueueOrdered$channel$1$1$1", m39664f = "BackgroundJobDispatcher.kt", m39665l = {35, 37}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f35433t;

        /* JADX INFO: renamed from: u */
        public Object f35434u;

        /* JADX INFO: renamed from: v */
        public int f35435v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ InterfaceC8672g<Function1<InterfaceC9557b<? super Unit>, Object>> f35436w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ String f35437x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC8672g<Function1<InterfaceC9557b<? super Unit>, Object>> interfaceC8672g, String str, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f35436w = interfaceC8672g;
            this.f35437x = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f35436w, this.f35437x, interfaceC9557b);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0043  */
        /* JADX WARN: Code duplicated, block: B:21:0x004e  */
        /* JADX WARN: Code duplicated, block: B:27:0x007f  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
        
            if (r9.invoke(r8) == r0) goto L24;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0062 -> B:26:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0065 -> B:26:0x007d). Please report as a decompilation issue!!! */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC8674i<Function1<InterfaceC9557b<? super Unit>, Object>> it;
            InterfaceC8674i<Function1<InterfaceC9557b<? super Unit>, Object>> interfaceC8674i;
            Object objMo34879a;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f35435v;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                it = this.f35436w.iterator();
                this.f35433t = it;
                this.f35434u = null;
                this.f35435v = 1;
                objMo34879a = it.mo34879a(this);
                if (objMo34879a != objM38805e) {
                    interfaceC8674i = it;
                    obj = objMo34879a;
                    if (!((Boolean) obj).booleanValue()) {
                        return Unit.f29331a;
                    }
                    Function1<InterfaceC9557b<? super Unit>, Object> next = interfaceC8674i.next();
                    this.f35433t = interfaceC8674i;
                    this.f35434u = C10350l.m39676a(next);
                    this.f35435v = 2;
                }
                return objM38805e;
            }
            if (i10 == 1) {
                interfaceC8674i = (InterfaceC8674i) this.f35433t;
                C7348o.m30470b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.f29331a;
                }
                Function1<InterfaceC9557b<? super Unit>, Object> next2 = interfaceC8674i.next();
                this.f35433t = interfaceC8674i;
                this.f35434u = C10350l.m39676a(next2);
                this.f35435v = 2;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC8674i = (InterfaceC8674i) this.f35433t;
                try {
                    C7348o.m30470b(obj);
                } catch (Exception e10) {
                    Log.e("BackgroundJobDispatcher", "Failed to execute ordered job for " + this.f35437x, e10);
                }
            }
            it = interfaceC8674i;
            this.f35433t = it;
            this.f35434u = null;
            this.f35435v = 1;
            objMo34879a = it.mo34879a(this);
            if (objMo34879a != objM38805e) {
                interfaceC8674i = it;
                obj = objMo34879a;
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.f29331a;
                }
                Function1<InterfaceC9557b<? super Unit>, Object> next3 = interfaceC8674i.next();
                this.f35433t = interfaceC8674i;
                this.f35434u = C10350l.m39676a(next3);
                this.f35435v = 2;
            }
            return objM38805e;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: oi.c$b */
    @Metadata(m31664d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"oi/c$b", "Lkotlin/coroutines/a;", "Lku/m0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC7717a implements InterfaceC7893m0 {
        public b(InterfaceC7893m0.Companion companion) {
            super(companion);
        }

        @Override // p256ku.InterfaceC7893m0
        public void handleException(CoroutineContext context, Throwable exception) {
            Log.e("BackgroundJobDispatcher", "Uncaught exception in background job", exception);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC8672g m38528d(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        InterfaceC8672g interfaceC8672gM34927b = C8675j.m34927b(Integer.MAX_VALUE, null, null, 6, null);
        C7882k.m32780d(scope, null, null, new a(interfaceC8672gM34927b, str, null), 3, null);
        return interfaceC8672gM34927b;
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC8672g m38529e(Function1 function1, Object obj) {
        return (InterfaceC8672g) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c */
    public final void m38530c(@NotNull final String conversationId, @NotNull Function1<? super InterfaceC9557b<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(block, "block");
        ConcurrentHashMap<String, InterfaceC8672g<Function1<InterfaceC9557b<? super Unit>, Object>>> concurrentHashMap = conversationChannels;
        final Function1 function1 = new Function1() { // from class: oi.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9737c.m38528d(conversationId, (String) obj);
            }
        };
        InterfaceC8672g<Function1<InterfaceC9557b<? super Unit>, Object>> interfaceC8672gComputeIfAbsent = concurrentHashMap.computeIfAbsent(conversationId, new Function() { // from class: oi.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C9737c.m38529e(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC8672gComputeIfAbsent, "computeIfAbsent(...)");
        interfaceC8672gComputeIfAbsent.mo34870w(block);
    }

    /* JADX INFO: renamed from: f */
    public final void m38531f(@NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        C7882k.m32780d(scope, null, null, block, 3, null);
    }
}
