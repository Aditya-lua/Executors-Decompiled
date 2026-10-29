package p499vr;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: vr.h */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000bÀ\u0006\u0003"}, m31665d2 = {"Lvr/h;", "OutputT", "", "Lnu/h;", "run", "()Lnu/h;", "otherWorker", "", "a", "(Lvr/h;)Z", "c", "workflows_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC12257h<OutputT> {
    /* JADX INFO: renamed from: a */
    default boolean mo7572a(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return Intrinsics.m31980c(this, otherWorker);
    }

    /* JADX INFO: renamed from: c */
    default boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return otherWorker.getClass() == getClass();
    }

    @NotNull
    InterfaceC9575h<OutputT> run();
}
