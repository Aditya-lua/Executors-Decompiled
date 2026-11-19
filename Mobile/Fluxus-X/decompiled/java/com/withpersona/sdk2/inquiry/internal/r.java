package com.withpersona.sdk2.inquiry.internal;

import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import java.util.List;
import np.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0012B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/r;", "Lls/j;", "Lcom/withpersona/sdk2/inquiry/internal/r$b;", "Lnp/q0;", "uiStepSavedStateHelper", BuildConfig.FLAVOR, "sessionToken", "inquiryId", "stepName", "<init>", "(Lnp/q0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ldv/h;", "run", "()Ldv/h;", "otherWorker", BuildConfig.FLAVOR, "c", "(Lls/j;)Z", "b", "Lnp/q0;", "Ljava/lang/String;", "d", "e", "a", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r implements ls.j<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final q0 uiStepSavedStateHelper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String stepName;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/r$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "sessionToken", "inquiryId", "stepName", "Lcom/withpersona/sdk2/inquiry/internal/r;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/r;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        r a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String stepName);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/r$b;", BuildConfig.FLAVOR, "b", "a", "Lcom/withpersona/sdk2/inquiry/internal/r$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/r$b$b;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/r$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/r$b;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f10878a = new a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1486380735;
            }

            @NotNull
            public String toString() {
                return "Failure";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.r$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/r$b$b;", "Lcom/withpersona/sdk2/inquiry/internal/r$b;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "components", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0188b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final List<UiComponentConfig> components;

            /* JADX WARN: Multi-variable type inference failed */
            public C0188b(@NotNull List<? extends UiComponentConfig> components) {
                Intrinsics.checkNotNullParameter(components, "components");
                this.components = components;
            }

            @NotNull
            public final List<UiComponentConfig> a() {
                return this.components;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lcom/withpersona/sdk2/inquiry/internal/r$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.RestoreUiStepStateWorker$run$1", f = "RestoreUiStepStateWorker.kt", l = {33, RequestError.NETWORK_FAILURE, 42}, m = "invokeSuspend")
    public static final class c extends gu.m implements Function2<dv.i<? super b>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10880t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f10881u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f10882v;

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            c cVar = r.this.new c(bVar);
            cVar.f10882v = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        
            if (r0.emit(r2, r8) == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
        
            if (r0.emit(r2, r8) == r1) goto L22;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            dv.i iVar = (dv.i) this.f10882v;
            Object objE = fu.c.e();
            int i10 = this.f10881u;
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
            q0 q0Var = r.this.uiStepSavedStateHelper;
            String str = r.this.sessionToken;
            String str2 = r.this.inquiryId;
            String str3 = r.this.stepName;
            this.f10882v = iVar;
            this.f10881u = 1;
            obj = q0Var.d(str, str2, str3, this);
            if (obj != objE) {
            }
            return objE;
            List list = (List) obj;
            if (list != null) {
                b.C0188b c0188b = new b.C0188b(list);
                this.f10882v = gu.l.a(iVar);
                this.f10880t = gu.l.a(list);
                this.f10881u = 2;
            } else {
                b.a aVar = b.a.f10878a;
                this.f10882v = gu.l.a(iVar);
                this.f10880t = gu.l.a(list);
                this.f10881u = 3;
            }
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super b> iVar, eu.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public r(@NotNull q0 uiStepSavedStateHelper, @NotNull String sessionToken, @NotNull String inquiryId, @NotNull String stepName) {
        Intrinsics.checkNotNullParameter(uiStepSavedStateHelper, "uiStepSavedStateHelper");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        this.uiStepSavedStateHelper = uiStepSavedStateHelper;
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.stepName = stepName;
    }

    @Override // ls.j
    public boolean b(@NotNull ls.j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull ls.j<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof r)) {
            return false;
        }
        r rVar = (r) otherWorker;
        return Intrinsics.c(rVar.sessionToken, this.sessionToken) && Intrinsics.c(rVar.inquiryId, this.inquiryId) && Intrinsics.c(rVar.stepName, this.stepName);
    }

    @Override // ls.j
    @NotNull
    public dv.h<b> run() {
        return dv.j.w(new c(null));
    }
}
