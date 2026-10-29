package p092e3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p117f3.AbstractC5332f;
import p117f3.AbstractC5340n;
import p117f3.C5335i;
import p117f3.C5337k;
import p117f3.C5342p;
import p207j3.C7027b;

/* JADX INFO: renamed from: e3.q */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0016B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m31665d2 = {"Le3/q;", "Le3/o;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Le3/k0;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Le3/p;", "Le3/l0;", "Lf3/n;", "callback", "", "d", "(Landroid/content/Context;Le3/k0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V", "Le3/b;", "Le3/c;", "Lf3/f;", "a", "(Landroid/content/Context;Le3/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V", "b", "Landroid/content/Context;", "c", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
@SuppressLint({"ObsoleteSdkInt"})
public final class C4781q implements InterfaceC4777o {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    public C4781q(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // p092e3.InterfaceC4777o
    /* JADX INFO: renamed from: a */
    public void mo23207a(@NotNull Context context, @NotNull AbstractC4751b request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull InterfaceC4779p<AbstractC4753c, AbstractC5332f> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC4785s interfaceC4785sM23227d = C4787t.m23227d(new C4787t(this.context), request, false, 2, null);
        if (interfaceC4785sM23227d == null) {
            callback.mo7535a(new C5335i("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else if (C7027b.m29709c(context)) {
            callback.mo7535a(new C5337k("createCredential is not supported on this device"));
        } else {
            interfaceC4785sM23227d.onCreateCredential(context, request, cancellationSignal, executor, callback);
        }
    }

    @Override // p092e3.InterfaceC4777o
    /* JADX INFO: renamed from: d */
    public void mo23209d(@NotNull Context context, @NotNull C4770k0 request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull InterfaceC4779p<C4772l0, AbstractC5340n> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC4785s interfaceC4785sM23227d = C4787t.m23227d(new C4787t(context), request, false, 2, null);
        if (interfaceC4785sM23227d == null) {
            callback.mo7535a(new C5342p("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            interfaceC4785sM23227d.onGetCredential(context, request, cancellationSignal, executor, callback);
        }
    }
}
