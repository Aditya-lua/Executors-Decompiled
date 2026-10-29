package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m6 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7181a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f7182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p6 f7183d;

    public /* synthetic */ m6(p6 p6Var, o6 o6Var) {
        Objects.requireNonNull(p6Var);
        this.f7183d = p6Var;
        this.f7181a = -1;
    }

    public final Iterator b() {
        if (this.f7182c == null) {
            this.f7182c = this.f7183d.f7204c.entrySet().iterator();
        }
        return this.f7182c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f7181a + 1;
        p6 p6Var = this.f7183d;
        if (i10 >= p6Var.b) {
            return !p6Var.f7204c.isEmpty() && b().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.b = true;
        int i10 = this.f7181a + 1;
        this.f7181a = i10;
        p6 p6Var = this.f7183d;
        return i10 < p6Var.b ? (k6) p6Var.f7203a[i10] : (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.b = false;
        p6 p6Var = this.f7183d;
        p6Var.p();
        int i10 = this.f7181a;
        if (i10 >= p6Var.b) {
            b().remove();
        } else {
            this.f7181a = i10 - 1;
            p6Var.n(i10);
        }
    }
}
