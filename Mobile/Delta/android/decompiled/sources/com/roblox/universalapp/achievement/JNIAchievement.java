package com.roblox.universalapp.achievement;

import android.util.Log;
import androidx.annotation.Keep;
import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ku.g1;
import ku.k;
import ku.p0;
import ku.q0;
import ku.z2;
import org.jetbrains.annotations.NotNull;
import ot.c;
import pt.f;
import pt.l;
import pt.m;
import sl.Achievement;
import sl.LocalAchievement;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/roblox/universalapp/achievement/JNIAchievement;", "", "<init>", "()V", "", "init", "()Ljava/lang/String;", "", "handle", "", "result", "success", "(JZ)Z", "error", "failure", "(JLjava/lang/String;)Z", "codeName", "hasAchievedForNativeAsync", "(Ljava/lang/String;J)Z", "grantAchievementForNativeAsync", "c", "()Z", "Lku/p0;", "b", "Lku/p0;", "scope", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JNIAchievement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final JNIAchievement f9751a = new JNIAchievement();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final p0 scope = q0.a(g1.b().plus(z2.b(null, 1, null)));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.universalapp.achievement.JNIAchievement$grantAchievementForNativeAsync$1", f = "JNIAchievement.kt", l = {55}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9752t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f9753u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9754v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f9755w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f9756x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ long f9757y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, long j10, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f9756x = str;
            this.f9757y = j10;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            a aVar = new a(this.f9756x, this.f9757y, bVar);
            aVar.f9755w = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x006a  */
        /* JADX WARN: Code duplicated, block: B:27:0x0071  */
        /* JADX WARN: Code duplicated, block: B:31:0x007d  */
        /* JADX WARN: Code duplicated, block: B:33:0x0085  */
        /* JADX WARN: Code duplicated, block: B:36:0x008c  */
        /* JADX WARN: Code duplicated, block: B:38:0x008f  */
        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            long j10;
            long j11;
            Throwable thE;
            String message;
            String name;
            Long l10;
            p0 p0Var = (p0) this.f9755w;
            Object objE = c.e();
            int i10 = this.f9754v;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    String str = this.f9756x;
                    n.Companion companion = n.INSTANCE;
                    sl.b bVarA = com.roblox.universalapp.achievement.b.f9774a.a();
                    if (bVarA != null) {
                        LocalAchievement localAchievement = new LocalAchievement(str, null, 2, null);
                        this.f9755w = l.a(p0Var);
                        this.f9752t = l.a(p0Var);
                        this.f9753u = 0;
                        this.f9754v = 1;
                        obj = bVarA.f(localAchievement, this);
                        if (obj == objE) {
                            return objE;
                        }
                    } else {
                        l10 = null;
                    }
                    objB = n.b(l10);
                    j10 = this.f9757y;
                    if (n.h(objB)) {
                        JNIAchievement.f9751a.success(j10, ((Long) objB) != null);
                    }
                    j11 = this.f9757y;
                    thE = n.e(objB);
                    if (thE != null) {
                        JNIAchievement jNIAchievement = JNIAchievement.f9751a;
                        message = thE.getMessage();
                        if (message == null) {
                            name = thE.getClass().getName();
                        } else {
                            name = StringsKt.p0(message) ? null : message;
                            if (name == null) {
                                name = thE.getClass().getName();
                            }
                        }
                        Intrinsics.checkNotNull(name);
                        jNIAchievement.failure(j11, name);
                    }
                    return Unit.f22483a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                l10 = (Long) obj;
                objB = n.b(l10);
            } catch (Throwable th2) {
                n.Companion companion2 = n.INSTANCE;
                objB = n.b(o.a(th2));
            }
            j10 = this.f9757y;
            if (n.h(objB)) {
                JNIAchievement.f9751a.success(j10, ((Long) objB) != null);
            }
            j11 = this.f9757y;
            thE = n.e(objB);
            if (thE != null) {
                JNIAchievement jNIAchievement2 = JNIAchievement.f9751a;
                message = thE.getMessage();
                if (message == null) {
                    name = thE.getClass().getName();
                } else {
                    if (StringsKt.p0(message)) {
                    }
                    if (name == null) {
                        name = thE.getClass().getName();
                    }
                }
                Intrinsics.checkNotNull(name);
                jNIAchievement2.failure(j11, name);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.universalapp.achievement.JNIAchievement$hasAchievedForNativeAsync$1", f = "JNIAchievement.kt", l = {40}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9758t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f9759u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9760v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f9761w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f9762x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ long f9763y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, long j10, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f9762x = str;
            this.f9763y = j10;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            b bVar2 = new b(this.f9762x, this.f9763y, bVar);
            bVar2.f9761w = obj;
            return bVar2;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0064  */
        /* JADX WARN: Code duplicated, block: B:27:0x006b  */
        /* JADX WARN: Code duplicated, block: B:31:0x0077  */
        /* JADX WARN: Code duplicated, block: B:33:0x007f  */
        /* JADX WARN: Code duplicated, block: B:36:0x0086  */
        /* JADX WARN: Code duplicated, block: B:38:0x0089  */
        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            long j10;
            long j11;
            Throwable thE;
            String message;
            String name;
            Achievement achievement;
            p0 p0Var = (p0) this.f9761w;
            Object objE = c.e();
            int i10 = this.f9760v;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    String str = this.f9762x;
                    n.Companion companion = n.INSTANCE;
                    sl.b bVarA = com.roblox.universalapp.achievement.b.f9774a.a();
                    if (bVarA != null) {
                        this.f9761w = l.a(p0Var);
                        this.f9758t = l.a(p0Var);
                        this.f9759u = 0;
                        this.f9760v = 1;
                        obj = bVarA.h(str, this);
                        if (obj == objE) {
                            return objE;
                        }
                    } else {
                        achievement = null;
                    }
                    objB = n.b(achievement);
                    j10 = this.f9763y;
                    if (n.h(objB)) {
                        JNIAchievement.f9751a.success(j10, ((Achievement) objB) != null);
                    }
                    j11 = this.f9763y;
                    thE = n.e(objB);
                    if (thE != null) {
                        JNIAchievement jNIAchievement = JNIAchievement.f9751a;
                        message = thE.getMessage();
                        if (message == null) {
                            name = thE.getClass().getName();
                        } else {
                            name = StringsKt.p0(message) ? null : message;
                            if (name == null) {
                                name = thE.getClass().getName();
                            }
                        }
                        Intrinsics.checkNotNull(name);
                        jNIAchievement.failure(j11, name);
                    }
                    return Unit.f22483a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                achievement = (Achievement) obj;
                objB = n.b(achievement);
            } catch (Throwable th2) {
                n.Companion companion2 = n.INSTANCE;
                objB = n.b(o.a(th2));
            }
            j10 = this.f9763y;
            if (n.h(objB)) {
                JNIAchievement.f9751a.success(j10, ((Achievement) objB) != null);
            }
            j11 = this.f9763y;
            thE = n.e(objB);
            if (thE != null) {
                JNIAchievement jNIAchievement2 = JNIAchievement.f9751a;
                message = thE.getMessage();
                if (message == null) {
                    name = thE.getClass().getName();
                } else {
                    if (StringsKt.p0(message)) {
                    }
                    if (name == null) {
                        name = thE.getClass().getName();
                    }
                }
                Intrinsics.checkNotNull(name);
                jNIAchievement2.failure(j11, name);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean failure(long handle, String error);

    @Keep
    private static final boolean grantAchievementForNativeAsync(String codeName, long handle) {
        k.d(scope, null, null, new a(codeName, handle, null), 3, null);
        return true;
    }

    @Keep
    private static final boolean hasAchievedForNativeAsync(String codeName, long handle) {
        k.d(scope, null, null, new b(codeName, handle, null), 3, null);
        return true;
    }

    private final native String init();

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean success(long handle, boolean result);

    public final boolean c() {
        Object objB;
        try {
            n.Companion companion = n.INSTANCE;
            objB = n.b(sl.k.valueOf(init()));
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        Throwable thE = n.e(objB);
        if (thE != null) {
            Log.e("rbx.achievement.jni", "failed to register with JNI: " + thE.getMessage(), thE);
            objB = n.b(sl.k.INITIALIZE_FAILED);
        }
        if (n.h(objB)) {
            Log.i("rbx.achievement.jni", "Init result: " + ((sl.k) objB));
        }
        o.b(objB);
        return objB != sl.k.INITIALIZE_FAILED;
    }
}
