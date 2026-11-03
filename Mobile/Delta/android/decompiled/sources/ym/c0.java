package ym;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J1\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005\"\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lym/c0;", "", "RenderingT", "Lfu/c;", "renderingType", "Lym/a0;", "a", "(Lfu/c;)Lym/a0;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.b;

    /* JADX INFO: renamed from: ym.c0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lym/c0$a;", "Lym/z;", "Lym/c0;", "<init>", "()V", "b", "()Lym/c0;", "default", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion extends ViewEnvironmentKey<c0> {
        public static final /* synthetic */ Companion b = new Companion();

        public Companion() {
            super(kotlin.jvm.internal.d0.b(c0.class));
        }

        @Override // ym.ViewEnvironmentKey
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c0 a() {
            return d0.a();
        }
    }

    @Nullable
    <RenderingT> a0<RenderingT> a(@NotNull fu.c<? extends RenderingT> renderingType);
}
