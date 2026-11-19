package kotlin;

import com.github.luben.zstd.BuildConfig;
import cv.y;
import dv.i;
import eu.b;
import fu.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@p001kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lev/z;", "T", "Ldv/i;", "Lcv/y;", "channel", "<init>", "(Lcv/y;)V", "value", BuildConfig.FLAVOR, "emit", "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", "a", "Lcv/y;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z<T> implements i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y<T> channel;

    /* JADX WARN: Multi-variable type inference failed */
    public z(@NotNull y<? super T> yVar) {
        this.channel = yVar;
    }

    @Override // dv.i
    @Nullable
    public Object emit(T t8, @NotNull b<? super p001kotlin.Unit> bVar) {
        Object objM = this.channel.m(t8, bVar);
        return objM == c.e() ? objM : p001kotlin.Unit.f21506a;
    }
}
