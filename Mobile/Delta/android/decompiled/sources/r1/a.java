package r1;

import g0.f1;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0528a f30135a;
    public final f1.j b;

    /* JADX INFO: renamed from: r1.a$a, reason: collision with other inner class name */
    public enum EnumC0528a {
        PREVIEW_VIEW,
        SCREEN_FLASH_VIEW
    }

    public a(EnumC0528a enumC0528a, f1.j jVar) {
        this.f30135a = enumC0528a;
        this.b = jVar;
    }

    public EnumC0528a a() {
        return this.f30135a;
    }

    public f1.j b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f30135a == aVar.f30135a && Objects.equals(this.b, aVar.b);
    }

    public int hashCode() {
        return Objects.hash(this.f30135a, this.b);
    }
}
