package wf;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class i implements tf.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35762a = false;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public tf.d f35763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f35764d;

    public i(f fVar) {
        this.f35764d = fVar;
    }

    public final void a() {
        if (this.f35762a) {
            throw new tf.c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f35762a = true;
    }

    @Override // tf.h
    @NonNull
    public tf.h add(String str) {
        a();
        this.f35764d.d(this.f35763c, str, this.b);
        return this;
    }

    public void b(tf.d dVar, boolean z10) {
        this.f35762a = false;
        this.f35763c = dVar;
        this.b = z10;
    }

    @Override // tf.h
    @NonNull
    public tf.h add(boolean z10) {
        a();
        this.f35764d.i(this.f35763c, z10, this.b);
        return this;
    }
}
