package p589z;

import androidx.p616lifecycle.AbstractC0940a0;
import androidx.p616lifecycle.C0949d0;
import java.util.Objects;
import p140g0.AbstractC5949w;
import p140g0.C5931r1;
import p296n0.C8756g1;
import p296n0.InterfaceC8804p0;

/* JADX INFO: renamed from: z.z2 */
/* JADX INFO: loaded from: classes.dex */
public class C13668z2 {

    /* JADX INFO: renamed from: a */
    public final C8756g1 f47892a;

    /* JADX INFO: renamed from: b */
    public final C0949d0<AbstractC5949w> f47893b;

    /* JADX INFO: renamed from: z.z2$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f47894a;

        static {
            int[] iArr = new int[InterfaceC8804p0.a.values().length];
            f47894a = iArr;
            try {
                iArr[InterfaceC8804p0.a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47894a[InterfaceC8804p0.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47894a[InterfaceC8804p0.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47894a[InterfaceC8804p0.a.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47894a[InterfaceC8804p0.a.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47894a[InterfaceC8804p0.a.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47894a[InterfaceC8804p0.a.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f47894a[InterfaceC8804p0.a.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public C13668z2(C8756g1 c8756g1) {
        this.f47892a = c8756g1;
        C0949d0<AbstractC5949w> c0949d0 = new C0949d0<>();
        this.f47893b = c0949d0;
        c0949d0.mo4861m(AbstractC5949w.m26672a(AbstractC5949w.b.CLOSED));
    }

    /* JADX INFO: renamed from: a */
    public AbstractC0940a0<AbstractC5949w> m49824a() {
        return this.f47893b;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC5949w m49825b() {
        return this.f47892a.m35109c() ? AbstractC5949w.m26672a(AbstractC5949w.b.OPENING) : AbstractC5949w.m26672a(AbstractC5949w.b.PENDING_OPEN);
    }

    /* JADX INFO: renamed from: c */
    public void m49826c(InterfaceC8804p0.a aVar, AbstractC5949w.a aVar2) {
        AbstractC5949w abstractC5949wM49825b;
        if (aVar2 == null || aVar2.mo26330d() != 8) {
            switch (a.f47894a[aVar.ordinal()]) {
                case 1:
                    abstractC5949wM49825b = m49825b();
                    break;
                case 2:
                    abstractC5949wM49825b = AbstractC5949w.m26673b(AbstractC5949w.b.OPENING, aVar2);
                    break;
                case 3:
                case 4:
                    abstractC5949wM49825b = AbstractC5949w.m26673b(AbstractC5949w.b.OPEN, aVar2);
                    break;
                case 5:
                case 6:
                    abstractC5949wM49825b = AbstractC5949w.m26673b(AbstractC5949w.b.CLOSING, aVar2);
                    break;
                case 7:
                case 8:
                    abstractC5949wM49825b = AbstractC5949w.m26673b(AbstractC5949w.b.CLOSED, aVar2);
                    break;
                default:
                    throw new IllegalStateException("Unknown internal camera state: " + aVar);
            }
        } else {
            abstractC5949wM49825b = AbstractC5949w.m26673b(AbstractC5949w.b.CLOSED, aVar2);
        }
        C5931r1.m26561a("CameraStateMachine", "New public camera state " + abstractC5949wM49825b + " from " + aVar + " and " + aVar2);
        if (Objects.equals(this.f47893b.mo4854f(), abstractC5949wM49825b)) {
            return;
        }
        C5931r1.m26561a("CameraStateMachine", "Publishing new public camera state " + abstractC5949wM49825b);
        this.f47893b.mo4861m(abstractC5949wM49825b);
    }
}
