package ga;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17972a = false;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17973c = false;

    public /* synthetic */ p(byte[] bArr) {
    }

    public final p a(boolean z10) {
        this.f17972a = true;
        return this;
    }

    public final p b(boolean z10) {
        this.b = true;
        return this;
    }

    public final p c(boolean z10) {
        this.f17973c = true;
        return this;
    }

    public final q d() {
        return new q(this, null);
    }

    public final /* synthetic */ boolean e() {
        return this.f17972a;
    }

    public final /* synthetic */ boolean f() {
        return this.b;
    }

    public final /* synthetic */ boolean g() {
        return this.f17973c;
    }
}
