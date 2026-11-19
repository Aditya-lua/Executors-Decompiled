package com.withpersona.sdk2.inquiry.internal;

import com.github.luben.zstd.BuildConfig;
import hr.InquirySessionConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BE\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/u;", "Lls/j;", "Lcom/withpersona/sdk2/inquiry/internal/network/h;", BuildConfig.FLAVOR, "sessionToken", "trackingEventsUrl", "inquiryId", "fromStep", "Lhr/g;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiryApiHelper", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhr/g;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V", "Ldv/h;", "run", "()Ldv/h;", "otherWorker", BuildConfig.FLAVOR, "c", "(Lls/j;)Z", "b", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "d", "f", "e", "Lhr/g;", "g", "()Lhr/g;", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "()Lcom/withpersona/sdk2/inquiry/internal/network/e;", "a", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u implements ls.j<com.withpersona.sdk2.inquiry.internal.network.h> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String trackingEventsUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fromStep;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InquirySessionConfig inquirySessionConfig;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JA\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/u$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "sessionToken", "trackingEventsUrl", "inquiryId", "fromStep", "Lhr/g;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/u;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhr/g;)Lcom/withpersona/sdk2/inquiry/internal/u;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        u a(@NotNull String sessionToken, @Nullable String trackingEventsUrl, @NotNull String inquiryId, @NotNull String fromStep, @NotNull InquirySessionConfig inquirySessionConfig);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lcom/withpersona/sdk2/inquiry/internal/network/h;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.TransitionBackWorker$run$1", f = "TransitionBackWorker.kt", l = {23, 22}, m = "invokeSuspend")
    public static final class b extends gu.m implements Function2<dv.i<? super com.withpersona.sdk2.inquiry.internal.network.h>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10899t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f10900u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f10901v;

        public b(eu.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            b bVar2 = u.this.new b(bVar);
            bVar2.f10901v = obj;
            return bVar2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
        
            if (r2.emit(r13, r12) == r1) goto L16;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b bVar;
            dv.i iVar;
            dv.i iVar2 = (dv.i) this.f10901v;
            Object objE = fu.c.e();
            int i10 = this.f10900u;
            if (i10 != 0) {
                if (i10 == 1) {
                    iVar = (dv.i) this.f10899t;
                    zt.o.b(obj);
                    bVar = this;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
            }
            zt.o.b(obj);
            com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper = u.this.getInquiryApiHelper();
            String sessionToken = u.this.getSessionToken();
            String inquiryId = u.this.getInquiryId();
            String fromStep = u.this.getFromStep();
            InquirySessionConfig inquirySessionConfig = u.this.getInquirySessionConfig();
            String str = u.this.trackingEventsUrl;
            this.f10901v = gu.l.a(iVar2);
            this.f10899t = iVar2;
            this.f10900u = 1;
            bVar = this;
            obj = inquiryApiHelper.p(sessionToken, inquiryId, fromStep, inquirySessionConfig, str, bVar);
            if (obj != objE) {
                iVar = iVar2;
            }
            return objE;
            bVar.f10901v = gu.l.a(iVar2);
            bVar.f10899t = null;
            bVar.f10900u = 2;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super com.withpersona.sdk2.inquiry.internal.network.h> iVar, eu.b<? super Unit> bVar) {
            return ((b) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public u(@NotNull String sessionToken, @Nullable String str, @NotNull String inquiryId, @NotNull String fromStep, @NotNull InquirySessionConfig inquirySessionConfig, @NotNull com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(fromStep, "fromStep");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        Intrinsics.checkNotNullParameter(inquiryApiHelper, "inquiryApiHelper");
        this.sessionToken = sessionToken;
        this.trackingEventsUrl = str;
        this.inquiryId = inquiryId;
        this.fromStep = fromStep;
        this.inquirySessionConfig = inquirySessionConfig;
        this.inquiryApiHelper = inquiryApiHelper;
    }

    @Override // ls.j
    public boolean b(@NotNull ls.j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull ls.j<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof u)) {
            return false;
        }
        u uVar = (u) otherWorker;
        return Intrinsics.c(this.sessionToken, uVar.sessionToken) && Intrinsics.c(this.inquiryId, uVar.inquiryId);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFromStep() {
        return this.fromStep;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final com.withpersona.sdk2.inquiry.internal.network.e getInquiryApiHelper() {
        return this.inquiryApiHelper;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getInquiryId() {
        return this.inquiryId;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final InquirySessionConfig getInquirySessionConfig() {
        return this.inquirySessionConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    @Override // ls.j
    @NotNull
    public dv.h<com.withpersona.sdk2.inquiry.internal.network.h> run() {
        return dv.j.w(new b(null));
    }
}
