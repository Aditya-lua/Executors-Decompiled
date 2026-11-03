package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m6 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7255a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f7256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p6 f7257d;

    public /* synthetic */ m6(p6 p6Var, o6 o6Var) {
        Objects.requireNonNull(p6Var);
        this.f7257d = p6Var;
        this.f7255a = -1;
    }

    public final Iterator b() {
        if (this.f7256c == null) {
            this.f7256c = this.f7257d.f7278c.entrySet().iterator();
        }
        return this.f7256c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f7255a + 1;
        p6 p6Var = this.f7257d;
        if (i10 >= p6Var.b) {
            return !p6Var.f7278c.isEmpty() && b().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.b = true;
        int i10 = this.f7255a + 1;
        this.f7255a = i10;
        p6 p6Var = this.f7257d;
        return i10 < p6Var.b ? (k6) p6Var.f7277a[i10] : (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.b = false;
        p6 p6Var = this.f7257d;
        p6Var.p();
        int i10 = this.f7255a;
        if (i10 >= p6Var.b) {
            b().remove();
        } else {
            this.f7255a = i10 - 1;
            p6Var.n(i10);
        }
    }
}
