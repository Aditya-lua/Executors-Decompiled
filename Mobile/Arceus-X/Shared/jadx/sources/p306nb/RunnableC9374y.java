package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.y */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9374y implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f33661a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f33662b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9376y1 f33663c;

    public RunnableC9374y(C9376y1 c9376y1, String str, long j10) {
        this.f33661a = str;
        this.f33662b = j10;
        Objects.requireNonNull(c9376y1);
        this.f33663c = c9376y1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33663c.m37073m(this.f33661a, this.f33662b);
    }
}
