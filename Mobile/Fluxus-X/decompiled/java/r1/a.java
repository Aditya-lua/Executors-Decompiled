package r1;

import g0.f1;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0596a f30541a;
    public final f1.j b;

    /* JADX INFO: renamed from: r1.a$a, reason: collision with other inner class name */
    public enum EnumC0596a {
        PREVIEW_VIEW,
        SCREEN_FLASH_VIEW
    }

    public a(EnumC0596a enumC0596a, f1.j jVar) {
        this.f30541a = enumC0596a;
        this.b = jVar;
    }

    public EnumC0596a a() {
        return this.f30541a;
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
        return this.f30541a == aVar.f30541a && Objects.equals(this.b, aVar.b);
    }

    public int hashCode() {
        return Objects.hash(this.f30541a, this.b);
    }
}
