package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25626a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f25628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa f25629e;

    public j9(qa qaVar, String str, String str2, Object obj, long j10) {
        this.f25626a = str;
        this.b = str2;
        this.f25627c = obj;
        this.f25628d = j10;
        Objects.requireNonNull(qaVar);
        this.f25629e = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25629e.B(this.f25626a, this.b, this.f25627c, this.f25628d);
    }
}
