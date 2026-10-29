package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fd implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6445a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f6446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd f6447d;

    public /* synthetic */ fd(hd hdVar, byte[] bArr) {
        Objects.requireNonNull(hdVar);
        this.f6447d = hdVar;
        this.f6445a = -1;
    }

    public final Iterator b() {
        if (this.f6446c == null) {
            this.f6446c = this.f6447d.l().entrySet().iterator();
        }
        return this.f6446c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f6445a + 1;
        hd hdVar = this.f6447d;
        if (i10 >= hdVar.k()) {
            return !hdVar.l().isEmpty() && b().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.b = true;
        int i10 = this.f6445a + 1;
        this.f6445a = i10;
        hd hdVar = this.f6447d;
        return i10 < hdVar.k() ? (ed) hdVar.j()[i10] : (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.b = false;
        hd hdVar = this.f6447d;
        hdVar.i();
        int i10 = this.f6445a;
        if (i10 >= hdVar.k()) {
            b().remove();
        } else {
            this.f6445a = i10 - 1;
            hdVar.g(i10);
        }
    }
}
