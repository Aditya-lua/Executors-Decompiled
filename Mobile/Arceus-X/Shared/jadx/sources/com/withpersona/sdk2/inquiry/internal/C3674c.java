package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.network.AbstractC3702a;
import com.withpersona.sdk2.inquiry.internal.network.C3706e;
import gp.InquiryAttributes;
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

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/c;", "Lvr/h;", "Lcom/withpersona/sdk2/inquiry/internal/network/a;", "Lgp/e;", "attributes", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiryApiHelper", "<init>", "(Lgp/e;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V", "Lnu/h;", "run", "()Lnu/h;", "otherWorker", "", "c", "(Lvr/h;)Z", "b", "Lgp/e;", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "a", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3674c implements InterfaceC12257h<AbstractC3702a> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InquiryAttributes attributes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C3706e inquiryApiHelper;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.c$a */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/c$a;", "", "Lgp/e;", "attributes", "Lcom/withpersona/sdk2/inquiry/internal/c;", "a", "(Lgp/e;)Lcom/withpersona/sdk2/inquiry/internal/c;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C3674c mo18345a(@NotNull InquiryAttributes attributes);
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.c$b */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/internal/network/a;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.CreateInquiryWorker$run$1", m39664f = "CreateInquiryWorker.kt", m39665l = {19, 19}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC9577i<? super AbstractC3702a>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f14736t;

        /* JADX INFO: renamed from: u */
        public int f14737u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f14738v;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            b bVar = C3674c.this.new b(interfaceC9557b);
            bVar.f14738v = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
        
            if (r2.emit(r7, r6) == r1) goto L16;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC9577i interfaceC9577i;
            InterfaceC9577i interfaceC9577i2 = (InterfaceC9577i) this.f14738v;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f14737u;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC9577i = (InterfaceC9577i) this.f14736t;
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
            C3706e c3706e = C3674c.this.inquiryApiHelper;
            InquiryAttributes inquiryAttributes = C3674c.this.attributes;
            this.f14738v = C10350l.m39676a(interfaceC9577i2);
            this.f14736t = interfaceC9577i2;
            this.f14737u = 1;
            obj = c3706e.m18735h(inquiryAttributes, this);
            if (obj != objM38805e) {
                interfaceC9577i = interfaceC9577i2;
            }
            return objM38805e;
            this.f14738v = C10350l.m39676a(interfaceC9577i2);
            this.f14736t = null;
            this.f14737u = 2;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super AbstractC3702a> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C3674c(@NotNull InquiryAttributes attributes, @NotNull C3706e inquiryApiHelper) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(inquiryApiHelper, "inquiryApiHelper");
        this.attributes = attributes;
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
        if (!(otherWorker instanceof C3674c)) {
            return false;
        }
        C3674c c3674c = (C3674c) otherWorker;
        return Intrinsics.m31980c(this.attributes.getTemplateId(), c3674c.attributes.getTemplateId()) && Intrinsics.m31980c(this.attributes.getTemplateVersion(), c3674c.attributes.getTemplateVersion()) && this.attributes.getEnvironment() == c3674c.attributes.getEnvironment();
    }

    @Override // p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<AbstractC3702a> run() {
        return C9579j.m37806w(new b(null));
    }
}
