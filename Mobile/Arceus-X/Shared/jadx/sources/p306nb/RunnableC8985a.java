package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8985a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f32657a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f32658b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9376y1 f32659c;

    public RunnableC8985a(C9376y1 c9376y1, String str, long j10) {
        this.f32657a = str;
        this.f32658b = j10;
        Objects.requireNonNull(c9376y1);
        this.f32659c = c9376y1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32659c.m37072l(this.f32657a, this.f32658b);
    }
}
