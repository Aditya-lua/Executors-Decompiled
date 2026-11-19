package com.roblox.universalapp.achievement;

import android.util.Log;
import androidx.annotation.Keep;
import av.g1;
import av.k;
import av.p0;
import av.q0;
import av.z2;
import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import fu.c;
import gm.Achievement;
import gm.LocalAchievement;
import gu.f;
import gu.l;
import gu.m;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import zt.n;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/roblox/universalapp/achievement/JNIAchievement;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "init", "()Ljava/lang/String;", BuildConfig.FLAVOR, "handle", BuildConfig.FLAVOR, "result", "success", "(JZ)Z", "error", "failure", "(JLjava/lang/String;)Z", "codeName", "hasAchievedForNativeAsync", "(Ljava/lang/String;J)Z", "grantAchievementForNativeAsync", "c", "()Z", "Lav/p0;", "b", "Lav/p0;", "scope", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JNIAchievement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final JNIAchievement f9769a = new JNIAchievement();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final p0 scope = q0.a(g1.b().plus(z2.b(null, 1, null)));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.universalapp.achievement.JNIAchievement$grantAchievementForNativeAsync$1", f = "JNIAchievement.kt", l = {55}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9770t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f9771u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9772v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f9773w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f9774x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ long f9775y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, long j10, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f9774x = str;
            this.f9775y = j10;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            a aVar = new a(this.f9774x, this.f9775y, bVar);
            aVar.f9773w = obj;
            return aVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x006a  */
        /* JADX WARN: Code duplicated, block: B:27:0x0071  */
        /* JADX WARN: Code duplicated, block: B:31:0x007d  */
        /* JADX WARN: Code duplicated, block: B:33:0x0085  */
        /* JADX WARN: Code duplicated, block: B:36:0x008c  */
        /* JADX WARN: Code duplicated, block: B:38:0x008f  */
        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            long j10;
            long j11;
            Throwable thE;
            String message;
            String name;
            Long l10;
            p0 p0Var = (p0) this.f9773w;
            Object objE = c.e();
            int i10 = this.f9772v;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    String str = this.f9774x;
                    n.Companion companion = n.INSTANCE;
                    gm.b bVarA = com.roblox.universalapp.achievement.b.f9792a.a();
                    if (bVarA != null) {
                        LocalAchievement localAchievement = new LocalAchievement(str, null, 2, null);
                        this.f9773w = l.a(p0Var);
                        this.f9770t = l.a(p0Var);
                        this.f9771u = 0;
                        this.f9772v = 1;
                        obj = bVarA.e(localAchievement, this);
                        if (obj == objE) {
                            return objE;
                        }
                    } else {
                        l10 = null;
                    }
                    objB = n.b(l10);
                    j10 = this.f9775y;
                    if (n.h(objB)) {
                        JNIAchievement.f9769a.success(j10, ((Long) objB) != null);
                    }
                    j11 = this.f9775y;
                    thE = n.e(objB);
                    if (thE != null) {
                        JNIAchievement jNIAchievement = JNIAchievement.f9769a;
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
                    return Unit.f21506a;
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
            j10 = this.f9775y;
            if (n.h(objB)) {
                JNIAchievement.f9769a.success(j10, ((Long) objB) != null);
            }
            j11 = this.f9775y;
            thE = n.e(objB);
            if (thE != null) {
                JNIAchievement jNIAchievement2 = JNIAchievement.f9769a;
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
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.universalapp.achievement.JNIAchievement$hasAchievedForNativeAsync$1", f = "JNIAchievement.kt", l = {RequestError.NETWORK_FAILURE}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9776t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f9777u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9778v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f9779w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f9780x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ long f9781y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, long j10, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f9780x = str;
            this.f9781y = j10;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            b bVar2 = new b(this.f9780x, this.f9781y, bVar);
            bVar2.f9779w = obj;
            return bVar2;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0064  */
        /* JADX WARN: Code duplicated, block: B:27:0x006b  */
        /* JADX WARN: Code duplicated, block: B:31:0x0077  */
        /* JADX WARN: Code duplicated, block: B:33:0x007f  */
        /* JADX WARN: Code duplicated, block: B:36:0x0086  */
        /* JADX WARN: Code duplicated, block: B:38:0x0089  */
        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            long j10;
            long j11;
            Throwable thE;
            String message;
            String name;
            Achievement achievement;
            p0 p0Var = (p0) this.f9779w;
            Object objE = c.e();
            int i10 = this.f9778v;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    String str = this.f9780x;
                    n.Companion companion = n.INSTANCE;
                    gm.b bVarA = com.roblox.universalapp.achievement.b.f9792a.a();
                    if (bVarA != null) {
                        this.f9779w = l.a(p0Var);
                        this.f9776t = l.a(p0Var);
                        this.f9777u = 0;
                        this.f9778v = 1;
                        obj = bVarA.i(str, this);
                        if (obj == objE) {
                            return objE;
                        }
                    } else {
                        achievement = null;
                    }
                    objB = n.b(achievement);
                    j10 = this.f9781y;
                    if (n.h(objB)) {
                        JNIAchievement.f9769a.success(j10, ((Achievement) objB) != null);
                    }
                    j11 = this.f9781y;
                    thE = n.e(objB);
                    if (thE != null) {
                        JNIAchievement jNIAchievement = JNIAchievement.f9769a;
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
                    return Unit.f21506a;
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
            j10 = this.f9781y;
            if (n.h(objB)) {
                JNIAchievement.f9769a.success(j10, ((Achievement) objB) != null);
            }
            j11 = this.f9781y;
            thE = n.e(objB);
            if (thE != null) {
                JNIAchievement jNIAchievement2 = JNIAchievement.f9769a;
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
            return Unit.f21506a;
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
            objB = n.b(gm.k.valueOf(init()));
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        Throwable thE = n.e(objB);
        if (thE != null) {
            Log.e("rbx.achievement.jni", "failed to register with JNI: " + thE.getMessage(), thE);
            objB = n.b(gm.k.INITIALIZE_FAILED);
        }
        if (n.h(objB)) {
            Log.i("rbx.achievement.jni", "Init result: " + ((gm.k) objB));
        }
        o.b(objB);
        return objB != gm.k.INITIALIZE_FAILED;
    }
}
