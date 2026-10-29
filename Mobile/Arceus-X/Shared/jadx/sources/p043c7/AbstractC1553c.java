package p043c7;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p568y6.Size;

/* JADX INFO: renamed from: c7.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\t\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, m31665d2 = {"Lc7/c;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "Lcoil3/Bitmap;", "input", "Ly6/g;", "size", "b", "(Landroid/graphics/Bitmap;Ly6/g;Lnt/b;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "cacheKey", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC1553c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract String getCacheKey();

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract Object mo8145b(@NotNull Bitmap bitmap, @NotNull Size size, @NotNull InterfaceC9557b<? super Bitmap> interfaceC9557b);

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AbstractC1553c) && Intrinsics.m31980c(getCacheKey(), ((AbstractC1553c) other).getCacheKey());
    }

    public int hashCode() {
        return getCacheKey().hashCode();
    }

    @NotNull
    public String toString() {
        return C7731d0.m32002b(getClass()).mo28427g() + "(cacheKey=" + getCacheKey() + ')';
    }
}
