package p109en;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.squareup.workflow1.p052ui.modal.ModalContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0369d;
import p016an.C0370d0;
import p016an.C0371e;
import p016an.C0372e0;
import p016an.InterfaceC0368c0;
import p016an.ViewEnvironment;
import p088e.C4723p0;
import p088e.InterfaceC4727r0;

/* JADX INFO: renamed from: en.i */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m31665d2 = {"Len/i;", "Lcom/squareup/workflow1/ui/modal/ModalContainer;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View;", "view", "Landroid/app/Dialog;", "g", "(Landroid/view/View;)Landroid/app/Dialog;", "initialModalRendering", "Lan/y;", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "b", "(Ljava/lang/Object;Lan/y;)Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "dialogRef", "", "d", "(Lcom/squareup/workflow1/ui/modal/ModalContainer$a;)V", "e", "a", "wf1-container-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public class C5172i extends ModalContainer<Object> {

    /* JADX INFO: renamed from: en.i$b */
    @Metadata(m31664d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m31665d2 = {"", "b", "()V"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class b extends AbstractC7746m implements Function0<Unit> {

        /* JADX INFO: renamed from: i */
        public static final b f20126i = new b();

        public b() {
            super(0);
        }

        /* JADX INFO: renamed from: b */
        public final void m24046b() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m24046b();
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: en.i$c */
    @Metadata(m31664d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m31665d2 = {"", "b", "()V"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class c extends AbstractC7746m implements Function0<Unit> {

        /* JADX INFO: renamed from: i */
        public static final c f20127i = new c();

        public c() {
            super(0);
        }

        /* JADX INFO: renamed from: b */
        public final void m24047b() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m24047b();
            return Unit.f29331a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5172i(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m24044f(View view, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        C4723p0 c4723p0Mo23043Q;
        Intrinsics.checkNotNullParameter(view, "$view");
        if (i10 != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InterfaceC4727r0 interfaceC4727r0M1406b = C0371e.m1406b(context);
        if (interfaceC4727r0M1406b != null && (c4723p0Mo23043Q = interfaceC4727r0M1406b.mo23043Q()) != null && c4723p0Mo23043Q.getHasEnabledCallbacks()) {
            c4723p0Mo23043Q.m23081i();
        }
        return true;
    }

    @Override // com.squareup.workflow1.p052ui.modal.ModalContainer
    @NotNull
    /* JADX INFO: renamed from: b */
    public final ModalContainer.C3386a<Object> mo16133b(@NotNull Object initialModalRendering, @NotNull ViewEnvironment initialViewEnvironment) {
        Intrinsics.checkNotNullParameter(initialModalRendering, "initialModalRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        C0369d c0369d = new C0369d(initialModalRendering, false, b.f20126i, 2, null);
        InterfaceC0368c0 interfaceC0368c0 = (InterfaceC0368c0) initialViewEnvironment.m1462a(InterfaceC0368c0.INSTANCE);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "this.context");
        final View viewM1401d = C0370d0.m1401d(interfaceC0368c0, c0369d, initialViewEnvironment, context, this, null, 16, null);
        C0372e0.m1415h(viewM1401d);
        Dialog dialogMo24045g = mo24045g(viewM1401d);
        dialogMo24045g.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: en.h
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                return C5172i.m24044f(viewM1401d, dialogInterface, i10, keyEvent);
            }
        });
        return new ModalContainer.C3386a<>(initialModalRendering, initialViewEnvironment, dialogMo24045g, viewM1401d);
    }

    @Override // com.squareup.workflow1.p052ui.modal.ModalContainer
    /* JADX INFO: renamed from: d */
    public void mo16135d(@NotNull ModalContainer.C3386a<Object> dialogRef) {
        Intrinsics.checkNotNullParameter(dialogRef, "dialogRef");
        C0369d c0369d = new C0369d(dialogRef.m16148f(), false, c.f20127i, 2, null);
        Object extra = dialogRef.getExtra();
        if (extra == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        C0372e0.m1414g((View) extra, c0369d, dialogRef.getViewEnvironment());
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public Dialog mo24045g(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Dialog dialog = new Dialog(getContext());
        dialog.setCancelable(false);
        dialog.setContentView(view);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setLayout(-2, -2);
        Window window2 = dialog.getWindow();
        Intrinsics.checkNotNull(window2);
        window2.setBackgroundDrawable(null);
        return dialog;
    }
}
