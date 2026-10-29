package p535x4;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: x4.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lx4/n;", "", "<init>", "()V", "Lx4/u;", "T", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "klass", "Lx4/u$a;", "b", "(Landroid/content/Context;Ljava/lang/Class;)Lx4/u$a;", "", "name", "a", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Lx4/u$a;", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C12675n {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12675n f45133a = new C12675n();

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T extends AbstractC12682u> AbstractC12682u.a<T> m47228a(@NotNull Context context, @NotNull Class<T> klass, @Nullable String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (name == null || StringsKt.m32182p0(name)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (Intrinsics.m31980c(name, ":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new AbstractC12682u.a<>(context, klass, name);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T extends AbstractC12682u> AbstractC12682u.a<T> m47229b(@NotNull Context context, @NotNull Class<T> klass) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        return new AbstractC12682u.a<>(context, klass, null);
    }
}
