package com.withpersona.sdk2.inquiry.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0014B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/f;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/internal/network/d;", "Lvr/h;", "", "oneTimeLinkCode", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiryApiHelper", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V", "Lnu/h;", "run", "()Lnu/h;", "otherWorker", "", "b", "(Lym/o;)Z", "Ljava/lang/String;", "c", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "a", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements ym.o<com.withpersona.sdk2.inquiry.internal.network.d>, vr.h<com.withpersona.sdk2.inquiry.internal.network.d> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String oneTimeLinkCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/f$a;", "", "", "oneTimeLinkCode", "Lcom/withpersona/sdk2/inquiry/internal/f;", "create", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/f;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        f create(@NotNull String oneTimeLinkCode);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/internal/network/d;", "", "<anonymous>", "(Lnu/i;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.ExchangeOneTimeCodeWorker$run$1", f = "ExchangeOneTimeCodeWorker.kt", l = {19, 19}, m = "invokeSuspend")
    public static final class b extends pt.m implements Function2<nu.i<? super com.withpersona.sdk2.inquiry.internal.network.d>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11718t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f11719u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f11720v;

        public b(nt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            b bVar2 = f.this.new b(bVar);
            bVar2.f11720v = obj;
            return bVar2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
        
            if (r2.emit(r7, r6) == r1) goto L16;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f11720v
                nu.i r0 = (nu.i) r0
                java.lang.Object r1 = ot.c.e()
                int r2 = r6.f11719u
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                jt.o.b(r7)
                goto L59
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r2 = r6.f11718t
                nu.i r2 = (nu.i) r2
                jt.o.b(r7)
                goto L47
            L26:
                jt.o.b(r7)
                com.withpersona.sdk2.inquiry.internal.f r7 = com.withpersona.sdk2.inquiry.internal.f.this
                com.withpersona.sdk2.inquiry.internal.network.e r7 = com.withpersona.sdk2.inquiry.internal.f.d(r7)
                com.withpersona.sdk2.inquiry.internal.f r2 = com.withpersona.sdk2.inquiry.internal.f.this
                java.lang.String r2 = com.withpersona.sdk2.inquiry.internal.f.e(r2)
                java.lang.Object r5 = pt.l.a(r0)
                r6.f11720v = r5
                r6.f11718t = r0
                r6.f11719u = r4
                java.lang.Object r7 = r7.k(r2, r6)
                if (r7 != r1) goto L46
                goto L58
            L46:
                r2 = r0
            L47:
                java.lang.Object r0 = pt.l.a(r0)
                r6.f11720v = r0
                r0 = 0
                r6.f11718t = r0
                r6.f11719u = r3
                java.lang.Object r7 = r2.emit(r7, r6)
                if (r7 != r1) goto L59
            L58:
                return r1
            L59:
                kotlin.Unit r7 = kotlin.Unit.f22483a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nu.i<? super com.withpersona.sdk2.inquiry.internal.network.d> iVar, nt.b<? super Unit> bVar) {
            return ((b) create(iVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public f(@NotNull String oneTimeLinkCode, @NotNull com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper) {
        Intrinsics.checkNotNullParameter(oneTimeLinkCode, "oneTimeLinkCode");
        Intrinsics.checkNotNullParameter(inquiryApiHelper, "inquiryApiHelper");
        this.oneTimeLinkCode = oneTimeLinkCode;
        this.inquiryApiHelper = inquiryApiHelper;
    }

    @Override // vr.h
    public boolean a(@NotNull vr.h<?> hVar) {
        return super.a(hVar);
    }

    @Override // ym.o
    public boolean b(@NotNull ym.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof f) && Intrinsics.c(this.oneTimeLinkCode, ((f) otherWorker).oneTimeLinkCode);
    }

    @Override // vr.h
    public boolean c(@NotNull vr.h<?> hVar) {
        return super.c(hVar);
    }

    @Override // ym.o, vr.h
    @NotNull
    public nu.h<com.withpersona.sdk2.inquiry.internal.network.d> run() {
        return nu.j.w(new b(null));
    }
}
