package lg;

import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f22078a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f22078a = field;
    }

    public String toString() {
        return this.f22078a.toString();
    }
}
