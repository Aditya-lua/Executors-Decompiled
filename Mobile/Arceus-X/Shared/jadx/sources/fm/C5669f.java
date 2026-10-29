package fm;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import p092e3.AbstractC4773m;
import p092e3.C4766i0;
import p092e3.C4770k0;
import p092e3.C4772l0;
import p092e3.InterfaceC4777o;
import p117f3.C5338l;
import p167hc.C6354c;
import p167hc.C6355d;
import p203j.ActivityC6992b;
import p229jt.C7342i;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.InterfaceC7341h;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pl.C10292a;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: fm.f */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m31665d2 = {"Lfm/f;", "", "Lj/b;", "activity", "<init>", "(Lj/b;)V", "", "nonce", "Lnu/h;", "Lfm/g;", "c", "(Ljava/lang/String;)Lnu/h;", "a", "Lj/b;", "e", "()Lj/b;", "Le3/o;", "b", "Ljt/h;", "f", "()Le3/o;", "credentialManager", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5669f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ActivityC6992b activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h credentialManager;

    /* JADX INFO: renamed from: fm.f$a */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lfm/g;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.universalapp.externalidentity.GoogleSignInManager$acquireGoogleCredentials$1", m39664f = "GoogleSignInManager.kt", m39665l = {24, 33, 53}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class a extends AbstractC10351m implements Function2<InterfaceC9577i<? super AbstractC5670g>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ String f21756B;

        /* JADX INFO: renamed from: t */
        public Object f21757t;

        /* JADX INFO: renamed from: u */
        public Object f21758u;

        /* JADX INFO: renamed from: v */
        public Object f21759v;

        /* JADX INFO: renamed from: w */
        public Object f21760w;

        /* JADX INFO: renamed from: x */
        public int f21761x;

        /* JADX INFO: renamed from: y */
        public int f21762y;

        /* JADX INFO: renamed from: z */
        public /* synthetic */ Object f21763z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f21756B = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = C5669f.this.new a(this.f21756B, interfaceC9557b);
            aVar.f21763z = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00db A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:11:0x0036, B:23:0x00b1, B:25:0x00bb, B:27:0x00c7, B:29:0x00e2, B:28:0x00db, B:20:0x0057), top: B:44:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:35:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:37:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:38:0x00ff  */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x012c, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L41;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM30460b;
            Throwable thM30463e;
            AbstractC4773m credential;
            Object error;
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f21763z;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f21762y;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    AbstractC5670g.c cVar = AbstractC5670g.c.f21766a;
                    this.f21763z = interfaceC9577i;
                    this.f21762y = 1;
                    if (interfaceC9577i.emit(cVar, this) != objM38805e) {
                    }
                    return objM38805e;
                }
                if (i10 == 1) {
                    C7348o.m30470b(obj);
                } else if (i10 == 2) {
                    C7348o.m30470b(obj);
                    credential = ((C4772l0) obj).getCredential();
                    if ((credential instanceof C4766i0) || !Intrinsics.m31980c(credential.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
                        error = new AbstractC5670g.Error("UnexpectedCredentialType");
                    } else {
                        error = new AbstractC5670g.Success(C6355d.INSTANCE.m27682a(credential.getData()).getF24102e());
                    }
                    objM30460b = C7347n.m30460b(error);
                    thM30463e = C7347n.m30463e(objM30460b);
                    if (thM30463e != null) {
                        if (thM30463e instanceof C5338l) {
                            objM30460b = AbstractC5670g.a.f21764a;
                        } else {
                            String simpleName = thM30463e.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                            objM30460b = new AbstractC5670g.Error(simpleName);
                        }
                    }
                    AbstractC5670g abstractC5670g = (AbstractC5670g) objM30460b;
                    this.f21763z = C10350l.m39676a(interfaceC9577i);
                    this.f21757t = C10350l.m39676a(abstractC5670g);
                    this.f21758u = null;
                    this.f21759v = null;
                    this.f21760w = null;
                    this.f21762y = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
                C5669f c5669f = C5669f.this;
                String str = this.f21756B;
                C7347n.Companion companion = C7347n.INSTANCE;
                String string = c5669f.getActivity().getString(C10292a.f36999a);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                C6354c c6354cM27668a = new C6354c.a(string).m27669b(str).m27668a();
                C4770k0 c4770k0M23194b = new C4770k0.a().m23193a(c6354cM27668a).m23194b();
                InterfaceC4777o interfaceC4777oM25737f = c5669f.m25737f();
                ActivityC6992b activity = c5669f.getActivity();
                this.f21763z = interfaceC9577i;
                this.f21757t = C10350l.m39676a(interfaceC9577i);
                this.f21758u = C10350l.m39676a(c6354cM27668a);
                this.f21759v = C10350l.m39676a(string);
                this.f21760w = C10350l.m39676a(c4770k0M23194b);
                this.f21761x = 0;
                this.f21762y = 2;
                obj = interfaceC4777oM25737f.m23208b(activity, c4770k0M23194b, this);
                if (obj != objM38805e) {
                    credential = ((C4772l0) obj).getCredential();
                    if (credential instanceof C4766i0) {
                        error = new AbstractC5670g.Error("UnexpectedCredentialType");
                    } else {
                        error = new AbstractC5670g.Error("UnexpectedCredentialType");
                    }
                    objM30460b = C7347n.m30460b(error);
                    thM30463e = C7347n.m30463e(objM30460b);
                    if (thM30463e != null) {
                        if (thM30463e instanceof C5338l) {
                            objM30460b = AbstractC5670g.a.f21764a;
                        } else {
                            String simpleName2 = thM30463e.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                            objM30460b = new AbstractC5670g.Error(simpleName2);
                        }
                    }
                    AbstractC5670g abstractC5670g2 = (AbstractC5670g) objM30460b;
                    this.f21763z = C10350l.m39676a(interfaceC9577i);
                    this.f21757t = C10350l.m39676a(abstractC5670g2);
                    this.f21758u = null;
                    this.f21759v = null;
                    this.f21760w = null;
                    this.f21762y = 3;
                }
            } catch (Throwable th2) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
            }
            return objM38805e;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super AbstractC5670g> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C5669f(@NotNull ActivityC6992b activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.credentialManager = C7342i.m30456b(new Function0() { // from class: fm.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5669f.m25734d(this.f21752a);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC4777o m25734d(C5669f c5669f) {
        return InterfaceC4777o.INSTANCE.m23210a(c5669f.activity);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC9575h<AbstractC5670g> m25735c(@NotNull String nonce) {
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        return C9579j.m37806w(new a(nonce, null));
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final ActivityC6992b getActivity() {
        return this.activity;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC4777o m25737f() {
        return (InterfaceC4777o) this.credentialManager.getValue();
    }
}
