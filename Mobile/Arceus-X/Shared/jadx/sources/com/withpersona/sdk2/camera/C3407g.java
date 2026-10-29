package com.withpersona.sdk2.camera;

import android.view.View;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu.C9596r0;
import nu.InterfaceC9592p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.C5688i0;
import p132fn.InterfaceC5683g;
import p229jt.C7347n;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import pt.C10340b;

/* JADX INFO: renamed from: com.withpersona.sdk2.camera.g */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010!R\u0014\u0010%\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m31665d2 = {"Lcom/withpersona/sdk2/camera/g;", "Lfn/g;", "Landroid/view/View;", "previewView", "<init>", "(Landroid/view/View;)V", "", "h", "()V", "destroy", "", "enable", "c", "(Z)V", "e", "Ljt/n;", "Ljava/io/File;", "k", "(Lnt/b;)Ljava/lang/Object;", "j", "i", "enableAnalyzer", "f", "a", "Landroid/view/View;", "d", "()Landroid/view/View;", "Lnu/p0;", "Lcom/withpersona/sdk2/camera/d;", "b", "()Lnu/p0;", "cameraState", "Lcom/withpersona/sdk2/camera/CameraProperties;", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "g", "()Z", "isRecordingLocally", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3407g implements InterfaceC5683g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final View previewView;

    public C3407g(@NotNull View previewView) {
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        this.previewView = previewView;
    }

    @Override // p132fn.InterfaceC5683g
    @NotNull
    /* JADX INFO: renamed from: a */
    public CameraProperties mo16217a() {
        return new CameraProperties(null, null, null, 0, 0, 31, null);
    }

    @Override // p132fn.InterfaceC5683g
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC9592p0<InterfaceC3404d> mo16218b() {
        return C9596r0.m37859a(InterfaceC3404d.c.f12931a);
    }

    @Override // p132fn.InterfaceC5683g
    /* JADX INFO: renamed from: c */
    public void mo16219c(boolean enable) {
    }

    @Override // p132fn.InterfaceC5683g
    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public View getPreviewView() {
        return this.previewView;
    }

    @Override // p132fn.InterfaceC5683g
    public void destroy() {
    }

    @Override // p132fn.InterfaceC5683g
    /* JADX INFO: renamed from: e */
    public void mo16221e() {
    }

    @Override // p132fn.InterfaceC5683g
    /* JADX INFO: renamed from: f */
    public void mo16222f(boolean enableAnalyzer) {
    }

    @Override // p132fn.InterfaceC5683g
    /* JADX INFO: renamed from: g */
    public boolean getRecordingOngoing() {
        return false;
    }

    @Override // p132fn.InterfaceC5683g
    /* JADX INFO: renamed from: h */
    public void mo16224h() {
    }

    @Override // p132fn.InterfaceC5683g
    @Nullable
    /* JADX INFO: renamed from: i */
    public Object mo16225i(@NotNull InterfaceC9557b<? super C7347n<? extends File>> interfaceC9557b) {
        C7347n.Companion companion = C7347n.INSTANCE;
        return C7347n.m30460b(C7348o.m30469a(new C5688i0()));
    }

    @Override // p132fn.InterfaceC5683g
    @Nullable
    /* JADX INFO: renamed from: j */
    public Object mo16226j(@NotNull InterfaceC9557b<? super C7347n<Boolean>> interfaceC9557b) {
        C7347n.Companion companion = C7347n.INSTANCE;
        return C7347n.m30460b(C10340b.m39658a(false));
    }

    @Override // p132fn.InterfaceC5683g
    @Nullable
    /* JADX INFO: renamed from: k */
    public Object mo16227k(@NotNull InterfaceC9557b<? super C7347n<? extends File>> interfaceC9557b) {
        C7347n.Companion companion = C7347n.INSTANCE;
        return C7347n.m30460b(C7348o.m30469a(new C5688i0()));
    }
}
