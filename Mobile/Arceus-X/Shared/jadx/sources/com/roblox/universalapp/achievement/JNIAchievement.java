package com.roblox.universalapp.achievement;

import android.util.Log;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;
import sl.Achievement;
import sl.EnumC11401k;
import sl.InterfaceC11392b;
import sl.LocalAchievement;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m31665d2 = {"Lcom/roblox/universalapp/achievement/JNIAchievement;", "", "<init>", "()V", "", "init", "()Ljava/lang/String;", "", "handle", "", "result", "success", "(JZ)Z", "error", "failure", "(JLjava/lang/String;)Z", "codeName", "hasAchievedForNativeAsync", "(Ljava/lang/String;J)Z", "grantAchievementForNativeAsync", "c", "()Z", "Lku/p0;", "b", "Lku/p0;", "scope", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class JNIAchievement {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final JNIAchievement f12705a = new JNIAchievement();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7906p0 scope = C7910q0.m32885a(C7864g1.m32644b().plus(C7948z2.m32943b(null, 1, null)));

    /* JADX INFO: renamed from: com.roblox.universalapp.achievement.JNIAchievement$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.universalapp.achievement.JNIAchievement$grantAchievementForNativeAsync$1", m39664f = "JNIAchievement.kt", m39665l = {55}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3343a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f12707t;

        /* JADX INFO: renamed from: u */
        public int f12708u;

        /* JADX INFO: renamed from: v */
        public int f12709v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f12710w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ String f12711x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ long f12712y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3343a(String str, long j10, InterfaceC9557b<? super C3343a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12711x = str;
            this.f12712y = j10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            C3343a c3343a = new C3343a(this.f12711x, this.f12712y, interfaceC9557b);
            c3343a.f12710w = obj;
            return c3343a;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x006a  */
        /* JADX WARN: Code duplicated, block: B:27:0x0071  */
        /* JADX WARN: Code duplicated, block: B:31:0x007d  */
        /* JADX WARN: Code duplicated, block: B:33:0x0085  */
        /* JADX WARN: Code duplicated, block: B:36:0x008c  */
        /* JADX WARN: Code duplicated, block: B:38:0x008f  */
        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM30460b;
            long j10;
            long j11;
            Throwable thM30463e;
            String message;
            String name;
            Long l10;
            InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f12710w;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f12709v;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    String str = this.f12711x;
                    C7347n.Companion companion = C7347n.INSTANCE;
                    InterfaceC11392b interfaceC11392bM15964a = C3346b.f12730a.m15964a();
                    if (interfaceC11392bM15964a != null) {
                        LocalAchievement localAchievement = new LocalAchievement(str, null, 2, null);
                        this.f12710w = C10350l.m39676a(interfaceC7906p0);
                        this.f12707t = C10350l.m39676a(interfaceC7906p0);
                        this.f12708u = 0;
                        this.f12709v = 1;
                        obj = interfaceC11392bM15964a.mo15951f(localAchievement, this);
                        if (obj == objM38805e) {
                            return objM38805e;
                        }
                    } else {
                        l10 = null;
                    }
                    objM30460b = C7347n.m30460b(l10);
                    j10 = this.f12712y;
                    if (C7347n.m30466h(objM30460b)) {
                        JNIAchievement.f12705a.success(j10, ((Long) objM30460b) != null);
                    }
                    j11 = this.f12712y;
                    thM30463e = C7347n.m30463e(objM30460b);
                    if (thM30463e != null) {
                        JNIAchievement jNIAchievement = JNIAchievement.f12705a;
                        message = thM30463e.getMessage();
                        if (message == null) {
                            name = thM30463e.getClass().getName();
                        } else {
                            name = StringsKt.m32182p0(message) ? null : message;
                            if (name == null) {
                                name = thM30463e.getClass().getName();
                            }
                        }
                        Intrinsics.checkNotNull(name);
                        jNIAchievement.failure(j11, name);
                    }
                    return Unit.f29331a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                l10 = (Long) obj;
                objM30460b = C7347n.m30460b(l10);
            } catch (Throwable th2) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
            }
            j10 = this.f12712y;
            if (C7347n.m30466h(objM30460b)) {
                JNIAchievement.f12705a.success(j10, ((Long) objM30460b) != null);
            }
            j11 = this.f12712y;
            thM30463e = C7347n.m30463e(objM30460b);
            if (thM30463e != null) {
                JNIAchievement jNIAchievement2 = JNIAchievement.f12705a;
                message = thM30463e.getMessage();
                if (message == null) {
                    name = thM30463e.getClass().getName();
                } else {
                    if (StringsKt.m32182p0(message)) {
                    }
                    if (name == null) {
                        name = thM30463e.getClass().getName();
                    }
                }
                Intrinsics.checkNotNull(name);
                jNIAchievement2.failure(j11, name);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3343a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.achievement.JNIAchievement$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.universalapp.achievement.JNIAchievement$hasAchievedForNativeAsync$1", m39664f = "JNIAchievement.kt", m39665l = {40}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3344b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f12713t;

        /* JADX INFO: renamed from: u */
        public int f12714u;

        /* JADX INFO: renamed from: v */
        public int f12715v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f12716w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ String f12717x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ long f12718y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3344b(String str, long j10, InterfaceC9557b<? super C3344b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12717x = str;
            this.f12718y = j10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            C3344b c3344b = new C3344b(this.f12717x, this.f12718y, interfaceC9557b);
            c3344b.f12716w = obj;
            return c3344b;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0064  */
        /* JADX WARN: Code duplicated, block: B:27:0x006b  */
        /* JADX WARN: Code duplicated, block: B:31:0x0077  */
        /* JADX WARN: Code duplicated, block: B:33:0x007f  */
        /* JADX WARN: Code duplicated, block: B:36:0x0086  */
        /* JADX WARN: Code duplicated, block: B:38:0x0089  */
        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM30460b;
            long j10;
            long j11;
            Throwable thM30463e;
            String message;
            String name;
            Achievement achievement;
            InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f12716w;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f12715v;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    String str = this.f12717x;
                    C7347n.Companion companion = C7347n.INSTANCE;
                    InterfaceC11392b interfaceC11392bM15964a = C3346b.f12730a.m15964a();
                    if (interfaceC11392bM15964a != null) {
                        this.f12716w = C10350l.m39676a(interfaceC7906p0);
                        this.f12713t = C10350l.m39676a(interfaceC7906p0);
                        this.f12714u = 0;
                        this.f12715v = 1;
                        obj = interfaceC11392bM15964a.mo15953h(str, this);
                        if (obj == objM38805e) {
                            return objM38805e;
                        }
                    } else {
                        achievement = null;
                    }
                    objM30460b = C7347n.m30460b(achievement);
                    j10 = this.f12718y;
                    if (C7347n.m30466h(objM30460b)) {
                        JNIAchievement.f12705a.success(j10, ((Achievement) objM30460b) != null);
                    }
                    j11 = this.f12718y;
                    thM30463e = C7347n.m30463e(objM30460b);
                    if (thM30463e != null) {
                        JNIAchievement jNIAchievement = JNIAchievement.f12705a;
                        message = thM30463e.getMessage();
                        if (message == null) {
                            name = thM30463e.getClass().getName();
                        } else {
                            name = StringsKt.m32182p0(message) ? null : message;
                            if (name == null) {
                                name = thM30463e.getClass().getName();
                            }
                        }
                        Intrinsics.checkNotNull(name);
                        jNIAchievement.failure(j11, name);
                    }
                    return Unit.f29331a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                achievement = (Achievement) obj;
                objM30460b = C7347n.m30460b(achievement);
            } catch (Throwable th2) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
            }
            j10 = this.f12718y;
            if (C7347n.m30466h(objM30460b)) {
                JNIAchievement.f12705a.success(j10, ((Achievement) objM30460b) != null);
            }
            j11 = this.f12718y;
            thM30463e = C7347n.m30463e(objM30460b);
            if (thM30463e != null) {
                JNIAchievement jNIAchievement2 = JNIAchievement.f12705a;
                message = thM30463e.getMessage();
                if (message == null) {
                    name = thM30463e.getClass().getName();
                } else {
                    if (StringsKt.m32182p0(message)) {
                    }
                    if (name == null) {
                        name = thM30463e.getClass().getName();
                    }
                }
                Intrinsics.checkNotNull(name);
                jNIAchievement2.failure(j11, name);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3344b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean failure(long handle, String error);

    @Keep
    private static final boolean grantAchievementForNativeAsync(String codeName, long handle) {
        C7882k.m32780d(scope, null, null, new C3343a(codeName, handle, null), 3, null);
        return true;
    }

    @Keep
    private static final boolean hasAchievedForNativeAsync(String codeName, long handle) {
        C7882k.m32780d(scope, null, null, new C3344b(codeName, handle, null), 3, null);
        return true;
    }

    private final native String init();

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean success(long handle, boolean result);

    /* JADX INFO: renamed from: c */
    public final boolean m15932c() {
        Object objM30460b;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(EnumC11401k.valueOf(init()));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        Throwable thM30463e = C7347n.m30463e(objM30460b);
        if (thM30463e != null) {
            Log.e("rbx.achievement.jni", "failed to register with JNI: " + thM30463e.getMessage(), thM30463e);
            objM30460b = C7347n.m30460b(EnumC11401k.INITIALIZE_FAILED);
        }
        if (C7347n.m30466h(objM30460b)) {
            Log.i("rbx.achievement.jni", "Init result: " + ((EnumC11401k) objM30460b));
        }
        C7348o.m30470b(objM30460b);
        return objM30460b != EnumC11401k.INITIALIZE_FAILED;
    }
}
