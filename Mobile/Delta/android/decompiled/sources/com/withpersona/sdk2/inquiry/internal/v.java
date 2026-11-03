package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B/\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/v;", "Ltr/h;", "Lcom/withpersona/sdk2/inquiry/internal/network/i;", "", "sessionToken", "inquiryId", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiryApiHelper", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V", "Llu/h;", "run", "()Llu/h;", "otherWorker", "", "a", "(Ltr/h;)Z", "b", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "c", "getInquiryId", "d", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v implements tr.h<com.withpersona.sdk2.inquiry.internal.network.i> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InquirySessionConfig inquirySessionConfig;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/v$a;", "", "", "sessionToken", "inquiryId", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/v;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)Lcom/withpersona/sdk2/inquiry/internal/v;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        v a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull InquirySessionConfig inquirySessionConfig);
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.UpdateInquirySessionWorker$run$1", f = "UpdateInquirySessionWorker.kt", l = {22, 21}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/i;", "Lcom/withpersona/sdk2/inquiry/internal/network/i;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends nt.m implements Function2<lu.i<? super com.withpersona.sdk2.inquiry.internal.network.i>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12176t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f12177u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f12178v;

        public b(lt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            b bVar2 = v.this.new b(bVar);
            bVar2.f12178v = obj;
            return bVar2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
        
            if (r2.emit(r8, r7) == r1) goto L16;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f12178v
                lu.i r0 = (lu.i) r0
                java.lang.Object r1 = mt.c.e()
                int r2 = r7.f12177u
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                gt.o.b(r8)
                goto L5f
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r2 = r7.f12176t
                lu.i r2 = (lu.i) r2
                gt.o.b(r8)
                goto L4d
            L26:
                gt.o.b(r8)
                com.withpersona.sdk2.inquiry.internal.v r8 = com.withpersona.sdk2.inquiry.internal.v.this
                com.withpersona.sdk2.inquiry.internal.network.e r8 = com.withpersona.sdk2.inquiry.internal.v.c(r8)
                com.withpersona.sdk2.inquiry.internal.v r2 = com.withpersona.sdk2.inquiry.internal.v.this
                java.lang.String r2 = r2.getSessionToken()
                com.withpersona.sdk2.inquiry.internal.v r5 = com.withpersona.sdk2.inquiry.internal.v.this
                com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r5 = com.withpersona.sdk2.inquiry.internal.v.d(r5)
                java.lang.Object r6 = nt.l.a(r0)
                r7.f12178v = r6
                r7.f12176t = r0
                r7.f12177u = r4
                java.lang.Object r8 = r8.r(r2, r5, r7)
                if (r8 != r1) goto L4c
                goto L5e
            L4c:
                r2 = r0
            L4d:
                java.lang.Object r0 = nt.l.a(r0)
                r7.f12178v = r0
                r0 = 0
                r7.f12176t = r0
                r7.f12177u = r3
                java.lang.Object r8 = r2.emit(r8, r7)
                if (r8 != r1) goto L5f
            L5e:
                return r1
            L5f:
                kotlin.Unit r8 = kotlin.Unit.f22938a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.v.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lu.i<? super com.withpersona.sdk2.inquiry.internal.network.i> iVar, lt.b<? super Unit> bVar) {
            return ((b) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    public v(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull InquirySessionConfig inquirySessionConfig, @NotNull com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        Intrinsics.checkNotNullParameter(inquiryApiHelper, "inquiryApiHelper");
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.inquirySessionConfig = inquirySessionConfig;
        this.inquiryApiHelper = inquiryApiHelper;
    }

    @Override // tr.h
    public boolean a(@NotNull tr.h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof v)) {
            return false;
        }
        v vVar = (v) otherWorker;
        return Intrinsics.c(this.sessionToken, vVar.sessionToken) && Intrinsics.c(this.inquiryId, vVar.inquiryId);
    }

    @Override // tr.h
    public boolean b(@NotNull tr.h<?> hVar) {
        return super.b(hVar);
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    @Override // tr.h
    @NotNull
    public lu.h<com.withpersona.sdk2.inquiry.internal.network.i> run() {
        return lu.j.w(new b(null));
    }
}
