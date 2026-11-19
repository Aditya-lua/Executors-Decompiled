package wi;

import android.util.Log;
import av.g1;
import av.k;
import av.m0;
import av.p0;
import av.q0;
import av.z2;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.common.InputImage;
import cv.i;
import cv.j;
import gu.l;
import gu.m;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u00020\u00072\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R<\u0010\u0016\u001a*\u0012\u0004\u0012\u00020\u000b\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r0\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, d2 = {"Lwi/c;", BuildConfig.FLAVOR, "<init>", "()V", "Lkotlin/Function2;", "Lav/p0;", "Leu/b;", BuildConfig.FLAVOR, "block", "f", "(Lkotlin/jvm/functions/Function2;)V", BuildConfig.FLAVOR, "conversationId", "Lkotlin/Function1;", "c", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "b", "Lav/p0;", "scope", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcv/g;", "Ljava/util/concurrent/ConcurrentHashMap;", "conversationChannels", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f35808a = new c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final p0 scope = q0.a(z2.b(null, 1, null).plus(g1.b()).plus(new b(m0.INSTANCE)));

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, cv.g<Function1<eu.b<? super Unit>, Object>>> conversationChannels = new ConcurrentHashMap<>();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.job.BackgroundJobDispatcher$enqueueOrdered$channel$1$1$1", f = "BackgroundJobDispatcher.kt", l = {InputImage.IMAGE_FORMAT_YUV_420_888, 37}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f35810t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f35811u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f35812v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ cv.g<Function1<eu.b<? super Unit>, Object>> f35813w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f35814x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cv.g<Function1<eu.b<? super Unit>, Object>> gVar, String str, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f35813w = gVar;
            this.f35814x = str;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new a(this.f35813w, this.f35814x, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0043  */
        /* JADX WARN: Code duplicated, block: B:21:0x004e  */
        /* JADX WARN: Code duplicated, block: B:27:0x007f  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
        
            if (r9.invoke(r8) == r0) goto L24;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0062 -> B:26:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0065 -> B:26:0x007d). Please report as a decompilation issue!!! */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            i<Function1<eu.b<? super Unit>, Object>> it;
            i<Function1<eu.b<? super Unit>, Object>> iVar;
            Object objA;
            Object objE = fu.c.e();
            int i10 = this.f35812v;
            if (i10 == 0) {
                o.b(obj);
                it = this.f35813w.iterator();
                this.f35810t = it;
                this.f35811u = null;
                this.f35812v = 1;
                objA = it.a(this);
                if (objA != objE) {
                    iVar = it;
                    obj = objA;
                    if (!((Boolean) obj).booleanValue()) {
                        return Unit.f21506a;
                    }
                    Function1<eu.b<? super Unit>, Object> next = iVar.next();
                    this.f35810t = iVar;
                    this.f35811u = l.a(next);
                    this.f35812v = 2;
                }
                return objE;
            }
            if (i10 == 1) {
                iVar = (i) this.f35810t;
                o.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.f21506a;
                }
                Function1<eu.b<? super Unit>, Object> next2 = iVar.next();
                this.f35810t = iVar;
                this.f35811u = l.a(next2);
                this.f35812v = 2;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar = (i) this.f35810t;
                try {
                    o.b(obj);
                } catch (Exception e10) {
                    Log.e("BackgroundJobDispatcher", "Failed to execute ordered job for " + this.f35814x, e10);
                }
            }
            it = iVar;
            this.f35810t = it;
            this.f35811u = null;
            this.f35812v = 1;
            objA = it.a(this);
            if (objA != objE) {
                iVar = it;
                obj = objA;
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.f21506a;
                }
                Function1<eu.b<? super Unit>, Object> next3 = iVar.next();
                this.f35810t = iVar;
                this.f35811u = l.a(next3);
                this.f35812v = 2;
            }
            return objE;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"wi/c$b", "Lkotlin/coroutines/a;", "Lav/m0;", "Lkotlin/coroutines/CoroutineContext;", "context", BuildConfig.FLAVOR, "exception", BuildConfig.FLAVOR, "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends p001kotlin.coroutines.a implements m0 {
        public b(m0.Companion companion) {
            super(companion);
        }

        @Override // av.m0
        public void handleException(CoroutineContext context, Throwable exception) {
            Log.e("BackgroundJobDispatcher", "Uncaught exception in background job", exception);
        }
    }

    public static final cv.g d(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        cv.g gVarB = j.b(Integer.MAX_VALUE, null, null, 6, null);
        k.d(scope, null, null, new a(gVarB, str, null), 3, null);
        return gVarB;
    }

    public static final cv.g e(Function1 function1, Object obj) {
        return (cv.g) function1.invoke(obj);
    }

    public final void c(@NotNull final String conversationId, @NotNull Function1<? super eu.b<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(block, "block");
        ConcurrentHashMap<String, cv.g<Function1<eu.b<? super Unit>, Object>>> concurrentHashMap = conversationChannels;
        final Function1 function1 = new Function1() { // from class: wi.a
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.d(conversationId, (String) obj);
            }
        };
        cv.g<Function1<eu.b<? super Unit>, Object>> gVarComputeIfAbsent = concurrentHashMap.computeIfAbsent(conversationId, new Function() { // from class: wi.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return c.e(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(gVarComputeIfAbsent, "computeIfAbsent(...)");
        gVarComputeIfAbsent.v(block);
    }

    public final void f(@NotNull Function2<? super p0, ? super eu.b<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        k.d(scope, null, null, block, 3, null);
    }
}
