package sn;

import android.view.View;
import com.github.luben.zstd.BuildConfig;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lsn/u0;", "Lsn/i;", "Landroid/view/View;", "previewView", "<init>", "(Landroid/view/View;)V", BuildConfig.FLAVOR, "j", "()V", "destroy", BuildConfig.FLAVOR, "enable", "a", "(Z)V", "d", "Lzt/n;", "Ljava/io/File;", "g", "(Leu/b;)Ljava/lang/Object;", "i", "k", "enableAnalyzer", "e", "Landroid/view/View;", "c", "()Landroid/view/View;", "Ldv/p0;", "Lsn/y;", "b", "()Ldv/p0;", "cameraState", "Lsn/v;", "f", "()Lsn/v;", "cameraProperties", "h", "()Z", "isRecordingLocally", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u0 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final View previewView;

    public u0(@NotNull View previewView) {
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        this.previewView = previewView;
    }

    @Override // sn.i
    public void a(boolean enable) {
    }

    @Override // sn.i
    @NotNull
    public dv.p0<y> b() {
        return dv.r0.a(y.c.f31747a);
    }

    @Override // sn.i
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public View getPreviewView() {
        return this.previewView;
    }

    @Override // sn.i
    public void d() {
    }

    @Override // sn.i
    public void destroy() {
    }

    @Override // sn.i
    public void e(boolean enableAnalyzer) {
    }

    @Override // sn.i
    @NotNull
    public v f() {
        return new v(null, null, null, 0, 0, 31, null);
    }

    @Override // sn.i
    @Nullable
    public Object g(@NotNull eu.b<? super zt.n<? extends File>> bVar) {
        zt.n.Companion companion = zt.n.INSTANCE;
        return zt.n.b(zt.o.a(new v0()));
    }

    @Override // sn.i
    /* JADX INFO: renamed from: h */
    public boolean getRecordingOngoing() {
        return false;
    }

    @Override // sn.i
    @Nullable
    public Object i(@NotNull eu.b<? super zt.n<Boolean>> bVar) {
        zt.n.Companion companion = zt.n.INSTANCE;
        return zt.n.b(gu.b.a(false));
    }

    @Override // sn.i
    public void j() {
    }

    @Override // sn.i
    @Nullable
    public Object k(@NotNull eu.b<? super zt.n<? extends File>> bVar) {
        zt.n.Companion companion = zt.n.INSTANCE;
        return zt.n.b(zt.o.a(new v0()));
    }
}
