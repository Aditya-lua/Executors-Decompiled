package com.withpersona.sdk2.camera;

import android.view.View;
import dn.i0;
import gt.n;
import gt.o;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lu.p0;
import lu.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010!R\u0014\u0010%\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/withpersona/sdk2/camera/g;", "Ldn/g;", "Landroid/view/View;", "previewView", "<init>", "(Landroid/view/View;)V", "", "j", "()V", "destroy", "", "enable", "c", "(Z)V", "f", "Lgt/n;", "Ljava/io/File;", "g", "(Llt/b;)Ljava/lang/Object;", "d", "k", "enableAnalyzer", "h", "a", "Landroid/view/View;", "e", "()Landroid/view/View;", "Llu/p0;", "Lcom/withpersona/sdk2/camera/d;", "b", "()Llu/p0;", "cameraState", "Lcom/withpersona/sdk2/camera/CameraProperties;", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "i", "()Z", "isRecordingLocally", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements dn.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final View previewView;

    public g(@NotNull View previewView) {
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        this.previewView = previewView;
    }

    @Override // dn.g
    @NotNull
    public CameraProperties a() {
        return new CameraProperties(null, null, null, 0, 0, 31, null);
    }

    @Override // dn.g
    @NotNull
    public p0<d> b() {
        return r0.a(d.c.f10022a);
    }

    @Override // dn.g
    public void c(boolean enable) {
    }

    @Override // dn.g
    @Nullable
    public Object d(@NotNull lt.b<? super n<Boolean>> bVar) {
        n.Companion companion = n.INSTANCE;
        return n.b(nt.b.a(false));
    }

    @Override // dn.g
    public void destroy() {
    }

    @Override // dn.g
    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public View getPreviewView() {
        return this.previewView;
    }

    @Override // dn.g
    public void f() {
    }

    @Override // dn.g
    @Nullable
    public Object g(@NotNull lt.b<? super n<? extends File>> bVar) {
        n.Companion companion = n.INSTANCE;
        return n.b(o.a(new i0()));
    }

    @Override // dn.g
    public void h(boolean enableAnalyzer) {
    }

    @Override // dn.g
    /* JADX INFO: renamed from: i */
    public boolean getRecordingOngoing() {
        return false;
    }

    @Override // dn.g
    public void j() {
    }

    @Override // dn.g
    @Nullable
    public Object k(@NotNull lt.b<? super n<? extends File>> bVar) {
        n.Companion companion = n.INSTANCE;
        return n.b(o.a(new i0()));
    }
}
