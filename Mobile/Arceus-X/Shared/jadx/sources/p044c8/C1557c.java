package p044c8;

import android.content.Context;
import androidx.annotation.NonNull;
import p267l8.InterfaceC8011a;

/* JADX INFO: renamed from: c8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1557c extends AbstractC1562h {

    /* JADX INFO: renamed from: a */
    public final Context f6254a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8011a f6255b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8011a f6256c;

    /* JADX INFO: renamed from: d */
    public final String f6257d;

    public C1557c(Context context, InterfaceC8011a interfaceC8011a, InterfaceC8011a interfaceC8011a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f6254a = context;
        if (interfaceC8011a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f6255b = interfaceC8011a;
        if (interfaceC8011a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f6256c = interfaceC8011a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f6257d = str;
    }

    @Override // p044c8.AbstractC1562h
    /* JADX INFO: renamed from: b */
    public Context mo8155b() {
        return this.f6254a;
    }

    @Override // p044c8.AbstractC1562h
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo8156c() {
        return this.f6257d;
    }

    @Override // p044c8.AbstractC1562h
    /* JADX INFO: renamed from: d */
    public InterfaceC8011a mo8157d() {
        return this.f6256c;
    }

    @Override // p044c8.AbstractC1562h
    /* JADX INFO: renamed from: e */
    public InterfaceC8011a mo8158e() {
        return this.f6255b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1562h) {
            AbstractC1562h abstractC1562h = (AbstractC1562h) obj;
            if (this.f6254a.equals(abstractC1562h.mo8155b()) && this.f6255b.equals(abstractC1562h.mo8158e()) && this.f6256c.equals(abstractC1562h.mo8157d()) && this.f6257d.equals(abstractC1562h.mo8156c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f6254a.hashCode() ^ 1000003) * 1000003) ^ this.f6255b.hashCode()) * 1000003) ^ this.f6256c.hashCode()) * 1000003) ^ this.f6257d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f6254a + ", wallClock=" + this.f6255b + ", monotonicClock=" + this.f6256c + ", backendName=" + this.f6257d + "}";
    }
}
