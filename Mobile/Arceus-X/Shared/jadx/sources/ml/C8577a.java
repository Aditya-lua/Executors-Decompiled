package ml;

import android.R;
import android.app.Activity;
import android.content.DialogInterface;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.DialogInterfaceC0408a;
import androidx.core.view.inputmethod.EditorInfoCompat;
import backtraceio.library.services.BacktraceMetrics;
import com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback;
import com.roblox.protocols.systemdialogplatforminterface.generated.SystemDialogContext;
import com.roblox.protocols.systemdialogplatforminterface.generated.SystemDialogRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6124q;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: ml.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001dR\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, m31665d2 = {"Lml/a;", "", "", "id", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;", "callback", "<init>", "(JLcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;)V", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;", "request", "Landroid/app/Activity;", "activity", "", "a", "(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;Landroid/app/Activity;)V", "c", "(Lnt/b;)Ljava/lang/Object;", "b", "()V", "J", "e", "()J", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;", "d", "()Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;", "", "Ljava/lang/String;", "TAG", "", "I", "MAX_PROGRESS_VALUE", "PROGRESS_DELAY", "Lku/p0;", "f", "Lku/p0;", "DIALOG_SCOPE", "Landroidx/appcompat/app/a;", "g", "Landroidx/appcompat/app/a;", "dialog", "Landroid/widget/ProgressBar;", "h", "Landroid/widget/ProgressBar;", "progressBar", "i", "progressDeltaInSeconds", "Lku/d2;", "j", "Lku/d2;", "timerJob", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8577a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ISystemDialogCallback callback;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int MAX_PROGRESS_VALUE;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final long PROGRESS_DELAY;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 DIALOG_SCOPE;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public DialogInterfaceC0408a dialog;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public ProgressBar progressBar;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int progressDeltaInSeconds;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public InterfaceC7850d2 timerJob;

    /* JADX INFO: renamed from: ml.a$a */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"ml/a$a", "Landroid/content/DialogInterface$OnClickListener;", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onClick", "(Landroid/content/DialogInterface;I)V", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            ISystemDialogCallback callback = C8577a.this.getCallback();
            if (callback != null) {
                callback.onOkClicked(new SystemDialogContext(C8577a.this.getId(), false));
            }
            C8577a.this.m34600b();
        }
    }

    /* JADX INFO: renamed from: ml.a$b */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"ml/a$b", "Landroid/content/DialogInterface$OnClickListener;", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onClick", "(Landroid/content/DialogInterface;I)V", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            ISystemDialogCallback callback = C8577a.this.getCallback();
            if (callback != null) {
                callback.onCancelClicked(new SystemDialogContext(C8577a.this.getId(), false));
            }
            C8577a.this.m34600b();
        }
    }

    /* JADX INFO: renamed from: ml.a$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.protocols.systemdialog.BlockingDialog$create$3", m39664f = "BlockingDialog.kt", m39665l = {91}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f31520t;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C8577a.this.new c(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f31520t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C8577a c8577a = C8577a.this;
                this.f31520t = 1;
                if (c8577a.m34601c(this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: ml.a$d */
    @InterfaceC10344f(m39663c = "com.roblox.protocols.systemdialog.BlockingDialog", m39664f = "BlockingDialog.kt", m39665l = {100}, m39666m = "executeTimer", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public int f31522t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f31523u;

        /* JADX INFO: renamed from: w */
        public int f31525w;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31523u = obj;
            this.f31525w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C8577a.this.m34601c(this);
        }
    }

    public C8577a(long j10, @NotNull ISystemDialogCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.id = j10;
        this.callback = callback;
        this.TAG = "rbx.BlockingDialog";
        this.MAX_PROGRESS_VALUE = BacktraceMetrics.defaultTimeBetweenRetriesMs;
        this.PROGRESS_DELAY = 1000L;
        this.DIALOG_SCOPE = C7910q0.m32885a(C7864g1.m32643a());
        this.progressDeltaInSeconds = BacktraceMetrics.defaultTimeBetweenRetriesMs;
    }

    /* JADX INFO: renamed from: a */
    public final void m34599a(@NotNull SystemDialogRequest request, @NotNull Activity activity) {
        LinearLayout linearLayout;
        DialogInterfaceC0408a dialogInterfaceC0408a;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(activity, "activity");
        DialogInterfaceC0408a.a aVar = new DialogInterfaceC0408a.a(activity);
        aVar.m1533q(request.getTitle());
        aVar.m1524h(request.getMessage());
        aVar.m1520d(false);
        String okText = request.getOkText();
        Intrinsics.checkNotNullExpressionValue(okText, "getOkText(...)");
        if (okText.length() != 0) {
            aVar.m1530n(request.getOkText(), new a());
        }
        String cancelText = request.getCancelText();
        Intrinsics.checkNotNullExpressionValue(cancelText, "getCancelText(...)");
        if (cancelText.length() != 0) {
            aVar.m1530n(request.getCancelText(), new b());
        }
        if (request.getShowProgressBar()) {
            this.progressDeltaInSeconds = request.getBlockTimeInSeconds() > 0 ? (int) (((long) this.MAX_PROGRESS_VALUE) / request.getBlockTimeInSeconds()) : this.MAX_PROGRESS_VALUE;
            ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
            this.progressBar = progressBar;
            progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            ProgressBar progressBar2 = this.progressBar;
            if (progressBar2 != null) {
                progressBar2.setMin(0);
            }
            ProgressBar progressBar3 = this.progressBar;
            if (progressBar3 != null) {
                progressBar3.setMax(this.MAX_PROGRESS_VALUE);
            }
            ProgressBar progressBar4 = this.progressBar;
            if (progressBar4 != null) {
                progressBar4.setProgress(0);
            }
            linearLayout = new LinearLayout(activity);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            linearLayout.addView(this.progressBar);
        } else {
            linearLayout = null;
        }
        DialogInterfaceC0408a dialogInterfaceC0408aM1517a = aVar.m1517a();
        this.dialog = dialogInterfaceC0408aM1517a;
        if (dialogInterfaceC0408aM1517a != null) {
            dialogInterfaceC0408aM1517a.setCanceledOnTouchOutside(false);
        }
        if (linearLayout != null && (dialogInterfaceC0408a = this.dialog) != null) {
            dialogInterfaceC0408a.m1515v(linearLayout);
        }
        DialogInterfaceC0408a dialogInterfaceC0408a2 = this.dialog;
        if (dialogInterfaceC0408a2 != null) {
            dialogInterfaceC0408a2.show();
        }
        ISystemDialogCallback iSystemDialogCallback = this.callback;
        if (iSystemDialogCallback != null) {
            iSystemDialogCallback.onOpened(new SystemDialogContext(this.id, false));
        }
        this.timerJob = this.progressBar != null ? C7882k.m32780d(this.DIALOG_SCOPE, null, null, new c(null), 3, null) : null;
    }

    /* JADX INFO: renamed from: b */
    public final void m34600b() {
        long j10 = this.id;
        if (j10 < 0) {
            return;
        }
        C6124q.m27063h(this.TAG, "Dismiss blocking dialog [" + j10 + "].");
        InterfaceC7850d2 interfaceC7850d2 = this.timerJob;
        if (interfaceC7850d2 != null) {
            InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
        }
        this.timerJob = null;
        DialogInterfaceC0408a dialogInterfaceC0408a = this.dialog;
        if (dialogInterfaceC0408a != null) {
            dialogInterfaceC0408a.dismiss();
        }
        this.dialog = null;
        ISystemDialogCallback iSystemDialogCallback = this.callback;
        if (iSystemDialogCallback != null) {
            iSystemDialogCallback.onClosed(new SystemDialogContext(this.id, true));
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0046 -> B:20:0x0049). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: c */
    public final java.lang.Object m34601c(@org.jetbrains.annotations.NotNull p315nt.InterfaceC9557b<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof ml.C8577a.d
            if (r0 == 0) goto L13
            r0 = r10
            ml.a$d r0 = (ml.C8577a.d) r0
            int r1 = r0.f31525w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31525w = r1
            goto L18
        L13:
            ml.a$d r0 = new ml.a$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f31523u
            java.lang.Object r1 = p344ot.C10047c.m38805e()
            int r2 = r0.f31525w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r2 = r0.f31522t
            p229jt.C7348o.m30470b(r10)
            goto L49
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            p229jt.C7348o.m30470b(r10)
            r10 = 0
            r2 = r10
        L38:
            int r10 = r9.MAX_PROGRESS_VALUE
            if (r2 >= r10) goto L7b
            long r4 = r9.PROGRESS_DELAY
            r0.f31522t = r2
            r0.f31525w = r3
            java.lang.Object r10 = p256ku.C7946z0.m32938b(r4, r0)
            if (r10 != r1) goto L49
            return r1
        L49:
            int r10 = r9.progressDeltaInSeconds
            int r2 = r2 + r10
            android.widget.ProgressBar r10 = r9.progressBar
            if (r10 == 0) goto L53
            r10.setProgress(r2)
        L53:
            java.lang.String r10 = r9.TAG
            long r4 = r9.id
            int r6 = r2 / 100
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Block dialog ["
            r7.append(r8)
            r7.append(r4)
            java.lang.String r4 = "] progress at "
            r7.append(r4)
            r7.append(r6)
            java.lang.String r4 = "%."
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            p151gk.C6124q.m27063h(r10, r4)
            goto L38
        L7b:
            r9.m34600b()
            kotlin.Unit r10 = kotlin.Unit.f29331a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ml.C8577a.m34601c(nt.b):java.lang.Object");
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ISystemDialogCallback getCallback() {
        return this.callback;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getId() {
        return this.id;
    }
}
