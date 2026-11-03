package com.withpersona.sdk2.inquiry.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0014B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/m;", "Lwm/o;", "Lcom/withpersona/sdk2/inquiry/internal/network/g;", "Ltr/h;", "", "relaySessionToken", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiryApiHelper", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V", "Llu/h;", "run", "()Llu/h;", "otherWorker", "", "c", "(Lwm/o;)Z", "b", "Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "a", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements wm.o<com.withpersona.sdk2.inquiry.internal.network.g>, tr.h<com.withpersona.sdk2.inquiry.internal.network.g> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String relaySessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/m$a;", "", "", "relaySessionToken", "Lcom/withpersona/sdk2/inquiry/internal/m;", "create", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/m;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        m create(@NotNull String relaySessionToken);
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.RedeemRelaySessionWorker$run$1", f = "RedeemRelaySessionWorker.kt", l = {19, 19}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/i;", "Lcom/withpersona/sdk2/inquiry/internal/network/g;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends nt.m implements Function2<lu.i<? super com.withpersona.sdk2.inquiry.internal.network.g>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11936t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f11937u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f11938v;

        public b(lt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            b bVar2 = m.this.new b(bVar);
            bVar2.f11938v = obj;
            return bVar2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
        
            if (r2.emit(r7, r6) == r1) goto L16;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f11938v
                lu.i r0 = (lu.i) r0
                java.lang.Object r1 = mt.c.e()
                int r2 = r6.f11937u
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                gt.o.b(r7)
                goto L59
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r2 = r6.f11936t
                lu.i r2 = (lu.i) r2
                gt.o.b(r7)
                goto L47
            L26:
                gt.o.b(r7)
                com.withpersona.sdk2.inquiry.internal.m r7 = com.withpersona.sdk2.inquiry.internal.m.this
                com.withpersona.sdk2.inquiry.internal.network.e r7 = com.withpersona.sdk2.inquiry.internal.m.d(r7)
                com.withpersona.sdk2.inquiry.internal.m r2 = com.withpersona.sdk2.inquiry.internal.m.this
                java.lang.String r2 = com.withpersona.sdk2.inquiry.internal.m.e(r2)
                java.lang.Object r5 = nt.l.a(r0)
                r6.f11938v = r5
                r6.f11936t = r0
                r6.f11937u = r4
                java.lang.Object r7 = r7.m(r2, r6)
                if (r7 != r1) goto L46
                goto L58
            L46:
                r2 = r0
            L47:
                java.lang.Object r0 = nt.l.a(r0)
                r6.f11938v = r0
                r0 = 0
                r6.f11936t = r0
                r6.f11937u = r3
                java.lang.Object r7 = r2.emit(r7, r6)
                if (r7 != r1) goto L59
            L58:
                return r1
            L59:
                kotlin.Unit r7 = kotlin.Unit.f22938a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.m.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lu.i<? super com.withpersona.sdk2.inquiry.internal.network.g> iVar, lt.b<? super Unit> bVar) {
            return ((b) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    public m(@NotNull String relaySessionToken, @NotNull com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper) {
        Intrinsics.checkNotNullParameter(relaySessionToken, "relaySessionToken");
        Intrinsics.checkNotNullParameter(inquiryApiHelper, "inquiryApiHelper");
        this.relaySessionToken = relaySessionToken;
        this.inquiryApiHelper = inquiryApiHelper;
    }

    @Override // tr.h
    public boolean a(@NotNull tr.h<?> hVar) {
        return super.a(hVar);
    }

    @Override // tr.h
    public boolean b(@NotNull tr.h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull wm.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof m) && Intrinsics.c(this.relaySessionToken, ((m) otherWorker).relaySessionToken);
    }

    @Override // wm.o, tr.h
    @NotNull
    public lu.h<com.withpersona.sdk2.inquiry.internal.network.g> run() {
        return lu.j.w(new b(null));
    }
}
