package com.withpersona.sdk2.inquiry.ui.network;

import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.steps.ui.network.AddressAutocompleteResponse;
import com.withpersona.sdk2.inquiry.steps.ui.network.Meta;
import com.withpersona.sdk2.inquiry.steps.ui.network.Suggestion;
import dv.h;
import dv.i;
import gu.f;
import gu.l;
import gu.m;
import java.util.List;
import ln.o;
import ls.j;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Unit;
import p001kotlin.collections.p;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import qr.x5;
import sw.x;

/* JADX INFO: loaded from: classes3.dex */
@p001kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0016\u0012B)\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00112\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b;", "Lln/o;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "Lls/j;", BuildConfig.FLAVOR, "sessionToken", "Lqr/x5;", "triggeringComponent", "addressText", "Lgs/c;", "uiService", "<init>", "(Ljava/lang/String;Lqr/x5;Ljava/lang/String;Lgs/c;)V", "Ldv/h;", "run", "()Ldv/h;", "otherWorker", BuildConfig.FLAVOR, "a", "(Lln/o;)Z", "c", "(Lls/j;)Z", "b", "Ljava/lang/String;", "Lqr/x5;", "d", "e", "Lgs/c;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements o<AbstractC0196b>, j<AbstractC0196b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x5 triggeringComponent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String addressText;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gs.c uiService;

    @p001kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", BuildConfig.FLAVOR, "Lgs/c;", "uiService", "<init>", "(Lgs/c;)V", BuildConfig.FLAVOR, "sessionToken", "Lqr/x5;", "triggeringComponent", "addressText", "Lcom/withpersona/sdk2/inquiry/ui/network/b;", "a", "(Ljava/lang/String;Lqr/x5;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/b;", "Lgs/c;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final gs.c uiService;

        public a(@NotNull gs.c uiService) {
            Intrinsics.checkNotNullParameter(uiService, "uiService");
            this.uiService = uiService;
        }

        @NotNull
        public final b a(@NotNull String sessionToken, @NotNull x5 triggeringComponent, @NotNull String addressText) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(triggeringComponent, "triggeringComponent");
            Intrinsics.checkNotNullParameter(addressText, "addressText");
            return new b(sessionToken, triggeringComponent, addressText, this.uiService, null);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.b$b, reason: collision with other inner class name */
    @p001kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", BuildConfig.FLAVOR, "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b$b;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class AbstractC0196b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.b$b$a */
        @p001kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends AbstractC0196b {

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
        @p001kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b$b$b;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;", "results", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0197b extends AbstractC0196b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final List<Suggestion> results;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0197b(@NotNull List<Suggestion> results) {
                super(null);
                Intrinsics.checkNotNullParameter(results, "results");
                this.results = results;
            }

            @NotNull
            public final List<Suggestion> a() {
                return this.results;
            }
        }

        public /* synthetic */ AbstractC0196b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public AbstractC0196b() {
        }
    }

    @p001kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.ui.network.UiAddressAutocompleteWorker$run$1", f = "UiAddressAutocompleteWorker.kt", l = {20, 29, 31}, m = "invokeSuspend")
    public static final class c extends m implements Function2<i<? super AbstractC0196b>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11481t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f11482u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f11483v;

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            c cVar = b.this.new c(bVar);
            cVar.f11483v = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
        
            if (r0.emit(r2, r9) == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
        
            if (r0.emit(r2, r9) == r1) goto L29;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List<Suggestion> listK;
            Meta meta;
            i iVar = (i) this.f11483v;
            Object objE = fu.c.e();
            int i10 = this.f11482u;
            if (i10 != 0) {
                if (i10 == 1) {
                    zt.o.b(obj);
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
            }
            zt.o.b(obj);
            gs.c cVar = b.this.uiService;
            String str = b.this.sessionToken;
            AddressAutocompleteRequest addressAutocompleteRequestA = AddressAutocompleteRequest.INSTANCE.a(b.this.triggeringComponent, b.this.addressText);
            this.f11483v = iVar;
            this.f11482u = 1;
            obj = cVar.b(str, addressAutocompleteRequestA, this);
            if (obj != objE) {
            }
            return objE;
            x xVar = (x) obj;
            if (xVar.g()) {
                AddressAutocompleteResponse addressAutocompleteResponse = (AddressAutocompleteResponse) xVar.a();
                if (addressAutocompleteResponse == null || (meta = addressAutocompleteResponse.getMeta()) == null || (listK = meta.a()) == null) {
                    listK = p.k();
                }
                AbstractC0196b.C0197b c0197b = new AbstractC0196b.C0197b(listK);
                this.f11483v = l.a(iVar);
                this.f11481t = l.a(xVar);
                this.f11482u = 3;
            } else {
                AbstractC0196b.a aVar = new AbstractC0196b.a(NetworkUtilsKt.toErrorInfo(xVar));
                this.f11483v = l.a(iVar);
                this.f11481t = l.a(xVar);
                this.f11482u = 2;
            }
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super AbstractC0196b> iVar, eu.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public /* synthetic */ b(String str, x5 x5Var, String str2, gs.c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, x5Var, str2, cVar);
    }

    @Override // ln.o
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof b) && Intrinsics.c(this.addressText, ((b) otherWorker).addressText);
    }

    @Override // ls.j
    public boolean b(@NotNull j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull j<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof b) && Intrinsics.c(this.addressText, ((b) otherWorker).addressText);
    }

    @Override // ln.o, ls.j
    @NotNull
    public h<AbstractC0196b> run() {
        return dv.j.w(new c(null));
    }

    public b(String str, x5 x5Var, String str2, gs.c cVar) {
        this.sessionToken = str;
        this.triggeringComponent = x5Var;
        this.addressText = str2;
        this.uiService = cVar;
    }
}
