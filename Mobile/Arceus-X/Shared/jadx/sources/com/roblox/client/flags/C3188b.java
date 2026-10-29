package com.roblox.client.flags;

import android.content.SharedPreferences;
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
import org.jetbrains.annotations.NotNull;
import p151gk.C6124q;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p478uu.C11976g;
import p478uu.InterfaceC11970a;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import th.C11657f;
import th.C11659h;

/* JADX INFO: renamed from: com.roblox.client.flags.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010%\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b\u001e\u0010$R\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, m31665d2 = {"Lcom/roblox/client/flags/b;", "", "<init>", "()V", "Landroid/content/SharedPreferences;", "preferences", "", "f", "(Landroid/content/SharedPreferences;)V", "", "name", "h", "(Ljava/lang/String;)V", "i", "(Lnt/b;)Ljava/lang/Object;", "", "d", "()[Ljava/lang/String;", "Lku/l0;", "b", "Lku/l0;", "ioDispatcher", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "nativeFlagsInitialized", "", "Ljava/util/Set;", "flagsToRegister", "Luu/a;", "e", "Luu/a;", "flagsMutex", "", "value", "I", "()I", "nativeFlagProviderId", "", "g", "()Z", "isNativeFlagProviderInitialized", "flags_prodRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3188b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C3188b f11801a = new C3188b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AbstractC7888l0 ioDispatcher = C7864g1.m32644b();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean nativeFlagsInitialized = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Set<String> flagsToRegister = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC11970a flagsMutex = C11976g.m44697b(false, 1, null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static volatile int nativeFlagProviderId;

    /* JADX INFO: renamed from: com.roblox.client.flags.b$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.flags.FlagSettings$initializeNativeFlagsWithCache$1", m39664f = "FlagSettings.kt", m39665l = {59}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f11807t;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new a(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f11807t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C3188b c3188b = C3188b.f11801a;
                this.f11807t = 1;
                if (c3188b.m15150i(this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.flags.b$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.flags.FlagSettings$registerNativeFlag$1", m39664f = "FlagSettings.kt", m39665l = {116}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f11808t;

        /* JADX INFO: renamed from: u */
        public Object f11809u;

        /* JADX INFO: renamed from: v */
        public int f11810v;

        /* JADX INFO: renamed from: w */
        public int f11811w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ String f11812x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f11812x = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new b(this.f11812x, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            InterfaceC11970a interfaceC11970a;
            String str;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f11811w;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    C3188b c3188b = C3188b.f11801a;
                    if (c3188b.m15148g()) {
                        FlagJniInterface.nativeRegisterFFlag(this.f11812x, c3188b.m15146e());
                    } else {
                        C6124q.m27057b("FlagSettings", "registerNativeFlag: " + this.f11812x + " called before initialization.");
                        interfaceC11970a = C3188b.flagsMutex;
                        String str2 = this.f11812x;
                        this.f11808t = interfaceC11970a;
                        this.f11809u = str2;
                        this.f11810v = 0;
                        this.f11811w = 1;
                        if (interfaceC11970a.mo44674f(null, this) == objM38805e) {
                            return objM38805e;
                        }
                        str = str2;
                    }
                    return Unit.f29331a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f11809u;
                interfaceC11970a = (InterfaceC11970a) this.f11808t;
                C7348o.m30470b(obj);
                C3188b.flagsToRegister.add(str);
                Unit unit = Unit.f29331a;
                return Unit.f29331a;
            } finally {
                interfaceC11970a.mo44673e(null);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.flags.b$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.flags.FlagSettings$registerPendingNativeFlags$2", m39664f = "FlagSettings.kt", m39665l = {116}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f11813t;

        /* JADX INFO: renamed from: u */
        public int f11814u;

        /* JADX INFO: renamed from: v */
        public int f11815v;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new c(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            InterfaceC11970a interfaceC11970a;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f11815v;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC11970a interfaceC11970a2 = C3188b.flagsMutex;
                this.f11813t = interfaceC11970a2;
                this.f11814u = 0;
                this.f11815v = 1;
                if (interfaceC11970a2.mo44674f(null, this) == objM38805e) {
                    return objM38805e;
                }
                interfaceC11970a = interfaceC11970a2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC11970a = (InterfaceC11970a) this.f11813t;
                C7348o.m30470b(obj);
            }
            try {
                Iterator it = C3188b.flagsToRegister.iterator();
                while (it.hasNext()) {
                    FlagJniInterface.nativeRegisterFFlag((String) it.next(), C3188b.f11801a.m15146e());
                }
                C3188b.flagsToRegister.clear();
                Unit unit = Unit.f29331a;
                return Unit.f29331a;
            } finally {
                interfaceC11970a.mo44673e(null);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: d */
    public final String[] m15145d() {
        Set<Map.Entry<String, C3187a>> setMo15152R3 = C11659h.m43403a().mo15152R3();
        Intrinsics.checkNotNullExpressionValue(setMo15152R3, "getEntrySet(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setMo15152R3.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Intrinsics.checkNotNull(entry);
            String str = (String) entry.getKey();
            C3187a c3187a = (C3187a) entry.getValue();
            if (!(c3187a instanceof C3187a.d) || !((C3187a.d) c3187a).m15123a()) {
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: e */
    public final int m15146e() {
        return nativeFlagProviderId;
    }

    /* JADX DEBUG: Class process forced to load method for inline: ku.i.d(ku.p0, kotlin.coroutines.CoroutineContext, ku.r0, kotlin.jvm.functions.Function2, int, java.lang.Object):ku.d2 */
    /* JADX DEBUG: Class process forced to load method for inline: th.f.k(th.f, java.util.Map, android.content.SharedPreferences, boolean, int, java.lang.Object):void */
    /* JADX INFO: renamed from: f */
    public final void m15147f(@NotNull SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        C6124q.m27057b("FlagSettings", "initializeNativeFlagsWithCache:");
        if (nativeFlagsInitialized.getAndSet(true)) {
            C6124q.m27063h("FlagSettings", "initializeNativeFlagsWithCache called already, ignoring");
            return;
        }
        NativeFlagsInitResult nativeFlagsInitResultNativeInitializeNativeFlags = FlagJniInterface.nativeInitializeNativeFlags(m15145d());
        nativeFlagProviderId = nativeFlagsInitResultNativeInitializeNativeFlags.getNativeFlagProviderId();
        C11657f.m43392k(C11657f.f41211a, nativeFlagsInitResultNativeInitializeNativeFlags.getBooleanCachedMap(), preferences, false, 4, null);
        C6124q.m27057b("FlagSettings", "initializeNativeFlagsWithCache: returning providerId = " + nativeFlagProviderId);
        C7882k.m32780d(C7910q0.m32885a(ioDispatcher), null, null, new a(null), 3, null);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m15148g() {
        return nativeFlagsInitialized.get();
    }

    /* JADX INFO: renamed from: h */
    public final void m15149h(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        C7882k.m32780d(C7910q0.m32885a(ioDispatcher), null, null, new b(name, null), 3, null);
    }

    /* JADX INFO: renamed from: i */
    public final Object m15150i(InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM32684g = C7872i.m32684g(ioDispatcher, new c(null), interfaceC9557b);
        return objM32684g == C10047c.m38805e() ? objM32684g : Unit.f29331a;
    }
}
