package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.fd */
/* JADX INFO: loaded from: classes.dex */
public final class C2069fd implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f8185a;

    /* JADX INFO: renamed from: b */
    public boolean f8186b;

    /* JADX INFO: renamed from: c */
    public Iterator f8187c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2107hd f8188d;

    public /* synthetic */ C2069fd(C2107hd c2107hd, byte[] bArr) {
        Objects.requireNonNull(c2107hd);
        this.f8188d = c2107hd;
        this.f8185a = -1;
    }

    /* JADX INFO: renamed from: b */
    public final Iterator m10014b() {
        if (this.f8187c == null) {
            this.f8187c = this.f8188d.m10210l().entrySet().iterator();
        }
        return this.f8187c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f8185a + 1;
        C2107hd c2107hd = this.f8188d;
        if (i10 >= c2107hd.m10209k()) {
            return !c2107hd.m10210l().isEmpty() && m10014b().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f8186b = true;
        int i10 = this.f8185a + 1;
        this.f8185a = i10;
        C2107hd c2107hd = this.f8188d;
        return i10 < c2107hd.m10209k() ? (C2050ed) c2107hd.m10208j()[i10] : (Map.Entry) m10014b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8186b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f8186b = false;
        C2107hd c2107hd = this.f8188d;
        c2107hd.m10207i();
        int i10 = this.f8185a;
        if (i10 >= c2107hd.m10209k()) {
            m10014b().remove();
        } else {
            this.f8185a = i10 - 1;
            c2107hd.m10206g(i10);
        }
    }
}
