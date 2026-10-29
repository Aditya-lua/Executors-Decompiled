package com.roblox.client.flags;

import android.content.SharedPreferences;
import gk.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.i;
import ku.k;
import ku.l0;
import ku.p0;
import ku.q0;
import org.jetbrains.annotations.NotNull;
import pt.f;
import pt.m;
import th.h;
import uu.g;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010%\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b\u001e\u0010$R\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/roblox/client/flags/b;", "", "<init>", "()V", "Landroid/content/SharedPreferences;", "preferences", "", "f", "(Landroid/content/SharedPreferences;)V", "", "name", "h", "(Ljava/lang/String;)V", "i", "(Lnt/b;)Ljava/lang/Object;", "", "d", "()[Ljava/lang/String;", "Lku/l0;", "b", "Lku/l0;", "ioDispatcher", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "nativeFlagsInitialized", "", "Ljava/util/Set;", "flagsToRegister", "Luu/a;", "e", "Luu/a;", "flagsMutex", "", "value", "I", "()I", "nativeFlagProviderId", "", "g", "()Z", "isNativeFlagProviderInitialized", "flags_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f9037a = new b();

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
    public static final uu.a flagsMutex = g.b(false, 1, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static volatile int nativeFlagProviderId;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.flags.FlagSettings$initializeNativeFlagsWithCache$1", f = "FlagSettings.kt", l = {59}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9042t;

        public a(nt.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new a(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f9042t;
            if (i10 == 0) {
                o.b(obj);
                b bVar = b.f9037a;
                this.f9042t = 1;
                if (bVar.i(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.flags.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.flags.FlagSettings$registerNativeFlag$1", f = "FlagSettings.kt", l = {116}, m = "invokeSuspend", v = 1)
    public static final class C0138b extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9043t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9044u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9045v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f9046w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f9047x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0138b(String str, nt.b<? super C0138b> bVar) {
            super(2, bVar);
            this.f9047x = str;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new C0138b(this.f9047x, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            uu.a aVar;
            String str;
            Object objE = ot.c.e();
            int i10 = this.f9046w;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    b bVar = b.f9037a;
                    if (bVar.g()) {
                        FlagJniInterface.nativeRegisterFFlag(this.f9047x, bVar.e());
                    } else {
                        p.b("FlagSettings", "registerNativeFlag: " + this.f9047x + " called before initialization.");
                        aVar = b.flagsMutex;
                        String str2 = this.f9047x;
                        this.f9043t = aVar;
                        this.f9044u = str2;
                        this.f9045v = 0;
                        this.f9046w = 1;
                        if (aVar.f(null, this) == objE) {
                            return objE;
                        }
                        str = str2;
                    }
                    return Unit.f22483a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f9044u;
                aVar = (uu.a) this.f9043t;
                o.b(obj);
                b.flagsToRegister.add(str);
                Unit unit = Unit.f22483a;
                return Unit.f22483a;
            } finally {
                aVar.e(null);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((C0138b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.flags.FlagSettings$registerPendingNativeFlags$2", f = "FlagSettings.kt", l = {116}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9048t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f9049u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9050v;

        public c(nt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new c(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            uu.a aVar;
            Object objE = ot.c.e();
            int i10 = this.f9050v;
            if (i10 == 0) {
                o.b(obj);
                uu.a aVar2 = b.flagsMutex;
                this.f9048t = aVar2;
                this.f9049u = 0;
                this.f9050v = 1;
                if (aVar2.f(null, this) == objE) {
                    return objE;
                }
                aVar = aVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (uu.a) this.f9048t;
                o.b(obj);
            }
            try {
                Iterator it = b.flagsToRegister.iterator();
                while (it.hasNext()) {
                    FlagJniInterface.nativeRegisterFFlag((String) it.next(), b.f9037a.e());
                }
                b.flagsToRegister.clear();
                Unit unit = Unit.f22483a;
                return Unit.f22483a;
            } finally {
                aVar.e(null);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public final String[] d() {
        Set<Map.Entry<String, com.roblox.client.flags.a>> setM3 = h.a().M3();
        Intrinsics.checkNotNullExpressionValue(setM3, "getEntrySet(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setM3.iterator();
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
        p.b("FlagSettings", "initializeNativeFlagsWithCache:");
        if (nativeFlagsInitialized.getAndSet(true)) {
            p.h("FlagSettings", "initializeNativeFlagsWithCache called already, ignoring");
            return;
        }
        NativeFlagsInitResult nativeFlagsInitResultNativeInitializeNativeFlags = FlagJniInterface.nativeInitializeNativeFlags(d());
        nativeFlagProviderId = nativeFlagsInitResultNativeInitializeNativeFlags.getNativeFlagProviderId();
        th.f.k(th.f.f31815a, nativeFlagsInitResultNativeInitializeNativeFlags.getBooleanCachedMap(), preferences, false, 4, null);
        p.b("FlagSettings", "initializeNativeFlagsWithCache: returning providerId = " + nativeFlagProviderId);
        k.d(q0.a(ioDispatcher), null, null, new a(null), 3, null);
    }

    public final boolean g() {
        return nativeFlagsInitialized.get();
    }

    public final void h(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        k.d(q0.a(ioDispatcher), null, null, new C0138b(name, null), 3, null);
    }

    public final Object i(nt.b<? super Unit> bVar) {
        Object objG = i.g(ioDispatcher, new c(null), bVar);
        return objG == ot.c.e() ? objG : Unit.f22483a;
    }
}
