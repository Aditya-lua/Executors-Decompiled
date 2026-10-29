package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2577m6 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f9157a;

    /* JADX INFO: renamed from: b */
    public boolean f9158b;

    /* JADX INFO: renamed from: c */
    public Iterator f9159c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2610p6 f9160d;

    public /* synthetic */ C2577m6(C2610p6 c2610p6, C2599o6 c2599o6) {
        Objects.requireNonNull(c2610p6);
        this.f9160d = c2610p6;
        this.f9157a = -1;
    }

    /* JADX INFO: renamed from: b */
    public final Iterator m11594b() {
        if (this.f9159c == null) {
            this.f9159c = this.f9160d.f9189c.entrySet().iterator();
        }
        return this.f9159c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f9157a + 1;
        C2610p6 c2610p6 = this.f9160d;
        if (i10 >= c2610p6.f9188b) {
            return !c2610p6.f9189c.isEmpty() && m11594b().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f9158b = true;
        int i10 = this.f9157a + 1;
        this.f9157a = i10;
        C2610p6 c2610p6 = this.f9160d;
        return i10 < c2610p6.f9188b ? (C2555k6) c2610p6.f9187a[i10] : (Map.Entry) m11594b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f9158b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f9158b = false;
        C2610p6 c2610p6 = this.f9160d;
        c2610p6.m11662p();
        int i10 = this.f9157a;
        if (i10 >= c2610p6.f9188b) {
            m11594b().remove();
        } else {
            this.f9157a = i10 - 1;
            c2610p6.m11660n(i10);
        }
    }
}
