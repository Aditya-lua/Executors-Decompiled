package ha;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18148a = false;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18149c = false;

    public /* synthetic */ q(byte[] bArr) {
    }

    public final q a(boolean z10) {
        this.f18148a = true;
        return this;
    }

    public final q b(boolean z10) {
        this.b = true;
        return this;
    }

    public final q c(boolean z10) {
        this.f18149c = true;
        return this;
    }

    public final r d() {
        return new r(this, null);
    }

    public final /* synthetic */ boolean e() {
        return this.f18148a;
    }

    public final /* synthetic */ boolean f() {
        return this.b;
    }

    public final /* synthetic */ boolean g() {
        return this.f18149c;
    }
}
