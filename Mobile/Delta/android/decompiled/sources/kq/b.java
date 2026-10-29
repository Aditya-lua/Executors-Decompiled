package kq;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00028\u0000\"\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkq/a;", "T", "Landroid/os/Parcelable;", "args", "a", "(Lkq/a;Landroid/os/Parcelable;)Lkq/a;", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    @NotNull
    public static final <T extends a<?>> T a(@NotNull T t8, @NotNull Parcelable args) {
        Intrinsics.checkNotNullParameter(t8, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARGUMENT_ARGS", args);
        t8.O1(bundle);
        return t8;
    }
}
