package g5;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lg5/a;", "Lg5/f;", "a", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g5.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lg5/a$a;", "", "<init>", "()V", "Lg5/e;", "statement", "", "bindArgs", "", "b", "(Lg5/e;[Ljava/lang/Object;)V", "", "index", "arg", "a", "(Lg5/e;ILjava/lang/Object;)V", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(e statement, int index, Object arg) {
            if (arg == null) {
                statement.C(index);
                return;
            }
            if (arg instanceof byte[]) {
                statement.A(index, (byte[]) arg);
                return;
            }
            if (arg instanceof Float) {
                statement.c0(index, ((Number) arg).floatValue());
                return;
            }
            if (arg instanceof Double) {
                statement.c0(index, ((Number) arg).doubleValue());
                return;
            }
            if (arg instanceof Long) {
                statement.z(index, ((Number) arg).longValue());
                return;
            }
            if (arg instanceof Integer) {
                statement.z(index, ((Number) arg).intValue());
                return;
            }
            if (arg instanceof Short) {
                statement.z(index, ((Number) arg).shortValue());
                return;
            }
            if (arg instanceof Byte) {
                statement.z(index, ((Number) arg).byteValue());
                return;
            }
            if (arg instanceof String) {
                statement.L1(index, (String) arg);
                return;
            }
            if (arg instanceof Boolean) {
                statement.z(index, ((Boolean) arg).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + arg + " at index " + index + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        public final void b(@NotNull e statement, @Nullable Object[] bindArgs) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            if (bindArgs == null) {
                return;
            }
            int length = bindArgs.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = bindArgs[i10];
                i10++;
                a(statement, i10, obj);
            }
        }

        public Companion() {
        }
    }
}
