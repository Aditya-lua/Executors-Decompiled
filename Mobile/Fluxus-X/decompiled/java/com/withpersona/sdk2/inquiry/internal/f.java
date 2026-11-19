package com.withpersona.sdk2.inquiry.internal;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u000fB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/f;", "Lln/o;", "Lcom/withpersona/sdk2/inquiry/internal/network/d;", "Lls/j;", BuildConfig.FLAVOR, "oneTimeLinkCode", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiryApiHelper", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V", "Ldv/h;", "run", "()Ldv/h;", "otherWorker", BuildConfig.FLAVOR, "a", "(Lln/o;)Z", "b", "Ljava/lang/String;", "c", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements ln.o<com.withpersona.sdk2.inquiry.internal.network.d>, ls.j<com.withpersona.sdk2.inquiry.internal.network.d> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String oneTimeLinkCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/f$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "oneTimeLinkCode", "Lcom/withpersona/sdk2/inquiry/internal/f;", "create", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/f;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        f create(@NotNull String oneTimeLinkCode);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lcom/withpersona/sdk2/inquiry/internal/network/d;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.ExchangeOneTimeCodeWorker$run$1", f = "ExchangeOneTimeCodeWorker.kt", l = {19, 19}, m = "invokeSuspend")
    public static final class b extends gu.m implements Function2<dv.i<? super com.withpersona.sdk2.inquiry.internal.network.d>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10360t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f10361u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f10362v;

        public b(eu.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            b bVar2 = f.this.new b(bVar);
            bVar2.f10362v = obj;
            return bVar2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
        
            if (r2.emit(r7, r6) == r1) goto L16;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            dv.i iVar;
            dv.i iVar2 = (dv.i) this.f10362v;
            Object objE = fu.c.e();
            int i10 = this.f10361u;
            if (i10 != 0) {
                if (i10 == 1) {
                    iVar = (dv.i) this.f10360t;
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
            com.withpersona.sdk2.inquiry.internal.network.e eVar = f.this.inquiryApiHelper;
            String str = f.this.oneTimeLinkCode;
            this.f10362v = gu.l.a(iVar2);
            this.f10360t = iVar2;
            this.f10361u = 1;
            obj = eVar.k(str, this);
            if (obj != objE) {
                iVar = iVar2;
            }
            return objE;
            this.f10362v = gu.l.a(iVar2);
            this.f10360t = null;
            this.f10361u = 2;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super com.withpersona.sdk2.inquiry.internal.network.d> iVar, eu.b<? super Unit> bVar) {
            return ((b) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public f(@NotNull String oneTimeLinkCode, @NotNull com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper) {
        Intrinsics.checkNotNullParameter(oneTimeLinkCode, "oneTimeLinkCode");
        Intrinsics.checkNotNullParameter(inquiryApiHelper, "inquiryApiHelper");
        this.oneTimeLinkCode = oneTimeLinkCode;
        this.inquiryApiHelper = inquiryApiHelper;
    }

    @Override // ln.o
    public boolean a(@NotNull ln.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof f) && Intrinsics.c(this.oneTimeLinkCode, ((f) otherWorker).oneTimeLinkCode);
    }

    @Override // ls.j
    public boolean b(@NotNull ls.j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull ls.j<?> jVar) {
        return super.c(jVar);
    }

    @Override // ln.o, ls.j
    @NotNull
    public dv.h<com.withpersona.sdk2.inquiry.internal.network.d> run() {
        return dv.j.w(new b(null));
    }
}
