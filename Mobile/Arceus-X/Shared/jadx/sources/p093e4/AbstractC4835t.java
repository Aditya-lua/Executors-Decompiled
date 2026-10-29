package p093e4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p261l2.C7975b;

/* JADX INFO: renamed from: e4.t */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000eJ9\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00028\u0000H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J1\u0010(\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010=R\u0017\u0010B\u001a\u00020>8G¢\u0006\f\n\u0004\b/\u0010?\u001a\u0004\b@\u0010A¨\u0006C"}, m31665d2 = {"Le4/t;", "H", "Le4/r;", "Landroid/app/Activity;", "activity", "Landroid/content/Context;", "context", "Landroid/os/Handler;", "handler", "", "windowAnimations", "<init>", "(Landroid/app/Activity;Landroid/content/Context;Landroid/os/Handler;I)V", "Le4/q;", "(Le4/q;)V", "", "prefix", "Ljava/io/FileDescriptor;", "fd", "Ljava/io/PrintWriter;", "writer", "", "args", "", "k", "(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "m", "()Landroid/view/LayoutInflater;", "l", "()Ljava/lang/Object;", "o", "()V", "Landroidx/fragment/app/c;", "fragment", "Landroid/content/Intent;", "intent", "requestCode", "Landroid/os/Bundle;", "options", "n", "(Landroidx/fragment/app/c;Landroid/content/Intent;ILandroid/os/Bundle;)V", "id", "Landroid/view/View;", "d", "(I)Landroid/view/View;", "", "e", "()Z", "a", "Landroid/app/Activity;", "f", "()Landroid/app/Activity;", "b", "Landroid/content/Context;", "g", "()Landroid/content/Context;", "c", "Landroid/os/Handler;", "i", "()Landroid/os/Handler;", "I", "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/FragmentManager;", "h", "()Landroidx/fragment/app/FragmentManager;", "fragmentManager", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public abstract class AbstractC4835t<H> extends AbstractC4833r {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Activity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Handler handler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int windowAnimations;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final FragmentManager fragmentManager;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC4835t(@Nullable Activity activity, @NotNull Context context, @NotNull Handler handler, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.activity = activity;
        this.context = context;
        this.handler = handler;
        this.windowAnimations = i10;
        this.fragmentManager = new C4804c0();
    }

    @Override // p093e4.AbstractC4833r
    @Nullable
    /* JADX INFO: renamed from: d */
    public View mo4728d(int id2) {
        return null;
    }

    @Override // p093e4.AbstractC4833r
    /* JADX INFO: renamed from: e */
    public boolean mo4729e() {
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Activity getActivity() {
        return this.activity;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final FragmentManager getFragmentManager() {
        return this.fragmentManager;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Handler getHandler() {
        return this.handler;
    }

    /* JADX INFO: renamed from: k */
    public void mo23365k(@NotNull String prefix, @Nullable FileDescriptor fd2, @NotNull PrintWriter writer, @Nullable String[] args) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(writer, "writer");
    }

    /* JADX INFO: renamed from: l */
    public abstract H mo23366l();

    @NotNull
    /* JADX INFO: renamed from: m */
    public LayoutInflater mo23367m() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.context);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(context)");
        return layoutInflaterFrom;
    }

    /* JADX INFO: renamed from: n */
    public void m23390n(@NotNull ComponentCallbacksC0929c fragment, @NotNull Intent intent, int requestCode, @Nullable Bundle options) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (requestCode != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        C7975b.m33018p(this.context, intent, options);
    }

    /* JADX INFO: renamed from: o */
    public void mo23368o() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC4835t(@NotNull ActivityC4831q activity) {
        this(activity, activity, new Handler(), 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
