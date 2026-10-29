package ml;

import android.R;
import android.app.Activity;
import android.content.DialogInterface;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import backtraceio.library.services.BacktraceMetrics;
import com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback;
import com.roblox.protocols.systemdialogplatforminterface.generated.SystemDialogContext;
import com.roblox.protocols.systemdialogplatforminterface.generated.SystemDialogRequest;
import gk.p;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import ku.g1;
import ku.k;
import ku.p0;
import ku.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001dR\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lml/a;", "", "", "id", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;", "callback", "<init>", "(JLcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;)V", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;", "request", "Landroid/app/Activity;", "activity", "", "a", "(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;Landroid/app/Activity;)V", "c", "(Lnt/b;)Ljava/lang/Object;", "b", "()V", "J", "e", "()J", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;", "d", "()Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;", "", "Ljava/lang/String;", "TAG", "", "I", "MAX_PROGRESS_VALUE", "PROGRESS_DELAY", "Lku/p0;", "f", "Lku/p0;", "DIALOG_SCOPE", "Landroidx/appcompat/app/a;", "g", "Landroidx/appcompat/app/a;", "dialog", "Landroid/widget/ProgressBar;", "h", "Landroid/widget/ProgressBar;", "progressBar", "i", "progressDeltaInSeconds", "Lku/d2;", "j", "Lku/d2;", "timerJob", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ISystemDialogCallback callback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int MAX_PROGRESS_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long PROGRESS_DELAY;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 DIALOG_SCOPE;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public androidx.appcompat.app.a dialog;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ProgressBar progressBar;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int progressDeltaInSeconds;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 timerJob;

    /* JADX INFO: renamed from: ml.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ml/a$a", "Landroid/content/DialogInterface$OnClickListener;", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onClick", "(Landroid/content/DialogInterface;I)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DialogInterfaceOnClickListenerC0431a implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC0431a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            ISystemDialogCallback callback = a.this.getCallback();
            if (callback != null) {
                callback.onOkClicked(new SystemDialogContext(a.this.getId(), false));
            }
            a.this.b();
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ml/a$b", "Landroid/content/DialogInterface$OnClickListener;", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onClick", "(Landroid/content/DialogInterface;I)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            ISystemDialogCallback callback = a.this.getCallback();
            if (callback != null) {
                callback.onCancelClicked(new SystemDialogContext(a.this.getId(), false));
            }
            a.this.b();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.protocols.systemdialog.BlockingDialog$create$3", f = "BlockingDialog.kt", l = {91}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24401t;

        public c(nt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return a.this.new c(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f24401t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                this.f24401t = 1;
                if (aVar.c(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.roblox.protocols.systemdialog.BlockingDialog", f = "BlockingDialog.kt", l = {100}, m = "executeTimer", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24403t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f24404u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f24406w;

        public d(nt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24404u = obj;
            this.f24406w |= Integer.MIN_VALUE;
            return a.this.c(this);
        }
    }

    public a(long j10, @NotNull ISystemDialogCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.id = j10;
        this.callback = callback;
        this.TAG = "rbx.BlockingDialog";
        this.MAX_PROGRESS_VALUE = BacktraceMetrics.defaultTimeBetweenRetriesMs;
        this.PROGRESS_DELAY = 1000L;
        this.DIALOG_SCOPE = q0.a(g1.a());
        this.progressDeltaInSeconds = BacktraceMetrics.defaultTimeBetweenRetriesMs;
    }

    public final void a(@NotNull SystemDialogRequest request, @NotNull Activity activity) {
        LinearLayout linearLayout;
        androidx.appcompat.app.a aVar;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(activity, "activity");
        androidx.appcompat.app.a.C0013a c0013a = new androidx.appcompat.app.a.C0013a(activity);
        c0013a.q(request.getTitle());
        c0013a.h(request.getMessage());
        c0013a.d(false);
        String okText = request.getOkText();
        Intrinsics.checkNotNullExpressionValue(okText, "getOkText(...)");
        if (okText.length() != 0) {
            c0013a.n(request.getOkText(), new DialogInterfaceOnClickListenerC0431a());
        }
        String cancelText = request.getCancelText();
        Intrinsics.checkNotNullExpressionValue(cancelText, "getCancelText(...)");
        if (cancelText.length() != 0) {
            c0013a.n(request.getCancelText(), new b());
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
        androidx.appcompat.app.a aVarA = c0013a.a();
        this.dialog = aVarA;
        if (aVarA != null) {
            aVarA.setCanceledOnTouchOutside(false);
        }
        if (linearLayout != null && (aVar = this.dialog) != null) {
            aVar.v(linearLayout);
        }
        androidx.appcompat.app.a aVar2 = this.dialog;
        if (aVar2 != null) {
            aVar2.show();
        }
        ISystemDialogCallback iSystemDialogCallback = this.callback;
        if (iSystemDialogCallback != null) {
            iSystemDialogCallback.onOpened(new SystemDialogContext(this.id, false));
        }
        this.timerJob = this.progressBar != null ? k.d(this.DIALOG_SCOPE, null, null, new c(null), 3, null) : null;
    }

    public final void b() {
        long j10 = this.id;
        if (j10 < 0) {
            return;
        }
        p.h(this.TAG, "Dismiss blocking dialog [" + j10 + "].");
        d2 d2Var = this.timerJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.timerJob = null;
        androidx.appcompat.app.a aVar = this.dialog;
        if (aVar != null) {
            aVar.dismiss();
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
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull nt.b<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof ml.a.d
            if (r0 == 0) goto L13
            r0 = r10
            ml.a$d r0 = (ml.a.d) r0
            int r1 = r0.f24406w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24406w = r1
            goto L18
        L13:
            ml.a$d r0 = new ml.a$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f24404u
            java.lang.Object r1 = ot.c.e()
            int r2 = r0.f24406w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r2 = r0.f24403t
            jt.o.b(r10)
            goto L49
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            jt.o.b(r10)
            r10 = 0
            r2 = r10
        L38:
            int r10 = r9.MAX_PROGRESS_VALUE
            if (r2 >= r10) goto L7b
            long r4 = r9.PROGRESS_DELAY
            r0.f24403t = r2
            r0.f24406w = r3
            java.lang.Object r10 = ku.z0.b(r4, r0)
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
            gk.p.h(r10, r4)
            goto L38
        L7b:
            r9.b()
            kotlin.Unit r10 = kotlin.Unit.f22483a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ml.a.c(nt.b):java.lang.Object");
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
