package jg;

import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f21377a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f21377a = field;
    }

    public String toString() {
        return this.f21377a.toString();
    }
}
