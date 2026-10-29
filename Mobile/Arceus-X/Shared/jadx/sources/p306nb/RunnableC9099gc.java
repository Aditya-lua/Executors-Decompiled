package p306nb;

import android.content.ComponentName;
import java.util.Objects;

/* JADX INFO: renamed from: nb.gc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9099gc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ComponentName f32987a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ServiceConnectionC9211nc f32988b;

    public RunnableC9099gc(ServiceConnectionC9211nc serviceConnectionC9211nc, ComponentName componentName) {
        this.f32987a = componentName;
        Objects.requireNonNull(serviceConnectionC9211nc);
        this.f32988b = serviceConnectionC9211nc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32988b.f33281c.m36870K(this.f32987a);
    }
}
