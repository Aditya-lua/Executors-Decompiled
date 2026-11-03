package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26447a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f26449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa f26450e;

    public j9(qa qaVar, String str, String str2, Object obj, long j10) {
        this.f26447a = str;
        this.b = str2;
        this.f26448c = obj;
        this.f26449d = j10;
        Objects.requireNonNull(qaVar);
        this.f26450e = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26450e.B(this.f26447a, this.b, this.f26448c, this.f26449d);
    }
}
