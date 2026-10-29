package p398r1;

import java.util.Objects;
import p140g0.C5883f1;

/* JADX INFO: renamed from: r1.a */
/* JADX INFO: loaded from: classes.dex */
public class C10776a {

    /* JADX INFO: renamed from: a */
    public final a f38390a;

    /* JADX INFO: renamed from: b */
    public final C5883f1.j f38391b;

    /* JADX INFO: renamed from: r1.a$a */
    public enum a {
        PREVIEW_VIEW,
        SCREEN_FLASH_VIEW
    }

    public C10776a(a aVar, C5883f1.j jVar) {
        this.f38390a = aVar;
        this.f38391b = jVar;
    }

    /* JADX INFO: renamed from: a */
    public a m41011a() {
        return this.f38390a;
    }

    /* JADX INFO: renamed from: b */
    public C5883f1.j m41012b() {
        return this.f38391b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10776a)) {
            return false;
        }
        C10776a c10776a = (C10776a) obj;
        return this.f38390a == c10776a.f38390a && Objects.equals(this.f38391b, c10776a.f38391b);
    }

    public int hashCode() {
        return Objects.hash(this.f38390a, this.f38391b);
    }
}
