package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0012B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/o;", "Lvr/h;", "Lcom/withpersona/sdk2/inquiry/internal/o$b;", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "uiStepSavedStateHelper", "", "sessionToken", "inquiryId", "stepName", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lnu/h;", "run", "()Lnu/h;", "otherWorker", "", "c", "(Lvr/h;)Z", "b", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "Ljava/lang/String;", "d", "e", "a", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements vr.h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final UiStepSavedStateHelper uiStepSavedStateHelper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String stepName;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/o$a;", "", "", "sessionToken", "inquiryId", "stepName", "Lcom/withpersona/sdk2/inquiry/internal/o;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/o;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        o a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String stepName);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/o$b;", "", "b", "a", "Lcom/withpersona/sdk2/inquiry/internal/o$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/o$b$b;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/o$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/o$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f12057a = new a();

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

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.o$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/o$b$b;", "Lcom/withpersona/sdk2/inquiry/internal/o$b;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "components", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0220b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final List<UiComponentConfig> components;

            /* JADX WARN: Multi-variable type inference failed */
            public C0220b(@NotNull List<? extends UiComponentConfig> components) {
                Intrinsics.checkNotNullParameter(components, "components");
                this.components = components;
            }

            @NotNull
            public final List<UiComponentConfig> a() {
                return this.components;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/internal/o$b;", "", "<anonymous>", "(Lnu/i;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.RestoreUiStepStateWorker$run$1", f = "RestoreUiStepStateWorker.kt", l = {33, 40, 42}, m = "invokeSuspend")
    public static final class c extends pt.m implements Function2<nu.i<? super b>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12059t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f12060u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f12061v;

        public c(nt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            c cVar = o.this.new c(bVar);
            cVar.f12061v = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        
            if (r0.emit(r2, r8) == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
        
            if (r0.emit(r2, r8) == r1) goto L22;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f12061v
                nu.i r0 = (nu.i) r0
                java.lang.Object r1 = ot.c.e()
                int r2 = r8.f12060u
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L2a
                if (r2 == r5) goto L26
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                goto L1e
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                java.lang.Object r0 = r8.f12059t
                java.util.List r0 = (java.util.List) r0
                jt.o.b(r9)
                goto L85
            L26:
                jt.o.b(r9)
                goto L50
            L2a:
                jt.o.b(r9)
                com.withpersona.sdk2.inquiry.internal.o r9 = com.withpersona.sdk2.inquiry.internal.o.this
                com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper r9 = com.withpersona.sdk2.inquiry.internal.o.f(r9)
                com.withpersona.sdk2.inquiry.internal.o r2 = com.withpersona.sdk2.inquiry.internal.o.this
                java.lang.String r2 = com.withpersona.sdk2.inquiry.internal.o.d(r2)
                com.withpersona.sdk2.inquiry.internal.o r6 = com.withpersona.sdk2.inquiry.internal.o.this
                java.lang.String r6 = com.withpersona.sdk2.inquiry.internal.o.b(r6)
                com.withpersona.sdk2.inquiry.internal.o r7 = com.withpersona.sdk2.inquiry.internal.o.this
                java.lang.String r7 = com.withpersona.sdk2.inquiry.internal.o.e(r7)
                r8.f12061v = r0
                r8.f12060u = r5
                java.lang.Object r9 = r9.d(r2, r6, r7, r8)
                if (r9 != r1) goto L50
                goto L84
            L50:
                java.util.List r9 = (java.util.List) r9
                if (r9 == 0) goto L6e
                com.withpersona.sdk2.inquiry.internal.o$b$b r2 = new com.withpersona.sdk2.inquiry.internal.o$b$b
                r2.<init>(r9)
                java.lang.Object r3 = pt.l.a(r0)
                r8.f12061v = r3
                java.lang.Object r9 = pt.l.a(r9)
                r8.f12059t = r9
                r8.f12060u = r4
                java.lang.Object r9 = r0.emit(r2, r8)
                if (r9 != r1) goto L85
                goto L84
            L6e:
                com.withpersona.sdk2.inquiry.internal.o$b$a r2 = com.withpersona.sdk2.inquiry.internal.o.b.a.f12057a
                java.lang.Object r4 = pt.l.a(r0)
                r8.f12061v = r4
                java.lang.Object r9 = pt.l.a(r9)
                r8.f12059t = r9
                r8.f12060u = r3
                java.lang.Object r9 = r0.emit(r2, r8)
                if (r9 != r1) goto L85
            L84:
                return r1
            L85:
                kotlin.Unit r9 = kotlin.Unit.f22483a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.o.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nu.i<? super b> iVar, nt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public o(@NotNull UiStepSavedStateHelper uiStepSavedStateHelper, @NotNull String sessionToken, @NotNull String inquiryId, @NotNull String stepName) {
        Intrinsics.checkNotNullParameter(uiStepSavedStateHelper, "uiStepSavedStateHelper");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        this.uiStepSavedStateHelper = uiStepSavedStateHelper;
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.stepName = stepName;
    }

    @Override // vr.h
    public boolean a(@NotNull vr.h<?> hVar) {
        return super.a(hVar);
    }

    @Override // vr.h
    public boolean c(@NotNull vr.h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof o)) {
            return false;
        }
        o oVar = (o) otherWorker;
        return Intrinsics.c(oVar.sessionToken, this.sessionToken) && Intrinsics.c(oVar.inquiryId, this.inquiryId) && Intrinsics.c(oVar.stepName, this.stepName);
    }

    @Override // vr.h
    @NotNull
    public nu.h<b> run() {
        return nu.j.w(new c(null));
    }
}
