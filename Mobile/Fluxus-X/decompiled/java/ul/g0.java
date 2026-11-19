package ul;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import av.d2;
import av.p0;
import bh.r0;
import com.github.luben.zstd.BuildConfig;
import com.roblox.protocols.calling.CallingHandler;
import e.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lul/g0;", "Lj/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", BuildConfig.FLAVOR, "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "K1", "Lul/a;", "call", "J1", "(Lul/a;)V", BuildConfig.FLAVOR, "E", "Ljava/lang/String;", "callId", "Lav/d2;", "F", "Lav/d2;", "following", "Lrh/a;", "G", "Lrh/a;", "binding", "H", "a", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g0 extends j.b {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public String callId;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public d2 following;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public rh.a binding;

    /* JADX INFO: renamed from: ul.g0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lul/g0$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "callId", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent a(@NotNull Context context, @NotNull String callId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callId, "callId");
            Intent intentAddFlags = new Intent(context, (Class<?>) g0.class).putExtra("com.roblox.protocols.calling.CALL_ID", callId).addFlags(268435456);
            Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
            return intentAddFlags;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.protocols.calling.CallingRingActivity$show$1", f = "CallingRingActivity.kt", l = {69}, m = "invokeSuspend", v = 1)
    public static final class b extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33531t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f33532u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ g0 f33533v;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lul/a;", "it", BuildConfig.FLAVOR, "<anonymous>", "(Lul/a;)Z"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.roblox.protocols.calling.CallingRingActivity$show$1$1", f = "CallingRingActivity.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends gu.m implements Function2<ActiveCall, eu.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f33534t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f33535u;

            public a(eu.b<? super a> bVar) {
                super(2, bVar);
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                a aVar = new a(bVar);
                aVar.f33535u = obj;
                return aVar;
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                ActiveCall activeCall = (ActiveCall) this.f33535u;
                fu.c.e();
                if (this.f33534t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return gu.b.a(activeCall.k());
            }

            @Override // p001kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ActiveCall activeCall, eu.b<? super Boolean> bVar) {
                return ((a) create(activeCall, bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        /* JADX INFO: renamed from: ul.g0$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0682b implements dv.i, p001kotlin.jvm.internal.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g0 f33536a;

            public C0682b(g0 g0Var) {
                this.f33536a = g0Var;
            }

            @Override // p001kotlin.jvm.internal.h
            public final zt.b<?> b() {
                return new p001kotlin.jvm.internal.a(2, this.f33536a, g0.class, "render", "render(Lcom/roblox/protocols/calling/ActiveCall;)V", 4);
            }

            @Override // dv.i
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object emit(ActiveCall activeCall, eu.b<? super Unit> bVar) {
                Object objP = b.p(this.f33536a, activeCall, bVar);
                return objP == fu.c.e() ? objP : Unit.f21506a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof dv.i) && (obj instanceof p001kotlin.jvm.internal.h)) {
                    return Intrinsics.c(b(), ((p001kotlin.jvm.internal.h) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, g0 g0Var, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f33532u = str;
            this.f33533v = g0Var;
        }

        public static final /* synthetic */ Object p(g0 g0Var, ActiveCall activeCall, eu.b bVar) {
            g0Var.J1(activeCall);
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new b(this.f33532u, this.f33533v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33531t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.h hVarO = dv.j.O(d.f33495a.g(this.f33532u), new a(null));
                C0682b c0682b = new C0682b(this.f33533v);
                this.f33531t = 1;
                if (hVarO.collect(c0682b, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            this.f33533v.finish();
            return Unit.f21506a;
        }
    }

    public static final void H1(g0 g0Var, View view) {
        String str = g0Var.callId;
        if (str != null) {
            CallingHandler.INSTANCE.answerCall$NativeShell_googleProdRelease(str);
        }
        g0Var.finish();
    }

    public static final void I1(g0 g0Var, View view) {
        String str = g0Var.callId;
        if (str != null) {
            CallingHandler.INSTANCE.declineCall$NativeShell_googleProdRelease(str);
        }
        g0Var.finish();
    }

    public final void J1(ActiveCall call) {
        rh.a aVar = this.binding;
        rh.a aVar2 = null;
        if (aVar == null) {
            Intrinsics.u("binding");
            aVar = null;
        }
        aVar.f30714g.setText(ul.b.a(this, call.getCallerName()));
        rh.a aVar3 = this.binding;
        if (aVar3 == null) {
            Intrinsics.u("binding");
        } else {
            aVar2 = aVar3;
        }
        aVar2.f30711d.setImageBitmap(call.getCallerAvatar());
    }

    public final void K1(Intent intent) {
        String stringExtra = intent.getStringExtra("com.roblox.protocols.calling.CALL_ID");
        this.callId = stringExtra;
        d2 d2Var = this.following;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        if (stringExtra == null) {
            finish();
        } else {
            this.following = av.k.d(androidx.p000lifecycle.t.a(this), null, null, new b(stringExtra, this, null), 3, null);
        }
    }

    @Override // f4.v, e.p, k2.g, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(r0.f4300a);
        super.onCreate(savedInstanceState);
        u0.Companion companion = u0.INSTANCE;
        e.x.b(this, u0.Companion.d(companion, 0, 0, null, 4, null), u0.Companion.d(companion, 0, 0, null, 4, null));
        if (Build.VERSION.SDK_INT >= 27) {
            setShowWhenLocked(true);
            setTurnScreenOn(true);
        } else {
            getWindow().addFlags(2621440);
        }
        rh.a aVarC = rh.a.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(aVarC, "inflate(...)");
        this.binding = aVarC;
        rh.a aVar = null;
        if (aVarC == null) {
            Intrinsics.u("binding");
            aVarC = null;
        }
        setContentView(aVarC.getRoot());
        rh.a aVar2 = this.binding;
        if (aVar2 == null) {
            Intrinsics.u("binding");
            aVar2 = null;
        }
        aVar2.f30711d.setClipToOutline(true);
        rh.a aVar3 = this.binding;
        if (aVar3 == null) {
            Intrinsics.u("binding");
            aVar3 = null;
        }
        aVar3.b.setOnClickListener(new View.OnClickListener() { // from class: ul.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g0.H1(this.f33529a, view);
            }
        });
        rh.a aVar4 = this.binding;
        if (aVar4 == null) {
            Intrinsics.u("binding");
        } else {
            aVar = aVar4;
        }
        aVar.f30710c.setOnClickListener(new View.OnClickListener() { // from class: ul.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g0.I1(this.f33530a, view);
            }
        });
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        K1(intent);
    }

    @Override // e.p, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        K1(intent);
    }
}
