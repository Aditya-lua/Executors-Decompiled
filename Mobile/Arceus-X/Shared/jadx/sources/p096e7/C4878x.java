package p096e7;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e7.x */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, m31665d2 = {"Le7/x;", "", "<init>", "()V", "", "url", "b", "(Ljava/lang/String;)Ljava/lang/String;", "extension", "a", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4878x {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4878x f19580a = new C4878x();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m23500a(@NotNull String extension) {
        if (StringsKt.m32182p0(extension)) {
            return null;
        }
        String lowerCase = extension.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str = (String) C4879y.f19581a.get(lowerCase);
        return str == null ? C4880z.m23503a(lowerCase) : str;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m23501b(@NotNull String url) {
        if (StringsKt.m32182p0(url)) {
            return null;
        }
        return m23500a(StringsKt.m32157c1(StringsKt.m32161e1(StringsKt.m32177m1(StringsKt.m32177m1(url, '#', null, 2, null), '?', null, 2, null), '/', null, 2, null), '.', ""));
    }
}
