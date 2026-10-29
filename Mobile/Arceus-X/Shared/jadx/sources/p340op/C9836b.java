package p340op;

import android.app.Dialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.C0590c1;
import androidx.core.view.ViewCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import hu.InterfaceC6567c;
import java.util.Iterator;
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
import p016an.ViewEnvironment;
import p109en.C5172i;
import p109en.InterfaceC5169f;
import p226jq.C7278p0;
import p497vp.C12245h;
import p526wq.C12524g;
import p526wq.C12543z;
import p615zt.InterfaceC14058o;

/* JADX INFO: renamed from: op.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m31665d2 = {"Lop/b;", "Len/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View;", "view", "Landroid/app/Dialog;", "g", "(Landroid/view/View;)Landroid/app/Dialog;", "f", "a", "modal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9836b extends C5172i {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: op.b$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J:\u0010\r\u001a\u00020\f2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u0012\u0012\u000e\b\u0000\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Lop/b$a;", "Lan/a0;", "Lop/c;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "d", "(Lop/c;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "modal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion implements InterfaceC0364a0<C9837c<?, ?>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0373f<C9837c<?, ?>> f35668a;

        /* JADX INFO: renamed from: op.b$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class C14221a extends C7744k implements Function2<InterfaceC5169f<?, ? extends Object>, ViewEnvironment, Unit> {
            public C14221a(Object obj) {
                super(2, obj, C9836b.class, "update", "update(Lcom/squareup/workflow1/ui/modal/HasModals;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            /* JADX INFO: renamed from: d */
            public final void m38722d(InterfaceC5169f<?, ? extends Object> p8, ViewEnvironment p10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                Intrinsics.checkNotNullParameter(p10, "p1");
                ((C9836b) this.receiver).m16134c(p8, p10);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5169f<?, ? extends Object> interfaceC5169f, ViewEnvironment viewEnvironment) {
                m38722d(interfaceC5169f, viewEnvironment);
                return Unit.f29331a;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: op.b.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static final View m38720c(C9837c initialRendering, ViewEnvironment initialEnv, Context contextForNewView, ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialEnv, "initialEnv");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            C9836b c9836b = new C9836b(contextForNewView, null, 0, 0, 14, null);
            c9836b.setId(C9841g.f35676b);
            c9836b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            C0372e0.m1408a(c9836b, initialRendering, initialEnv, new C14221a(c9836b));
            return c9836b;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
        @Override // p016an.InterfaceC0364a0
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public View mo1379a(@NotNull C9837c<?, ?> initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f35668a.mo1379a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // p016an.InterfaceC0364a0
        @NotNull
        public InterfaceC6567c<? super C9837c<?, ?>> getType() {
            return this.f35668a.getType();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
            this.f35668a = new C0373f<>(C7731d0.m32002b(C9837c.class), new InterfaceC14058o() { // from class: op.a
                @Override // p615zt.InterfaceC14058o
                /* JADX INFO: renamed from: e */
                public final Object mo1397e(Object obj, Object obj2, Object obj3, Object obj4) {
                    return C9836b.Companion.m38720c((C9837c) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                }
            });
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
      (r2v0 android.content.Context)
      (wrap android.util.AttributeSet:?: TERNARY null = ((wrap int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r3v0 android.util.AttributeSet))
      (wrap int:?: TERNARY null = ((wrap int:0x0005: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
      (wrap int:?: TERNARY null = ((wrap int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
     A[MD:(android.content.Context, android.util.AttributeSet, int, int):void (m)] (LINE:1) call: op.b.<init>(android.content.Context, android.util.AttributeSet, int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C9836b(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    @Override // p109en.C5172i
    @NotNull
    /* JADX INFO: renamed from: g */
    public Dialog mo24045g(@NotNull View view) {
        Object next;
        Intrinsics.checkNotNullParameter(view, "view");
        Dialog dialog = new Dialog(getContext(), C12245h.f43272b);
        Iterator<T> it = C12543z.m46892d(view).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((View) next).getTag(C9841g.f35675a) instanceof Integer));
        View view2 = (View) next;
        Object tag = view2 != null ? view2.getTag(C9841g.f35675a) : null;
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        dialog.setContentView(view);
        Window window = dialog.getWindow();
        if (window != null) {
            if (num != null) {
                C7278p0.m30321a(window, num.intValue());
            }
            window.setBackgroundDrawable(null);
            window.setLayout(-1, -1);
            C0590c1.m2821b(window, false);
            if (!C12524g.m46875f()) {
                window.setNavigationBarColor(ViewCompat.MEASURED_STATE_MASK);
            }
        }
        return dialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9836b(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
