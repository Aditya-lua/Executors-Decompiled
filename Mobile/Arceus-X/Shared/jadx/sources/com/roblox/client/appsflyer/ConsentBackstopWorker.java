package com.roblox.client.appsflyer;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.AbstractC1117c;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p536x5.AbstractC12719p0;
import p536x5.C12738z;
import p536x5.EnumC12706j;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m31665d2 = {"Lcom/roblox/client/appsflyer/ConsentBackstopWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lnt/b;)Ljava/lang/Object;", "a", "RobloxApp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class ConsentBackstopWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.roblox.client.appsflyer.ConsentBackstopWorker$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lcom/roblox/client/appsflyer/ConsentBackstopWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "delayMs", "", "b", "(Landroid/content/Context;J)V", "a", "(Landroid/content/Context;)V", "", "WORK_NAME", "Ljava/lang/String;", "RobloxApp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.roblox.client.appsflyer.ConsentBackstopWorker.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m14872a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AbstractC12719p0.Companion companion = AbstractC12719p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.m47401a(applicationContext).mo47395b("delayedAppsFlyerConsentBackstop");
        }

        /* JADX INFO: renamed from: b */
        public final void m14873b(@NotNull Context context, long delayMs) {
            Intrinsics.checkNotNullParameter(context, "context");
            AbstractC12719p0.Companion companion = AbstractC12719p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.m47401a(applicationContext).m47400g("delayedAppsFlyerConsentBackstop", EnumC12706j.KEEP, new C12738z.a(ConsentBackstopWorker.class).m47419n(delayMs, TimeUnit.MILLISECONDS).m47409b());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.appsflyer.ConsentBackstopWorker$b */
    @InterfaceC10344f(m39663c = "com.roblox.client.appsflyer.ConsentBackstopWorker", m39664f = "ConsentBackstopWorker.kt", m39665l = {19}, m39666m = "doWork", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3157b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f11661t;

        /* JADX INFO: renamed from: v */
        public int f11663v;

        public C3157b(InterfaceC9557b<? super C3157b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11661t = obj;
            this.f11663v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return ConsentBackstopWorker.this.doWork(this);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.appsflyer.ConsentBackstopWorker$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.appsflyer.ConsentBackstopWorker$doWork$2", m39664f = "ConsentBackstopWorker.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3158c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f11664t;

        public C3158c(InterfaceC9557b<? super C3158c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3158c(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f11664t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C3159a.m14879I().m14908E();
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3158c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentBackstopWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull InterfaceC9557b<? super AbstractC1117c.a> interfaceC9557b) {
        C3157b c3157b;
        if (interfaceC9557b instanceof C3157b) {
            c3157b = (C3157b) interfaceC9557b;
            int i10 = c3157b.f11663v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c3157b.f11663v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c3157b = new C3157b(interfaceC9557b);
            }
        } else {
            c3157b = new C3157b(interfaceC9557b);
        }
        Object obj = c3157b.f11661t;
        Object objM38805e = C10047c.m38805e();
        int i11 = c3157b.f11663v;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            AbstractC7888l0 abstractC7888l0M32644b = C7864g1.m32644b();
            C3158c c3158c = new C3158c(null);
            c3157b.f11663v = 1;
            if (C7872i.m32684g(abstractC7888l0M32644b, c3158c, c3157b) == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
        }
        AbstractC1117c.a aVarM6342d = AbstractC1117c.a.m6342d();
        Intrinsics.checkNotNullExpressionValue(aVarM6342d, "success(...)");
        return aVarM6342d;
    }
}
