package p477ut;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p252io.FileWalkDirection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ut.j */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Ljava/io/File;", "Lkotlin/io/FileWalkDirection;", "direction", "Lut/g;", "m", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)Lut/g;", "n", "(Ljava/io/File;)Lut/g;", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/io/FilesKt")
public class C11965j extends C11964i {
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final C11962g m44655m(@NotNull File file, @NotNull FileWalkDirection direction) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new C11962g(file, direction);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static final C11962g m44656n(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return m44655m(file, FileWalkDirection.BOTTOM_UP);
    }
}
