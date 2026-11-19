package l4;

import com.github.luben.zstd.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: l4.a, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\b&\u0018\u0000 \u00152\u00020\u0001:\u0003\u0018\u0015\u0007B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R,\u0010\u0017\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Ll4/a;", BuildConfig.FLAVOR, "<init>", "()V", "T", "Ll4/a$c;", "key", "a", "(Ll4/a$c;)Ljava/lang/Object;", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "Ljava/util/Map;", "b", "()Ljava/util/Map;", "extras", "c", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CreationExtras {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Map<c<?>, Object> extras = new LinkedHashMap();

    /* JADX INFO: renamed from: l4.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll4/a$a;", BuildConfig.FLAVOR, "<init>", "()V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: l4.a$b */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll4/a$b;", "Ll4/a;", "<init>", "()V", "T", "Ll4/a$c;", "key", "a", "(Ll4/a$c;)Ljava/lang/Object;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends CreationExtras {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final b f21886c = new b();

        @Override // l4.CreationExtras
        @Nullable
        public <T> T a(@NotNull c<T> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }
    }

    /* JADX INFO: renamed from: l4.a$c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Ll4/a$c;", "T", BuildConfig.FLAVOR, "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface c<T> {
    }

    @Nullable
    public abstract <T> T a(@NotNull c<T> key);

    @NotNull
    public final Map<c<?>, Object> b() {
        return this.extras;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof CreationExtras) && Intrinsics.c(this.extras, ((CreationExtras) other).extras);
    }

    public int hashCode() {
        return this.extras.hashCode();
    }

    @NotNull
    public String toString() {
        return "CreationExtras(extras=" + this.extras + ')';
    }
}
