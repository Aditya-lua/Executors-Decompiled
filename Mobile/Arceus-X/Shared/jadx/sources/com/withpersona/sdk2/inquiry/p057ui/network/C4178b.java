package com.withpersona.sdk2.inquiry.p057ui.network;

import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.network.AddressAutocompleteResponse;
import com.withpersona.sdk2.inquiry.steps.p056ui.network.Meta;
import com.withpersona.sdk2.inquiry.steps.p056ui.network.Suggestion;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import p229jt.C7348o;
import p231jv.C7396x;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p392qr.InterfaceC10703c;
import p499vr.InterfaceC12257h;
import p581ym.InterfaceC13222o;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0012\u001bB)\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00112\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "Lvr/h;", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "triggeringComponent", "addressText", "Lqr/c;", "uiService", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;Lqr/c;)V", "Lnu/h;", "run", "()Lnu/h;", "otherWorker", "", "b", "(Lym/o;)Z", "c", "(Lvr/h;)Z", "Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "d", "e", "Lqr/c;", "a", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4178b implements InterfaceC13222o<b>, InterfaceC12257h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final UiComponent triggeringComponent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String addressText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC10703c uiService;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.b$a */
    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "", "Lqr/c;", "uiService", "<init>", "(Lqr/c;)V", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "triggeringComponent", "addressText", "Lcom/withpersona/sdk2/inquiry/ui/network/b;", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/b;", "Lqr/c;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC10703c uiService;

        public a(@NotNull InterfaceC10703c uiService) {
            Intrinsics.checkNotNullParameter(uiService, "uiService");
            this.uiService = uiService;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C4178b m21642a(@NotNull String sessionToken, @NotNull UiComponent triggeringComponent, @NotNull String addressText) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(triggeringComponent, "triggeringComponent");
            Intrinsics.checkNotNullParameter(addressText, "addressText");
            return new C4178b(sessionToken, triggeringComponent, addressText, this.uiService, null);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.b$b */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b$b;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.b$b$a */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.b$b$b, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b$b$b;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;", "results", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14155b extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final List<Suggestion> results;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14155b(@NotNull List<Suggestion> results) {
                super(null);
                Intrinsics.checkNotNullParameter(results, "results");
                this.results = results;
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final List<Suggestion> m21643a() {
                return this.results;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.ui.network.b.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.b$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.network.UiAddressAutocompleteWorker$run$1", m39664f = "UiAddressAutocompleteWorker.kt", m39665l = {20, 29, 31}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC9577i<? super b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f17871t;

        /* JADX INFO: renamed from: u */
        public int f17872u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f17873v;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            c cVar = C4178b.this.new c(interfaceC9557b);
            cVar.f17873v = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
        
            if (r0.emit(r2, r9) == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
        
            if (r0.emit(r2, r9) == r1) goto L29;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List<Suggestion> listM31892k;
            Meta meta;
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f17873v;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f17872u;
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
            InterfaceC10703c interfaceC10703c = C4178b.this.uiService;
            String str = C4178b.this.sessionToken;
            AddressAutocompleteRequest addressAutocompleteRequestM21528a = AddressAutocompleteRequest.INSTANCE.m21528a(C4178b.this.triggeringComponent, C4178b.this.addressText);
            this.f17873v = interfaceC9577i;
            this.f17872u = 1;
            obj = interfaceC10703c.m40798d(str, addressAutocompleteRequestM21528a, this);
            if (obj != objM38805e) {
            }
            return objM38805e;
            C7396x c7396x = (C7396x) obj;
            if (c7396x.m30657g()) {
                AddressAutocompleteResponse addressAutocompleteResponse = (AddressAutocompleteResponse) c7396x.m30653a();
                if (addressAutocompleteResponse == null || (meta = addressAutocompleteResponse.getMeta()) == null || (listM31892k = meta.m20911a()) == null) {
                    listM31892k = C7699p.m31892k();
                }
                b.C14155b c14155b = new b.C14155b(listM31892k);
                this.f17873v = C10350l.m39676a(interfaceC9577i);
                this.f17871t = C10350l.m39676a(c7396x);
                this.f17872u = 3;
            } else {
                b.a aVar = new b.a(NetworkUtilsKt.toErrorInfo(c7396x));
                this.f17873v = C10350l.m39676a(interfaceC9577i);
                this.f17871t = C10350l.m39676a(c7396x);
                this.f17872u = 2;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super b> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
      (r1v0 java.lang.String)
      (r2v0 com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent)
      (r3v0 java.lang.String)
      (r4v0 qr.c)
     A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent, java.lang.String, qr.c):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.ui.network.b.<init>(java.lang.String, com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent, java.lang.String, qr.c):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4178b(String str, UiComponent uiComponent, String str2, InterfaceC10703c interfaceC10703c, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uiComponent, str2, interfaceC10703c);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p581ym.InterfaceC13222o
    /* JADX INFO: renamed from: b */
    public boolean mo7573b(@NotNull InterfaceC13222o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof C4178b) && Intrinsics.m31980c(this.addressText, ((C4178b) otherWorker).addressText);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof C4178b) && Intrinsics.m31980c(this.addressText, ((C4178b) otherWorker).addressText);
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<b> run() {
        return C9579j.m37806w(new c(null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4178b(String str, UiComponent uiComponent, String str2, InterfaceC10703c interfaceC10703c) {
        this.sessionToken = str;
        this.triggeringComponent = uiComponent;
        this.addressText = str2;
        this.uiService = interfaceC10703c;
    }
}
