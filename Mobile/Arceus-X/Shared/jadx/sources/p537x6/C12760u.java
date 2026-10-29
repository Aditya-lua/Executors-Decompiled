package p537x6;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p256ku.InterfaceC7934w0;

/* JADX INFO: renamed from: x6.u */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m31665d2 = {"Lx6/u;", "Lx6/d;", "Landroid/view/View;", "view", "Lku/w0;", "Lx6/k;", "job", "<init>", "(Landroid/view/View;Lku/w0;)V", "", "a", "()V", "Landroid/view/View;", "b", "Lku/w0;", "()Lku/w0;", "d", "(Lku/w0;)V", "", "c", "()Z", "isDisposed", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12760u implements InterfaceC12743d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public volatile InterfaceC7934w0<? extends InterfaceC12750k> job;

    public C12760u(@NotNull View view, @NotNull InterfaceC7934w0<? extends InterfaceC12750k> interfaceC7934w0) {
        this.view = view;
        this.job = interfaceC7934w0;
    }

    @Override // p537x6.InterfaceC12743d
    /* JADX INFO: renamed from: a */
    public void mo47489a() {
        if (m47623c()) {
            return;
        }
        C12763x.m47631a(this.view).m47627a();
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: ku.w0<? extends x6.k>, ku.w0<x6.k> */
    @Override // p537x6.InterfaceC12743d
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC7934w0<InterfaceC12750k> mo47490b() {
        return this.job;
    }

    /* JADX INFO: renamed from: c */
    public boolean m47623c() {
        return C12763x.m47631a(this.view).m47629c(this);
    }

    /* JADX INFO: renamed from: d */
    public void m47624d(@NotNull InterfaceC7934w0<? extends InterfaceC12750k> interfaceC7934w0) {
        this.job = interfaceC7934w0;
    }
}
