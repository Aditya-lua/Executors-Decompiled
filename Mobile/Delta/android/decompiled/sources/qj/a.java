package qj;

import android.graphics.Bitmap;
import jt.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000f\u0010\u000eR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lqj/a;", "", "Ljt/n;", "Landroid/graphics/Bitmap;", "largeIconResult", "bigPictureResult", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "R", "Lkotlin/Function1;", "onSuccess", "", "onFailure", "b", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "getLargeIconResult-d1pmJ48", "()Ljava/lang/Object;", "getBigPictureResult-d1pmJ48", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object largeIconResult;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Object bigPictureResult;

    public a(@NotNull Object obj, @NotNull Object obj2) {
        this.largeIconResult = obj;
        this.bigPictureResult = obj2;
    }

    public final <R> R a(@NotNull Function1<? super Bitmap, ? extends R> onSuccess, @NotNull Function1<? super Throwable, ? extends R> onFailure) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Object obj = this.bigPictureResult;
        Throwable thE = n.e(obj);
        return thE == null ? onSuccess.invoke(obj) : onFailure.invoke(thE);
    }

    public final <R> R b(@NotNull Function1<? super Bitmap, ? extends R> onSuccess, @NotNull Function1<? super Throwable, ? extends R> onFailure) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Object obj = this.largeIconResult;
        Throwable thE = n.e(obj);
        return thE == null ? onSuccess.invoke(obj) : onFailure.invoke(thE);
    }
}
