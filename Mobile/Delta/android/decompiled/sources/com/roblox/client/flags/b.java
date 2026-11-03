package com.roblox.client.flags;

import android.content.SharedPreferences;
import ek.q;
import gt.o;
import iu.g1;
import iu.i;
import iu.k;
import iu.l0;
import iu.p0;
import iu.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nt.f;
import nt.m;
import org.jetbrains.annotations.NotNull;
import rh.h;
import su.g;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010%\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b\u001e\u0010$R\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/roblox/client/flags/b;", "", "<init>", "()V", "Landroid/content/SharedPreferences;", "preferences", "", "f", "(Landroid/content/SharedPreferences;)V", "", "name", "h", "(Ljava/lang/String;)V", "i", "(Llt/b;)Ljava/lang/Object;", "", "d", "()[Ljava/lang/String;", "Liu/l0;", "b", "Liu/l0;", "ioDispatcher", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "nativeFlagsInitialized", "", "Ljava/util/Set;", "flagsToRegister", "Lsu/a;", "e", "Lsu/a;", "flagsMutex", "", "value", "I", "()I", "nativeFlagProviderId", "", "g", "()Z", "isNativeFlagProviderInitialized", "flags_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f9110a = new b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final l0 ioDispatcher = g1.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final AtomicBoolean nativeFlagsInitialized = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Set<String> flagsToRegister = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final su.a flagsMutex = g.b(false, 1, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static volatile int nativeFlagProviderId;

    @f(c = "com.roblox.client.flags.FlagSettings$initializeNativeFlagsWithCache$1", f = "FlagSettings.kt", l = {59}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class a extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9115t;

        public a(lt.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new a(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f9115t;
            if (i10 == 0) {
                o.b(obj);
                b bVar = b.f9110a;
                this.f9115t = 1;
                if (bVar.i(this) == objE) {
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
    }

    /* JADX INFO: renamed from: com.roblox.client.flags.b$b, reason: collision with other inner class name */
    @f(c = "com.roblox.client.flags.FlagSettings$registerNativeFlag$1", f = "FlagSettings.kt", l = {116}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class C0141b extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9116t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9117u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9118v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f9119w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f9120x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0141b(String str, lt.b<? super C0141b> bVar) {
            super(2, bVar);
            this.f9120x = str;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new C0141b(this.f9120x, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((C0141b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            su.a aVar;
            String str;
            Object objE = mt.c.e();
            int i10 = this.f9119w;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    b bVar = b.f9110a;
                    if (bVar.g()) {
                        FlagJniInterface.nativeRegisterFFlag(this.f9120x, bVar.e());
                    } else {
                        q.b("FlagSettings", "registerNativeFlag: " + this.f9120x + " called before initialization.");
                        aVar = b.flagsMutex;
                        String str2 = this.f9120x;
                        this.f9116t = aVar;
                        this.f9117u = str2;
                        this.f9118v = 0;
                        this.f9119w = 1;
                        if (aVar.b(null, this) == objE) {
                            return objE;
                        }
                        str = str2;
                    }
                    return Unit.f22938a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f9117u;
                aVar = (su.a) this.f9116t;
                o.b(obj);
                b.flagsToRegister.add(str);
                Unit unit = Unit.f22938a;
                return Unit.f22938a;
            } finally {
                aVar.f(null);
            }
        }
    }

    @f(c = "com.roblox.client.flags.FlagSettings$registerPendingNativeFlags$2", f = "FlagSettings.kt", l = {116}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class c extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9121t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f9122u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9123v;

        public c(lt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new c(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            su.a aVar;
            Object objE = mt.c.e();
            int i10 = this.f9123v;
            if (i10 == 0) {
                o.b(obj);
                su.a aVar2 = b.flagsMutex;
                this.f9121t = aVar2;
                this.f9122u = 0;
                this.f9123v = 1;
                if (aVar2.b(null, this) == objE) {
                    return objE;
                }
                aVar = aVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (su.a) this.f9121t;
                o.b(obj);
            }
            try {
                Iterator it = b.flagsToRegister.iterator();
                while (it.hasNext()) {
                    FlagJniInterface.nativeRegisterFFlag((String) it.next(), b.f9110a.e());
                }
                b.flagsToRegister.clear();
                Unit unit = Unit.f22938a;
                return Unit.f22938a;
            } finally {
                aVar.f(null);
            }
        }
    }

    public final String[] d() {
        Set<Map.Entry<String, com.roblox.client.flags.a>> setX3 = h.a().X3();
        Intrinsics.checkNotNullExpressionValue(setX3, "getEntrySet(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setX3.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Intrinsics.checkNotNull(entry);
            String str = (String) entry.getKey();
            com.roblox.client.flags.a aVar = (com.roblox.client.flags.a) entry.getValue();
            if (!(aVar instanceof com.roblox.client.flags.a.d) || !((com.roblox.client.flags.a.d) aVar).a()) {
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final int e() {
        return nativeFlagProviderId;
    }

    public final void f(@NotNull SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        q.b("FlagSettings", "initializeNativeFlagsWithCache:");
        if (nativeFlagsInitialized.getAndSet(true)) {
            q.h("FlagSettings", "initializeNativeFlagsWithCache called already, ignoring");
            return;
        }
        NativeFlagsInitResult nativeFlagsInitResultNativeInitializeNativeFlags = FlagJniInterface.nativeInitializeNativeFlags(d());
        nativeFlagProviderId = nativeFlagsInitResultNativeInitializeNativeFlags.getNativeFlagProviderId();
        rh.f.k(rh.f.f30722a, nativeFlagsInitResultNativeInitializeNativeFlags.getBooleanCachedMap(), preferences, false, 4, null);
        q.b("FlagSettings", "initializeNativeFlagsWithCache: returning providerId = " + nativeFlagProviderId);
        k.d(q0.a(ioDispatcher), null, null, new a(null), 3, null);
    }

    public final boolean g() {
        return nativeFlagsInitialized.get();
    }

    public final void h(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        k.d(q0.a(ioDispatcher), null, null, new C0141b(name, null), 3, null);
    }

    public final Object i(lt.b<? super Unit> bVar) {
        Object objG = i.g(ioDispatcher, new c(null), bVar);
        return objG == mt.c.e() ? objG : Unit.f22938a;
    }
}
