package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jd implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6566a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f6567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ld f6568d;

    public /* synthetic */ jd(ld ldVar, byte[] bArr) {
        Objects.requireNonNull(ldVar);
        this.f6568d = ldVar;
        this.f6566a = -1;
    }

    public final Iterator b() {
        if (this.f6567c == null) {
            this.f6567c = this.f6568d.k().entrySet().iterator();
        }
        return this.f6567c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f6566a + 1;
        ld ldVar = this.f6568d;
        if (i10 >= ldVar.j()) {
            return !ldVar.k().isEmpty() && b().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.b = true;
        int i10 = this.f6566a + 1;
        this.f6566a = i10;
        ld ldVar = this.f6568d;
        return i10 < ldVar.j() ? (id) ldVar.i()[i10] : (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.b = false;
        ld ldVar = this.f6568d;
        ldVar.h();
        int i10 = this.f6566a;
        if (i10 >= ldVar.j()) {
            b().remove();
        } else {
            this.f6566a = i10 - 1;
            ldVar.g(i10);
        }
    }
}
