package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import g0.i1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements d {
    public final d b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1207a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<a> f1208c = new HashSet();

    public interface a {
        void a(d dVar);
    }

    public b(d dVar) {
        this.b = dVar;
    }

    @Override // androidx.camera.core.d
    public d.a[] E1() {
        return this.b.E1();
    }

    @Override // androidx.camera.core.d
    public void I0(Rect rect) {
        this.b.I0(rect);
    }

    @Override // androidx.camera.core.d
    public i1 I2() {
        return this.b.I2();
    }

    public void a(a aVar) {
        synchronized (this.f1207a) {
            this.f1208c.add(aVar);
        }
    }

    public void b() {
        HashSet hashSet;
        synchronized (this.f1207a) {
            hashSet = new HashSet(this.f1208c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(this);
        }
    }

    @Override // androidx.camera.core.d, java.lang.AutoCloseable
    public void close() {
        this.b.close();
        b();
    }

    @Override // androidx.camera.core.d
    public int getFormat() {
        return this.b.getFormat();
    }

    @Override // androidx.camera.core.d
    public int getHeight() {
        return this.b.getHeight();
    }

    @Override // androidx.camera.core.d
    public int getWidth() {
        return this.b.getWidth();
    }

    @Override // androidx.camera.core.d
    public Image p() {
        return this.b.p();
    }
}
