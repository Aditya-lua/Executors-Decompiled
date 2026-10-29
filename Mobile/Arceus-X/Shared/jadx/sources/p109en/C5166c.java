package p109en;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.app.DialogInterfaceC0408a;
import com.appsflyer.sdk_base.referrer.Payload;
import com.squareup.workflow1.p052ui.modal.ModalContainer;
import hu.InterfaceC6567c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7746m;
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
import p081dn.C4646a;
import p229jt.C7345l;
import p615zt.InterfaceC14058o;

/* JADX INFO: renamed from: en.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0007*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m31665d2 = {"Len/c;", "Lcom/squareup/workflow1/ui/modal/ModalContainer;", "Len/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "dialogThemeResId", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;III)V", "initialModalRendering", "Lan/y;", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "g", "(Len/e;Lan/y;)Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "dialogRef", "", "d", "(Lcom/squareup/workflow1/ui/modal/ModalContainer$a;)V", "Len/e$a;", "h", "(Len/e$a;)I", "e", "I", "f", "a", "b", "wf1-container-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C5166c extends ModalContainer<AlertScreen> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int dialogThemeResId;

    /* JADX INFO: renamed from: en.c$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J8\u0010\r\u001a\u00020\f2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Len/c$b;", "Lan/a0;", "Len/d;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Len/d;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "wf1-container-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class Companion implements InterfaceC0364a0<AlertContainerScreen<?>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ a f20109a;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: en.c.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
        @Override // p016an.InterfaceC0364a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View mo1379a(@NotNull AlertContainerScreen<?> initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f20109a.mo1379a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // p016an.InterfaceC0364a0
        @NotNull
        public InterfaceC6567c<? super AlertContainerScreen<?>> getType() {
            return this.f20109a.getType();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
            this.f20109a = new a(0, 1, null);
        }
    }

    /* JADX INFO: renamed from: en.c$c */
    @Metadata(m31666k = 3, m31667mv = {1, 6, 0}, m31669xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f20110a;

        static {
            int[] iArr = new int[AlertScreen.a.values().length];
            iArr[AlertScreen.a.POSITIVE.ordinal()] = 1;
            iArr[AlertScreen.a.NEGATIVE.ordinal()] = 2;
            iArr[AlertScreen.a.NEUTRAL.ordinal()] = 3;
            f20110a = iArr;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
      (r7v0 android.content.Context)
      (wrap android.util.AttributeSet:0x0005: TERNARY null = ((wrap int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r8v0 android.util.AttributeSet))
      (wrap int:?: TERNARY null = ((wrap int:0x0006: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
      (wrap int:?: TERNARY null = ((wrap int:0x000e: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
      (wrap int:?: TERNARY null = ((wrap int:0x0015: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
     A[MD:(android.content.Context, android.util.AttributeSet, int, int, int):void (m)] (LINE:1) call: en.c.<init>(android.content.Context, android.util.AttributeSet, int, int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5166c(Context context, AttributeSet attributeSet, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i10, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) != 0 ? 0 : i12);
    }

    /* JADX INFO: renamed from: i */
    public static final void m24025i(AlertScreen rendering, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(rendering, "$rendering");
        rendering.m24038d().invoke(AlertScreen.b.C14162b.f20123a);
    }

    /* JADX INFO: renamed from: j */
    public static final void m24026j(AlertScreen rendering, AlertScreen.a button, DialogInterface dialogInterface, int i10) {
        Intrinsics.checkNotNullParameter(rendering, "$rendering");
        Intrinsics.checkNotNullParameter(button, "$button");
        rendering.m24038d().invoke(new AlertScreen.b.ButtonClicked(button));
    }

    @Override // com.squareup.workflow1.p052ui.modal.ModalContainer
    /* JADX INFO: renamed from: d */
    public void mo16135d(@NotNull ModalContainer.C3386a<AlertScreen> dialogRef) {
        Unit unit;
        Button buttonM1511p;
        Intrinsics.checkNotNullParameter(dialogRef, "dialogRef");
        DialogInterfaceC0408a dialogInterfaceC0408a = (DialogInterfaceC0408a) dialogRef.getDialog();
        final AlertScreen alertScreenM16148f = dialogRef.m16148f();
        int i10 = 0;
        if (alertScreenM16148f.getCancelable()) {
            dialogInterfaceC0408a.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: en.a
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C5166c.m24025i(alertScreenM16148f, dialogInterface);
                }
            });
            dialogInterfaceC0408a.setCancelable(true);
        } else {
            dialogInterfaceC0408a.setCancelable(false);
        }
        AlertScreen.a[] aVarArrValues = AlertScreen.a.values();
        int length = aVarArrValues.length;
        while (i10 < length) {
            final AlertScreen.a aVar = aVarArrValues[i10];
            i10++;
            String str = alertScreenM16148f.m24035a().get(aVar);
            if (str == null) {
                unit = null;
            } else {
                dialogInterfaceC0408a.m1513t(m24028h(aVar), str, new DialogInterface.OnClickListener() { // from class: en.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        C5166c.m24026j(alertScreenM16148f, aVar, dialogInterface, i11);
                    }
                });
                unit = Unit.f29331a;
            }
            if (unit == null && (buttonM1511p = dialogInterfaceC0408a.m1511p(m24028h(aVar))) != null) {
                buttonM1511p.setVisibility(4);
            }
        }
        dialogInterfaceC0408a.m1514u(alertScreenM16148f.getMessage());
        dialogInterfaceC0408a.setTitle(alertScreenM16148f.getTitle());
    }

    /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;Lan/y;)Lcom/squareup/workflow1/ui/modal/ModalContainer$a; */
    @Override // com.squareup.workflow1.p052ui.modal.ModalContainer
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ModalContainer.C3386a<AlertScreen> mo16133b(@NotNull AlertScreen initialModalRendering, @NotNull ViewEnvironment initialViewEnvironment) {
        Intrinsics.checkNotNullParameter(initialModalRendering, "initialModalRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        DialogInterfaceC0408a dialogInterfaceC0408aM1517a = new DialogInterfaceC0408a.a(getContext(), this.dialogThemeResId).m1517a();
        Intrinsics.checkNotNullExpressionValue(dialogInterfaceC0408aM1517a, "Builder(context, dialogThemeResId)\n      .create()");
        ModalContainer.C3386a<AlertScreen> c3386a = new ModalContainer.C3386a<>(initialModalRendering, initialViewEnvironment, dialogInterfaceC0408aM1517a, null, 8, null);
        mo16135d(c3386a);
        return c3386a;
    }

    /* JADX INFO: renamed from: h */
    public final int m24028h(AlertScreen.a aVar) {
        int i10 = c.f20110a[aVar.ordinal()];
        if (i10 == 1) {
            return -1;
        }
        if (i10 == 2) {
            return -2;
        }
        if (i10 == 3) {
            return -3;
        }
        throw new C7345l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5166c(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11, int i12) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dialogThemeResId = i12;
    }

    /* JADX INFO: renamed from: en.c$a */
    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J8\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m31665d2 = {"Len/c$a;", "Lan/a0;", "Len/d;", "", "dialogThemeResId", "<init>", "(I)V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Len/d;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "a", "I", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "wf1-container-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class a implements InterfaceC0364a0<AlertContainerScreen<?>> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int dialogThemeResId;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0373f<AlertContainerScreen<?>> f20107b;

        /* JADX INFO: renamed from: en.c$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, m31665d2 = {"Len/d;", "initialRendering", "Lan/y;", "initialEnv", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "<anonymous parameter 3>", "Landroid/view/View;", "a", "(Len/d;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;"}, m31666k = 3, m31667mv = {1, 6, 0})
        public static final class C14160a extends AbstractC7746m implements InterfaceC14058o<AlertContainerScreen<?>, ViewEnvironment, Context, ViewGroup, View> {

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ int f20108i;

            /* JADX INFO: renamed from: en.c$a$a$a, reason: collision with other inner class name */
            @Metadata(m31666k = 3, m31667mv = {1, 6, 0}, m31669xi = 48)
            public /* synthetic */ class C14161a extends C7744k implements Function2<InterfaceC5169f<?, ? extends AlertScreen>, ViewEnvironment, Unit> {
                public C14161a(Object obj) {
                    super(2, obj, C5166c.class, "update", "update(Lcom/squareup/workflow1/ui/modal/HasModals;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
                }

                /* JADX INFO: renamed from: d */
                public final void m24031d(@NotNull InterfaceC5169f<?, AlertScreen> p8, @NotNull ViewEnvironment p10) {
                    Intrinsics.checkNotNullParameter(p8, "p0");
                    Intrinsics.checkNotNullParameter(p10, "p1");
                    ((C5166c) this.receiver).m16134c(p8, p10);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5169f<?, ? extends AlertScreen> interfaceC5169f, ViewEnvironment viewEnvironment) {
                    m24031d(interfaceC5169f, viewEnvironment);
                    return Unit.f29331a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14160a(int i10) {
                super(4);
                this.f20108i = i10;
            }

            /* JADX DEBUG: Method merged with bridge method: e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // p615zt.InterfaceC14058o
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final View mo1397e(@NotNull AlertContainerScreen<?> initialRendering, @NotNull ViewEnvironment initialEnv, @NotNull Context context, @Nullable ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
                Intrinsics.checkNotNullParameter(initialEnv, "initialEnv");
                Intrinsics.checkNotNullParameter(context, "context");
                C5166c c5166c = new C5166c(context, null, 0, 0, this.f20108i, 14, null);
                c5166c.setId(C4646a.f19036b);
                c5166c.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                C0372e0.m1408a(c5166c, initialRendering, initialEnv, new C14161a(c5166c));
                return c5166c;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(int i10) {
            this.dialogThemeResId = i10;
            this.f20107b = new C0373f<>(C7731d0.m32002b(AlertContainerScreen.class), new C14160a(i10));
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
        @Override // p016an.InterfaceC0364a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View mo1379a(@NotNull AlertContainerScreen<?> initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f20107b.mo1379a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // p016an.InterfaceC0364a0
        @NotNull
        public InterfaceC6567c<? super AlertContainerScreen<?>> getType() {
            return this.f20107b.getType();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
          (wrap int:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
         A[MD:(int):void (m)] (LINE:6) call: en.c.a.<init>(int):void type: THIS */
        public /* synthetic */ a(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0 : i10);
        }
    }
}
