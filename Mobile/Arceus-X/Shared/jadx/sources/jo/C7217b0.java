package jo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import hu.InterfaceC6567c;
import io.EnumC6852d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0372e0;
import p016an.C0373f;
import p016an.InterfaceC0364a0;
import p016an.InterfaceC0382k;
import p016an.ViewEnvironment;
import p229jt.C7345l;
import p523wn.C12495a;
import p523wn.EnumC12498d;
import p615zt.InterfaceC14058o;

/* JADX INFO: renamed from: jo.b0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0010"}, m31665d2 = {"Ljo/b0;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;", "Ljo/c0;", "viewController", "<init>", "(Ljo/c0;)V", "rendering", "Lan/y;", "viewEnvironment", "", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;Lan/y;)V", "Ljo/c0;", "c", "a", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7217b0 implements InterfaceC0382k<Screen.C3526a> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7219c0 viewController;

    /* JADX INFO: renamed from: jo.b0$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Ljo/b0$a;", "Lan/a0;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "d", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion implements InterfaceC0364a0<Screen.C3526a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0373f<Screen.C3526a> f27927a;

        /* JADX INFO: renamed from: jo.b0$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class C14193a extends C7744k implements Function2<Screen.C3526a, ViewEnvironment, Unit> {
            public C14193a(Object obj) {
                super(2, obj, C7217b0.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$AutoClassificationSelectCountryAndIdClassScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            /* JADX INFO: renamed from: d */
            public final void m30150d(Screen.C3526a p8, ViewEnvironment p10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                Intrinsics.checkNotNullParameter(p10, "p1");
                ((C7217b0) this.receiver).mo1442a(p8, p10);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Screen.C3526a c3526a, ViewEnvironment viewEnvironment) {
                m30150d(c3526a, viewEnvironment);
                return Unit.f29331a;
            }
        }

        /* JADX INFO: renamed from: jo.b0$a$b */
        @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"jo/b0$a$b", "Ljo/c0$a;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Ljo/c0;", "a", "(Landroid/content/Context;Landroid/view/ViewGroup;)Ljo/c0;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class b implements InterfaceC7219c0.a {
            @Override // jo.InterfaceC7219c0.a
            /* JADX INFO: renamed from: a */
            public InterfaceC7219c0 mo17794a(Context context, ViewGroup container) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new C7241y(context, container);
            }
        }

        /* JADX INFO: renamed from: jo.b0$a$c */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class c {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f27928a;

            static {
                int[] iArr = new int[EnumC6852d.values().length];
                try {
                    iArr[EnumC6852d.V0.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC6852d.K0000.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f27928a = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: jo.b0.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static final View m30148c(Screen.C3526a initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
            EnumC12498d enumC12498d;
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(context, "context");
            C12495a.a aVarM46814c = C12495a.f44667a.m46814c(InterfaceC7219c0.a.class, new b());
            int i10 = c.f27928a[initialRendering.getDesignVersion().ordinal()];
            if (i10 == 1) {
                enumC12498d = EnumC12498d.DefaultSelectCountryAndIdClass;
            } else {
                if (i10 != 2) {
                    throw new C7345l();
                }
                enumC12498d = EnumC12498d.K0000SelectCountryAndIdClass;
            }
            InterfaceC7219c0 interfaceC7219c0Mo17794a = ((InterfaceC7219c0.a) aVarM46814c.m46815a(enumC12498d)).mo17794a(context, viewGroup);
            C0372e0.m1408a(interfaceC7219c0Mo17794a.getRoot(), initialRendering, initialViewEnvironment, new C14193a(new C7217b0(interfaceC7219c0Mo17794a)));
            return interfaceC7219c0Mo17794a.getRoot();
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
        @Override // p016an.InterfaceC0364a0
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public View mo1379a(@NotNull Screen.C3526a initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f27927a.mo1379a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // p016an.InterfaceC0364a0
        @NotNull
        public InterfaceC6567c<? super Screen.C3526a> getType() {
            return this.f27927a.getType();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
            this.f27927a = new C0373f<>(C7731d0.m32002b(Screen.C3526a.class), new InterfaceC14058o() { // from class: jo.a0
                @Override // p615zt.InterfaceC14058o
                /* JADX INFO: renamed from: e */
                public final Object mo1397e(Object obj, Object obj2, Object obj3, Object obj4) {
                    return C7217b0.Companion.m30148c((Screen.C3526a) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                }
            });
        }
    }

    public C7217b0(@NotNull InterfaceC7219c0 viewController) {
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        this.viewController = viewController;
        viewController.mo30151a();
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;)V */
    @Override // p016an.InterfaceC0382k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo1442a(@NotNull Screen.C3526a rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        this.viewController.mo30152b(viewEnvironment, rendering);
    }
}
