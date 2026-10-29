package com.withpersona.sdk2.inquiry.ui.network;

import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.network.Suggestion;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.i;
import nu.j;
import org.jetbrains.annotations.NotNull;
import pt.f;
import pt.m;
import vr.h;
import ym.o;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0012\u001bB)\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00112\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "Lvr/h;", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "triggeringComponent", "addressText", "Lqr/c;", "uiService", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;Lqr/c;)V", "Lnu/h;", "run", "()Lnu/h;", "otherWorker", "", "b", "(Lym/o;)Z", "c", "(Lvr/h;)Z", "Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "d", "e", "Lqr/c;", "a", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements o<AbstractC0257b>, h<AbstractC0257b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UiComponent triggeringComponent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String addressText;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qr.c uiService;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "", "Lqr/c;", "uiService", "<init>", "(Lqr/c;)V", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "triggeringComponent", "addressText", "Lcom/withpersona/sdk2/inquiry/ui/network/b;", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/b;", "Lqr/c;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final qr.c uiService;

        public a(@NotNull qr.c uiService) {
            Intrinsics.checkNotNullParameter(uiService, "uiService");
            this.uiService = uiService;
        }

        @NotNull
        public final b a(@NotNull String sessionToken, @NotNull UiComponent triggeringComponent, @NotNull String addressText) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(triggeringComponent, "triggeringComponent");
            Intrinsics.checkNotNullParameter(addressText, "addressText");
            return new b(sessionToken, triggeringComponent, addressText, this.uiService, null);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.b$b, reason: collision with other inner class name */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b$b;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class AbstractC0257b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.b$b$a */
        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends AbstractC0257b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.b$b$b, reason: collision with other inner class name */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b$b$b;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;", "results", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0258b extends AbstractC0257b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final List<Suggestion> results;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0258b(@NotNull List<Suggestion> results) {
                super(null);
                Intrinsics.checkNotNullParameter(results, "results");
                this.results = results;
            }

            @NotNull
            public final List<Suggestion> a() {
                return this.results;
            }
        }

        public /* synthetic */ AbstractC0257b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public AbstractC0257b() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "", "<anonymous>", "(Lnu/i;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.ui.network.UiAddressAutocompleteWorker$run$1", f = "UiAddressAutocompleteWorker.kt", l = {20, 29, 31}, m = "invokeSuspend")
    public static final class c extends m implements Function2<i<? super AbstractC0257b>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f13999t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f14000u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f14001v;

        public c(nt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            c cVar = b.this.new c(bVar);
            cVar.f14001v = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
        
            if (r0.emit(r2, r9) == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
        
            if (r0.emit(r2, r9) == r1) goto L29;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f14001v
                nu.i r0 = (nu.i) r0
                java.lang.Object r1 = ot.c.e()
                int r2 = r9.f14000u
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L2b
                if (r2 == r5) goto L27
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                goto L1e
            L16:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1e:
                java.lang.Object r0 = r9.f13999t
                jv.x r0 = (jv.x) r0
                jt.o.b(r10)
                goto Laf
            L27:
                jt.o.b(r10)
                goto L57
            L2b:
                jt.o.b(r10)
                com.withpersona.sdk2.inquiry.ui.network.b r10 = com.withpersona.sdk2.inquiry.ui.network.b.this
                qr.c r10 = com.withpersona.sdk2.inquiry.ui.network.b.g(r10)
                com.withpersona.sdk2.inquiry.ui.network.b r2 = com.withpersona.sdk2.inquiry.ui.network.b.this
                java.lang.String r2 = com.withpersona.sdk2.inquiry.ui.network.b.e(r2)
                com.withpersona.sdk2.inquiry.ui.network.AddressAutocompleteRequest$a r6 = com.withpersona.sdk2.inquiry.ui.network.AddressAutocompleteRequest.INSTANCE
                com.withpersona.sdk2.inquiry.ui.network.b r7 = com.withpersona.sdk2.inquiry.ui.network.b.this
                com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent r7 = com.withpersona.sdk2.inquiry.ui.network.b.f(r7)
                com.withpersona.sdk2.inquiry.ui.network.b r8 = com.withpersona.sdk2.inquiry.ui.network.b.this
                java.lang.String r8 = com.withpersona.sdk2.inquiry.ui.network.b.d(r8)
                com.withpersona.sdk2.inquiry.ui.network.AddressAutocompleteRequest r6 = r6.a(r7, r8)
                r9.f14001v = r0
                r9.f14000u = r5
                java.lang.Object r10 = r10.d(r2, r6, r9)
                if (r10 != r1) goto L57
                goto Lae
            L57:
                jv.x r10 = (jv.x) r10
                boolean r2 = r10.g()
                if (r2 != 0) goto L7d
                com.withpersona.sdk2.inquiry.ui.network.b$b$a r2 = new com.withpersona.sdk2.inquiry.ui.network.b$b$a
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r3 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.toErrorInfo(r10)
                r2.<init>(r3)
                java.lang.Object r3 = pt.l.a(r0)
                r9.f14001v = r3
                java.lang.Object r10 = pt.l.a(r10)
                r9.f13999t = r10
                r9.f14000u = r4
                java.lang.Object r10 = r0.emit(r2, r9)
                if (r10 != r1) goto Laf
                goto Lae
            L7d:
                com.withpersona.sdk2.inquiry.ui.network.b$b$b r2 = new com.withpersona.sdk2.inquiry.ui.network.b$b$b
                java.lang.Object r4 = r10.a()
                com.withpersona.sdk2.inquiry.steps.ui.network.AddressAutocompleteResponse r4 = (com.withpersona.sdk2.inquiry.steps.ui.network.AddressAutocompleteResponse) r4
                if (r4 == 0) goto L93
                com.withpersona.sdk2.inquiry.steps.ui.network.Meta r4 = r4.getMeta()
                if (r4 == 0) goto L93
                java.util.List r4 = r4.a()
                if (r4 != 0) goto L97
            L93:
                java.util.List r4 = kotlin.collections.p.k()
            L97:
                r2.<init>(r4)
                java.lang.Object r4 = pt.l.a(r0)
                r9.f14001v = r4
                java.lang.Object r10 = pt.l.a(r10)
                r9.f13999t = r10
                r9.f14000u = r3
                java.lang.Object r10 = r0.emit(r2, r9)
                if (r10 != r1) goto Laf
            Lae:
                return r1
            Laf:
                kotlin.Unit r10 = kotlin.Unit.f22483a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.ui.network.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super AbstractC0257b> iVar, nt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public /* synthetic */ b(String str, UiComponent uiComponent, String str2, qr.c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uiComponent, str2, cVar);
    }

    @Override // vr.h
    public boolean a(@NotNull h<?> hVar) {
        return super.a(hVar);
    }

    @Override // ym.o
    public boolean b(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof b) && Intrinsics.c(this.addressText, ((b) otherWorker).addressText);
    }

    @Override // vr.h
    public boolean c(@NotNull h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof b) && Intrinsics.c(this.addressText, ((b) otherWorker).addressText);
    }

    @Override // ym.o, vr.h
    @NotNull
    public nu.h<AbstractC0257b> run() {
        return j.w(new c(null));
    }

    public b(String str, UiComponent uiComponent, String str2, qr.c cVar) {
        this.sessionToken = str;
        this.triggeringComponent = uiComponent;
        this.addressText = str2;
        this.uiService = cVar;
    }
}
