package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.network.AbstractC3703b;
import com.withpersona.sdk2.inquiry.internal.network.C3706e;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
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

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B'\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/a;", "Lvr/h;", "Lcom/withpersona/sdk2/inquiry/internal/network/b;", "", "inquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "inquirySessionDataWrapper", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiryApiHelper", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V", "Lnu/h;", "run", "()Lnu/h;", "otherWorker", "", "c", "(Lvr/h;)Z", "b", "Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "d", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "a", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3672a implements InterfaceC12257h<AbstractC3703b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final InquirySessionDataWrapper inquirySessionDataWrapper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C3706e inquiryApiHelper;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.a$a */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/a$a;", "", "", "inquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "inquirySessionDataWrapper", "Lcom/withpersona/sdk2/inquiry/internal/a;", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;)Lcom/withpersona/sdk2/inquiry/internal/a;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C3672a mo18340a(@NotNull String inquiryId, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper);
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.a$b */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/internal/network/b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.CreateInquirySessionWorker$run$1", m39664f = "CreateInquirySessionWorker.kt", m39665l = {24, 23}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC9577i<? super AbstractC3703b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f14729t;

        /* JADX INFO: renamed from: u */
        public int f14730u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f14731v;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            b bVar = C3672a.this.new b(interfaceC9557b);
            bVar.f14731v = obj;
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
            InterfaceC9577i interfaceC9577i2 = (InterfaceC9577i) this.f14731v;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f14730u;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC9577i = (InterfaceC9577i) this.f14729t;
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
            C3706e c3706e = C3672a.this.inquiryApiHelper;
            String str = C3672a.this.inquiryId;
            InquirySessionDataWrapper inquirySessionDataWrapper = C3672a.this.inquirySessionDataWrapper;
            this.f14731v = C10350l.m39676a(interfaceC9577i2);
            this.f14729t = interfaceC9577i2;
            this.f14730u = 1;
            obj = c3706e.m18736i(str, inquirySessionDataWrapper, this);
            if (obj != objM38805e) {
                interfaceC9577i = interfaceC9577i2;
            }
            return objM38805e;
            this.f14731v = C10350l.m39676a(interfaceC9577i2);
            this.f14729t = null;
            this.f14730u = 2;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super AbstractC3703b> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C3672a(@NotNull String inquiryId, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper, @NotNull C3706e inquiryApiHelper) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(inquiryApiHelper, "inquiryApiHelper");
        this.inquiryId = inquiryId;
        this.inquirySessionDataWrapper = inquirySessionDataWrapper;
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
        return (otherWorker instanceof C3672a) && Intrinsics.m31980c(this.inquiryId, ((C3672a) otherWorker).inquiryId);
    }

    @Override // p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<AbstractC3703b> run() {
        return C9579j.m37806w(new b(null));
    }
}
