package com.withpersona.sdk2.inquiry.integration;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.p000lifecycle.h0;
import androidx.p000lifecycle.s;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.n;
import ku.p;
import ku.p0;
import nu.i;
import nu.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.f;
import pt.l;
import pt.m;
import vr.h;
import xo.BrowserSelection;
import ym.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0018#BI\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\t\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/a;", "Lvr/h;", "Lcom/withpersona/sdk2/inquiry/integration/a$b;", "Lym/o;", "Landroid/content/Context;", "applicationContext", "Lg/c;", "Lmp/b;", "customTabsLauncher", "", "url", "redirectPath", "Lxo/a;", "browserSelection", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "integrationStepBrowserType", "<init>", "(Landroid/content/Context;Lg/c;Ljava/lang/String;Ljava/lang/String;Lxo/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;)V", "Lnu/h;", "run", "()Lnu/h;", "", "k", "(Lnt/b;)Ljava/lang/Object;", "b", "Landroid/content/Context;", "c", "Lg/c;", "d", "Ljava/lang/String;", "e", "f", "Lxo/a;", "g", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "a", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements h<b>, o<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g.c<mp.b> customTabsLauncher;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String redirectPath;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BrowserSelection browserSelection;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/a$a;", "", "", "url", "redirectPath", "Lxo/a;", "browserSelection", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "integrationStepBrowserType", "Lcom/withpersona/sdk2/inquiry/integration/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Lxo/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;)Lcom/withpersona/sdk2/inquiry/integration/a;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC0204a {
        @NotNull
        a a(@NotNull String url, @NotNull String redirectPath, @NotNull BrowserSelection browserSelection, @NotNull NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/a$b;", "", "a", "Lcom/withpersona/sdk2/inquiry/integration/a$b$a;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/a$b$a;", "Lcom/withpersona/sdk2/inquiry/integration/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0205a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0205a f11136a = new C0205a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0205a);
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/integration/a$b;", "", "<anonymous>", "(Lnu/i;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker$run$1", f = "IntegrationBrowserWorker.kt", l = {61, 68, 71, 90, 92}, m = "invokeSuspend")
    public static final class c extends m implements Function2<i<? super b>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11137t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f11138u;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker$run$1$1", f = "IntegrationBrowserWorker.kt", l = {66}, m = "invokeSuspend")
        public static final class C0206a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f11140t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f11141u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ a f11142v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0206a(a aVar, nt.b<? super C0206a> bVar) {
                super(2, bVar);
                this.f11142v = aVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new C0206a(this.f11142v, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f11141u;
                if (i10 == 0) {
                    jt.o.b(obj);
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f11142v.url));
                    intent.addFlags(268435456);
                    this.f11142v.applicationContext.startActivity(intent);
                    a aVar = this.f11142v;
                    this.f11140t = l.a(intent);
                    this.f11141u = 1;
                    if (aVar.k(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                }
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((C0206a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker$run$1$2", f = "IntegrationBrowserWorker.kt", l = {}, m = "invokeSuspend")
        public static final class b extends m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f11143t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a f11144u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, nt.b<? super b> bVar) {
                super(2, bVar);
                this.f11144u = aVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new b(this.f11144u, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                mp.b cVar;
                ot.c.e();
                if (this.f11143t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                g.c cVar2 = this.f11144u.customTabsLauncher;
                if (this.f11144u.browserSelection.getSupportsAuthTab()) {
                    v.b bVarA = new v.b.C0592b().a();
                    Intrinsics.checkNotNullExpressionValue(bVarA, "build(...)");
                    cVar = new mp.a(bVarA, this.f11144u.url, xo.e.f35267a.a(this.f11144u.url), this.f11144u.redirectPath, this.f11144u.browserSelection.getPackageName());
                } else {
                    w.d dVarA = new w.d.e().a();
                    Intrinsics.checkNotNullExpressionValue(dVarA, "build(...)");
                    cVar = new mp.c(dVarA, this.f11144u.url, this.f11144u.browserSelection.getPackageName());
                }
                cVar2.b(cVar);
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.a$c$c, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0207c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f11145a;

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
                f11145a = iArr;
            }
        }

        public c(nt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            c cVar = a.this.new c(bVar);
            cVar.f11138u = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L34;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f11138u
                nu.i r0 = (nu.i) r0
                java.lang.Object r1 = ot.c.e()
                int r2 = r9.f11137t
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 0
                r8 = 1
                if (r2 == 0) goto L35
                if (r2 == r8) goto L31
                if (r2 == r6) goto L1c
                if (r2 == r5) goto L2d
                if (r2 == r4) goto L29
                if (r2 != r3) goto L21
            L1c:
                jt.o.b(r10)
                goto Lb2
            L21:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L29:
                jt.o.b(r10)
                goto L74
            L2d:
                jt.o.b(r10)
                goto L60
            L31:
                jt.o.b(r10)
                goto La1
            L35:
                jt.o.b(r10)
                com.withpersona.sdk2.inquiry.integration.a r10 = com.withpersona.sdk2.inquiry.integration.a.this
                com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$IntegrationStepBrowserType r10 = com.withpersona.sdk2.inquiry.integration.a.g(r10)
                int[] r2 = com.withpersona.sdk2.inquiry.integration.a.c.C0207c.f11145a
                int r10 = r10.ordinal()
                r10 = r2[r10]
                if (r10 == r8) goto L8b
                if (r10 != r6) goto L85
                ku.n2 r10 = ku.g1.c()
                com.withpersona.sdk2.inquiry.integration.a$c$b r2 = new com.withpersona.sdk2.inquiry.integration.a$c$b
                com.withpersona.sdk2.inquiry.integration.a r6 = com.withpersona.sdk2.inquiry.integration.a.this
                r2.<init>(r6, r7)
                r9.f11138u = r0
                r9.f11137t = r5
                java.lang.Object r10 = ku.i.g(r10, r2, r9)
                if (r10 != r1) goto L60
                goto Lb1
            L60:
                mp.h r10 = new mp.h
                r10.<init>()
                nu.h r10 = nu.j.M(r10, r8)
                r9.f11138u = r0
                r9.f11137t = r4
                java.lang.Object r10 = nu.j.R(r10, r7, r9, r8, r7)
                if (r10 != r1) goto L74
                goto Lb1
            L74:
                com.withpersona.sdk2.inquiry.integration.a$b$a r10 = com.withpersona.sdk2.inquiry.integration.a.b.C0205a.f11136a
                java.lang.Object r2 = pt.l.a(r0)
                r9.f11138u = r2
                r9.f11137t = r3
                java.lang.Object r10 = r0.emit(r10, r9)
                if (r10 != r1) goto Lb2
                goto Lb1
            L85:
                jt.l r10 = new jt.l
                r10.<init>()
                throw r10
            L8b:
                ku.n2 r10 = ku.g1.c()
                com.withpersona.sdk2.inquiry.integration.a$c$a r2 = new com.withpersona.sdk2.inquiry.integration.a$c$a
                com.withpersona.sdk2.inquiry.integration.a r3 = com.withpersona.sdk2.inquiry.integration.a.this
                r2.<init>(r3, r7)
                r9.f11138u = r0
                r9.f11137t = r8
                java.lang.Object r10 = ku.i.g(r10, r2, r9)
                if (r10 != r1) goto La1
                goto Lb1
            La1:
                com.withpersona.sdk2.inquiry.integration.a$b$a r10 = com.withpersona.sdk2.inquiry.integration.a.b.C0205a.f11136a
                java.lang.Object r2 = pt.l.a(r0)
                r9.f11138u = r2
                r9.f11137t = r6
                java.lang.Object r10 = r0.emit(r10, r9)
                if (r10 != r1) goto Lb2
            Lb1:
                return r1
            Lb2:
                kotlin.Unit r10 = kotlin.Unit.f22483a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.integration.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super b> iVar, nt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f11146a;

        public d(e eVar) {
            this.f11146a = eVar;
        }

        public final void a(Throwable th2) {
            h0.INSTANCE.a().a().d(this.f11146a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22483a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"com/withpersona/sdk2/inquiry/integration/a$e", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onPause", "(Landroidx/lifecycle/s;)V", "onResume", "", "a", "Z", "hasLeftApp", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements androidx.p000lifecycle.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public boolean hasLeftApp;
        public final /* synthetic */ n<Unit> b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(n<? super Unit> nVar) {
            this.b = nVar;
        }

        @Override // androidx.p000lifecycle.f
        public void onCreate(s sVar) {
            super.onCreate(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onDestroy(s sVar) {
            super.onDestroy(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onPause(s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.hasLeftApp = true;
        }

        @Override // androidx.p000lifecycle.f
        public void onResume(s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (this.hasLeftApp) {
                h0.INSTANCE.a().a().d(this);
                if (this.b.b()) {
                    n<Unit> nVar = this.b;
                    jt.n.Companion companion = jt.n.INSTANCE;
                    nVar.resumeWith(jt.n.b(Unit.f22483a));
                }
            }
        }

        @Override // androidx.p000lifecycle.f
        public void onStart(s sVar) {
            super.onStart(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onStop(s sVar) {
            super.onStop(sVar);
        }
    }

    public a(@NotNull Context applicationContext, @NotNull g.c<mp.b> customTabsLauncher, @NotNull String url, @NotNull String redirectPath, @NotNull BrowserSelection browserSelection, @NotNull NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType) {
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

    @Override // vr.h
    public boolean a(@NotNull h<?> hVar) {
        return super.a(hVar);
    }

    @Override // ym.o
    public boolean b(@NotNull o<?> oVar) {
        return o.b.a(this, oVar);
    }

    @Override // vr.h
    public boolean c(@NotNull h<?> hVar) {
        return super.c(hVar);
    }

    public final Object k(nt.b<? super Unit> bVar) {
        p pVar = new p(ot.b.c(bVar), 1);
        pVar.H();
        e eVar = new e(pVar);
        h0.INSTANCE.a().a().a(eVar);
        pVar.n(new d(eVar));
        Object objA = pVar.A();
        if (objA == ot.c.e()) {
            pt.h.c(bVar);
        }
        return objA == ot.c.e() ? objA : Unit.f22483a;
    }

    @Override // vr.h
    @NotNull
    public nu.h<b> run() {
        return j.w(new c(null));
    }
}
