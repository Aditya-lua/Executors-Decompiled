package p130fh;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.DialogInterfaceC0408a;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import sg.C11347q0;

/* JADX INFO: renamed from: fh.f */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m31665d2 = {"Lfh/f;", "Lfh/i;", "Landroid/app/Activity;", "activity", "Lkotlin/Function0;", "", "message", "Lkotlin/Function1;", "Lfh/i$a;", "", "shouldShowDialog", "", "startUpgrade", "<init>", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", Payload.TYPE, "a", "(Lfh/i$a;)V", "Landroid/app/Activity;", "b", "Lkotlin/jvm/functions/Function0;", "c", "Lkotlin/jvm/functions/Function1;", "d", "Landroidx/appcompat/app/a;", "e", "Landroidx/appcompat/app/a;", "dialog", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5605f implements InterfaceC5608i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Activity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function0<String> message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function1<InterfaceC5608i.a, Boolean> shouldShowDialog;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> startUpgrade;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public DialogInterfaceC0408a dialog;

    /* JADX INFO: renamed from: fh.f$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21479a;

        static {
            int[] iArr = new int[InterfaceC5608i.a.values().length];
            try {
                iArr[InterfaceC5608i.a.Optional.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC5608i.a.Required.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC5608i.a.NewApp.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21479a = iArr;
        }
    }

    /* JADX INFO: renamed from: fh.f$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            C5605f.this.startUpgrade.invoke();
            DialogInterfaceC0408a dialogInterfaceC0408a = C5605f.this.dialog;
            if (dialogInterfaceC0408a != null) {
                dialogInterfaceC0408a.dismiss();
            }
            C5605f.this.dialog = null;
        }
    }

    /* JADX INFO: renamed from: fh.f$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            C5605f.this.startUpgrade.invoke();
            C5605f.this.mo25340a(InterfaceC5608i.a.Required);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super fh.i$a, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5605f(@NotNull Activity activity, @NotNull Function0<String> message, @NotNull Function1<? super InterfaceC5608i.a, Boolean> shouldShowDialog, @NotNull Function0<Unit> startUpgrade) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(shouldShowDialog, "shouldShowDialog");
        Intrinsics.checkNotNullParameter(startUpgrade, "startUpgrade");
        this.activity = activity;
        this.message = message;
        this.shouldShowDialog = shouldShowDialog;
        this.startUpgrade = startUpgrade;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m25335d(InterfaceC5608i.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static final void m25339h(C5605f c5605f, InterfaceC5608i.a aVar) {
        DialogInterfaceC0408a dialogInterfaceC0408aM1534r;
        DialogInterfaceC0408a dialogInterfaceC0408a = c5605f.dialog;
        if (dialogInterfaceC0408a != null) {
            C5607h.m25344d(dialogInterfaceC0408a);
        }
        if (c5605f.shouldShowDialog.invoke(aVar).booleanValue()) {
            int i10 = a.f21479a[aVar.ordinal()];
            if (i10 == 1) {
                Activity activity = c5605f.activity;
                dialogInterfaceC0408aM1534r = new DialogInterfaceC0408a.a(activity).m1532p(C11347q0.f39989m).m1524h(c5605f.message.invoke()).m1529m(C11347q0.f39980j, c5605f.new b()).m1520d(false).m1534r();
                Intrinsics.checkNotNullExpressionValue(dialogInterfaceC0408aM1534r, "show(...)");
            } else if (i10 == 2) {
                Activity activity2 = c5605f.activity;
                dialogInterfaceC0408aM1534r = new DialogInterfaceC0408a.a(activity2).m1532p(C11347q0.f39989m).m1524h(c5605f.message.invoke()).m1529m(C11347q0.f39980j, c5605f.new c()).m1520d(false).m1534r();
                Intrinsics.checkNotNullExpressionValue(dialogInterfaceC0408aM1534r, "show(...)");
            } else {
                if (i10 != 3) {
                    throw new C7345l();
                }
                dialogInterfaceC0408aM1534r = C5607h.m25345e(c5605f.activity);
            }
        } else {
            c5605f.startUpgrade.invoke();
            Unit unit = Unit.f29331a;
            dialogInterfaceC0408aM1534r = null;
        }
        c5605f.dialog = dialogInterfaceC0408aM1534r;
    }

    @Override // p130fh.InterfaceC5608i
    /* JADX INFO: renamed from: a */
    public void mo25340a(@NotNull final InterfaceC5608i.a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.activity.runOnUiThread(new Runnable() { // from class: fh.e
            @Override // java.lang.Runnable
            public final void run() {
                C5605f.m25339h(this.f21472a, type);
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
      (r1v0 android.app.Activity)
      (r2v0 kotlin.jvm.functions.Function0)
      (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap kotlin.jvm.functions.Function1:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:6) call: fh.d.<init>():void type: CONSTRUCTOR) : (r3v0 kotlin.jvm.functions.Function1))
      (r4v0 kotlin.jvm.functions.Function0)
     A[MD:(android.app.Activity, kotlin.jvm.functions.Function0<java.lang.String>, kotlin.jvm.functions.Function1<? super fh.i$a, java.lang.Boolean>, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:7) call: fh.f.<init>(android.app.Activity, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C5605f(Activity activity, Function0 function0, Function1 function1, Function0 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, function0, (i10 & 4) != 0 ? new Function1() { // from class: fh.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C5605f.m25335d((InterfaceC5608i.a) obj));
            }
        } : function1, function2);
    }
}
