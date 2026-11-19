package com.withpersona.sdk2.inquiry.internal;

import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B'\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/a;", "Lls/j;", "Lcom/withpersona/sdk2/inquiry/internal/network/b;", BuildConfig.FLAVOR, "inquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "inquirySessionDataWrapper", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiryApiHelper", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V", "Ldv/h;", "run", "()Ldv/h;", "otherWorker", BuildConfig.FLAVOR, "c", "(Lls/j;)Z", "b", "Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "d", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "a", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ls.j<com.withpersona.sdk2.inquiry.internal.network.b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final InquirySessionDataWrapper inquirySessionDataWrapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/a$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "inquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "inquirySessionDataWrapper", "Lcom/withpersona/sdk2/inquiry/internal/a;", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;)Lcom/withpersona/sdk2/inquiry/internal/a;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC0176a {
        @NotNull
        a a(@NotNull String inquiryId, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lcom/withpersona/sdk2/inquiry/internal/network/b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.CreateInquirySessionWorker$run$1", f = "CreateInquirySessionWorker.kt", l = {24, 23}, m = "invokeSuspend")
    public static final class b extends gu.m implements Function2<dv.i<? super com.withpersona.sdk2.inquiry.internal.network.b>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10078t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f10079u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f10080v;

        public b(eu.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            b bVar2 = a.this.new b(bVar);
            bVar2.f10080v = obj;
            return bVar2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
        
            if (r2.emit(r8, r7) == r1) goto L16;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            dv.i iVar;
            dv.i iVar2 = (dv.i) this.f10080v;
            Object objE = fu.c.e();
            int i10 = this.f10079u;
            if (i10 != 0) {
                if (i10 == 1) {
                    iVar = (dv.i) this.f10078t;
                    zt.o.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
            }
            zt.o.b(obj);
            com.withpersona.sdk2.inquiry.internal.network.e eVar = a.this.inquiryApiHelper;
            String str = a.this.inquiryId;
            InquirySessionDataWrapper inquirySessionDataWrapper = a.this.inquirySessionDataWrapper;
            this.f10080v = gu.l.a(iVar2);
            this.f10078t = iVar2;
            this.f10079u = 1;
            obj = eVar.i(str, inquirySessionDataWrapper, this);
            if (obj != objE) {
                iVar = iVar2;
            }
            return objE;
            this.f10080v = gu.l.a(iVar2);
            this.f10078t = null;
            this.f10079u = 2;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super com.withpersona.sdk2.inquiry.internal.network.b> iVar, eu.b<? super Unit> bVar) {
            return ((b) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public a(@NotNull String inquiryId, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper, @NotNull com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(inquiryApiHelper, "inquiryApiHelper");
        this.inquiryId = inquiryId;
        this.inquirySessionDataWrapper = inquirySessionDataWrapper;
        this.inquiryApiHelper = inquiryApiHelper;
    }

    @Override // ls.j
    public boolean b(@NotNull ls.j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull ls.j<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof a) && Intrinsics.c(this.inquiryId, ((a) otherWorker).inquiryId);
    }

    @Override // ls.j
    @NotNull
    public dv.h<com.withpersona.sdk2.inquiry.internal.network.b> run() {
        return dv.j.w(new b(null));
    }
}
