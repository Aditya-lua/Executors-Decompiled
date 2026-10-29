package e7;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Le7/x;", "", "<init>", "()V", "", "url", "b", "(Ljava/lang/String;)Ljava/lang/String;", "extension", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x f15217a = new x();

    @Nullable
    public final String a(@NotNull String extension) {
        if (StringsKt.p0(extension)) {
            return null;
        }
        String lowerCase = extension.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str = (String) y.f15218a.get(lowerCase);
        return str == null ? z.a(lowerCase) : str;
    }

    @Nullable
    public final String b(@NotNull String url) {
        if (StringsKt.p0(url)) {
            return null;
        }
        return a(StringsKt.c1(StringsKt.e1(StringsKt.m1(StringsKt.m1(url, '#', null, 2, null), '?', null, 2, null), '/', null, 2, null), '.', ""));
    }
}
