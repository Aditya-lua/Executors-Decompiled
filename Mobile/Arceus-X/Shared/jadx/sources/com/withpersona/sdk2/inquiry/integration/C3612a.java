package com.withpersona.sdk2.inquiry.integration;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.p616lifecycle.C0959h0;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mp.C8609a;
import mp.C8613c;
import mp.C8623h;
import mp.InterfaceC8611b;
import nu.C9579j;
import nu.C9587n;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139g.AbstractC5854c;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.AbstractC7900n2;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.C7905p;
import p256ku.InterfaceC7897n;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import p479v.C11984b;
import p499vr.InterfaceC12257h;
import p502w.C12268d;
import p554xo.BrowserSelection;
import p554xo.C12873e;
import p581ym.InterfaceC13222o;
import pt.AbstractC10351m;
import pt.C10346h;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0018#BI\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\t\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/a;", "Lvr/h;", "Lcom/withpersona/sdk2/inquiry/integration/a$b;", "Lym/o;", "Landroid/content/Context;", "applicationContext", "Lg/c;", "Lmp/b;", "customTabsLauncher", "", "url", "redirectPath", "Lxo/a;", "browserSelection", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "integrationStepBrowserType", "<init>", "(Landroid/content/Context;Lg/c;Ljava/lang/String;Ljava/lang/String;Lxo/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;)V", "Lnu/h;", "run", "()Lnu/h;", "", "k", "(Lnt/b;)Ljava/lang/Object;", "b", "Landroid/content/Context;", "c", "Lg/c;", "d", "Ljava/lang/String;", "e", "f", "Lxo/a;", "g", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "a", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3612a implements InterfaceC12257h<b>, InterfaceC13222o<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AbstractC5854c<InterfaceC8611b> customTabsLauncher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String redirectPath;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final BrowserSelection browserSelection;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.a$a */
    @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/a$a;", "", "", "url", "redirectPath", "Lxo/a;", "browserSelection", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "integrationStepBrowserType", "Lcom/withpersona/sdk2/inquiry/integration/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Lxo/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;)Lcom/withpersona/sdk2/inquiry/integration/a;", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C3612a mo18005a(@NotNull String url, @NotNull String redirectPath, @NotNull BrowserSelection browserSelection, @NotNull NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType);
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.a$b */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/a$b;", "", "a", "Lcom/withpersona/sdk2/inquiry/integration/a$b$a;", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.a$b$a */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/a$b$a;", "Lcom/withpersona/sdk2/inquiry/integration/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f14355a = new a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 456691500;
            }

            @NotNull
            public String toString() {
                return "Complete";
            }
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.a$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/integration/a$b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker$run$1", m39664f = "IntegrationBrowserWorker.kt", m39665l = {61, 68, 71, 90, 92}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC9577i<? super b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f14356t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f14357u;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.a$c$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker$run$1$1", m39664f = "IntegrationBrowserWorker.kt", m39665l = {66}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public Object f14359t;

            /* JADX INFO: renamed from: u */
            public int f14360u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ C3612a f14361v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3612a c3612a, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f14361v = c3612a;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f14361v, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f14360u;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f14361v.url));
                    intent.addFlags(268435456);
                    this.f14361v.applicationContext.startActivity(intent);
                    C3612a c3612a = this.f14361v;
                    this.f14359t = C10350l.m39676a(intent);
                    this.f14360u = 1;
                    if (c3612a.m18004k(this) == objM38805e) {
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

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.a$c$b */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker$run$1$2", m39664f = "IntegrationBrowserWorker.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f14362t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C3612a f14363u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C3612a c3612a, InterfaceC9557b<? super b> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f14363u = c3612a;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new b(this.f14363u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                InterfaceC8611b c8613c;
                C10047c.m38805e();
                if (this.f14362t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                AbstractC5854c abstractC5854c = this.f14363u.customTabsLauncher;
                if (this.f14363u.browserSelection.getSupportsAuthTab()) {
                    C11984b c11984bM44736a = new C11984b.b().m44736a();
                    Intrinsics.checkNotNullExpressionValue(c11984bM44736a, "build(...)");
                    c8613c = new C8609a(c11984bM44736a, this.f14363u.url, C12873e.f45728a.m47905a(this.f14363u.url), this.f14363u.redirectPath, this.f14363u.browserSelection.getPackageName());
                } else {
                    C12268d c12268dM45532a = new C12268d.e().m45532a();
                    Intrinsics.checkNotNullExpressionValue(c12268dM45532a, "build(...)");
                    c8613c = new C8613c(c12268dM45532a, this.f14363u.url, this.f14363u.browserSelection.getPackageName());
                }
                abstractC5854c.m26240b(c8613c);
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.a$c$c, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class C14130c {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f14364a;

            static {
                int[] iArr = new int[NextStep.Integration.IntegrationStepBrowserType.values().length];
                try {
                    iArr[NextStep.Integration.IntegrationStepBrowserType.External.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[NextStep.Integration.IntegrationStepBrowserType.AuthSession.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f14364a = iArr;
            }
        }

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            c cVar = C3612a.this.new c(interfaceC9557b);
            cVar.f14357u = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L34;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC9575h interfaceC9575hM37776M;
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f14357u;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f14356t;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            C7348o.m30470b(obj);
                            interfaceC9575hM37776M = C9579j.m37776M(new C8623h(), 1);
                            this.f14357u = interfaceC9577i;
                            this.f14356t = 4;
                            if (C9587n.m37833c(interfaceC9575hM37776M, null, this, 1, null) != objM38805e) {
                            }
                            return objM38805e;
                        }
                        if (i10 == 4) {
                            C7348o.m30470b(obj);
                        } else if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b.a aVar = b.a.f14355a;
                        this.f14357u = C10350l.m39676a(interfaceC9577i);
                        this.f14356t = 5;
                    }
                    C7348o.m30470b(obj);
                } else {
                    C7348o.m30470b(obj);
                    b.a aVar2 = b.a.f14355a;
                    this.f14357u = C10350l.m39676a(interfaceC9577i);
                    this.f14356t = 2;
                }
                return Unit.f29331a;
            }
            C7348o.m30470b(obj);
            int i11 = C14130c.f14364a[C3612a.this.integrationStepBrowserType.ordinal()];
            if (i11 == 1) {
                AbstractC7900n2 abstractC7900n2M32645c = C7864g1.m32645c();
                a aVar3 = new a(C3612a.this, null);
                this.f14357u = interfaceC9577i;
                this.f14356t = 1;
                if (C7872i.m32684g(abstractC7900n2M32645c, aVar3, this) != objM38805e) {
                    b.a aVar4 = b.a.f14355a;
                    this.f14357u = C10350l.m39676a(interfaceC9577i);
                    this.f14356t = 2;
                }
            } else {
                if (i11 != 2) {
                    throw new C7345l();
                }
                AbstractC7900n2 abstractC7900n2M32645c2 = C7864g1.m32645c();
                b bVar = new b(C3612a.this, null);
                this.f14357u = interfaceC9577i;
                this.f14356t = 3;
                if (C7872i.m32684g(abstractC7900n2M32645c2, bVar, this) != objM38805e) {
                    interfaceC9575hM37776M = C9579j.m37776M(new C8623h(), 1);
                    this.f14357u = interfaceC9577i;
                    this.f14356t = 4;
                    if (C9587n.m37833c(interfaceC9575hM37776M, null, this, 1, null) != objM38805e) {
                        b.a aVar5 = b.a.f14355a;
                        this.f14357u = C10350l.m39676a(interfaceC9577i);
                        this.f14356t = 5;
                    }
                }
            }
            return objM38805e;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super b> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.a$d */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e f14365a;

        public d(e eVar) {
            this.f14365a = eVar;
        }

        /* JADX INFO: renamed from: a */
        public final void m18007a(Throwable th2) {
            C0959h0.INSTANCE.m4917a().mo4656a().mo4938d(this.f14365a);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m18007a(th2);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.a$e */
    @Metadata(m31664d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, m31665d2 = {"com/withpersona/sdk2/inquiry/integration/a$e", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onPause", "(Landroidx/lifecycle/s;)V", "onResume", "", "a", "Z", "hasLeftApp", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class e implements InterfaceC0954f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean hasLeftApp;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC7897n<Unit> f14367b;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ku.n<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public e(InterfaceC7897n<? super Unit> interfaceC7897n) {
            this.f14367b = interfaceC7897n;
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onCreate(InterfaceC0980s interfaceC0980s) {
            super.onCreate(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onDestroy(InterfaceC0980s interfaceC0980s) {
            super.onDestroy(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onPause(InterfaceC0980s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.hasLeftApp = true;
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onResume(InterfaceC0980s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (this.hasLeftApp) {
                C0959h0.INSTANCE.m4917a().mo4656a().mo4938d(this);
                if (this.f14367b.mo32811b()) {
                    InterfaceC7897n<Unit> interfaceC7897n = this.f14367b;
                    C7347n.Companion companion = C7347n.INSTANCE;
                    interfaceC7897n.resumeWith(C7347n.m30460b(Unit.f29331a));
                }
            }
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onStart(InterfaceC0980s interfaceC0980s) {
            super.onStart(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onStop(InterfaceC0980s interfaceC0980s) {
            super.onStop(interfaceC0980s);
        }
    }

    public C3612a(@NotNull Context applicationContext, @NotNull AbstractC5854c<InterfaceC8611b> customTabsLauncher, @NotNull String url, @NotNull String redirectPath, @NotNull BrowserSelection browserSelection, @NotNull NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(customTabsLauncher, "customTabsLauncher");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(redirectPath, "redirectPath");
        Intrinsics.checkNotNullParameter(browserSelection, "browserSelection");
        Intrinsics.checkNotNullParameter(integrationStepBrowserType, "integrationStepBrowserType");
        this.applicationContext = applicationContext;
        this.customTabsLauncher = customTabsLauncher;
        this.url = url;
        this.redirectPath = redirectPath;
        this.browserSelection = browserSelection;
        this.integrationStepBrowserType = integrationStepBrowserType;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p581ym.InterfaceC13222o
    /* JADX INFO: renamed from: b */
    public boolean mo7573b(@NotNull InterfaceC13222o<?> interfaceC13222o) {
        return InterfaceC13222o.b.m48893a(this, interfaceC13222o);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7574c(interfaceC12257h);
    }

    /* JADX INFO: renamed from: k */
    public final Object m18004k(InterfaceC9557b<? super Unit> interfaceC9557b) {
        C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
        c7905p.m32860H();
        e eVar = new e(c7905p);
        C0959h0.INSTANCE.m4917a().mo4656a().mo4935a(eVar);
        c7905p.mo32815n(new d(eVar));
        Object objM32857A = c7905p.m32857A();
        if (objM32857A == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32857A == C10047c.m38805e() ? objM32857A : Unit.f29331a;
    }

    @Override // p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<b> run() {
        return C9579j.m37806w(new c(null));
    }
}
