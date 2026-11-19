package com.roblox.client.flags;

import android.content.SharedPreferences;
import av.g1;
import av.i;
import av.k;
import av.l0;
import av.p0;
import av.q0;
import bi.h;
import com.github.luben.zstd.BuildConfig;
import gu.f;
import gu.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kv.g;
import ok.q;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010%\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b\u001e\u0010$R\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/roblox/client/flags/b;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/SharedPreferences;", "preferences", BuildConfig.FLAVOR, "f", "(Landroid/content/SharedPreferences;)V", BuildConfig.FLAVOR, "name", "h", "(Ljava/lang/String;)V", "i", "(Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "d", "()[Ljava/lang/String;", "Lav/l0;", "b", "Lav/l0;", "ioDispatcher", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "nativeFlagsInitialized", BuildConfig.FLAVOR, "Ljava/util/Set;", "flagsToRegister", "Lkv/a;", "e", "Lkv/a;", "flagsMutex", BuildConfig.FLAVOR, "value", "I", "()I", "nativeFlagProviderId", BuildConfig.FLAVOR, "g", "()Z", "isNativeFlagProviderInitialized", "flags_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f8926a = new b();

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
    public static final kv.a flagsMutex = g.b(false, 1, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static volatile int nativeFlagProviderId;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.flags.FlagSettings$initializeNativeFlagsWithCache$1", f = "FlagSettings.kt", l = {59}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f8931t;

        public a(eu.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new a(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f8931t;
            if (i10 == 0) {
                o.b(obj);
                b bVar = b.f8926a;
                this.f8931t = 1;
                if (bVar.i(this) == objE) {
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
    }

    /* JADX INFO: renamed from: com.roblox.client.flags.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.flags.FlagSettings$registerNativeFlag$1", f = "FlagSettings.kt", l = {116}, m = "invokeSuspend", v = 1)
    public static final class C0144b extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f8932t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f8933u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f8934v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f8935w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f8936x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0144b(String str, eu.b<? super C0144b> bVar) {
            super(2, bVar);
            this.f8936x = str;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new C0144b(this.f8936x, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((C0144b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            kv.a aVar;
            String str;
            Object objE = fu.c.e();
            int i10 = this.f8935w;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    b bVar = b.f8926a;
                    if (bVar.g()) {
                        FlagJniInterface.nativeRegisterFFlag(this.f8936x, bVar.e());
                    } else {
                        q.b("FlagSettings", "registerNativeFlag: " + this.f8936x + " called before initialization.");
                        aVar = b.flagsMutex;
                        String str2 = this.f8936x;
                        this.f8932t = aVar;
                        this.f8933u = str2;
                        this.f8934v = 0;
                        this.f8935w = 1;
                        if (aVar.d(null, this) == objE) {
                            return objE;
                        }
                        str = str2;
                    }
                    return Unit.f21506a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f8933u;
                aVar = (kv.a) this.f8932t;
                o.b(obj);
                b.flagsToRegister.add(str);
                Unit unit = Unit.f21506a;
                return Unit.f21506a;
            } finally {
                aVar.f(null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.flags.FlagSettings$registerPendingNativeFlags$2", f = "FlagSettings.kt", l = {116}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f8937t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f8938u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f8939v;

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new c(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            kv.a aVar;
            Object objE = fu.c.e();
            int i10 = this.f8939v;
            if (i10 == 0) {
                o.b(obj);
                kv.a aVar2 = b.flagsMutex;
                this.f8937t = aVar2;
                this.f8938u = 0;
                this.f8939v = 1;
                if (aVar2.d(null, this) == objE) {
                    return objE;
                }
                aVar = aVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (kv.a) this.f8937t;
                o.b(obj);
            }
            try {
                Iterator it = b.flagsToRegister.iterator();
                while (it.hasNext()) {
                    FlagJniInterface.nativeRegisterFFlag((String) it.next(), b.f8926a.e());
                }
                b.flagsToRegister.clear();
                Unit unit = Unit.f21506a;
                return Unit.f21506a;
            } finally {
                aVar.f(null);
            }
        }
    }

    public final String[] d() {
        Set<Map.Entry<String, com.roblox.client.flags.a>> setB4 = h.a().b4();
        Intrinsics.checkNotNullExpressionValue(setB4, "getEntrySet(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setB4.iterator();
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
        bi.f.k(bi.f.f4423a, nativeFlagsInitResultNativeInitializeNativeFlags.getBooleanCachedMap(), preferences, false, 4, null);
        q.b("FlagSettings", "initializeNativeFlagsWithCache: returning providerId = " + nativeFlagProviderId);
        k.d(q0.a(ioDispatcher), null, null, new a(null), 3, null);
    }

    public final boolean g() {
        return nativeFlagsInitialized.get();
    }

    public final void h(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        k.d(q0.a(ioDispatcher), null, null, new C0144b(name, null), 3, null);
    }

    public final Object i(eu.b<? super Unit> bVar) {
        Object objG = i.g(ioDispatcher, new c(null), bVar);
        return objG == fu.c.e() ? objG : Unit.f21506a;
    }
}
