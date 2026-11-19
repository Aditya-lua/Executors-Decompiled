package ft;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00052\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lft/k;", "Lkotlin/Function0;", BuildConfig.FLAVOR, "<init>", "()V", "a", "Lft/a;", "Lft/c;", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class k implements Function0<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ft.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lft/k$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "mode", "Lft/j;", "replaceData", "Lft/k;", "a", "(Ljava/lang/String;Lft/j;)Lft/k;", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final k a(@NotNull String mode, @NotNull ReplaceData replaceData) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(replaceData, "replaceData");
            if (Intrinsics.c(mode, "all")) {
                return new a(replaceData);
            }
            if (StringsKt.toIntOrNull(mode) != null) {
                return new c(replaceData, Integer.parseInt(mode));
            }
            throw new IllegalArgumentException(mode);
        }

        public Companion() {
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public k() {
    }
}
