package lp;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Llp/a;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "d", "e", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum a {
    Sha256("sha256"),
    Sha384("sha384"),
    Sha512("sha512");


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String rawValue;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ qt.a f23480g = qt.b.a(a());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: lp.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llp/a$a;", "", "<init>", "()V", "", "rawValue", "Llp/a;", "a", "(Ljava/lang/String;)Llp/a;", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final a a(@Nullable String rawValue) {
            a next;
            Iterator<a> it = a.b().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.c(next.getRawValue(), rawValue)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        public Companion() {
        }
    }

    a(String str) {
        this.rawValue = str;
    }

    @NotNull
    public static qt.a<a> b() {
        return f23480g;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
