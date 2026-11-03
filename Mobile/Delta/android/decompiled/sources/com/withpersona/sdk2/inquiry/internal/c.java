package com.withpersona.sdk2.inquiry.internal;

import ep.InquiryAttributes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/c;", "Ltr/h;", "Lcom/withpersona/sdk2/inquiry/internal/network/a;", "Lep/e;", "attributes", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiryApiHelper", "<init>", "(Lep/e;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V", "Llu/h;", "run", "()Llu/h;", "otherWorker", "", "a", "(Ltr/h;)Z", "b", "Lep/e;", "c", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements tr.h<com.withpersona.sdk2.inquiry.internal.network.a> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InquiryAttributes attributes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/c$a;", "", "Lep/e;", "attributes", "Lcom/withpersona/sdk2/inquiry/internal/c;", "a", "(Lep/e;)Lcom/withpersona/sdk2/inquiry/internal/c;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        c a(@NotNull InquiryAttributes attributes);
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.CreateInquiryWorker$run$1", f = "CreateInquiryWorker.kt", l = {19, 19}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/i;", "Lcom/withpersona/sdk2/inquiry/internal/network/a;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends nt.m implements Function2<lu.i<? super com.withpersona.sdk2.inquiry.internal.network.a>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11531t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f11532u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f11533v;

        public b(lt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            b bVar2 = c.this.new b(bVar);
            bVar2.f11533v = obj;
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
                java.lang.Object r0 = r6.f11533v
                lu.i r0 = (lu.i) r0
                java.lang.Object r1 = mt.c.e()
                int r2 = r6.f11532u
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
                java.lang.Object r2 = r6.f11531t
                lu.i r2 = (lu.i) r2
                gt.o.b(r7)
                goto L47
            L26:
                gt.o.b(r7)
                com.withpersona.sdk2.inquiry.internal.c r7 = com.withpersona.sdk2.inquiry.internal.c.this
                com.withpersona.sdk2.inquiry.internal.network.e r7 = com.withpersona.sdk2.inquiry.internal.c.d(r7)
                com.withpersona.sdk2.inquiry.internal.c r2 = com.withpersona.sdk2.inquiry.internal.c.this
                ep.e r2 = com.withpersona.sdk2.inquiry.internal.c.c(r2)
                java.lang.Object r5 = nt.l.a(r0)
                r6.f11533v = r5
                r6.f11531t = r0
                r6.f11532u = r4
                java.lang.Object r7 = r7.h(r2, r6)
                if (r7 != r1) goto L46
                goto L58
            L46:
                r2 = r0
            L47:
                java.lang.Object r0 = nt.l.a(r0)
                r6.f11533v = r0
                r0 = 0
                r6.f11531t = r0
                r6.f11532u = r3
                java.lang.Object r7 = r2.emit(r7, r6)
                if (r7 != r1) goto L59
            L58:
                return r1
            L59:
                kotlin.Unit r7 = kotlin.Unit.f22938a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lu.i<? super com.withpersona.sdk2.inquiry.internal.network.a> iVar, lt.b<? super Unit> bVar) {
            return ((b) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    public c(@NotNull InquiryAttributes attributes, @NotNull com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(inquiryApiHelper, "inquiryApiHelper");
        this.attributes = attributes;
        this.inquiryApiHelper = inquiryApiHelper;
    }

    @Override // tr.h
    public boolean a(@NotNull tr.h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof c)) {
            return false;
        }
        c cVar = (c) otherWorker;
        return Intrinsics.c(this.attributes.getTemplateId(), cVar.attributes.getTemplateId()) && Intrinsics.c(this.attributes.getTemplateVersion(), cVar.attributes.getTemplateVersion()) && this.attributes.getEnvironment() == cVar.attributes.getEnvironment();
    }

    @Override // tr.h
    public boolean b(@NotNull tr.h<?> hVar) {
        return super.b(hVar);
    }

    @Override // tr.h
    @NotNull
    public lu.h<com.withpersona.sdk2.inquiry.internal.network.a> run() {
        return lu.j.w(new b(null));
    }
}
