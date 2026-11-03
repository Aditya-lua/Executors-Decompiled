package uf;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class i implements rf.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f32792a = false;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rf.d f32793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f32794d;

    public i(f fVar) {
        this.f32794d = fVar;
    }

    public final void a() {
        if (this.f32792a) {
            throw new rf.c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f32792a = true;
    }

    @Override // rf.h
    @NonNull
    public rf.h add(String str) {
        a();
        this.f32794d.d(this.f32793c, str, this.b);
        return this;
    }

    public void b(rf.d dVar, boolean z10) {
        this.f32792a = false;
        this.f32793c = dVar;
        this.b = z10;
    }

    @Override // rf.h
    @NonNull
    public rf.h add(boolean z10) {
        a();
        this.f32794d.i(this.f32793c, z10, this.b);
        return this;
    }
}
