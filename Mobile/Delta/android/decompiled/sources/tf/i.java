package tf;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class i implements qf.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f31732a = false;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qf.d f31733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f31734d;

    public i(f fVar) {
        this.f31734d = fVar;
    }

    public final void a() {
        if (this.f31732a) {
            throw new qf.c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f31732a = true;
    }

    @Override // qf.h
    @NonNull
    public qf.h add(String str) {
        a();
        this.f31734d.d(this.f31733c, str, this.b);
        return this;
    }

    public void b(qf.d dVar, boolean z10) {
        this.f31732a = false;
        this.f31733c = dVar;
        this.b = z10;
    }

    @Override // qf.h
    @NonNull
    public qf.h add(boolean z10) {
        a();
        this.f31734d.i(this.f31733c, z10, this.b);
        return this;
    }
}
