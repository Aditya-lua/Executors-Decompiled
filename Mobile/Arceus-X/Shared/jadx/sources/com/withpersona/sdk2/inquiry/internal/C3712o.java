package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p499vr.InterfaceC12257h;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.o */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0012B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/o;", "Lvr/h;", "Lcom/withpersona/sdk2/inquiry/internal/o$b;", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "uiStepSavedStateHelper", "", "sessionToken", "inquiryId", "stepName", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lnu/h;", "run", "()Lnu/h;", "otherWorker", "", "c", "(Lvr/h;)Z", "b", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "Ljava/lang/String;", "d", "e", "a", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3712o implements InterfaceC12257h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final UiStepSavedStateHelper uiStepSavedStateHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String stepName;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.o$a */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/o$a;", "", "", "sessionToken", "inquiryId", "stepName", "Lcom/withpersona/sdk2/inquiry/internal/o;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/o;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C3712o mo18787a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String stepName);
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.o$b */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/o$b;", "", "b", "a", "Lcom/withpersona/sdk2/inquiry/internal/o$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/o$b$b;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.o$b$a */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/o$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/o$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f15524a = new a();

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
        @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/o$b$b;", "Lcom/withpersona/sdk2/inquiry/internal/o$b;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "components", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14134b implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final List<UiComponentConfig> components;

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig> */
            /* JADX WARN: Multi-variable type inference failed */
            public C14134b(@NotNull List<? extends UiComponentConfig> components) {
                Intrinsics.checkNotNullParameter(components, "components");
                this.components = components;
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final List<UiComponentConfig> m18788a() {
                return this.components;
            }
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.o$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/internal/o$b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.RestoreUiStepStateWorker$run$1", m39664f = "RestoreUiStepStateWorker.kt", m39665l = {33, 40, 42}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC9577i<? super b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f15526t;

        /* JADX INFO: renamed from: u */
        public int f15527u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f15528v;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            c cVar = C3712o.this.new c(interfaceC9557b);
            cVar.f15528v = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        
            if (r0.emit(r2, r8) == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
        
            if (r0.emit(r2, r8) == r1) goto L22;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f15528v;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f15527u;
            if (i10 != 0) {
                if (i10 == 1) {
                    C7348o.m30470b(obj);
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }
            C7348o.m30470b(obj);
            UiStepSavedStateHelper uiStepSavedStateHelper = C3712o.this.uiStepSavedStateHelper;
            String str = C3712o.this.sessionToken;
            String str2 = C3712o.this.inquiryId;
            String str3 = C3712o.this.stepName;
            this.f15528v = interfaceC9577i;
            this.f15527u = 1;
            obj = uiStepSavedStateHelper.m18329d(str, str2, str3, this);
            if (obj != objM38805e) {
            }
            return objM38805e;
            List list = (List) obj;
            if (list != null) {
                b.C14134b c14134b = new b.C14134b(list);
                this.f15528v = C10350l.m39676a(interfaceC9577i);
                this.f15526t = C10350l.m39676a(list);
                this.f15527u = 2;
            } else {
                b.a aVar = b.a.f15524a;
                this.f15528v = C10350l.m39676a(interfaceC9577i);
                this.f15526t = C10350l.m39676a(list);
                this.f15527u = 3;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super b> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C3712o(@NotNull UiStepSavedStateHelper uiStepSavedStateHelper, @NotNull String sessionToken, @NotNull String inquiryId, @NotNull String stepName) {
        Intrinsics.checkNotNullParameter(uiStepSavedStateHelper, "uiStepSavedStateHelper");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        this.uiStepSavedStateHelper = uiStepSavedStateHelper;
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.stepName = stepName;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof C3712o)) {
            return false;
        }
        C3712o c3712o = (C3712o) otherWorker;
        return Intrinsics.m31980c(c3712o.sessionToken, this.sessionToken) && Intrinsics.m31980c(c3712o.inquiryId, this.inquiryId) && Intrinsics.m31980c(c3712o.stepName, this.stepName);
    }

    @Override // p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<b> run() {
        return C9579j.m37806w(new c(null));
    }
}
