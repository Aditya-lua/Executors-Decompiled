package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.network.AbstractC3710i;
import com.withpersona.sdk2.inquiry.internal.network.C3706e;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p499vr.InterfaceC12257h;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.v */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB/\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/v;", "Lvr/h;", "Lcom/withpersona/sdk2/inquiry/internal/network/i;", "", "sessionToken", "inquiryId", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiryApiHelper", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V", "Lnu/h;", "run", "()Lnu/h;", "otherWorker", "", "c", "(Lvr/h;)Z", "b", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "getInquiryId", "d", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "a", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3721v implements InterfaceC12257h<AbstractC3710i> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InquirySessionConfig inquirySessionConfig;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C3706e inquiryApiHelper;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.v$a */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/v$a;", "", "", "sessionToken", "inquiryId", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/v;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)Lcom/withpersona/sdk2/inquiry/internal/v;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C3721v mo18826a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull InquirySessionConfig inquirySessionConfig);
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.v$b */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/internal/network/i;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.UpdateInquirySessionWorker$run$1", m39664f = "UpdateInquirySessionWorker.kt", m39665l = {22, 21}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC9577i<? super AbstractC3710i>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f15568t;

        /* JADX INFO: renamed from: u */
        public int f15569u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f15570v;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            b bVar = C3721v.this.new b(interfaceC9557b);
            bVar.f15570v = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
        
            if (r2.emit(r8, r7) == r1) goto L16;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC9577i interfaceC9577i;
            InterfaceC9577i interfaceC9577i2 = (InterfaceC9577i) this.f15570v;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f15569u;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC9577i = (InterfaceC9577i) this.f15568t;
                    C7348o.m30470b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }
            C7348o.m30470b(obj);
            C3706e c3706e = C3721v.this.inquiryApiHelper;
            String sessionToken = C3721v.this.getSessionToken();
            InquirySessionConfig inquirySessionConfig = C3721v.this.inquirySessionConfig;
            this.f15570v = C10350l.m39676a(interfaceC9577i2);
            this.f15568t = interfaceC9577i2;
            this.f15569u = 1;
            obj = c3706e.m18745r(sessionToken, inquirySessionConfig, this);
            if (obj != objM38805e) {
                interfaceC9577i = interfaceC9577i2;
            }
            return objM38805e;
            this.f15570v = C10350l.m39676a(interfaceC9577i2);
            this.f15568t = null;
            this.f15569u = 2;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super AbstractC3710i> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C3721v(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull InquirySessionConfig inquirySessionConfig, @NotNull C3706e inquiryApiHelper) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        Intrinsics.checkNotNullParameter(inquiryApiHelper, "inquiryApiHelper");
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.inquirySessionConfig = inquirySessionConfig;
        this.inquiryApiHelper = inquiryApiHelper;
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
        if (!(otherWorker instanceof C3721v)) {
            return false;
        }
        C3721v c3721v = (C3721v) otherWorker;
        return Intrinsics.m31980c(this.sessionToken, c3721v.sessionToken) && Intrinsics.m31980c(this.inquiryId, c3721v.inquiryId);
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    @Override // p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<AbstractC3710i> run() {
        return C9579j.m37806w(new b(null));
    }
}
